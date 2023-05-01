package buffer;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.UUID;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.text.html.HTMLDocument.Iterator;

import com.sun.jdi.IntegerValue;
import java.awt.Color;
import java.awt.Image;
 
class RetailSystem extends JFrame implements ActionListener{              //gui 2 is the first frame, it takes furher to owner and user authetication page 
   
    JButton b1,b2;
    JLabel l1,l2,x1;

    RetailSystem()                                         //constructor
    {
         setSize(1500,1000);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(0,0);

		l1 = new JLabel("");
          
                b2=new JButton("USER");
                b2.setBackground(Color.LIGHT_GRAY);
                b2.setForeground(Color.BLACK);
				
                b1=new JButton("OWNER");  
                b1.setBackground(Color.LIGHT_GRAY);
                b1.setForeground(Color.BLACK);
       
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/pp.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1500, 1000,Image.SCALE_SMOOTH);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                //i3.setBounds(0,0,1500,1000);
                 
                
                x1=new JLabel("24/7 GROCERY");
                x1.setBounds(480,80,1200,300);
                x1.setFont(new Font("Times New Roman",Font.BOLD,65));
                  
                x1.setForeground(Color.WHITE);
                l1.add(x1);
                
                
                b1.setBounds(560,350,250,100);
                b2.setBounds(560,500,250,100);
                b1.setFont(new Font("Times New Roman",Font.BOLD,35));
                b2.setFont(new Font("Times New Roman",Font.BOLD,35));
                l1.setBounds(0, 0, 1500, 1000);
               
                l1.add(b1);
		add(l1);
                
                l1.add(b2);
		add(l1);
 
                b1.addActionListener(this);
                b2.addActionListener(this);
                setVisible(true);
                
                
        
    
    }

    public void actionPerformed(ActionEvent ae)        
    {
        if(ae.getSource()==b1)
        {
            Owner f2=new Owner();
            f2.setBounds(0,0,1500,1000);
            f2.setVisible(true);

        }

        if(ae.getSource()==b2)
        {
            User f3=new User();
            f3.setBounds(0,0,1500,1000);
            f3.setVisible(true);

        }

    }
    public static void main(String args[])  throws IOException    //main method,execution starts from here
    {
        //craete frame and add panel
        RetailSystem obj=new RetailSystem();
        obj.setTitle("Online Grocery");
        obj.setBounds(0,0,1500,1000);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bigBasket bb=new bigBasket();
        bb.menu();
        stock stk=new stock();
        stk.create_stock();
        System.out.println("Stock added to bst");

    }

}

class Owner extends JFrame implements ActionListener{                 //owner authentication page 
    JButton b3,b4,b5;
    TextField t1,t2;
    JLabel l1,l2,l3,x1;

    Owner()                                                           //takes namd and password
    {
        super.setTitle("OWNER");
        setLayout(null);
        setSize(1500,1000);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(0,0);

		x1 = new JLabel("");
          
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/bg.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1500, 1000,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                x1 = new JLabel(i2);
                
                x1.setBounds(0, 0, 1500, 1000);
                    add(x1);
                
        l2=new JLabel("PASSWORD");                                    //creating components 
        l3=new JLabel("NAME");
        b3=new JButton("CONTINUE");
        b4=new JButton("BACK");
        l1=new JLabel("OWNER ");  
        b5=new JButton("OK");
        l1.setBounds(600,50,500,300);
        l1.setFont(new Font("Times New Roman",Font.BOLD,50));           //setting bounds 
        l3.setBounds(50,300,400,50);
        l2.setBounds(50,400,400,50);
        b5.setBounds(1000,400,200,50);
        b3.setBounds(50,500,400,50);
        b4.setBounds(50,600,400,50);
        
        l2.setFont(new Font("Times New Roman",Font.BOLD,30));
        l3.setFont(new Font("Times New Roman",Font.BOLD,30));
        b3.setFont(new Font("Times New Roman",Font.BOLD,30));
        b4.setFont(new Font("Times New Roman",Font.BOLD,30));
        b5.setFont(new Font("Times New Roman",Font.BOLD,30));
        t1=new TextField(50);
        t2=new TextField(5);
        t1.setFont(new Font("Times New Roman",Font.BOLD,28));
        t2.setFont(new Font("Times New Roman",Font.BOLD,28));
        t2.setEchoChar('*');
        t1.setBounds(500,300,400,50);
        t2.setBounds(500,400,400,50);
        x1.add(l2);                                                       //adding components to container
        x1.add(l3);
        x1.add(b3);
        x1.add(b4);
        x1.add(t1);
        x1.add(t2);
        x1.add(l1);
        x1.add(b5);
        b5.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b3.setEnabled(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }
    public void actionPerformed(ActionEvent ae)
    {                                                                   
        if(ae.getSource()==b3)
        {
            //insert  into ont of 3 bst
            //delete node from bst
            //updae field of a node in a bst
            //display whole stock
            stk_manage sm=new stk_manage();
            sm.setSize(1500,1000);
            sm.setVisible(true);

        }
        if(ae.getSource()==b4)
        {
           this.dispose();
        }
        if(ae.getSource()==b5)
        {
            if(t1.getText().equals("Ultron"))
           { 
            if(t2.getText().equals("12345"))
            {
                b3.setEnabled(true);
            }
           }
        }
    }



}

class stk_manage extends stock implements ActionListener
{
    JButton b1,b2,b3,b4,b5;
    TextField t1[]=new TextField[16],t,t2[]=new TextField[20];                                       //t1-getting quantity
    JLabel l1[]=new JLabel[16],l,l2[]=new JLabel[20];     
    Choice cb1[]=new Choice[16];
    Choice cb2[]=new Choice[20];
    int y=100;

    stk_manage()
    {
        Container c=getContentPane();
        c.setLayout(null);
        c.setSize(1500,1000);
        super.setTitle("Stock, Sales and Delivery");
                   //display with a delete button that deleted the product,and update stock button
        b2=new JButton("View Cutomer Orders");           //delete product
        b3=new JButton("Sales Analysis");
        //ImageIcon icon =new ImageIcon("C:\\Users\\Arvind\\Desktop\\Aastha\\BUFFER\\purple-bedroom-color-ideas.jpg");
        b1=new JButton("Manage Stock"); 
        //b4=new JButton("Update product details");
        
        // Create a panel with buttons and labels and textfields
        JPanel panel = new JPanel(null);
         
             
    
        b1.setBounds(25,200,500,50);
        b2.setBounds(25,300,500,50);
        b3.setBounds(25,400,500,50);
        //b1.setBounds(25,200,500,50);

        c.add(b1);
        
        b1.addActionListener(this);
        b2.addActionListener(this);


    }
    public void actionPerformed(ActionEvent ae)
    {                                                                   
        if(ae.getSource()==b1)
        {
            //display stock
            products p=new products(10);
            p.setSize(1500,1000);
            p.setVisible(true);
            
        }
        
    }


}

class User extends JFrame  implements ActionListener                          //User authentication page 
{
    Button b1,b2,b3;
    TextField t2,t3,t4,t5,t6;
    JLabel l1,l2,l3,l4,l5,l,t,l6,x1;
    JCheckBox cb1;
    private UUID id;
    JButton b;

    

    User()
    {
        super.setTitle("User");
       setLayout(null);
        setSize(1500,1000);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(0,0);

		x1 = new JLabel("");
          
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/bg.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1500, 1000,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                x1 = new JLabel(i2);
                
                x1.setBounds(0, 0, 1500, 1000);
                    add(x1);
                
        //this.id+=1;
        l=new JLabel("User ID :");
         b=new JButton("OK");
        l1=new JLabel("Login or Create Account");                  //login
        l2=new JLabel("Username");                                 //username
        l3=new JLabel("Email");                                    //email
        l4=new JLabel("Phone Number");                             //phone number
        l5=new JLabel("Password");                                 //password
        t2=new TextField(50);                                   //enter username
        t3=new TextField(5);                                    //enter email
        t4=new TextField(10);                                   //enter phone number
        t5=new TextField(10);                                   //enter password
        cb1=new JCheckBox("remember me");                          //to remembers users data
        b1=new Button("Continue");
        
        id = UUID.randomUUID();

        l6=new JLabel(id+"");
       // ImageIcon icon =new ImageIcon("C:\\Users\\Arvind\\Desktop\\Aastha\\BUFFER\purple-bedroom-color-ideas.jpg");
        b3=new Button("OK");
       

        //setting bounds 
        l.setBounds(700,25,150,100);
        l6.setBounds(875,25,600,100);
        //b.setBounds(800,500,500,100);
        //c.add(b);
        //t.setBounds(850,50,200,50);
        l1.setBounds(50,25,700,100);                
        l2.setBounds(50,150,400,50);
        b3.setBounds(1000,150,100,50);                 
        l3.setBounds(50,250,400,50);   
        l4.setBounds(50,350,400,50);                 
        l5.setBounds(50,450,400,50);   
        t2.setBounds(500,150,400,50);                 
        t3.setBounds(500,250,400,50);   
        t4.setBounds(500,350,400,50);                   //limit the every tf entry
        t5.setBounds(500,450,400,50);
        cb1.setBounds(50,550,400,50);
        b1.setBounds(500,600,400,50);


        //fonts
        l.setFont(new Font("Times New Roman",Font.BOLD,30));
       l6.setFont(new Font("Times New Roman",Font.PLAIN,15));
        //t.setFont(new Font("Helvetica",Font.BOLD,30)); 
        l1.setFont(new Font("Times New Roman",Font.BOLD,40));           
        l2.setFont(new Font("Times New Roman",Font.PLAIN,30));     
        l3.setFont(new Font("Times New Roman",Font.PLAIN,30));
        l4.setFont(new Font("Times New Roman",Font.PLAIN,30));     
        l5.setFont(new Font("Times New Roman",Font.PLAIN,30));
        t2.setFont(new Font("Times New Roman",Font.PLAIN,28));
        t3.setFont(new Font("Times New Roman",Font.PLAIN,28));
        t4.setFont(new Font("Times New Roman",Font.PLAIN,28));
        t5.setFont(new Font("Times New Roman",Font.PLAIN,28));
        cb1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        b1.setFont(new Font("Times New Roman",Font.BOLD,28));
        b3.setFont(new Font("Times New Roman",Font.BOLD,28));

        //to hide the pass
        t5.setEchoChar('*');

        
         //add the component6s to the container
        x1.add(l);
        x1.add(l6);
       // c.add(t);
        x1.add(l1);
        x1.add(l2);
       x1.add(l3);
        x1.add(l4);
        x1.add(l5);
        x1.add(t2);
        x1.add(t3);
        x1.add(t4);
        x1.add(t5);
       x1.add(cb1);
        x1.add(b3);
        x1.add(b1);
        cb1.addActionListener(this);

        
        t2.requestFocusInWindow();
       
      b1.addActionListener(this);
      b3.addActionListener(this);
      b1.setEnabled(false);
       
      
    }

    
    public void actionPerformed(ActionEvent ae)
    {
        boolean flag=true;
         if(cb1.getModel().isSelected())
        {
            String username=t2.getText();
              //name=username;
            String email=t3.getText();
            String ph_no=t4.getText();
            String password=t5.getText();
            String id=l6.getText();

            cust_queue obj=new cust_queue();
            
            obj.cust_queue(id,username,email,ph_no,password);

        }
        if(ae.getSource()==b1)
        {
        
            products p1=new products();
            p1.setSize(1500,1000);
            p1.setVisible(true);
            
        }
        if(ae.getSource()==b3)
        {
            String Name=t2.getText();
            for(int i=0;i<stock.q.size();i++)
            {
            user_data_node node1=stock.q.get(i);
            if(node1.name.equals(Name))
            {
                t3.setText(node1.email);
                t4.setText(node1.ph_no);
                t5.setText(node1.pass);
                l6.setText(node1.id);
                b1.setEnabled(true);
            }
            else
            {
                if(!t3.equals(null) && !t4.equals(null) && !t5.equals(null))
                {
                    b1.setEnabled(true);
                }
            }
            
            }
           
        }
}}

class products extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4;
    JLabel l1;
    JButton b5,b6,b7,b8;
    JLabel l2,x1;
    
    products(int i)
    {
        super.setTitle("Owner");
        Container c=getContentPane();
        c.setLayout(null);
        b5=new JButton("Manage Veggies");
        b6=new JButton("Manage Beverages");
        b7=new JButton("Manage Snaks");
       
        l2=new JLabel("Products ");



        l2.setBounds(50,50,500,100);
        b5.setBounds(50,200,600,50);                 
        b6.setBounds(50,300,600,50);   
        b7.setBounds(50,400,600,50);
      


        l2.setFont(new Font("Times New Roman",Font.BOLD,38));
        b5.setFont(new Font("Times New Roman",Font.PLAIN,30));           
        b6.setFont(new Font("Times New Roman",Font.BOLD,30));     
        b7.setFont(new Font("Times New Roman",Font.BOLD,30));
       

        c.add(b5);
        c.add(b6);
        c.add(b7);
      
        c.add(l2);

        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        //b4.addActionListener(this);

    }
    products()
    {
        super.setTitle("User");
          setLayout(null);
        setSize(1500,1000);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(0,0);

		x1 = new JLabel("");
          
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/wow.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1500, 1000,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                x1 = new JLabel(i2);
                
                x1.setBounds(0, 0, 1500, 1000);
                    add(x1);
        
        
        b1=new JButton("VEGGIES");
        b2=new JButton("BEVERAGES");
        b3=new JButton("SNACKS");
       // b4=new JButton("Your Orders");
        l1=new JLabel("PRODUCTS");


        l1.setBounds(530,50,500,100);
        b1.setBounds(420,250,600,50);                 
        b2.setBounds(420,350,600,50);   
        b3.setBounds(420,450,600,50);
        //b4.setBounds(700,500,600,50);


        l1.setFont(new Font("Times New Roman",Font.BOLD,65));
        b1.setFont(new Font("Times New Roman",Font.BOLD,30));           
        b2.setFont(new Font("Times New Roman",Font.BOLD,30));     
        b3.setFont(new Font("Times New Roman",Font.BOLD,30));
       // b4.setFont(new Font("Times New Roman",Font.BOLD,30));

        x1.add(b1);
        x1.add(b2);
        x1.add(b3);
       // x1.add(b4);
        x1.add(l1);
                b1.setBackground(Color.LIGHT_GRAY);
          b2.setBackground(Color.LIGHT_GRAY);
          b3.setBackground(Color.LIGHT_GRAY);
        //  b4.setBackground(Color.LIGHT_GRAY);
            l1.setForeground(Color.WHITE);
        add(x1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        //b4.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==b1)
        {
            veggies v1=new veggies();
            v1.setSize(1500,1000);
            v1.setVisible(true);
        }
        if(ae.getSource()==b2)
        {
            beverages b1=new beverages();
            b1.setSize(1500,1000);
            b1.setVisible(true);
        }
        if(ae.getSource()==b3)
        {
            snaks s1=new snaks();
            s1.setSize(1500,1000);
            s1.setVisible(true);
        }
        if(ae.getSource()==b5)
        {
            owner_veggies v1=new owner_veggies();
            v1.setSize(1500,1000);
            v1.setVisible(true);
        }
        if(ae.getSource()==b6)
        {
            owner_beverages b1=new owner_beverages();
            b1.setSize(1500,1000);
            b1.setVisible(true);
        }
        if(ae.getSource()==b7)
        {
            owner_snaks os=new owner_snaks();
            os.setSize(1500,1000);
            os.setVisible(true);
        }
    }
}

class owner_snaks extends JFrame  implements ActionListener
{
    TextField t1[]=new TextField[16],t;                                       //t1-getting quantity
    JLabel l1[]=new JLabel[16],l;     
    Choice cb1[]=new Choice[16];
    JButton b1[]=new JButton[16],b2[]=new JButton[16];
  
    int y=100;
    bigBasket bb=new bigBasket();  
    int snak_no=36;                                   // beverages starts from number 0 , used for hashing values in hashtable
    static int snaks_id[]=new int[16];
    static final int snaks_choice_index[]=new int[16];
    int skip=-1;
    int count=0;

