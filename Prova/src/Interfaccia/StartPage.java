package Interfaccia;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import Server.ServerMainInterface;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public StartPage(JPanel cardStack, ServerMainInterface stub) {
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JButton btnOpS = new JButton("Operatore sanitario");
		btnOpS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"osLogin");
			}
		});
		btnOpS.setPreferredSize(new Dimension(150,50));
		btnOpS.setBackground(new Color(51, 153, 204));
		btnOpS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.gridx=1;
		c.gridy=2;
		c.weighty=0.2;
		c.insets= new Insets(0,5,0,0); //t,l,b,r
		add(btnOpS,c);
		
		JButton btnCitt = new JButton("Cittadini");
		btnCitt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"menuCitt");
			}
				
		});
		btnCitt.setPreferredSize(new Dimension(150,50));
		btnCitt.setBackground(new Color(51, 153, 204));
		btnCitt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c.gridx=0;
		c.gridy=2;
		c.weighty=0.2;
		c.insets= new Insets(0,0,0,5);
		add(btnCitt,c);

		JTextArea txtrBenvenuto = new JTextArea();
		txtrBenvenuto.setBackground(new Color(153, 255, 255));
		btnCitt.setPreferredSize(new Dimension(150,50));
		txtrBenvenuto.setFont(new Font("Calibri", Font.BOLD, 60));
		txtrBenvenuto.setEditable(false);
		txtrBenvenuto.setText("Benvenuto!");
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=2;
		c.weighty=0.6;
		add(txtrBenvenuto,c);
		
		JTextArea txtrIndica = new JTextArea();
		txtrIndica.setBackground(new Color(153, 255, 255));
		txtrIndica.setFont(new Font("Calibri", Font.BOLD, 25));
		txtrIndica.setEditable(false);
		txtrIndica.setText("Indica come vuoi operare:");
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=2;
		c.weighty=0.2;
		c.insets= new Insets(0,0,0,0);
		add(txtrIndica,c);
		
	}
	 @Override
	 public Dimension getPreferredSize(){
		 return (new Dimension(500, 500));
	 }
}
