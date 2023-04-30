package footprint;


import java.util.*;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Indi {
	double carbonfootprint1 = 0;
 	double carbonfootprint2 = 0;
 	
static double electricity=0;
static double heating_oil=0;
static double coal = 0;
static double lpg = 0;
static double propane = 0;
static double natural_gas = 0;

static double distance_car = 0;
static double milage_car = 0;

static double distance_2 = 0;
static double milage_2 = 0;

static double basic_footprint = 0;
static double from_car = 0;
static double from_2 = 0;

public double footprint_page=0;
JFrame f = new JFrame("First Page");
void accept() {

f.setSize(1200, 800);
f.setLayout(new FlowLayout());

JLabel l1 = new JLabel("INDIVIDUAL FOOTPRINT", JLabel.CENTER);
l1.setOpaque(true);
l1.setBackground(new Color(0, 102, 0));
l1.setForeground(Color.WHITE);
l1.setFont(new Font("Arial", Font.BOLD, 30));
l1.setPreferredSize(new Dimension(1200, 100));

// create a border for the label
Border border = BorderFactory.createMatteBorder(2, 0, 2, 0, Color.GREEN);
l1.setBorder(border);
f.add(l1);


JLabel nameLabel1 = new JLabel("Electricity Bill: ");
nameLabel1.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel1.setPreferredSize(new Dimension(150, 30));
JTextField nameField1 = new JTextField(20);
nameField1.setPreferredSize(new Dimension(200, 30));
JPanel namePanel1 = new JPanel(new FlowLayout());
namePanel1.setPreferredSize(new Dimension(500, 40));
namePanel1.add(nameLabel1);
namePanel1.add(nameField1);
f.add(namePanel1);

JLabel nameLabel2 = new JLabel("Heating Oil: ");
nameLabel2.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel2.setPreferredSize(new Dimension(150, 30));
JTextField nameField2 = new JTextField(20);
nameField2.setPreferredSize(new Dimension(200, 30));
JPanel namePanel2 = new JPanel(new FlowLayout());
namePanel2.setPreferredSize(new Dimension(500, 40));
namePanel2.add(nameLabel2);
namePanel2.add(nameField2);
f.add(namePanel2);

JLabel nameLabel3 = new JLabel("Coal: ");
nameLabel3.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel3.setPreferredSize(new Dimension(150, 30));
JTextField nameField3 = new JTextField(20);
nameField3.setPreferredSize(new Dimension(200, 30));
JPanel namePanel3 = new JPanel(new FlowLayout());
namePanel3.setPreferredSize(new Dimension(500, 40));
namePanel3.add(nameLabel3);
namePanel3.add(nameField3);
f.add(namePanel3);

JLabel nameLabel4 = new JLabel("LPG: ");
nameLabel4.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel4.setPreferredSize(new Dimension(150, 30));
JTextField nameField4 = new JTextField(20);
nameField4.setPreferredSize(new Dimension(200, 30));
JPanel namePanel4 = new JPanel(new FlowLayout());
namePanel4.setPreferredSize(new Dimension(500, 40));
namePanel4.add(nameLabel4);
namePanel4.add(nameField4);
f.add(namePanel4);

JLabel nameLabel5 = new JLabel("Propane: ");
nameLabel5.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel5.setPreferredSize(new Dimension(150, 30));
JTextField nameField5 = new JTextField(20);
nameField5.setPreferredSize(new Dimension(200, 30));
JPanel namePanel5 = new JPanel(new FlowLayout());
namePanel5.setPreferredSize(new Dimension(500, 40));
namePanel5.add(nameLabel5);
namePanel5.add(nameField5);
f.add(namePanel5);

JLabel nameLabel6 = new JLabel("Natural Gas: ");
nameLabel6.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel6.setPreferredSize(new Dimension(150, 30));
JTextField nameField6 = new JTextField(20);
nameField6.setPreferredSize(new Dimension(200, 30));
JPanel namePanel6 = new JPanel(new FlowLayout());
namePanel6.setPreferredSize(new Dimension(500, 40));
namePanel6.add(nameLabel6);
namePanel6.add(nameField6);
f.add(namePanel6);

JLabel nameLabel7 = new JLabel("Distance (Car): ");
nameLabel7.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel7.setPreferredSize(new Dimension(150, 30));
JTextField nameField7 = new JTextField(20);
nameField7.setPreferredSize(new Dimension(200, 30));
JPanel namePanel7 = new JPanel(new FlowLayout());
namePanel7.setPreferredSize(new Dimension(500, 40));
namePanel7.add(nameLabel7);
namePanel7.add(nameField7);
f.add(namePanel7);

JLabel nameLabel8 = new JLabel("Mileage (Car): ");
nameLabel8.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel8.setPreferredSize(new Dimension(150, 30));
JTextField nameField8 = new JTextField(20);
nameField8.setPreferredSize(new Dimension(200, 30));
JPanel namePanel8 = new JPanel(new FlowLayout());
namePanel8.setPreferredSize(new Dimension(500, 40));
namePanel8.add(nameLabel8);
namePanel8.add(nameField8);
f.add(namePanel8);

JLabel nameLabel9 = new JLabel("Distance bike: ");
nameLabel9.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel9.setPreferredSize(new Dimension(150, 30));
JTextField nameField9 = new JTextField(20);
nameField9.setPreferredSize(new Dimension(200, 30));
JPanel namePanel9 = new JPanel(new FlowLayout());
namePanel9.setPreferredSize(new Dimension(500, 40));
namePanel9.add(nameLabel9);
namePanel9.add(nameField9);
f.add(namePanel9);

JLabel nameLabel10 = new JLabel("Mileage bike: ");
nameLabel10.setFont(new Font("Arial", Font.PLAIN, 20));
nameLabel10.setPreferredSize(new Dimension(150, 30));
JTextField nameField10 = new JTextField(20);
nameField10.setPreferredSize(new Dimension(200, 30));
JPanel namePanel10 = new JPanel(new FlowLayout());
namePanel10.setPreferredSize(new Dimension(500, 40));
namePanel10.add(nameLabel10);
namePanel10.add(nameField10);
f.add(namePanel10);


JButton backButton1 = new JButton("Back");
backButton1.setFont(new Font("Arial", Font.PLAIN, 20));
backButton1.setPreferredSize(new Dimension(150, 50));
backButton1.setBackground(new Color(0, 102, 0));
backButton1.setForeground(Color.red);
JPanel backPanel1 = new JPanel(new FlowLayout());
backPanel1.setPreferredSize(new Dimension(600,50));
backPanel1.add(backButton1);
f.add(backPanel1);


JButton submitButton = new JButton("Submit");
submitButton.setFont(new Font("Arial", Font.PLAIN, 20));
submitButton.setPreferredSize(new Dimension(150, 50));
submitButton.setBackground(new Color(0, 102, 0));
submitButton.setForeground(Color.red);
JPanel submitPanel = new JPanel(new FlowLayout());
submitPanel.setPreferredSize(new Dimension(600,50));
submitPanel.add(submitButton);
f.add(submitPanel);

f.setVisible(true);
submitButton.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
    electricity= Integer.valueOf(nameField1.getText());
    heating_oil= Integer.valueOf(nameField2.getText());
    coal = Integer.valueOf(nameField3.getText());
    lpg= Integer.valueOf(nameField4.getText());
    propane= Integer.valueOf(nameField5.getText());
    natural_gas= Integer.valueOf(nameField6.getText());
    distance_car= Integer.valueOf(nameField7.getText());
    milage_car = Integer.valueOf(nameField8.getText());
    distance_2= Integer.valueOf(nameField9.getText());
    milage_2 = Integer.valueOf(nameField10.getText());
    calculate_footprint();
    f.setVisible(false);
    new Main();
    piechart();
   
   
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


static List<Double> lst = new ArrayList<>();

double  calculate_footprint(){

    basic_footprint =  electricity*0.6 + natural_gas*0.05 +heating_oil*2.68 + coal*2.14 + lpg*1.5
            + propane*1.5;
    lst.add( basic_footprint/1000);

    from_car = distance_car*milage_car*2.3;
    lst.add( from_car/1000);

    from_2 = distance_2*milage_2*2.3;
    lst.add( from_2/1000);
    //Collections.sort(lst);
    //System.out.println(lst);
    
    carbonfootprint1 = basic_footprint/1000;
    carbonfootprint2 = (from_car+from_2)/1000;
    
    //return carbonfootprint1 + carbonfootprint2;
   footprint_page = carbonfootprint1 + carbonfootprint2;
   
   return footprint_page;
}
 
 public double toReturn() {
	 return carbonfootprint1 + carbonfootprint2;
 }


 void piechart()
{
	 
 	JFrame f = new JFrame("First Page");
 	f.setLayout(null);

 	JTextArea textArea = new JTextArea("\t Household Footprint is "+carbonfootprint1+"\t\t Outdoor Footprint is "+carbonfootprint2);
		
 			
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
     f.setVisible(true);
     System.out.println(electricity +" " +heating_oil +" "+ coal +" "+ lpg +" "+ propane +" "+ natural_gas);
     double sum = electricity + heating_oil + coal + lpg + propane + natural_gas;
     double sum1 = distance_car + milage_car + distance_2 + milage_2;
     //System.out.println(electricity/sum * 100);
     // Create values and colors for the pie charts
          List<Double> values1 = new ArrayList<>();
     values1.add(electricity/sum * 100);
     values1.add(heating_oil/sum * 100);
     values1.add(coal/sum * 100);
     values1.add(lpg/sum * 100);
     values1.add(propane/sum * 100);
     values1.add(natural_gas/sum * 100);
     System.out.println(values1);

     List<Color> colors1 = new ArrayList<>();
     colors1.add(Color.RED);
     colors1.add(Color.GREEN);
     colors1.add(Color.BLUE);
     colors1.add(new Color(128,0, 128));
     colors1.add(Color.YELLOW);
     colors1.add(new Color(0,128, 128));

     List<Double> values2 = new ArrayList<>();
     values2.add(distance_car/sum1 * 100);
     values2.add(milage_car/sum1 * 100);
     values2.add(distance_2/sum1 * 100);
     values2.add(milage_2/sum1 * 100);
     

     
     List<Color> colors2 = new ArrayList<>();
     colors2.add(Color.YELLOW);
     colors2.add(new Color(128,0, 128));
     colors2.add(Color.CYAN);
     colors2.add(Color.RED);
     

     // Create two new pie charts with the values and colors
     User2 chart1 = new User2(values1, colors1);
     User2 chart2 = new User2(values2, colors2);

     // Create a new JFrame and add the pie charts to it
     //JFrame f = new JFrame("First Page");
     f.setVisible(true);
     f.setSize(1200, 800);
     f.setLayout(new BorderLayout());

     // Create a JPanel to hold the pie charts
     JPanel chartsPanel = new JPanel();
     chartsPanel.setLayout(new GridLayout(1, 2)); // Change to 1 row, 2 columns
     chartsPanel.add(chart1);
     chartsPanel.add(chart2);

     // Add the charts panel to the JFrame
     f.add(chartsPanel, BorderLayout.CENTER);

     // Add a title label to the top of the JFrame
     JLabel l1 = new JLabel("INDIVIDUAL LEVEL CARBON FOOTPRINT", JLabel.CENTER);
     l1.setOpaque(true);
     l1.setBackground(new Color(0, 102, 0));
     l1.setForeground(Color.WHITE);
     l1.setFont(new Font("Arial", Font.BOLD, 30));
     l1.setPreferredSize(new Dimension(1200, 100));
     // create a border for the label
     Border border = BorderFactory.createMatteBorder(2, 0, 2, 0, Color.GREEN);
     l1.setBorder(border);
     f.add(l1, BorderLayout.NORTH);
     
     
     
     ImageIcon imageIcon = new ImageIcon("label1.jpeg");
     JLabel imageLabel = new JLabel();
     imageLabel.setIcon(imageIcon);
     JPanel imagePanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
     imagePanel1.add(imageLabel);

     ImageIcon imageIcon2 = new ImageIcon("label2.jpg");
     JLabel imageLabel2 = new JLabel();
     imageLabel2.setIcon(imageIcon2);
     JPanel imagePanel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
     imagePanel2.add(imageLabel2);

     JPanel imagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
     imagePanel.add(imagePanel1);
     imagePanel.add(imagePanel2);

     JPanel mainPanel = new JPanel(new BorderLayout());
     mainPanel.add(chartsPanel, BorderLayout.CENTER);
     mainPanel.add(imagePanel, BorderLayout.PAGE_END);

     f.add(mainPanel, BorderLayout.CENTER);
     
 //    JButton backButton1 = new JButton("Back");
//	backButton1.setFont(new Font("Arial", Font.PLAIN, 20));
// 	backButton1.setPreferredSize(new Dimension(150, 50));
// 	backButton1.setBackground(new Color(0, 102, 0));
// 	backButton1.setForeground(Color.red);
// 	JPanel backPanel1 = new JPanel(new FlowLayout());
// 	backPanel1.setPreferredSize(new Dimension(600,50));
// 	backPanel1.add(backButton1);
// 	f.setLayout(new BorderLayout());

     // Add the panel to the frame's SOUTH position
//     f.add(backPanel1, BorderLayout.SOUTH);
//     f.setVisible(true);
}
}
 class User2 extends JPanel {

    private List<Double> values;
    private List<Color> colors;

    public User2(List<Double> values, List<Color> colors) {
        this.values = values;
        this.colors = colors;
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
 }


public class User1 {

//public static void main(String[] args) {
//// TODO Auto-generated method stub
//Indi ob2 = new Indi();
//ob2.accept();
//
//}

}
