package com.example.demo2;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewRecord extends JFrame {
    

    public ViewRecord(ArrayList<Patient> medicalRecords) {
        

        setTitle("View All Medical Records");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(789, 452); // Set the size of the frame to 800x600 pixels
        getContentPane().setLayout(null);

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(50, 50, 700, 450); // Set the size of the scroll pane to 700x450 pixels
        getContentPane().add(scrollPane);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose());
        closeButton.setBounds(325, 520, 150, 30); // Set the size and position of the close button
        getContentPane().add(closeButton);

        StringBuilder sb = new StringBuilder();
        if (medicalRecords.isEmpty()) {
            sb.append("No medical records found.");
        } else {
            sb.append("All medical records:\n");
            for (Patient p : medicalRecords) {
                for (Report r: Patient.reports) {
                    sb.append(p.getPatientName()).append(":\n");
                    sb.append(r.display(sb)).append("\n\n");
                }
            }
        }
        resultArea.setText(sb.toString());

        setVisible(true);
    }
}