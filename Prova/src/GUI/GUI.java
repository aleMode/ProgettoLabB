package GUI;

import java.awt.CardLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Interfaccia.*;

public class GUI {

	private CardLayout cardLayout;
	private StartPage startPage;
	private OSLoginPage osLoginPage;
	private MenuOSPage menuOSPage;
	private MenuCittPage menuCittPage;
	private RicercaCVPage ricercaCVPage;
	private RisultatiCVPage risultatiCVPage;
	private IscrizioneCittCVPage iscrizioneCittCVPage;
	private LoginEventiAvvPage loginEventiAvvPage;
	private EventiAvvPage eventiAvvPage;
	private RegistraCVPage registraCVPage;
	private RegistraVaccinatoPage registraVaccinatoPage;
	private FinalPage finalPage;
	
	private void displayGUI()
    {
        JFrame frame = new JFrame("Card Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        cardLayout = new PageViewer();
        contentPane.setLayout(cardLayout);
        
        startPage = new StartPage(contentPane);
        osLoginPage = new OSLoginPage(contentPane);
    	menuOSPage = new MenuOSPage(contentPane);
    	menuCittPage = new MenuCittPage(contentPane);
    	ricercaCVPage = new RicercaCVPage(contentPane);
    	risultatiCVPage = new RisultatiCVPage(contentPane);
    	iscrizioneCittCVPage = new IscrizioneCittCVPage(contentPane);
    	loginEventiAvvPage = new LoginEventiAvvPage(contentPane);
    	eventiAvvPage = new EventiAvvPage(contentPane);
    	registraCVPage = new RegistraCVPage(contentPane);
    	registraVaccinatoPage = new RegistraVaccinatoPage(contentPane);
    	finalPage = new FinalPage(contentPane);
        
        contentPane.add(startPage, "StartPage"); 
        contentPane.add(osLoginPage, "StartPage"); 
        contentPane.add(menuOSPage, "StartPage"); 
        contentPane.add(menuCittPage, "StartPage"); 
        contentPane.add(ricercaCVPage, "StartPage"); 
        contentPane.add(risultatiCVPage, "StartPage"); 
        contentPane.add(iscrizioneCittCVPage, "StartPage"); 
        contentPane.add(loginEventiAvvPage, "StartPage"); 
        contentPane.add(eventiAvvPage, "StartPage"); 
        contentPane.add(registraCVPage, "StartPage"); 
        contentPane.add(registraVaccinatoPage, "StartPage"); 
        contentPane.add(finalPage, "StartPage"); 

        
        frame.setContentPane(contentPane);
        frame.pack();   
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
	
	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable()
	        {
	            public void run()
	            {
	                new GUI().displayGUI();
	            }
	        });
	}

}
