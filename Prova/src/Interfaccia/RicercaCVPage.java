package Interfaccia;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import Server.CV;
import Server.ServerMainInterface;
import javax.swing.JLabel;

public class RicercaCVPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	public RicercaCVPage(JPanel cardStack, ServerMainInterface stub) {
		
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		 
		JButton BtnBack = new JButton("Indietro");
		BtnBack.setBackground(new Color(255, 255, 204));
		BtnBack.setFont(new Font("Calibri", Font.PLAIN, 11));
		BtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuCitt");
			}
		});
		c.gridx=0;
		c.gridy=0;
		c.weightx=1;
		add(BtnBack, c);

		
		JLabel lblRicNome = new JLabel("Ricerca per nome:");
		lblRicNome.setFont(new Font("Calibri", Font.BOLD, 14));
		c.anchor=GridBagConstraints.WEST;
		c.gridx=1;
		c.gridy=1;
		add(lblRicNome, c);
		
		c.anchor=GridBagConstraints.CENTER;
		
		JLabel lblNome = new JLabel("Nome centro");
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.weighty=0.1;
		c.gridx=2;
		c.gridy=1;
		add(lblNome, c);
		
		JTextField tfNome = new JTextField();
		c.weighty=0.1;
		c.gridx=3;
		c.gridy=1;
		add(tfNome, c);
		tfNome.setColumns(10);

		JButton btnCercaNome = new JButton("Cerca");
		btnCercaNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RisultatiCVPage.risultatiCVnome = stub.ricercaCVnome(tfNome.getText());
					RisultatiCVPage.model.removeAllElements();
					for(CV c : RisultatiCVPage.risultatiCVnome)
						RisultatiCVPage.model.addElement(c.getNome());
					
				    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				    cardLayout.show(contentPane,"risultatiCV");
				} catch (RemoteException | SQLException e1) {
					e1.printStackTrace();
				}	
			}
		});
		c.weighty=0.1;
		c.gridx=3;
		c.gridy=2;
		c.gridwidth=2;
		add(btnCercaNome,c);
		
		JLabel lblComune = new JLabel("Comune");
		lblComune.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.gridx=2;
		c.gridy=4;
		add(lblComune, c);
		
		JTextField tfComune = new JTextField();
	    c.weighty=0.1;
		c.gridx=3;
		c.gridy=4;
		add(tfComune, c);
		tfComune.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipologia");
		lblTipo.setFont(new Font("Calibri", Font.PLAIN, 14));
		c.weighty=0.05;
		c.gridx=2;
		c.gridy=6;
		add(lblTipo, c);
		
		JTextField tfTipo = new JTextField();
		c.weighty=0.05;
		c.gridx=3;
		c.gridy=6;
		add(tfTipo, c);
		tfTipo.setColumns(10);

		JLabel lblRicercaComuneTipo = new JLabel("Ricerca per comune " + "e tipo:");
		lblRicercaComuneTipo.setFont(new Font("Calibri", Font.BOLD, 14));
		c.anchor=GridBagConstraints.WEST;
		c.weighty=0.1;
		c.gridx=1;
		c.gridy=4;
		add(lblRicercaComuneTipo, c);
		
		c.anchor=GridBagConstraints.CENTER;

		JButton btnCercaComuneTipo = new JButton("Cerca");
		btnCercaComuneTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RisultatiCVPage.risultatiCVcomtip = stub.ricercaCVcomtip(tfComune.getText(), tfTipo.getText());
					RisultatiCVPage.model.removeAllElements();
					for(CV c : RisultatiCVPage.risultatiCVcomtip)
						RisultatiCVPage.model.addElement(c.getNome());
					
					CardLayout cardLayout = (CardLayout) contentPane.getLayout();
					cardLayout.show(contentPane,"risultatiCV");					
				} catch (Exception e1) {}				
			}
		});
		c.weighty=0.2;
		c.gridx=3;
		c.gridy=8;
		c.gridwidth=2;
		add(btnCercaComuneTipo,c);
	}
}
