package com.example.demo2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

//package tryframe;



import java.awt.Dimension;



import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.SwingUtilities;

import javax.swing.table.DefaultTableModel;



public class PrimsGUI {



    // Number of vertices in the graph

    static final int V = 5;



    // Array to store constructed MST

    static int[] parent = new int[V];



    // Key values used to pick minimum weight edge in cut

    static int[] key = new int[V];



    // A utility function to find the vertex with minimum key

    // value, from the set of vertices not yet included in MST

    static int minKey(int key[], Boolean mstSet[]) {

        // Initialize min value

        int min = Integer.MAX_VALUE, min_index = -1;



        for (int v = 0; v < V; v++)

            if (mstSet[v] == false && key[v] < min) {

                min = key[v];

                min_index = v;

            }



        return min_index;

    }



    // Function to construct and print MST for a graph represented

    // using adjacency matrix representation

    static void primMST(int graph[][]) {

        // To represent set of vertices not yet included in MST

        Boolean mstSet[] = new Boolean[V];



        // Initialize all keys as INFINITE

        for (int i = 0; i < V; i++) {

            key[i] = Integer.MAX_VALUE;

            mstSet[i] = false;

        }



        // Always include first 1st vertex in MST.

        key[0] = 0; // Make key 0 so that this vertex is

        // picked as first vertex

        parent[0] = -1; // First node is always root of MST



        // The MST will have V vertices

        for (int count = 0; count < V - 1; count++) {

            // Pick thd minimum key vertex from the set of vertices

            // not yet included in MST

            int u = minKey(key, mstSet);



            // Add the picked vertex to the MST Set

            mstSet[u] = true;



            for (int v = 0; v < V; v++)



                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {

                    parent[v] = u;

                    key[v] = graph[u][v];

                }

        }

    }



    public static void main(String[] args) {

        // Create a graph with the distances between hospitals

        int[][] graph = new int[][]{{0, 2, 0, 6, 0}, {2, 0, 3, 8, 5}, {0, 3, 0, 0, 7}, {6, 8, 0, 0, 9},

                {0, 5, 7, 9, 0}};



        // Find the minimum spanning tree using Prim's algorithm

        primMST(graph);

// Create a table with the model

        // DefaultTableModel model = null;





        // Create a scroll pane with the table



        // Create a table model with the headers

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"Hospital", "Distance", "Message"}) {

            @Override

            public Class<?> getColumnClass(int column) {

                switch (column) {

                    case 0:

                        return String.class; // "Hospital" column is a String

                    case 1:

                        return Integer.class; // "Distance" column is an Integer

                    case 2:

                        return String.class; // "Message" column is a String

                    default:

                        return Object.class;

                }

            }

        };



        for (int i = 1; i < V; i++) {

            String message = "";

            if (graph[i][parent[i]] < 4) {

                message = "These hospitals are connected enough to share resources, recommend patients, and transfer doctors";

            } else {

                message = "These hospitals are not close enough to share resources, recommend patients, or transfer doctors";

            }





            model.addRow(new Object[]{"Hospital " + (parent[i] + 1) + " - Hospital " + (i + 1),

                    graph[i][parent[i]], message});

        }

        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);



        // Create a panel with the scroll pane

        JPanel panel = new JPanel();

        panel.add(scrollPane);



        // Create a frame with the panel

        JFrame frame = new JFrame("Minimum Spanning Tree of Hospitals");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(panel);

        frame.setSize(new Dimension(800, frame.getHeight()));

        frame.pack();

        frame.setVisible(true);







    }

}