package Travel;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextPane;

public class bookedTrips {
//Userr u=new Userr();
//u.showStringTrip();
	JFrame bookedTrips_frame;
	static JTextPane txtloader = new JTextPane();
//	txtloader.setFont(new Font("Txt_IV50", Font.PLAIN, 17));
//	txtloader.setBounds(384, 136, 239, 198);
//	panel.add(txtloader);
//	txtloader.setText(u.showStringTrip());
//	Graph djj=new Graph(true,true,true,true,true,true,true);
//	Dijikstra dj=new Dijikstra();
//	Userr u=new Userr();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {//Userr u=new Userr();
					
					bookedTrips window = new bookedTrips();
					window.bookedTrips_frame.setVisible(true);
					//txtloader.setText(u.showStringTrip());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bookedTrips() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Graph djj=new Graph(true,true,true,true,true,true,true);
		Dijikstra dj=new Dijikstra();
		Userr u=new Userr();
		Bus1 b=new Bus1();
		//b.initialize();
		djj.addcityy();
		dj.shortestPathBetweennn(djj,djj.getCityByValue(b.txtleavingfrom.getText()),
				djj.getCityByValue(b.txtgoingto.getText()));
		//Userr h=new Userr();
		u.showStringTrip();
		bookedTrips_frame = new JFrame();
		bookedTrips_frame.setBounds(100, 100, 920, 552);
		bookedTrips_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bookedTrips_frame.getContentPane().setLayout(null);
		txtloader.setBounds(0, 0, 906, 515);
		bookedTrips_frame.getContentPane().add(txtloader);
//		Userr u=new Userr();
		txtloader.setText(u.showStringTrip());
		//txtloader.setText("g"+b.txtleavingfrom.getText());
	}

}
