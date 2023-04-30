import java.util.*;
public class Campaign {
	String name,description;
	double max_amount,donated_amount=0;
	static int counter=0;
	static Campaign campaigns[]=new Campaign[10];
	static Main main_obj=new Main();
	static Scanner sc = new Scanner(System.in);
	static Transaction obj1=new Transaction();
	void view()
	{
		if(counter==0)
		{
			System.out.println("No Campaigns ");
			return;
		}
		System.out.println("**********CAMPAIGNS********** \n");
		for(int i=0;i<counter;i++)
		{
			System.out.println("Name of Campaign    : "+campaigns[i].name);
			System.out.println("Details of Campaign : "+campaigns[i].description);
			System.out.println("Amount Donated      : "+campaigns[i].donated_amount);
			System.out.println("Amount Needed       : "+campaigns[i].max_amount);
			System.out.println("\n");
		}
	}
	void create()
	{
		campaigns[counter]=new Campaign();
		System.out.println("Enter name of campaign");
		campaigns[counter].name=sc.next();
		System.out.println("Enter description of campaign");
		campaigns[counter].description=sc.next();
		System.out.println("Enter amount needed for campaign");
		campaigns[counter].max_amount=sc.nextInt();
		counter++;
		System.out.println("Campaign created successfully\n");
	}
	void edit()
	{
		System.out.println("Enter name of campaign ");
		String camp_name=sc.next();
		int i=0;
		int flag=0;
		for(i=0;i<counter;i++)
		{
			if(campaigns[i].name.equals(camp_name))
			{
				flag=1;
				break;
			}

		}
		if(flag==0)
		{
			System.out.println("Campaign not found");
			return;
		}
		System.out.println("What details you want to edit?");
		System.out.println("1.Name\n2.Description\n3.Amount Needed");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter new name");
			campaigns[i].name=sc.next();
		}
		if(choice==2)
		{
			System.out.println("Enter new description");
			campaigns[i].description=sc.next();
		}
		if(choice==3)
		{
			System.out.println("Enter new amount needed");
			campaigns[i].max_amount=sc.nextInt();
		}
		System.out.println("Successfully edited the campaign\n");


	}
	void add_amount(String camp_name,double amt)
	{
		for(int i=0;i<counter;i++) {
			if(campaigns[i].name.equals(camp_name)) {
				if(((amt+campaigns[i].donated_amount)>campaigns[i].max_amount)) {
					System.out.println("Sorry,maximum limit of fund exceeded!!");
				}
				else {
					campaigns[i].donated_amount+=amt;
					System.out.println("Thankyou for donating !!");
				}
			}
		}
		obj1.main(null);
	}
	public static void main(String Args[]) {
		// TODO Auto-generated method stub
		Campaign obj=new Campaign();
		System.out.println("1.View Campaigns");
		System.out.println("2.Create Campaigns");
		System.out.println("3.Edit Campaigns");
		System.out.println("4.Exit");
		System.out.println("\n");
		int choice=sc.nextInt();
		if(choice==1)
			obj.view();
		if(choice==2)
			obj.create();
		if(choice==3)
			obj.edit();
		if(choice!=4)
			Campaign.main(null);
		if(choice==4) {
			main_obj.main(null);
		}

	}


}