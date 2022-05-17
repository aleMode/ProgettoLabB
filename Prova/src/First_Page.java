import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class First_Page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static First_Page frame = new First_Page();
	
	 //Launch the application.
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public First_Page() {
		setTitle("First_Page");
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton CittButton = new JButton("Cittadini");
		CittButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton CittButton = (JButton)e.getSource();
				if (e.getSource() == CittButton) { 
					frame.setVisible(false);
					Menu_Cittadini framem = new Menu_Cittadini();
					framem.setVisible(true);
					
				}}

		});
		CittButton.setBackground(new Color(51, 153, 204));
		CittButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton OpSButton = new JButton("Operatore sanitario");
		OpSButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == OpSButton) { 
				    frame.setVisible(false);
					Menu_OpSanitario frames = new Menu_OpSanitario();
					frames.setVisible(true);
			}}
		});
		
		OpSButton.setBackground(new Color(51, 153, 204));
		OpSButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JTextArea txtrIndica = new JTextArea();
		txtrIndica.setBackground(new Color(153, 255, 255));
		txtrIndica.setFont(new Font("Calibri", Font.BOLD, 25));
		txtrIndica.setText("Indica come vuoi operare:");
		
		JTextArea txtrBenvenuto = new JTextArea();
		txtrBenvenuto.setBackground(new Color(153, 255, 255));
		txtrBenvenuto.setForeground(new Color(0, 0, 0));
		txtrBenvenuto.setFont(new Font("Calibri", Font.BOLD, 60));
		txtrBenvenuto.setText("Benvenuto!");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(105)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(txtrIndica, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtrBenvenuto)
							.addGap(16)))
					.addGap(107))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(54)
					.addComponent(CittButton, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addGap(45)
					.addComponent(OpSButton, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addGap(65))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(63)
							.addComponent(txtrIndica, GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
							.addGap(24))
						.addComponent(txtrBenvenuto, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(CittButton, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
						.addComponent(OpSButton, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
					.addGap(33))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
