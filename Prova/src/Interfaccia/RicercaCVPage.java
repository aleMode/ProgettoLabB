package Interfaccia;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class RicercaCVPage extends JPanel {

	private static final long serialVersionUID = 1L;

	public RicercaCVPage(JPanel cardStack) {
		
		JPanel contentPane = new JPanel();
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton BtnBack = new JButton("BACK");
		BtnBack.setBackground(new Color(255, 255, 204));
		BtnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		BtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuCitt");
			}
		});
		BtnBack.setPreferredSize(new Dimension(100,50));
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		add(BtnBack, c);

		
		JLabel lblNewLabel = new JLabel("Ricerca per nome:");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		c.anchor=GridBagConstraints.WEST;
		c.gridx=1;
		c.gridy=1;
		add(lblNewLabel, c);
		
		c.anchor=GridBagConstraints.CENTER;
		
		JLabel lblNewLabel_2 = new JLabel("Nome centro");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.weighty=0.1;
		c.gridx=2;
		c.gridy=1;
		add(lblNewLabel_2, c);
		
		JTextField textField = new JTextField();
		c.weighty=0.1;
		c.gridx=2;
		c.gridy=2;
		add(textField, c);
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("Cerca");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//funzione cerca
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"risultatiCV");
			}
		});
		c.weighty=0.1;
		c.gridx=2;
		c.gridy=3;
		c.gridwidth=2;
		add(btnNewButton_1,c);
		
		JLabel lblNewLabel_3 = new JLabel("Comune");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.weighty=0.1;
		c.gridx=2;
		c.gridy=4;
		add(lblNewLabel_3, c);
		
		JTextField textField_1 = new JTextField();
		c.weighty=0.1;
		c.gridx=2;
		c.gridy=5;
		add(textField_1, c);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tipologia");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.weighty=0.05;
		c.gridx=2;
		c.gridy=6;
		add(lblNewLabel_4, c);
		
		JTextField textField_2 = new JTextField();
		c.weighty=0.05;
		c.gridx=2;
		c.gridy=7;
		add(textField_2, c);
		textField_2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Ricerca per comune e tipo:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 14));
		c.anchor=GridBagConstraints.WEST;
		c.weighty=0.1;
		c.gridx=1;
		c.gridy=4;
		c.gridwidth=2;
		add(lblNewLabel_1, c);
		
		c.anchor=GridBagConstraints.CENTER;

		JButton btnNewButton_2 = new JButton("Cerca");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//funzione cerca
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"risultatiCV");
			}
		});
		c.weighty=0.2;
		c.gridx=2;
		c.gridy=8;
		c.gridwidth=2;
		add(btnNewButton_2,c);
	}
}
