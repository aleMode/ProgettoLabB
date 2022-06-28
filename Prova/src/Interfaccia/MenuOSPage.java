package Interfaccia;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuOSPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MenuOSPage(JPanel cardStack) {
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		
		JButton backButton = new JButton("Indietro");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"osLogin");					
				}
			}
		);
		backButton.setBackground(new Color(255, 255, 204));
		backButton.setFont(new Font("Calibri", Font.PLAIN, 11));
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		c.insets= new Insets(0,0,0,0);
		add(backButton, c);
		
		JButton RegCVButton = new JButton("Registrare un nuovo Centro");
		RegCVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"registraCV");
			}
		});		 
		RegCVButton.setPreferredSize(new Dimension(200,60));
		RegCVButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegCVButton.setBackground(new Color(51, 153, 204));
		c.gridx=0;
		c.gridy=2;
		c.weighty=0.5;
		c.insets= new Insets(0,5,100,0); //t,l,b,r
		add(RegCVButton,c);
		
		JButton RegVaccButton = new JButton("Registrare un nuovo vaccinato");
		RegVaccButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"registraVacc");
			}
		});
		RegVaccButton.setPreferredSize(new Dimension(200,60));
		RegVaccButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegVaccButton.setBackground(new Color(51, 153, 204));
		c.gridx=1;
		c.gridy=2;
		c.weighty=0.5;
		c.insets= new Insets(0,0,100,5); //t,l,b,r
		add(RegVaccButton,c);
	
		JTextArea Scritta2 = new JTextArea();
		Scritta2.setEditable(false);
		Scritta2.setFont(new Font("Calibri", Font.BOLD, 25));
		Scritta2.setText("Sei un'operatore sanitario, cosa vuoi fare?");
		Scritta2.setLineWrap(true);
		Scritta2.setBackground(new Color(153, 255, 255));
		Scritta2.setPreferredSize(new Dimension(440,60));
		c.gridx=0;
		c.gridy=1; 
		c.gridwidth=2; 
		c.weighty=0.2;
		c.insets= new Insets(0,0,0,0);
		add(Scritta2, c);
	}
	@Override
	 public Dimension getPreferredSize(){
		 return (new Dimension(500, 500));
	 }
}
