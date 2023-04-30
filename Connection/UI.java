package Connection;

import Contact.*;
import Emergency.EmergencyEmail;
import MedicineAlarm.*;
import soundproject3package3.*;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UI extends JFrame  implements ActionListener
{
    static JFrame f1 = new JFrame();
    JLabel l1,l2, lab_alarm, lab_contact,lab_chat,lab_music;
    public UI()
    {

        JPanel p1 = new JPanel();
        //JPanel = if we want to insert anything on frame
        p1.setOpaque(true);
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(500,500,600,700);
        p1.setLayout(null);
        f1.add(p1);

        f1=new JFrame("Jio");

        f1.setBackground( Color.black);
        f1.setLayout(null);

        f1.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,700,600);
        l1.setLayout(null);



//*****************************************************************  TIME  ************************************************************



        JLabel timeLabel = new JLabel();
        timeLabel.setBackground(new Color(204,255,204));
        JLabel timeLabel1 = new JLabel();

        timeLabel.setFont(new Font("Serif", Font.BOLD, 50));
        timeLabel1.setFont(new Font("Serif", Font.BOLD, 50));

        // Create a new Timer object that will update the JLabel every second.
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Get the current date and time.
                Date now = new Date();
                DateFormat df = new SimpleDateFormat("dd EEEEEE");
                DateFormat df2 = new SimpleDateFormat("HH:mm");

                // Update the JLabel with the current date and time.
                timeLabel.setText(df.format(now));
                timeLabel1.setText(df2.format(now));
            }
        }, 0, 1000);

        timeLabel.setBounds(20,20,300,30);
        timeLabel.setForeground(Color.darkGray);
        timeLabel.setFont(new Font ("Airal",Font.BOLD,30));
        l1.add(timeLabel);

        timeLabel1.setBounds(20,50,300,30);
        timeLabel1.setForeground(Color.darkGray);
        timeLabel1.setFont(new Font ("Airal",Font.BOLD,30));
        l1.add(timeLabel1);


// ******************************************************** MUSIC ************************************************************



        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Connection/First_Page/radio.png"));
        Image i5 = i4.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel music = new JLabel(i6);
        music.setBounds(-50,230,300,300);
        p1.add(music);
        f1.add(music);


        music.addMouseListener(new MouseAdapter()                                        // close window on click
                                 {
                                     public void mouseClicked(MouseEvent ae)
                                     {
                                         try {
                                             new Player().setVisible(true);
                                         } catch (UnsupportedAudioFileException e) {
                                             throw new RuntimeException(e);
                                         } catch (IOException e) {
                                             throw new RuntimeException(e);
                                         } catch (LineUnavailableException e) {
                                             throw new RuntimeException(e);
                                         }
                                         f1.setVisible(false);
                                     }
                                 }
        );

        lab_music = new JLabel("Music");
        lab_music.setBounds(70,460,200,30);
        lab_music.setForeground(Color.darkGray);
        lab_music.setFont(new Font ("Airal",Font.BOLD,20));
        l1.add(lab_music);



// ******************************************************** ALARM ************************************************************



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Connection/First_Page/alarm1.png"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);  //Image class in "awt"

        ImageIcon i3 = new ImageIcon(i2);

        JLabel add_img = new JLabel(i3);
        add_img.setBounds(120,230,300,300);
        p1.add(add_img);
        f1.add(add_img);

        add_img.addMouseListener(new MouseAdapter()                                        // close window on click
                                 {
                                     public void mouseClicked(MouseEvent ae)
                                     {
                                         new MedicineAlarm().setVisible(true);
                                         f1.setVisible(false);
                                     }
                                 }
        );

        lab_alarm = new JLabel("Alarm");
        lab_alarm.setBounds(250,460,200,30);
        lab_alarm.setForeground(Color.darkGray);
        lab_alarm.setFont(new Font ("Airal",Font.BOLD,20));
        l1.add(lab_alarm);



//********************************************************** EMERGENCY ************************************************************



        ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("Connection/First_Page/sirens.png"));
        Image i32 = i31.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i32);
        JLabel emergency = new JLabel(i33);
        emergency.setBounds(165,-110,300,300);
        p1.add(emergency);
        f1.add(emergency);


        emergency.addMouseListener(new MouseAdapter()                                        // close window on click
                                 {
                                     public void mouseClicked(MouseEvent ae)
                                     {
                                         new EmergencyEmail();
                                         JOptionPane.showMessageDialog(f1,"Message sent") ;
                                         f1.setVisible(false);
                                     }
                                 }
        );

// ******************************************************** CONTACT ************************************************************



        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("Connection/First_Page/Contact.png"));
        Image i8 = i7.getImage().getScaledInstance(130,130,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel contact = new JLabel(i9);
        contact.setBounds(120,8,300,300);
        p1.add(contact);
        f1.add(contact);


        contact.addMouseListener(new MouseAdapter()                                        // close window on click
                                 {
                                     public void mouseClicked(MouseEvent ae)
                                     {
                                         new PhoneBook().setVisible(true);
                                         f1.setVisible(false);
                                     }
                                 }
        );

        lab_contact = new JLabel("Contact");
        lab_contact.setBounds(235,240,200,30);
        lab_contact.setForeground(Color.darkGray);
        lab_contact.setFont(new Font ("Airal",Font.BOLD,20));
        l1.add(lab_contact);



// ******************************************************** WHATSUP ************************************************************



        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("Connection/First_Page/Chat.png"));
        Image i11 = i10.getImage().getScaledInstance(130,130,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel whatsup = new JLabel(i12);
        whatsup.setBounds(-45,8,300,300);
        p1.add(whatsup);
        f1.add(whatsup);

        whatsup.addMouseListener(new MouseAdapter()                                        // close window on click
                                 {
                                     public void mouseClicked(MouseEvent ae)
                                     {
                                         f1.dispose();

                                         new Server().setVisible(true);
                                         new Client().setVisible(true);
                                     }
                                 }
        );

        lab_chat = new JLabel("Chat");
        lab_chat.setBounds(70,240,200,30);
        lab_chat.setForeground(Color.darkGray);
        lab_chat.setFont(new Font ("Airal",Font.BOLD,20));
        l1.add(lab_chat);


        f1.add(l1);

        f1.setVisible(true);
        f1.setSize(390,550);
        f1.setLocation(500,100);
        f1.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String args[])
    {
           new UI();
        }
    }

