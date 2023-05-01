package Travel;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;

public class AboutUs {

	JFrame Aboutus_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs window = new AboutUs();
					window.Aboutus_frame.setVisible(true);
					window.Aboutus_frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutUs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Aboutus_frame = new JFrame();
		Aboutus_frame.setBounds(100, 100, 679, 496);
		Aboutus_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Aboutus_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image images = new ImageIcon(this.getClass().getResource("about.png")).getImage().getScaledInstance(581,410, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(images));
		lblNewLabel.setBounds(44, 10, 641, 441);
		Aboutus_frame.getContentPane().add(lblNewLabel);
		
//		JTextPane textPane = new JTextPane();
//		textPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		textPane.setBounds(0, 0, 651, 451);
//		Aboutus_frame.getContentPane().add(textPane);
//		textPane.setText("Who We Are?\r\nFounded in the year 2010 as Travel Planner. The Travel Planner is with its professionally "
//				+ "managed travel engine specializes mainly in providing services such as Holidays Packages , Domestic and "
//				+ "International Flight Booking, Bus Booking, Hotel Reservations , Domestic and International Tailor maid Tours , "
//				+ "Honeymoon Package, Visa. These services are delivered underneath the supervision of deft executives to retain "
//				+ "their consistency and superiority at the doorsteps of our esteemed clients.\r\n\r\nTravel Planner, is active "
//				+ "across to provide a world-class travel experience with dedication. We always aim to offer exciting experiences, "
//				+ "the best programmes, meticulously planned itineraries and all inclusive tours conducted by professional, "
//				+ "experienced, enthusiastic and seasoned tour managers.");
	}
}
