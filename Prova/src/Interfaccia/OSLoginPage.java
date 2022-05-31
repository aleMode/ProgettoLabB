package Interfaccia;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class OSLoginPage extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	
	public OSLoginPage(JPanel cardStack) {

		contentPane = cardStack;
		
		setLayout(new BorderLayout());
		JButton btnNewButton = new JButton("Indietro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"startPage");
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ID Operatore");
		lblNewLabel.setBounds(10, 70, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 109, 89, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(120, 67, 108, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 107, 97, 17);
		contentPane.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//funzione login
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuOS");
			}
		});
		btnNewButton_1.setBounds(79, 155, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
