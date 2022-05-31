package Interfaccia;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class RicercaCVPage extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public RicercaCVPage(JPanel cardStack) {
		
		contentPane = new JPanel();
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuCitt");
			}
		});
		btnNewButton.setBounds(6, 6, 84, 19);
		add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(115, 86, 130, 26);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(380, 86, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(380, 124, 130, 26);
		add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel = new JLabel("Ricerca per nome");
		lblNewLabel.setBounds(32, 49, 130, 16);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Ricerca per comune e tipo");
		lblNewLabel_1.setBounds(318, 41, 179, 33);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nome centro");
		lblNewLabel_2.setToolTipText("kmkp\n");
		lblNewLabel_2.setBounds(32, 91, 84, 16);
		add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Comune");
		lblNewLabel_3.setBounds(318, 91, 58, 16);
		add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Tipologia");
		lblNewLabel_4.setBounds(318, 129, 67, 16);
		add(lblNewLabel_4);

		JButton btnNewButton_1 = new JButton("Cerca");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//funzione cerca
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"risultatiCV");
			}
		});
		btnNewButton_1.setBounds(73, 135, 117, 29);
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cerca");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//funzione cerca
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"risultatiCV");
			}
		});
		btnNewButton_2.setBounds(361, 172, 117, 29);
		add(btnNewButton_2);
	}
}
