package Interfaccia;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class LoginEventiAvvPage extends JPanel {

	private JPanel contentPane;
	private JTextField tfUser;
	private JTextField tfPass;

	public LoginEventiAvvPage(JPanel cardStack) {
		 
		contentPane = cardStack;
		
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuCitt");
			}
		});
		add(back);
		
		JLabel labelInserisciDati = new JLabel("Inserisci i dati richiesti");
		labelInserisciDati.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(labelInserisciDati);
		
		JLabel LabelUser = new JLabel("Username");
		LabelUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(LabelUser);
		
		tfUser = new JTextField();
		tfUser.setColumns(10);
		add(tfUser);
		
		JLabel LabelPass = new JLabel("Password");
		LabelPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(LabelPass);
		
		tfPass = new JTextField();
		tfPass.setColumns(10);
		add(tfPass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//inserisci funzione login
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"eventiAvv");
			}
		});
		add(btnLogin);
	}
}
