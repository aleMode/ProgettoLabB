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
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class IscrizioneCittCVPage extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public IscrizioneCittCVPage(JPanel cardStack, ServerMainInterface stub) {
		
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255)); 
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		JLabel lblInserireDati = new JLabel();
		lblInserireDati.setBackground(new Color(153, 255, 255));
		lblInserireDati.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblInserireDati.setText("Inserire i dati richiesti:");
		c.ipady=0;
		c.gridx=1;
		c.gridy=1;
		c.weighty=0.6;
		add(lblInserireDati,c);

		JLabel lblNome = new JLabel();
		lblNome.setBounds(30, 75, 61, 16);
		lblNome.setBackground(new Color(153, 255, 255));
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNome.setText("Nome");
		c.ipady=0;
		c.gridx=1;
		c.gridy=2;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblNome, c);

		JLabel lblCognome = new JLabel();
		lblCognome.setBounds(296, 75, 74, 16);
		lblCognome.setBackground(new Color(153, 255, 255));
		lblCognome.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblCognome.setText("Cognome");
		c.ipady=0;
		c.gridx=1;
		c.gridy=3;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblCognome, c);

		JLabel lblCodiceFiscale = new JLabel();
		lblCodiceFiscale.setBounds(30, 130, 117, 16);
		lblCodiceFiscale.setBackground(new Color(153, 255, 255));
		lblCodiceFiscale.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblCodiceFiscale.setText("Codice Fiscale");
		c.ipady=0;
		c.gridx=1;
		c.gridy=4;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblCodiceFiscale, c);

		JLabel lblEmail = new JLabel();
		lblEmail.setBounds(296, 130, 61, 16);
		lblEmail.setBackground(new Color(153, 255, 255));
		lblEmail.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEmail.setText("Email");
		c.ipady=0;
		c.gridx=1;
		c.gridy=5;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblEmail, c);

		JLabel lblIDvaccino = new JLabel();
		lblIDvaccino.setBounds(30, 187, 79, 16);
		lblIDvaccino.setBackground(new Color(153, 255, 255));
		lblIDvaccino.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblIDvaccino.setText("ID Vaccino");
		c.ipady=0;
		c.gridx=1;
		c.gridy=6;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblIDvaccino, c);

		JLabel lblUsername = new JLabel();
		lblUsername.setBounds(296, 187, 74, 16);
		lblUsername.setBackground(new Color(153, 255, 255));
		lblUsername.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblUsername.setText("Username");
		c.ipady=0;
		c.gridx=1;
		c.gridy=7;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblUsername, c);

		JLabel lblPassword = new JLabel();
		lblPassword.setBackground(new Color(153, 255, 255));
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblPassword.setText("Password");
		c.ipady=0;
		c.gridx=1;
		c.gridy=8;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblPassword, c);

		JLabel lblPassword2 = new JLabel();
		lblPassword2.setBackground(new Color(153, 255, 255));
		lblPassword2.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblPassword2.setText("Ripeti Password");
		c.ipady=0;
		c.gridx=1;
		c.gridy=9;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(lblPassword2, c);

		JTextField txfNome = new JTextField();
		txfNome.setBounds(28, 92, 224, 26);
		txfNome.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=2;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(txfNome, c);
		txfNome.setColumns(10);

		JTextField txfCognome = new JTextField();
		txfCognome.setBounds(28, 92, 224, 26);
		txfCognome.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=3;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(txfCognome, c);
		txfCognome.setColumns(10);

		JTextField txfCodiceFiscale = new JTextField();
		txfCodiceFiscale.setBounds(28, 92, 224, 26);
		txfCodiceFiscale.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=4;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
        add(txfCodiceFiscale, c);
		txfCodiceFiscale.setColumns(10);

		JTextField txfEmail = new JTextField();
		txfEmail.setBounds(28, 92, 224, 26);
		txfEmail.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=5;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
        add(txfEmail, c);
		txfEmail.setColumns(10);

		JTextField txfIDvaccino = new JTextField();
		txfIDvaccino.setBounds(28, 92, 224, 26);
		txfIDvaccino.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=6;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(txfIDvaccino, c);
		txfIDvaccino.setColumns(10);

		JTextField txfUsername = new JTextField();
		txfUsername.setBounds(28, 92, 224, 26);
		txfUsername.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=7;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(txfUsername, c);
		txfUsername.setColumns(10);

		JPasswordField pswField = new JPasswordField();
		pswField.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=8;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(pswField, c);
		pswField.setColumns(10);

		JPasswordField pswField2 = new JPasswordField();
		txfNome.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.ipady=0;
		c.gridx=2;
		c.gridy=9;
		c.weighty=0.4;
		c.anchor=GridBagConstraints.NORTH;
		add(pswField2, c);
		pswField2.setColumns(10);
		
		JLabel lblError = new JLabel();
		lblError.setBackground(new Color(153, 255, 255));
		lblError.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblError.setText("Nessun Errore");
		c.ipady=0;
		c.gridx=1;
		c.gridy=10;
		c.gridwidth=2;
		add(lblError, c);
		c.gridwidth=1;
		
		JButton btnRegistra = new JButton("Registra");
		btnRegistra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = txfEmail.getText();
				try {
					if(stub.emailTaken(email)) 	lblError.setText("Email in uso");
					return;
				} catch (Exception e1) {}
				
				String user = txfUsername.getText();
				try {
					if(stub.usernameTaken(user))  lblError.setText("Username in uso");
					return;
				} catch (Exception e1) {}
				
				String password = pswField.toString();
				try {
					if(!password.equals(pswField2.toString())) 	lblError.setText("Password diverse");
					return;
				} catch (Exception e1) {}
				
				String codFisc = txfCodiceFiscale.getText();
				int id = (int) Integer.parseInt(txfIDvaccino.getText());
				try {
					if(stub.IDvaccinato(codFisc, id))  lblError.setText("ID o nome non validi");
					return;
				} catch (Exception e1) {}
				
				try {
					stub.registraVacc(id, email, user, password);
				} catch (RemoteException | SQLException e1) {}
				txfNome.setText("");
				txfCognome.setText("");
				txfCodiceFiscale.setText("");
				txfEmail.setText("");
				txfIDvaccino.setText("");
				txfUsername.setText("");
				pswField.setText("");
				pswField2.setText("");
				lblError.setText("Nessun Errore");
				
				
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"finalPage");
			}
		});
		btnRegistra.setBackground(new Color(51, 153, 204));
		btnRegistra.setPreferredSize(new Dimension(150,50));
		c.gridx=1;
		c.gridy=11;
		c.insets= new Insets(0,5,0,5); //t,l,b,r
		add(btnRegistra, c);

		JButton btnRipristina = new JButton("Ripristina");
		btnRipristina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfNome.setText("");
				txfCognome.setText("");
				txfCodiceFiscale.setText("");
				txfEmail.setText("");
				txfIDvaccino.setText("");
				txfUsername.setText("");
				pswField.setText("");
				pswField2.setText("");
				lblError.setText("Nessun Errore");
			}
		});
		btnRipristina.setBackground(new Color(51, 153, 204));
		btnRipristina.setPreferredSize(new Dimension(150,50));
		c.gridx=2;
		c.gridy=11;
		add(btnRipristina, c);

		JButton btnBack = new JButton("Indietro");
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfNome.setText("");
				txfCognome.setText("");
				txfCodiceFiscale.setText("");
				txfEmail.setText("");
				txfIDvaccino.setText("");
				txfUsername.setText("");
				pswField.setText("");
				pswField2.setText("");
				lblError.setText("Nessun Errore");
				
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuCitt");
			}
		});
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		add(btnBack,c);
	}
}
