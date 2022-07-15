package Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServerMain extends UnicastRemoteObject implements ServerMainInterface{
	private static final long serialVersionUID = 1L;

	protected ServerMain() throws RemoteException {
		super();
	}

	private Connection connetti(boolean connessioneAvvenuta) throws ClassNotFoundException {
	       Connection connect = null;
	       
	       String url = "jdbc:postgresql://localhost/Eventi_Avversi";
		   String user = "postgres";
		   String password = "admin";
		   
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
	
		Registry reg = LocateRegistry.createRegistry(9999);
		reg.rebind("ServerCV", s);
	}


}
