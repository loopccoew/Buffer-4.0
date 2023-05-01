package com.example.demo2;

import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HelloApplication {

    public static void main(String[] args) {
        // Set look and feel for the GUI
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Medical GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);
        final boolean[] exit = {false};
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240)); // Set background color of the panel
        panel.setLayout(new GridLayout(2, 3, 10, 10)); // Set grid layout for buttons

        // Create buttons with custom styling
        JButton button1 = new JButton("<html><center>Medical Records,<br>Hospital,Appointment</center></html>");
      //  button1.setBackground(new Color(52, 152, 219));
        button1.setForeground(Color.black);
        button1.setFont(new Font("Arial", Font.PLAIN, 18));
        button1.setPreferredSize(new Dimension(200, 100));


        JButton button2 = new JButton("<html><center>Disease Outbreak</center></html>");
        //button2.setBackground(new Color(155, 89, 182));
        button2.setForeground(Color.black);
        button2.setFont(new Font("Arial", Font.PLAIN, 18));
        button2.setPreferredSize(new Dimension(200, 100));


        JButton button3 = new JButton("<html><center>Hospital Connectivity</center></html>");
       // button3.setBackground(new Color(26, 188, 156));
        button3.setForeground(Color.black);
        button3.setFont(new Font("Arial", Font.PLAIN, 18));
        button3.setPreferredSize(new Dimension(200, 100));


        JButton button4 = new JButton("<html><center>Diagnose Me</center></html>");
      //  button4.setBackground(new Color(241, 196, 15));
        button4.setForeground(Color.black);
        button4.setFont(new Font("Arial", Font.PLAIN, 18));
        button4.setPreferredSize(new Dimension(200, 100));


        JButton button5 = new JButton("<html><center>Ambulance Route</center></html>");
      //  button5.setBackground(new Color(231, 76, 60));
        button5.setForeground(Color.black);
        button5.setFont(new Font("Arial", Font.PLAIN, 18));
        button5.setPreferredSize(new Dimension(200, 100));


        JButton button6 = new JButton("Exit");
        button6.setBackground(new Color(189, 195, 199));
        button6.setFont(new Font("Arial", Font.PLAIN, 18));
        button1.setBackground(new Color(51, 153, 255)); // blue
        button2.setBackground(new Color(51, 153, 255)); // blue
        button3.setBackground(new Color(51, 153, 255)); // blue
        button4.setBackground(new Color(51, 153, 255)); // blue
        button5.setBackground(new Color(51, 153, 255)); // blue
        button6.setBackground(new Color(51, 153, 255)); // blue


        // Add action listeners to buttons
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HelloController.main(new String[0]);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

               DiseaseSpread.main(new String[0]);
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PrimsGUI.main(new String[0]);
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BodyPartsGui.main(new String[0]);
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AmbulanceGUI.main(new String[0]);
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the program
            }
        });

        // Add buttons to panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);

       // ImageIcon imageIcon = new ImageIcon("background.jpg");
        //Image image = imageIcon.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE;
                // Set panel to be the content pane of the frame
             frame.setContentPane(panel);

             // Show the GUI
             frame.setVisible(true);
         }


 }