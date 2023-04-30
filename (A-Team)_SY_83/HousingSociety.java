package Project_Buffer;
//declaring package buffer

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//importing all required java collection frameworks

class Society 
{
	//using data structures for storing information
  private ArrayList<Member> members;  
  private HashMap<String, Expense> expenses;
  private LinkedHashMap<Integer,Maintenance> main;
  
  //declaring a non parameterized constructor for initialization
  public Society() 
  {
      this.members = new ArrayList<>();
      this.expenses = new HashMap<>();
      this.main=new LinkedHashMap<>();
  }
   //for adding members in ArrayList
  public void addMember(Member member) {
      members.add(member);
  }

  //for adding expenses in HashMap
  public void addExpense(Expense expense) {
      expenses.put(expense.getName(), expense);
  }
  
  //for adding expenses in LinkedHashMap
  public void addMaintenance(Maintenance man) {
      main.put(man.getFlat(),man);
  }

   //Getter methods
  public ArrayList<Member> getMembers() {
      return members;
  }
  
  public HashMap<Integer, Maintenance> getMaintenance() {
      return main;
  }
  
  public HashMap<String, Expense> getExpenses() {
      return expenses;
  }
}


class Member 
{
  private String name;
  private int flat;

  //declaring a non parameterized constructor for initialization
  public Member(String name,int flat) {
      this.name = name;
      this.flat=flat;
  }

  //Getter methods
  public String getName() {
      return name;
  }
  
  public int getflat()
  {
  	return flat;
  }
  
  
  public void addExpense(double amount) 
  { //maintenance
      
  }

  public void addPayment(double amount)
  { //spending
      
  }

  //Overriding toString method for String Representation of user's choice
  @Override
  public String toString() 
  {
      return ("Flat:"+flat+" Name:" + name);
  }
  
}


class Maintenance
{
	
  private double amount;
  private int flat;
  double balance=3000,remainder;
  
  private LinkedHashMap<Integer, Double> payments;
  
  
//declaring a parameterized constructor for initialization
  public Maintenance(int flat,double amount ) {
      this.flat = flat;
      this.amount = amount;
      this.payments = new LinkedHashMap<>();
  }
 
  //Getter methods
	public int getFlat()
  {
      return flat;
  }

  public double getAmount() {
      return amount;
  }
  
  public LinkedHashMap<Integer, Double> getPayments() {
      return payments;
  }
  
  public void addPayment(int flat, double amount) {
      payments.put(flat, amount);
  }
  
  //Calculations for understanding status of maintenance
  public void getamount() 
  {
      if(amount<3000)
      {
      	System.out.println("The payment is still pending!");
      	remainder=balance-amount;
      	System.out.println("You have to pay:"+remainder);
      }
      else
      {
      	System.out.println("Your Payment for April is cleared!!");
      }
  }
  
  /*public static void sortbykey()
  {
  	Map<Integer,Double> map = new HashMap<>();
      HashMap<Integer,Double> sorted = new HashMap<>();
      sorted.putAll(map);
      for (Map.Entry<Integer,Double> entry : sorted.entrySet())
          System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());       
  }*/
  
  //Overriding toString method for String Representation of user's choice
  @Override
  public String toString()
  {
  	String result = "Maintenance of flat " + flat + "\nAmount paid: " + amount + "\n";
  	
      for (Map.Entry<Integer, Double> entry : payments.entrySet()) 
      {
          return result;
      }
      Map<Integer,Double> treemap = new TreeMap<Integer,Double>(payments);
      
      for (Map.Entry<Integer, Double> entry : treemap.entrySet()) 
      {
          return result;
      }
      return result;
      
   
  }
  
 

}


class Expense
{
  private String name;
  private double amount;
  private HashMap<String, Double> payments;

  
//declaring a parameterized constructor for initialization
  public Expense(String name, double amount) 
  {
      this.name = name;
      this.amount = amount;
      this.payments = new HashMap<>();
  }

  //Getter method
  public String getName() 
  {
      return name;
  }

  public double getAmount() 
  {
      return amount;
  }

  /*double OutwardPayment()
  {
      System.out.println("Enter the expense for Gardening:"):
      m=out.nextInt();
      
  }*/
  
