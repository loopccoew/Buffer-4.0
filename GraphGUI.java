package com.example.demo2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

//import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphGUI {

    private static ArrayList<ArrayList<Pair1<Node, Integer>>> adj;
    private static Node a = new Node("Karvenagar", 1);
    private static Node b = new Node("M.N.P", 2);
    private static Node c = new Node("Kothrud", 3);
    private static Node d = new Node("Aundh", 4);
    private static Node e = new Node("PCMC", 5);
    static StringBuilder sb = new StringBuilder();


    static class Node {
        String s;
        int p;

        public Node(String s, int p) {
            this.s = s;
            this.p = p;
        }

        public Node() {

        }
    }


    public static void main(String args[]) {
        // Creating a graph with 5 vertices
        //Platform.startup();
        int V = 6;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Adding edges one by one
        addEdge(adj, a, b, 5);
        addEdge(adj, a, c, 4);
        addEdge(adj, b, c, 3);
        addEdge(adj, b, d, 5);
        addEdge(adj, c, d, 6);
        addEdge(adj, a, e, 8);
        addEdge(adj, b, e, 8);
        addEdge(adj, c, e, 7);
        addEdge(adj, d, e, 3);
        Pane root = new Pane();
        root.setPrefSize(600, 400);

        // Creating nodes and edges


        // Create a GridPane for the GUI layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Add a label for the disease spread
        Label diseaseLabel = new Label("Disease Trend:");
        gridPane.add(diseaseLabel, 0, 0);

        // Add a text area to display the disease spread
        TextArea diseaseTextArea = new TextArea();
        diseaseTextArea.setEditable(false);
        diseaseTextArea.setPrefSize(400, 200);
        gridPane.add(diseaseTextArea, 0, 1, 2, 1);

        // Add a button to show the disease spread
        Button diseaseButton = new Button("Show Disease Spread");
        Button patientsButton = new Button("Enter locality name");
        diseaseButton.setOnAction(event -> {

            //sb.append("The disease transmission has been done as follows:\n");
            BFS(adj, V, sb);
            diseaseTextArea.setText(sb.toString());
        });
        gridPane.add(diseaseButton, 0, 2);


        TextArea patientsTextArea = new TextArea();
        patientsTextArea.setEditable(false);
        patientsTextArea.setPrefSize(400, 200);
        gridPane.add(patientsTextArea, 0, 4, 2, 1);
        // Add a button to show the number of patients

        TextField localityTextField = new TextField();

        patientsButton.setOnAction(event ->
        {
            StringBuilder bc = new StringBuilder();
            String input = localityTextField.getText().trim();
            if (input.equalsIgnoreCase("Karvenagar")) {

                //int locality = Integer.parseInt(input);
                //  int patients = diseaseoutbreak(adj, V, locality);
                diseaseoutbreak(a, adj, bc);
                patientsTextArea.setText(bc.toString());
                //patientsTextArea.setText("The number of patients travelling from Locality " + locality + " is " + patients + ".");
            } else if (input.equalsIgnoreCase("MNP")) {
                diseaseoutbreak(b, adj, bc);
                patientsTextArea.setText(bc.toString());

            } else if (input.equalsIgnoreCase("Kothrud")) {
                diseaseoutbreak(c, adj, bc);
                patientsTextArea.setText(bc.toString());
            } else if (input.equalsIgnoreCase("Aundh")) {
                diseaseoutbreak(d, adj, bc);
                patientsTextArea.setText(bc.toString());
            } else if (input.equalsIgnoreCase("PCMC")) {
                diseaseoutbreak(e, adj, bc);
                patientsTextArea.setText(bc.toString());

            } else {
                patientsTextArea.setText("Please enter a valid locality name.");
            }
        });
        // Add a text area to display the number of patients travelling


        gridPane.add(patientsButton, 0, 3);
        gridPane.add(localityTextField, 1, 3);

        Stage stage = new Stage();
        // Create a new Scene with the GridPane as the root node
        Scene scene = new Scene(gridPane);

        // Set the scene to the stage
        stage.setScene(scene);

        // Set the title of the window
        stage.setTitle("Graph GUI");

        // Show the stage
        stage.show();
    }

    // Function to add an edge to the graph
    private static void addEdge(ArrayList<ArrayList<Pair1<Node, Integer>>> adj, Node u, Node v, int weight) {
        adj.get(u.p).add(new Pair1<>(v, weight));
        adj.get(v.p).add(new Pair1<>(u, weight));
    }

    // Function to perform BFS traversal of the graph
    // private static void BFS(ArrayList<ArrayList<Pair<Node, Integer>>> adj, int V, StringBuilder sb) {
    static void BFS(ArrayList<ArrayList<Pair1<Node, Integer>>> adj, int V, StringBuilder sb) {

        boolean visited[] = new boolean[V + 1];

        // Mark all vertices not-visited initially
        for (int i = 0; i <= V; i++)
            visited[i] = false;

        LinkedList<Node> queue = new LinkedList<Node>();

        // The start vertex or source vertex is 1
        Node s = new Node("Karvenagar", 1);


        visited[s.p] = true;
        queue.add(s);
        sb.append("\nThe disease transmission has been done as follows:");
        while (queue.size() != 0) {

            s = queue.poll();


            sb.append("\n " + s.s);
            sb.append("\n | ");


            for (int i = 0; i < adj.get(s.p).size(); i++) {


                Node newNode = adj.get(s.p).get(i).getKey();

                // Check if it is not visited
                if (visited[newNode.p] == false) {
                    // Mark it visited
                    visited[newNode.p] = true;

                    // Add it to queue
                    queue.add(newNode);
                }
            }
        }
    }


    static int diseaseoutbreak(Node r, ArrayList<ArrayList<Pair1<Node, Integer>>> adj, StringBuilder sb) {
        int c = 0;
        for (int j = 0; j < adj.get(r.p).size(); j++) {
            c = c + adj.get(r.p).get(j).getValue();
            sb.append("\n Patients travelling between " + r.s + " and " + adj.get(r.p).get(j).getKey().s + " are " + adj.get(r.p).get(j).getValue());

        }
        sb.append("\nTotal patients travelling from " + r.s + " are " + c);
        return c;
    }

    int hotspot() {
        int arr[] = new int[5];
        int q = diseaseoutbreak(a, adj, sb);
        int w = diseaseoutbreak(b, adj, sb);
        int o = diseaseoutbreak(c, adj, sb);
        int r = diseaseoutbreak(d, adj, sb);
        int t = diseaseoutbreak(e, adj, sb);

        int max = arr[0]; // Assume first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { // If a larger element is found, update max
                max = arr[i];
            }
        }
        return max; // Return the maximum element

    }


    // Pair class to store the node and the edge weight
    static class Pair1<K, V> {
        private final K key;
        private final V value;

        public Pair1(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }


}


    /*let a,b,c,d be then localitites and 1,2,3,4,5 be their  numbers*/

