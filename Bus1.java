//inside receipt name,dist,cost,time all info of customer
package Travel;
import java.util.Scanner;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextPane;

public class Bus1 {
	int choice1;
	//int y=0;
	int w=0;
	static int routeType;
    String busdist=null,buscost=null,bustime=null;
    int busdistt=0,buscostt=0,bustimee=0;
	JFrame Bus1_frame;
	JTextField txtleavingfrom;
	JTextField txtgoingto;
	String startLocation,destination;
	String route;
	static City check_sLocation = null;
	static City check_destination = null;
	Scanner scn = new Scanner(System.in);
	Graph graph=new Graph(true,true,true,true,true,true,true);
//	graph.addcityy();
//
	String check_route;
	private JTextField textField;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bus1 window = new Bus1();
					window.Bus1_frame.setVisible(true);
					window.Bus1_frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bus1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Bus1_frame = new JFrame();
		Bus1_frame.setBounds(100, 100, 794, 466);
		Bus1_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Bus1_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Book Bus", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 63, 745, 344);
		Bus1_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtleavingfrom = new JTextField();
		startLocation=txtleavingfrom.getText();
		txtleavingfrom.setBounds(171, 22, 147, 36);
		panel.add(txtleavingfrom);
		txtleavingfrom.setColumns(10);
		
		txtgoingto = new JTextField();
		destination=txtgoingto.getText();
		txtgoingto.setBounds(171, 85, 147, 36);
		panel.add(txtgoingto);
		txtgoingto.setColumns(10);
		

		
		JComboBox txtroutetype = new JComboBox();
		txtroutetype.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtroutetype.setModel(new DefaultComboBoxModel(new String[] {"Shortest Distance", "Least Time", "Cheapest Cost"}));
		txtroutetype.setEditable(true);
		txtroutetype.setBorder(null);
		txtroutetype.setBounds(10, 165, 220, 46);
		panel.add(txtroutetype);
		
		//txtloader.setText("Cost : "+Integer.toString(buscost)+"\nDistance : 0"+"\nTime : 0");
		JTextPane txtloader = new JTextPane();
		txtloader.setFont(new Font("Txt_IV50", Font.PLAIN, 17));
		txtloader.setBounds(394, 35, 323, 299);
		panel.add(txtloader);
		
		JTextPane txtpnClickSearchFor = new JTextPane();
		txtpnClickSearchFor.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		txtpnClickSearchFor.setText("             CLICK SEARCH FOR TRIP INFORMATION");
		txtpnClickSearchFor.setBounds(394, 10, 323, 21);
		panel.add(txtpnClickSearchFor);
		
		textField_4 = new JTextField();
		textField_4.setText("Source");
		textField_4.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBounds(16, 22, 79, 36);
		panel.add(textField_4);
		
		textField = new JTextField();
		textField.setBounds(10, 85, 138, 36);
		panel.add(textField);
		textField.setText("Destination");
		textField.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(null);
		
		JButton btnNewButton_4_1 = new JButton("Search");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graph.addcityy();
				if(graph.getCityByValue(txtleavingfrom.getText())==null&&graph.getCityByValue(txtgoingto.getText())==null) {
					JOptionPane.showMessageDialog(null, "Both Cities not present Enter again!!!!!!");
			       	txtleavingfrom.setText("");
			       	txtgoingto.setText("");
			       	txtleavingfrom.requestFocus();
				}
				else if(graph.getCityByValue(txtleavingfrom.getText())==null&&graph.getCityByValue(txtgoingto.getText())!=null) {
		       	JOptionPane.showMessageDialog(null, "Leaving City not present Enter again!!!!!!");
		       	txtleavingfrom.setText("");
		       	txtleavingfrom.requestFocus();
				}
				else if(graph.getCityByValue(txtleavingfrom.getText())!=null&&graph.getCityByValue(txtgoingto.getText())==null){
					if(graph.getCityByValue(txtgoingto.getText())==null) {
			       	JOptionPane.showMessageDialog(null, "Going City not present Enter again!!!!!!");
			       	txtgoingto.setText("");
			       	txtgoingto.requestFocus();
					}
				}
				
