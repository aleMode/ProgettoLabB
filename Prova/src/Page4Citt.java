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

public class Page4Citt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(12, 12, 67, 27);
		contentPane.add(btnBack);
		
		JLabel labelInserisciDati = new JLabel("Inserisci i dati richiesti");
		labelInserisciDati.setFont(new Font("Dialog", Font.PLAIN, 14));
		labelInserisciDati.setBounds(12, 67, 169, 14);
		contentPane.add(labelInserisciDati);
		
		JLabel lblEvento = new JLabel("Scegli un sintomo");
		lblEvento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEvento.setBounds(12, 103, 169, 14);
		contentPane.add(lblEvento);
		
		JLabel lblIntensita = new JLabel("Intensità");
		lblIntensita.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblIntensita.setBounds(12, 142, 169, 14);
		contentPane.add(lblIntensita);
		
		JLabel lblNote = new JLabel("Note (max 256 caratteri)");
		lblNote.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNote.setBounds(12, 185, 169, 14);
		contentPane.add(lblNote);
		
		JList list = new JList();
		list.setBounds(325, 65, 1, 1);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(266, 116, 1, 1);
		contentPane.add(list_1);
		
		JLabel lblIntValue = new JLabel("1");
		lblIntValue.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblIntValue.setBounds(225, 141, 20, 17);
		contentPane.add(lblIntValue);
		
		JButton btnUp = new JButton("+");
		btnUp.setBounds(235, 136, 46, 27);
		contentPane.add(btnUp);
		
		JButton btnDown = new JButton("-");
		btnDown.setBounds(293, 136, 46, 27);
		contentPane.add(btnDown);
		
		textField = new JTextField();
		textField.setBounds(12, 211, 314, 147);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnInviaCont = new JButton("Invia e inserisci nuovo sintomo");
		btnInviaCont.setBounds(358, 267, 254, 34);
		contentPane.add(btnInviaCont);
		
		JButton btnInviaFin = new JButton("Invia sintomo finale");
		btnInviaFin.setBounds(358, 312, 254, 34);
		contentPane.add(btnInviaFin);
		
		JButton btnRipristina = new JButton("Ripristina");
		btnRipristina.setBounds(358, 221, 254, 34);
		contentPane.add(btnRipristina);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(223, 97, 204, 26);
		contentPane.add(comboBox);
	}
}
