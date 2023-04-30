import java.util.*;
public class Transaction {
	String choice,description;
	double max_amount,donated_amount=0;
	static int counter=0;
	static double amount=0;
	static Campaign transactions[]=new Campaign[10];
	static Scanner sc = new Scanner(System.in);
	static String usercampaign=null;
	static Main obj=new Main();

	public static void main(String[] args) {
		System.out.println("Do you want donate to a campaign ?");
		System.out.println("1.Yes\n2.No");
		int ans=sc.nextInt();
		if(ans==1) {
			System.out.println("Available Campaigns: ");
			Campaign obj=new Campaign();
			obj.view();
			System.out.println("Enter campaign name you wish to donate to:");
			usercampaign=sc.next();
			System.out.println("Enter the amount to be donated:");
			amount=sc.nextInt();
			obj.add_amount(usercampaign,amount);
			obj.main(null);
		}
		if(ans==2) {
			obj.main(null);
		}
		if(ans!=1 && ans!=2) {
			System.out.println("Enter the valid input");
			Transaction.main(args);
		}
	}
}
