package socialnetwork;

import java.io.IOException;
import java.util.*;

// Class MainPage
public class Main
{
	public static void clearScreen() 
	{
		System.out.flush();
	}

	// Main Function 
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		clearScreen();
		
		// Add already created accounts
		AddAcc.addAcc();

		int choice;
		Scanner sc = new Scanner(System.in);

		// Object of CreateAccount Class
		CreateAccount obj1 = new CreateAccount();

		// Object of Login Class
		Login obj2 = new Login();

		// MAIN PAGE 
		do {
			System.out.println("\n\n------------------------------------------------------------");
			System.out.println("\t\t  WELCOME TO MINGLR !!!");
			System.out.println("------------------------------------------------------------");

			System.out.println("\n\n To Create a New Account: Enter 1");
			System.out.println("\n\n To Login: Enter 2");
			System.out.println("\n\n To Exit: Enter 3");
			System.out.println("\n\n------------------------------------------------------------");
			System.out.print("\n\n Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) 
			{
			case 1:
				// Create Account
				obj1.createAccount();   
				break;

			case 2:
				// Login
				obj2.login();   
				break;

			default:
				// Clear Screen
				clearScreen();  
			}

		} while (choice != 3);

		sc.close();

		System.out.println("\n\n\n\n-----------------------------");
		System.out.println("\n        THANK YOU!!!");
		System.out.println("\n-----------------------------\n\n\n");
	}
}