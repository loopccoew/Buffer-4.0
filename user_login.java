package Travel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JTable;

public class user_login {

	JFrame user_login_frame;
	private JTextField txtfirstname;
	private JTextField txtlastname;
	private JTextField txtemaill;
	private JTextField txtphoneno;
	private JTextField txtEmail;
	private JTextField txtPassword;
	private JPasswordField passwordField_1;
	private JPasswordField txtpasswordd;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user_login window = new user_login();
					window.user_login_frame.setVisible(true);
					window.user_login_frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public user_login() {
		initialize();
		Connect();
//table_load();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	Connection con;//=null
	PreparedStatement pst;
	PreparedStatement pstt;
	ResultSet rs;
	ResultSet rss;
	private JTable table_1;
	 
	public void Connect()
	    {
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/travel", "root","");
	        }
	        catch (ClassNotFoundException ex)
	        {
	          ex.printStackTrace();
	        }
	        catch (SQLException ex)
	        {
	            ex.printStackTrace();
	        }
	 
	    }
   public void table_load()//no matter public or not anyways public to all
    {
     try
     {
//    pst = con.prepareStatement("select * from book");
//    rs = pst.executeQuery();
    	 String query="select * from loginpage";
         pst=con.prepareStatement(query);
    ResultSet rs = pst.executeQuery();
    //t.setModel(DbUtils.resultSetToTableModel(rs));
    table_1.setModel(DbUtils.resultSetToTableModel(rs));
    }
     catch (SQLException e)
     {
     e.printStackTrace();
  }
    }

