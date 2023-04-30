package services;

import node.Person;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Reviews{

	InputStreamReader i=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(i);
	
	Person obj1[]=new Person[10];
	
	
	ArrayList<Person> al=new ArrayList<Person>();
	ArrayList<Person> a2=new ArrayList<Person>();
	ArrayList<Person> a3=new ArrayList<Person>();
	ArrayList<Person> a4=new ArrayList<Person>();
	ArrayList<Person> a5=new ArrayList<Person>();
	
	int count;
	int count1=0;
	int count2=0;
	int count3=0;
	int count4=0;
	int count5=0;
	
	public void accept() throws IOException
	{
		
		obj1[count]=new Person();
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.print("\nENTER YOUR NAME : ");
		obj1[count].name=br.readLine();

		System.out.print("\nENTER NO OF STARS : ");
		obj1[count].rating=Integer.parseInt(br.readLine());
		
		System.out.print("\nENTER YOUR FEEDBACK : ");
		obj1[count].content=br.readLine();
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		switch(obj1[count].rating)
		{
		case 1:
			
			obj1[count1]=obj1[count];
			al.add(obj1[count1]);
			count++;
			count1++;
			break;
			
		case 2:
			
			obj1[count2]=obj1[count];
			a2.add(obj1[count2]);
			count++;
			count2++;
			break;
			
		case 3:
			
			obj1[count3]=obj1[count];
			a3.add(obj1[count3]);
			count++;
			count3++;
			break;
		
		case 4:
			obj1[count4]=obj1[count];
			a4.add(obj1[count4]);
			count++;
			count4++;
			break;
			
		case 5:
			obj1[count5]=obj1[count];
			a5.add(obj1[count5]);
			count++;
			count5++;
			break;
		}
	}
	public void display() throws NumberFormatException, IOException{	
		System.out.println("\n\tSORT BY :"); 
		System.out.println("\n\t\t1.Rating : 1");
		System.out.println("\t\t2.Rating : 2");
		System.out.println("\t\t3.Rating : 3");
		System.out.println("\t\t4.Rating : 4");
		System.out.println("\t\t5.Rating : 5");
		System.out.print("\nENTER YOUR CHOICE : ");
		int ch=Integer.parseInt(br.readLine());
		
		switch(ch){
		case 1:
		for(int j=0;j<count1;j++){
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("\n****** SORTED BY 1 STAR ******");
			System.out.println("\nNAME : "+al.get(j).name);
			System.out.println("RATINGS : "+al.get(j).rating);
			System.out.println("FEEDBACK : "+al.get(j).content);
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");	
		}
		break;
		case 2:
			for(int j=0;j<count2;j++){
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				System.out.println("\n****** SORTED BY 2 STAR ******");
				System.out.println("NAME : "+a2.get(j).name);
				System.out.println("RATINGS : "+a2.get(j).rating);
				System.out.println("FEEDBACK : "+a2.get(j).content);
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");	
			}
			break;
		case 3:
			for(int j=0;j<count3;j++){
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				System.out.println("\n****** SORTED BY 3 STAR ******");
				System.out.println("NAME : "+a3.get(j).name);
				System.out.println("RATINGS : "+a3.get(j).rating);
				System.out.println("FEEDBACK : "+a3.get(j).content);
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");	
			}
			break;
			
		case 4:
			for(int j=0;j<count4;j++){
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				System.out.println("\n****** SORTED BY 4 STAR ******");
				System.out.println("NAME : "+a4.get(j).name);
				System.out.println("RATINGS : "+a4.get(j).rating);
				System.out.println("FEEDBACK : "+a4.get(j).content);
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");	
			}
			break;
			
		case 5:
			for(int j=0;j<count5;j++){
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				System.out.println("\n****** SORTED BY 5 STAR ******");
				System.out.println("NAME : "+a5.get(j).name);
				System.out.println("RATINGS : "+a5.get(j).rating);
				System.out.println("FEEDBACK : "+a5.get(j).content);
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");		
			}
			break;
			
		default:
			System.out.println("INVALID CHOICE !!");
			break;
		}
	}
	public static void main(String[] args) throws IOException {

		Reviews obj2=new Reviews();
		int no;

		Scanner input=new Scanner(System.in);
		
		System.out.println("\n****** REVIEW MENU ******");
		System.out.println("\n\t1.ADD REVIEW");
		System.out.println("\t2.DISPLAY REVIEWS\n");
		do {
			System.out.print("\nENTER YOUR CHOICE : ");
			int ch=input.nextInt();

			switch(ch) {

			case 1:
				obj2.accept();
				break;

			case 2:
				obj2.display();
				break;
			}
			System.out.println();
			System.out.println("Do you want to continue ???");
			System.out.println("Press : ");
			System.out.println("\t1 to CONTINUE");
			System.out.println("\t0 to EXIT");
			no = input.nextInt();
			if(no == 0) {
				System.out.println("\n :::::: THANK FOR VISITING ::::::");
			}
		}while(no==1);
	}
}



