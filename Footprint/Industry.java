package footprint;

import java.util.*;

import java.util.concurrent.TimeUnit;

import java.awt.EventQueue;

import java.awt.FlowLayout;



import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextArea;

import javax.swing.border.Border;

import javax.swing.border.EmptyBorder;



import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Dimension;



import javax.swing.JLabel;

import java.awt.Font;

import java.awt.Graphics;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.SwingConstants;

import javax.swing.JTextField;

import javax.swing.BorderFactory;

import javax.swing.ImageIcon;

import javax.swing.JButton;







class individual {

    static double co2;

    static double co;

    static double ch;

    static double hc;

    static double nox;

    static double pm;

    static double so2;

    static double footprint;

    void accept() {

        JFrame f = new JFrame("First Page");

        f.setSize(1200, 800);

        f.setLayout(new FlowLayout());

//Color color=new Color(153, 153 ,153);

//f.getContentPane().setBackground(color);

        JLabel l1 = new JLabel("INDUSTRIAL FOOTPRINT", JLabel.CENTER);

        l1.setOpaque(true);

        l1.setBackground(new Color(0, 102, 0));

        l1.setForeground(Color.WHITE);

        l1.setFont(new Font("Arial", Font.BOLD, 30));

        l1.setPreferredSize(new Dimension(1200, 100));

        Border blackline = BorderFactory.createLineBorder(Color.green);

        l1.setBorder(blackline);

        Color c1 = new Color(0, 160,0);

// create a border for the label

        Border border = BorderFactory.createMatteBorder(2, 0, 2, 0,Color.GREEN);

        l1.setBorder(border);

        f.add(l1);


        JLabel nameLabel0 = new JLabel("YOUR CITY ");

        nameLabel0.setFont(new Font("Arial", Font.PLAIN, 20));

        nameLabel0.setPreferredSize(new Dimension(150, 30));

        JTextField nameField0 = new JTextField(20);

        nameField0.setPreferredSize(new Dimension(200, 30));

        JPanel namePanel0 = new JPanel(new FlowLayout());

//namePanel1.setBackground(color);

        namePanel0.setPreferredSize(new Dimension(500, 40));

        namePanel0.add(nameLabel0);

        namePanel0.add(nameField0);

        f.add(namePanel0);


        JLabel nameLabel1 = new JLabel("CO2 EMMITED ");

        nameLabel1.setFont(new Font("Arial", Font.PLAIN, 20));

        nameLabel1.setPreferredSize(new Dimension(150, 30));

        JTextField nameField1 = new JTextField(20);

        nameField1.setPreferredSize(new Dimension(200, 30));

        JPanel namePanel1 = new JPanel(new FlowLayout());

//namePanel1.setBackground(color);

        namePanel1.setPreferredSize(new Dimension(500, 40));

        namePanel1.add(nameLabel1);

        namePanel1.add(nameField1);

        f.add(namePanel1);





        JLabel nameLabel2 = new JLabel("CO EMMITED");

        nameLabel2.setFont(new Font("Arial", Font.PLAIN, 20));

        nameLabel2.setPreferredSize(new Dimension(150, 30));

        JTextField nameField2 = new JTextField(20);

        nameField2.setPreferredSize(new Dimension(200, 30));

        JPanel namePanel2 = new JPanel(new FlowLayout());

        namePanel2.setPreferredSize(new Dimension(500, 40));

//namePanel2.setBackground(color);

        namePanel2.add(nameLabel2);

        namePanel2.add(nameField2);

        f.add(namePanel2);



        JLabel nameLabel3 = new JLabel("CH EMMITED");

        nameLabel3.setFont(new Font("Arial", Font.PLAIN, 20));

        nameLabel3.setPreferredSize(new Dimension(150, 30));

        JTextField nameField3 = new JTextField(20);

        nameField3.setPreferredSize(new Dimension(200, 30));

        JPanel namePanel3 = new JPanel(new FlowLayout());

        namePanel3.setPreferredSize(new Dimension(500, 40));

//namePanel3.setBackground(color);

        namePanel3.add(nameLabel3);

        namePanel3.add(nameField3);

        f.add(namePanel3);



        JLabel nameLabel4 = new JLabel("HC EMMITED");

        nameLabel4.setFont(new Font("Arial", Font.PLAIN, 20));

        nameLabel4.setPreferredSize(new Dimension(150, 30));

        JTextField nameField4 = new JTextField(20);

        nameField4.setPreferredSize(new Dimension(200, 30));

        JPanel namePanel4 = new JPanel(new FlowLayout());

        namePanel4.setPreferredSize(new Dimension(500, 40));

//namePanel4.setBackground(color);

        namePanel4.add(nameLabel4);

        namePanel4.add(nameField4);

        f.add(namePanel4);



        JLabel nameLabel5 = new JLabel("NOX EMMITED");

        nameLabel5.setFont(new Font("Arial", Font.PLAIN, 20));

        nameLabel5.setPreferredSize(new Dimension(150, 30));

        JTextField nameField5 = new JTextField(20);

        nameField5.setPreferredSize(new Dimension(200, 30));

        JPanel namePanel5 = new JPanel(new FlowLayout());

        namePanel5.setPreferredSize(new Dimension(500, 40));

//namePanel5.setBackground(color);

        namePanel5.add(nameLabel5);

        namePanel5.add(nameField5);

        f.add(namePanel5);



        JLabel nameLabel6 = new JLabel("SO2 EMMITED");

        nameLabel6.setFont(new Font("Arial", Font.PLAIN, 20));

        nameLabel6.setPreferredSize(new Dimension(150, 30));

        JTextField nameField6 = new JTextField(20);

        nameField6.setPreferredSize(new Dimension(200, 30));

        JPanel namePanel6 = new JPanel(new FlowLayout());

        namePanel6.setPreferredSize(new Dimension(500, 40));

//namePanel6.setBackground(color);

        namePanel6.add(nameLabel6);

        namePanel6.add(nameField6);

        f.add(namePanel6);



        JLabel nameLabel7 = new JLabel("PM EMMITED");

        nameLabel7.setFont(new Font("Arial", Font.PLAIN, 20));

        nameLabel7.setPreferredSize(new Dimension(150, 30));

        JTextField nameField7 = new JTextField(20);

        nameField7.setPreferredSize(new Dimension(200, 30));

        JPanel namePanel7 = new JPanel(new FlowLayout());

        namePanel7.setPreferredSize(new Dimension(500, 40));

//namePanel7.setBackground(color);

        namePanel7.add(nameLabel7);

        namePanel7.add(nameField7);



        f.add(namePanel7);

        JButton backButton1 = new JButton("Back");

        backButton1.setFont(new Font("Arial", Font.PLAIN, 20));

        backButton1.setPreferredSize(new Dimension(150, 50));

        backButton1.setBackground(new Color(0, 102, 0));

        backButton1.setForeground(Color.WHITE);

        JPanel backPanel1 = new JPanel(new FlowLayout());

        backPanel1.setPreferredSize(new Dimension(800,50));

//backPanel1.setBackground(color);

        backPanel1.add(backButton1);

        f.add(backPanel1);





        JButton submitButton = new JButton("Submit");

        submitButton.setFont(new Font("Arial", Font.PLAIN, 20));

        submitButton.setPreferredSize(new Dimension(150, 50));

        submitButton.setBackground(new Color(0, 102, 0));

        submitButton.setForeground(Color.WHITE);

        JPanel submitPanel = new JPanel(new FlowLayout());

        submitPanel.setPreferredSize(new Dimension(800,50));

//submitPanel.setBackground(color);

        submitPanel.add(submitButton);

        f.add(submitPanel);



        f.setVisible(true);



        submitButton.addActionListener(new ActionListener() {



            @Override

            public void actionPerformed(ActionEvent e) {

                co2= Integer.valueOf(nameField1.getText());

                co= Integer.valueOf(nameField2.getText());

                ch = Integer.valueOf(nameField3.getText());

                hc= Integer.valueOf(nameField4.getText());

                nox= Integer.valueOf(nameField5.getText());

                so2= Integer.valueOf(nameField6.getText());

                pm= Integer.valueOf(nameField7.getText());



                calculate_footprint2();

                f.setVisible(false);

                new Main();

                window();



            }

        });

        backButton1.addActionListener(new ActionListener() {



            @Override

            public void actionPerformed(ActionEvent e) {



                f.setVisible(false);

                new Main();





            }

        });



    }

