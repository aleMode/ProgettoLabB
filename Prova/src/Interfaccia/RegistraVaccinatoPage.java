package Interfaccia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class RegistraVaccinatoPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistraVaccinatoPage frame = new RegistraVaccinatoPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistraVaccinatoPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Inserisci i dati richiesti");
		lblNewLabel.setBounds(10, 45, 131, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome CV");
		lblNewLabel_1.setBounds(10, 84, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JList list = new JList();
		list.setBounds(103, 83, 103, 14);
		contentPane.add(list);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome Cittadino");
		lblNewLabel_1_1.setBounds(10, 109, 89, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(120, 106, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Codice Fiscale");
		lblNewLabel_1_1_1.setBounds(10, 137, 89, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 134, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("...");
		lblNewLabel_2.setBounds(84, 204, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nome Vaccino");
		lblNewLabel_1_2.setBounds(10, 229, 68, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JList list_1 = new JList();
		list_1.setBounds(103, 229, 103, 14);
		contentPane.add(list_1);
		
		JLabel lblNewLabel_3 = new JLabel("Data");
		lblNewLabel_3.setBounds(10, 168, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(103, 165, 46, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(159, 165, 46, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(215, 165, 46, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("ID");
		lblNewLabel_1_2_1.setBounds(10, 254, 68, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("165156423");
		lblNewLabel_1_2_2.setBounds(103, 254, 68, 14);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("Errori");
		lblNewLabel_4.setBounds(10, 336, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Registra");
		btnNewButton_1.setBounds(82, 289, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
