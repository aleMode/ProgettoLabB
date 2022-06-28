package Interfaccia;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

public class RegistraCVPage extends JPanel {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public RegistraCVPage(JPanel cardStack) {
		 
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		
		JButton btnBack = new JButton("Indietro");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"menuOS");					
				}
			}
		);
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		add(btnBack, c);
		
		JLabel lblNewLabel = new JLabel("Inserisci i dati richiesti");
		c.gridx=1;
		c.gridy=0;
		c.gridwidth=3;
		c.insets= new Insets(5,5,5,5);
		add(lblNewLabel,c);
		c.gridwidth=1;

		
		JLabel lblNomeCentro = new JLabel("Nome Centro");
		c.gridx=1;
		c.gridy=1;
		add(lblNomeCentro,c);
		
		JTextField textField = new JTextField();
		c.gridx=2;
		c.gridy=1;
		textField.setColumns(10);
		add(textField,c);
				
		JLabel lblProv = new JLabel("Provincia");
		c.gridx=1;
		c.gridy=2;
		add(lblProv, c);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		c.gridx=2;
		c.gridy=2;
		add(textField_1,c);
		
		JLabel lblComune = new JLabel("Comune");
		c.gridx=1;
		c.gridy=3;
		add(lblComune, c);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		c.gridx=2;
		c.gridy=3;
		add(textField_2,c);
		
		JLabel lblCAP = new JLabel("CAP");
		c.gridx=1;
		c.gridy=4;
		add(lblCAP, c);
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		c.gridx=2;
		c.gridy=4;
		add(textField_3,c);
		
		JLabel lblIndir = new JLabel("Indirizzo");
		c.gridx=1;
		c.gridy=5;
		add(lblIndir, c);
		
		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		c.gridx=2;
		c.gridy=5;
		add(textField_4,c);
		
		
		JLabel lblTipo = new JLabel("Tipo");
		c.gridx=1;
		c.gridy=6;
		add(lblTipo, c);
		
		JList list = new JList();
		c.gridx=2;
		c.gridy=6;
		add(list,c);
		
		JButton btnNewButton_1 = new JButton("Registra");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//funzione registra
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"finalPage");					
				}
			}
		);
		c.gridx=2;
		c.gridy=7;		
		add(btnNewButton_1,c);
		
		JLabel lblNewLabel_2 = new JLabel("Errori");
		c.gridx=1;
		c.gridy=8;
		c.gridwidth=4;
		add(lblNewLabel_2, c);
	}
}
