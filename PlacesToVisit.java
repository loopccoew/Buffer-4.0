package Travel;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;


public class PlacesToVisit extends JFrame{
	
    JLabel pic;
    Timer tm;
    int x = 0;
    //Images Path In Array
    String[] list = {
                      "C:\\Users\\nisha\\OneDrive\\Desktop\\Buffer\\agrafort1.jpg",//0
                      "D:\\Downloads C_to_D\\gateway-of-india.jpg",//1
                      
                      "D:\\Downloads C_to_D\\Maharajahs-Palace-in-Mysore.jpg",//3
                      "D:\\Downloads C_to_D\\golentemple.jpg",//4
                      "D:\\Downloads C_to_D\\goaa.jpg",//5
                      "D:\\Downloads C_to_D\\placetovisit.jpg",//6
                      "D:\\Downloads C_to_D\\tajmahl1.jpg"//2
                    };
    
    public PlacesToVisit(){
    	
        super("Java SlideShow");
        //setSize(80,90);
        pic = new JLabel();
        pic.setBounds(0, 0, 839, 572);

        //Call The Function SetImageSize
        SetImageSize(6);
               //set a timer
        tm = new Timer(2000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        getContentPane().add(pic);
        tm.start();
        getContentPane().setLayout(null);
        setSize(847, 658);
        getContentPane().setBackground(Color.decode("#bdb67b"));
        
        JButton btnKnowYourUniverse = new JButton("Know About Places");
        btnKnowYourUniverse.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		aboutplacess a=new aboutplacess();
        		a.a_pframe.setVisible(true);
        		a.a_pframe.setLocationRelativeTo(null);
        	}
        });
        btnKnowYourUniverse.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
        btnKnowYourUniverse.setBounds(319, 571, 268, 48);
        getContentPane().add(btnKnowYourUniverse);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

public static void main(String[] args){ 
      
	PlacesToVisit skySlideshow = new PlacesToVisit();
    skySlideshow.setVisible(true);
    skySlideshow.setLocationRelativeTo(null);}
}