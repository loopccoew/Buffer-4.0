package Travel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.border.CompoundBorder;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class main {

	private JFrame frame;
	private JTextField txtSearchbookgo;
	private JTextField txtSsa;
	private JTextField txtDestination;
	private JTextField txtTrip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 975, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Train");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Train1 t=new Train1();
				//txtuser.setText("");
				t.Train1_frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		ImageIcon train = new ImageIcon(this.getClass().getResource("train.png"));
		btnNewButton.setIcon(train);
		btnNewButton.setBounds(141, 11, 129, 55); 
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buses");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bus1 b=new Bus1();
				//txtuser.setText("");
				b.Bus1_frame.setVisible(true);
			}
		});
		ImageIcon buses = new ImageIcon(this.getClass().getResource("buses.png"));
		btnNewButton_1.setIcon(buses);
		btnNewButton_1.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		btnNewButton_1.setBounds(272, 11, 123, 55);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Hotels");
		ImageIcon hotels = new ImageIcon(this.getClass().getResource("hotels.png"));
		btnNewButton_2.setIcon(hotels);
		btnNewButton_2.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		btnNewButton_2.setBounds(395, 11, 138, 55);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.BLACK);
		ImageIcon banner = new ImageIcon(this.getClass().getResource("bus.png"));
		lblNewLabel_1.setIcon(banner);
		lblNewLabel_1.setOpaque(false);
		lblNewLabel_1.setBounds(240, 136, 96, 76);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtSearchbookgo = new JTextField();
		txtSearchbookgo.setBorder(null);
		txtSearchbookgo.setForeground(Color.WHITE);
		txtSearchbookgo.setFont(new Font("Segoe Print", Font.BOLD, 30));
		txtSearchbookgo.setText("search . book . go");
		txtSearchbookgo.setOpaque(false);
		//txtSearchbookgo.setVisible(true);
		txtSearchbookgo.setBounds(318, 145, 311, 55);
		frame.getContentPane().add(txtSearchbookgo);
		txtSearchbookgo.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(126, 223, 698, 129);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		

		JButton btnNewButton_4 = new JButton("Search");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(554, 29, 119, 53);
		panel.add(btnNewButton_4);
		btnNewButton_4.setForeground(new Color(25, 25, 112));
		btnNewButton_4.setBackground(Color.ORANGE);
		
		txtDestination = new JTextField();
		txtDestination.setBorder(null);
		txtDestination.setBounds(252, 11, 138, 27);
		panel.add(txtDestination);
		txtDestination.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		txtDestination.setText("Destination");
		txtDestination.setColumns(10);
		
		txtSsa = new JTextField();
		txtSsa.setBorder(null);
		txtSsa.setBounds(20, 11, 79, 27);
		panel.add(txtSsa);
		txtSsa.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		txtSsa.setText("Source");
		txtSsa.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBorder(null);
		comboBox.setBounds(20, 45, 171, 46);
		panel.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setSelectedItem("Leaving from");
		comboBox.addItem("Nagpur");
		comboBox.addItem("Mumbai");
		comboBox.addItem("Pune");
		comboBox.addItem("Navi Mumbai");
		comboBox.addItem("Nashik");
		comboBox.addItem("Shirdi");
		comboBox.addItem("Baramati");
		comboBox.addItem("Ahmednagar");
		comboBox.addItem("Satara");
		comboBox.addItem("Kolhapur");
		comboBox.addItem("");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBorder(null);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setBounds(251, 45, 171, 46);
		panel.add(comboBox_1);
		comboBox_1.setSelectedItem("Going to");
		comboBox_1.addItem("Nagpur");
		comboBox_1.addItem("Mumbai");
		comboBox_1.addItem("Pune");
		comboBox_1.addItem("Navi Mumbai");
		comboBox_1.addItem("Nashik");
		comboBox_1.addItem("Shirdi");
		comboBox_1.addItem("Baramati");
		comboBox_1.addItem("Ahmednagar");
		comboBox_1.addItem("Satara");
		comboBox_1.addItem("Kolhapur");
		comboBox_1.addItem("");
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon scene1 = new ImageIcon(this.getClass().getResource("main (1).jpg"));
		lblNewLabel.setIcon(scene1);
		lblNewLabel.setBounds(0, 66, 960, 353);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon login = new ImageIcon(this.getClass().getResource("login.png"));
		
		JButton btnNewButton_5 = new JButton("About Us");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs a=new AboutUs();
				a.Aboutus_frame.setVisible(true);
				a.Aboutus_frame.setLocationRelativeTo(null);
			}
		});
		btnNewButton_5.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5.setBounds(0, 419, 960, 34);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Places To Visit");
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_6.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlacesToVisit skySlideshow = new PlacesToVisit();
			    skySlideshow.setVisible(true);
			    skySlideshow.setLocationRelativeTo(null);
			}
		});
		btnNewButton_6.setBounds(0, 453, 960, 34);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Help");
		btnNewButton_7.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		btnNewButton_7.setBounds(870, 11, 90, 55);
		frame.getContentPane().add(btnNewButton_7);
		
		txtTrip = new JTextField();
		txtTrip.setBorder(null);
		txtTrip.setForeground(Color.RED);
		txtTrip.setFont(new Font("Rage Italic", Font.PLAIN, 36));
		txtTrip.setText("GoTravel");
		txtTrip.setBounds(10, 10, 138, 53);
		frame.getContentPane().add(txtTrip);
		txtTrip.setColumns(10);
		
		
		
		
		
		
		
		
	}
}
