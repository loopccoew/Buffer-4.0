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

public class mainn {

	private JFrame frame;
	private JTextField txtSearchbookgo;
	private JTextField txtTrip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainn window = new mainn();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 915, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon train = new ImageIcon(this.getClass().getResource("train.png"));
		ImageIcon buses = new ImageIcon(this.getClass().getResource("buses.png"));
		ImageIcon hotels = new ImageIcon(this.getClass().getResource("hotels.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.BLACK);
		ImageIcon banner = new ImageIcon(this.getClass().getResource("bus.png"));
		lblNewLabel_1.setIcon(banner);
		lblNewLabel_1.setOpaque(false);
		lblNewLabel_1.setBounds(234, 113, 96, 76);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtSearchbookgo = new JTextField();
		txtSearchbookgo.setBorder(null);
		txtSearchbookgo.setForeground(Color.WHITE);
		txtSearchbookgo.setFont(new Font("Segoe Print", Font.BOLD, 30));
		txtSearchbookgo.setText("search . book . go");
		txtSearchbookgo.setOpaque(false);
		//txtSearchbookgo.setVisible(true);
		txtSearchbookgo.setBounds(316, 120, 311, 55);
		frame.getContentPane().add(txtSearchbookgo);
		txtSearchbookgo.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(326, 185, 240, 269);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(0, 0, 241, 269);
		panel.add(panel_2);
		
		JButton User_1 = new JButton("User");
		User_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user_login u=new user_login();

				u.user_login_frame.setVisible(true);
				u.user_login_frame.setLocationRelativeTo(null);
			}
		});
		User_1.setForeground(new Color(25, 25, 112));
		User_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		User_1.setBackground(Color.ORANGE);
		User_1.setBounds(56, 59, 119, 53);
		panel_2.add(User_1);
		
		JButton btnAdmin_1 = new JButton("Admin");
		btnAdmin_1.setForeground(new Color(25, 25, 112));
		btnAdmin_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdmin_1.setBackground(Color.ORANGE);
		btnAdmin_1.setBounds(56, 144, 119, 53);
		panel_2.add(btnAdmin_1);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon scene1 = new ImageIcon(this.getClass().getResource("main (1).jpg"));
		lblNewLabel.setIcon(scene1);
		lblNewLabel.setBounds(0, 66, 907, 417);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon login = new ImageIcon(this.getClass().getResource("login.png"));
		
		txtTrip = new JTextField();
		txtTrip.setBorder(null);
		txtTrip.setForeground(Color.RED);
		txtTrip.setFont(new Font("Rage Italic", Font.PLAIN, 40));
		txtTrip.setText("WELCOME TO GO TRAVELl");
		txtTrip.setBounds(226, 10, 461, 53);
		frame.getContentPane().add(txtTrip);
		txtTrip.setColumns(10);
		
		
		
		
		
		
		
		
	}
}
