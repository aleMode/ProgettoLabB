package GUI;

import java.awt.CardLayout;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Interfaccia.*;
import Server.ServerMainInterface;

public class GUI {
	
	private void displayGUI(ServerMainInterface stub)
    {
        JFrame frame = new JFrame("Centri Vaccinali");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        PageViewer cardLayout = new PageViewer();
        contentPane.setLayout(cardLayout);
        
        StartPage startPage = new StartPage(contentPane, stub);
        OSLoginPage osLoginPage = new OSLoginPage(contentPane, stub);
    	MenuOSPage menuOSPage = new MenuOSPage(contentPane, stub);
    	MenuCittPage menuCittPage = new MenuCittPage(contentPane, stub);
    	RicercaCVPage ricercaCVPage = new RicercaCVPage(contentPane, stub);
    	RisultatiCVPage risultatiCVPage = new RisultatiCVPage(contentPane, stub);
    	IscrizioneCittCVPage iscrizioneCittCVPage = new IscrizioneCittCVPage(contentPane, stub);
    	LoginEventiAvvPage loginEventiAvvPage = new LoginEventiAvvPage(contentPane, stub);
    	EventiAvvPage eventiAvvPage = new EventiAvvPage(contentPane, stub);
    	RegistraCVPage registraCVPage = new RegistraCVPage(contentPane, stub);
    	RegistraVaccinatoPage registraVaccinatoPage = new RegistraVaccinatoPage(contentPane, stub);
    	FinalPage finalPage = new FinalPage(contentPane, stub);
        
        contentPane.add(startPage, "startPage"); 
        contentPane.add(osLoginPage, "osLogin"); 
        contentPane.add(menuOSPage, "menuOS"); 
        contentPane.add(menuCittPage, "menuCitt"); 
        contentPane.add(ricercaCVPage, "ricercaCV"); 
        contentPane.add(risultatiCVPage, "risultatiCV"); 
        contentPane.add(iscrizioneCittCVPage, "iscrizioneCittCV"); 
        contentPane.add(loginEventiAvvPage, "loginEventiAvv"); 
        contentPane.add(eventiAvvPage, "eventiAvv"); 
        contentPane.add(registraCVPage, "registraCV"); 
        contentPane.add(registraVaccinatoPage, "registraVacc"); 
        contentPane.add(finalPage, "finalPage"); 

        cardLayout.show(contentPane, "startPage");
        frame.setContentPane(contentPane);
        frame.pack();   
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
	
	public static void main(String[] args) {
		
		Registry registro;
		ServerMainInterface stubtmp = null;
		try{
			registro = LocateRegistry.getRegistry(6969);
			stubtmp = (ServerMainInterface) registro.lookup("ServerCV");
		}catch(Exception e) {
			System.err.println("Errore: " + e.toString());
		}
		 
		final ServerMainInterface stub = stubtmp;
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new GUI().displayGUI(stub);
	        }
	    });
	}

}
