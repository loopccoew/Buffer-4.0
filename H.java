package com.example.demo2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.example.demo2.Hospital.medicalRecords;
import static com.example.demo2.MedicalRecordSystem.doctor_a;
import static com.example.demo2.MedicalRecordSystem.doctor_b;

public class H extends JFrame implements ActionListener {

    private JLabel titleLabel;
    private JButton addRecordButton;
    private JButton searchRecordButton;
    private JButton viewAllRecordsButton;
    private JButton addReportButton;
    private JButton doctorAppointmentsButton;
    private JButton logoutButton;
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JPanel doctorPanel;
    private JLabel doctorLabel;
    private JButton doctor1Button;
    private JButton doctor2Button;

    private Hospital hospital;
    private Doctor doctorA;
    private Doctor doctorB;

    public H() {
        super("Hospital Staff");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hospital = new Hospital();
        doctorA = new Doctor("Dr. Ajay Joshi");
        doctorB = new Doctor("Dr. Meenal Kumar");

        titleLabel = new JLabel("Please select an option:");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        addRecordButton = new JButton("Add a new medical record");
        addRecordButton.addActionListener(this);

        searchRecordButton = new JButton("Search for a medical record");
        searchRecordButton.addActionListener(this);

        viewAllRecordsButton = new JButton("View all medical records");
        viewAllRecordsButton.addActionListener(this);

        addReportButton = new JButton("Add report to patient");
        addReportButton.addActionListener(this);

        doctorAppointmentsButton = new JButton("(For doctors) See your appointments for today");
        doctorAppointmentsButton.addActionListener(this);

        logoutButton = new JButton("Hospital Staff Logout");
        logoutButton.addActionListener(this);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 2));
        buttonPanel.add(addRecordButton);
        buttonPanel.add(searchRecordButton);
        buttonPanel.add(viewAllRecordsButton);
        buttonPanel.add(addReportButton);
        buttonPanel.add(doctorAppointmentsButton);
        buttonPanel.add(logoutButton);

        doctorLabel = new JLabel("Welcome Doctor, What is your name?");
        doctorLabel.setFont(new Font("Arial", Font.BOLD, 16));

        doctor1Button = new JButton("Dr. Ajay Joshi");
        doctor1Button.addActionListener(this);

        doctor2Button = new JButton("Dr. Meenal Kumar");
        doctor2Button.addActionListener(this);

        doctorPanel = new JPanel();
        doctorPanel.setLayout(new GridLayout(3, 1));
        doctorPanel.add(doctorLabel);
        doctorPanel.add(doctor1Button);
        doctorPanel.add(doctor2Button);
        doctorPanel.setVisible(false);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(doctorPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addRecordButton) {
           AddRecord f = new AddRecord(medicalRecords );
        } else if (e.getSource() == searchRecordButton) {
            SearchRecord s = new SearchRecord(medicalRecords);
        } else if (e.getSource() == viewAllRecordsButton) {
            ViewRecord v= new ViewRecord(medicalRecords);
        } else if (e.getSource() == addReportButton) {
           AddReport g = new AddReport(medicalRecords);
        } else if (e.getSource() == doctorAppointmentsButton) {
            buttonPanel.setVisible(false);
            doctorPanel.setVisible(true);
        } else if (e.getSource() == doctor1Button) {
            boolean m = true;
            while (m) {
                int x = JOptionPane.showOptionDialog(null,"Please select an option:", "Dr. Ajay Joshi",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, new String[]{"See today's appointments", "Deque appointment queue and Go Back"}, null);
                if (x == 0) {
                    AppointmentView.main(new String[0]);
                }  else if(x==1) {
                    JOptionPane.showMessageDialog(null,"dequed appointment successfully!");
                    doctor_a.dequeAppointment(doctor_a);
                    doctorPanel.setVisible(false);
                    buttonPanel.setVisible(true);
                    m = false;
                }
            }
        } else if (e.getSource() == doctor2Button) {
            boolean m = true;
            while (m) {
                int x = JOptionPane.showOptionDialog(null,
                        "Please select an option:", "Dr. Meenal Kumar",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, new String[]{"See today's appointments", "Deque appointment queue and Go Back"}, null);
                if (x == 0) {
                    AppointmentB.main(new String[0]);
                } else if(x==1){
                    JOptionPane.showMessageDialog(null,"dequed appointment successfully!");
                    doctor_b.dequeAppointment(doctor_b);
                    doctorPanel.setVisible(false);
                    buttonPanel.setVisible(true);
                    m = false;
                }
            }
        } else if (e.getSource() == logoutButton) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        H frame = new H();
    }
}

// End of code.
