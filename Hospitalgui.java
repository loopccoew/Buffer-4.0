package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hospitalgui extends JFrame implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JLabel loginStatus;

    public Hospitalgui() {
        setTitle("Hospital Login");
        setBounds(300, 90, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Hospital Login");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(150, 30);
        c.add(title);

        userLabel = new JLabel("Username");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        userLabel.setSize(100, 20);
        userLabel.setLocation(100, 100);
        c.add(userLabel);

        userText = new JTextField();
        userText.setFont(new Font("Arial", Font.PLAIN, 15));
        userText.setSize(190, 20);
        userText.setLocation(200, 100);
        c.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordLabel.setSize(100, 20);
        passwordLabel.setLocation(100, 150);
        c.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordText.setSize(190, 20);
        passwordText.setLocation(200, 150);
        c.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
        loginButton.setSize(100, 20);
        loginButton.setLocation(250, 200);
        loginButton.addActionListener(this);
        c.add(loginButton);

        loginStatus = new JLabel("");
        loginStatus.setFont(new Font("Arial", Font.PLAIN, 15));
        loginStatus.setSize(200, 20);
        loginStatus.setLocation(200, 250);
        c.add(loginStatus);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = new String(passwordText.getPassword());

        if (user.equals("Hospital1234") && password.equals("1234")) {
            loginStatus.setText("Login successful");
            H.main(new String[]{});

        } else {
            loginStatus.setText("Login unsuccessful");
        }
    }

    public static void main(String[] args) {
        Hospitalgui frame = new Hospitalgui();
    }
}