    owner_snaks()
    {
        
        System.out.println("\nInside owner_snaks\n");

        for(int i=0;i<16;i++)
        System.out.println(bb.snacks[i]);
        System.out.println();

        Container c=getContentPane();
        c.setSize(1500,1000);
        c.setLayout(null);
        // Create a panel with buttons and labels and textfields
        JPanel panel = new JPanel(null);
        
        l=new JLabel("Search");
        t=new TextField(50);        
        
        //add all the products to the page
        for(int i=0;i<bb.snaks_pro;i++)
        {
            System.out.println(i+" GFor labeloing -> ");
            System.out.println(bb.snacks[i]);
            
            l1[i]=new JLabel(bb.snacks[i]);          //product name
            t1[i]=new TextField(5);          //to take quantity
            b1[i]=new JButton("Delete");   //button to add product to cart
            b2[i]=new JButton("Update");   //button to add product to cart
            cb1[i]=new Choice();
            cb1[i].add(bb.snacks_quantity[i]+" g ( Rs."+bb.price_snacks[i]+")");
            
        }
        //set bounds
        l.setBounds(25,25,100,50);
        t.setBounds(150,25,600,50);
        for(int i=0;i<bb.snaks_pro;i++)
        {
            
                System.out.println(i+ "\tInside if FOR SETTING BOUNDS \n");
            l1[i].setBounds(25,y,200,50);
            b1[i].setBounds(250,y+25,200,25);
            
            y+=70;
            b2[i].setBounds(250,y,200,25);
            cb1[i].setBounds(25,y,200,50);
            y+=50;
            
        }
        
        panel.setPreferredSize(new Dimension(1500, y));
       
        for(int i=0;i<bb.snaks_pro;i++)
        {
           
                System.out.println(i+"\tInside if FOR ADDING TO PANEL BOUNDS \n");
            panel.add(l1[i]);
            panel.add(cb1[i]);
            panel.add(b1[i]);
            panel.add(b2[i]);
            
        }
       
        //add actionListener to each button
        for(int i=0;i<bb.snaks_pro;i++)
        {
            
                System.out.println(i+ "\t  Inside if FOR ADDING TO PANEL BOUNDS \n");
            b1[i].addActionListener(this);
            b2[i].addActionListener(this);
            
        }

        JScrollPane scrollPane = new JScrollPane(panel); 
        // create scroll pane with panel as the view
        scrollPane.setBounds(10, 10, 1300, 700);
        c.add(scrollPane);
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        stock stk=new stock();
        for(int i=0;i<bb.snaks_pro;i++)
        {
            if(ae.getSource()==b1[i])
            {
                System.out.println(i+ "\tInside if AFTER CLICKING TO PANEL BOUNDS \n");
                System.out.println(l1[i].getText());
                stk.delete_snaks(l1[i].getText());
            }
            if(ae.getSource()==b2[i])
            {
                
                update_snaks us=new update_snaks(l1[i].getText());
                us.setSize(1500,1000);
                us.setVisible(true);
            }

        }
    }
    
}

class update_snaks extends JFrame implements ActionListener
{
    //print current price and name and quantity 
    TextField t1,t2;      //quantity and price 
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;         //old quantity and price
    JButton b1;
    bigBasket bb=new bigBasket();
    int index;
    String update;

    update_snaks(String update) 
    {
    // Set up the window
    this.update=update;
    Container c=getContentPane();
    c.setLayout(null);
    c.setSize(1500, 1000);
    l1=new JLabel("Quantity (Packets)");
    l2=new JLabel("Price");
    l5=new JLabel(update);
    l6=new JLabel("Current");
    l7=new JLabel("New");
    t1=new TextField(3);
    t2=new TextField(3);
    b1=new JButton("Update");

    for(int i=0;i<bb.snaks_pro;i++)
    {
        if(bb.snacks[i].equals(update))
        {
            index=i;
            break;
        }
    }
    l3=new JLabel(bb.stock_snaks[index]+"("+bb.snacks_quantity[index]+" g)");         //current quantiy
    l4=new JLabel(bb.price_snacks[index]+"");                                  //current price

    l5.setBounds(25,25,700,50);         //pro name
    l6.setBounds(800,25,200,50);        //current
    l7.setBounds(1100,25,300,50);       //new
    l1.setBounds(25,200,300,50);        //quan
    l2.setBounds(25,300,300,50);           //price
    l3.setBounds(800,200,300,50);      
    l4.setBounds(800,300,300,50);
    t1.setBounds(1200,200,100,50);
    t2.setBounds(1200,300,100,50);
    b1.setBounds(500,500,700,50);
    //take data in t1 and t2 from user

    l1.setFont(new Font("Times New Roman",Font.BOLD,30));
    l2.setFont(new Font("Times New Roman",Font.BOLD,30));
    l3.setFont(new Font("Times New Roman",Font.BOLD,30));
    l4.setFont(new Font("Times New Roman",Font.BOLD,30));
    l5.setFont(new Font("Times New Roman",Font.BOLD,30));
    l6.setFont(new Font("Times New Roman",Font.BOLD,30));
    l7.setFont(new Font("Times New Roman",Font.BOLD,30));
    b1.setFont(new Font("Times New Roman",Font.BOLD,30));
    t1.setFont(new Font("Times New Roman",Font.BOLD,30));
    t2.setFont(new Font("Times New Roman",Font.BOLD,30));

    c.add(l1);
    c.add(l2);
    c.add(l3);
    c.add(l4);
    c.add(l5);
    c.add(l6);
    c.add(l7);
    c.add(t1);
    c.add(t2);
    c.add(b1);


b1.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b1)
    {
            //update button is been clicked
            //update stock nside bst as well inside menu
            //get new quantity and price 
            String quan=t1.getText();
            String price=t2.getText();
            stock stk=new stock();
            stk.update_snaks(update,quan,price);
            JFrame jf=new JFrame();

            jf.setSize(1500,1000);
            jf.setLayout(null);
            JLabel l1,l2,l3,l4,l5;
            l1=new JLabel("Quantity (Packets)");
            l2=new JLabel("Price");
            l5=new JLabel(update);
            l3=new JLabel(bb.stock_snaks[index]+" ("+bb.snacks_quantity[index]+" g)");         //current quantiy
            l4=new JLabel(bb.price_snacks[index]+"");  
            l5.setBounds(25,25,700,50);         //pro name
            l3.setBounds(800,200,300,50);      
            l4.setBounds(800,300,300,50);
            l1.setBounds(25,200,300,50);        //quan
            l2.setBounds(25,300,300,50);           //price
            l1.setFont(new Font("Helvetica",Font.BOLD,30));
    l2.setFont(new Font("Times New Roman",Font.BOLD,30));
    l3.setFont(new Font("Times New Roman",Font.BOLD,30));
    l4.setFont(new Font("Times New Roman",Font.BOLD,30));
    l5.setFont(new Font("Times New Roman",Font.BOLD,30));
            jf.add(l1);
            jf.add(l2);
            jf.add(l3);
            jf.add(l4);
            jf.add(l5);
            jf.setVisible(true);
            
            
    }

}
}

class update_bev  extends JFrame implements ActionListener
{
    //print current price and name and quantity 
    TextField t1,t2;      //quantity and price 
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;         //old quantity and price
    JButton b1;
    bigBasket bb=new bigBasket();
    int index;
    String update;
    boolean flag=false;

    update_bev(String update) 
    {
    // Set up the window
    this.update=update;
    Container c=getContentPane();
    c.setLayout(null);
    c.setSize(1500, 1000);
    l1=new JLabel("Quantity (Kg)");
    l2=new JLabel("Price (Rs)");
    l5=new JLabel(update);
    l6=new JLabel("Current");
    l7=new JLabel("New");
    t1=new TextField(3);
    t2=new TextField(3);
    b1=new JButton("Update");

    for(int i=0;i<bb.bev1_pro;i++)
    {
        if(bb.bev1[i].equals(update))
        {
            index=i;
            l3=new JLabel(bb.stock_bev1[index]+"("+bb.quantity_bev1_stock[index]+" Kg)");         //current quantiy
            l4=new JLabel(bb.price_bev1[index]+"");      
            break;
        }
    }
    for(int i=0;i<bb.bev2_pro;i++)
    {
        if(bb.bev2[i].equals(update))
        {
            index=i;
            l3=new JLabel(bb.stock_bev2[index]+"("+bb.quantity_bev2_stock[index]+" Kg)");         //current quantiy
            l4=new JLabel(bb.price_bev2[index]+"");     
            flag=true; 
            break;
        }
    }

                                //current price

    l5.setBounds(25,25,700,50);         //pro name
    l6.setBounds(800,25,200,50);        //current
    l7.setBounds(1100,25,300,50);       //new
    l1.setBounds(25,200,300,50);        //quan
    l2.setBounds(25,300,300,50);           //price
    l3.setBounds(800,200,300,50);      
    l4.setBounds(800,300,300,50);
    t1.setBounds(1200,200,100,50);
    t2.setBounds(1200,300,100,50);
    
    b1.setBounds(500,600,700,50);

    //take data in t1 and t2 from user

    l1.setFont(new Font("Times New Roman",Font.BOLD,30));
    l2.setFont(new Font("Times New Roman",Font.BOLD,30));
    l3.setFont(new Font("Times New Roman",Font.BOLD,30));
    l4.setFont(new Font("Times New Roman",Font.BOLD,30));
    l5.setFont(new Font("Times New Roman",Font.BOLD,30));
    l6.setFont(new Font("Times New Roman",Font.BOLD,30));
    l7.setFont(new Font("Times New Roman",Font.BOLD,30));
    b1.setFont(new Font("Times New Roman",Font.BOLD,30));
    t1.setFont(new Font("Times New Roman",Font.BOLD,30));
    t2.setFont(new Font("Times New Roman",Font.BOLD,30));
    

    c.add(l1);
    c.add(l2);
    c.add(l3);
    c.add(l4);
    c.add(l5);
    c.add(l6);
    c.add(l7);
    c.add(t1);
    c.add(t2);
    c.add(b1);
   


b1.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b1)
    {
            //update button is been clicked
            //update stock nside bst as well inside menu
            //get new quantity and price 
            String quan=t1.getText();
            String price=t2.getText();
            stock stk=new stock();
            stk.update_bev(update,quan,price);
            JFrame jf=new JFrame();

            jf.setSize(1500,1000);
            jf.setLayout(null);
            JLabel l1,l2,l3,l4,l5;
            l1=new JLabel("Quantity (Kg)");
            l2=new JLabel("Price (Rs)");
            l5=new JLabel(update);
            if(flag==false)
            {
            l3=new JLabel(bb.stock_bev1[index]+" ("+bb.quantity_bev1_stock[index]+" Kg)");         //current quantiy
            l4=new JLabel(bb.price_bev1[index]+"");  
            }
            else
            {
                l3=new JLabel(bb.stock_bev1[index]+" ("+bb.quantity_bev1_stock[index]+" Kg)");         //current quantiy
                l4=new JLabel(bb.price_bev1[index]+"");  
            }
            l5.setBounds(25,25,700,50);         //pro name
            l3.setBounds(800,200,300,50);      
            l4.setBounds(800,300,300,50);
            l1.setBounds(25,200,300,50);        //quan
            l2.setBounds(25,300,300,50);           //price
            l1.setFont(new Font("Times New Roman",Font.BOLD,30));
            l2.setFont(new Font("Times New Roman",Font.BOLD,30));
            l3.setFont(new Font("Times New Roman",Font.BOLD,30));
            l4.setFont(new Font("Times New Roman",Font.BOLD,30));
            l5.setFont(new Font("Times New Roman",Font.BOLD,30));
            jf.add(l1);
            jf.add(l2);
            jf.add(l3);
            jf.add(l4);
            jf.add(l5);
            jf.setVisible(true);
            
            
    }

}
}

class update_veggies extends JFrame implements ActionListener
{
    //print current price and name and quantity 
    TextField t1,t2;      //quantity and price 
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;         //old quantity and price
    JButton b1;
    bigBasket bb=new bigBasket();
    int index;
    String update;

    update_veggies(String update) 
    {
    // Set up the window
    this.update=update;
    Container c=getContentPane();
    c.setLayout(null);
    c.setSize(1500, 1000);
    l1=new JLabel("TotalQuantity (Kg)");
    l2=new JLabel("Price (Rs)");
    l5=new JLabel(update);
    l6=new JLabel("Current");
    l7=new JLabel("New");
    t1=new TextField(3);
    t2=new TextField(3);
    b1=new JButton("Update");

    for(int i=0;i<bb.veggies_pro;i++)
    {
        if(bb.veggiesFruits[i].equals(update))
        {
            index=i;
            break;
        }
    }

    l3=new JLabel(bb.stock_veggies[index]+"("+bb.quantity_veggie_stock[index]+" g)");         //current quantiy
    l4=new JLabel(bb.price_vegies[index]+"");                                  //current price

    l5.setBounds(25,25,700,50);         //pro name
    l6.setBounds(800,25,200,50);        //current
    l7.setBounds(1100,25,300,50);       //new
    l1.setBounds(25,200,300,50);        //quan
    l2.setBounds(25,300,300,50);           //price
    l3.setBounds(800,200,300,50);      
    l4.setBounds(800,300,300,50);
    t1.setBounds(1200,200,100,50);
    t2.setBounds(1200,300,100,50);
    
    b1.setBounds(500,600,700,50);

    //take data in t1 and t2 from user

    l1.setFont(new Font("Times New Roman",Font.BOLD,30));
    l2.setFont(new Font("Times New Roman",Font.BOLD,30));
    l3.setFont(new Font("Times New Roman",Font.BOLD,30));
    l4.setFont(new Font("Times New Roman",Font.BOLD,30));
    l5.setFont(new Font("Times New Roman",Font.BOLD,30));
    l6.setFont(new Font("Times New Roman",Font.BOLD,30));
    l7.setFont(new Font("Times New Roman",Font.BOLD,30));
    b1.setFont(new Font("Times New Roman",Font.BOLD,30));
    t1.setFont(new Font("Times New Roman",Font.BOLD,30));
    t2.setFont(new Font("Times New Roman",Font.BOLD,30));
    

    c.add(l1);
    c.add(l2);
    c.add(l3);
    c.add(l4);
    c.add(l5);
    c.add(l6);
    c.add(l7);
    c.add(t1);
    c.add(t2);
    c.add(b1);
   


b1.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b1)
    {
            //update button is been clicked
            //update stock nside bst as well inside menu
            //get new quantity and price 
            String quan=t1.getText();
            String price=t2.getText();
            stock stk=new stock();
            stk.update_veggies(update,quan,price);
            JFrame jf=new JFrame();

            jf.setSize(1500,1000);
            jf.setLayout(null);
            JLabel l1,l2,l3,l4,l5;
            l1=new JLabel("Quantity (Kg)");
            l2=new JLabel("Price (Rs)");
            l5=new JLabel(update);
            l3=new JLabel(bb.stock_veggies[index]+" ("+bb.quantity_veggie_stock[index]+" Kg)");         //current quantiy
            l4=new JLabel(bb.price_vegies[index]+"");  
            l5.setBounds(25,25,700,50);         //pro name
            l3.setBounds(800,200,300,50);      
            l4.setBounds(800,300,300,50);
            l1.setBounds(25,200,300,50);        //quan
            l2.setBounds(25,300,300,50);           //price
            l1.setFont(new Font("Times New Roman",Font.BOLD,30));
            l2.setFont(new Font("Times New Roman",Font.BOLD,30));
            l3.setFont(new Font("Times New Roman",Font.BOLD,30));
            l4.setFont(new Font("Times New Roman",Font.BOLD,30));
            l5.setFont(new Font("Times New Roman",Font.BOLD,30));
            jf.add(l1);
            jf.add(l2);
            jf.add(l3);
            jf.add(l4);
            jf.add(l5);
            jf.setVisible(true);
            
            
    }

}
}
//write same updatebc;as foe veggies and beverages
class owner_beverages extends JFrame  implements ActionListener
{

    TextField t1[]=new TextField[16],t,t2[]=new TextField[20];                                       //t1-getting quantity
    JLabel l1[]=new JLabel[16],l,l2[]=new JLabel[20];     
    Choice cb1[]=new Choice[16];
    Choice cb2[]=new Choice[20];
    JButton b1[]=new JButton[16],b2[]=new JButton[16],b3[]=new JButton[20],b4[]=new JButton[20],b,b5;
    int y=100;
    bigBasket bb=new bigBasket();  

