import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class OSPage extends JPanel {

		private JPanel contentPane;
	
	
	public OSPage(JPanel cardStack) {

		contentPane = cardStack;
		
		setLayout(new BorderLayout());
		JButton btnNewButton = new JButton("Registra");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(260, 109, 117, 29);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(6, 6, 75, 29);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Registra");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(160, 202, 117, 29);
		add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Cosa vuoi fare?");
		lblNewLabel.setBounds(170, 37, 117, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Registrare un nuovo centro vaccinale");
		lblNewLabel_1.setBounds(105, 81, 261, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Registrare una nuova vaccinazione");
		lblNewLabel_2.setBounds(105, 174, 261, 16);
		add(lblNewLabel_2);
	}
}
