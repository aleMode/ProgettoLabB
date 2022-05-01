import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class Page3Citt extends JFrame {

	private JPanel contentPane;
	private JTextField tfUser;
	private JTextField tfPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page3Citt frame = new Page3Citt();
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
	public Page3Citt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton back = new JButton("Back");
		back.setBounds(10, 11, 70, 23);
		contentPane.add(back);
		
		JLabel labelInserisciDati = new JLabel("Inserisci i dati richiesti");
		labelInserisciDati.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelInserisciDati.setBounds(10, 62, 169, 14);
		contentPane.add(labelInserisciDati);
		
		JLabel LabelUser = new JLabel("Username");
		LabelUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelUser.setBounds(10, 114, 70, 14);
		contentPane.add(LabelUser);
		
		JLabel LabelPass = new JLabel("Password");
		LabelPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelPass.setBounds(10, 152, 65, 14);
		contentPane.add(LabelPass);
		
		tfUser = new JTextField();
		tfUser.setBounds(150, 113, 148, 20);
		contentPane.add(tfUser);
		tfUser.setColumns(10);
		
		tfPass = new JTextField();
		tfPass.setColumns(10);
		tfPass.setBounds(150, 151, 148, 20);
		contentPane.add(tfPass);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setBounds(12, 269, 622, 65);
		contentPane.add(lblMessage);
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(10, 219, 89, 23);
		contentPane.add(btnLogin);
	}
}