    owner_beverages()
    {
        System.out.println("\nInside owner_snaks\n");
        for(int i=0;i<bb.bev1_pro;i++)
        System.out.println(bb.bev1[i]);
        System.out.println();

        for(int i=0;i<bb.bev2_pro;i++)
        System.out.println(bb.bev2[i]);
        System.out.println();

        Container c=getContentPane();
        c.setSize(1500,1000);
        c.setLayout(null);
        // Create a panel with buttons and labels and textfields
        JPanel panel = new JPanel(null);
        
        l=new JLabel("Search");
        t=new TextField(50);        
        
        //add all the products to the page
        for(int i=0;i<bb.bev1_pro;i++)
        {
            System.out.println(i+" GFor labeloing -> ");
            System.out.println(bb.bev1[i]);
            
            l1[i]=new JLabel(bb.bev1[i]);          //product name
            t1[i]=new TextField(5);          //to take quantity
            b1[i]=new JButton("Delete");   //button to add product to cart
            b2[i]=new JButton("Update");   //button to add product to cart
            cb1[i]=new Choice();
            cb1[i].add(bb.quantity_bev1_stock[i]+" Kg ( Rs."+bb.price_bev1[i]+")");
            cb1[i].add(bb.quantity1_bev1_stock[i]+" Kg ( Rs."+bb.price1_bev1[i]+")");

        }

        for(int i=0;i<bb.bev2_pro;i++)
        {
            l2[i]=new JLabel(bb.bev2[i]);          //product name
            t2[i]=new TextField(5);          //to take quantity
            b3[i]=new JButton("Delete");   //button to add product to cart
            b4[i]=new JButton("Update");   //button to add product to cart
            cb2[i]=new Choice();
            cb2[i].add(bb.quantity_bev2_stock[i]+" Kg ( Rs."+bb.price_bev2[i]+")");
            cb2[i].add(bb.quantity1_bev2_stock[i]+" Kg ( Rs."+bb.price1_bev2[i]+")");   

        }

        //set bounds
        l.setBounds(25,25,100,50);
        t.setBounds(150,25,600,50);

        for(int i=0;i<bb.bev1_pro;i++)
        {
            
            System.out.println(i+ "\tInside if FOR SETTING BOUNDS \n");
            l1[i].setBounds(25,y,200,50);
            b1[i].setBounds(250,y+25,200,25);
            y+=70;
            b2[i].setBounds(250,y,200,25);
            cb1[i].setBounds(25,y,200,50);
            y+=50;
            
        }
        for(int i=0;i<bb.bev2_pro;i++)
        {
            
            System.out.println(i+ "\tInside if FOR SETTING BOUNDS \n");
            l2[i].setBounds(25,y,200,50);
            b3[i].setBounds(250,y+25,200,25);
            y+=70;
            b4[i].setBounds(250,y,200,25);
            cb2[i].setBounds(25,y,200,50);
            y+=50;
            
        }
        
        panel.setPreferredSize(new Dimension(1500, y));
        
     
      
        for(int i=0;i<bb.bev1_pro;i++)
        {
            System.out.println(i+"\tInside if FOR ADDING TO PANEL BOUNDS \n");
            panel.add(l1[i]);
            panel.add(cb1[i]);
            panel.add(b1[i]);
            panel.add(b2[i]);
        }
        for(int i=0;i<bb.bev2_pro;i++)
        {
            System.out.println(i+"\tInside if FOR ADDING TO PANEL BOUNDS \n");
            panel.add(l2[i]);
            panel.add(cb2[i]);
            panel.add(b3[i]);
            panel.add(b4[i]);
        }
       
        //add actionListener to each button
        for(int i=0;i<bb.bev1_pro;i++)
        {
            
            System.out.println(i+ "\t  Inside if FOR ADDING TO PANEL BOUNDS \n");
            b1[i].addActionListener(this);
            b2[i].addActionListener(this);
            
        }
        for(int i=0;i<bb.bev2_pro;i++)
        {
            
            System.out.println(i+ "\t  Inside if FOR ADDING TO PANEL BOUNDS \n");
            b3[i].addActionListener(this);
            b4[i].addActionListener(this);
            
        }

        JScrollPane scrollPane = new JScrollPane(panel); 
        // create scroll pane with panel as the view
        scrollPane.setBounds(10, 10, 1300, 700);
        c.add(scrollPane);
    }

    public void actionPerformed(ActionEvent ae)
    {
        stock stk=new stock();
        for(int i=0;i<bb.bev1_pro;i++)
        {
            if(ae.getSource()==b1[i])
            {
                System.out.println(i+ "\tInside if AFTER CLICKING TO PANEL BOUNDS \n");
                System.out.println(l1[i].getText());
                stk.delete_beverages(l1[i].getText());

            }
        }
        for(int i=0;i<bb.bev2_pro;i++)
        {
            if(ae.getSource()==b3[i])
            {
                System.out.println(i+ "\tInside if AFTER CLICKING TO PANEL BOUNDS \n");
                System.out.println(l2[i].getText());
                stk.delete_beverages(l2[i].getText());

            }
        }
        for(int i=0;i<bb.bev1_pro;i++)
        {
            if(ae.getSource()==b2[i])
            {
                update_bev us=new update_bev(l1[i].getText());
                us.setSize(1500,1000);
                us.setVisible(true);
            }
        }
        for(int i=0;i<bb.bev2_pro;i++)
        {
            if(ae.getSource()==b4[i])
            {
                update_bev us=new update_bev(l1[i].getText());
                us.setSize(1500,1000);
                us.setVisible(true);
            }
        }
    }
    
}

class owner_veggies extends JFrame  implements ActionListener
{
    TextField t1[]=new TextField[16],t;                                       //t1-getting quantity
    JLabel l1[]=new JLabel[16],l;     
    Choice cb1[]=new Choice[16];
    JButton b1[]=new JButton[16],b2[]=new JButton[16];
    int y=100;
    bigBasket bb=new bigBasket();  
    //int snak_no=36;                                 
    // static int snaks_id[]=new int[16];
    // static final int snaks_choice_index[]=new int[16];
    
    owner_veggies()
    {
        

        for(int i=0;i<bb.veggies_pro;i++)
        System.out.println(bb.veggiesFruits[i]);
        System.out.println();

        Container c=getContentPane();
        c.setSize(1500,1000);
        c.setLayout(null);
        // Create a panel with buttons and labels and textfields
        JPanel panel = new JPanel(null);    
        l=new JLabel("Search");
        t=new TextField(50);        
        
        //add all the products to the page
        for(int i=0;i<bb.veggies_pro;i++)
        {
            System.out.println(i+" For labeloing -> ");
            System.out.println(bb.veggiesFruits[i]);
            l1[i]=new JLabel(bb.veggiesFruits[i]);          //product name
            t1[i]=new TextField(5);          //to take quantity
            b1[i]=new JButton("Delete");   //button to add product to cart
            b2[i]=new JButton("Update");   //button to add product to cart
            cb1[i]=new Choice();
            cb1[i].add(bb.quantity_veggie_stock[i]+" Kg ( Rs."+bb.price_vegies[i]+")");
            cb1[i].add(bb.quantity_veggie_stock1[i]+" Kg ( Rs."+bb.price_vegies1[i]+")");
        }
        //set bounds
        

        for(int i=0;i<bb.veggies_pro;i++)
        {
            System.out.println(i+ "\tInside if FOR SETTING BOUNDS \n");
            l1[i].setBounds(25,y,200,50);
            b1[i].setBounds(250,y+25,200,25);
            y+=70;
            b2[i].setBounds(250,y,200,25);
            cb1[i].setBounds(25,y,200,50);
            y+=50;
        }
        
        panel.setPreferredSize(new Dimension(1500, y));
      
      
        for(int i=0;i<bb.veggies_pro;i++)
        {
           
                System.out.println(i+"\tInside if FOR ADDING TO PANEL BOUNDS \n");
            panel.add(l1[i]);
            panel.add(cb1[i]);
            panel.add(b1[i]);
            panel.add(b2[i]);
            
        }
       
        //add actionListener to each button
        for(int i=0;i<bb.veggies_pro;i++)
        {
            
                System.out.println(i+ "\t  Inside if FOR ADDING TO PANEL BOUNDS \n");
            b1[i].addActionListener(this);
            b2[i].addActionListener(this);
            
        }

        JScrollPane scrollPane = new JScrollPane(panel); 
        // create scroll pane with panel as the view
        scrollPane.setBounds(10, 10, 1300, 700);
        c.add(scrollPane);
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        stock stk=new stock();
        for(int i=0;i<bb.veggies_pro;i++)
        {
            if(ae.getSource()==b1[i])

            {
                System.out.println(i+ "\tInside if AFTER CLICKING TO PANEL BOUNDS \n");
                System.out.println(l1[i].getText());
                stk.delete_veggies(l1[i].getText());
            }
        }
        for(int i=0;i<bb.veggies_pro;i++)
        {
            if(ae.getSource()==b2[i])

            {
                update_veggies us=new update_veggies(l1[i].getText());
                us.setSize(1500,1000);
                us.setVisible(true);
            }
        }
    }
    
}

class user_data_node
{
    String name,email,id,ph_no,pass;
    user_data_node(String id,String username,String email,String ph_no,String password)
    {
        this.name=username;
        this.email=email;
        this.id=id;
        this.ph_no=ph_no;
        this.pass=password;
    }
    
    
}

class cust_queue
{
    String name,email,id,ph_no,pass,price;
    
    void cust_queue(String id,String username,String email,String ph_no,String password)
    {
        
        this.name=username;
        this.email=email;
        this.id=id;
        this.ph_no=ph_no;
        this.pass=password;
        user_data_node node=new user_data_node(id,name,email,ph_no,pass);
        stock.q.add(node);
        System.out.println("Data added");
        System.out.println("\nQueue-> \n");
        System.out.println("Size -> "+stock.q.size());
        
        for(int i=0;i<stock.q.size();i++)
        {
            user_data_node node1=stock.q.get(i);
            
            
        }
        
    }

    
}
class beverages extends stock implements ActionListener,ItemListener                              
{

    TextField t1[]=new TextField[16],t,t2[]=new TextField[20];                                       //t1-getting quantity
    JLabel l1[]=new JLabel[16],l,l2[]=new JLabel[20],l3[]=new JLabel[16],l4[]=new JLabel[20];     
    Choice cb1[]=new Choice[16];
    Choice cb2[]=new Choice[20];
    JButton b1[]=new JButton[16],b2[]=new JButton[20],b,b4,b5;
    int y=100;
    bigBasket bb=new bigBasket();  
    int bev_no=0;      // beverages starts from number 0 , used for hashing values in hashtable
    static int bev1_id[]=new int[16];
    static int bev2_id[]=new int[20];
    static final int bev1_choice_index[]=new int[16];
    static final int bev2_choice_index[]=new int[20];
    static String quan1;
    static Hashtable<Integer,String> cart=new Hashtable<>();
    static double price;

    beverages()
    {
        Container c=getContentPane();
        c.setSize(1500,1000);
        c.setLayout(null);
        // Create a panel with buttons and labels and textfields
        JPanel panel = new JPanel(null);
        //hardcoded values of products saved in menu of bigBasket class
        //search bar 
        l=new JLabel("SEARCH");
        t=new TextField(50);
        b=new JButton("CART");
        ImageIcon icon=new ImageIcon("C:\\Users\\dell\\Documents\\NetBeansProjects\\aastha_buffer\\src\\icons\\iocn.png");
        b5=new JButton("",icon);
        

        //add all the products to the page

        for(int i=0;i<16;i++)
        {
            l1[i]=new JLabel(bb.bev1[i]);          //product name
            l3[i]=new JLabel("Quantity");
            t1[i]=new TextField(5);          //to take quantity
            t1[i].setText("1");
            b1[i]=new JButton("Add to cart");   //button to add product to cart
            cb1[i]=new Choice();
            cb1[i].add(bb.quantity_bev1_stock[i]+" Kg ( Rs."+bb.price_bev1[i]+")");
            cb1[i].add(bb.quantity1_bev1_stock[i]+" Kg ( Rs."+bb.price1_bev1[i]+")");
            bev1_id[i]=bev_no;
            bev_no++;
        }

        for(int i=0;i<20;i++)
        {
            l2[i]=new JLabel(bb.bev2[i]);          //product name
            t2[i]=new TextField(5);          //to take quantity
            l4[i]=new JLabel("Quantity");
            b2[i]=new JButton("Add to cart");   //button to add product to cart
            cb2[i]=new Choice();
            cb2[i].add(bb.quantity_bev2_stock[i]+" L ( Rs."+bb.price_bev2[i]+")");
            cb2[i].add(bb.quantity1_bev2_stock[i]+" L ( Rs."+bb.price1_bev2[i]+")");
            bev2_id[i]=bev_no;
            bev_no++;
        }
        //set bounds
        l.setBounds(25,25,100,50);
        t.setBounds(150,25,600,50);
        b.setBounds(950,25,200,50);
        b5.setBounds(800,25,50,50);
        
        for(int i=0;i<16;i++)
        {
            l1[i].setBounds(25,y,200,50);
            l3[i].setBounds(350,y+25,100,25);
            t1[i].setBounds(500,y+25,200,25);
            b1[i].setBounds(800,y+25,200,25);
            y+=70;
            cb1[i].setBounds(25,y,200,50);
            y+=50;
        }
        for(int i=0;i<20;i++)
        {
            l2[i].setBounds(25,y,200,50);
            l4[i].setBounds(350,y+25,100,25);
            t2[i].setBounds(500,y+25,200,25);
            b2[i].setBounds(800,y+25,200,25);
            y+=70;
            cb2[i].setBounds(25,y,200,50);
            y+=50;
        }
        panel.setPreferredSize(new Dimension(1500, y));
        panel.add(l);
        panel.add(t);
        panel.add(b);
        panel.add(b5);
        
        for(int i=0;i<16;i++)
        {
            panel.add(l1[i]);
            panel.add(cb1[i]);
            panel.add(b1[i]);
            panel.add(t1[i]);
            panel.add(l3[i]);
            
        }
        for(int i=0;i<20;i++)
        {
            panel.add(l2[i]);
            panel.add(cb2[i]);
            panel.add(b2[i]);
            panel.add(t2[i]);
            panel.add(l4[i]);
        }

        //add actionListener to each button
        for(int i=0;i<16;i++)
        {
            b1[i].addActionListener(this);
            cb1[i].addItemListener(this);
        }

        for(int i=0;i<20;i++)
        {
            b2[i].addActionListener(this);
            cb2[i].addItemListener(this);
        }
        b.addActionListener(this);
        b5.addActionListener(this);
        //b4.addActionListener(this);
         // Add the panel to a scroll pane

        JScrollPane scrollPane = new JScrollPane(panel); 
        // create scroll pane with panel as the view
        scrollPane.setBounds(10, 10, 1300, 700);
        c.add(scrollPane);
    }

    public void itemStateChanged(ItemEvent e)
    {
        for(int i=0;i<16;i++)
        bev1_choice_index[i]=cb1[i].getSelectedIndex();

        for(int i=0;i<20;i++)
        bev2_choice_index[i]=cb2[i].getSelectedIndex();
    }

