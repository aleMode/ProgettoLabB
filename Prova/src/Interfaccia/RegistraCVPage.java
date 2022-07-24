package Interfaccia;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import GUI.GUI;
import Server.ServerMainInterface;

import javax.swing.JList;

public class RegistraCVPage extends JPanel {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] tipi = {"Hub","Ospedaliero","Aziendale"};
	
	public RegistraCVPage(JPanel cardStack, ServerMainInterface stub) {
		 
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		
		JButton btnBack = new JButton("Indietro");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"menuOS");					
				}
			}
		);
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		add(btnBack, c);
		
		JLabel lblInserisciDati = new JLabel("Inserisci i dati richiesti");
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=3;
		c.insets= new Insets(5,5,5,5); 
		add(lblInserisciDati,c);
		c.gridwidth=1;

		
		JLabel lblNomeCentro = new JLabel("Nome Centro");
		c.gridx=1;
		c.gridy=1;
		add(lblNomeCentro,c);
		
		JTextField txfNome = new JTextField();
		c.gridx=2;
		c.gridy=1;
		txfNome.setColumns(10);
		add(txfNome,c);
		
		JLabel lblRegione = new JLabel("Regione");
		c.gridx=1;
		c.gridy=2;
		add(lblRegione, c);
		
		JTextField txfRegione = new JTextField();
		txfRegione.setColumns(10);
		c.gridx=2;
		c.gridy=2;
		add(txfRegione,c);
				
		JLabel lblProv = new JLabel("Provincia");
		c.gridx=1;
		c.gridy=3;
		add(lblProv, c);
		
		JTextField txfProv = new JTextField();
		txfProv.setColumns(10);
		c.gridx=2;
		c.gridy=3;
		add(txfProv,c);
		
		JLabel lblComune = new JLabel("Comune");
		c.gridx=1;
		c.gridy=4;
		add(lblComune, c);
		
		JTextField txfComune = new JTextField();
		txfComune.setColumns(10);
		c.gridx=2;
		c.gridy=4;
		add(txfComune,c);
		
		JLabel lblCAP = new JLabel("CAP");
		c.gridx=1;
		c.gridy=5;
		add(lblCAP, c);
		
		JTextField txfCAP = new JTextField();
		txfCAP.setColumns(10);
		c.gridx=2;
		c.gridy=5;
		add(txfCAP,c);
		
		JLabel lblIndir = new JLabel("Indirizzo");
		c.gridx=1;
		c.gridy=6;
		add(lblIndir, c);
		
		JTextField txfIndirizzo = new JTextField();
		txfIndirizzo.setColumns(10);
		c.gridx=2;
		c.gridy=6;
		add(txfIndirizzo,c);
		
		
		JLabel lblTipo = new JLabel("Tipo");
		c.gridx=1;
		c.gridy=7;
		add(lblTipo, c);
		
		JList lstTipo = new JList(tipi);
		c.gridx=2;
		c.gridy=7;
		add(lstTipo,c);
		
		JLabel lblErrori = new JLabel("Nessun errore");
		c.gridx=1;
		c.gridy=8;
		c.gridwidth=4;
		add(lblErrori, c);
		
		JButton btnRegistra = new JButton("Registra");
		btnRegistra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						if(stub.nomeCVTaken(txfNome.getText())) {
							lblErrori.setText("Nome già in uso");
							return;
						}
						if(stub.inserisciCV(txfNome.getText(), txfIndirizzo.getText(), (int) Integer.parseInt(txfCAP.getText()), txfComune.getText(), txfProv.getText(), txfRegione.getText(), (String) lstTipo.getSelectedValue())) {
							txfNome.setText("");
							txfIndirizzo.setText("");
							txfCAP.setText("");
							txfComune.setText("");
							txfProv.setText("");
							txfRegione.setText("");
							lstTipo.setSelectedIndex(0);
							lblErrori.setText("Nessun errore");
							
							CardLayout cardLayout = (CardLayout) contentPane.getLayout();
							cardLayout.show(contentPane,"finalPage");
						}
						else {
							lblErrori.setText("Errore di registrazione");
						}
					} catch (NumberFormatException | RemoteException | SQLException e1) {}		
				}
			}
		);
		c.gridx=2;
		c.gridy=9;		
		add(btnRegistra,c);
		
		
	}
}