  public HashMap<String, Double> getPayments() 
  {
      return payments;
  }

  public void addPayment(String memberName, double amount) 
  {
      payments.put(memberName, amount);
  }

//Overriding toString method for String Representation of user's choice
  @Override
  public String toString()
  {
      String result = "Expense: " + name + "\n"+"Amount: " + amount + "\n";
      for (Map.Entry<String, Double> entry : payments.entrySet()) 
      {
          result += entry.getKey() + " paid: " + entry.getValue() + "\n";
      }
      return result;
  }
}


public class HousingSociety
{
	
  public static void main(String[] args) 
  {
      
  	Society society = new Society();


      //Creating objects of class Member and passing constructor
      Member member1 = new Member("Mr.Prashant Shetty",101);
      Member member2 = new Member("Mr.Rajesh Moghe",102);
      Member member3 = new Member("Mrs.Sanika Gandhi",201);
      Member member4 = new Member("Ms.Bakul Moghe",202);
      Member member5 = new Member("Mr.Jivan Shetti ",301);
      Member member6 = new Member("Ms.Vaibhavi Shetti",302);
      Member member7 = new Member("Mr.Rohan Bajpai",401);
      Member member8 = new Member("Mr.Karan Bora",402);
      Member member9 = new Member("Mrs.Ashwini Rathod",501);
      Member member10 = new Member("Mrs.Shilpa Kundra",502);
     
      //Adding the objects to ArrayList
      society.addMember(member1);
      society.addMember(member2);
      society.addMember(member3);
      society.addMember(member4);
      society.addMember(member5);
      society.addMember(member6);
      society.addMember(member7);
      society.addMember(member8);
      society.addMember(member9);
      society.addMember(member10);
    
     
      System.out.println("\n\n\t\t\t----------WELCOME TO GOKULDHAM SOCIETY----------");
      System.out.println();
      System.out.println("________________________________");
      
      System.out.println();
      System.out.println("Housing Society Members:\n");
      
      
      for (Member member : society.getMembers()) 
      {
          System.out.println(member);
      }
      
      
      System.out.println();
      System.out.println("\nCheck distribution of maintenance:");
      System.out.println("\n-----------------------------------------------------");
      System.out.println("Housing Society Expenses:");
      System.out.println("\n-----------------------------------------------------");
      
      int k;
      
      do
      {
      	int ch;
      	double totalmain,totalex;

      	System.out.println("\n**WELCOME**");
      	System.out.println();
      	System.out.println("MENU:");
      	System.out.println();
      	System.out.println("1.To check maintenance");
      	System.out.println("2.To check distribution of expenses");
      	
      	System.out.println("Enter Choice:");
      	Scanner sc =new Scanner(System.in);
      	ch=sc.nextInt();
      	
      	switch(ch)
      	{
      	case 2:
      		
      	    int m1,m2,m3,m4,m5,m6,m7,m8;
      	     Scanner out= new Scanner(System.in);
      	     
      	     System.out.println("Enter the expenses for Electricity Bill:");

      	     //Take amount from user
                   m1=out.nextInt();

                   //Creating object of Class Expense and passing constructor
      	     Expense expense1 = new Expense("Electricity Bill", m1); 

                   //Adding the object to HashMap
      	     society.addExpense(expense1);
      	     
      	     System.out.println("Enter the expenses for WaterBill:");
      	     m2=out.nextInt();
      	     Expense expense2 = new Expense("Water Bill", m2);
      	     society.addExpense(expense2);
      	     
      	     System.out.println("Enter the expenses for Security:");
      	     m3=out.nextInt();
      	     Expense expense3 = new Expense("Security", m3);
      	     society.addExpense(expense3);
      	     
      	     System.out.println("Enter the expenses for Cleaning:");
      	     m4=out.nextInt();
      	     Expense expense4 = new Expense("Cleaning", m4);
      	     society.addExpense(expense4);
      	     
      	     System.out.println("Enter the expenses for Generator Maintenance:");
      	     m5=out.nextInt();
      	     Expense expense5 = new Expense("Generator Maintenance", m5);
      	     society.addExpense(expense5);
      	     
      	     System.out.println("Enter the expenses for CA & Consultation:");
      	     m6=out.nextInt();
      	     Expense expense6 = new Expense("CA & Consultation", m6);
      	     society.addExpense(expense6);
      	     
      	     System.out.println("Enter the expenses for Gardening:");
      	     m7=out.nextInt();
      	     Expense expense7 = new Expense("Gardening", m7);
      	     society.addExpense(expense7);
      	     
      	     System.out.println("Enter the expenses for Diesel Expenses:");
      	     m8=out.nextInt();
      	     Expense expense8 = new Expense("Diesel Expenses", m8);
      	     society.addExpense(expense8);
      	     
      	     //Printing the HashMap of expenses
      	     System.out.println("\n*REPORT FOR EXPENSES*\n");
      	     
      		for (Expense expense : society.getExpenses().values()) 
      		{
                  System.out.println(expense);
      		}

                       //Calculating the total expenses 
      		 totalex=m1+m2+m3+m4+m5+m6+m7+m8;
      		 
      		System.out.println("Total Expenses of the society:"+ totalex);
      		
  
      		break;
      		
      	case 1:
      		
      		Scanner st=new Scanner(System.in);
  	        double t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
  	        
  	        System.out.println("Enter the amount paid by flat 101:");

              //Take amount from user
  	        t1=st.nextDouble();

              //Creating object of Class Maintenance and passing constructor
  	        Maintenance ma1=new Maintenance(101,t1);
  	        
  	        System.out.println("Enter the amount paid by flat 102:");
  	        t2=st.nextDouble();
  	        Maintenance ma2=new Maintenance(102,t2);
  	        
  	        System.out.println("Enter the amount paid by flat 201:");
  	        t3=st.nextDouble();
  	        Maintenance ma3=new Maintenance(201,t3);
  	        
  	        
  	        System.out.println("Enter the amount paid by flat 202:");
  	        t4=st.nextDouble();
  	        Maintenance ma4=new Maintenance(202,t4);
  	        
  	        System.out.println("Enter the amount paid by flat 301:");
  	        t5=st.nextDouble();
  	        Maintenance ma5=new Maintenance(301,t5);
  	        
  	        System.out.println("Enter the amount paid by flat 302:");
  	        t6=st.nextDouble();
  	        Maintenance ma6=new Maintenance(302,t6);
  	        
  	        System.out.println("Enter the amount paid by flat 401:");
  	        t7=st.nextDouble();
  	        Maintenance ma7=new Maintenance(401,t7);
  	        
  	        System.out.println("Enter the amount paid by flat 402:");
  	        t8=st.nextDouble();
  	        Maintenance ma8=new Maintenance(402,t8);
  	        
  	        System.out.println("Enter the amount paid by flat 501:");
  	        t9=st.nextDouble();
  	        Maintenance ma9=new Maintenance(501,t9);
  	        
  	        System.out.println("Enter the amount paid by flat 502:");
  	        t10=st.nextDouble();
  	        Maintenance ma10=new Maintenance(502,t10);
  	        
  	        //Adding the objects to LinkedHashMap
  	        society.addMaintenance(ma1);
  	        society.addMaintenance(ma2);
  	        society.addMaintenance(ma3);
  	        society.addMaintenance(ma4);
  	        society.addMaintenance(ma5);
  	        society.addMaintenance(ma6);
  	        society.addMaintenance(ma7);
  	        society.addMaintenance(ma8);
  	        society.addMaintenance(ma9);
  	        society.addMaintenance(ma10);
  	        

                      //Printing the LinkedHashMap of Maintenance for printing flats in order
      		for (Maintenance main : society.getMaintenance().values()) 
      		{ 
      			
                  System.out.print(main);
                  main.getamount();
                  System.out.println("-----------------------------------------------------\n");
      		}
      		
                       //calulcating total maintenance
      		 totalmain= t1+t2+t3+t4+t5+t6+t7+t8+t9+t10;
      		 
  	        System.out.println("Total maintenance ammount received:"+totalmain);
  	       
      		break;
      	
      		default: System.out.println("Incorrect choice");
      	}
      	
      	System.out.println("\nDo you want to continue(1/0)?");
      	System.out.println("\nPress 1 to continue:");
      	k=sc.nextInt();
      	
      }while(k==1 && k!=0);
  
  
  }
}