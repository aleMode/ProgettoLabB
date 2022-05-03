import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PageRingraz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageRingraz frame = new PageRingraz();
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
	public PageRingraz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrazie = new JLabel("Grazie");
		lblGrazie.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrazie.setBounds(295, 79, 60, 17);
		contentPane.add(lblGrazie);
		
		JLabel lblDesideraFareAltro = new JLabel("Desidera fare altro?");
		lblDesideraFareAltro.setBounds(275, 108, 124, 17);
		contentPane.add(lblDesideraFareAltro);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(169, 190, 105, 27);
		contentPane.add(btnHome);
		
		JButton btnEsci = new JButton("Esci");
		btnEsci.setBounds(389, 190, 105, 27);
		contentPane.add(btnEsci);
	}

}
