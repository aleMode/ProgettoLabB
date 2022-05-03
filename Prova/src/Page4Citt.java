import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

public class Page4Citt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page4Citt frame = new Page4Citt();
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
	public Page4Citt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{233, 100, 100, 100};
		gbl_contentPane.rowHeights = new int[]{27, 1, 14, 26, 27, 14, 43, 34, 34, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.WEST;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 0;
		gbc_btnBack.gridy = 0;
		contentPane.add(btnBack, gbc_btnBack);
		
		JLabel labelInserisciDati = new JLabel("Inserisci i dati richiesti");
		labelInserisciDati.setFont(new Font("Dialog", Font.PLAIN, 14));
		GridBagConstraints gbc_labelInserisciDati = new GridBagConstraints();
		gbc_labelInserisciDati.insets = new Insets(0, 0, 5, 5);
		gbc_labelInserisciDati.gridx = 0;
		gbc_labelInserisciDati.gridy = 2;
		contentPane.add(labelInserisciDati, gbc_labelInserisciDati);
		
		JLabel lblEvento = new JLabel("Scegli un sintomo");
		lblEvento.setFont(new Font("Dialog", Font.PLAIN, 14));
		GridBagConstraints gbc_lblEvento = new GridBagConstraints();
		gbc_lblEvento.insets = new Insets(0, 0, 5, 5);
		gbc_lblEvento.gridx = 0;
		gbc_lblEvento.gridy = 3;
		contentPane.add(lblEvento, gbc_lblEvento);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 3;
		contentPane.add(comboBox, gbc_comboBox);
		
		JList list_1 = new JList();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.insets = new Insets(0, 0, 5, 0);
		gbc_list_1.gridx = 3;
		gbc_list_1.gridy = 3;
		contentPane.add(list_1, gbc_list_1);
		
		JLabel lblIntensita = new JLabel("Intensità");
		lblIntensita.setFont(new Font("Dialog", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIntensita = new GridBagConstraints();
		gbc_lblIntensita.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntensita.gridx = 0;
		gbc_lblIntensita.gridy = 4;
		contentPane.add(lblIntensita, gbc_lblIntensita);
		
		JLabel lblIntValue = new JLabel("1");
		lblIntValue.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblIntValue = new GridBagConstraints();
		gbc_lblIntValue.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntValue.gridx = 1;
		gbc_lblIntValue.gridy = 4;
		contentPane.add(lblIntValue, gbc_lblIntValue);
		
		JButton btnUp = new JButton("+");
		GridBagConstraints gbc_btnUp = new GridBagConstraints();
		gbc_btnUp.insets = new Insets(0, 0, 5, 5);
		gbc_btnUp.gridx = 2;
		gbc_btnUp.gridy = 4;
		contentPane.add(btnUp, gbc_btnUp);
		
		JButton btnDown = new JButton("-");
		GridBagConstraints gbc_btnDown = new GridBagConstraints();
		gbc_btnDown.insets = new Insets(0, 0, 5, 0);
		gbc_btnDown.gridx = 3;
		gbc_btnDown.gridy = 4;
		contentPane.add(btnDown, gbc_btnDown);
		
		JLabel lblNote = new JLabel("Note (max 256 caratteri)");
		lblNote.setFont(new Font("Dialog", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNote = new GridBagConstraints();
		gbc_lblNote.insets = new Insets(0, 0, 5, 5);
		gbc_lblNote.gridx = 0;
		gbc_lblNote.gridy = 5;
		contentPane.add(lblNote, gbc_lblNote);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.BLACK);
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.fill = GridBagConstraints.BOTH;
		gbc_editorPane.gridheight = 4;
		gbc_editorPane.gridwidth = 3;
		gbc_editorPane.gridx = 1;
		gbc_editorPane.gridy = 5;
		contentPane.add(editorPane, gbc_editorPane);
		
		JButton btnInviaFin = new JButton("Invia sintomo finale");
		GridBagConstraints gbc_btnInviaFin = new GridBagConstraints();
		gbc_btnInviaFin.insets = new Insets(0, 0, 5, 5);
		gbc_btnInviaFin.gridx = 0;
		gbc_btnInviaFin.gridy = 6;
		contentPane.add(btnInviaFin, gbc_btnInviaFin);
		
		JButton btnInviaCont = new JButton("Invia e inserisci nuovo sintomo");
		GridBagConstraints gbc_btnInviaCont = new GridBagConstraints();
		gbc_btnInviaCont.insets = new Insets(0, 0, 5, 5);
		gbc_btnInviaCont.gridx = 0;
		gbc_btnInviaCont.gridy = 7;
		contentPane.add(btnInviaCont, gbc_btnInviaCont);
		
		JButton btnRipristina = new JButton("Ripristina");
		GridBagConstraints gbc_btnRipristina = new GridBagConstraints();
		gbc_btnRipristina.insets = new Insets(0, 0, 0, 5);
		gbc_btnRipristina.gridx = 0;
		gbc_btnRipristina.gridy = 8;
		contentPane.add(btnRipristina, gbc_btnRipristina);
	}
}
