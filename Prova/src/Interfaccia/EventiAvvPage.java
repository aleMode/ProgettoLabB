package Interfaccia;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

public class EventiAvvPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public EventiAvvPage(JPanel cardStack) {
		
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
		
		JLabel labelInserisciDati = new JLabel();
		labelInserisciDati.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelInserisciDati.setBackground(new Color(51, 153, 204));
		labelInserisciDati.setText("Inserisci i dati richiesti:");
		c.gridx=1;
		c.gridy=1;
		c.gridwidth = 2;
		c.weighty = 0.1;
		add(labelInserisciDati, c);
		c.gridwidth = 1;
		add(btnBack);
		
		JLabel lblEvento = new JLabel();
		lblEvento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEvento.setBackground(new Color(51, 153, 204));
		lblEvento.setText("Scegli un sintomo");
		c.gridx=1;
		c.gridy=2;
		add(lblEvento,c);
		
		JComboBox comboBox = new JComboBox();
		c.gridx=2;
		c.gridy=2;
		add(comboBox, c);
		
        /*JList list_1 = new JList();
		c.gridx=1;
		c.gridy=2;
		add(list_1, c);*/
		
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
		c.gridx=3;
		c.gridy=3;
		add(btnUp, c);
		
		JButton btnDown = new JButton("-");
		btnDown.setBackground(new Color(51, 153, 204));
		btnDown.setFont(new Font("Tahoma", Font.PLAIN, 12));
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
		
		JTextPane Pane = new JTextPane();
		c.gridx=1;
		c.gridy=5;
		c.gridwidth = 3;
		c.gridheight = 3;
		Pane.setBackground(Color.LIGHT_GRAY);
		c.fill = GridBagConstraints.BOTH;
		add(Pane, c);
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		
		JButton btnInviaFin = new JButton("Invia sintomo finale");
		btnInviaFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//funzione di invio 
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"finalPage");
			}
		});
		btnInviaFin.setBackground(new Color(51, 153, 204));
		btnInviaFin.setPreferredSize(new Dimension(150,50));
		c.gridx=4;
		c.gridy=5;
		c.insets = new Insets(0,5,0,5);
		add(btnInviaFin, c);
		
		JButton btnInviaCont = new JButton("Invia e inserisci nuovo sintomo");
		btnInviaCont.setBackground(new Color(51, 153, 204));
		btnInviaCont.setPreferredSize(new Dimension(150,50));
		c.gridx=4;
		c.gridy=6;
		c.insets = new Insets(0,5,0,5);
		add(btnInviaCont, c);
		
		JButton btnRipristina = new JButton("Ripristina");
		btnRipristina.setBackground(new Color(51, 153, 204));
		btnRipristina.setPreferredSize(new Dimension(150,50));
		c.gridx=4;
		c.gridy=7;
		c.insets = new Insets(0,5,0,5);
		add(btnRipristina, c);
	}
}
