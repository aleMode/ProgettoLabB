package Interfaccia;
import java.awt.BorderLayout;
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
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{100, 200, 0};
		gbl_contentPane.rowHeights = new int[]{23, 14, 37, 20, 20, 48, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton back = new JButton("Back");
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.anchor = GridBagConstraints.WEST;
		gbc_back.insets = new Insets(0, 0, 5, 5);
		gbc_back.gridx = 0;
		gbc_back.gridy = 0;
		contentPane.add(back, gbc_back);
		
		JLabel labelInserisciDati = new JLabel("Inserisci i dati richiesti");
		labelInserisciDati.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_labelInserisciDati = new GridBagConstraints();
		gbc_labelInserisciDati.anchor = GridBagConstraints.WEST;
		gbc_labelInserisciDati.insets = new Insets(0, 0, 5, 5);
		gbc_labelInserisciDati.gridx = 0;
		gbc_labelInserisciDati.gridy = 1;
		contentPane.add(labelInserisciDati, gbc_labelInserisciDati);
		
		JLabel LabelUser = new JLabel("Username");
		LabelUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_LabelUser = new GridBagConstraints();
		gbc_LabelUser.anchor = GridBagConstraints.WEST;
		gbc_LabelUser.insets = new Insets(0, 0, 5, 5);
		gbc_LabelUser.gridx = 0;
		gbc_LabelUser.gridy = 3;
		contentPane.add(LabelUser, gbc_LabelUser);
		
		tfUser = new JTextField();
		tfUser.setColumns(10);
		GridBagConstraints gbc_tfUser = new GridBagConstraints();
		gbc_tfUser.insets = new Insets(0, 0, 5, 0);
		gbc_tfUser.gridx = 1;
		gbc_tfUser.gridy = 3;
		contentPane.add(tfUser, gbc_tfUser);
		
		JLabel LabelPass = new JLabel("Password");
		LabelPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_LabelPass = new GridBagConstraints();
		gbc_LabelPass.anchor = GridBagConstraints.WEST;
		gbc_LabelPass.insets = new Insets(0, 0, 5, 5);
		gbc_LabelPass.gridx = 0;
		gbc_LabelPass.gridy = 4;
		contentPane.add(LabelPass, gbc_LabelPass);
		
		tfPass = new JTextField();
		tfPass.setColumns(10);
		GridBagConstraints gbc_tfPass = new GridBagConstraints();
		gbc_tfPass.insets = new Insets(0, 0, 5, 0);
		gbc_tfPass.gridx = 1;
		gbc_tfPass.gridy = 4;
		contentPane.add(tfPass, gbc_tfPass);
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.WEST;
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridx = 0;
		gbc_btnLogin.gridy = 6;
		contentPane.add(btnLogin, gbc_btnLogin);
	}
}
