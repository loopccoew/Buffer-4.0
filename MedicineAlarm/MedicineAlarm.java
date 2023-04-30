package MedicineAlarm;

import java.awt.*;
import java.io.File;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.text.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;




class SoundPlayer {

    public  void play() throws Exception {

        // specify the sound file path
        File soundFile = new File("C:\\Users\\DAKSHA\\Downloads\\file.wav");

        // create a new AudioInputStream
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

        // get a Clip object to play the sound file
        Clip clip = AudioSystem.getClip();

        // open the AudioInputStream to the clip
        clip.open(audioIn);

        // start playing the sound file
        clip.start();

        // wait for the sound to finish playing
        while (!clip.isRunning())
            Thread.sleep(2);
        while (clip.isRunning())
            Thread.sleep(2);

        // clean up the clip when finished
        clip.close();
    }
}

public class MedicineAlarm extends JFrame implements ActionListener{

    private JPanel contentPane;
    JFrame f;
    JLabel timlab;
    JButton set;
    JComboBox hh,mm;
    JButton addbtn;
    private JLabel lblNewLabel_3;
    ArrayList<String> addtime = new ArrayList<>();
    ArrayList<String> Med = new ArrayList<>();
    private JTextField medf;
    public String gett;


    public void GUI(){
        addtime.add("12.30");
        Med.add("pentaprazole");
        addtime.add("22.09");
        Med.add("pentaprazole");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(450, 100, 450, 610);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 51));
        setResizable(false);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);



        JPanel panel = new JPanel();
        panel.setBackground(new Color(153, 204, 255));
        panel.setBounds(10, 10, 416, 553);
        contentPane.add(panel);
        panel.setLayout(null);

//        JLabel lblNewLabel = new JLabel("");
//        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        lblNewLabel.setIcon(new ImageIcon(MedicineAlarm.class.getResource("/icons/icons8-alarm-clock-100.png")));
//        lblNewLabel.setBounds(159, 10, 108, 97);
//        panel.add(lblNewLabel);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("MedicineAlarm/icons_med/alarm_med.png"));
        Image i11 = i10.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel alarm_med = new JLabel(i12);
        alarm_med.setBounds(159, 10, 108, 97);
        panel.add(alarm_med);

        JLabel lblNewLabel_1 = new JLabel("HOUR");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(108, 150, 76, 27);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("MINUTE");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(223, 150, 76, 27);
        panel.add(lblNewLabel_1_1);

        JList list = new JList();
        list.setBounds(56, 240, 1, 1);
        panel.add(list);

        hh = new JComboBox();
        hh.setBackground(new Color(255, 255, 255));
        hh.setFont(new Font("Stencil", Font.PLAIN, 30));
        hh.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        hh.setBounds(118, 187, 71, 66);
        panel.add(hh);

        mm = new JComboBox();
        mm.setBackground(new Color(255, 255, 255));
        mm.setFont(new Font("Stencil", Font.PLAIN, 30));
        mm.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02 ", "03 ", "04 ", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
        mm.setMaximumRowCount(10);
        mm.setBounds(233, 187, 71, 66);
        panel.add(mm);

        set = new JButton("Set Alarm");
        set.setBackground(new Color(204, 255, 204));
        set.setFont(new Font("Times New Roman", Font.BOLD, 25));
        set.setBounds(230, 408, 165, 61);
        set.addActionListener(this);
        panel.add(set);

        timlab = new JLabel("");
        timlab.setFont(new Font("Tahoma", Font.PLAIN, 20));
        timlab.setHorizontalAlignment(SwingConstants.CENTER);
        timlab.setBounds(72, 133, 251, 44);
        panel.add(timlab);

        addbtn = new JButton("Add Alarm");
        addbtn.setBackground(new Color(204, 255, 204));
        addbtn.setFont(new Font("Times New Roman", Font.BOLD, 25));
        addbtn.addActionListener(this);
        addbtn.setBounds(26, 408, 179, 61);
        panel.add(addbtn);

        lblNewLabel_3 = new JLabel("MEDICINE :");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel_3.setBounds(56, 283, 179, 27);
        panel.add(lblNewLabel_3);

        medf = new JTextField();
        medf.setFont(new Font("Verdana", Font.BOLD, 25));
        medf.setBackground(new Color(153, 204, 255));
        medf.setBounds(55, 320, 313, 50);
        panel.add(medf);
        medf.setColumns(10);
    }
    public void snip() {
        SoundPlayer sp =new SoundPlayer();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        if(addtime.contains(dtf.format(now))) {
            int ind=addtime.indexOf(dtf.format(now));
            String mednow= Med.get(ind);
            try {
                sp.play();
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            Message_frame mf=new Message_frame();
            mf.tf.setText(mednow);
            mf.setVisible(true);
        }
    }



    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MedicineAlarm frame = new MedicineAlarm();
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

    public MedicineAlarm() {
        GUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==set) {
            SoundPlayer sp =new SoundPlayer();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
            LocalDateTime now = LocalDateTime.now();
            String selectedHH = (String)hh.getSelectedItem();
            String selectedMM = (String)mm.getSelectedItem();
            // concatenate the selected values to get the selected time
            String selectedTime = selectedHH + ":" + selectedMM;
            System.out.println("Selected Time: " + selectedTime);
            System.out.println("Current Time: " + dtf.format(now));

            do {
                now = LocalDateTime.now(); // update the current time
            }while(!dtf.format(now).equals(selectedTime));
            //medf.setText("Quick Timer mode");
            gett=medf.getText();
            if(dtf.format(now).equals(selectedTime)) {
                try {
                    sp.play();
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                Message_frame mf= new Message_frame();
                mf.setVisible(true);
                mf.tf.setText(gett);

            }

        }
        else if(e.getSource()==addbtn){
            String selectedHH = (String)hh.getSelectedItem();
            String selectedMM = (String)mm.getSelectedItem();
            // concatenate the selected values to get the selected time
            String selectedTime = selectedHH + ":" + selectedMM;
            String medtext = medf.getText();
            addtime.add(selectedTime);
            Med.add(medtext);
        }



    }

}