    public void actionPerformed(ActionEvent ae)
    {
        for(int i=0;i<16;i++)
        {
            if(ae.getSource()==b1[i])
            {
                String pro_name=l1[i].getText();
                // add to cart button has been clicked
                //add that product in hashtable
                
                cb1[i].addItemListener(this);
                quan1=t1[i].getText();             //in Kg
                if(cb1[i].getSelectedIndex()==0)
                {
                bb.stock_bev1[i]-=Double.parseDouble(quan1)*0.5;
                beverages.price+=bb.price_bev1[i]*Double.parseDouble(quan1);
                }
                
                else
                {
                bb.stock_bev1[i]-=Double.parseDouble(quan1);
                beverages.price+=bb.price1_bev1[i]*Double.parseDouble(quan1);
                }
                
                cart.put(bev1_id[i],pro_name);
            }
        }
        
        for(int i=0;i<20;i++)
        {
            if(ae.getSource()==b2[i])
            {
                String pro_name=l2[i].getText();
                // add to cart button has been clicked
                //add that product in hashtable
                cb2[i].addItemListener(this);
                quan1=t2[i].getText();             //in Kg
                if(cb2[i].getSelectedIndex()==0)
                {
                bb.stock_bev1[i]-=Double.parseDouble(quan1)*0.5;

                beverages.price+=bb.price_bev2[i]*Double.parseDouble(quan1);
                }
                
                else{
                bb.stock_bev1[i]-=Double.parseDouble(quan1);
                beverages.price+=bb.price1_bev2[i]*Double.parseDouble(quan1);
                }
                cart.put(bev1_id[i],pro_name);
            }
        }

      
        if(ae.getSource()==b5)
        {
            String search=t.getText();
            stock st=new stock();
            st.create_stock();
            try {
               ArrayList<String> str= st.search_bev(search);
               bev_search_res bsr=new bev_search_res(str,beverages.cart);
               bsr.setSize(1500,1000);
               bsr.setVisible(true);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            st.create_stock();


            //search is th string to be search in the bst
           //Stock stk=new s
        }
        if(ae.getSource()==b)
        {
            //cart button is clicked, then show the cart
            //we have the data in hashTable, just print the product list on cart page 
           
            Cart c1=new Cart(cart);
            c1.setSize(1500,1000);
            c1.setVisible(true);
        }
        if(ae.getSource()==b4)
        {
            //cart button is clicked, then show the cart
            //we have the data in hashTable, just print the product list on cart page 
           
            
            LocalDateTime now=LocalDateTime.now();
           //send this new time as login time 
            
        }

    }
    
}

class snaks extends stock implements ActionListener,ItemListener
{
    TextField t1[]=new TextField[16],t;                                       //t1-getting quantity
    JLabel l1[]=new JLabel[16],l,l2[]=new JLabel[16];     
    Choice cb1[]=new Choice[16];
    JButton b1[]=new JButton[16],b2[]=new JButton[16],b;
    JButton b5;
    int y=100;
    bigBasket bb=new bigBasket();  
    int snak_no=36;                                   // beverages starts from number 0 , used for hashing values in hashtable
    static int snaks_id[]=new int[16];
    static final int snaks_choice_index[]=new int[16];
    int skip=-1;
    int count=0;
    static String quan3;

    
    snaks()
    {
        Container c=getContentPane();
        c.setSize(1500,1000);
        c.setLayout(null);
        // Create a panel with buttons and labels and textfields
        JPanel panel = new JPanel(null);
         
       
        
        //hardcoded values of products saved in menu of bigBasket class

        //search bar 
        l=new JLabel("SEARCH");
        
        t=new TextField(50);
        b=new JButton("CART");
        ImageIcon icon=new ImageIcon("C:\\Users\\dell\\Documents\\NetBeansProjects\\aastha_buffer\\src\\icons\\iocn.png");
        b5=new JButton("",icon);
        //add all the products to the page

        for(int i=0;i<bb.snaks_pro;i++)
        {
           
            
            l1[i]=new JLabel(bb.snacks[i]);          //product name
            l2[i]=new JLabel("Quantity");
            t1[i]=new TextField(5);          //to take quantity
            t1[i].setText("1");
            b1[i]=new JButton("Add to cart");   //button to add product to cart
            cb1[i]=new Choice();
            cb1[i].add(bb.snacks_quantity[i]+" g ( Rs."+bb.price_snacks[i]+")");
            snaks_id[i]=snak_no;
            snak_no++;
        }

        //set bounds
        l.setBounds(25,25,100,50);
        t.setBounds(150,25,600,50);
        b.setBounds(950,25,200,50);
        b5.setBounds(800,25,50,50);

        for(int i=0;i<bb.snaks_pro;i++)
        {
            l1[i].setBounds(25,y,200,50);
            l2[i].setBounds(350,y+25,100,25);
            t1[i].setBounds(500,y+25,200,25);
            b1[i].setBounds(800,y+25,200,25);
            y+=70;
            cb1[i].setBounds(25,y,200,50);
            y+=50;
        }
        
        panel.setPreferredSize(new Dimension(1500, y));
        panel.add(l);
        panel.add(t);
        panel.add(b);
        panel.add(b5);
        
        for(int i=0;i<bb.snaks_pro;i++)
        {
            panel.add(l1[i]);
            panel.add(cb1[i]);
            panel.add(b1[i]);
            panel.add(l2[i]);
            panel.add(t1[i]);
            
        }
       

        //add actionListener to each button
        for(int i=0;i<bb.snaks_pro;i++)
        {
            b1[i].addActionListener(this);
            cb1[i].addItemListener(this);
        }

        b5.addActionListener(this);
        
        b.addActionListener(this);
         // Add the panel to a scroll pane

        JScrollPane scrollPane = new JScrollPane(panel); 
        // create scroll pane with panel as the view
        scrollPane.setBounds(10, 10, 1300, 700);
        c.add(scrollPane);
    }

    public void itemStateChanged(ItemEvent e)
    {
        for(int i=0;i<bb.snaks_pro;i++)
        snaks_choice_index[i]=cb1[i].getSelectedIndex();
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        for(int i=0;i<bb.snaks_pro;i++)
        {
            if(ae.getSource()==b1[i])
            {
               
              
                String pro_name=l1[i].getText();
                // add to cart button has been clicked
                //add that product in hashtable
                 quan3=t1[i].getText();             //number of packets
                 beverages.price+=bb.price_snacks[i]*Integer.parseInt(quan3);
                bb.stock_snaks[i]-=Integer.parseInt(quan3);
                cb1[i].addItemListener(this);
                beverages.cart.put(snaks_id[i],pro_name);
               
            }
        }
        
        if(ae.getSource()==b5)
        {
            String search=t.getText();
            stock st=new stock();
            st.create_stock();
            try {
               ArrayList<String> str= st.search_snaks(search);
               //open new page and display all result buttons
               snaks_search_res ssr=new snaks_search_res(str,beverages.cart);
               ssr.setSize(1500,1000);
               ssr.setVisible(true);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
            }
            st.create_stock();
        }

      
        if(ae.getSource()==b)
        {
            //cart button is clicked, then show the cart
            //we have the data in hashTable, just print the product list on cart page 
           
            Cart c1=new Cart(beverages.cart);
            c1.setSize(1500,1000);
            c1.setVisible(true);
        }

    }
       
}

class snaks_search_res extends stock implements ActionListener,ItemListener
{
    TextField t1[]=new TextField[16],t;                                       //t1-getting quantity
    JLabel l1[]=new JLabel[16],l;     
    Choice cb1[]=new Choice[16];
    JButton b1[]=new JButton[16],b;
    int y=100;
    bigBasket bb=new bigBasket();  
    int snak_no=36;                                   // beverages starts from number 0 , used for hashing values in hashtable
    int snaks_id[]=new int[16];
    static final int snaks_choice_index[]=new int[16];
    ArrayList al;
    int i;
    snaks_search_res(ArrayList al,Hashtable cart)
    {
        
            this.al=al;
            Container c=getContentPane();
            c.setSize(1500,1000);
            c.setLayout(null);
            // Create a panel with buttons and labels and textfields
            JPanel panel = new JPanel(null);
            
            bb.menu();       
            
            //hardcoded values of products saved in menu of bigBasket class
    
            //search bar 
            l=new JLabel("Search");
            t=new TextField(50);
            b=new JButton("Cart");
            //add all the products to the page
    
            
            for(Object o:al)
            {
                System.out.println(o.toString());
                l1[i]=new JLabel(o.toString());                  //product name
                t1[i]=new TextField(5);          //to take quantity
                b1[i]=new JButton("Add to cart");   //button to add product to cart
                cb1[i]=new Choice();
                for(int j=0;j<16;j++)
                {
                    if(o.toString().equals(bb.snacks[j]))
                    {
                        
                        cb1[i].add(bb.snacks_quantity[j]+" g ( Rs."+bb.price_snacks[j]+")");
                        break;
                    }
                }
                i++;
            }
    
        
            //set bounds
            l.setBounds(25,25,100,50);
            t.setBounds(150,25,600,50);
            b.setBounds(1000,25,300,50);
    
            System.out.println(i);
            for(int k=0;k<i;k++)
            {
                l1[k].setBounds(25,y,200,50);
                b1[k].setBounds(250,y+25,200,25);
                y+=70;
                cb1[k].setBounds(25,y,200,50);
                y+=50;
            }
            
            panel.setPreferredSize(new Dimension(1500, y));
            panel.add(l);
            panel.add(t);
            panel.add(b);
            
            for(int k=0;k<i;k++)
            {
                panel.add(l1[k]);
                panel.add(cb1[k]);
                panel.add(b1[k]);
                
            }
           
    
            //add actionListener to each button
            for(int k=0;k<i;k++)
            {
                b1[k].addActionListener(this);
                cb1[k].addItemListener(this);
            }
    
           
            
            b.addActionListener(this);
             // Add the panel to a scroll pane
    
            JScrollPane scrollPane = new JScrollPane(panel); 
            // create scroll pane with panel as the view
            scrollPane.setBounds(10, 10, 1300, 700);
            c.add(scrollPane);
        }
        public void itemStateChanged(ItemEvent e)
       {
        for(int i=0;i<16;i++)
        snaks_choice_index[i]=cb1[i].getSelectedIndex();
        
        }

    public void actionPerformed(ActionEvent ae)
    {
        for(int k=0;k<i;k++)
        {
            if(ae.getSource()==b1[k])
            {
               
                String pro_name=l1[k].getText();
                // add to cart button has been clicked
                //add that product in hashtable
                
                beverages.cart.put(snaks.snaks_id[k],pro_name);
                cb1[k].addItemListener(this);
            }}
        if(ae.getSource()==b)
        {
            //cart button is clicked, then show the cart
            //we have the data in hashTable, just print the product list on cart page 
           
            Cart c1=new Cart(beverages.cart);
            c1.setSize(1500,1000);
            c1.setVisible(true);
        }

    }
     
    


}

class veggies extends stock implements ActionListener,ItemListener
{
    TextField t1[]=new TextField[16],t;                                       //t1-getting quantity
    JLabel l1[]=new JLabel[16],l,l2[]=new JLabel[16];     
    Choice cb1[]=new Choice[16];
    JButton b1[]=new JButton[16],b,b5;
    int y=100;
    bigBasket bb=new bigBasket();  
    int veggie_no=52;      // beverages starts from number 0 , used for hashing values in hashtable
    static int veggie_id[]=new int[16];
    static final int veggie_choice_index[]=new int[16];
    static String quan2;


    veggies()
    {
        Container c=getContentPane();
        c.setSize(1500,1000);
        c.setLayout(null);
        // Create a panel with buttons and labels and textfields
        JPanel panel = new JPanel(null);
         
        bb.menu();       
        
        //hardcoded values of products saved in menu of bigBasket class

        //search bar 
        l=new JLabel("SEARCH");
        t=new TextField(50);
        b=new JButton("CART");
        ImageIcon icon=new ImageIcon("C:\\Users\\dell\\Documents\\NetBeansProjects\\aastha_buffer\\src\\icons\\iocn.png");
        b5=new JButton("",icon);

        //add all the products to the page

        for(int i=0;i<bb.veggies_pro;i++)
        {
            
            l1[i]=new JLabel(bb.veggiesFruits[i]);          //product name
            l2[i]=new JLabel("Quantity");
            t1[i]=new TextField(5);          //to take quantity
            t1[i].setText("1");
            b1[i]=new JButton("Add to cart");   //button to add product to cart
            cb1[i]=new Choice();
            cb1[i].add(bb.quantity_veggie_stock[i]+" Kg ( Rs."+bb.price_vegies[i]+")");
            cb1[i].add(bb.quantity_veggie_stock1[i]+" Kg ( Rs."+bb.price_vegies1[i]+")");
            veggie_id[i]=veggie_no;
            veggie_no++;
        }

    
        //set bounds
        l.setBounds(25,25,100,50);
        t.setBounds(150,25,600,50);
        b.setBounds(950,25,200,50);
        b5.setBounds(800,25,50,50);

        for(int i=0;i<bb.veggies_pro;i++)
        {
            l1[i].setBounds(25,y,200,50);
            l2[i].setBounds(300,y+25,199,50);
            t1[i].setBounds(500,y+25,200,50);
            b1[i].setBounds(800,y+25,200,25);
            y+=70;
            cb1[i].setBounds(25,y,200,50);
            y+=50;
        }
        l.setFont(new Font("Times New Roman",Font.BOLD,15));           
        b.setFont(new Font("Times New Roman",Font.BOLD,30)); 
        
        panel.setPreferredSize(new Dimension(1500, y));
        panel.add(l);
        panel.add(t);
        panel.add(b);
        panel.add(b5);
        
        for(int i=0;i<bb.veggies_pro;i++)
        {
            panel.add(l1[i]);
            panel.add(l2[i]);
            panel.add(t1[i]);
            panel.add(cb1[i]);
            panel.add(b1[i]);
            
        }
       

        //add actionListener to each button
        for(int i=0;i<bb.veggies_pro;i++)
        {
            b1[i].addActionListener(this);
            cb1[i].addItemListener(this);
        }

        
        b.addActionListener(this);
        b5.addActionListener(this);
         // Add the panel to a scroll pane

        JScrollPane scrollPane = new JScrollPane(panel); 
        // create scroll pane with panel as the view
        scrollPane.setBounds(10, 10, 1300, 700);
        c.add(scrollPane);
    }

    public void itemStateChanged(ItemEvent e)
    {
        for(int i=0;i<bb.veggies_pro;i++)
        veggie_choice_index[i]=cb1[i].getSelectedIndex();
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        for(int i=0;i<bb.veggies_pro;i++)
        {
            if(ae.getSource()==b1[i])
            {
                String pro_name=l1[i].getText();
                // add to cart button has been clicked
                //add that product in hashtable
                 quan2=t1[i].getText();
                 System.out.println(quan2);
                 if(cb1[i].getSelectedIndex()==0){
                 bb.stock_veggies[i]-=Double.parseDouble(quan2)*0.5;
                 beverages.price+=bb.price_vegies[i]*Double.parseDouble(quan2);
                 }
                 
                 else{
                 bb.stock_veggies[i]-=Double.parseDouble(quan2);
                 beverages.price+=bb.price_vegies1[i]*Double.parseDouble(quan2);
                 }
                beverages.cart.put(veggie_id[i],pro_name);
                cb1[i].addItemListener(this);
               
            }
        }
        
        if(ae.getSource()==b5)

        {
            String search=t.getText();
            stock st=new stock();
            st.create_stock();
            try {
               ArrayList<String> str= st.search_veggies(search);
               veggies_search_res vsr=new veggies_search_res(str,beverages.cart);
               vsr.setSize(1500,1000);
               vsr.setVisible(true);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
            }
            st.create_stock();  
        }
      
        if(ae.getSource()==b)
        {
            //cart button is clicked, then show the cart
            //we have the data in hashTable, just print the product list on cart page 
           
            Cart c1=new Cart(beverages.cart);
            c1.setSize(1500,1000);
            c1.setVisible(true);
        }

    }
}

class veggies_search_res extends stock implements ActionListener,ItemListener
{
    TextField t1[]=new TextField[50],t;                                       //t1-getting quantity
    JLabel l1[]=new JLabel[50],l;     
    Choice cb1[]=new Choice[50];
    JButton b1[]=new JButton[50],b;
    int y=100;
    bigBasket bb=new bigBasket();  
    veggies obj=new veggies();
    //static final int veggies_choice_index[]=new int[16];
    ArrayList al;
    int i;
    veggies_search_res(ArrayList al,Hashtable cart)
    {
        
            this.al=al;
           
            Container c=getContentPane();
            c.setSize(1500,1000);
            c.setLayout(null);
            // Create a panel with buttons and labels and textfields
            JPanel panel = new JPanel(null);
            
                  
            //hardcoded values of products saved in menu of bigBasket class
            
            b=new JButton("Cart");
            //add all the products to the page
            for(Object o:al)
            {
               
                l1[i]=new JLabel(o.toString());                  //product name
                t1[i]=new TextField(5);          //to take quantity
                b1[i]=new JButton("Add to cart");   //button to add product to cart
                cb1[i]=new Choice();
                for(int j=0;j<16;j++)
                {
                    
                    if(o.toString().equals(bb.veggiesFruits[j]))
                    {
                        
                        cb1[i].add(bb.quantity_veggie_stock[j]+" Kg ( Rs."+bb.price_vegies[j]+")");
                        cb1[i].add(bb.quantity_veggie_stock1[j]+" Kg ( Rs."+bb.price_vegies1[j]+")");
                        break;
                    }
                }
                
                i++;
            }
            //set bounds
           
            b.setBounds(1000,25,300,50);
    
          
            for(int k=0;k<i;k++)
            {
                l1[k].setBounds(25,y,200,50);
                b1[k].setBounds(250,y+25,200,25);
                y+=70;
                cb1[k].setBounds(25,y,200,50);
                y+=50;
            }
            
            panel.setPreferredSize(new Dimension(1500, y));
            
            panel.add(b);
            
            for(int k=0;k<i;k++)
            {
                panel.add(l1[k]);
                panel.add(cb1[k]);
                panel.add(b1[k]);    
            }
            //add actionListener to each button
            for(int k=0;k<i;k++)
            {
                b1[k].addActionListener(this);
                cb1[k].addItemListener(this);
            }
            b.addActionListener(this);
             // Add the panel to a scroll pane
    
            JScrollPane scrollPane = new JScrollPane(panel); 
            // create scroll pane with panel as the view
            scrollPane.setBounds(10, 10, 1300, 700);
            c.add(scrollPane);
        }
        public void itemStateChanged(ItemEvent e)
       {
        ListIterator it=al.listIterator();

        for(int k=0;k<i;k++)
        {
        String pro=it.next().toString();
        for(int z=0;z<16;z++)
        {
            if(bb.veggiesFruits[z].equals(pro))
            {
            obj.veggie_choice_index[z]=cb1[k].getSelectedIndex();
            }
        }
        
        }
    }

