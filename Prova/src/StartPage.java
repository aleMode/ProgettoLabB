import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class StartPage extends JPanel {

	private JPanel contentPane;
	
	
	public StartPage(JPanel cardStack) {
		contentPane = cardStack;
		
		setBackground(new Color(153, 255, 255));
		
		JButton CittButton = new JButton("Cittadini");
		CittButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"CittPage");
			}
				
		});
		CittButton.setBackground(new Color(51, 153, 204));
		CittButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(CittButton);
		
		JButton OpSButton = new JButton("Operatore sanitario");
		OpSButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane,"OSPage");
			}
		});
		
		OpSButton.setBackground(new Color(51, 153, 204));
		OpSButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(OpSButton);

		JTextArea txtrIndica = new JTextArea();
		txtrIndica.setBackground(new Color(153, 255, 255));
		txtrIndica.setFont(new Font("Calibri", Font.BOLD, 25));
		txtrIndica.setText("Indica come vuoi operare:");
		add(txtrIndica);
		
		JTextArea txtrBenvenuto = new JTextArea();
		txtrBenvenuto.setBackground(new Color(153, 255, 255));
		txtrBenvenuto.setForeground(new Color(0, 0, 0));
		txtrBenvenuto.setFont(new Font("Calibri", Font.BOLD, 60));
		txtrBenvenuto.setText("Benvenuto!");
		add(txtrBenvenuto);
		
	}
	 @Override
	 public Dimension getPreferredSize(){
		 return (new Dimension(500, 500));
	 }
}