	private void initialize() {
		user_login_frame = new JFrame();
		user_login_frame.setBounds(100, 100, 603, 525);
		user_login_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		user_login_frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(111, 20, 351, 259);
		user_login_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtfirstname = new JTextField();
		txtfirstname.setColumns(10);
		txtfirstname.setBounds(152, 39, 96, 19);
		panel.add(txtfirstname);
		
		txtlastname = new JTextField();
		txtlastname.setColumns(10);
		txtlastname.setBounds(152, 68, 96, 19);
		panel.add(txtlastname);
		
		txtemaill = new JTextField();
		txtemaill.setColumns(10);
		txtemaill.setBounds(152, 126, 96, 19);
		panel.add(txtemaill);
		
		txtphoneno = new JTextField();
		txtphoneno.setColumns(10);
		txtphoneno.setBounds(152, 155, 96, 19);
		panel.add(txtphoneno);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(180, 97, -25, 19);
		panel.add(passwordField_1);
		
		txtpasswordd = new JPasswordField();
		txtpasswordd.setBounds(152, 97, 96, 19);
		panel.add(txtpasswordd);
		
		JButton btnNewButton_3 = new JButton("Login");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bfirstname,blastname,bpasswordd,bemaill,bphoneno;
				bfirstname=txtfirstname.getText();
				blastname=txtlastname.getText();
				bpasswordd=txtpasswordd.getText();
				bemaill=txtemaill.getText();
				bphoneno=txtphoneno.getText();
				try {//pst=con.DriverManager.getConnection("jdbc:mysql://localhost/javacrud", "root","");
					pst = con.prepareStatement("insert into loginpage(Firstname,Lastname,Password,Email,PhoneNo)values(?,?,?,?,?)");
					pst.setString(1, bfirstname);
					pst.setString(2, blastname);
					pst.setString(3, bpasswordd);
					pst.setString(4, bemaill);
					pst.setString(5, bphoneno);
					pst.executeUpdate();
					User uu=new User();
					uu.frame.setVisible(true);
					uu.frame.setLocationRelativeTo(null);
					//JOptionPane.showMessageDialog(null, "Record Added!!!!!");
					//table_load();
					          
//					txtfirstname.setText("");
//					txtlastname.setText("");
//					txtpasswordd.setText("");
//					txtemaill.setText("");
//					txtphoneno.setText("");
//					txtfirstname.requestFocus();
//					Bus1 b=new Bus1();
//					//txtuser.setText("");
//					b.Bus1_frame.setVisible(true);
//					pst=con.prepareStatement("insert into book(name,edition,price)values(?,?,?)");
//					pst.setString(1, bname);
//					pst.setString(2, edition);
//					pst.setString(3, price);//id is auto incremented (set primary in sql table)
//					pst.executeUpdate();//
//					JOptionPane.showMessageDialog(null,"Record added!!!!!!!!!!!!");
//					
//					txtbname.setText("");
//					txtedition.setText("");
//					txtprice.setText("");
//					txtbname.requestFocus();//after clearing focus goes to txtbname
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		btnNewButton_3.setBounds(78, 194, 181, 55);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("First name");
		lblNewLabel_1_1_1.setFont(new Font("Script MT Bold", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(10, 28, 96, 32);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1_1_1.setFont(new Font("Script MT Bold", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1.setBounds(10, 56, 96, 32);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Password");
		lblNewLabel_1_1_1_2.setFont(new Font("Script MT Bold", Font.PLAIN, 17));
		lblNewLabel_1_1_1_2.setBounds(10, 85, 96, 32);
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Email");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Script MT Bold", Font.PLAIN, 17));
		lblNewLabel_1_1_1_2_1.setBounds(10, 114, 96, 32);
		panel.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_2 = new JLabel("Phone No");
		lblNewLabel_1_1_1_2_2.setFont(new Font("Script MT Bold", Font.PLAIN, 17));
		lblNewLabel_1_1_1_2_2.setBounds(10, 146, 96, 32);
		panel.add(lblNewLabel_1_1_1_2_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Sign In", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(111, 279, 351, 199);
		user_login_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtrAlreadyHaveAn = new JTextArea();
		txtrAlreadyHaveAn.setText("Already have an accound Login!!!!");
		txtrAlreadyHaveAn.setBounds(10, 23, 331, 35);
		panel_1.add(txtrAlreadyHaveAn);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(157, 67, 96, 19);
		panel_1.add(txtEmail);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(157, 96, 96, 19);
		panel_1.add(txtPassword);
		
		JButton btnNewButton_3_1 = new JButton("SignUp");
		btnNewButton_3_1.setBounds(68, 134, 181, 55);
		panel_1.add(btnNewButton_3_1);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			          
		            String  Email= txtEmail.getText();
		            String  Password= txtPassword.getText();
		                pst = con.prepareStatement("select Firstname,Lastname,PhoneNo from loginpage where Email= ?");
		                pstt = con.prepareStatement("select Firstname,Lastname,PhoneNo from loginpage where Password= ?");
		                pst.setString(1,Email);
		                pstt.setString(1, Password);
		                //pst.setString(1,Password);
		                ResultSet rs = pst.executeQuery();
		                ResultSet rss = pstt.executeQuery();
		 //System.out.print(rs);
		            if(rs.next()==true&&rss.next()==true)


		            {
		              
//		                String name = rs.getString(1);
//		                String edition = rs.getString(2);
//		                String price = rs.getString(3);
//		                
//		                txtbname.setText(name);
//		                txtedition.setText(edition);
//		                txtprice.setText(price);
		            	User uu=new User();
						uu.frame.setVisible(true);
						uu.frame.setLocationRelativeTo(null);
		                
		            }  
		            else
		            {
		            	txtEmail.setText("");
		            	txtPassword.setText("");
		            	JOptionPane.showMessageDialog(null, "Invaild password!!!!!");
		            	
		                
		                
		            }
		        }
		catch (SQLException ex) {
		          
		        }
			}
		});
		btnNewButton_3_1.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1_1_1_2_3 = new JLabel("Password");
		lblNewLabel_1_1_1_2_3.setFont(new Font("Script MT Bold", Font.PLAIN, 17));
		lblNewLabel_1_1_1_2_3.setBounds(10, 91, 96, 32);
		panel_1.add(lblNewLabel_1_1_1_2_3);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Script MT Bold", Font.PLAIN, 17));
		lblNewLabel_1_1_1_2_1_1.setBounds(10, 58, 96, 32);
		panel_1.add(lblNewLabel_1_1_1_2_1_1);
	}
}