    public void actionPerformed(ActionEvent ae)
    {
        for(int k=0;k<i;k++)
        {
            if(ae.getSource()==b1[k])
            {
               
                String pro_name=l1[k].getText();
                // add to cart button has been clicked
                //add that product in hashtable
                for(int z=0;z<16;z++)
                {
                if(pro_name.equals(bb.veggiesFruits[z]))
                beverages.cart.put(veggies.veggie_id[z],pro_name);
                
                }
                
                
                //cb1[k].addItemListener(this);
            }}
        if(ae.getSource()==b)
        {
            //cart button is clicked, then show the cart
            //we have the data in hashTable, just print the product list on cart page 
           
            Cart c1=new Cart(beverages.cart);
            c1.setSize(1500,1000);
            c1.setVisible(true);
        }

    }
     
    


}

class bev_search_res extends stock implements ActionListener,ItemListener
{
    TextField t1[]=new TextField[50],t;                                       //t1-getting quantity
    JLabel l1[]=new JLabel[50],l;     
    Choice cb1[]=new Choice[50];
    JButton b1[]=new JButton[50],b;
    int y=100;
    bigBasket bb=new bigBasket();  
    beverages obj=new beverages();
   
    static final int bev_choice_index[]=new int[16];
    ArrayList al;
    int i;
    bev_search_res(ArrayList al,Hashtable cart)
    {
        
            this.al=al;
           
            Container c=getContentPane();
            c.setSize(1500,1000);
            c.setLayout(null);
            // Create a panel with buttons and labels and textfields
            JPanel panel = new JPanel(null);
            
            bb.menu();       
            //hardcoded values of products saved in menu of bigBasket class
            
            b=new JButton("Cart");
            //add all the products to the page
            for(Object o:al)
            {
               
                l1[i]=new JLabel(o.toString());                  //product name
                t1[i]=new TextField(5);          //to take quantity
                b1[i]=new JButton("Add to cart");   //button to add product to cart
                cb1[i]=new Choice();
                for(int j=0;j<16;j++)
                {
                    
                    if(o.toString().equals(bb.bev1[j]))
                    {
                        
                        cb1[i].add(bb.quantity_bev1_stock[j]+" Kg ( Rs."+bb.price_bev1[j]+")");
                        cb1[i].add(bb.quantity1_bev1_stock[j]+" Kg ( Rs."+bb.price1_bev1[j]+")");
                        break;
                    }
                }
                for(int j=0;j<20;j++)
                {
                   
                    if(o.toString().equals(bb.bev2[j]))
                    {
                        
                        cb1[i].add(bb.quantity_bev2_stock[j]+" L ( Rs."+bb.price_bev2[j]+")");
                        cb1[i].add(bb.quantity1_bev2_stock[j]+" L ( Rs."+bb.price1_bev2[j]+")");
                        break;
                    }
                }
                i++;
            }
            //set bounds
           
            b.setBounds(1000,25,300,50);
    
          
            for(int k=0;k<i;k++)
            {
                l1[k].setBounds(25,y,200,50);
                b1[k].setBounds(250,y+25,200,25);
                y+=70;
                cb1[k].setBounds(25,y,200,50);
                y+=50;
            }
            
            panel.setPreferredSize(new Dimension(1500, y));
            
            panel.add(b);
            
            for(int k=0;k<i;k++)
            {
                panel.add(l1[k]);
                panel.add(cb1[k]);
                panel.add(b1[k]);
                
            }
           
    
            //add actionListener to each button
            for(int k=0;k<i;k++)
            {
                b1[k].addActionListener(this);
                cb1[k].addItemListener(this);
            }
            b.addActionListener(this);
             // Add the panel to a scroll pane
    
            JScrollPane scrollPane = new JScrollPane(panel); 
            // create scroll pane with panel as the view
            scrollPane.setBounds(10, 10, 1300, 700);
            c.add(scrollPane);
        }
        public void itemStateChanged(ItemEvent e)
       {
        ListIterator it=al.listIterator();

        for(int k=0;k<i;k++)
        {
        String pro=it.next().toString();
        for(int z=0;z<16;z++)
        {
            if(bb.bev1[z].equals(pro))
            {
            obj.bev1_choice_index[z]=cb1[k].getSelectedIndex();
            }
        }
        for(int z=0;z<20;z++)
        {
            if(bb.bev2[z].equals(pro))
            obj.bev2_choice_index[z]=cb1[k].getSelectedIndex();
        }
        }
    }

    public void actionPerformed(ActionEvent ae)
    {
        for(int k=0;k<i;k++)
        {
            if(ae.getSource()==b1[k])
            {
               
                String pro_name=l1[k].getText();
                // add to cart button has been clicked
                //add that product in hashtable
                for(int z=0;z<16;z++)
                {
                if(pro_name.equals(bb.bev1[z]))
                beverages.cart.put(beverages.bev1_id[z],pro_name);
                
                }
                for(int z=0;z<20;z++)
                {
                if(pro_name.equals(bb.bev2[z]))
                beverages.cart.put(beverages.bev1_id[z],pro_name);
                
                }
                
                //cb1[k].addItemListener(this);
            }}
        if(ae.getSource()==b)
        {
            //cart button is clicked, then show the cart
            //we have the data in hashTable, just print the product list on cart page 
           
            Cart c1=new Cart(beverages.cart);
            c1.setSize(1500,1000);
            c1.setVisible(true);
        }

    }
     
    


}

class Cart extends JFrame implements ActionListener
{
    
    JLabel t,l1,l2,l3;        //l1 for item name, l2 for quantity,l3 for for price and quantity 
    JButton b1[]=new JButton[16],b3[]=new JButton[20],b4[]=new JButton[16],b5[]=new JButton[16],b2; 
    beverages obj=new beverages();
    bigBasket bb=new bigBasket();
    snaks obj2=new snaks();
    veggies obj3=new veggies();
    int y=150;
    int y2=150;
    int copy;
    String quan;
    
    Cart(Hashtable cart)
    {
        b2=new JButton("CHECKOUT");
        b2.setBounds(700,50,400,50);
        b2.setFont(new Font("Times New Roman",Font.PLAIN,30));  

        Container c=getContentPane();

        c.setSize(1500,1000);
        c.setLayout(null);
        // Create a panel with buttons and labels and textfields
        JPanel panel = new JPanel(null);
        bb.menu();


        if(cart.isEmpty())
        {
            
            t=new JLabel("Opps!, Your Cart is empty");
            t.setBounds(50,50,700,500);
            t.setFont(new Font("Times New Roman",Font.PLAIN,50));  
        }
        else
        {
            
            Enumeration  e=cart.keys();
           
            while(e.hasMoreElements())
            {
                String cart_item=(String)cart.get(e.nextElement());
                l1=new JLabel(cart_item);
                // b1[]=new JButton("Delete");
                //we have cart item name, we want its price quantity
                boolean flag=false;
                int btn=0;
               

                for(int j=0;j<16;j++)
                {
                    if(bb.bev1[j].equals(cart_item))
                    {
                         
                       
                        int choice=obj.bev1_choice_index[j];       //choice is the choice that is selected
                        int key=obj.bev1_id[j];

                        b1[j]=new JButton("Delete");
                        b1[j].setBounds(700,y2,300,50);
                        panel.add(b1[j]);

                        String quan_price=obj.cb1[j].getItem(choice);
                        l2=new JLabel("Quantity : "+obj.quan1);
                        l3=new JLabel(quan_price);
                        copy=j;
                        b1[j].addActionListener(new ActionListener()
                        {
                            
                            public void actionPerformed(ActionEvent ae)
                            {
                                //b3 is for bev2
                                //delete that bev2 from hashtable
                                
                                panel.remove(b1[copy]);
                                
                                panel.remove(l2);
                                panel.remove(l3);
                               
                                panel.remove(l1);

                                beverages.cart.remove(key);


                                
                            }
                        });
                        y2+=100;
                    }
                   
                    btn++;

                }
                
                for(int j=0;j<20;j++)
                {
                    if(bb.bev2[j].equals(cart_item))
                    {
                        //String quan=obj.quan1[j];
                        int choice=obj.bev2_choice_index[j];       //choice is the choice that is selected
                        int key=obj.bev2_id[j];

                        b3[j]=new JButton("Delete");
                        b3[j].setBounds(700,y2,300,50);
                        panel.add(b3[j]);
                        String quan_price=obj.cb1[j].getItem(choice);
                        l2=new JLabel("Quantity : "+obj.quan1);
                        l3=new JLabel(quan_price);
                        copy=j;
                        b3[j].addActionListener(new ActionListener()
                        {
                            
                            public void actionPerformed(ActionEvent ae)
                            {
                                //b3 is for bev2
                                //delete that bev2 from hashtable
                                
                                panel.remove(b3[copy]);
                                
                                panel.remove(l2);
                                panel.remove(l3);
                               
                                panel.remove(l1);

                                beverages.cart.remove(key);


                                
                            }
                        });
                        y2+=100;
                    }
                    btn++;
                   


                }
               
               for(int j=0;j<16;j++)
               {
                if(bb.snacks[j].equals(cart_item))
                    {
                      //  String quan=obj2.quan2[j];
                        int choice=obj2.snaks_choice_index[j];       //choice is the choice that is selected
                        int key=obj2.snaks_id[j];
                        b4[j]=new JButton("Delete");
                        b4[j].setBounds(700,y2,300,50);
                        panel.add(b4[j]);
                        String quan_price=obj2.cb1[j].getItem(choice);
                        
                        l2=new JLabel("Quantity : "+obj2.quan3);
                        l3=new JLabel(quan_price);
                        copy=j;
                        b4[j].addActionListener(new ActionListener()
                        {
                            
                            public void actionPerformed(ActionEvent ae)
                            {
                                //b3 is for bev2
                                //delete that bev2 from hashtable
                                
                                panel.remove(b4[copy]);
                                
                                panel.remove(l2);
                                panel.remove(l3);
                               
                                panel.remove(l1);

                                beverages.cart.remove(key);


                                
                            }
                        });
                        y2+=100;
                    }
                    
               }
               for(int j=0;j<16;j++)
                {
                    if(bb.veggiesFruits[j].equals(cart_item))
                    {
                       
                        int choice=obj3.veggie_choice_index[j];       //choice is the choice that is selected
                        int key=obj3.veggie_id[j];

                        b5[j]=new JButton("Delete");
                        b5[j].setBounds(700,y2,300,50);
                        panel.add(b5[j]);
                        String quan_price=obj3.cb1[j].getItem(choice);
                        l2=new JLabel("Quantity : "+obj3.quan2);
                        l3=new JLabel(quan_price);
                        copy=j;
                        b5[j].addActionListener(new ActionListener()
                        {
                            
                            public void actionPerformed(ActionEvent ae)
                            {
                                //b3 is for bev2
                                //delete that bev2 from hashtable
                                
                                panel.remove(b5[copy]);
                                
                                panel.remove(l2);
                                panel.remove(l3);
                               
                                panel.remove(l1);

                                beverages.cart.remove(key);


                                
                            }
                        });
                        y2+=100;
                    }

                }

               
               
                
                //for first cart_item, we got quantity , price and basic quantity of product added to the cart
                //add the buttons,labels for same item first and then go for next item
                l1.setBounds(25,y,300,50);                        
                l2.setBounds(25,y+50,300,50);
                l3.setBounds(350,y,300,50);
                y+=100;
                
               
                
                panel.add(l1);
                panel.add(l2);
                panel.add(l3);
               // panel.add(b1);

                // Add the panel to a scroll pane

            }
            panel.add(b2);

            b2.addActionListener(this);
            //b1.addActionListener(this);

            panel.setPreferredSize(new Dimension(1500, y));
            
            JScrollPane scrollPane = new JScrollPane(panel); 
            // create scroll pane with panel as the view
            scrollPane.setBounds(10, 10, 1300, 700);
            c.add(scrollPane);
            
        }

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
        {
            checkout_page c=new checkout_page();
            c.setSize(1500,1000);
            c.setVisible(true);
        }

    }
}

class checkout_page extends JFrame implements ActionListener,ItemListener
{
    JLabel l1,l2,l3,l4,l5;
    TextField t1;
    Choice area;
    JButton b1;
    JRadioButton r1,r2,r3;
    Date dt = new Date();
    int index;
    static String dest;
    static String address;

    checkout_page()
    {
        Container c=getContentPane();
        c.setSize(1500,1000);
        c.setLayout(null);
        
        l1=new JLabel("Enter following details to confirm the order");
        l2=new JLabel("Enter delivery address");
        t1=new TextField(30);
        l3=new JLabel("PAYMENT METHOD");
        l4=new JLabel("TOTAL : ");
        l5=new JLabel("DELIVERY CHARGES : ");
        b1=new JButton("PLACE ORDER");
        r1=new JRadioButton("UPI Apps");
        r2=new JRadioButton("Pay with Debit/Credit/ATM Cards");   //take card details
        r3=new JRadioButton("Cash on Delivery");
        area=new Choice();
        area.add("Ambegaon-Budruk");
        area.add("Aundh");
        area.add("Baner");
        area.add("Kothrud");
        area.add("Balewadi");
        area.add("Shivajinagar");
        area.add("Bibvewadi");
        area.add("Bhugaon");
        area.add("Bavdhan-Khurd");
        area.add("Karve-Nagar");
        area.add("Hadapsar");
        area.add("Katraj");
        area.add("Kondhwa");
        area.add("Koregaon-Park");
        area.add("Warje");

        l1.setBounds(25,25,1400,25);
        l2.setBounds(25,75,900,25);
        t1.setBounds(50,125,900,30);
        area.setBounds(25,180,900,45);
        l3.setBounds(25,275,900,50);
        r1.setBounds(50,350,500,50);
        r2.setBounds(50,425,500,50);
        r3.setBounds(50,500,500,50);
        b1.setBounds(25,600,1475,75);
        

        c.add(b1);
        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(r1);
        c.add(r2);
        c.add(r3);
        c.add(t1);
        c.add(area);

        b1.addActionListener(this);
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        area.addItemListener(this);


    }

