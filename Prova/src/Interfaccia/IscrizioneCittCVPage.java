package Interfaccia;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import GUI.GUI;
import Server.ServerMainInterface;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IscrizioneCittCVPage extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	public IscrizioneCittCVPage(JPanel cardStack, ServerMainInterface stub) {
		
		contentPane = cardStack ;
		
		setBackground(new Color(153, 255, 255)); 
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuCitt");
			}
		});
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		add(btnNewButton,c);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBackground(new Color(153, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setText("INSERIRE I DATI RICHIESTI:");
		c.ipady=0;
		c.gridx=1;
		c.gridy=1;
		c.weighty=0.6;
		add(lblNewLabel,c);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(30, 75, 61, 16);
		lblNewLabel_1.setBackground(new Color(153, 255, 255));
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_1.setText("NOME");
		c.ipady=0;
		c.gridx=1;
		c.gridy=2;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblNewLabel_1, c);

		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(296, 75, 74, 16);
		lblNewLabel_2.setBackground(new Color(153, 255, 255));
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_2.setText("COGNOME");
		c.ipady=0;
		c.gridx=1;
		c.gridy=3;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblNewLabel_2, c);

		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(30, 130, 117, 16);
		lblNewLabel_3.setBackground(new Color(153, 255, 255));
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_3.setText("CODICE FISCALE");
		c.ipady=0;
		c.gridx=1;
		c.gridy=4;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblNewLabel_3, c);

		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setBounds(296, 130, 61, 16);
		lblNewLabel_4.setBackground(new Color(153, 255, 255));
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_4.setText("EMAIL");
		c.ipady=0;
		c.gridx=1;
		c.gridy=5;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblNewLabel_4, c);

		JLabel lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setBounds(30, 187, 79, 16);
		lblNewLabel_5.setBackground(new Color(153, 255, 255));
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_5.setText("IDVACCINO");
		c.ipady=0;
		c.gridx=1;
		c.gridy=6;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblNewLabel_5, c);

		JLabel lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setBounds(296, 187, 74, 16);
		lblNewLabel_6.setBackground(new Color(153, 255, 255));
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_6.setText("USERNOME");
		c.ipady=0;
		c.gridx=1;
		c.gridy=7;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblNewLabel_6, c);

		JLabel lblNewLabel_7 = new JLabel();
		lblNewLabel_7.setBackground(new Color(153, 255, 255));
		lblNewLabel_7.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_7.setText("PASSWORD");
		c.ipady=0;
		c.gridx=1;
		c.gridy=8;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblNewLabel_7, c);

		JLabel lblNewLabel_8 = new JLabel();
		lblNewLabel_8.setBackground(new Color(153, 255, 255));
		lblNewLabel_8.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_8.setText("RIPETI PASSWORD");
		c.ipady=0;
		c.gridx=1;
		c.gridy=9;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblNewLabel_8, c);

		JButton btnNewButton_1 = new JButton("REGISTRA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//inserisci funzione di registrazione
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"finalPage");
			}
		});
		btnNewButton_1.setBackground(new Color(51, 153, 204));
		btnNewButton_1.setPreferredSize(new Dimension(150,50));
		c.gridx=1;
		c.gridy=10;
		c.insets= new Insets(0,5,0,5); //t,l,b,r
		add(btnNewButton_1, c);

		textField = new JTextField();
		textField.setBounds(28, 92, 224, 26);
		textField.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=2;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(textField, c);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(28, 92, 224, 26);
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=3;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(textField_1, c);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(28, 92, 224, 26);
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=4;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
        add(textField_2, c);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(28, 92, 224, 26);
		textField_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=5;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
        add(textField_3, c);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(28, 92, 224, 26);
		textField_4.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=6;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(textField_4, c);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(28, 92, 224, 26);
		textField_5.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=7;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(textField_5, c);
		textField_5.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=8;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(passwordField, c);
		passwordField.setColumns(10);

		passwordField_1 = new JPasswordField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=9;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(passwordField_1, c);
		passwordField_1.setColumns(10);

		JButton btnNewButton_2 = new JButton("RIPRISTINA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//inserisci funzione di clear
			}
		});
		btnNewButton_2.setBackground(new Color(51, 153, 204));
		btnNewButton_2.setPreferredSize(new Dimension(150,50));
		c.gridx=2;
		c.gridy=10;
		add(btnNewButton_2, c);

	}
}
