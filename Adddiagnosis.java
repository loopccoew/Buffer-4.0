package com.example.demo2;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import static com.example.demo2.MedicalRecordSystem.patient1;


public class Adddiagnosis extends JFrame implements ActionListener {

    private JTextField diagnosisField;

    private JButton submitButton;

    private Patient patient;



    public Adddiagnosis(Patient patient) {

        this.patient = patient;



        // Initialize JFrame components

        setTitle("Add/Edit Diagnosis");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setPreferredSize(new Dimension(300, 100));



        diagnosisField = new JTextField(20);

        submitButton = new JButton("Submit");



        // Add components to JFrame

        JPanel panel = new JPanel(new FlowLayout());

        panel.add(new JLabel("Diagnosis:"));

        panel.add(diagnosisField);

        panel.add(submitButton);

        add(panel);



        // Add ActionListener to button

        submitButton.addActionListener(this);



        pack();

        setVisible(true);

    }



    @Override

    public void actionPerformed(ActionEvent e) {

        String diagnosis = diagnosisField.getText();

        patient1.setDiagnosis(diagnosis);

        dispose();

    }

}

