package MedicineAlarm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Message_frame extends JFrame implements ActionListener {

    private JPanel contentPane;
    JButton okbtn;
    public JTextField tf;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Message_frame frame = new Message_frame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Message_frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 434, 262);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(102, 204, 255));
        panel.setBounds(10, 10, 400, 205);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("TIME TO TAKE MEDICINE");
        lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(31, 38, 349, 54);
        panel.add(lblNewLabel);

        okbtn = new JButton("OK");
        okbtn.setBackground(new Color(255, 255, 204));
        okbtn.setVerticalAlignment(SwingConstants.BOTTOM);
        okbtn.setFont(new Font("Yu Gothic", Font.BOLD, 20));
        okbtn.addActionListener(this);
        okbtn.setBounds(150, 146, 112, 49);
        panel.add(okbtn);

        tf = new JTextField();
        tf.setHorizontalAlignment(SwingConstants.CENTER);
        tf.setFont(new Font("Tahoma", Font.PLAIN, 25));
        tf.setBackground(new Color(102, 204, 255));
        tf.setBounds(70, 82, 259, 37);
        tf.setEditable(false);
        panel.add(tf);
        tf.setColumns(10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==okbtn) {
            this.dispose();
        }
    }
}
