package com.example.demo2;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.util.*;



public class DiseaseSpread extends JFrame implements ActionListener {



    private static final long serialVersionUID = 1L;

    private JComboBox<String> locality1, locality2;

    private JButton btnDiseaseSpread, btnNumPatients, btnHotspot, btnExit;

    private static JTextArea outputArea;

    private JPanel controlPanel;



    public DiseaseSpread() {

        setTitle("Disease Spread");

        setSize(600, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        controlPanel = new JPanel(new GridLayout(5, 2));



        String[] localities = { "Karvenagar", "M.N.P", "Kothrud", "Aundh", "PCMC" };

        locality1 = new JComboBox<>(localities);

        locality2 = new JComboBox<>(localities);

        controlPanel.add(new JLabel("Locality 1:"));

        controlPanel.add(locality1);

        controlPanel.add(new JLabel("Locality 2:"));

        controlPanel.add(locality2);



        btnDiseaseSpread = new JButton("See Disease Spread");

        btnDiseaseSpread.addActionListener(this);

        controlPanel.add(btnDiseaseSpread);



        btnNumPatients = new JButton("See Number of Patients Travelling");

        btnNumPatients.addActionListener(this);

        controlPanel.add(btnNumPatients);



        btnHotspot = new JButton("See the Hotspot");

        btnHotspot.addActionListener(this);

        controlPanel.add(btnHotspot);



        btnExit = new JButton("Exit");

        btnExit.addActionListener(this);

        controlPanel.add(btnExit);



        outputArea = new JTextArea(10, 50);

        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(controlPanel, BorderLayout.NORTH);

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);

    }



    public static void main(String[] args) {

        new DiseaseSpread();

    }



    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnDiseaseSpread) {

            outputArea.setText("");

            outputArea.append("Disease transmission has been done as follows:\n");

            BFS();

        } else if (e.getSource() == btnNumPatients) {

            outputArea.setText("");

            outputArea.append("Total patients travelling from "

                    + locality1.getSelectedItem() + " to "

                    + locality2.getSelectedItem() + " are "

                    + diseaseoutbreak(getNode((String) locality1.getSelectedItem()),

                    getNode((String) locality2.getSelectedItem())) + "\n");

        } else if (e.getSource() == btnHotspot) {

            outputArea.setText("");

            outputArea.append("The hotspot locality is: " + hotspot() + "\n");

        } else if (e.getSource() == btnExit) {

            System.exit(0);

        }

    }



    static Node getNode(String s) {

        Node n = new Node();

        switch (s) {

            case "Karvenagar":

                n = Graph.a;

                break;

            case "M.N.P":

                n = Graph.b;

                break;

            case "Kothrud":

                n = Graph.c;

                break;

            case "Aundh":

                n = Graph.d;

                break;

            case "PCMC":

                n = Graph.e;

                break;

        }

        return n;

    }



    // Breadth First Search Algorithm

    static void BFS() {

        Queue<Node> queue = new LinkedList<>();

        queue.add(Graph.a);

        Graph.a.visited = true;

        while (!queue.isEmpty()) {

            Node element = queue.remove();

            outputArea.append(element.name + " -> ");

            ArrayList<Node> neighbours = element.neighbours;

            for (int i = 0; i < neighbours.size(); i++) {

                Node n = neighbours.get(i);

                if (n != null && !n.visited) {

                    queue.add(n);

                    n.visited = true;

                }

            }

        }

        resetNodes();

    }



    static int diseaseoutbreak(Node source, Node destination) {

        int patients = 0;

        Queue<Node> queue = new LinkedList<>();

        queue.add(source);

        source.visited = true;

        while (!queue.isEmpty()) {

            Node element = queue.remove();

            ArrayList<Node> neighbours = element.neighbours;

            for (int i = 0; i < neighbours.size(); i++) {

                Node n = neighbours.get(i);

                if (n == destination) {

                    patients++;

                }

                if (n != null && !n.visited) {

                    queue.add(n);

                    n.visited = true;

                }

            }

        }

        resetNodes();

        return patients;

    }



    static String hotspot() {

        int maxCount = 0;

        String hotspot = "";

        for (Node node : Graph.nodes) {

            int count = 0;

            for (Node neighbour : node.neighbours) {

                if (neighbour != null) {

                    count++;

                }

            }

            if (count > maxCount) {

                maxCount = count;

                hotspot = node.name;

            }

        }

        return hotspot;

    }



    static void resetNodes() {

        for (Node node : Graph.nodes) {

            node.visited = false;

        }

    }

}

class Node {

    String name;

    boolean visited;

    ArrayList<Node> neighbours;

    Node() {

        neighbours = new ArrayList<>();

    }

}

class Graph {

    static Node a = new Node();

    static Node b = new Node();

    static Node c = new Node();

    static Node d = new Node();

    static Node e = new Node();

    static ArrayList<Node> nodes;

    static {

        a.name = "Karvenagar";

        b.name = "M.N.P";

        c.name = "Kothrud";

        d.name = "Aundh";

        e.name = "PCMC";


        a.neighbours.addAll(Arrays.asList(b, c, d));

        b.neighbours.addAll(Arrays.asList(a, c, d, e));

        c.neighbours.addAll(Arrays.asList(a, b, d));

        d.neighbours.addAll(Arrays.asList(a, b, c, e));

        e.neighbours.addAll(Arrays.asList(b, d));


        nodes = new ArrayList<>(Arrays.asList(a, b, c, d, e));

    }
}
