package Interfaccia;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuCittPage extends JPanel { 

	private static final long serialVersionUID = 1L;	
	
	public MenuCittPage(JPanel cardStack) {
		
		JPanel contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton BtnBack = new JButton("Indietro");
		BtnBack.setBackground(new Color(255, 255, 204));
		BtnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		BtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"startPage");				
			}
		});
		BtnBack.setPreferredSize(new Dimension(100,50));
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		add(BtnBack,c);
		
		JButton BtnConsulta = new JButton("Consulta un CV");
		BtnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"ricercaCV");
			}
		});
		BtnConsulta.setPreferredSize(new Dimension(150,50));
		BtnConsulta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		BtnConsulta.setBackground(new Color(51, 153, 204));
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=2;
		c.ipady=70;
		c.weighty=0.2;
		c.insets= new Insets(0,5,0,5); //t,l,b,r
		add(BtnConsulta,c);
		
		JButton BtnRegistrati = new JButton("Registrarmi");
		BtnRegistrati.setFont(new Font("Tahoma", Font.PLAIN, 12));
		BtnRegistrati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"iscrizioneCittCV");
			}
		});
		BtnRegistrati.setBackground(new Color(51, 153, 204));
		BtnRegistrati.setPreferredSize(new Dimension(150,50));
		c.gridx=2;
		c.gridy=2;
		c.insets= new Insets(0,5,0,5); //t,l,b,r
		add(BtnRegistrati,c);
		
		JButton BtnEffetti_Collaterali = new JButton("Effetti collaterali");
		BtnEffetti_Collaterali.setFont(new Font("Tahoma", Font.PLAIN, 12));
		BtnEffetti_Collaterali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"loginEventiAvv");
			}
		});
		BtnEffetti_Collaterali.setBackground(new Color(51, 153, 204));
		BtnEffetti_Collaterali.setPreferredSize(new Dimension(150,50));
		c.gridx=3;
		c.gridy=2;
		c.insets= new Insets(0,5,0,5); //t,l,b,r
		add(BtnEffetti_Collaterali,c);
		
		JTextArea txtrCercaUnCentro = new JTextArea();
		txtrCercaUnCentro.setBackground(new Color(153, 255, 255));
		txtrCercaUnCentro.setLineWrap(true);
		txtrCercaUnCentro.setWrapStyleWord(true);
		txtrCercaUnCentro.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtrCercaUnCentro.setEditable(false);
		txtrCercaUnCentro.setText("Cerca un Centro Vaccinale per nome o per comune e tipologia.");
		c.ipady=0;
		c.gridx=1;
		c.gridy=3;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(txtrCercaUnCentro,c);
		
		JTextArea txtrRegistrarsi = new JTextArea();
		txtrRegistrarsi.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtrRegistrarsi.setLineWrap(true);
		txtrRegistrarsi.setEditable(false);
		txtrRegistrarsi.setText("Per registrarsi ad un Centro Vaccinale bisogna essere in possesso di un'ID vaccinazione.");
		txtrRegistrarsi.setBackground(new Color(153, 255, 255));
		c.gridx=2;
		c.gridy=3;
		add(txtrRegistrarsi,c);
		
		JTextArea txtrInserireEffetti = new JTextArea();
		txtrInserireEffetti.setBackground(new Color(153, 255, 255));
		txtrInserireEffetti.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtrInserireEffetti.setLineWrap(true);
		txtrInserireEffetti.setEditable(false);
		txtrInserireEffetti.setText("Per inserire degli effetti collaterali \r\npost-vaccinazione bisogna avere in \r\npossesso Username e Passowrd.");
		c.gridx=3;
		c.gridy=3;
		add(txtrInserireEffetti,c);
		
		JTextArea ScrCitt = new JTextArea();
		ScrCitt.setFont(new Font("Calibri", Font.BOLD, 25));
		ScrCitt.setWrapStyleWord(true);
		ScrCitt.setBackground(new Color(153, 255, 255));
		ScrCitt.setEditable(false);
		ScrCitt.setText("Sei un cittadino, cosa vuoi fare?");
		c.gridx=1;
		c.gridy=1;
		c.anchor=GridBagConstraints.CENTER;
		c.weighty=0.6;
		c.gridwidth=3;
		add(ScrCitt,c);
	}
	
	@Override
	public Dimension getPreferredSize(){
	        return (new Dimension(500, 500));
	    }

}

