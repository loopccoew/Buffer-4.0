package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyPartsGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Body Parts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10)); // Set grid layout for buttons

        // Create buttons
        JButton button1 = new JButton("Eyes");
        JButton button2 = new JButton("Skin");
        JButton button3 = new JButton("Ent");

        // Add action listeners to buttons
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Eyes.main(new String[0]);
                 // Replace with desired action
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Skin.main(new String[0]); // Replace with desired action
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ENT.main(new String[0]);
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