    void  calculate_footprint2()

    {

        footprint= (ch+ co+ co2+ hc+ nox+ pm+ so2)*8.91*28 /1000;

        ch=(ch/(ch+ co+ co2+ hc+ nox+ pm+ so2))*100;

    }

    static void window() {





        double carbonfootprint3 = footprint;

        JFrame f = new JFrame("First Page");

        f.setLayout(null);



        JTextArea textArea = new JTextArea("\t\t\t    Your Industrial Footprint is "+carbonfootprint3);









        textArea.setPreferredSize(new Dimension(800, 50));

        textArea.setFont(new Font("Arial", Font.BOLD, 20));



        // set the line wrap and word wrap properties of the text area

        textArea.setLineWrap(true);

        textArea.setWrapStyleWord(true);



        // make the text area read-only

        textArea.setEditable(false);



        // Set the position and size of the JTextArea using absolute positioning

        textArea.setBounds(0, 100, 1200, 70);



        // add the text area to the frame

        f.add(textArea);



        // set the size of the text area

        f.setSize(1200, 800);



        // make the frame visible

        f.pack();

        //  f.setVisible(true);







        // Create values and colors for the pie charts

        List<Double> values1 = new ArrayList<>();

        values1.add((ch/(ch+ co+ co2+ hc+ nox+ pm+ so2))*100);

        values1.add((co/(ch+ co+ co2+ hc+ nox+ pm+ so2))*100);

        values1.add((co2/(ch+ co+ co2+ hc+ nox+ pm+ so2))*100);

        values1.add((hc/(ch+ co+ co2+ hc+ nox+ pm+ so2))*100);

        values1.add((nox/(ch+ co+ co2+ hc+ nox+ pm+ so2))*100);

        values1.add((pm/(ch+ co+ co2+ hc+ nox+ pm+ so2))*100);

        values1.add((so2/(ch+ co+ co2+ hc+ nox+ pm+ so2))*100);



        List<Color> colors1 = new ArrayList<>();

        colors1.add(Color.RED);

        colors1.add(Color.GREEN);

        colors1.add(Color.BLUE);

        colors1.add(new Color(128,0, 128));

        colors1.add(Color.YELLOW);

        colors1.add(new Color(0,128, 128));

        colors1.add(new Color(255, 165, 0));



        List<String> labels1 = new ArrayList<>();

        labels1.add("Label 1");

        labels1.add("Label 2");

        labels1.add("Label 3");

        labels1.add("Label 4");

        labels1.add("Label 5");

        labels1.add("Label 6");







        // Create two new pie charts with the values and colors

        PieChart2 chart1 = new PieChart2(values1, colors1,labels1);

        //PieChart chart2 = new PieChart(values2, colors2, labels2);



        // Create a new JFrame and add the pie charts to it

        //JFrame f = new JFrame("First Page");

        f.setVisible(true);

        f.setSize(1200, 800);

        f.setLayout(new BorderLayout());



        // Create a JPanel to hold the pie charts

        JPanel chartsPanel = new JPanel();

        chartsPanel.setLayout(new GridLayout(1, 2)); // Change to 1 row, 2 columns

        chartsPanel.add(chart1);

        //chartsPanel.add(chart2);



        // Add the charts panel to the JFrame

        f.add(chartsPanel, BorderLayout.CENTER);



        // Add a title label to the top of the JFrame

        JLabel l1 = new JLabel("INDUSTRIAL LEVEL CARBON FOOTPRINT", JLabel.CENTER);

        l1.setOpaque(true);

        l1.setBackground(new Color(0, 102, 0));

        l1.setForeground(Color.WHITE);

        l1.setFont(new Font("Arial", Font.BOLD, 30));

        l1.setPreferredSize(new Dimension(1200, 100));

        // create a border for the label

        Border border = BorderFactory.createMatteBorder(2, 0, 2, 0, Color.GREEN);

        l1.setBorder(border);

        f.add(l1, BorderLayout.NORTH);







        ImageIcon imageIcon = new ImageIcon("C:\\Users\\swami\\OneDrive\\Desktop\\buffer\\label3.jpg");

        JLabel imageLabel = new JLabel();

        imageLabel.setIcon(imageIcon);

        JPanel imagePanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        imagePanel1.add(imageLabel);





        JPanel imagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));

        imagePanel.add(imagePanel1);

        //imagePanel.add(imagePanel2);



        JPanel mainPanel = new JPanel(new BorderLayout());

        mainPanel.add(chartsPanel, BorderLayout.CENTER);

        mainPanel.add(imagePanel, BorderLayout.PAGE_END);



        f.add(mainPanel, BorderLayout.CENTER);



