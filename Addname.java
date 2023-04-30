package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.example.demo2.MedicalRecordSystem.patient1;

public class Addname extends JFrame implements ActionListener {

    private JTextField nameField;

    private JButton submitButton;

    private Patient patient;



    public Addname(Patient patient) {

        this.patient = patient;



        // Initialize JFrame components

        setTitle("Add/Edit Name");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setPreferredSize(new Dimension(300, 100));



        nameField = new JTextField(20);

        submitButton = new JButton("Submit");



        // Add components to JFrame

        JPanel panel = new JPanel(new FlowLayout());

        panel.add(new JLabel("Name:"));

        panel.add(nameField);

        panel.add(submitButton);

        add(panel);



        // Add ActionListener to button

        submitButton.addActionListener(this);



        pack();

        setVisible(true);

    }



    @Override

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();

        patient1.setPatientName(name);

        dispose();

    }



}