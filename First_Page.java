package db;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.security.PublicKey;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class First_Page extends JFrame {

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
					First_Page frame = new First_Page();
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
	public First_Page() {
		setTitle("First_Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton CittButton = new JButton("Cittadini");
		CittButton.setBackground(new Color(51, 153, 204));
		CittButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CittButton.setBounds(90, 235, 180, 80);
		contentPane.add(CittButton);
		//CittButton.addActionListener(Menù_Cittadini);
		
		
		JButton OpSButton = new JButton("Operatore sanitario");
		OpSButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		OpSButton.setBackground(new Color(51, 153, 204));
		OpSButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OpSButton.setBounds(364, 235, 180, 80);
		contentPane.add(OpSButton);
		
		JTextArea txtrIndica = new JTextArea();
		txtrIndica.setBackground(new Color(153, 255, 255));
		txtrIndica.setFont(new Font("Calibri", Font.BOLD, 25));
		txtrIndica.setText("Indica come vuoi operare.");
		txtrIndica.setBounds(169, 142, 301, 26);
		contentPane.add(txtrIndica);
		
		JTextArea txtrBenvenuto = new JTextArea();
		txtrBenvenuto.setBackground(new Color(153, 255, 255));
		txtrBenvenuto.setForeground(new Color(0, 0, 0));
		txtrBenvenuto.setFont(new Font("Calibri", Font.BOLD, 60));
		txtrBenvenuto.setText("Benvenuto!");
		txtrBenvenuto.setBounds(159, 50, 296, 113);
		contentPane.add(txtrBenvenuto);
	}
}
