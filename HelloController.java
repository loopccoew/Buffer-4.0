package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import  com.example.demo2.HelloAppliaction;
public class HelloController {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Home Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10)); // Set grid layout for buttons

        // Create buttons
        JButton button1 = new JButton("Patient");
        JButton button2 = new JButton("Hospital Staff");
        JButton button3 = new JButton("Exit");

        // Add action listeners to buttons
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          Login.main( new String[0]);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Hospitalgui.main(new String[0]);

            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HelloApplication.main(new String[0]);

            }
        });

        // Add buttons to panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Set panel to be the content pane of the frame
        frame.setContentPane(panel);

        // Show the GUI
        frame.setVisible(true);
    }
}
