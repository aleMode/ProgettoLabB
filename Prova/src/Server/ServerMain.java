package Server;

import java.sql.Statement;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerMain extends UnicastRemoteObject implements ServerMainInterface{
	private static final long serialVersionUID = 1L;
	
	private static Statement statement = null;
	
	String url = "jdbc:postgresql://localhost/Eventi_Avversi";
	String user = "postgres";
	String password = "admin";
	static Connection connect = null;
	
	private int IDsegnalazione = 0;
	
	protected ServerMain() throws RemoteException {
		super();
	}

	private Connection connetti(boolean connessioneAvvenuta) throws ClassNotFoundException {
		   try {
			   Class.forName("org.postgresql.Driver");
			   connect = DriverManager.getConnection(url, user, password);
			   if (connect!=null) {
				   System.out.println("Connessione avvenuta con successo"); 
				   connessioneAvvenuta = true;
			   }
		   }catch (SQLException e) {
		    System.out.println ("eccezione");
		    connessioneAvvenuta = false;
		   }
		   return connect;
	   }
	
	public static void main(String[] args) throws RemoteException, ClassNotFoundException {
		ServerMain s = new ServerMain();

		try {
		      boolean connessioneAvvenuta = false; 
		      s.connetti(connessioneAvvenuta);
		      System.out.println("Ritorno il risultato : " + s);
		   }catch(NullPointerException e) {
			  System.out.println("Si è verificato un problema!");
		   }
	
		Registry reg = LocateRegistry.createRegistry(6969);
		reg.rebind("ServerCV", s);
	}
	
	public static Statement getStatement() throws SQLException {
		if (statement == null) {
			statement = connect.createStatement();
		}
				
		return statement;
	}

	@Override
	public boolean usernameTaken(String user) throws RemoteException, SQLException {
		boolean taken = false;
	
		Statement statement = ServerMain.getStatement();
		
		ResultSet rs = statement.executeQuery("SELECT * FROM Cittadini_Registrati WHERE Username = " + user);
		
		if(!rs.next()) taken = true;
				
		return taken;
	}

	@Override
	public boolean emailTaken(String email) throws RemoteException, SQLException {
		boolean taken = false;
		
		Statement statement = ServerMain.getStatement();
		
		ResultSet rs = statement.executeQuery("SELECT * FROM Cittadini_Registrati WHERE Email = " + email);
		
		if(!rs.next()) taken = true;
				
		return taken;
	}

	@Override
	public boolean codFiscTaken(String codFisc) throws RemoteException, SQLException {
		boolean taken = false;
		
		Statement statement = ServerMain.getStatement();
		
		ResultSet rs = statement.executeQuery("SELECT * FROM Cittadini_Vaccinati WHERE CodiceFiscale = " + codFisc);
		
		if(!rs.next()) taken = true;
				
		return taken;
	}

	@Override
	public boolean nomeCVTaken(String nomeCV) throws RemoteException, SQLException {
		boolean taken = false;
		
		Statement statement = ServerMain.getStatement();
		
		ResultSet rs = statement.executeQuery("SELECT * FROM Centri_Vaccinali WHERE Nome = " + nomeCV);
		
		if(!rs.next()) taken = true;
				
		return taken;
	}

	@Override
	public boolean userPassLogin(String user, String pwd) throws RemoteException, SQLException {
		boolean correct = false;
		
		Statement statement = ServerMain.getStatement();
		
		ResultSet rs = statement.executeQuery("SELECT * FROM Cittadini_Registrati WHERE Username = " + user + "AND Password = " + pwd);
		
		if(!rs.next()) correct = true;
				
		return correct;
	}
	
	@Override
	public boolean IDvaccinato(String codFisc, int ID) throws RemoteException, SQLException {
		boolean invalid = true;
		
		Statement statement = ServerMain.getStatement();
		
		ResultSet rs = statement.executeQuery("SELECT * FROM Cittadini_Vaccinati WHERE IDvaccino = " + ID +" AND Codice_Fiscale = " + codFisc);
		
		if(rs.next()) invalid = false;
				
		return invalid;

	}

	@Override
	public List<CV> ricercaCVnome(String nome) throws RemoteException, SQLException {
		List<CV> results = new ArrayList<CV>();		
		Statement statement = ServerMain.getStatement();
		
		ResultSet rs = statement.executeQuery("SELECT * FROM Centri_Vaccinali WHERE Nome LIKE '%"+nome+"%'");
		
		while(rs.next()) {
			results.add(new CV(rs.getString("Nome"), rs.getString("Indirizzo"), rs.getInt("CAP"), rs.getString("Comune"), rs.getString("Provincia"), rs.getString("Regione"), rs.getString("Tipo")));
		}
		
		return results;
	}

	@Override
	public List<CV> ricercaCVcomtip(String comune, String tipo) throws RemoteException, SQLException {
		List<CV> results = new ArrayList<CV>();		
		Statement statement = ServerMain.getStatement();
		
		ResultSet rs = statement.executeQuery("SELECT * FROM Centri_Vaccinali WHERE Comune LIKE '%"+comune+"%' AND Tipo = " + tipo);
		
		while(rs.next()) {
			results.add(new CV(rs.getString("Nome"), rs.getString("Indirizzo"), rs.getInt("CAP"), rs.getString("Comune"), rs.getString("Provincia"), rs.getString("Regione"), rs.getString("Tipo")));
		}
		
		return results;
	}

	@Override
	public boolean inserisciEA(String nomeCV, String nomeEvento, int valoreEvento, String note, int idSegnalazione) throws RemoteException, SQLException {
		Statement statement = ServerMain.getStatement();
		
		try{
			ResultSet rs = statement.executeQuery("INSERT INTO Eventi_Avversi (IDSegnalazione, NomeEvento, ValoreEvento, NomeCV, Note) VALUES (" + idSegnalazione + "," + nomeEvento + "," + valoreEvento + "," + nomeCV + "," + note + ");");
		} catch(Exception e) {
			return false;
		}
		
		return true;
	}

	@Override
	public boolean inserisciCV(String nome, String indirizzoLoc, int cap, String comune, String provincia, String regione, String tipo) throws RemoteException, SQLException {
		Statement statement = ServerMain.getStatement();
		
		try{
			ResultSet rs = statement.executeQuery("INSERT INTO Centri_Vaccinali (Nome, Indirizzo, Comune, CAP, Regione, Provincia, Tipo) VALUES (" + nome + "," + indirizzoLoc + "," + comune + "," + cap + "," + regione + "," + provincia + "," + tipo + ");" );
		} catch(Exception e) {
			return false;
		}
		
		return true;
	}

	@Override
	public boolean inserisciVacc(String nomeCitt, String cognomeCitt, String codFisc, String nomeCV, Date dataVaccino, String nomeVaccino, int IDvaccino) throws RemoteException, SQLException {
		Statement statement = ServerMain.getStatement();
		
		try{
			ResultSet rs = statement.executeQuery("INSERT INTO Cittadini_Vaccinati (Nome, Cognome, ID_vaccino, NomeVaccino, DataVaccino, NomeCV, CodiceFiscale) VALUES (" + nomeCitt + "," + cognomeCitt + "," + IDvaccino + "," + nomeVaccino + "," + dataVaccino + "," + nomeCV + "," + codFisc + ");");
		} catch(Exception e) {
			return false;
		}
		
		return true;
	}

	@Override
	public boolean registraVacc(int IDvaccino, String email, String username, String password) throws RemoteException, SQLException{
		Statement statement = ServerMain.getStatement();
	
		try{
			ResultSet rs = statement.executeQuery("INSERT INTO Cittadini_Registrati (ID_vaccino, Email, Username, Password) VALUES (" + IDvaccino + "," + email + "," + user + "," + password + ");");
		} catch(Exception e) {
			return false;
		}
		
		return true;
	}

	@Override
	public synchronized int getIDSegnalazione() throws RemoteException {
		return ++IDsegnalazione;
	}

	@Override
	public String getCVfromUser(String user) throws RemoteException, SQLException {
		String CV = "";
		
		Statement statement = ServerMain.getStatement();
		
		ResultSet rs = statement.executeQuery("SELECT NomeCV FROM Cittadini_Vaccinati JOIN Cittadini_Registrati WHERE Username = " + user);
		
		if(rs.next()) CV = rs.getString("NomeCV");
				
		return CV;
	}

}
