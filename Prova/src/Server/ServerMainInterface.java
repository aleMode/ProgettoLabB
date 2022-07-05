package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

public interface ServerMainInterface extends Remote{
	boolean usernameTaken(String user) throws RemoteException;
	boolean emailTaken(String email) throws RemoteException;
	boolean codFiscTaken(String codFisc) throws RemoteException;
	boolean nomeCVTaken(String nomeCV) throws RemoteException;
	//boolean nomeCVReg(String nomeCV) throws RemoteException;
	boolean userPassLogin(String user, String pwd) throws RemoteException;
	HashMap<String, ArrayList<String>> ricercaCVnome(String nome) throws RemoteException;
	HashMap<String, ArrayList<String>> ricercaCVcomtip(String comune, String tipo) throws RemoteException;
	
}
