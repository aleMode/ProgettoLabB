package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface ServerMainInterface extends Remote{
	boolean usernameTaken(String user) throws RemoteException, SQLException;
	boolean emailTaken(String email) throws RemoteException, SQLException;
	boolean codFiscTaken(String codFisc) throws RemoteException, SQLException;
	boolean nomeCVTaken(String nomeCV) throws RemoteException, SQLException;
	boolean IDvaccinato(String codFisc, int ID) throws RemoteException, SQLException;
	//boolean nomeCVReg(String nomeCV) throws RemoteException;
	boolean userPassLogin(String user, String pwd) throws RemoteException, SQLException;
	List<CV> ricercaCVnome(String nome) throws RemoteException, SQLException;
	List<CV> ricercaCVcomtip(String comune, String tipo) throws RemoteException, SQLException;
	
	//EventoAvverso getEA
	boolean inserisciEA(String nomeCV, String nomeEvento, int valoreEvento, String note, int idSegnalazione) throws RemoteException, SQLException;
	boolean inserisciCV(String nome, String indirizzoLoc, int cap, String comune, String provincia, String regione, String tipo) throws RemoteException, SQLException;
	boolean inserisciVacc(String codFisc, String nomeCV, Date dataVaccino, String nomeVaccino, int IDvaccino) throws RemoteException, SQLException;
	boolean registraVacc(int IDvaccino, String email, String username, String password) throws RemoteException, SQLException;
	
	int getIDSegnalazione() throws RemoteException;
	String getCVfromID(int ID) throws RemoteException, SQLException;
}
