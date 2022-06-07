package Interfaccia;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuCittPage extends JPanel { 

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	public MenuCittPage(JPanel cardStack) {
		
		contentPane = cardStack;
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JTextArea Scritta1 = new JTextArea();
		Scritta1.setLineWrap(true);
		Scritta1.setFont(new Font("Calibri", Font.BOLD, 25));
		Scritta1.setWrapStyleWord(true);
		Scritta1.setBackground(new Color(153, 255, 255));
		Scritta1.setText("Sei un cittadino, cosa vuoi fare?");
		Scritta1.setBounds(10, 61, 340, 28);
		add(Scritta1,c);
		
		JButton Consulta = new JButton("Consultare le informazioni di un centro vaccinale");
		Consulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"ricercaCV");
			}
		});
		Consulta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Consulta.setBackground(new Color(51, 153, 204));
		Consulta.setBounds(10, 135, 300, 60);
		add(Consulta,c);
		
		JButton Registrati = new JButton("Registrarmi");
		Registrati.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Registrati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"iscrizioneCittCV");
			}
		});
		Registrati.setBackground(new Color(51, 153, 204));
		Registrati.setBounds(10, 243, 300, 60);
		add(Registrati,c);
		
		JButton Effetti_Collaterali = new JButton("Inserire effetti collaterali");
		Effetti_Collaterali.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Effetti_Collaterali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"loginEventiAvv");
			}
		});
		Effetti_Collaterali.setBackground(new Color(51, 153, 204));
		Effetti_Collaterali.setBounds(10, 350, 300, 60);
		add(Effetti_Collaterali,c);
		
		JTextArea txtrCercaUnCentro = new JTextArea();
		txtrCercaUnCentro.setBackground(new Color(153, 255, 255));
		txtrCercaUnCentro.setLineWrap(true);
		txtrCercaUnCentro.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtrCercaUnCentro.setText("Cerca un Centro Vaccinale per nome \r\no per comune e tipologia.");
		txtrCercaUnCentro.setBounds(320, 135, 255, 60);
		add(txtrCercaUnCentro,c);
		
		JTextArea txtrRegistrarsi = new JTextArea();
		txtrRegistrarsi.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtrRegistrarsi.setLineWrap(true);
		txtrRegistrarsi.setText("Per registrarsi ad un Centro \r\nVaccinale bisogna avere in possesso\r\nun'ID vaccinazione.");
		txtrRegistrarsi.setBackground(new Color(153, 255, 255));
		txtrRegistrarsi.setBounds(320, 243, 255, 60);
		add(txtrRegistrarsi,c);
		
		JTextArea txtrInserireEffetti = new JTextArea();
		txtrInserireEffetti.setBackground(new Color(153, 255, 255));
		txtrInserireEffetti.setFont(new Font("Calibri", Font.PLAIN, 14));
		txtrInserireEffetti.setLineWrap(true);
		txtrInserireEffetti.setText("Per inserire degli effetti collaterali \r\npost-vaccinazione bisogna avere in \r\npossesso Username e Passowrd.");
		txtrInserireEffetti.setBounds(320, 350, 255, 60);
		add(txtrInserireEffetti,c);
		
		JButton back1 = new JButton("Indietro");
		back1.setBackground(new Color(255, 255, 204));
		back1.setFont(new Font("Calibri", Font.PLAIN, 11));
		back1.setBounds(10, 11, 80, 31);
		add(back1);
		back1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"startPage");				
			}
		});
	}
	@Override
	public Dimension getPreferredSize(){
	        return (new Dimension(500, 500));
	    }

}

