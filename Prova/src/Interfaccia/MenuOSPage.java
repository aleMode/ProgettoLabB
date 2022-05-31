package Interfaccia;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuOSPage extends JPanel {

	private JPanel contentPane;

	public MenuOSPage(JPanel cardStack) {
		contentPane = cardStack;
		
		contentPane.setBackground(new Color(153, 255, 255));

		JTextArea Scritta2 = new JTextArea();
		Scritta2.setFont(new Font("Calibri", Font.BOLD, 25));
		Scritta2.setText("Sei un'operatore sanitario, cosa vuoi fare?");
		Scritta2.setLineWrap(true);
		Scritta2.setBackground(new Color(153, 255, 255));
		Scritta2.setBounds(47, 99, 441, 28);
		add(Scritta2);
		
		JButton btnNewButton = new JButton("Indietro");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton.setBounds(10, 11, 80, 31);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"osLogin");					
				}
			}
		);
		add(btnNewButton);
		
		JButton RegCVButton = new JButton("Registrare un nuovo Centro Vaccinale");
		RegCVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"registraCV");
			}
		});
		RegCVButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegCVButton.setBackground(new Color(51, 153, 204));
		RegCVButton.setBounds(100, 201, 300, 60);
		add(RegCVButton);
		
		JButton RegVaccButton = new JButton("Registrare un nuovo cittadino vaccinato");
		RegVaccButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"registraVacc");
			}
		});
		RegVaccButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegVaccButton.setBackground(new Color(51, 153, 204));
		RegVaccButton.setBounds(100, 309, 300, 60);
		add(RegVaccButton);
	}
}
