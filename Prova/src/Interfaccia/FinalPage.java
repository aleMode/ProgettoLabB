package Interfaccia;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalPage extends JPanel {

	private JPanel contentPane;

	public FinalPage(JPanel cardStack) {
		contentPane = cardStack;
		
		JLabel lblGrazie = new JLabel("Grazie");
		add(lblGrazie);
		
		JLabel lblDesideraFareAltro = new JLabel("Desidera fare altro?");
		add(lblDesideraFareAltro);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"startPage");					
				}
			}
		);
		add(btnHome);
		
		JButton btnEsci = new JButton("Esci");
		btnEsci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnEsci) { 
					//funzione di uscita					
				}}
			}
		);
		add(btnEsci);
	}

}
