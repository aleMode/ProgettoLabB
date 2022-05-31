package Interfaccia;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

public class RegistraCVPage extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public RegistraCVPage(JPanel cardStack) {
		
		contentPane = cardStack;
		
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Indietro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"menuOS");					
				}
			}
		);
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Inserisci i dati richiesti");
		lblNewLabel.setBounds(10, 55, 112, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomeCentro = new JLabel("Nome Centro");
		lblNomeCentro.setBounds(10, 90, 112, 14);
		contentPane.add(lblNomeCentro);
		
		textField = new JTextField();
		textField.setBounds(132, 87, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 115, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblCitt = new JLabel("Città");
		lblCitt.setBounds(10, 118, 112, 14);
		contentPane.add(lblCitt);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(132, 148, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblIndirizzo = new JLabel("Indirizzo");
		lblIndirizzo.setBounds(10, 151, 112, 14);
		contentPane.add(lblIndirizzo);
		
		JLabel lblNewLabel_1 = new JLabel("...");
		lblNewLabel_1.setBounds(100, 179, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 204, 112, 14);
		contentPane.add(lblTipo);
		
		JList list = new JList();
		list.setBounds(132, 203, 86, 15);
		contentPane.add(list);
		
		JButton btnNewButton_1 = new JButton("Registra");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//funzione registra
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"finalPage");					
				}
			}
		);
		btnNewButton_1.setBounds(85, 258, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Errori");
		lblNewLabel_2.setBounds(10, 317, 46, 14);
		contentPane.add(lblNewLabel_2);
	}
}
