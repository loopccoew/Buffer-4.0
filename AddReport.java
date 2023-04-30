package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AddReport extends JFrame {
    private JLabel patientIdLabel;
    private JTextField patientIdField;
    private JLabel dateLabel;
    private JTextField dateField;
    private JLabel weightLabel;
    private JTextField weightField;
    private JLabel heightLabel;
    private JTextField heightField;
    private JLabel bpHLabel;
    private JTextField bpHField;
    private JLabel bpLLabel;
    private JTextField bpLField;
    private JLabel haemoglobinLabel;
    private JTextField haemoglobinField;
    private JLabel cholesterolLabel;
    private JTextField cholesterolField;
    private JLabel sugarLabel;
    private JTextField sugarField;
    private JButton addButton;

    private ArrayList<Patient> medicalRecords;

    public AddReport(ArrayList<Patient> medicalRecords) {
        this.medicalRecords = medicalRecords;
        setTitle("Add Report to Patient");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        patientIdLabel = new JLabel("Patient ID:");
        patientIdLabel.setBounds(20, 20, 100, 20);
        getContentPane().add(patientIdLabel);

        patientIdField = new JTextField();
        patientIdField.setBounds(130, 20, 200, 20);
        getContentPane().add(patientIdField);

        dateLabel = new JLabel("Date (dd/mm/yyyy):");
        dateLabel.setBounds(20, 50, 100, 20);
        getContentPane().add(dateLabel);

        dateField = new JTextField();
        dateField.setBounds(130, 50, 200, 20);
        getContentPane().add(dateField);

        weightLabel = new JLabel("Weight (in kg):");
        weightLabel.setBounds(20, 80, 100, 20);
        getContentPane().add(weightLabel);

        weightField = new JTextField();
        weightField.setBounds(130, 80, 200, 20);
        getContentPane().add(weightField);

        heightLabel = new JLabel("Height (in cm):");
        heightLabel.setBounds(20, 110, 100, 20);
        getContentPane().add(heightLabel);

        heightField = new JTextField();
        heightField.setBounds(130, 110, 200, 20);
        getContentPane().add(heightField);

        bpHLabel = new JLabel("High Blood Pressure:");
        bpHLabel.setBounds(20, 140, 100, 20);
        getContentPane().add(bpHLabel);

        bpHField = new JTextField();
        bpHField.setBounds(130, 140, 200, 20);
        getContentPane().add(bpHField);

        bpLLabel = new JLabel("Low Blood Pressure:");
        bpLLabel.setBounds(20, 170, 100, 20);
        getContentPane().add(bpLLabel);

        bpLField = new JTextField();
        bpLField.setBounds(130, 170, 200, 20);
        getContentPane().add(bpLField);

        haemoglobinLabel = new JLabel("Haemoglobin:");
        haemoglobinLabel.setBounds(20, 200, 100, 20);
        getContentPane().add(haemoglobinLabel);

        haemoglobinField = new JTextField();
        haemoglobinField.setBounds(130, 200, 200, 20);
        getContentPane().add(haemoglobinField);

        cholesterolLabel = new JLabel("Cholesterol:");
        cholesterolLabel.setBounds(20, 230, 100, 20);
        getContentPane().add(cholesterolLabel);

        cholesterolField = new JTextField();
        cholesterolField.setBounds(130, 230, 200, 20);
        getContentPane().add(cholesterolField);
        
        sugarLabel = new JLabel("Sugar:");
        sugarLabel.setBounds(20, 260, 100, 20);
        getContentPane().add(sugarLabel);

        sugarField = new JTextField();
        sugarField.setBounds(130, 260, 200, 20);
        getContentPane().add(sugarField);

        addButton = new JButton("Add Report");
        addButton.setBounds(130, 290, 100, 30);
        addButton.addActionListener(e -> addReportToPatient());
        getContentPane().add(addButton);

        setSize(370, 370);
        setVisible(true);
    }

    private void addReportToPatient() {
        int pid = Integer.parseInt(patientIdField.getText());
        for (Patient p : medicalRecords) {
            if (p.getPatientId() == pid) {
                String date = dateField.getText();
                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());
                int bpH = Integer.parseInt(bpHField.getText());
                int bpL = Integer.parseInt(bpLField.getText());
                double haemoglobin = Double.parseDouble(haemoglobinField.getText());
                double cholesterol = Double.parseDouble(cholesterolField.getText());
                double sugar = Double.parseDouble(sugarField.getText());

                Report r = new Report(date, bpH, bpL, haemoglobin, weight, height, cholesterol, sugar);
                p.addReport(r);

                JOptionPane.showMessageDialog(this, "Report added successfully.");
                dispose();
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Patient not found.");
    }
}
        
