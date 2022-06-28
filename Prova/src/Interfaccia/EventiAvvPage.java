package Interfaccia;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class EventiAvvPage extends JPanel {

	private JPanel contentPane;

	public EventiAvvPage(JPanel cardStack) {
		contentPane = cardStack;
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"loginEventiAvv");
			}
		});
		add(btnBack);
		
		JLabel labelInserisciDati = new JLabel("Inserisci i dati richiesti");
		labelInserisciDati.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(labelInserisciDati);
		
		JLabel lblEvento = new JLabel("Scegli un sintomo");
		lblEvento.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(lblEvento);
		
		JComboBox comboBox = new JComboBox();
		add(comboBox);
		
		JList list_1 = new JList();
		add(list_1);
		
		JLabel lblIntensita = new JLabel("Intensità");
		lblIntensita.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(lblIntensita);
		
		JLabel lblIntValue = new JLabel("1");
		lblIntValue.setFont(new Font("Dialog", Font.PLAIN, 12));
		add(lblIntValue);
		
		JButton btnUp = new JButton("+");
		add(btnUp);
		
		JButton btnDown = new JButton("-");
		add(btnDown);
		
		JLabel lblNote = new JLabel("Note (max 256 caratteri)");
		lblNote.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(lblNote);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.LIGHT_GRAY);
		add(editorPane);
		
		JButton btnInviaFin = new JButton("Invia sintomo finale");
		btnInviaFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//funzione di invio 
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"finalPage");
			}
		});
		add(btnInviaFin);
		
		JButton btnInviaCont = new JButton("Invia e inserisci nuovo sintomo");
		add(btnInviaCont);
		
		JButton btnRipristina = new JButton("Ripristina");
		add(btnRipristina);
	}
}
