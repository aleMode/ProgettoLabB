package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ServerMainInterface extends Remote{
	boolean usernameTaken(String user) throws RemoteException, SQLException;
	boolean emailTaken(String email) throws RemoteException, SQLException;
	boolean codFiscTaken(String codFisc) throws RemoteException, SQLException;
	boolean nomeCVTaken(String nomeCV) throws RemoteException, SQLException;
	//boolean nomeCVReg(String nomeCV) throws RemoteException;
	boolean userPassLogin(String user, String pwd) throws RemoteException, SQLException;
	List<CV> ricercaCVnome(String nome) throws RemoteException, SQLException;
	List<CV> ricercaCVcomtip(String comune, String tipo) throws RemoteException, SQLException;
	
}
