package com.example.demo2;

import java.awt.*;
import javax.swing.*;

public class checkHealthtrendsGUI extends JFrame {

    private JTextArea outputTextArea;

    public checkHealthtrendsGUI() {
        super("Health Trends");

        // Set layout
        setLayout(new BorderLayout());

        // Create text area to display output
        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));

        // Create scroll pane for output text area
        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        // Add scroll pane to center of frame
        add(scrollPane, BorderLayout.CENTER);

        // Create button to check health trends
        JButton checkButton = new JButton("Check Health Trends");

        // Add action listener to button
        checkButton.addActionListener(e -> {
            // Call checkHealthTrends method and display results in output text area
            checkHealthTrends();
        });

        // Add button to south of frame
        add(checkButton, BorderLayout.SOUTH);

        // Set frame properties
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void checkHealthTrends() {


        int bpH = 0, bpL = 0, bh = 0, bl = 0;
        double haemo = 0, sugar = 0, weight = 0, choles = 0, h = 0, s = 0, w = 0, c = 0;
        //to check increase or decrease in factors of report
        for (int i = 1; i < Patient.reports.size(); i++) {
            bpH = Patient.reports.get(i).getBpH() - Patient.reports.get(i - 1).getBpH();
            bpL = bpL + Patient.reports.get(i).getBpL() - Patient.reports.get(i - 1).getBpL();
            haemo = haemo + Patient.reports.get(i).getHaemoglobin() - Patient.reports.get(i - 1).getHaemoglobin();
            sugar = sugar + Patient.reports.get(i).getSugar() - Patient.reports.get(i - 1).getSugar();
            weight = weight + Patient.reports.get(i).getWeight() - Patient.reports.get(i - 1).getWeight();
            choles = choles + Patient.reports.get(i).getCholesterol() - Patient.reports.get(i - 1).getCholesterol();
            System.out.println(Patient.reports.get(i).getBpH());
        }
            for(int i=1;i<Patient.reports.size();i++){
            bh = Patient.reports.get(i).getBpH();
            bl = Patient.reports.get(i).getBpL();
            h = Patient.reports.get(i).getHaemoglobin();
            s = Patient.reports.get(i).getSugar();
            w = Patient.reports.get(i).getWeight();
            c = Patient.reports.get(i).getCholesterol();
        }

        // Clear output text area
        outputTextArea.setText("");

        //to check if safe limits are exceeded
        outputTextArea.append("***BLOOD PRESSURE***\n");
        if (bh > 125 || bl > 85) {
            outputTextArea.append("You have high Blood Pressure. \n(TIP: Reduce intake of salt in your diet.)\n");
        } else if (bh < 115 || bl < 75) {
            outputTextArea.append("You have low Blood Pressure. \n(TIP: You should start doing breathing excercises.)\n");
        } else {
            outputTextArea.append("You have normal blood pressure. \n(Keeping yourself fit!)\n");
        }

        outputTextArea.append("\n***HAEMOGLOBIN***\n");
        if (h > 14) {
            outputTextArea.append("You have high Haemoglobin.\n");
        } else if (h < 9) {
            outputTextArea.append("You have low Haemoglobin. \n(TIP: You should start eating more iron - rich foods like spinach, lentils, and red meat.\n");

        } else {
            outputTextArea.append("You have normal Haemoglobin. (Good job!)\n");
        }
        outputTextArea.append("\n***BLOOD SUGAR LEVEL***\n");
        if (s > 7.8) {
            outputTextArea.append("You have high Blood Sugar Level. \n(TIP: Reduce intake of sugary foods and drinks.)\n");
        } else if (s < 4) {
            outputTextArea.append("You have low Blood Sugar Level. \n(TIP: Eat small, frequent meals throughout the day.)\n");
        } else {
            outputTextArea.append("You have normal Blood Sugar Level. (Good job!)\n");
        }

        outputTextArea.append("\n***WEIGHT***\n");
        if (w > 75) {
            outputTextArea.append("You are overweight. \n(TIP: Exercise regularly and eat a balanced diet.)\n");
        } else if (w < 55) {
            outputTextArea.append("You are underweight. \n(TIP: Eat more nutrient-dense foods and consider consulting a nutritionist.)\n");
        } else {
            outputTextArea.append("You have a healthy weight. (Good job!)\n");
        }

        outputTextArea.append("\n***CHOLESTEROL LEVEL***\n");
        if (c > 200) {
            outputTextArea.append("You have high Cholesterol Level. \n(TIP: Reduce intake of saturated and trans fats.)\n");
        } else if (c < 180) {
            outputTextArea.append("You have low Cholesterol Level. \n(TIP: Consider adding more healthy fats to your diet, such as avocados and nuts.)\n");
        } else {
            outputTextArea.append("You have normal Cholesterol Level. (Good job!)\n");
        }

        // Append increase/decrease in values
        outputTextArea.append("\n***INCREASE/DECREASE IN VALUES***\n");
        outputTextArea.append("Increase in BP High: " + bpH + "\n");
        outputTextArea.append("Increase in BP Low: " + bpL + "\n");
        outputTextArea.append("Increase in Haemoglobin: " + haemo + "\n");
        outputTextArea.append("Increase in Blood Sugar Level: " + sugar + "\n");
        outputTextArea.append("Increase in Weight: " + weight + "\n");
        outputTextArea.append("Increase in Cholesterol Level: " + choles + "\n");

    }
    public static void main(String[] args) {
        // Create new HealthTrendsGUI object
        checkHealthtrendsGUI gui = new checkHealthtrendsGUI();
    }
}

