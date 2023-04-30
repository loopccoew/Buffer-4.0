package footprint;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class solution extends JFrame implements ActionListener {
    JFrame f;
    public solution() {
        f = new JFrame("First Page");
        f.setVisible(true);
        f.setSize(1200, 800);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("REDUCE YOUR CARBON FOOTPRINT", JLabel.CENTER);
        l1.setOpaque(true);
        l1.setBackground(new Color(0, 150, 0));
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setPreferredSize(new Dimension(1200, 100));

        Border border = BorderFactory.createMatteBorder(2, 2, 5, 2, Color.GREEN);
        l1.setBorder(border);
        f.add(l1);
        String s="";
        if(Main.which_button.equals("Individual")){
            s = Tree.create("INDIVIDUAL FOOTPRINT",Indi.basic_footprint);
        }
        else if(Main.which_button.equals("Industrial")){
            s = Tree.create("INDUSTRIAL FOOTPRINT",individual.footprint);
        }
//        Individual obj1 = new Individual();
        else {
            s = Tree.region;
        }

        JLabel label = new JLabel(s);
        f.getContentPane().add(label);
        f.pack();
        f.setVisible(true);

        JTextArea textArea = new JTextArea(s);
        f.add(textArea);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        f.setVisible(true);
    }
}
public class Reduce {
    public static void main(String[] args) {
        new solution();
        // obj.method();

    }
}
