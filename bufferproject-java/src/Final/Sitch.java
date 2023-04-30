package Final;
import java.util.*;
import weightedgraph.*;

public class Sitch {
	
	static String name;
	private static Scanner sc;
   
	public static void main(String[] args)
	{   
		String str;
		 Maingraph m=new Maingraph();
		sc = new Scanner(System.in);
	do
	{   System.out.println("*************WELCOME TO RAMP PARKING SOLUTIONS***********");
		System.out.println("\nEnter your name");
	    name=sc.next();
	    System.out.println("\nHello "+ name + "!");
	    System.out.println("\nChoose your current location");
		System.out.println("\n1.Bavdhan\n2.Kothrud\n3.Karvenagar\n4.Warje");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:   
			System.out.println("\nYou are at Bavdhan");
			m.NodeA();
			break;
			
		case 2:
			System.out.println("\nYou are at Kothrud");
			m.NodeB();
			break;
		case 3:
			
			System.out.println("\nYou are at Karvenagar");
			m.NodeC();
			break;
		case 4: 
			System.out.println("\nYou are at Warje");
			m.NodeD();
		  break;
		}
		System.out.println("\nDo you want to continue using the app?(Y/N)");
        str=sc.next();
   }while(str.equalsIgnoreCase("Y"));
		
	System.out.println("THANKYOU FOR USING OUR APP!" );
}
	
}