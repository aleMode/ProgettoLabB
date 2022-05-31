package Interfaccia;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IscrizioneCittCVPage extends JPanel {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	public IscrizioneCittCVPage(JPanel cardStack) {
		contentPane = cardStack;
		
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBounds(6, 6, 85, 29);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("INSERIRE I DATI RICHIESTI:");
		lblNewLabel.setBounds(16, 47, 167, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NOME");
		lblNewLabel_1.setBounds(30, 75, 61, 16);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("COGNOME");
		lblNewLabel_2.setBounds(296, 75, 74, 16);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("CODICE \nFISCALE");
		lblNewLabel_3.setBounds(30, 130, 117, 16);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("EMAIL");
		lblNewLabel_4.setBounds(296, 130, 61, 16);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("IDVACCINO");
		lblNewLabel_5.setBounds(30, 187, 79, 16);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("USERNAME");
		lblNewLabel_6.setBounds(296, 187, 74, 16);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("PASSWORD");
		lblNewLabel_7.setBounds(30, 243, 78, 16);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("RIPETI PASSWORD");
		lblNewLabel_8.setBounds(30, 294, 147, 16);
		contentPane.add(lblNewLabel_8);

		JButton btnNewButton_1 = new JButton("REGISTRA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(346, 391, 117, 41);
		contentPane.add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(28, 92, 224, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(296, 92, 224, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(30, 147, 224, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(30, 205, 224, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(296, 147, 224, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(296, 205, 224, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(30, 260, 224, 26);
		contentPane.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(30, 310, 222, 26);
		contentPane.add(passwordField_1);

		JButton btnNewButton_2 = new JButton("RIPRISTINA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(60, 391, 117, 41);
		contentPane.add(btnNewButton_2);

	}
}
