
package com.example.demo2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddRecord extends JFrame implements ActionListener {

    private ArrayList<Patient> medicalRecords;
    private JTextField nameField, idField, diagnosisField, passwordField, dateField;
    private JButton submitButton;

    public AddRecord(ArrayList<Patient> medicalRecords) {
        this.medicalRecords = medicalRecords;

        // Initialize JFrame components
        setTitle("Add Medical Record");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(400, 250));

        // Initialize JTextFields
        nameField = new JTextField(20);
        nameField.setBounds(182, 42, 107, 19);
        idField = new JTextField(20);
        idField.setBounds(182, 71, 107, 19);
        diagnosisField = new JTextField(20);
        diagnosisField.setBounds(182, 97, 107, 19);
        passwordField = new JTextField(20);
        passwordField.setBounds(182, 120, 107, 19);
        dateField = new JTextField(20);
        dateField.setBounds(182, 149, 107, 19);

        // Initialize JButton
        submitButton = new JButton("Submit");
        submitButton.setBounds(106, 182, 146, 21);

        // Add components to JFrame
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel label = new JLabel("Patient Name:");
        label.setBounds(10, 42, 162, 16);
        panel.add(label);
        
        panel.add(nameField);
        
        JLabel label_1 = new JLabel("Patient ID:");
        label_1.setBounds(10, 74, 154, 13);
        panel.add(label_1);
        
        panel.add(idField);

        JLabel label_2 = new JLabel("Diagnosis:");
        label_2.setBounds(10, 100, 154, 13);
        panel.add(label_2);
        
        panel.add(diagnosisField);
       
        JLabel label_3 = new JLabel("Password:");
        label_3.setBounds(10, 123, 154, 13);
        panel.add(label_3);
        
        panel.add(passwordField );
       
        JLabel label_4 = new JLabel("Date of Diagnosis (DD/MM/YYYY):");
        label_4.setBounds(10, 146, 154, 13);
        panel.add(label_4);
        
        panel.add(dateField);
        
        panel.add(submitButton);
        getContentPane().add(panel);

        // Add ActionListener to button
        submitButton.addActionListener(this);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String patientName = nameField.getText();
        int patientId = Integer.parseInt(idField.getText());
        String diagnosis = diagnosisField.getText();
        String password = passwordField.getText();
        String dateOfDiagnosis = dateField.getText();

        Patient medicalRecord = new Patient(patientName, password,patientId, diagnosis, dateOfDiagnosis);
        medicalRecords.add(medicalRecord);
        JOptionPane.showMessageDialog(this, "New medical record added successfully!");
        dispose();
    }
}
