package Interfaccia;
import java.awt.EventQueue;

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
		
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBounds(6, 6, 81, 29);
		contentPane.add(btnNewButton);

		JList list = new JList();
		list.setBounds(63, 72, 329, 60);
		contentPane.add(list);

		JLabel lblNewLabel = new JLabel("Centri vaccinali disponibili");
		lblNewLabel.setBounds(131, 44, 190, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Prospetto riassuntivo sintomi");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(134, 177, 197, 16);
		contentPane.add(lblNewLabel_1);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(60, 205, 332, 124);
		contentPane.add(textPane);
	}
}
