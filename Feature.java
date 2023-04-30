package Project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Feature {
	static Scanner sc = new Scanner(System.in);
	

	static void checkBal(Stack<Double> bal, double d,int a) {
		System.out.println("*Check balance*");
    	System.out.println(bal.peek());
    	d=(double) bal.peek();
		
	}
	static void fundTrans(Stack<Double> history,double d,int a, Stack<Double> bal) {
		 System.out.println("*Fund Transfer*");    
       System.out.println("1. Withdraw");    
       System.out.println("2. Deposit");      
       System.out.println("Enter your choice :");
       int ch3 = sc.nextInt();
       switch(ch3)
       {
       case 1:
           System.out.println("*Withdraw*");    
           System.out.println("Enter the amount");
           double w = sc.nextInt();
           history.add(-w);
           if(w<d)
           {
           	d=d-w;
               bal.push(d);
//               System.out.println("New Balance : " + InitialBalance);
           }
           else
           {
               System.out.println("Insuffient Balance\n Money cannot be withdrawn");
           }
           break;
           
       case 2:
           System.out.println("*Deposit*");    
           System.out.println("Enter the amount");
           double de = sc.nextInt();
           history.add(+de);
           d=d+de;
           bal.push(d);
//           System.out.println("New Balance : " + InitialBalance);
           break;
            
       }
	}
	static void transHistory(Stack<Double> history, @SuppressWarnings("rawtypes") ArrayList<Stack> History, int a) {
		 System.out.println("*Transaction History*");
       for(int i=0;i<=History.size();i++) {
       	if(i==a) {
       		History.add(history);
       	}
       }
       Project.Login.display(history);
		
	}
	static void Loan(Stack<Double> bal) {
   	 System.out.println("Loan");
      //System.out.println("Enter account number");
      AskAccount.whichacc();
      System.out.println("Enter the Loan Amount : ");
      int loanamt= sc.nextInt();
      double min=0.3*bal.peek();
      if(loanamt>min||loanamt<bal.peek())
      {
      	System.out.println("You are Eligible for the Loan.");
      	System.out.println("Now Submit your documents (True/False)");
      	boolean doc = sc.nextBoolean();
      	if(doc==true)
      	{
      		System.out.println("Your loan is granted.\nThe amount will be added to your account");
      		bal.push(loanamt+bal.peek());
      	}
      	else
      	{
          	System.out.println("Submit your documents");
      	}
      }
      else
      {
      	System.out.println("You are not Eligible for the Loan.");
      }
	}
	@SuppressWarnings("unchecked")
	static void BankDetails() {
		System.out.println("");
    	for(int in=0;in<Project.Login.ll.size();in++){
           System.out.println("Account "+(in+1));
           String crn = (String) Project.Login.ll.get(in).peek();
           Project.Login.ll.get(in).pop();
           String Acc = (String) Project.Login.ll.get(in).peek();
           Project.Login.ll.get(in).pop();
           String ifsc = (String) Project.Login.ll.get(in).peek();
           Project.Login.ll.get(in).pop();
           String Bankname = (String) Project.Login.ll.get(in).peek();
           System.out.println("Bank Name : "+Bankname);
           Project.Login.ll.get(in).push(Bankname);
           System.out.println("IFSC code : "+ifsc);
           Project.Login.ll.get(in).push(ifsc);
           System.out.println("Account no: "+Acc);
           Project.Login.ll.get(in).push(Acc);
           System.out.println("CRN no    : "+crn);
           Project.Login.ll.get(in).push(crn);
        }
		
	}
	static void changeAcc (int Mpin) {
    	System.out.println("**Account Change to**");
    	int chg = sc.nextInt();
    		for(int in=0;in<=Project.Login.ll.size();in++) {
    			if(in==(chg-1)){
    			Project.Login.ll.get(chg-1);
    			System.out.print("Using Account "+chg);
    			main(chg,Mpin);
    			}
    		}
	}
	
	public static void main(int n,int Mpin) {
	  @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	  int a= n-1;
	  double[] Balance = new double[Project.Login.ll.size()];
	  Balance = new double[]{5000,2000,1000,3000};
	  Stack<Double> bal = new Stack<Double>();
      Stack<Double> history = new Stack<Double>();
      @SuppressWarnings("rawtypes")
	ArrayList <Stack> History = new ArrayList<Stack>();
      bal.add((double) Balance[a]); 
	  int cho;
      do
      {
      System.out.println("\n**Home Page**");    
      System.out.println("1.Check balance");
      System.out.println("2.Fund Transfer");
      System.out.println("3.Transaction History");    
      System.out.println("4.Loan\n5.Check Bank details");
      System.out.println("6.Switch Account");        
      System.out.println("0.Exit\n");
      System.out.println("Enter your Choice");    
      cho=sc.nextInt();
            switch(cho){
            case 0:
                System.out.println("Thank you");
                System.exit(0);
                break;
            case 1:
            	checkBal(bal, bal.peek(), a);
            	break;
            case 2:
            	System.out.println("Enter your MPIN");
            	int mpin = sc.nextInt();
            	if(mpin == Mpin ) {
            		fundTrans(history, bal.peek(), a, bal);
            	}
            	else {
            		System.out.print("Invalid Pin...!!!\n");
            	}           	
            	break;
            case 3:
            	transHistory(history,History,a);
            	break;
            case 4: 
            	Loan(bal);
            	break;
            case 5:
            	BankDetails();
            	break;
            case 6:
            	changeAcc(Mpin);
            	break;
            default:
            	System.out.println("Invalid input!!");
            	break;
            }
      }while(cho!=0);
      
   }

}
