package Interfaccia;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import GUI.GUI;
import Server.ServerMainInterface;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Dimension;

public class EventiAvvPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static String nomeCV = "";
	private String[] sintomi = {"Mal di testa","Febbre","Dolori muscolari e articolari", "Linfoadenopatia", "Tachicardia", "Crisi ipertensiva"};

	public EventiAvvPage(JPanel cardStack, ServerMainInterface stub) {
		
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
				cardLayout.show(contentPane,"loginEventiAvv");
			}
		});
		c.gridx=0;
		c.gridy=0;
		add(btnBack, c);
		
		JLabel lblInserisciDati = new JLabel();
		lblInserisciDati.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInserisciDati.setBackground(new Color(51, 153, 204));
		lblInserisciDati.setText("Inserisci i dati richiesti:");
		c.gridx=1;
		c.gridy=1;
		c.gridwidth = 2;
		c.weighty = 0.1;
		add(lblInserisciDati, c);
		c.gridwidth = 1;
		
		JLabel lblEvento = new JLabel();
		lblEvento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEvento.setBackground(new Color(51, 153, 204));
		lblEvento.setText("Scegli un sintomo");
		c.gridx=1;
		c.gridy=2;
		add(lblEvento,c);
		
		JComboBox<String> cbbSintomi = new JComboBox<String>(sintomi);
		c.gridx=2;
		c.gridy=2;
		add(cbbSintomi, c);
		
		JLabel lblIntensita = new JLabel();
		lblIntensita.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIntensita.setBackground(new Color(51, 153, 204));
		lblIntensita.setText("Intensità:");
		c.gridx=1;
		c.gridy=3;
		add(lblIntensita,c);
		
		JLabel lblIntValue = new JLabel();
		lblIntValue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIntensita.setBackground(new Color(51, 153, 204));
		lblIntValue.setText("1");
		c.gridx=2;
		c.gridy=3;
		add(lblIntValue, c);

		JButton btnUp = new JButton("+");
		btnUp.setBackground(new Color(51, 153, 204));
		btnUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer num = Integer.parseInt(lblIntValue.getText());
				if(num < 5) num++;
				lblIntValue.setText(num.toString());
			}
		});
		c.gridx=3;
		c.gridy=3;
		add(btnUp, c);
		
		JButton btnDown = new JButton("-");
		btnDown.setBackground(new Color(51, 153, 204));
		btnDown.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer num = Integer.parseInt(lblIntValue.getText());
				if(num > 1) num--;
				lblIntValue.setText(num.toString());
			}
		});
		c.gridx=4;
		c.gridy=3;
		add(btnDown, c);
		
		JLabel lblNote = new JLabel();
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNote.setBackground(new Color(51, 153, 204));
		lblNote.setText("Note (max 256 caratteri)");
		c.gridx=1;
		c.gridy=4;
		add(lblNote, c);
		
		JLabel lblError = new JLabel();
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNote.setBackground(new Color(51, 153, 204));
		lblError.setText("Nessun errore");
		c.gridx=1;
		c.gridy=5;
		add(lblError, c);
		
		JTextPane pnlNote = new JTextPane();
		c.gridx=1;
		c.gridy=6;
		c.gridwidth = 3;
		c.gridheight = 3;
		pnlNote.setBackground(Color.LIGHT_GRAY);
		c.fill = GridBagConstraints.BOTH;
		add(pnlNote, c);
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		
		JButton btnInviaFin = new JButton("Invia sintomo finale");
		btnInviaFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pnlNote.getText().length()<=256) {
					try {
						if(stub.inserisciEA(nomeCV, (String) cbbSintomi.getSelectedItem(), (int) Integer.parseInt(lblIntValue.getText()), lblNote.getText(), (int) stub.getIDSegnalazione())) {
							cbbSintomi.setSelectedIndex(0);
							lblIntValue.setText("0");
							pnlNote.setText("");
							lblError.setText("Nessun errore");
							
							CardLayout cardLayout = (CardLayout) contentPane.getLayout();
							cardLayout.show(contentPane,"finalPage");
						}
							
					} catch (NumberFormatException | RemoteException | SQLException e1) {}	
				}else {
					lblError.setText("Troppi caratteri: " + pnlNote.getText().length());
				}			
				
			}
		});
		btnInviaFin.setBackground(new Color(51, 153, 204));
		btnInviaFin.setPreferredSize(new Dimension(150,50));
		c.gridx=4;
		c.gridy=6;
		c.insets = new Insets(0,5,0,5);
		add(btnInviaFin, c);
		
		JButton btnInviaCont = new JButton("Invia e inserisci nuovo sintomo");
		btnInviaCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pnlNote.getText().length()<=256) {
					try {
						stub.inserisciEA(nomeCV, (String) cbbSintomi.getSelectedItem(), (int) Integer.parseInt(lblIntValue.getText()), lblNote.getText(), (int) stub.getIDSegnalazione());
					} catch (NumberFormatException | RemoteException | SQLException e1) {}	
					cbbSintomi.setSelectedIndex(0);
					lblIntValue.setText("0");
					pnlNote.setText("");
					lblError.setText("Nessun errore");	
				}else {
					lblError.setText("Troppi caratteri: " + pnlNote.getText().length());
				}			
			}
		});
		btnInviaCont.setBackground(new Color(51, 153, 204));
		btnInviaCont.setPreferredSize(new Dimension(150,50));
		c.gridx=4;
		c.gridy=7;
		c.insets = new Insets(0,5,0,5);
		add(btnInviaCont, c);
		
		JButton btnRipristina = new JButton("Ripristina");
		btnRipristina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbbSintomi.setSelectedIndex(0);
				lblIntValue.setText("0");
				pnlNote.setText("");
				lblError.setText("Nessun errore");
			}
		});
		btnRipristina.setBackground(new Color(51, 153, 204));
		btnRipristina.setPreferredSize(new Dimension(150,50));
		c.gridx=4;
		c.gridy=8;
		c.insets = new Insets(0,5,0,5);
		add(btnRipristina, c);
					
	}
}
