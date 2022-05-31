import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class RisultatiCVPage extends JFrame {

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
					VisuaProspetto frame = new VisuaProspetto();
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
	public RisultatiCVPage() {
		setTitle("PROSPETTO SINTOMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
