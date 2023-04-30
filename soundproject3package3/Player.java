package soundproject3package3;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;

import mygenericdoublylinkedlistpackage.MyDoublyLinkedList;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import javax.swing.JButton;
public class Player extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JTextField textField;
    JButton prev,play,pause,next;
    MusicPlayer mp = null;
    MyDoublyLinkedList<SongPath>.Node curr;
    private JTextField txtCarvaan;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Player frame = new Player();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /**
     * Create the frame.
     * @throws LineUnavailableException
     * @throws IOException
     * @throws UnsupportedAudioFileException
     */
    public Player() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        mp = new MusicPlayer();
        curr=mp.l.getHead();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 632, 573);
        setResizable(false);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 204));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(new Color(255, 255, 204));
        lblNewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("soundproject3package3/images_music/radio.png")));
        lblNewLabel.setBounds(172, 11, 275, 206);
        contentPane.add(lblNewLabel);

        textField = new JTextField("");
        textField.setBackground(new Color(255, 255, 204));
        textField.setFont(new Font("Sitka Text", Font.BOLD, 30));
        textField.setBounds(57, 298, 390, 53);
        textField.setEditable(false);

        contentPane.add(textField);
        textField.setColumns(10);

        prev = new JButton("");
        prev.setIcon(new ImageIcon(ClassLoader.getSystemResource("soundproject3package3/images_music/prev.png")));
        prev.setBackground(new Color(255, 255, 204));
        prev.setBounds(46, 373, 87, 82);
        prev.addActionListener(this);
        contentPane.add(prev);


        play = new JButton("");
        play.setIcon(new ImageIcon(ClassLoader.getSystemResource("soundproject3package3/images_music/play.png")));
        play.setBackground(new Color(255, 255, 204));
        play.setBounds(217, 373, 80, 82);
        contentPane.add(play);
        play.addActionListener(this);

        pause = new JButton("");
        pause.setIcon(new ImageIcon(ClassLoader.getSystemResource("soundproject3package3/images_music/pause.png")));
        pause.setBackground(new Color(255, 255, 204));
        pause.setBounds(336, 373, 87, 82);
        pause.addActionListener(this);
        contentPane.add(pause);

        next = new JButton("");
        next.setIcon(new ImageIcon(ClassLoader.getSystemResource("soundproject3package3/images_music/next.png")));
        next.setBackground(new Color(255, 255, 204));
        next.setBounds(484, 373, 87, 82);
        next.addActionListener(this);
        contentPane.add(next);

        txtCarvaan = new JTextField("C A R V A A N");
        txtCarvaan.setForeground(new Color(255, 102, 102));
        txtCarvaan.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 30));
        txtCarvaan.setEditable(false);
        txtCarvaan.setColumns(10);
        txtCarvaan.setBackground(new Color(255, 255, 204));
        txtCarvaan.setBounds(208, 227, 204, 44);
        contentPane.add(txtCarvaan);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub


        if(e.getSource()==play) {

            try {
                curr.getData().playSong(5);

            } catch (UnsupportedAudioFileException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (LineUnavailableException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            textField.setText(curr.getData().songName);
        }

        if(e.getSource()==pause) {
            curr.getData().s1.clip.close();
            textField.setText("~~~ AUDIO PAUSED ~~~");

        }


        if(e.getSource()==prev) {
            curr.getData().s1.clip.close();
            curr=curr.getPrev();
            try {
                curr.getData().playSong(5);
            } catch (UnsupportedAudioFileException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (LineUnavailableException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            textField.setText(curr.getData().songName);
        }

        if(e.getSource()==next) {
            curr.getData().s1.clip.close();
            curr=curr.getNext();

            try {

                curr.getData().playSong(5);
            } catch (UnsupportedAudioFileException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (LineUnavailableException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            textField.setText(curr.getData().songName);
        }

    }
}