    public void actionPerformed(ActionEvent ae) 
    {
        
        if(ae.getSource()==b1)
        {
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now= LocalDateTime.now();
            address=t1.getText();
            
            dest=area.getItem(index);
            System.out.println("dest ->"+dest);
            
            
            try
            {
            confirmation_page cp=new confirmation_page(now,dest);
            System.out.println(dest);
            cp.setSize(1500,1000);
            cp.setVisible(true);
            }
            catch(IOException e)
            {
            }
        }
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(r1.getModel().isSelected())
        {
            //if upi payment open new page 
            upi u=new upi();
            u.setBounds(400,100,500,500);
            u.setVisible(true);
            
          
        }
         index=area.getSelectedIndex();
        dest=area.getItem(index);
        System.out.println("DEST_> "+dest);
        

        
    }
    
    
}

class confirmation_page extends JFrame 
{

    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,x1;
    LocalDateTime now;
    String area;
    Calendar cal;
    int mins;
    String del_time;
    JButton b1;
    //summary of order
    confirmation_page(LocalDateTime now,String dest) throws IOException
    {

        System.out.println("Inside confirmation pafe "+dest);
        
        setSize(1500,1000);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(0,0);

		x1 = new JLabel("");
          
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/confirm.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1500, 1000,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                x1 = new JLabel(i2);
                
                    x1.setBounds(0, 0, 1500, 1000);
                    add(x1);
        this.now=now;
        this.area=dest;
        System.out.println("NOW_> "+now);
        System.out.println(area);
        packaging p=new packaging(now,"Katraj");
        
        mins=p.packaging();
        System.out.println("Mins-> "+mins);

       // ShortestPath sp=new ShortestPath();
        // time t=new time(area);
        // t.read();
        cal=Calendar.getInstance();

        int del_date=cal.get(Calendar.HOUR);
        int del_mnt=cal.get(Calendar.MINUTE);
        int del_year=cal.get(Calendar.SECOND);

        String del_day=del_date+"-"+del_mnt+"-"+del_year;
       //time of order
       
        cal.add(Calendar.MINUTE,mins);

        int del_date1=cal.get(Calendar.HOUR);
        int del_mnt1=cal.get(Calendar.MINUTE);
        int del_year1=cal.get(Calendar.SECOND);
        int del_date2=cal.get(Calendar.DATE);
        int del_mnt2=cal.get(Calendar.MONTH);
        int del_year2=cal.get(Calendar.YEAR);
        int am_pm=cal.get(Calendar.AM_PM);
        String del_day1=del_date1+":"+del_mnt1+":"+del_year1;
        
        String date=del_date2+"/"+del_mnt2+"/"+del_year2+" "+am_pm;
       
        //time of delivery

        // String del_day=del_date+"-"+del_mnt+"-"+del_year;
        // String s1=cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);

       // User obj=new User();
       // String name=obj.t2.getText();
       user_data_node node=stock.q.getLast();
         
        l=new JLabel("Hello "+node.name);          
        l1=new JLabel("Area \n\t"+dest);
        l2=new JLabel("Your Order is Confirmed!"); ///get the area
        l3=new JLabel("Thank you for shopping with us .We'd like to let you know that 24/7 Grocery has received your order.");
       
        l4=new JLabel("Your estimated delivery date is "+date);
        l7=new JLabel("Till "+del_day1);
        l8=new JLabel("Total Price :"+ beverages.price);
        l9=new JLabel("No Of Items "+beverages.cart.size());
        l10=new JLabel("Thank You!");
        l.setFont(new Font("Times New Roman",Font.BOLD,30));
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        l2.setFont(new Font("Times New Roman",Font.BOLD,30));
        l3.setFont(new Font("Times New Roman",Font.PLAIN,30));
        l4.setFont(new Font("Times New Roman",Font.PLAIN,30));
        
        
        l7.setFont(new Font("Times New Roman",Font.BOLD,30));
        l8.setFont(new Font("Times New Roman",Font.PLAIN,30));
        l9.setFont(new Font("Times New Roman",Font.PLAIN,30));
        l10.setFont(new Font("Times New Roman",Font.PLAIN,30));
         
          
       
        l.setBounds(25,25,300,50);
        l1.setBounds(25,100,400,50);
        l2.setBounds(25,160,500,50);
        l3.setBounds(25,230,1479,50);
        l4.setBounds(50,300,800,50);
        l7.setBounds(50,375,300,50);
        l8.setBounds(25,450,1479,50);
        l9.setBounds(50,525,300,50);
        l10.setBounds(50,600,300,25);
        
        

        x1.add(l);
        x1.add(l1);
        x1.add(l2);
        x1.add(l3);
        x1.add(l4);
        
        x1.add(l7);
        x1.add(l8);
        x1.add(l9);
        x1.add(l10);
        
        

    }
    

    
}




//we need a queue  in which we are going to add the data
class node
{
   node next;
   String name;
   String address;
   long ph_no;
   String email_add;
   String city;
   int pincode;
   int pay_method;
   int offer_code;
   double price;
   int veggie_no[]=new int[50];
   int beverage_no[]=new int[50];
   String veggie[]=new String[50];
   String beverage[]=new String[50];
   double veggie_quan[]=new double[50];
   int beverage_quan[]=new int[50];
   double veggie_price[]=new double[50];
   double beverage_price[]=new double[50];
   int order_no=0,items;
   double quantity_veggie_stock[]=new double[20];
   int quantity_beverage_stock[]=new int[20];
   double savings;
}

class bigBasket extends JFrame 
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    node front,rear;
    static String bev1[]=new String[50];                       //array of beverages in Kg
    static double price_bev1[] = new double[50];               //each beverage has 2 quantities in g and in kg
    static double price1_bev1[] = new double[50];
    static double quantity_bev1_stock[] = new double[50];
    static double quantity1_bev1_stock[] = new double[50];
    static int bev1_pro=16;
    

    static String bev2[]=new String[50];                          //array of beverages in L
    static double price_bev2[] = new double[50];                  //each beverage has 2 quantities
    static double price1_bev2[] = new double[50];
    static double quantity_bev2_stock[] = new double[50];         //stock of each beverage 
    static double quantity1_bev2_stock[] = new double[50];
    static int stock_bev1[]=new int[50];
    static int stock_bev2[]=new int[50];
    static int bev2_pro=20;
    
   
    static String snacks[]=new String[50];
    static int snacks_quantity[]=new int[50];
    static double price_snacks[]=new double[50];
    static int stock_snaks[]=new int[50];
    static int snaks_pro=16;


    static String veggiesFruits[]=new String[50];                 //array of beverages in L
    static double price_vegies[] = new double[50];                //each beverage has 2 quantities
    static double price_vegies1[] = new double[50];
    static double quantity_veggie_stock[] = new double[50];            //stock of each beverage 
    static double quantity_veggie_stock1[] = new double[50];
    static int stock_veggies[]=new int[50];
    static int veggies_pro=16;

    
    bigBasket()
    {
        front=null;
        rear=null;
        for(int i=0;i<50;i++)
        {
            stock_bev1[i]=100;
            stock_bev2[i]=100;
            stock_snaks[i]=100;        //packets quantity
            stock_veggies[i]=100;      //in kg
        }
    }
   
    void menu()
    {

        veggiesFruits[0]="Potato";
        quantity_veggie_stock[0]=0.5;
        price_vegies[0]=25;
        quantity_veggie_stock1[0]=1;
        price_vegies1[0]=45;

        veggiesFruits[1]="Carrot";
        quantity_veggie_stock[1]=0.5;
        price_vegies[1]=19.50;
        quantity_veggie_stock1[1]=1;
        price_vegies1[1]=39;

       

        veggiesFruits[2]="Capsicum";
        quantity_veggie_stock[2]=0.5;
        price_vegies[2]=42;
        quantity_veggie_stock1[2]=1;
        price_vegies1[2]=84;

       

        veggiesFruits[3]="Cauliflower";

        quantity_veggie_stock[3]=0.5;

        price_vegies[3]=20;

        quantity_veggie_stock1[3]=1;

        price_vegies1[3]=35;

       

         veggiesFruits[4]="Capsicum";

        quantity_veggie_stock[4]=0.5;

        price_vegies[4]=42;

        quantity_veggie_stock1[4]=1;

        price_vegies1[4]=84;

       

         veggiesFruits[5]="Onion";

        quantity_veggie_stock[5]=1;

        price_vegies[5]=17.5;

        quantity_veggie_stock1[5]=2;

        price_vegies1[5]=35;

       

         veggiesFruits[6]="Ladies' Finger";

        quantity_veggie_stock[6]=0.25;

        price_vegies[6]=18.5;

        quantity_veggie_stock1[6]=0.5;

        price_vegies1[6]=37;

       

         veggiesFruits[7]="Tomato-Hybrid(Loose)";

        quantity_veggie_stock[7]=0.5;

        price_vegies[7]=11.5;

        quantity_veggie_stock1[7]=1;

        price_vegies1[7]=23;

       

         veggiesFruits[8]="Cucumber(Loose)";

        quantity_veggie_stock[8]=0.5;

        price_vegies[8]=13.5;

        quantity_veggie_stock1[8]=1;

        price_vegies1[8]=27;

       

         veggiesFruits[9]="Broccoli";

        quantity_veggie_stock[9]=0.25;

        price_vegies[9]=15;

        quantity_veggie_stock1[9]=0.5;

        price_vegies1[9]=28;

       

         veggiesFruits[10]="Coriander Leaves";

        quantity_veggie_stock[10]=0.25;

        price_vegies[10]=32;

        quantity_veggie_stock1[10]=0.5;

        price_vegies1[10]=61;

       

         veggiesFruits[11]="Cabbage";

        quantity_veggie_stock[11]=0.5;

        price_vegies[11]=14.5;

        quantity_veggie_stock1[11]=1;

        price_vegies1[11]=29;

       

        veggiesFruits[12]="Beetroot";

        quantity_veggie_stock[12]=0.5;

        price_vegies[12]=14.5;

        quantity_veggie_stock1[12]=1;

        price_vegies1[12]=29;

       

        veggiesFruits[13]="Palak-Cleaned,without roots";

        quantity_veggie_stock[13]=0.25;

        price_vegies[13]=23;

        quantity_veggie_stock1[13]=1;

        price_vegies1[13]=45;

       

        veggiesFruits[14]="Garlic(Loose)";

        quantity_veggie_stock[14]=0.1;

        price_vegies[14]=14.5;

        quantity_veggie_stock1[14]=0.5;

        price_vegies1[14]=71.5;

       

        veggiesFruits[15]="Ginger";

        quantity_veggie_stock[15]=0.1;

        price_vegies[15]=13.5;

        quantity_veggie_stock1[15]=0.5;

        price_vegies1[15]=66.5;

       
        bev1[0]="Organic Tea - Tulsi & Ginger";
quantity_bev1_stock[0]= 0.5;
quantity1_bev1_stock[0]=1;
price_bev1[0]=250;
   price1_bev1[0]=420;
   bev1[1]="Tea ( Taj Mahal )";
quantity_bev1_stock[1]= 0.5;
quantity1_bev1_stock[1]=1;
price_bev1[1]=361.50;
   price1_bev1[1]=825;
   bev1[2]="Orgainc Original Tulsi Tea";
quantity_bev1_stock[2]= 0.5;
quantity1_bev1_stock[2]=1;
price_bev1[2]=245;
   price1_bev1[2]=460;
   bev1[3]="Instant Tea - Premix with Ginger";
quantity_bev1_stock[3]= 0.5;
quantity1_bev1_stock[3]=1;
price_bev1[3]=311.20;
   price1_bev1[3]=508.4;
   bev1[4]="Tea - Natural Care ( Red Label )";
quantity_bev1_stock[4]= 0.5;
quantity1_bev1_stock[4]=1;
price_bev1[4]=533;
   price1_bev1[4]=286;
   bev1[5]="Tea ( Red Label )";
quantity_bev1_stock[5]= 0.5;
quantity1_bev1_stock[5]=1;
price_bev1[5]=270;
   price1_bev1[5]=468;
   bev1[6]="Tea ( Society )";
quantity_bev1_stock[6]= 0.5;
quantity1_bev1_stock[6]=1;
price_bev1[6]=300;
   price1_bev1[6]=550;
   bev1[7]="Tea ( Tata Tea Gold )";
quantity_bev1_stock[7]= 0.5;
quantity1_bev1_stock[7]=1;
price_bev1[7]=280;
   price1_bev1[7]=680.97;
   bev1[8]="Assam Teas ( Tata Tea Gold )";
quantity_bev1_stock[8]= 0.5;
quantity1_bev1_stock[8]=1;
price_bev1[8]=241;
   price1_bev1[8]=474.24;
   bev1[9]="Premium Leaf Tea";
quantity_bev1_stock[9]= 0.5;
quantity1_bev1_stock[9]=1;
price_bev1[9]=251.50;
   price1_bev1[9]=565;
   bev1[10]="Long Leaf Original Green Tea";
quantity_bev1_stock[10]= 0.5;
quantity1_bev1_stock[10]=1;
price_bev1[10]=626;
   price1_bev1[10]=933;
   bev1[11]="Horlicks";
quantity_bev1_stock[11]= 0.5;
quantity1_bev1_stock[11]=1;
price_bev1[11]=294;
   price1_bev1[11]=501;
   bev1[12]="Nutritional Powder ( Pediasure )";
quantity_bev1_stock[12]= 0.5;
quantity1_bev1_stock[12]=1;
price_bev1[12]=690;
   price1_bev1[12]=1256;
   bev1[13]="Classic Malt ( Horlicks )";
quantity_bev1_stock[13]= 0.5;
quantity1_bev1_stock[13]=1;
price_bev1[13]=456;
   price1_bev1[13]=809;
   bev1[14]="Instant Energy Health Drink";
quantity_bev1_stock[14]= 0.5;
quantity1_bev1_stock[14]=1;
price_bev1[14]=125.10;
   price1_bev1[14]=290;
   bev1[15]="Chocolate Health Drink - Bournvita";
quantity_bev1_stock[15]= 0.5;
quantity1_bev1_stock[15]=1;
price_bev1[15]=245;
   price1_bev1[15]=490;
   bev2[0]="Thums Up";
quantity_bev2_stock[0]= 0.5;
quantity1_bev2_stock[0]=1;
price_bev2[0]=34;
   price1_bev2[0]=65;
   bev2[1]="Sparkling Water - Club Soda";
quantity_bev2_stock[1]= 0.5;
quantity1_bev2_stock[1]=1;
price_bev2[1]=15;
   price1_bev2[1]=26.60;
   bev2[2]="Soft Drink ( Sprite )";
quantity_bev2_stock[2]= 0.5;
quantity1_bev2_stock[2]=1;
price_bev2[2]=14.20;
   price1_bev2[2]=20;
   bev2[3]="Diet Coke Soft Drink";
quantity_bev2_stock[3]= 0.5;
quantity1_bev2_stock[3]=1;
price_bev2[3]=50;
   price1_bev2[3]=87;
   bev2[4]="Soft Drink ( Mirinda )";
quantity_bev2_stock[4]= 0.5;
quantity1_bev2_stock[4]=1;
price_bev2[4]=40;
   price1_bev2[4]=80;
   bev2[5]="Soda - Original Ginger Ale";
quantity_bev2_stock[5]= 0.5;
quantity1_bev2_stock[5]=1;
price_bev2[5]=90;
   price1_bev2[5]=175;
   bev2[6]="Soft Drink - Lime & Lemon Flavoured";
quantity_bev2_stock[6]= 0.5;
quantity1_bev2_stock[6]=1;
price_bev2[6]=38;
   price1_bev2[6]=76;
   bev2[7]="Ultra Energy Drink - Zero Sugar ( Monster )";
quantity_bev2_stock[7]= 0.5;
quantity1_bev2_stock[7]=1;
price_bev2[7]=230;
   price1_bev2[7]=460;
   bev2[8]="Energy Drink ( Sting )";
quantity_bev2_stock[8]= 0.5;
quantity1_bev2_stock[8]=1;
price_bev2[8]=40;
   price1_bev2[8]=80;
   bev2[9]="Soft Drink - Orange Falvoured ( Fanta )";
quantity_bev2_stock[9]= 0.5;
quantity1_bev2_stock[9]=1;
price_bev2[9]=40;
   price1_bev2[9]=68;
   bev2[10]="Soft Drink ( Mountain Dew )";
quantity_bev2_stock[10]= 0.5;
quantity1_bev2_stock[10]=1;
price_bev2[10]=40;
   price1_bev2[10]=80;
   bev2[11]="Non Alcoholic Beer - Malt";
quantity_bev2_stock[11]= 0.5;
quantity1_bev2_stock[11]=1;
price_bev2[11]=89;
   price1_bev2[11]=178;
   bev2[12]="Original Mojito";
quantity_bev2_stock[12]= 0.5;
quantity1_bev2_stock[12]=1;
price_bev2[12]=175;
   price1_bev2[12]=350;
   bev2[13]="Kiwi Mojito";
quantity_bev2_stock[13]= 0.5;
quantity1_bev2_stock[13]=1;
price_bev2[13]=215;
   price1_bev2[13]=430;
   bev2[14]="Spyci - Masala Maarke ( Bisleri )";
quantity_bev2_stock[14]= 0.5;
quantity1_bev2_stock[14]=1;
price_bev2[14]=20;
   price1_bev2[14]=40;
   bev2[15]="Fruit Power Juice - Mixed";
quantity_bev2_stock[15]= 0.5;
quantity1_bev2_stock[15]=1;
price_bev2[15]=62.5;
   price1_bev2[15]=125;
   bev2[16]="Fruit Juice - Masala Guava";
quantity_bev2_stock[16]= 0.5;
quantity1_bev2_stock[16]=1;
price_bev2[16]=35;
   price1_bev2[16]=70;
   bev2[17]="Rooh Afza Sharbat";
quantity_bev2_stock[17]= 0.5;
quantity1_bev2_stock[17]=1;
price_bev2[17]=140;
   price1_bev2[17]=235;
   bev2[18]="Mango Fruit Power Juice";
quantity_bev2_stock[18]= 0.5;
quantity1_bev2_stock[18]=1;
price_bev2[18]=57;
   price1_bev2[18]=115;
   bev2[19]="Pomogranate Juice";
quantity_bev2_stock[19]= 0.5;
quantity1_bev2_stock[19]=1;
price_bev2[19]=270;
   price1_bev2[19]=360;  

        

           //snaks hardcoded data
           
    
    snacks[0]="Bournville";
    snacks_quantity[0]=80;
     price_snacks[0]=95;

    snacks[1]="Minis-Home Treats,Mini Chocolate Bars";
    snacks_quantity[1]=119;
 price_snacks[1]=333.5;

    snacks[2]="Chocomini";
    snacks_quantity[2]=250;
     price_snacks[2]=140;

    snacks[3]="Maggie";
    snacks_quantity[3]=70;
     price_snacks[3]=14;


    snacks[4]="Cheese Macaroni Pazzta[Maggie]";
    snacks_quantity[4]=70;
     price_snacks[4]=32;


    snacks[5]="Jim Jam Cream Biscuit";
    snacks_quantity[5]=92;
     price_snacks[5]=25;

    snacks[6]="Monacco Classic";
    snacks_quantity[6]=800;
     price_snacks[6]=120;

    snacks[7]="Bourbon Cream Biscuit";
    snacks_quantity[7]=150;
     price_snacks[7]=38;

    snacks[8]="Hide & Seek Chocolate";
    snacks_quantity[8]=100;
     price_snacks[8]=30;

    snacks[9]="Kurkure Namkeen-Masala";
    snacks_quantity[9]=70;
     price_snacks[9]=54;

    snacks[10]="Lays Potato Chips- American Style Cream & Onion Flavour";
    snacks_quantity[10]=90;
     price_snacks[10]=50;

    snacks[11]="Puffcorn[Kurkure]";
    snacks_quantity[11]=55;
     price_snacks[11]=20;

    snacks[12]="Mad Angels-Achaari Masti,Crunchy Triangle Chips";
    snacks_quantity[12]=66;
     price_snacks[12]=20;

    snacks[13]="Corn Flakes(6)multipack";
    snacks_quantity[13]=65;
     price_snacks[13]=102;


    snacks[14]="Saffola Oats";
    snacks_quantity[14]=1000;
     price_snacks[14]=399;


    snacks[15]="YiPPee! Magic Masala Noodles-Pack of 2";
    snacks_quantity[15]=135;
    price_snacks[15]=95.1;
    }


}

