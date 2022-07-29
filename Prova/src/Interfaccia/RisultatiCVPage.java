package Interfaccia;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Server.CV;
import Server.ServerMainInterface;

public class RisultatiCVPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	static DefaultListModel<String> model = new DefaultListModel<>();
	static JList<String> lstCVTrovati = new JList<String>(model);
	
	static boolean usedName;
	static HashMap<String, CV> risultatiCVnome = new HashMap<String, CV>();
	static HashMap<String, CV> risultatiCVcomtip = new HashMap<String, CV>();
	
	public RisultatiCVPage(JPanel cardStack, ServerMainInterface stub ) {
		
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton btnBack = new JButton("Indietro");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"ricercaCV");
			}
		});
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		c.gridx=0;
		c.gridy=0;
		add(btnBack, c);

		JLabel lblNewLabel = new JLabel("Centri vaccinali disponibili");
		c.gridx=1;
		c.gridy=1;		
		c.gridwidth=3;
		add(lblNewLabel);

		JLabel lblProspetto = new JLabel("Prospetto riassuntivo sintomi");
		c.gridx=1;
		c.gridy=3;
		c.gridwidth=3;
		add(lblProspetto, c);
		c.gridwidth=1;

		JTextPane tpProspetto = new JTextPane();
		c.gridx=1;
		c.gridy=4;	
		c.gridwidth=3;
		c.gridheight=4;
		add(tpProspetto, c);
		
		lstCVTrovati.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String nome = lstCVTrovati.getSelectedValue();
				String text = "";
				
				if(usedName == true) {
					text += nome + " si trova in: " + risultatiCVnome.get(nome).getRegione() + ", " + risultatiCVnome.get(nome).getProvincia() + ", " + risultatiCVnome.get(nome).getComune() + ", " + risultatiCVnome.get(nome).getCap() + ", " + risultatiCVnome.get(nome).getIndirizzo() + ", è di tipo " + risultatiCVnome.get(nome).getTipo() + "\n" ;
				}else {
					text += nome + " si trova in: " + risultatiCVcomtip.get(nome).getRegione() + ", " + risultatiCVcomtip.get(nome).getProvincia() + ", " + risultatiCVcomtip.get(nome).getComune() + ", " + risultatiCVcomtip.get(nome).getCap() + ", " + risultatiCVcomtip.get(nome).getIndirizzo() + ", è di tipo " + risultatiCVcomtip.get(nome).getTipo() + "\n";  
				}
						
				for(String s : EventiAvvPage.sintomi) {
					int[] val = new int[2];
					try {
						val = stub.getNumeroSegnalazioni(nome, s);
					} catch (Exception e1) {}
					
					float media = (float) val[0] / val[1];
					text += "Sono state fatte " + val[1] + " segnalazioni per l'evento: " + s + " con media " + media + "\n";					
				}
				
				tpProspetto.setText(text);
			}
		});
		c.gridx=1;
		c.gridy=2;
		add(lstCVTrovati, c);
		
		JButton btnFine = new JButton("FINE");
		btnFine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"finalPage");
			}
		});
		c.gridx=3;
		c.gridy=5;		
		c.gridwidth=1;
		add(btnFine, c);
	}
}
