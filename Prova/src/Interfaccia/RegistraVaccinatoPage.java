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
		
		JLabel lblNewLabel = new JLabel("Inserisci i dati richiesti:");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 16));
		c.gridx=1;
		c.gridy=1;
		c.gridwidth=3;
		add(lblNewLabel,c);
		c.gridwidth=1;

		JLabel lblNewLabel_1 = new JLabel("Nome CV");
		c.gridx=1;
		c.gridy=2;
		add(lblNewLabel_1, c);
		
		JTextField textField1 = new JTextField();
		textField1.setColumns(15);
		c.gridx=2;
		c.gridy=2;		
		add(textField1,c);		
		
		JLabel lblNewLabel_2 = new JLabel("Nome Cittadino");
		c.gridx=1;
		c.gridy=3;		
		add(lblNewLabel_2,c);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(15);
		c.gridx=2;
		c.gridy=3;	
		add(textField_2,c);
		
		JLabel lblNewLabel_3 = new JLabel("Codice Fiscale");
		c.gridx=1;
		c.gridy=4;	
		add(lblNewLabel_3,c);
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(15);
		c.gridx=2;
		c.gridy=4;	
		add(textField_3,c);
		
		JLabel lblNewLabel_4 = new JLabel("Nome Vaccino");
		c.gridx=1;
		c.gridy=5;		
		add(lblNewLabel_4, c);
		
		JComboBox<String> cbbVaccini = new JComboBox<String>(vaccini);
		c.gridx=2;
		c.gridy=5;		
		add(cbbVaccini,c);
		
		JLabel lblNewLabel_5 = new JLabel("Data Vaccino");
		c.gridx=1;
		c.gridy=6;	
		add(lblNewLabel_5,c);
		
		JTextField textField_5 = new JTextField();
		textField_5.setColumns(15);
		c.gridx=2;
		c.gridy=6;	
		add(textField_5,c);
		
		JLabel lblNewLabel_6 = new JLabel("ID");
		c.gridx=1;
		c.gridy=7;		
		add(lblNewLabel_6,c);

		JTextField textField_7 = new JTextField();
		textField_7.setColumns(15);
		c.gridx=2;
		c.gridy=7;	
		add(textField_7,c);
		
		JLabel lblNewLabel_8 = new JLabel("");
		c.gridx=1;
		c.gridy=9; 
		c.gridwidth=3;
		c.gridwidth=1;
		add(lblNewLabel_8,c);
		

		JButton btnReg = new JButton("Registra");
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    try {
						if(stub.codFiscTaken(textField_3.getText()) || !stub.nomeCVTaken(textField1.getText())) {
							if(textField1.getText() != null || textField_2.getText() != null || textField_3.getText() != null || textField_5.getText() != null || textField_7.getText() != null) {
							stub.inserisciVacc((String) textField_3.getText(), textField1.getText(), new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).parse(textField_5.toString()), (String) cbbVaccini.getSelectedItem(), (int) Integer.parseInt(textField_7.getText()));
							CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					        cardLayout.show(contentPane,"finalPage");	
					        }
						} else {
							lblNewLabel_8.setText("Hai inserito dei dati sbagliati o alcuni campi sono vuoti, riprova.");
						}	
					} catch (NumberFormatException | RemoteException | SQLException | ParseException e1) {
						e1.printStackTrace();
					}
					
			}}
		);
		btnReg.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReg.setBackground(new Color(51, 153, 204));
		btnReg.setPreferredSize(new Dimension(150,30));
		c.gridx=2;
		c.gridy=8;		
		add(btnReg,c);
	}

}
