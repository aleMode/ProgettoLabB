package Interfaccia;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Server.CV;
import Server.ServerMainInterface;

public class RisultatiCVPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	static DefaultListModel<String> model = new DefaultListModel<>();
	static JList<String> lstCVTrovati = new JList<String>(model);
	
	static List<CV> risultatiCVnome = new ArrayList<CV>();
	static List<CV> risultatiCVcomtip = new ArrayList<CV>();
	
	public RisultatiCVPage(JPanel cardStack, ServerMainInterface stub ) {
		
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton btnBack = new JButton("Indietro");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"ricercaCV");
			}
		});
		btnBack.setBackground(new Color(255, 255, 204));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		c.gridx=0;
		c.gridy=0;
		add(btnBack, c);

		JLabel lblNewLabel = new JLabel("Centri vaccinali disponibili");
		c.gridx=1;
		c.gridy=1;		
		c.gridwidth=3;
		add(lblNewLabel);

		
		lstCVTrovati.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String nome = lstCVTrovati.getSelectedValue();
				
			}
		});
		c.gridx=1;
		c.gridy=2;
		add(lstCVTrovati, c);

		JLabel lblNewLabel_1 = new JLabel("Prospetto riassuntivo sintomi");
		c.gridx=1;
		c.gridy=3;
		c.gridwidth=3;
		add(lblNewLabel_1, c);
		c.gridwidth=1;

		JTextPane textPane = new JTextPane();
		c.gridx=1;
		c.gridy=4;	
		c.gridwidth=3;
		c.gridheight=4;
		add(textPane, c);
		
		JButton btnFine = new JButton("FINE");
		btnFine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"finalPage");
			}
		});
		c.gridx=3;
		c.gridy=5;		
		c.gridwidth=1;
		add(btnFine, c);
	}
}
