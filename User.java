import java.util.Scanner;
public class User {
	static Accounts head=null,temp=null;
	static String name=null;
	static long PhNo=0;
	static int UID=100;
	static String Id=null;
	static String testId=null;
	static Transaction obj=new Transaction();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice :");
		System.out.println("1.New User\n2.Existing User\n3.Exit");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter your name:");
			name=sc.next();
			System.out.println("Enter your phone number: ");
			PhNo=sc.nextLong();
			Id="UID"+String.valueOf(UID);
			UID++;
			System.out.println("Your Id is:"+Id);
			Accounts new_donar=new Accounts(name,Id,PhNo);
			if(head==null) {
				head=new_donar;
				temp=head;
			}
			else {
				temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=new_donar;
			}
			obj.main(null);
		}
		int flag=0;
		if(choice==2) {
			
			System.out.println("Enter your ID: ");
			testId=sc.next();
			temp=head;
			while(temp!=null) {
				if(testId.equals(temp.Id)) {
					System.out.println("Welcome "+temp.name);
					obj.main(null);
					flag=1;
					break;

				}
				temp=temp.next;
			}
			if(flag==0)
			{
				System.out.println("Invalid");
				main(null);
			}
		
			obj.main(null);

		}
		if(choice==3) {

		}


		User.main(null);
	}
}