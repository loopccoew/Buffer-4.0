import java.util.*;
public class Main {
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME");
		System.out.println("Enter your choice:");
		System.out.println("1.Admin\n2.User\n3.Exit");
		int a=sc.nextInt();
		if(a==1) {
			Admin Admin_obj = new Admin();
			Admin_obj.main(Args);
		}
		if(a==2) {
			User user_obj=new User();
			user_obj.main(Args);
		}
		if(a==3) {
			System.exit(0);
		}
	}
}
