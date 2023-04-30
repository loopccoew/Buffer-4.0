package footprint;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Maps1 extends JPanel {

    private Map<String, Double> data;

    public Maps1(Map<String, Double> data) {
        this.data = data;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        // Draw x and y axis
        g.setColor(Color.BLACK);
        g.drawLine(50, height - 50, width - 50, height - 50);
        g.drawLine(50, height - 50, 50, 50);

        // Calculate maximum value for scaling
        double maxValue = 0;
        for (double value : data.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        int scale = (int) Math.ceil(maxValue / 10.0) * 10;

        // Draw y axis labels
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        for (int i = 0; i <= scale; i += scale / 10) {
            int label = i;
            int y = height - 50 - (i * (height - 100) / scale);
            g.drawString(String.valueOf(label), 25, y + 5);
            g.drawLine(45, y, 50, y);
        }

        // Draw x axis labels
        int barWidth = (width - 100) / data.size();
        int x = 75;
        for (String state : data.keySet()) {
            g.drawString(state, x, height - 30);
            x += barWidth;
        }

        // Draw bars
        x = 75;
        for (String state : data.keySet()) {
            double value = data.get(state);
            int barHeight = (int) Math.round((value * 1.0 / scale) * (height - 100));
            g.setColor(new Color(70, 130, 180));
            g.fillRect(x, height - 50 - barHeight, barWidth, barHeight);
            g.setColor(Color.BLACK);
            g.drawRect(x, height - 50 - barHeight, barWidth, barHeight);
            x += barWidth;
        }

    }

    static void window() {
// Create data for the bar graph
        JFrame f = new JFrame("First Page");
        f.setSize(1200, 800);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("REGIONWISE CARBON FOOTPRINT", JLabel.CENTER);
        l1.setOpaque(true);
        l1.setBackground(new Color(0, 102, 0));
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setPreferredSize(new Dimension(1200, 100));

// create a border for the label
        Border border = BorderFactory.createMatteBorder(2, 0, 2, 0, Color.GREEN);
        l1.setBorder(border);
        f.add(l1);

// Add the title label to the chart panel
//chartPanel.add(titleLabel, BorderLayout.NORTH);

// Create a new StateWisePollutionDistribution object with the data
        Map<String, Double> data = new HashMap<>();
        data.put("1", 3.188);
        data.put("2", 1.439);
        data.put("3", 5.342);
        data.put("4", 4.662);
        data.put("5", 5.749);
        data.put("6", 2.811);
        data.put("7", 3.068);
        data.put("8", 2.197);
        data.put("9", 4.7148);
        data.put("10", 8.222);
        data.put("11", 0.635);
        data.put("12", 1.171);
        data.put("13", 8.970);
        data.put("14", 1.684);
        data.put("15", 2.914);
        data.put("16", 2.0416);
        data.put("17", 3.799);
        data.put("18", 1.3773);
        data.put("19 ", 1.299);
        data.put("20", 0.970);
        Maps1 chart = new Maps1(data);

//f.add(chartPanel);

// Create a JPanel to hold the chart
        JPanel chartPanel = new JPanel(new BorderLayout());

// Add the chart to the chart panel
        chartPanel.add(chart, BorderLayout.CENTER);

// Load the image and create a label for it
        ImageIcon img1 = new ImageIcon("m1.png");
        JLabel imageLabel = new JLabel(img1);

// Create a JPanel to hold both the chart panel and the image label
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.add(chartPanel);
        mainPanel.add(imageLabel);


        f.getContentPane().add(mainPanel);
        imageLabel.setBounds(800, 100, 400, 400);
       
        f.setVisible(true);


    }



    public static void main(String[] args) {
        window();


    }
}