class node2_bev
{
    node2_bev left,right;
 String product;
     double quan;  
}

class node2_veggies
{
    node2_veggies left,right;
     String product;
     double quan;  
}  

class node2_snaks
{
    node2_snaks left,right;
     String product;
     double quan;  
}

class stock extends bigBasket
{
    static node2_bev root;
    static node2_veggies root2;
    static node2_snaks root3;
    String pro;
    static LinkedList<user_data_node> q=new LinkedList<user_data_node>();
   
     //this class has information about the stocks available in the class bigBasket

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     static node2_bev ptr[]=new node2_bev[36];
     static node2_veggies ptr2[]=new node2_veggies[16];
     static node2_snaks ptr3[]=new node2_snaks[16];
    bigBasket bb=new bigBasket();

    stock()
    {
    System.out.println("Called");
    }
      void create_stock()
      {
        //first add all the available quantity stock in binary search tree
      
        
        bb.menu();
        for(int i=0;i<bb.bev1_pro+bb.bev2_pro;i++)
        {
         ptr[i]=new node2_bev();
         
        }
        for(int i=0;i<bb.veggies_pro;i++)
        {
            ptr2[i]=new node2_veggies();
         
        }
        for(int i=0;i<bb.snaks_pro;i++)
        {
            ptr3[i]=new node2_snaks();
         
        }
        int j=0;
        for(int i=0;i<bb.bev1_pro;i++)
        {
          
            ptr[j].product=bb.bev1[i];
            ptr[j].quan=bb.stock_bev1[i];
            j++;
           
        }
        for(int i=0;i<bb.bev2_pro;i++)
        {
            
            ptr[j].product=bb.bev2[i];
            ptr[j].quan=bb.stock_bev2[i];
            j++;
           
        }
        for(int i=0;i<bb.veggies_pro;i++)
        {           
            ptr2[i].product=bb.veggiesFruits[i];
            ptr2[i].quan=bb.stock_veggies[i];
          
        }
        for(int i=0;i<bb.snaks_pro;i++)
        {
            ptr3[i].product=bb.snacks[i];
            ptr3[i].quan=bb.stock_snaks[i];
           
        }
       
        for(int i=0;i<bb.bev1_pro+bb.bev2_pro;i++)
        {
        ptr[i].left=null;
        ptr[i].right=null;
        }
        for(int i=0;i<bb.veggies_pro;i++)
        {
        ptr2[i].left=null;
        ptr2[i].right=null;
        }
        for(int i=0;i<bb.snaks_pro;i++)
        {
        ptr3[i].left=null;
        ptr3[i].right=null;
        }

       
       
        for(int i=0;i<bb.bev1_pro+bb.bev2_pro;i++)
        {
            if(root==null)
             root=ptr[i];
            else
            {
                node2_bev prev,curr;
                prev=null;
                curr=root;
               
                while(curr!=null )
                {
               
                    prev=curr;
                     if(prev.product.compareToIgnoreCase(ptr[i].product)>0)
                      curr=curr.left;
                     else
                      curr=curr.right;
                    //cur is the place where node2 is to be added
                }
               
                if((prev.product).compareToIgnoreCase(ptr[i].product)>0)
                {
                  prev.left=ptr[i];
                }
               
                else
                  prev.right=ptr[i];
            }
        }
        for(int i=0;i<bb.veggies_pro;i++)
        {
            if(root2==null)
            root2=ptr2[i];

            else
            {
                node2_veggies curr,prev;
                prev=null;
                curr=root2;
               
                while(curr!=null )
                {
               
                    prev=curr;
                     if(prev.product.compareToIgnoreCase(ptr2[i].product)>0)
                      curr=curr.left;
                     else
                      curr=curr.right;
                    //cur is the place where node2 is to be added
                }
                if((prev.product).compareToIgnoreCase(ptr2[i].product)>0)
                {
                    prev.left=ptr2[i];
                }
               
                else
                prev.right=ptr2[i];
            }
        }
        for(int i=0;i<bb.snaks_pro;i++)
        {
            if(root3==null)
             root3=ptr3[i];
            else
            {
                node2_snaks prev,curr;
                prev=null;
                curr=root3;
               
                while(curr!=null )
                {
               
                    prev=curr;
                     if(prev.product.compareToIgnoreCase(ptr3[i].product)>0)
                      curr=curr.left;
                     else
                      curr=curr.right;
                    //cur is the place where node2 is to be added
                    
                }
               
                if((prev.product).compareToIgnoreCase(ptr3[i].product)>0)
                {
                  prev.left=ptr3[i];
                }
               
                else
                  prev.right=ptr3[i];
            }
        }

     }

     void delete_veggies(String delete)
     {
       
        node2_veggies cur,prev;
       System.out.println("Delete "+delete);
    prev=null;
    cur=root2;
    System.out.println("root2 "+cur.product);
    while(cur!=null && !cur.product.trim().contains(delete))
    {
    prev=cur;
    if((prev.product.toLowerCase()).compareToIgnoreCase(delete.toLowerCase())>0)
    cur=cur.left;
    else
    cur=cur.right;
    }
    if(cur==null)
    {
        System.out.println("  Not Found");
    }
    else
    {
        //delete cur
        if(cur.left==null && cur.right==null)
        {
        
        //NODE IS LEAF NODE
        if(prev==null)
        {
        //root node is the only node to be deleted
        root=null;
        cur=null;
        
        }
        else
        {
        if((prev.product).compareToIgnoreCase(delete)>0)
        {
        prev.left=null;
       cur=null;
       System.out.println("Deleted");
              
        }
        else
        {
        prev.right=null;
               cur=null;
               System.out.println("Deleted");
              
        }
        }
        }
        else if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root2=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(delete)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");
 }
 else
 {
 prev.right=cur.left;
        cur.left=null;
        System.out.println("Deleted");
 }
 }
 }
 else if(cur.left==null && cur.right!=null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root2=cur.right;
 cur.right=null;
 cur=null;
 System.out.println("Deleted");
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(delete)>0)
 {
 prev.left=cur.right;
 cur.right=null;
 cur=null;
 }
 else
 {
 prev.right=cur.right;
        cur.right=null;
        cur=null;
        System.out.println("Deleted");
     
 }
 }
 }

 else if(cur.left!=null && cur.right!=null)
 {
 node2_veggies temp;
 temp=cur;
 temp=cur.left;
 while(temp.right!=null)
 temp=temp.right;
 temp.right=cur.right;
 cur.right=null;
 //now if current has a left subtree
 if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root2=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");
 }
 else
 {
 if((prev.product).compareToIgnoreCase(delete)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");

 }
 else
 {
 prev.right=cur.left;
        cur.left=null;System.out.println("Deleted");}
    }}}


    }
   
    bigBasket bb=new bigBasket();
    int index=0;
    for(int i=0;i<bb.veggies_pro;i++)
    {
        if(bb.veggiesFruits[i].equals(delete))
        {
            
            // bb.snacks[i]="";
            // bb.snacks_quantity[i]=0;
            // bb.price_snacks[i]=0;
            // bb.stock_snaks[i]=0;
            // System.out.println("After deleting inside method satisfying if condition to make that snack null in bigBasket menu -> ");
            index=i;
            
            
        }
        
        System.out.println(bb.veggiesFruits[i]);
    }

    for(int i=index+1;i<bb.veggies_pro;i++)
    {
        bb.veggiesFruits[i-1]=bb.veggiesFruits[i];

    }
    bb.veggies_pro--;
    for(int i=0;i<bb.veggies_pro;i++)
    {
        System.out.println(bb.veggiesFruits[i]);
    }
     
     }

     void delete_snaks(String delete)
     {
       
        node2_snaks cur,prev;
       System.out.println("Delete "+delete);
    prev=null;
    cur=root3;
    System.out.println("root3 "+cur.product);
    while(cur!=null && !cur.product.trim().contains(delete))
    {
    prev=cur;
    if((prev.product.toLowerCase()).compareToIgnoreCase(delete.toLowerCase())>0)
    cur=cur.left;
    else
    cur=cur.right;
    }
    if(cur==null)
    {
        System.out.println(" jt Not Found");
    }
    else
    {
        //delete cur
        if(cur.left==null && cur.right==null)
        {
        
        //NODE IS LEAF NODE
        if(prev==null)
        {
        //root node is the only node to be deleted
        root=null;
        cur=null;
        
        }
        else
        {
        if((prev.product).compareToIgnoreCase(delete)>0)
        {
        prev.left=null;
       cur=null;
       System.out.println("Deleted");
              
        }
        else
        {
        prev.right=null;
               cur=null;
               System.out.println("Deleted");
              
        }
        }
        }
        else if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root3=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(delete)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");
 }
 else
 {
 prev.right=cur.left;
        cur.left=null;
        System.out.println("Deleted");
 }
 }
 }
 else if(cur.left==null && cur.right!=null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root3=cur.right;
 cur.right=null;
 cur=null;
 System.out.println("Deleted");
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(delete)>0)
 {
 prev.left=cur.right;
 cur.right=null;
 cur=null;
 
 }
 else
 {
 prev.right=cur.right;
        cur.right=null;
        cur=null;
        System.out.println("Deleted");
     
 }
 }
 }

 else if(cur.left!=null && cur.right!=null)
 {
 node2_snaks temp;
 temp=cur;
 temp=cur.left;
 while(temp.right!=null)
 temp=temp.right;
 temp.right=cur.right;
 cur.right=null;
 //now if current has a left subtree
 if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root3=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");
 }
 else
 {
 if((prev.product).compareToIgnoreCase(delete)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");

 }
 else
 {
 prev.right=cur.left;
        cur.left=null;System.out.println("Deleted");}
    }}}


    }
   
    bigBasket bb=new bigBasket();
    int index=0;
    for(int i=0;i<16;i++)
    {
        if(bb.snacks[i].equals(delete))
        {
            
            // bb.snacks[i]="";
            // bb.snacks_quantity[i]=0;
            // bb.price_snacks[i]=0;
            // bb.stock_snaks[i]=0;
            // System.out.println("After deleting inside method satisfying if condition to make that snack null in bigBasket menu -> ");
            index=i;
            
            
        }
        
        System.out.println(bb.snacks[i]);
    }

    for(int i=index+1;i<16;i++)
    {
        bb.snacks[i-1]=bb.snacks[i];

    }
    bb.snaks_pro--;
    for(int i=0;i<bb.snaks_pro;i++)
    {
        System.out.println(bb.snacks[i]);
    }
     }
 
     void delete_beverages(String delete)
     {
       node2_bev cur,prev;
       System.out.println("Delete "+delete);
       prev=null;
       cur=root;
       System.out.println("root "+cur.product);

    while(cur!=null && !cur.product.trim().contains(delete))
    {
    prev=cur;
    if((prev.product).compareToIgnoreCase(delete)>0)
    cur=cur.left;

    else
    cur=cur.right;
    }

    if(cur==null)
    {
        System.out.println(" Not Found");
    }
    else
    {
        //delete cur
        if(cur.left==null && cur.right==null)
        {
        
        //NODE IS LEAF NODE
        if(prev==null)
        {
        //root node is the only node to be deleted
        root=null;
        cur=null;
        
        }
        else
        {
        if((prev.product).compareToIgnoreCase(delete)>0)
        {
        prev.left=null;
       cur=null;
       System.out.println("Deleted");
        }
        else
        {
        prev.right=null;
        cur=null;
        System.out.println("Deleted");
              
        }
        }
        }
        else if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(delete)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");
 }
 else
 {
 prev.right=cur.left;
        cur.left=null;
        System.out.println("Deleted");
 }
 }
 }
 else if(cur.left==null && cur.right!=null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root=cur.right;
 cur.right=null;
 cur=null;
 System.out.println("Deleted");
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(delete)>0)
 {
 prev.left=cur.right;
 cur.right=null;
 cur=null;
 
 }
 else
 {
 prev.right=cur.right;
        cur.right=null;
        cur=null;
        System.out.println("Deleted");
     
 }
 }
 }

 else if(cur.left!=null && cur.right!=null)
 {
 node2_bev temp;
 temp=cur;
 temp=cur.left;
 while(temp.right!=null)
 temp=temp.right;
 temp.right=cur.right;
 cur.right=null;
 //now if current has a left subtree
 if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");
 }
 else
 {
 if((prev.product).compareToIgnoreCase(delete)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;
 System.out.println("Deleted");

 }
 else
 {
 prev.right=cur.left;
        cur.left=null;System.out.println("Deleted");}
    }}}
    }
   
    bigBasket bb=new bigBasket();
    int index=0,index1=0;
    for(int i=0;i<bb.bev1_pro;i++)
    {
        if(bb.bev1[i].equals(delete))
        {
            
            // bb.snacks[i]="";
            // bb.snacks_quantity[i]=0;
            // bb.price_snacks[i]=0;
            // bb.stock_snaks[i]=0;
            // System.out.println("After deleting inside method satisfying if condition to make that snack null in bigBasket menu -> ");
            index=i;
        }
        System.out.println(bb.snacks[i]);
    }

    
    for(int i=index+1;i<bb.bev1_pro;i++)
    {
        bb.bev1[i-1]=bb.bev1[i];
    }
    bb.bev1_pro--;

    for(int i=0;i<bb.bev2_pro;i++)
    {
        if(bb.bev2[i].equals(delete))
        {
            
            // bb.snacks[i]="";
            // bb.snacks_quantity[i]=0;
            // bb.price_snacks[i]=0;
            // bb.stock_snaks[i]=0;
            // System.out.println("After deleting inside method satisfying if condition to make that snack null in bigBasket menu -> ");
            index1=i;
        }
        System.out.println(bb.snacks[i]);
    }

    for(int i=index1+1;i<bb.bev2_pro;i++)
    {
        bb.bev2[i-1]=bb.bev2[i];
    }
    bb.bev2_pro--;
    
     
     }

     void display_stock()
     {
        //display stock
        node2_bev arr[]=new node2_bev[68];
        for(int i=0;i<36;i++)
        arr[i]=new node2_bev();

        int top=-1;
        System.out.println(">> STOCK DETAILS -> \n");

        if(root==null)
         System.out.println("YOUR STOCK IS EMPTY !!!");
       
        else
        {
            node2_bev cur;
            cur=root;
            //inorder traversal of bst ->
           
            System.out.println("|  Product"+"\t\t\t"+"Quantity(kg/pc)  |");
          
            do
            {
            while(cur!=null )
            {
                top++;
                arr[top]=cur;
                cur=cur.left;
            }
            if(top!=-1)
            {
                cur=arr[top];
                top--;
                System.out.println("|  "+cur.product+"\t\t"+cur.quan+"\t|");
                cur=cur.right;
            }
            }while(cur!=null || top!=-1);
            
        }
     }
   
     void update_snaks(String name,String quan,String price)
     {
        node2_snaks cur,prev;
        System.out.println("UPDATE "+name);
         prev=null;
        cur=root3;
         System.out.println("root3 "+cur.product);
         
    while(cur!=null && !cur.product.trim().contains(name))
    {
    prev=cur;
    if((prev.product).compareToIgnoreCase(name)>0)
    cur=cur.left;
    else
    cur=cur.right;
    }
    if(cur==null)
    {
        System.out.println("  Not Found");
    }
    else
    {
        //we got the product, just need to be updated
        //it is at cur
        cur.quan=Double.parseDouble(quan);
        for(int i=0;i<snaks_pro;i++)
        {
            if(name.equals(bb.snacks[i]))
            {
                bb.stock_snaks[i]=Integer.parseInt(quan);
                bb.price_snacks[i]=Double.parseDouble(price);
                System.out.println("Updated");
                break;
            }
        }

        for(int i=0;i<snaks_pro;i++)
        {
            System.out.println(bb.snacks[i]);
            System.out.println(bb.stock_snaks[i]);
            System.out.println(bb.price_snacks[i]);
            System.out.println();

        }

    }
    }
 

