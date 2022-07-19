package Interfaccia;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public FinalPage(JPanel cardStack) {
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JTextArea lblGrazie = new JTextArea("Grazie!");
		lblGrazie.setPreferredSize(new Dimension(150,50));
		lblGrazie.setBackground(new Color(153, 255, 255));
		lblGrazie.setFont(new Font("Calibri", Font.BOLD, 50));
		lblGrazie.setEditable(false);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=0;
		c.gridwidth = 2;
		c.weighty = 0.05;
		c.insets= new Insets(0,30,0,0);
		add(lblGrazie, c);
		
		JTextArea lblDesideraFareAltro = new JTextArea("Desidera fare altro?");
		lblDesideraFareAltro.setBackground(new Color(153, 255, 255));
		lblDesideraFareAltro.setFont(new Font("Calibri", Font.BOLD, 25));
		lblDesideraFareAltro.setEditable(false);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=1;
		c.gridwidth = 2;
		c.weighty = 0.05;
		c.insets= new Insets(0,30,0,0);
		add(lblDesideraFareAltro, c);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"startPage");

				}
			}
		);
		btnHome.setPreferredSize(new Dimension(180, 60));	
		btnHome.setBackground(new Color(51, 153, 204));
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.fill=GridBagConstraints.BELOW_BASELINE_LEADING;
		c.gridx=0;
		c.gridy=2;
		c.weighty = 0.1;
		c.weighty = 0.1;
		c.insets= new Insets(0,0,0,5);
		add(btnHome, c);
		
		JButton btnEsci = new JButton("Esci");
		btnEsci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnEsci) { 
					//funzione di uscita					
				}}
			}
		);
		btnEsci.setPreferredSize(new Dimension(180,60));
		btnEsci.setBackground(new Color(51, 153, 204));
		btnEsci.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.fill=GridBagConstraints.BELOW_BASELINE_LEADING;
		c.gridx=2;
		c.gridy=2;
		c.weighty = 0.1;
		c.insets= new Insets(0,5,0,0);
		add(btnEsci, c);
	}

}
