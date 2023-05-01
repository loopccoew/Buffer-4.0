package Travel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import java.awt.Font;

public class aboutplacess {

	JFrame a_pframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					aboutplacess window = new aboutplacess();
					//window.a_pframe.setVisible(true);
					//window.a_pframe.pack();
					window.a_pframe.setLocationRelativeTo(null);
					window.a_pframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public aboutplacess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		a_pframe = new JFrame();
		a_pframe.setBounds(100, 100, 855, 714);
		a_pframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		a_pframe.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setBounds(10, 0, 831, 644);
		a_pframe.getContentPane().add(textPane);
		textPane.setText("TAJ MAHAL(AGRA):\r\n"
				+ "The Taj Mahal is an ivory-white marble mausoleum on the right bank of the river Yamuna in Agra, Uttar Pradesh, India. It was commissioned in 1631 by the fifth Mughal emperor, Shah Jahan to house the tomb of his favourite wife, Mumtaz Mahal; it also houses the tomb of Shah Jahan himself.\r\n"
				+ "\r\n"
				+ "MYSORE PALACE():\r\n"
				+ "Mysore Palace, also known as Amba Vilas Palace, is a historical palace and a royal residence. It is located in Mysore, Karnataka. It used to be the official residence of the Wadiyar dynasty and the seat of the Kingdom of Mysore. The palace is in the centre of Mysore, and faces the Chamundi Hills eastward.\r\n"
				+ "\r\n"
				+ "The Gateway of India(DELHI):\r\n"
				+ "The Gateway of India is an arch-monument built in the early 20th century in the city of Mumbai, India. It was erected to commemorate the landing of King-Emperor George V, the first British monarch to visit India, in December 1911 at Strand Road near Wellington Fountain. \r\n"
				+ "\r\n"
				+ "Agra Fort(AGRA):\r\n"
				+ "The Agra Fort is a historical fort in the city of Agra and also known as Agra's Red Fort. Built by the Mughal emperor Akbar in 1565 and completed in 1573, it served as the main residence of the rulers of the Mughal Dynasty until 1638, when the capital was shifted from Agra to Delhi. \r\n"
				+ "\r\n"
				+ "Varanasi:\r\n"
				+ "The world’s oldest living city, Varanasi. Here, you can find your own flavor of spiritualism by taking a sunrise boat ride, releasing floral blessings to float upon the river, and watching the fire-filled Hindu chanting ceremonies from the steep ghats (riverfront steps).\r\n"
				+ "\r\n"
				+ "GOA:\r\n"
				+ "The state of Goa, in India, is famous for its beaches and places of worship. Tourism is its primary industry, and is generally focused on the coastal areas of Goa, with decreased tourist activity inland.\r\n"
				+ "\r\n"
				+ "GOLDEN TEMPLE():\r\n"
				+ "The Golden temple is famous for its full golden dome, it is one of the most sacred pilgrim spots for Sikhs. The Mandir is built on a 67-ft square of marble and is a two storied structure. Maharaja Ranjit Singh had the upper half of the building built with approximately 400 kg of gold leaf.");
	}
}
