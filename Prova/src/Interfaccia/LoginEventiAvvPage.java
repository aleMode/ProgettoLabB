package Interfaccia;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GUI.GUI;
import Server.ServerMainInterface;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class LoginEventiAvvPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public LoginEventiAvvPage(JPanel cardStack, ServerMainInterface stub) {
		contentPane = cardStack;

		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton btnBack = new JButton("Indietro");
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuCitt");
			}
		});
		btnBack.setPreferredSize(new Dimension(90,25));
		c.gridx= 0;
		c.gridy= 0;	
		add(btnBack, c);
		
		JLabel lblInserisciDati = new JLabel("Inserisci i dati richiesti");
		lblInserisciDati.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth=2;
		c.weighty=0.2;
		add(lblInserisciDati,c);
		c.gridwidth=1;
		
		JLabel LblUser = new JLabel("Username:");
		LblUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.gridx= 1;
		c.gridy= 2;
		c.weightx = 0.2;
		add(LblUser,c);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.gridx= 1;
		c.gridy= 3;
		add(lblPass, c);

		JTextField tfUser = new JTextField();
		tfUser.setColumns(10);
		c.gridx= 2;
		c.gridy= 2;
		add(tfUser, c);
		
		JPasswordField pwdField = new JPasswordField();
		pwdField.setColumns(10);
		c.gridx=2;
		c.gridy=3;
		add(pwdField,c);
		
		JLabel lblError = new JLabel();
		lblError.setBackground(new Color(153, 255, 255));
		lblError.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblError.setText("Nessun Errore");
		c.ipady=0;
		c.gridx=1;
		c.gridy=4;
		c.gridwidth=2;
		add(lblError, c);
		c.gridwidth=1;
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(stub.userPassLogin(tfUser.getText(), pwdField.toString())) {
						
						EventiAvvPage.nomeCV = stub.getCVfromUser(tfUser.getText());
						
						lblError.setText("Nessun Errore");
						tfUser.setText("");
						pwdField.setText("");
						
						CardLayout cardLayout = (CardLayout) contentPane.getLayout();
						cardLayout.show(contentPane,"eventiAvv");
					}else {
						if(stub.usernameTaken(tfUser.getText())) {
							lblError.setText("Password errata");

						}else {
							lblError.setText("Username e Password errati");
						}
					}
				} catch (RemoteException | SQLException e1) {}
			}
		});
		c.gridx= 2;
		c.gridy= 5;			
		add(btnLogin,c);
	}
}
