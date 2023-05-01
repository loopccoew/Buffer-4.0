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

public class Train1 {
	int choice1;
	//int y=0;
	int w=0;
	static int routeType;
    String traindist=null,traincost=null,traintime=null;
    int traindistt=0,traincostt=0,traintimee=0;
	JFrame Train1_frame;
	private JTextField txtleavingfrom;
	private JTextField txtgoingto;
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
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Train1 window = new Train1();
					window.Train1_frame.setVisible(true);
					window.Train1_frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Train1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Train1_frame = new JFrame();
		Train1_frame.setBounds(100, 100, 727, 411);
		Train1_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Train1_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Book Train", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 20, 696, 344);
		Train1_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtleavingfrom = new JTextField();
		startLocation=txtleavingfrom.getText();
		txtleavingfrom.setBounds(185, 23, 155, 31);
		panel.add(txtleavingfrom);
		txtleavingfrom.setColumns(10);
		
		txtgoingto = new JTextField();
		destination=txtgoingto.getText();
		txtgoingto.setBounds(185, 69, 155, 31);
		panel.add(txtgoingto);
		txtgoingto.setColumns(10);
		
		
//		JComboBox txtroutetype = new JComboBox();
//		txtroutetype.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		txtroutetype.setModel(new DefaultComboBoxModel(new String[] {"Shortest Distance", "Least Time", "Cheapest Cost"}));
//		txtroutetype.setEditable(true);
//		txtroutetype.setBorder(null);
//		txtroutetype.setBounds(10, 126, 220, 46);
//		panel.add(txtroutetype);
		
		JComboBox txtroutetype = new JComboBox();
		txtroutetype.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtroutetype.setModel(new DefaultComboBoxModel(new String[] {"Shortest Distance", "Least Time", "Cheapest Cost"}));
		txtroutetype.setEditable(true);
		txtroutetype.setBorder(null);
		txtroutetype.setBounds(10, 155, 220, 46);
		panel.add(txtroutetype);
		
		//txtloader.setText("Cost : "+Integer.toString(buscost)+"\nDistance : 0"+"\nTime : 0");
		JTextPane txtloader = new JTextPane();
		txtloader.setFont(new Font("Txt_IV50", Font.PLAIN, 17));
		txtloader.setBounds(405, 35, 281, 299);
		panel.add(txtloader);
		
		JTextPane txtpnClickSearchFor = new JTextPane();
		txtpnClickSearchFor.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		txtpnClickSearchFor.setText("      CLICK SEARCH FOR TRIP INFORMATION");
		txtpnClickSearchFor.setBounds(405, 10, 281, 21);
		panel.add(txtpnClickSearchFor);
		
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
		Clear.setBounds(10, 255, 119, 53);
		panel.add(Clear);
		
		JButton btnNewButton_4_2 = new JButton("Book Bus");
		btnNewButton_4_2.setForeground(new Color(25, 25, 112));
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4_2.setBackground(Color.ORANGE);
		btnNewButton_4_2.setBounds(145, 255, 119, 53);
		panel.add(btnNewButton_4_2);
		
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
					dj.z=4;
					traindist=dj.shortestPathBetween(graph,graph.getCityByValue(txtleavingfrom.getText()),
							graph.getCityByValue(txtgoingto.getText()));
					//System.out.println(y);
					txtloader.setText(traindist);
					
			}
				else if(txtroutetype.getSelectedItem().toString() == "Least Time") {
					w=2;
					Dijikstra dj =new Dijikstra();
					dj.z=6;
					traintime=dj.shortestPathBetween(graph,graph.getCityByValue(txtleavingfrom.getText()),
							graph.getCityByValue(txtgoingto.getText()));
					//System.out.println(y);
					txtloader.setText(traintime);
					
				}
				else if(txtroutetype.getSelectedItem().toString() == "Cheapest Cost") {
					w=3;
					Dijikstra dj =new Dijikstra();
					dj.z=5;
					traincost=dj.shortestPathBetween(graph,graph.getCityByValue(txtleavingfrom.getText()),
							graph.getCityByValue(txtgoingto.getText()));
					//System.out.println(y);
					//JOptionPane.showMessageDialog(null, "buscost: "+buscost+"\n want to book press Book Bus");
					//txtloader.setText("Cost : "+Integer.toString(buscost)+"\nDistance : 0"+"\nTime : 0");
					txtloader.setText(traincost);
					
				}	
			}
		});
		btnNewButton_4_1.setForeground(new Color(25, 25, 112));
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4_1.setBackground(Color.ORANGE);
		btnNewButton_4_1.setBounds(276, 255, 119, 53);
		panel.add(btnNewButton_4_1);
		
//		
		
		textField = new JTextField();
		textField.setText("Source");
		textField.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(10, 23, 79, 36);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Destination");
		textField_1.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(10, 69, 138, 36);
		panel.add(textField_1);
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
