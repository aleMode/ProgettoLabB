import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

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
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{100, 100, 100, 0};
		gbl_contentPane.rowHeights = new int[]{79, 17, 17, 65, 27, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblGrazie = new JLabel("Grazie");
		lblGrazie.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblGrazie = new GridBagConstraints();
		gbc_lblGrazie.insets = new Insets(0, 0, 5, 5);
		gbc_lblGrazie.gridx = 1;
		gbc_lblGrazie.gridy = 1;
		contentPane.add(lblGrazie, gbc_lblGrazie);
		
		JLabel lblDesideraFareAltro = new JLabel("Desidera fare altro?");
		GridBagConstraints gbc_lblDesideraFareAltro = new GridBagConstraints();
		gbc_lblDesideraFareAltro.insets = new Insets(0, 0, 5, 5);
		gbc_lblDesideraFareAltro.gridx = 1;
		gbc_lblDesideraFareAltro.gridy = 2;
		contentPane.add(lblDesideraFareAltro, gbc_lblDesideraFareAltro);
		
		JButton btnHome = new JButton("Home");
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnHome.gridx = 0;
		gbc_btnHome.gridy = 4;
		contentPane.add(btnHome, gbc_btnHome);
		
		JButton btnEsci = new JButton("Esci");
		GridBagConstraints gbc_btnEsci = new GridBagConstraints();
		gbc_btnEsci.gridx = 2;
		gbc_btnEsci.gridy = 4;
		contentPane.add(btnEsci, gbc_btnEsci);
	}

}
