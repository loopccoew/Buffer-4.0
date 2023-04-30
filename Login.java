package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        // Set up the GUI
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel loginLabel = new JLabel("Login:");
        JTextField loginField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JLabel errorLabel = new JLabel("");

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                String password = new String(passwordField.getPassword());

                // Compare login and password to hardcoded values
                if (login.equals("Patient1234") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Login successful.");
                    PatientGUI.main(new String[0]);
                   // MedicalRecordSystem.patientfunctions();
                    //Patient1 P=new Patient1();
                    //PatientGUI.create(P);


                } else {
                    errorLabel.setText("Invalid login or password.");
                }
            }
        });

        // Add components to the panel
        panel.add(loginLabel);
        panel.add(loginField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(errorLabel);

        // Set panel to be the content pane of the frame
        frame.setContentPane(panel);

        // Show the GUI
        frame.setVisible(true);
    }
}

