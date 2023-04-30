import java.util.*;
public class Admin {
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Admin,");
		System.out.print("Enter your password :");
		String pswd=sc.next();

		if(!pswd.equals("admin123"))
		{
			System.out.println("INCORRECT PASSWORD");
			main(null);
		}
		else {
			System.out.println("Admin login successful\n");
		}
		Campaign Campaign_obj=new Campaign();
		Campaign_obj.main(null);

	}
}