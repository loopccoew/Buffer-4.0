package com.example.demo2;

//package tryframe;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Skin {

    private JFrame frame;
    private JTextField txtDiagnoseMeeyes;
    private JTextField txtDiagnoseMeeyes_1;

    private static class Node {
        String symptom;
        Node yes;
        Node no;

        public Node(String symptom) {
            this.symptom = symptom;
            this.yes = null;
            this.no = null;
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Skin window = new Skin();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Skin() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(240, 240, 240));
        frame.setBounds(100, 100, 718, 482);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JCheckBox chckbxNewCheckBox = new JCheckBox("itchiness");
        chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chckbxNewCheckBox.setBounds(84, 95, 93, 21);
        frame.getContentPane().add(chckbxNewCheckBox);

        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("rash");
        chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chckbxNewCheckBox_1.setBounds(274, 95, 93, 21);
        frame.getContentPane().add(chckbxNewCheckBox_1);

        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("redness");
        chckbxNewCheckBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chckbxNewCheckBox_2.setBounds(84, 166, 93, 21);
        frame.getContentPane().add(chckbxNewCheckBox_2);

        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("blisters");
        chckbxNewCheckBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chckbxNewCheckBox_3.setBounds(274, 166, 113, 21);
        frame.getContentPane().add(chckbxNewCheckBox_3);

        JCheckBox chckbxNewCheckBox_4 = new JCheckBox("dryness");
        chckbxNewCheckBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chckbxNewCheckBox_4.setBounds(476, 166, 93, 21);
        frame.getContentPane().add(chckbxNewCheckBox_4);

        JCheckBox chckbxNewCheckBox_5 = new JCheckBox("pain");
        chckbxNewCheckBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chckbxNewCheckBox_5.setBounds(274, 237, 176, 21);
        frame.getContentPane().add(chckbxNewCheckBox_5);

        JCheckBox chckbxNewCheckBox_6 = new JCheckBox("flaking");
        chckbxNewCheckBox_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chckbxNewCheckBox_6.setBounds(476, 95, 138, 21);
        frame.getContentPane().add(chckbxNewCheckBox_6);

        JButton btnNewButton = new JButton("Diagnose Me");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LinkedList<String> listofSymptoms=new LinkedList<String>();
                if(chckbxNewCheckBox.isSelected()) {
                    listofSymptoms.add("itchiness");
                }
                if(chckbxNewCheckBox_1.isSelected()) {
                    listofSymptoms.add("rash");
                }
                if(chckbxNewCheckBox_2.isSelected()) {
                    listofSymptoms.add("redness");
                }
                if(chckbxNewCheckBox_3.isSelected()) {
                    listofSymptoms.add("blisters");
                }
                if(chckbxNewCheckBox_4.isSelected()) {
                    listofSymptoms.add("dryness");
                }
                if(chckbxNewCheckBox_5.isSelected()) {
                    listofSymptoms.add("pain");
                }
                if(chckbxNewCheckBox_6.isSelected()) {
                    listofSymptoms.add("flaking");
                }

                Node root = new Node("itchiness");
                root.yes = new Node("rash");
                root.no = new Node("redness");
                root.yes.yes = new Node("blisters");
                root.yes.no = new Node("dryness");
                root.no.yes = new Node("pain");
                root.no.no = new Node("flaking");
                root.yes.yes.yes = new Node("You may have chickenpox");
                root.yes.yes.no = new Node("You may have shingles");
                root.yes.no.yes = new Node("You may have eczema");
                root.yes.no.no = new Node("You may have psoriasis");
                root.no.yes.yes = new Node("You may have an infection");
                root.no.yes.no = new Node("You may have cellulitis");
                root.no.no.yes = new Node("You may have rosacea");
                root.no.no.no = new Node("You may have dry skin");

                Node current = root;
                while(current.yes != null || current.no != null) {
                    if(listofSymptoms.contains(current.symptom)) {
                        current = current.yes;
                    } else {
                        current = current.no;
                    }
                }
                txtDiagnoseMeeyes.setText(current.symptom);
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        btnNewButton.setBounds(264, 305, 169, 42);
        frame.getContentPane().add(btnNewButton);

        txtDiagnoseMeeyes = new JTextField("");
        txtDiagnoseMeeyes.setEditable(false);
        txtDiagnoseMeeyes.setFont(new Font("Times New Roman", Font.BOLD, 18));
        txtDiagnoseMeeyes.setBounds(49, 371, 626, 50);
        frame.getContentPane().add(txtDiagnoseMeeyes);
        txtDiagnoseMeeyes.setColumns(10);

        txtDiagnoseMeeyes_1 = new JTextField();
        txtDiagnoseMeeyes_1.setText(" DIAGNOSE ME-SKIN");
        txtDiagnoseMeeyes_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        txtDiagnoseMeeyes_1.setBounds(223, 31, 246, 30);
        frame.getContentPane().add(txtDiagnoseMeeyes_1);
        txtDiagnoseMeeyes_1.setColumns(10);
    }
}
