package network;

import java.io.IOException;
import java.util.*;

// Class MainPage
public class Main
{
	public static void clearScreen() 
	{

		System.out.flush();
	}

	// main Function 
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		clearScreen();
		
		// Add already created accounts
		addAcc.addAccounts();

		int choice;
		Scanner sc = new Scanner(System.in);

		// Object of CreateAccount Class
		CreateAccount obj1 = new CreateAccount();

		// Object of Login Class
		Login obj2 = new Login();

		// MAIN PAGE 
		do {
			System.out.println("\n\n\n --------------------------------------------------------------");
			System.out.println("  WELCOME TO SOCIAL NETWORKING SITE !!!");
			System.out.println(" --------------------------------------------------------------");

			System.out.println("\n\nTo Create a New Account: Enter 1\n\n");
			//System.out.println("\n\nDo Already have an Account?");
			System.out.println("To Login: Enter 2\n\n");
			System.out.println("\n\nTo Exit: Enter 3");
			System.out.println(" --------------------------------------------------------------");
			System.out.print("\n\n Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) 
			{
			case 1:
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

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

		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		System.out.println("\n\n\n\n\t\t\t\t-----------------------------");
		System.out.println("\n\t\t\t\t        THANK YOU!!!");
		System.out.println("\n\t\t\t\t-----------------------------\n\n\n");
	}

}