package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static com.example.demo2.Hospital.medicalRecords;

public class SearchRecord extends JFrame implements ActionListener {
    private JLabel patientIdLabel;
    private JTextField patientIdField;
    private JButton searchButton;
    private JTextArea resultArea;


    public SearchRecord(ArrayList<Patient> medicalRecords) {
        //this.medicalRecords = medicalRecords;
        setTitle("Search Medical Record");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(12, 12));

        patientIdLabel = new JLabel("Patient ID:");
        getContentPane().add(patientIdLabel);

        patientIdField = new JTextField();
        getContentPane().add(patientIdField);

        searchButton = new JButton("Search");
        getContentPane().add(searchButton);
        searchButton.addActionListener(this);

        resultArea = new JTextArea();
        resultArea.setTabSize(100);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setPreferredSize(new Dimension(400, 600)); // set new size here
        getContentPane().add(scrollPane);

        pack();
        setLocationRelativeTo(null);
        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        StringBuilder sb = new StringBuilder();
        if (e.getSource() == searchButton) {
            int patientId = Integer.parseInt(patientIdField.getText());

            boolean found = false;
            for (Patient medicalRecord : medicalRecords) {
                if (medicalRecord.getPatientId() == patientId) {
                    resultArea.setText(medicalRecord.displayDetails(sb));
                    found = true;
                    break;
                }
            }

            if (!found) {
                resultArea.setText("No medical record found for the given patient ID.");
            }
        }
    }
}