/*
    class Graph {
        static Node a = new Node("Karvenagar", 1);
        static Node b = new Node("M.N.P", 2);
        static Node c = new Node("Kothrud", 3);
        static Node d = new Node("Aundh", 4);
        static Node e = new Node("PCMC", 5);
        // A utility function to add an edge in an

        // undirected graph
        static class Node {
            String s;
            int p;


            public Node(String s, int p) {
                this.s = s;
                this.p = p;

            }

            public Node() {

            }


        }


        static void addEdge(ArrayList<ArrayList<Pair<Node, Integer>>> adj,
                            Node a, Node b, int weight) {

            adj.get(a.p).add(new Pair<>(b, valueOf(weight)));

            adj.get(b.p).add(new Pair<>(a, valueOf(weight)));

        }

        // A utility function to print the adjacency list
        // representation of graph
        static void
        printGraph(ArrayList<ArrayList<Pair<Node, Integer>>> adj) {
            for (int i = 1; i < adj.size(); i++) {
                System.out.println("\nconnectivity  list of locality number " + i);
                System.out.print("head ");
                for (int j = 0; j < adj.get(i).size(); j++) {
                    System.out.print(" -> " + "---" + adj.get(i).get(j).getValue() + "----"
                            + adj.get(i).get(j).getKey().s);
                }
                System.out.println();
            }
        }

        static void BFS(ArrayList<ArrayList<Pair<Node, Integer>>> adj, int V) {

            boolean visited[] = new boolean[V + 1];

            // Mark all vertices not-visited initially
            for (int i = 0; i <= V; i++)
                visited[i] = false;

            LinkedList<Node> queue = new LinkedList<Node>();

            // The start vertex or source vertex is 1
            Node s = new Node("Karvenagar", 1);


            visited[s.p] = true;
            queue.add(s);
            System.out.println("The disease transmission has been done as follows:");
            while (queue.size() != 0) {

                s = queue.poll();


                System.out.println(" " + s.s);
                System.out.println(" | ");


                for (int i = 0; i < adj.get(s.p).size(); i++) {


                    Node newNode = adj.get(s.p).get(i).getKey();

                    // Check if it is not visited
                    if (visited[newNode.p] == false) {
                        // Mark it visited
                        visited[newNode.p] = true;

                        // Add it to queue
                        queue.add(newNode);
                    }
                }
            }
        }

        static int diseaseoutbreak(Node r, ArrayList<ArrayList<Pair<Node, Integer>>> adj) {
            int c = 0;
            for (int j = 0; j < adj.get(r.p).size(); j++) {
                c = c + adj.get(r.p).get(j).getValue();
                System.out.println(" Patients travelling between " + r.s + " and " + adj.get(r.p).get(j).getKey().s + " are " + adj.get(r.p).get(j).getValue());

            }
            System.out.println("Total patients travelling from " + r.s + " are " + c);
            return c;
        }

        static int comparison(int[] k) {
            int temp = 0;
            for (int i = 0; i < k.length; i++) {
                temp = k[i];
                for (int j = i + 1; j < k.length; j++) {
                    if (k[i] <= k[j]) {
                        temp = k[j];

                    }
                }

            }
            return temp;
        }


        // Driver Code
        public static void main(String[] args) {
            // Creating a graph with 5 vertices
            int V = 6;
            int h;
            ArrayList<ArrayList<Pair<Node, Integer>>> adj
                    = new ArrayList<ArrayList<Pair<Node, Integer>>>(V);

            for (int i = 0; i < V; i++) adj.add(new ArrayList<>());


            // Adding edges one by one
            addEdge(adj, a, b, 5);
            addEdge(adj, a, c, 4);
            addEdge(adj, b, c, 3);
            addEdge(adj, b, d, 5);
            addEdge(adj, c, d, 6);
            addEdge(adj, a, e, 8);
            addEdge(adj, b, e, 8);
            addEdge(adj, c, e, 7);
            addEdge(adj, d, e, 3);
        }
    }
}
*/
