package Travel;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help {

	JFrame Help_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help window = new Help();
					window.Help_frame.setVisible(true);
					window.Help_frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Help() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Help_frame = new JFrame();
		Help_frame.setBounds(100, 100, 1251, 572);
		Help_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Help_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img=new ImageIcon(this.getClass().getResource("Screenshot 2023-04-27 170203.png"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(-128, 10, 1369, 525);
		Help_frame.getContentPane().add(lblNewLabel);
	}
}
