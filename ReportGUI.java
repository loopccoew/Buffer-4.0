package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ReportGUI extends JFrame implements ActionListener {

    private JLabel dateLabel, weightLabel, heightLabel, bpHLabel, bpLLabel, haemoLabel, cholLabel, sugarLabel;
    private JTextField dateField, weightField, heightField, bpHField, bpLField, haemoField, cholField, sugarField;
    private JButton addButton;
    private JPanel mainPanel, inputPanel;
    //private ArrayList<Report> reports = new ArrayList<>();

    public ReportGUI() {
        setTitle("Report GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        mainPanel = new JPanel(new BorderLayout());
        inputPanel = new JPanel(new GridLayout(8, 2));

        dateLabel = new JLabel("Date (dd/mm/yyyy): ");
        weightLabel = new JLabel("Weight (in kg): ");
        heightLabel = new JLabel("Height (in cm): ");
        bpHLabel = new JLabel("High Blood pressure: ");
        bpLLabel = new JLabel("Low Blood pressure: ");
        haemoLabel = new JLabel("Haemoglobin: ");
        cholLabel = new JLabel("Cholesterol: ");
        sugarLabel = new JLabel("Sugar: ");

        dateField = new JTextField();
        weightField = new JTextField();
        heightField = new JTextField();
        bpHField = new JTextField();
        bpLField = new JTextField();
        haemoField = new JTextField();
        cholField = new JTextField();
        sugarField = new JTextField();

        addButton = new JButton("Add Report");
        addButton.addActionListener(this);

        inputPanel.add(dateLabel);
        inputPanel.add(dateField);
        inputPanel.add(weightLabel);
        inputPanel.add(weightField);
        inputPanel.add(heightLabel);
        inputPanel.add(heightField);
        inputPanel.add(bpHLabel);
        inputPanel.add(bpHField);
        inputPanel.add(bpLLabel);
        inputPanel.add(bpLField);
        inputPanel.add(haemoLabel);
        inputPanel.add(haemoField);
        inputPanel.add(cholLabel);
        inputPanel.add(cholField);
        inputPanel.add(sugarLabel);
        inputPanel.add(sugarField);

        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(addButton, BorderLayout.SOUTH);

        add(mainPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ReportGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String date = dateField.getText();
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());
            int bpH = Integer.parseInt(bpHField.getText());
            int bpL = Integer.parseInt(bpLField.getText());
            double haemo = Double.parseDouble(haemoField.getText());
            double chol = Double.parseDouble(cholField.getText());
            double sugar = Double.parseDouble(sugarField.getText());
            Report report = new Report(date, bpH, bpL, haemo, weight, height, chol, sugar);
            Patient.reports.add(report);
            JOptionPane.showMessageDialog(mainPanel, "Report added successfully!");
        }
    }
}

