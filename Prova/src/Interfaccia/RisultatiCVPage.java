package Interfaccia;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class RisultatiCVPage extends JPanel {

	
	private JPanel contentPane;

	public RisultatiCVPage(JPanel cardStack) {
		
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton btnBack = new JButton("BACK");
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
		c.weightx=1;
		c.insets= new Insets(0,0,0,0);
		add(btnBack, c);

		JLabel lblNewLabel = new JLabel("Centri vaccinali disponibili");
		c.gridx=1;
		c.gridy=1;		
		c.gridwidth=3;
		add(lblNewLabel);

		JList list = new JList();
		c.gridx=1;
		c.gridy=2;			
		c.gridwidth=3;
		add(list, c);

		JLabel lblNewLabel_1 = new JLabel("Prospetto riassuntivo sintomi");
		c.gridx=1;
		c.gridy=3;
		c.gridwidth=3;
		add(lblNewLabel_1, c);
		c.gridwidth=1;

		JTextPane textPane = new JTextPane();
		c.gridx=1;
		c.gridy=4;	
		c.gridwidth=3;
		c.gridheight=4;
		add(textPane, c);
		
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
