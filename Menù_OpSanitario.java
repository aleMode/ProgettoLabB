package db;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menù_OpSanitario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		setBounds(100, 100, 550, 500);
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
		Scritta2.setBounds(47, 99, 441, 28);
		contentPane.add(Scritta2);
		
		JButton btnNewButton = new JButton("Indietro");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton.setBounds(10, 11, 80, 31);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) { 
					First_Page frame = new First_Page();
					frame.setVisible(true);
				}}});
		JButton RegCVButton = new JButton("Registrare un nuovo Centro Vaccinale");
		RegCVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		RegCVButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegCVButton.setBackground(new Color(51, 153, 204));
		RegCVButton.setBounds(100, 201, 300, 60);
		contentPane.add(RegCVButton);
		
		JButton RegVaccButton = new JButton("Registrare un nuovo cittadino vaccinato");
		RegVaccButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegVaccButton.setBackground(new Color(51, 153, 204));
		RegVaccButton.setBounds(100, 309, 300, 60);
		contentPane.add(RegVaccButton);
		}
}
