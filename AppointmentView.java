package com.example.demo2;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

import static com.example.demo2.MedicalRecordSystem.doctor_a;

public class AppointmentView  extends JFrame {
    private JTextArea appointmentTextArea;

    public AppointmentView() {
        super("Appointment Viewer");

        // create the main panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // create the appointment text area
        appointmentTextArea = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(appointmentTextArea);

        // add the appointment text area to the main panel
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // add the main panel to the frame
        add(mainPanel);

        // set the size and visibility of the frame
        setSize(500, 400);
        setVisible(true);
    }

    public void updateAppointmentText(String appointmentText) {
        appointmentTextArea.setText(appointmentText);
    }

    public static void main(String args[]) {
        AppointmentView appointmentView = new AppointmentView();
        String appointmentText = doctor_a.viewappointment(new StringBuilder());
        appointmentView.updateAppointmentText(appointmentText);
    }
}


    //String doctorname;

