package GUI;

import java.awt.CardLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GUI {

	private CardLayout cardLayout;
	private CittPage cittPage;
	private StartPage startPage;
	private OSPage osPage;
	
	private void displayGUI()
    {
        JFrame frame = new JFrame("Card Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        cardLayout = new PageViewer();
        contentPane.setLayout(cardLayout);
        cittPage = new CittPage(contentPane);
        startPage = new StartPage(contentPane);
        osPage = new OSPage(contentPane);
   
        contentPane.add(startPage, "StartPage"); 
        contentPane.add(cittPage, "CittPage"); 
        contentPane.add(osPage, "OSPage");
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