				if(txtroutetype.getSelectedItem().toString() == "Shortest Distance") {//dist,cost,time//132
					w=1;
					
					Dijikstra dj =new Dijikstra();
					dj.z=1;
					
					busdist=dj.shortestPathBetween(graph,graph.getCityByValue(txtleavingfrom.getText()),
							graph.getCityByValue(txtgoingto.getText()));

					txtloader.setText(busdist);

			}
				else if(txtroutetype.getSelectedItem().toString() == "Least Time") {
					w=2;
					Dijikstra dj =new Dijikstra();
					dj.z=3;
					bustime=dj.shortestPathBetween(graph,graph.getCityByValue(txtleavingfrom.getText()),
							graph.getCityByValue(txtgoingto.getText()));
					
					txtloader.setText(bustime);
					
				}
				else if(txtroutetype.getSelectedItem().toString() == "Cheapest Cost") {
					w=3;
					Dijikstra dj =new Dijikstra();
					dj.z=2;
					buscost=dj.shortestPathBetween(graph,graph.getCityByValue(txtleavingfrom.getText()),
							graph.getCityByValue(txtgoingto.getText()));
					txtloader.setText(buscost);
					
				}	
			}
		});
		btnNewButton_4_1.setForeground(new Color(25, 25, 112));
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4_1.setBackground(Color.ORANGE);
		btnNewButton_4_1.setBounds(266, 247, 119, 53);
		panel.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Book Bus");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(w==1) {
					//String User=txtuser.getText();
//					Busbooking_min_dist uu=new Busbooking_min_dist();
//					//txtuser.setText("");
//					uu.m_b_d_frame.setVisible(true);
				}
				else if(w==2) {
					
				}
				else if(w==3) {
					//JOptionPane.showMessageDialog(null, "successfully booked for bus least cost");

				
			}
			}
			});
		btnNewButton_4_2.setForeground(new Color(25, 25, 112));
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4_2.setBackground(Color.ORANGE);
		btnNewButton_4_2.setBounds(137, 247, 119, 53);
		panel.add(btnNewButton_4_2);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtleavingfrom.setText("");
				txtgoingto.setText("");
				txtloader.setText(" ");
				txtleavingfrom.requestFocus();
			}
		});
		Clear.setForeground(new Color(25, 25, 112));
		Clear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Clear.setBackground(Color.ORANGE);
		Clear.setBounds(8, 247, 119, 53);
		panel.add(Clear);
	}
	public City checkCity(String city) {
		City checksLocation=null;
		checksLocation = graph.getCityByValue(city);
		int choice=0;
		while(checksLocation==null) {
			System.out.println("\nCITY NOT PRESENT");
			System.out.print("STILL WANT TO CONTINUE???\nPRESS 1 FOR EXIT: ");
			choice = scn.nextInt();
			if(choice!=1) {
				System.out.print("\nENTER START LOCATION: ");
				city = scn.next();
				checksLocation = graph.getCityByValue(city
						);
			}
			else {
				System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
				break;
			}

		}
		return checksLocation;
	}
	public City checkDestination(String city) {
		City checksLocation=null;
		checksLocation = graph.getCityByValue(city);
		int choice=0;
		while(checksLocation==null) {
			System.out.println("\nCITY NOT PRESENT");
			System.out.print("STILL WANT TO CONTINUE???\nPRESS 1 FOR EXIT: ");
			choice = scn.nextInt();
			if(choice!=1) {
				System.out.print("\nENTER DESTINATION: ");
				city = scn.next();
				checksLocation = graph.getCityByValue(city);
			}
			else {
				System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
				break;
			}

		}
		return checksLocation;
	}
}
