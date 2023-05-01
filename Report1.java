package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Report1 extends JFrame {

    ArrayList<Report> reports;
    private JTextArea reportDisplay;

    public Report1(ArrayList<Report> reports) {
        this.reports = reports;

        // Create the text area to display the reports
        reportDisplay = new JTextArea(20, 50);
        reportDisplay.setEditable(false);

        // Add the text area to a scroll pane so it can scroll if there are many reports
        JScrollPane scrollPane = new JScrollPane(reportDisplay);

        // Add the scroll pane to the frame
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Set the title and size of the frame
        setTitle("All Reports");
        setSize(600, 400);

        // Display all reports
        displayReports();
    }

    private void displayReports() {
        // Clear the text area
        reportDisplay.setText("");

        // Display each report
        for (Report r : reports) {
            reportDisplay.append("Date: " + r.getDate() + "\n");
            reportDisplay.append("Weight: " + r.getWeight() + " kg\n");
            reportDisplay.append("Height: " + r.getHeight() + " cm\n");
            reportDisplay.append("Blood pressure: " + r.getBpH() + "-" + r.getBpL() + "\n");
            reportDisplay.append("Haemoglobin: " + r.getHaemoglobin() + "\n");
            reportDisplay.append("Cholesterol: " + r.getCholesterol() + "\n");
            reportDisplay.append("Sugar: " + r.getSugar() + "\n\n");
        }
    }

    public static void main(String[] args) {
        // Create some example reports
        //ArrayList<Report> reports = new ArrayList<>();
       // reports.add(new Report("01/01/2023", 120, 80, 12.5, 75.0, 180.0, 5.0, 100.0));
     //   reports.add(new Report("02/01/2023", 130, 90, 13.0, 77.0, 182.0, 5.5, 105.0));

        // Create the GUI and display it
        Report1 reportGUI = new Report1(Patient.reports);
        reportGUI.setVisible(true);
    }
}
