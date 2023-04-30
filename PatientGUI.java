package com.example.demo2;//package tryframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PatientGUI {
    Patient P = new Patient();
    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PatientGUI window = new PatientGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public PatientGUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame = new JFrame();
        frame.setBounds(100, 100, 620, 435);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("PATIENT");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel.setBounds(229, 31, 111, 24);
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("Add/Edit name");
        btnNewButton.setBounds(82, 103, 137, 32);
        frame.getContentPane().add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Addname A = new Addname(P);
            }
        });


        JButton btnNewButton_1 = new JButton("2. Add/Edit Diagnosis");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Adddiagnosis d = new Adddiagnosis(P);
            }
        });
        btnNewButton_1.setBounds(229, 103, 142, 32);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("3. Add/Edit diagnosis date");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Adddate d = new Adddate(P);
            }
        });
        btnNewButton_2.setBounds(381, 103, 151, 32);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("4. Add report");
        btnNewButton_3.setBounds(82, 258, 138, 32);
        frame.getContentPane().add(btnNewButton_3);
        btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReportGUI.main(new String[0]);
            }
        });


        JButton btnNewButton_4 = new JButton("5. View all details");
        btnNewButton_4.setBounds(229, 258, 137, 32);
        frame.getContentPane().add(btnNewButton_4);
        btnNewButton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Report1.main(new String[0]);
            }
        });

        JButton btnNewButton_5 = new JButton("6. Check your health trends");
        btnNewButton_5.setBounds(116, 174, 161, 32);
        frame.getContentPane().add(btnNewButton_5);
        btnNewButton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkHealthtrendsGUI.main(new String[0]);
            }
        });

        JButton btnNewButton_6 = new JButton("7. Book an appointment");
        btnNewButton_6.setBounds(302, 174, 142, 32);
        frame.getContentPane().add(btnNewButton_6);
        btnNewButton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         Book.main(new String[0]);
            }
        });

        JButton btnNewButton_7 = new JButton("Patient Logout");
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_7.setBackground(new Color(0, 0, 0));
        btnNewButton_7.setForeground(new Color(0, 0, 0));
        btnNewButton_7.setBounds(381, 258, 151, 32);
        frame.getContentPane().add(btnNewButton_7);
    }

       }