package Interfaccia;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Server.ServerMainInterface;

public class RegistraVaccinatoPage extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] vaccini = {"Pfizer", "Moderna", "Vaxzevria (Astrazeneca)", "Janssen (J&J)"};

	public RegistraVaccinatoPage(JPanel cardStack, ServerMainInterface stub) {
		
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
	
		JButton btnBack = new JButton("Indietro");
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
		
		JLabel lblInserisciDati = new JLabel("Inserisci i dati richiesti:");
		lblInserisciDati.setFont(new Font("Calibri", Font.BOLD, 16));
		c.gridx=1;
		c.gridy=1;
		c.gridwidth=3;
		add(lblInserisciDati,c);
		c.gridwidth=1;

		JLabel lblNomeCV = new JLabel("Nome CV");
		c.gridx=1;
		c.gridy=2;
		add(lblNomeCV, c);
		
		JTextField tfNomeCV = new JTextField();
		tfNomeCV.setColumns(15);
		c.gridx=2;
		c.gridy=2;		
		add(tfNomeCV,c);		
		
		JLabel lblNomeCitt = new JLabel("Nome Cittadino");
		c.gridx=1;
		c.gridy=3;		
		add(lblNomeCitt,c);
		
		JTextField tfNomeCitt = new JTextField();
		tfNomeCitt.setColumns(15);
		c.gridx=2;
		c.gridy=3;	
		add(tfNomeCitt,c);
		
		JLabel lblCognomeCitt = new JLabel("Cognome Cittadino");
		c.gridx=1;
		c.gridy=4;		
		add(lblCognomeCitt,c);
		
		JTextField tfCognomeCitt = new JTextField();
		tfNomeCitt.setColumns(15);
		c.gridx=2;
		c.gridy=4;	
		add(tfCognomeCitt,c);
		
		JLabel lblCodFisc = new JLabel("Codice Fiscale");
		c.gridx=1;
		c.gridy=5;	
		add(lblCodFisc,c);
		
		JTextField tfCodFisc = new JTextField();
		tfCodFisc.setColumns(15);
		c.gridx=2;
		c.gridy=5;	
		add(tfCodFisc,c);
		
		JLabel lblNomeVacc = new JLabel("Nome Vaccino");
		c.gridx=1;
		c.gridy=6;		
		add(lblNomeVacc, c);
		
		JComboBox<String> cbbVaccini = new JComboBox<String>(vaccini);
		c.gridx=2;
		c.gridy=6;		
		add(cbbVaccini,c);
		
		JLabel lblData = new JLabel("Data Vaccino");
		c.gridx=1;
		c.gridy=7;	
		add(lblData,c);
		
		JTextField tfData = new JTextField();
		tfData.setColumns(15);
		c.gridx=2;
		c.gridy=7;	
		add(tfData,c);
		
		JLabel lblID = new JLabel("ID");
		c.gridx=1;
		c.gridy=8;		
		add(lblID,c);

		JTextField tfID = new JTextField();
		tfID.setColumns(15);
		c.gridx=2;
		c.gridy=8;	
		add(tfID,c);
		
		JLabel lblErrore = new JLabel("Nessun Errore");
		c.gridx=1;
		c.gridy=9; 
		c.gridwidth=2;
		add(lblErrore,c);
		c.gridwidth=1;


		JButton btnRegistra = new JButton("Registra");
		btnRegistra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    try {
						if(stub.codFiscTaken(tfCodFisc.getText()) || !stub.nomeCVTaken(tfNomeCV.getText())) {
							if(tfNomeCV.getText() != null || tfNomeCitt.getText() != null || tfCodFisc.getText() != null || tfData.getText() != null || tfID.getText() != null) {
								if(stub.inserisciVacc(tfNomeCitt.getText(), tfCognomeCitt.getText(), (String) tfCodFisc.getText(), tfNomeCV.getText(), new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).parse(tfData.toString()), (String) cbbVaccini.getSelectedItem(), (int) Integer.parseInt(tfID.getText()))) {
									tfCodFisc.setText("");
									tfNomeCV.setText("");
									tfData.setText("");
									cbbVaccini.setSelectedIndex(0);
									tfID.setText("");
									
									CardLayout cardLayout = (CardLayout) contentPane.getLayout();
									cardLayout.show(contentPane,"finalPage");	
								}else {
									lblErrore.setText("Errore di registrazione");
								}
					        }
						} else {
							lblErrore.setText("Hai inserito dei dati sbagliati o alcuni campi sono vuoti, riprova.");
						}	
					} catch (NumberFormatException | RemoteException | SQLException | ParseException e1) {
						e1.printStackTrace();
					}
					
			}}
		);
		btnRegistra.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegistra.setBackground(new Color(51, 153, 204));
		btnRegistra.setPreferredSize(new Dimension(150,30));
		c.gridx=2;
		c.gridy=10;		
		add(btnRegistra,c);
	}

}
