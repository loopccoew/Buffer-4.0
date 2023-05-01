package com.example.demo2;

//package tryframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AmbulanceGUI {
    private JFrame frame;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private int patient;
    private static final int MAX_NODES = 100;
    private static final int INF = Integer.MAX_VALUE; //setting all unavailable edges to infinity
    private int[] shortestdistance;
    private boolean[] visited;
    private List<Edge>[] adjecent;
    private JTextField textField;
    private JTextField textField_1;

    public AmbulanceGUI(int numNodes) {
        shortestdistance = new int[numNodes];
        visited = new boolean[numNodes];
        adjecent = new ArrayList[numNodes];

        for (int i = 0; i < numNodes; i++) {
            adjecent[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v, int weight) {
        adjecent[u].add(new Edge(v, weight));
        adjecent[v].add(new Edge(u, weight));
    }

    public int shortestPath(int source, int destination) {
        for (int i = 0; i < shortestdistance.length; i++) {
            shortestdistance[i] = INF;
        }

        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(source, 0));
        shortestdistance[source] = 0;

        while (pq.isEmpty()!=true) {
            Node curr = pq.poll();
            int current = curr.node;

            if (visited[current]) {
                continue;
            }

            visited[current] = true;

            for (Edge e : adjecent[current]) {
                int v = e.node;
                int weight = e.weight;

                if (visited[v]!=true && shortestdistance[current] + weight < shortestdistance[v]) {
                    shortestdistance[v] = shortestdistance[current] + weight;
                    pq.offer(new Node(v, shortestdistance[v]));
                }
            }
        }



        return shortestdistance[destination];
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AmbulanceGUI window = new AmbulanceGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AmbulanceGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 635, 458);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textField.setBounds(49, 297, 525, 45);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JRadioButton rdbtnHospital = new JRadioButton("Sunshine Hospital");
        rdbtnHospital.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rdbtnHospital.setBounds(70, 85, 167, 23);
        frame.getContentPane().add(rdbtnHospital);
        buttonGroup.add(rdbtnHospital);

        JRadioButton rdbtnHospital_1 = new JRadioButton("Wellfare Hospital");
        rdbtnHospital_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rdbtnHospital_1.setBounds(402, 130, 172, 23);
        frame.getContentPane().add(rdbtnHospital_1);
        buttonGroup.add(rdbtnHospital_1);

        JRadioButton rdbtnHospital_2 = new JRadioButton("Amity Hospital");
        rdbtnHospital_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rdbtnHospital_2.setBounds(239, 173, 167, 23);
        frame.getContentPane().add(rdbtnHospital_2);
        buttonGroup.add(rdbtnHospital_2);

        JRadioButton rdbtnHospital_3 = new JRadioButton("Viman Nagar");
        rdbtnHospital_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rdbtnHospital_3.setBounds(239, 85, 143, 23);
        frame.getContentPane().add(rdbtnHospital_3);
        buttonGroup.add(rdbtnHospital_3);

        JRadioButton rdbtnHospital_4 = new JRadioButton("Shivaji Nagar");
        rdbtnHospital_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rdbtnHospital_4.setBounds(239, 130, 130, 23);
        frame.getContentPane().add(rdbtnHospital_4);
        buttonGroup.add(rdbtnHospital_4);

        JRadioButton rdbtnHospital_5 = new JRadioButton("Karve Nagar");
        rdbtnHospital_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rdbtnHospital_5.setBounds(70, 130, 167, 23);
        frame.getContentPane().add(rdbtnHospital_5);
        buttonGroup.add(rdbtnHospital_5);

        JRadioButton rdbtnHospital_6 = new JRadioButton("Jaber Nagar");
        rdbtnHospital_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rdbtnHospital_6.setBounds(402, 85, 130, 23);
        frame.getContentPane().add(rdbtnHospital_6);
        buttonGroup.add(rdbtnHospital_6);

        JButton btnNewButton_1 = new JButton("Closest hospital");
        btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        btnNewButton_1.setBounds(224, 243, 172, 28);
        frame.getContentPane().add(btnNewButton_1);

        JLabel lblNewLabel = new JLabel("CLOSEST HOSPITAL");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel.setBounds(224, 20, 234, 23);
        frame.getContentPane().add(lblNewLabel);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textField_1.setColumns(10);
        textField_1.setBounds(49, 340, 525, 45);
        frame.getContentPane().add(textField_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                AmbulanceGUI graph = new AmbulanceGUI(7);
                graph.addEdge(0, 1, 5);
                graph.addEdge(0, 2, 10);
                graph.addEdge(1, 2, 3);
                graph.addEdge(1, 3, 9);
                graph.addEdge(2, 4, 12);
                graph.addEdge(3, 4, 4);
                graph.addEdge(3, 5, 7);
                graph.addEdge(4, 5, 2);
                graph.addEdge(3, 6, 8);
                graph.addEdge(0, 6, 14);
                graph.addEdge(4, 0, 11);
                if (rdbtnHospital.isSelected()) {
                    patient = 0;
                } else if (rdbtnHospital_1.isSelected()) {
                    patient = 1;
                } else if (rdbtnHospital_2.isSelected()) {
                    patient = 6;
                } else if (rdbtnHospital_3.isSelected()) {
                    patient = 2;
                } else if (rdbtnHospital_4.isSelected()) {
                    patient = 3;
                } else if (rdbtnHospital_5.isSelected()) {
                    patient = 4;
                } else if (rdbtnHospital_6.isSelected()) {
                    patient = 5;
                }

                int minDist = INF;
                int nearestHospital = -1;
                for (int hospital : new int[] {0, 1, 6}) {
                    int dist = graph.shortestPath(hospital, patient);
                    if (dist < minDist) {
                        minDist = dist;
                        nearestHospital = hospital;
                    }
                }

                int distToHospital = graph.shortestPath(nearestHospital, patient);
                String hos="";
                if(nearestHospital==0)
                {
                    hos="Sunshine Hospital";
                }
                else if(nearestHospital==1)
                {
                    hos="Wellfare Hospital";
                }
                else if(nearestHospital==6)
                {
                    hos="Amity Hospital";
                }
                textField.setText("The nearest hospital to the patient is:-"+hos);
                textField_1.setText("The distance to be travelled is:-"+distToHospital+"km");

            }

        });


    }
    private static class Node implements Comparable<Node> {
        int node;
        int distance;

        public Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(distance, o.distance);
        }
    }

    private static class Edge {
        int node;
        int weight;

        public Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
}