void update_veggies(String name,String quan,String price)
{
 node2_veggies cur,prev;
 System.out.println("UPDATE "+name);
 prev=null;
 cur=root2;
 System.out.println("root2 "+cur.product);

   while(cur!=null && !cur.product.trim().contains(name))
   {
   prev=cur;
   if((prev.product).compareToIgnoreCase(name)>0)
   cur=cur.left;
   else
   cur=cur.right;
   }
   if(cur==null)
   {
       System.out.println("  Not Found");
   }
   else
   {
       //we got the product, just need to be updated
       //it is at cur
       cur.quan=Double.parseDouble(quan);
       for(int i=0;i<veggies_pro;i++)
       {
           if(name.equals(bb.veggiesFruits[i]))
           {
               bb.stock_veggies[i]=Integer.parseInt(quan);
               bb.price_vegies[i]=Double.parseDouble(price);
               bb.price_vegies1[i]=Double.parseDouble(price)*2;
               System.out.println("Updated");
               break;
           }
       }

       for(int i=0;i<veggies_pro;i++)
       {
           System.out.println(bb.veggiesFruits[i]);
           System.out.println(bb.stock_veggies[i]);
           System.out.println(bb.price_vegies[i]);
           System.out.println(bb.price_vegies1[i]);
           System.out.println();
       }

   }
   }
     
   void update_bev(String name,String quan,String price)
   {
    node2_bev cur,prev;
 System.out.println("UPDATE "+name);
 prev=null;
 cur=root;
 System.out.println("root "+cur.product);

   while(cur!=null && !cur.product.trim().contains(name))
   {
   prev=cur;
   if((prev.product).compareToIgnoreCase(name)>0)
   cur=cur.left;
   else
   cur=cur.right;
   }
   if(cur==null)
   {
       System.out.println("  Not Found");
   }
   else
   {
       //we got the product, just need to be updated
       //it is at cur
       cur.quan=Double.parseDouble(quan);
       for(int i=0;i<bev1_pro;i++)
       {
           if(name.equals(bb.bev1[i]))
           {
               bb.stock_bev1[i]=Integer.parseInt(quan);
               bb.price_bev1[i]=Double.parseDouble(price);
               bb.price1_bev1[i]=Double.parseDouble(price)*2;
               System.out.println("Updated");
               break;
           }
       }

       for(int i=0;i<bev2_pro;i++)
       {
           if(name.equals(bb.bev2[i]))
           {
               bb.stock_bev2[i]=Integer.parseInt(quan);
               bb.price_bev2[i]=Double.parseDouble(price);
               bb.price1_bev2[i]=Double.parseDouble(price)*2;
               System.out.println("Updated");
               break;
           }
       }

   }
   }

   

   ArrayList<String> search_bev(String search) throws IOException
    {
        bigBasket bb=new bigBasket();
        bb.menu();
        stock st=new stock();
        st.create_stock();
        node2_bev cur,prev;
        ArrayList<String> al=new ArrayList<String>();
    
    if(root==null)
    {
        al.add("Not Found");
        return al;
    }
    else
    {
    cur=root;
    
    for(int i=0;i<36;i++)
    {
    prev=null;
    cur=root;
    while(cur!=null && !cur.product.toLowerCase().trim().contains(search.toLowerCase()))
    {
    prev=cur;
    if((prev.product.toLowerCase()).compareToIgnoreCase(search.toLowerCase())>0)
    cur=cur.left;
    else
    cur=cur.right;
    }
    if(cur==null)
    {
        if(al.isEmpty())
         al.add("Not Found");
        return al;
    }
    al.add(cur.product);
    //cur.product is to be deleted
    //node to be deleted is leaf node
 if(cur.left==null && cur.right==null)
 {
 
 //NODE IS LEAF NODE
 if(prev==null)
 {
 //root node is the only node to be deleted
 root=null;
 cur=null;
 
 }
 else
 {
 if((prev.product.toLowerCase()).compareToIgnoreCase(search.toLowerCase())>0)
 {
 prev.left=null;
        cur=null;
       
 }
 else
 {
 prev.right=null;
        cur=null;
       
 }
 }
 }
 //node to be deleted has a left subtree
 else if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root=cur.left;
 cur.left=null;
 cur=null;
 
 }
 else
 {
 if((prev.product.toLowerCase()).compareToIgnoreCase(search.toLowerCase())>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;

 }
 else
 {
 prev.right=cur.left;
        cur.left=null;
       
 }
 }
 }

 else if(cur.left==null && cur.right!=null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root=cur.right;
 cur.right=null;
 cur=null;
 
 }
 else
 {
 if((prev.product.toLowerCase()).compareToIgnoreCase(search.toLowerCase())>0)
 {
 prev.left=cur.right;
 cur.right=null;
 cur=null;
 
 }
 else
 {
 prev.right=cur.right;
        cur.right=null;
        cur=null;
     
 }
 }
 }

 else if(cur.left!=null && cur.right!=null)
 {
 node2_bev temp;
 temp=cur;
 temp=cur.left;
 while(temp.right!=null)
 temp=temp.right;
 temp.right=cur.right;
 cur.right=null;
 //now if current has a left subtree
 if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root=cur.left;
 cur.left=null;
 cur=null;
 
 }
 else
 {
 if((prev.product.toLowerCase()).compareToIgnoreCase(search.toLowerCase())>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;

 }
 else
 {
 prev.right=cur.left;
        cur.left=null;}}}}}
return al;
    }
 }

 ArrayList<String> search_veggies(String search) throws IOException
{
    bigBasket bb=new bigBasket();
    bb.menu();
    stock st=new stock();
    st.create_stock();
    node2_veggies cur,prev;
    ArrayList<String> al=new ArrayList<String>();
    
    
    if(root2==null)
    {
        al.add("Not Found");
        return al;
    }
    else
    {
    cur=root2;
    
    for(int i=0;i<16;i++)
    {
    prev=null;
    cur=root2;
    while(cur!=null && !cur.product.toLowerCase().trim().contains(search.toLowerCase()))
    {
    prev=cur;
    if((prev.product.toLowerCase()).compareToIgnoreCase(search.toLowerCase())>0)
    cur=cur.left;
    else
    cur=cur.right;
    }
    if(cur==null)
    {
        if(al.isEmpty())
         al.add("Not Found");
        return al;
    }
    al.add(cur.product);
    //cur.product is to be deleted
   

    //node to be deleted is leaf node
 if(cur.left==null && cur.right==null)
 {
 
 //NODE IS LEAF NODE
 if(prev==null)
 {
 //root node is the only node to be deleted
 root=null;
 cur=null;
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(search)>0)
 {
 prev.left=null;
        cur=null;
       
 }
 else
 {
 prev.right=null;
        cur=null;
       
 }
 }
 }
 //node to be deleted has a left subtree
 else if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root2=cur.left;
 cur.left=null;
 cur=null;
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(search)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;

 }
 else
 {
 prev.right=cur.left;
        cur.left=null;
       
 }
 }
 }

 else if(cur.left==null && cur.right!=null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root2=cur.right;
 cur.right=null;
 cur=null;
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(search)>0)
 {
 prev.left=cur.right;
 cur.right=null;
 cur=null;
 
 }
 else
 {
 prev.right=cur.right;
        cur.right=null;
        cur=null;
     
 }
 }
 }

 else if(cur.left!=null && cur.right!=null)
 {
 node2_veggies temp;
 temp=cur;
 temp=cur.left;
 while(temp.right!=null)
 temp=temp.right;
 temp.right=cur.right;
 cur.right=null;
 //now if current has a left subtree
 if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root2=cur.left;
 cur.left=null;
 cur=null;
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(search)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;

 }
 else
 {
 prev.right=cur.left;
        cur.left=null;}}}}}
return al;
    }}

ArrayList<String> search_snaks(String search) throws IOException
{
    bigBasket bb=new bigBasket();
    bb.menu();
    stock st=new stock();
    st.create_stock();
    node2_snaks cur,prev;
    ArrayList<String> al=new ArrayList<String>();
    
    
    if(root3==null)
    {
        al.add("Not Found");
        return al;
    }
    else
    {
    cur=root3;
    
    for(int i=0;i<16;i++)
    {
    prev=null;
    cur=root3;
    while(cur!=null && !cur.product.trim().contains(search))
    {
    prev=cur;
    if((prev.product).compareToIgnoreCase(search)>0)
    cur=cur.left;
    else
    cur=cur.right;
    }
    if(cur==null)
    {
        if(al.isEmpty())
         al.add("Not Found");
        return al;
    }
    al.add(cur.product);
    //cur.product is to be deleted
   

    //node to be deleted is leaf node
 if(cur.left==null && cur.right==null)
 {
 
 //NODE IS LEAF NODE
 if(prev==null)
 {
 //root node is the only node to be deleted
 root=null;
 cur=null;
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(search)>0)
 {
 prev.left=null;
cur=null;
       
 }
 else
 {
 prev.right=null;
        cur=null;
       
 }
 }
 }
 //node to be deleted has a left subtree
 else if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root3=cur.left;
 cur.left=null;
 cur=null;
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(search)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;

 }
 else
 {
 prev.right=cur.left;
        cur.left=null;
       
 }
 }
 }

 else if(cur.left==null && cur.right!=null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root3=cur.right;
 cur.right=null;
 cur=null;
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(search)>0)
 {
 prev.left=cur.right;
 cur.right=null;
 cur=null;
 
 }
 else
 {
 prev.right=cur.right;
        cur.right=null;
        cur=null;
     
 }
 }
 }

 else if(cur.left!=null && cur.right!=null)
 {
 node2_snaks temp;
 temp=cur;
 temp=cur.left;
 while(temp.right!=null)
 temp=temp.right;
 temp.right=cur.right;
 cur.right=null;
 //now if current has a left subtree
 if(cur.left!=null && cur.right==null)
 {
 if(prev==null)
 {
 //root node is the only node to be deleted and has a right sub tree
 root3=cur.left;
 cur.left=null;
 cur=null;
 
 }
 else
 {
 if((prev.product).compareToIgnoreCase(search)>0)
 {
 prev.left=cur.left;
 cur.left=null;
 cur=null;

 }
 else
 {
 prev.right=cur.left;
        cur.left=null;}}}}}
return al;
    }}
    
     
     }

class packaging{
        LocalDateTime now;
        String area;
        
        packaging(LocalDateTime now,String Area){
        this.now=now;
        this.area=Area;
        }
        
        int packaging() {
        // LocalDateTime cal=;//now+6
        // int val=cal.compareTo(newnow);//newnow is curr t
        // if(val>=0) {   // cal>now
        // System.out.println("ORDER SHIPPED ");
        // }
        // else if(val<0) {
        // System.out.println("YOUR ORDER IS BEING PACKED ");
        // }
        
        time t=new time(area);
        t.readcity();
        int mins=t.read();
        return mins;
        }
        //int startingpoint=
        //des ghe
        
        }
        
class time{
        String shop="Kothrud";
        int shopindex=4;
        String Area;
            String city[]=new String[15];
        Scanner sc=new Scanner(System.in);
        time(String Area){
        this.Area=Area;
        }
        void readcity(){
        try {
        String line="";  
        //read text file        
        BufferedReader br;
        br = new BufferedReader(new FileReader("C:\\Users\\dell\\Documents\\NetBeansProjects\\aastha_buffer\\src\\icons\\listofarea.txt"));
        int k=0;
        while((line=br.readLine())!=null)
        {
        
        city[k]=line;
        
        k++;
        
        
        }
        
        }catch (Exception ex) {
        System.out.println(ex);
        }
        }
        
        
        int read(){
            int mins=0;
        
        try {
        
        String line="";  
        //read text file        
        BufferedReader br;
        br = new BufferedReader(new FileReader("C:\\Users\\dell\\Documents\\NetBeansProjects\\aastha_buffer\\src\\icons\\area.txt"));
        //index =index of area array
        //row=index of row
        //column=index of column
        int index=0,row=0,column=0;
        String[] area= new String[50];
        boolean flag=false;
        int graph[][] = new int[500][500];
        while((line=br.readLine())!=null)
        {
        // System.out.println(line);
        //word[0]=start  word[1]=destination word[2]=distance              
        String w[]=line.split(" ");
        
        // for(int i=0;i<w.length;i++)
        // {
        //  System.out.println("words:"+i+" "+w[i]);
        //  }
        // check if city is already inserted in aaray
        flag=false;    
        // System.out.println("k"+w[0]);
        // System.out.println("area 0"+area[0]);
        for(int p=0;p<index;p++)
        {
        
        if(area[p].equals(w[0])){
        
        flag=true;
        row=p;
        }
        }
        if(flag==false)
        {
        area[index++]=w[0];
        
        row=index-1;
        }
        
        flag=false;
        for(int p=0;p<index;p++)
        {
        if(area[p].equals(w[1]))
        {   flag=true;
        column=p;
        }
        }
        if(flag==false)
        {
        area[index++]=w[1];
        column=index-1;
        }
        
        
        //print city array
        
        
        //System.out.println (index1+ "  "+index2 + "  "+index);
        //convert string dis into int and store in graph
        graph[row][column]=Integer.parseInt(w[2]);
        
        //System.out.println(graph[row][column]);
        
        }
        
        // for (int k=0;k<=15;k++)
        // {
        // for(int m=0;m<=15;m++) {
        // //System.out.print(graph[k][m]+ "  |  ");
        // }
        // System.out.println(" ");
        // System.out.println("________________________________________________________________");
        // }
        
        
        ShortestPath t = new ShortestPath();
        
        //int startingPoint=displaymenu();
        //System.out.print("Enter destination:");
        //int destination=sc.nextInt();
        int Areaindex = 0;
        int flagnew=0;
                    for(int i=0;i<city.length;i++) {
                   
                    if(Area.equals(city[i])) {
                    Areaindex=i;
                    flagnew=1;
                    break;
                    }
                    }
                    if(flagnew==0) {
                    System.out.println("ERROR ! please retry ");
                    }
                   
        int destindex=Areaindex-1;
        //int destindex=destination-1;
          mins=t.dijkstra(graph, shopindex, area,destindex);
         
        }catch (Exception ex) {
        System.out.println(ex);
        }
        return mins;
        }
        
        }
        
class ShortestPath {
        // A utility function to find the vertex with minimum distance value,
        // from the set of vertices not yet included in shortest path tree
        static final int V = 15;
        int minDistance(int time[], Boolean visited[])
        {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;
        
        for (int v = 0; v < V; v++)
        if (visited[v] == false && time[v] <= min) {
        min = time[v];
        min_index = v;
        
        }
        
        return min_index;
        }
        
        // A utility function to print the constructed distance array
        int printSolution(int time[], int n, String[] area, int point, int dest) throws IOException
        
        {
        int totalTime=0;
        
        for (int i = point; i <= dest; i++) {
        
        totalTime=totalTime+time[i];
        }
        //System.out.println(totalTime);
        //System.out.println("SHIPPING STATUS :");
        // System.out.print("Kothrud  --> ");
        
        return totalTime;
        }
        int dijkstra(int graph[][], int point, String[] area,int dest) throws IOException
        {
        int time[] = new int[V];         //The output array.
        //dist[i] will hold the shortest distance from point to i
        
        // visited[i] will true if vertex i is included in shortest
        
        Boolean visited[] = new Boolean[V];          //size 9
        
        // Initialize all distances as INFINITE and visited[] as false
        for (int i = 0; i < V; i++) {
        time[i] = Integer.MAX_VALUE;
        visited[i] = false;
        }
        
        // Distance of source vertex from itself is  0
        time[point] = 0;
        
        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
        // minimum distance vertex from the set of vertices is selected
        
        int u = minDistance(time, visited);
        
        // Mark the picked vertex as visited
        visited[u] = true;
        
        // Update dist value of the adjacent vertices of the  picked vertex.
        for (int v = 0; v < V; v++)
        
        // Update dist[v] only if is not in dist, there is an edge from u to v, and total weight of path from point to v through u is smaller than current value of dist[v]
        if (!visited[v] && graph[u][v] != 0 &&  time[u] != Integer.MAX_VALUE && time[u] + graph[u][v] < time[v])
        time[v] = time[u] + graph[u][v];
        }
        
        // print the constructed distance array
        int totalTime=printSolution(time, V, area,point, dest);
        return totalTime;
       
        }
        }