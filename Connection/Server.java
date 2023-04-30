package Connection;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Server extends JFrame implements ActionListener          // ActionListener from "awt.event"
{
   static JTextField text;                                              // Globally declare text field(going to be used in ActionListener)
    static JPanel a1;
    static Box vertical = Box.createVerticalBox();                       // Vertical box for messages
    static JFrame t = new JFrame();
    static DataOutputStream dout;
    public Server()
    {

        t.setLayout(null);

        JPanel p1 = new JPanel();                                 //JPanel = if we want to insert anything on frame
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,400,70);
        p1.setLayout(null);
        t.add(p1);


//********************************************* BACK BUTTON ***********************************************


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);  //Image class in "awt"

        ImageIcon i3 = new ImageIcon(i2);

        JLabel add_img = new JLabel(i3);
        add_img.setBounds(5,20,25,25);
        p1.add(add_img);

        add_img.addMouseListener(new MouseAdapter()                                        // close window on click
        {
             public void mouseClicked(MouseEvent ae)
             {
                 t.setVisible(false);
             }
        }
        );

//********************************************* PROFILE IMAGE ***********************************************


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/server15.png"));
        Image i5 = i4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40,10,50,50);
        p1.add(profile);


//********************************************* VIDEO IMAGE ***********************************************


        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(250,20,30,30);
        p1.add(video);


//********************************************* PHONE IMAGE ***********************************************


        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(300,20,35,30);
        p1.add(phone);


//********************************************* MORE IMAGE ***********************************************


        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel More_op = new JLabel(i15);
        More_op.setBounds(350,20,10,25);
        p1.add(More_op);


//********************************************* NAME OF THE USER ***********************************************


        JLabel name = new JLabel("Aagastya");
        name.setBounds(110,15,100,18);
        name.setForeground(Color.white);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,21));
        p1.add(name);


//********************************************* STATUS OF THE USER *************************************************


        JLabel Status = new JLabel("Active Now");
        Status.setBounds(110,42,100,18);
        Status.setForeground(Color.white);
        Status.setFont(new Font("SAN_SERIF",Font.BOLD,14));
        p1.add(Status);


//************************************************** TEXT AREA *************************************************


        a1 = new JPanel();
        a1.setBounds(5,75,390,520);
        t.add(a1);


//************************************************** USER CHAT *************************************************


        text = new JTextField();
        text.setBounds(2,599,280,40);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        t.add(text);


//********************************************* SEND BUTTON *************************************************

        JButton send = new JButton("Send");
        send.setBounds(285,599,110,40);
        send.setBackground(new Color(7,94,84));
        send.setForeground(Color.white);
        send.addActionListener(this);                              // Send button click
        send.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        t.add(send);

//--------------------------------------------------------------------------------------------------------------------------


        t.setSize(400,650);                               // setSize() fun in JFrame
        t.setLocation(300,50);                                  // need to change location as default location is top left
        t.setUndecorated(true);                                      // remove header (increases size of frame)
        t.getContentPane().setBackground(Color.white);               // Color class is under "awt"
        t.setVisible(true);                                          // Default visibility is false
    }

    public void actionPerformed(ActionEvent ae) {
         //new Client();
        try {
            String out = text.getText();

            JPanel p2 = formatLabel(out);

            a1.setLayout(new BorderLayout());

            JPanel right = new JPanel(new BorderLayout());
            right.add(p2, BorderLayout.LINE_END);
            vertical.add(right);                                  // Add message in vertical box(For multiple messages)
            vertical.add(Box.createVerticalStrut(15));

            a1.add(vertical, BorderLayout.PAGE_START);             // Append all this on text area


            System.out.println(dout.toString());
            dout.writeUTF(out);

            text.setText("");                                     // To delete the text from chat area after it is sent


            t.repaint();                                            // All three fun used to reload the frame
            t.invalidate();                                         // so that sent texts would be seen
            t.validate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

        public static JPanel formatLabel(String out)
        {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

            JLabel output = new JLabel(out);
            output.setFont(new Font("Tahoma",Font.PLAIN,16));       //"Tahoma" = Font name
                                                                              // set font of text which user will send
            output.setBackground(new Color(37,211,102));
            output.setOpaque(true);                                           // For background color to be visible

            output.setBorder(new EmptyBorder(15,15,15,50));
            panel.add(output);



//********************************************************** DATE AND TIME*************************************************



            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

            JLabel time = new JLabel();
            time.setText(sdf.format(cal.getTime()));

            panel.add(time);

//--------------------------------------------------------------------------------------------------------------------------


            return panel;
        }

    public static void main(String[] args)

    {
        new Server().setVisible(true);
       try
       {
           ServerSocket skt = new ServerSocket(6001);                           // For real time chatting

           while(true)                                                               // condition for infinite chatting
           {
               Socket s = skt.accept();
               DataInputStream din = new DataInputStream(s.getInputStream());        // To receive messages
               dout = new DataOutputStream(s.getOutputStream());    // To send messages
               System.out.println(din.toString());
               while(true)
               {
                   String meg = din.readUTF();                                       // To read a message
                   JPanel panel = formatLabel(meg);                                  // Add on frame

                   JPanel left = new JPanel(new BorderLayout());
                   left.add(panel,BorderLayout.LINE_START);                          // Received messages on left

                   vertical.add(left);
                   t.validate();
               }
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }

    }

}
