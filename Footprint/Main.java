package footprint;

import java.util.*;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JFrame f;
    public static String which_button = "";


    public Main() {

        f = new JFrame("First Page");
        //f.setVisible(true);
        f.setSize(1200, 800);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("WELCOME TO CARBON FOOTPRINT", JLabel.CENTER);
        l1.setOpaque(true);
        l1.setBackground(new Color(0, 102, 0));
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setPreferredSize(new Dimension(1200, 100));

        // create a border for the label
        Border border = BorderFactory.createMatteBorder(2, 0, 2, 0, Color.GREEN);
        l1.setBorder(border);
        f.add(l1);


        JTextArea textArea = new JTextArea(" Carbon footprint is a measure of the amount of greenhouse gases, primarily carbon dioxide, released into the atmosphere as a result of human activities, such as driving a car, using electricity, and producing goods and services.\n\n"
                + " The importance of carbon footprint is multifaceted and includes the following:\n"
                + "  - Raising awareness about environmental issues\n"
                + "  - Encouraging individuals and organizations to reduce their greenhouse gas emissions\n"
                + "  - Helping governments to develop and implement policies to address climate change\n");


        // set the size of the text area
        textArea.setPreferredSize(new Dimension(1200, 200));
        textArea.setFont(new Font("Arial", Font.BOLD, 15));

        // set the line wrap and word wrap properties of the text area
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // make the text area read-only
        textArea.setEditable(false);

        // add the text area to the frame
        f.add(textArea);




        JTextArea textArea2 = new JTextArea("Climate Change Mitigation: "
                + "The release of greenhouse gases, particularly carbon dioxide, "
                + "is a major driver of climate change. "
                + "Carbon footprint is a key metric that helps individuals and organizations to "
                + "understand their contribution to climate change and take action to reduce their emissions. "
                + "By measuring and reducing our carbon footprint, we can help mitigate "
                + "the effects of climate change.");
        textArea2.setPreferredSize(new Dimension(250, 200));
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);
        textArea2.setEditable(false);

        // set the font and justification
        Font font = new Font("Helvetica", Font.PLAIN, 12);
        textArea2.setFont(font);
        textArea2.setMargin(new Insets(10,10,10,10)); // Add some margin for readability
        textArea2.setOpaque(false); // Make the background transparent
        textArea2.setForeground(Color.BLACK);
        f.add(textArea2);


        JTextArea textArea3 = new JTextArea("Environmental Stewardship: "
                + "The earth's resources are finite, and we must be good stewards of them. "
                + "By reducing our carbon footprint, we can reduce our impact on the "
                + "environment and help preserve the planet for future generations.");
        textArea3.setPreferredSize(new Dimension(250, 200));
        textArea3.setLineWrap(true);
        textArea3.setWrapStyleWord(true);
        textArea3.setEditable(false);

        // set the font and justification
        Font font3 = new Font("Helvetica", Font.PLAIN, 12);
        textArea3.setFont(font);
        textArea3.setMargin(new Insets(10,10,10,10)); // Add some margin for readability
        textArea3.setOpaque(false); // Make the background transparent
        textArea3.setForeground(Color.BLACK);
        f.add(textArea3);

        JTextArea textArea4 = new JTextArea("Economic Benefits: "
                + "Reducing our carbon footprint can have significant economic benefits, "
                + "such as lowering energy costs, increasing efficiency, and creating new jobs "
                + "in the clean energy sector. By transitioning to a low-carbon economy, "
                + "we can also reduce our dependence on fossil fuels and increase our energy security.");
        textArea4.setPreferredSize(new Dimension(250, 200));
        textArea4.setLineWrap(true);
        textArea4.setWrapStyleWord(true);
        textArea4.setEditable(false);

        // set the font and justification
        Font font4 = new Font("Helvetica", Font.PLAIN, 12);
        textArea4.setFont(font);
        textArea4.setMargin(new Insets(10,10,10,10)); // Add some margin for readability
        textArea4.setOpaque(false); // Make the background transparent
        textArea4.setForeground(Color.BLACK); // Set the text color
        f.add(textArea4);


        JTextArea textArea5 = new JTextArea("Social Responsibility:"
                + "As individuals and organizations, we have a responsibility "
                + "to contribute to the greater good. By reducing our carbon footprint, "
                + "we can help create a more sustainable and equitable future for all.");

        textArea5.setPreferredSize(new Dimension(250, 200));
        textArea5.setLineWrap(true);
        textArea5.setWrapStyleWord(true);
        textArea5.setEditable(false);

        // set the font and justification
        Font font5 = new Font("Helvetica", Font.PLAIN, 12);
        textArea5.setFont(font);
        textArea5.setMargin(new Insets(10,10,10,10)); // Add some margin for readability
        textArea5.setOpaque(false); // Make the background transparent
        textArea5.setForeground(Color.BLACK);
        f.add(textArea5);



        ImageIcon img1 = new ImageIcon("C:\\Users\\swami\\OneDrive\\Documents\\HTML\\buffer\\buffer\\src\\buffer\\individual_carbon.jpeg");
        JLabel imageLabel = new JLabel(img1);
        imageLabel.setBounds(0,0, 200, 200); // Set the position and size
        f.add(imageLabel);

        ImageIcon img2 = new ImageIcon("C:\\Users\\swami\\OneDrive\\Documents\\HTML\\buffer\\buffer\\src\\buffer\\industry.jpg");
        Image image = img1.getImage();
        int width = image.getWidth(null);
        int height = image.getHeight(null);


        Image scaledImage = img2.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        img2.setImage(scaledImage);
        JLabel imageLabel2 = new JLabel(img2);
        imageLabel2.setBounds(0, 0, width, height);
        f.add(imageLabel2);


        ImageIcon img3 = new ImageIcon("C:\\Users\\swami\\OneDrive\\Documents\\HTML\\buffer\\buffer\\src\\buffer\\reduce1.jpg");
        JLabel imageLabel3 = new JLabel(img3);
        Image scaledImage3 = img3.getImage().getScaledInstance(img1.getIconWidth(), img1.getIconHeight(), Image.SCALE_DEFAULT);
        img3.setImage(scaledImage3);
        imageLabel3.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        f.add(imageLabel3);



        ImageIcon img4 = new ImageIcon("C:\\Users\\swami\\OneDrive\\Documents\\HTML\\buffer\\buffer\\src\\buffer\\region.jpg");
        JLabel imageLabel4 = new JLabel(img4);
        Image scaledImage4 = img4.getImage().getScaledInstance(img1.getIconWidth(), img1.getIconHeight(), Image.SCALE_DEFAULT);
        img4.setImage(scaledImage4);
        imageLabel4.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        f.add(imageLabel4);



        // Create a button
        button1 = new JButton("INDIVIDUAL FOOTPRINT");
        button1.setBackground(new Color(0, 102, 0));
        button1.setForeground(Color.WHITE);
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        int buttonX = imageLabel.getX();
        int buttonY = imageLabel.getY() + imageLabel.getHeight();
        button1.setBounds(buttonX, buttonY, imageLabel.getWidth(), 30); // Set the position and size of the button
        f.add(button1);
        button1.addActionListener(this);


        button2 = new JButton("INDUSTRIAL FOOTPRINT");
        button2.setBackground(new Color(0, 102, 0));
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        button2.setBounds(100, 600, 200, 30);
        f.add(button2);
        button2.addActionListener(this);

        button3 = new JButton("REDUCTION METHODS");
        button3.setBackground(new Color(0, 102, 0));
        button3.setForeground(Color.WHITE);
        button3.setFont(new Font("Arial", Font.BOLD, 12));
        button3.setBounds(1000, 600, 200, 30);
        f.add(button3);
        button3.addActionListener(this);

        button4 = new JButton("REGIONWISE DISTRIBUTION");
        button4.setBackground(new Color(0, 102, 0));
        button4.setForeground(Color.WHITE);
        button4.setFont(new Font("Arial", Font.BOLD, 12));
        button4.setBounds(1500, 600, 200, 30);
        f.add(button4);
        button4.addActionListener(this);
        f.setVisible(true);


    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        {
            new Indi().accept();
            which_button = "Individual";
            //new Main();
            this.f.setVisible(false);
        }
        if(e.getSource()==button2)
        {
            individual ob2 = new individual();
            ob2.accept();
            which_button = "Industry";
            //new Main();
            this.f.setVisible(false);
        }
        if(e.getSource()==button3)
        {
            new solution();
            this.f.setVisible(false);
        }

        if(e.getSource()==button4)
        {
            Maps1.window();
            this.f.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Main ob2 = new Main();
        //ob2.first_page();



    }

}
