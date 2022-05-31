package db;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

public class Menù_OpSanitario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menù_OpSanitario frame = new Menù_OpSanitario();
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
	public Menù_OpSanitario() {
		setTitle("Men\u00F9_Operatore_Sanitario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea Scritta2 = new JTextArea();
		Scritta2.setFont(new Font("Calibri", Font.BOLD, 25));
		Scritta2.setText("Sei un'operatore sanitario, cosa vuoi fare?");
		Scritta2.setLineWrap(true);
		Scritta2.setBackground(new Color(153, 255, 255));
		Scritta2.setBounds(70, 53, 441, 28);
		contentPane.add(Scritta2);
		
		JButton btnNewButton = new JButton("Indietro");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton.setBounds(10, 11, 80, 31);
		contentPane.add(btnNewButton);
		
		JButton RegCVButton = new JButton("Registrare un nuovo Centro Vaccinale");
		RegCVButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegCVButton.setBackground(new Color(51, 153, 204));
		RegCVButton.setBounds(10, 109, 300, 60);
		contentPane.add(RegCVButton);
		
		JButton RegVaccButton = new JButton("Registrare un nuovo cittadino vaccinato");
		RegVaccButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegVaccButton.setBackground(new Color(51, 153, 204));
		RegVaccButton.setBounds(10, 180, 300, 60);
		contentPane.add(RegVaccButton);
	}

}
