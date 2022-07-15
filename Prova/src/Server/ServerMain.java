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
import java.util.HashMap;
import java.util.List;

public class ServerMain extends UnicastRemoteObject implements ServerMainInterface{
	private static final long serialVersionUID = 1L;
	
	private static Statement statement = null;
	
	String url = "jdbc:postgresql://localhost/Eventi_Avversi";
	String user = "postgres";
	String password = "admin";
	static Connection connect = null;
	
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
	
		Registry reg = LocateRegistry.createRegistry(8999);
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


}