package Interfaccia;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class RegistraVaccinatoPage extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public RegistraVaccinatoPage(JPanel cardStack) {
		
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
	
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnBack) { 
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"menuOS");					
				}}
			}
		);
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		c.gridx=0;
		c.gridy=0;
		c.insets= new Insets(5,5,5,5);
		add(btnBack, c);
		
		JLabel lblNewLabel = new JLabel("Inserisci i dati richiesti");
		c.gridx=1;
		c.gridy=0;
		c.weightx = 3;
		add(lblNewLabel,c);
		c.weightx = 1;

		JLabel lblNewLabel_1 = new JLabel("Nome CV");
		c.gridx=1;
		c.gridy=1;
		add(lblNewLabel_1, c);
		
		JTextField textField1 = new JTextField();
		textField1.setColumns(10);
		c.gridx=2;
		c.gridy=1;		
		add(textField1,c);		
		
		JLabel lblNewLabel_2 = new JLabel("Nome Cittadino");
		c.gridx=1;
		c.gridy=2;		
		add(lblNewLabel_2,c);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		c.gridx=2;
		c.gridy=2;	
		add(textField_2,c);
		
		JLabel lblNewLabel_3 = new JLabel("Codice Fiscale");
		c.gridx=1;
		c.gridy=3;	
		add(lblNewLabel_3,c);
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		c.gridx=2;
		c.gridy=3;	
		add(textField_3,c);
		
		JLabel lblNewLabel_4 = new JLabel("Nome Vaccino");
		c.gridx=1;
		c.gridy=4;		
		add(lblNewLabel_4, c);
		
		JList list = new JList();
		c.gridx=2;
		c.gridy=4;		
		add(list,c);
		
		JLabel lblNewLabel_5 = new JLabel("Data Vaccino");
		c.gridx=1;
		c.gridy=5;	
		add(lblNewLabel_5,c);
		
		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		c.gridx=2;
		c.gridy=5;	
		add(textField_5,c);
		
		JLabel lblNewLabel_6 = new JLabel("ID");
		c.gridx=1;
		c.gridy=6;		
		add(lblNewLabel_6,c);
		
		JLabel lblNewLabel_7 = new JLabel("165156423");
		c.gridx=2;
		c.gridy=6;		
		add(lblNewLabel_7,c);
		
		JLabel lblNewLabel_8 = new JLabel("Errori");
		c.gridx=1;
		c.gridy=8;
		c.weightx=3;
		add(lblNewLabel_8,c);
		
		JButton btnReg = new JButton("Registra");
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"finalPage");	
			}}
		);
		//btnReg.setPreferredSize(new Dimension(200,60));
		btnReg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReg.setBackground(new Color(51, 153, 204));
		c.gridx=2;
		c.gridy=7;		
		add(btnReg,c);
	}

}
