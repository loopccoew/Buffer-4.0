package Travel;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class admin_login {

	JFrame admin_login_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_login window = new admin_login();
					window.admin_login_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public admin_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		admin_login_frame = new JFrame();
		admin_login_frame.setBounds(100, 100, 450, 300);
		admin_login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		admin_login_frame.getContentPane().setLayout(null);
	}

}