//    JButton backButton2 = new JButton("Back");

//    backButton2.setFont(new Font("Arial", Font.PLAIN, 20));

//    backButton2.setPreferredSize(new Dimension(150, 50));

//    backButton2.setBackground(new Color(0, 102, 0));

//    backButton2.setForeground(Color.red);

// //   backButton2.setBounds(, 10, 150, 50);

//    JPanel backPanel2 = new JPanel(new FlowLayout());

//    backPanel2.setPreferredSize(new Dimension(1000,50));

//   // backPanel2.setBackground(color);

//    backPanel2.add(backButton2);

//    f.add(backButton2);

        f.setVisible(true);

    }

}



class PieChart2 extends JPanel {



    private List<Double> values;

    private List<Color> colors;

    private List<String> labels;



    public PieChart2(List<Double> values, List<Color> colors, List<String> labels) {

        this.values = values;

        this.colors = colors;

        this.labels = labels;

    }



    @Override

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);



        double total = 0;

        for (double value : values) {

            total += value;

        }



        double currentAngle = 0;

        int x = getWidth() / 2;

        int y = getHeight() / 2;

        int diameter = Math.min(getWidth(), getHeight()) - 200;



        for (int i = 0; i < values.size(); i++) {

            double value = values.get(i);

            double angle = 360 * value / total;

            g.setColor(colors.get(i));

            g.fillArc(x - diameter / 2, y - diameter / 2, diameter, diameter, (int) currentAngle, (int) angle);



            // Add label to center of pie slice

            g.setColor(Color.BLACK);

            Font font5 = new Font("Helvetica", Font.PLAIN, 20);

            g.setFont(font5);

            double labelAngle = currentAngle + angle / 2;

            int labelX = (int) (x + (diameter / 2 * Math.cos(Math.toRadians(labelAngle))));

            int labelY = (int) (y + (diameter / 2 * Math.sin(Math.toRadians(labelAngle))));

            String label = String.format("%.1f%%", value);

            g.drawString(label, labelX, labelY);

            currentAngle += angle;

        }

    }



    public JPanel createLabelsPanel() {

        JPanel labelsPanel = new JPanel(new GridLayout(values.size(), 2));

        for (int i = 0; i < values.size(); i++) {

            JLabel colorLabel = new JLabel(" ");

            colorLabel.setOpaque(true);

            colorLabel.setBackground(colors.get(i));

            labelsPanel.add(colorLabel);

            JTextField valueTextField = new JTextField(String.format("%.1f%%", values.get(i)));

            valueTextField.setEditable(false);

            labelsPanel.add(valueTextField);

            JLabel labelLabel = new JLabel(labels.get(i));

            labelsPanel.add(labelLabel);

            JTextField labelTextField = new JTextField(labels.get(i));

            labelTextField.setEditable(false);

            labelsPanel.add(labelTextField);

        }

        return labelsPanel;

    }

}

public class Industry {



    public static void main(String[] args) {

// TODO Auto-generated method stub

        individual ob2 = new individual();

        ob2.accept();

    }

}