package Interfaccia;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import GUI.GUI;
import Server.ServerMainInterface;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class OSLoginPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;	
	
	public OSLoginPage(JPanel cardStack, ServerMainInterface stub) {

		contentPane = cardStack;
		 
		setBackground(new Color(153, 255, 255)); 
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel lblID = new JLabel();
		lblID.setBackground(new Color(153, 255, 255));
		lblID.setFont(new Font("Calibri", Font.BOLD, 16));
		lblID.setText("ID Operatore");
		c.ipady=0;
		c.gridx=1;
		c.gridy=1;
		c.weighty=0.4;
		c.weightx = 0.1;
		add(lblID, c);
		
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
		
		JTextField tfUser = new JTextField();
		tfUser.setFont(new Font("Calibri", Font.PLAIN, 16));
		c.gridx=2;
		c.gridy=1;
		c.weighty=0.4;
		c.weightx = 0.1;
		c.insets= new Insets(57,0,0,0);
		tfUser.setColumns(10);
		add(tfUser, c);
		
		JPasswordField pwdField = new JPasswordField();
		pwdField.setFont(new Font("Calibri", Font.PLAIN, 16));
		c.ipady=0;
		c.gridx=2;
		c.gridy=2;
		c.weighty=0.4;
		c.weightx = 0.1;
		c.insets= new Insets(0,0,57,0);
	    c.anchor=GridBagConstraints.NORTH;
		pwdField.setColumns(10);
		add(pwdField, c);
		
		JLabel lblError = new JLabel();
		lblError.setBackground(new Color(153, 255, 255));
		lblError.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblError.setText("Nessun Errore");
		c.ipady=0;
		c.gridx=1;
		c.gridy=3;
		c.gridwidth=2;
		add(lblError, c);
		c.gridwidth=1;
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(51, 153, 204));
		btnLogin.setFont(new Font("Calibri", Font.BOLD, 15));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					boolean bool = true;
					if(bool) {//mettere funzione per login op sanit
												
						lblError.setText("Nessun Errore");
						tfUser.setText("");
						pwdField.setText("");
						
						CardLayout cardLayout = (CardLayout) contentPane.getLayout();
						cardLayout.show(contentPane,"menuOS");
					}else {
						if(bool) { //mettere funzione per database di opsan
							lblError.setText("Password errata");
						}else {
							lblError.setText("Username e Password errati");
						}
					}
				} catch (Exception e1) {}
			}
		});
		btnLogin.setPreferredSize(new Dimension(120,30));
		c.gridx=2;
		c.gridy=4;
		c.weightx=1;
		add(btnLogin, c);
		
		JButton btnBack = new JButton("Indietro");
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setText("Nessun Errore");
				tfUser.setText("");
				pwdField.setText("");
				
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"startPage");
			}
		});
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		add(btnBack, c);
		
	}
}
