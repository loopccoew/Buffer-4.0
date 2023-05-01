package com.example.demo2;

import java.awt.EventQueue;


import javax.swing.*;

import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


import static com.example.demo2.MedicalRecordSystem.*;


public class Book {



    private JFrame frame;



    /**

     * Launch the application.

     */

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {

                    Book window = new Book();

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

    public Book() {

        initialize();

    }



    /**

     * Initialize the contents of the frame.

     */

    private void initialize() {

        frame = new JFrame();

        frame.setBounds(100, 100, 645, 442);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(null);



        JLabel lblNewLabel = new JLabel("Book an Appointment");

        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));

        lblNewLabel.setBounds(199, 38, 286, 38);

        frame.getContentPane().add(lblNewLabel);



        JButton btnNewButton = new JButton("Dr Ajay Joshi");

        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                patient1.bookappointment(doctor_a, patient1);

                JOptionPane.showMessageDialog(null, "Appointment booked successfully with Dr Ajay Joshi");

            }

        });

        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        btnNewButton.setBounds(93, 191, 150, 63);

        frame.getContentPane().add(btnNewButton);



        JButton btnNewButton_1 = new JButton("Dr Meenal Kumar");

        btnNewButton_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                patient1.bookappointment(doctor_b, patient1);

                JOptionPane.showMessageDialog(null, "Appointment booked successfully with Dr Meenal Kumar");


            }

        });

        btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        btnNewButton_1.setBounds(355, 191, 155, 63);

        frame.getContentPane().add(btnNewButton_1);











        JLabel lblNewLabel_1 = new JLabel("Choose your Doctor");

        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        lblNewLabel_1.setBounds(222, 106, 180, 21);

        frame.getContentPane().add(lblNewLabel_1);

    }



}