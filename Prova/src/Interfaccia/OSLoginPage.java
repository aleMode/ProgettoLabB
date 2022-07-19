package Interfaccia;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import GUI.GUI;
import Server.ServerMainInterface;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class OSLoginPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	
	public OSLoginPage(JPanel cardStack, ServerMainInterface stub) {

		contentPane = cardStack;
		 
		setBackground(new Color(153, 255, 255)); 
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton btnNewButton = new JButton("Indietro");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"startPage");
			}
		});
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		add(btnNewButton, c);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBackground(new Color(153, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNewLabel.setText("ID Operatore");
		c.ipady=0;
		c.gridx=1;
		c.gridy=1;
		c.weighty=0.4;
		c.weightx = 0.1;
		add(lblNewLabel, c);
		
		JLabel lblPassword = new JLabel();
		lblPassword.setBackground(new Color(153, 255, 255));
		lblPassword.setFont(new Font("Calibri", Font.BOLD, 16));
		lblPassword.setText("Password");
		c.ipady=0;
		c.gridx=1;
		c.gridy=2;
		c.weighty=0.4;
		c.weightx = 0.1;
		c.anchor=GridBagConstraints.NORTH;
		add(lblPassword, c);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 16));
		c.gridx=2;
		c.gridy=1;
		c.weighty=0.4;
		c.weightx = 0.1;
		c.insets= new Insets(57,0,0,0);
		textField.setColumns(10);
		add(textField, c);
		
		passwordField = new JPasswordField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 16));
		c.ipady=0;
		c.gridx=2;
		c.gridy=2;
		c.weighty=0.4;
		c.weightx = 0.1;
		c.insets= new Insets(0,0,57,0);
	    c.anchor=GridBagConstraints.NORTH;
		passwordField.setColumns(10);
		add(passwordField, c);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setBackground(new Color(51, 153, 204));
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//funzione login
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuOS");
			}
		});
		btnNewButton_1.setPreferredSize(new Dimension(120,30));
		c.gridx=2;
		c.gridy=3;
		c.weightx=1;
		add(btnNewButton_1, c);
	}
}
