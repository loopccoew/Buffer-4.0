package socialnetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class SearchAcc 
{
	Scanner s = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static Account findAccountByName(String name) 
	{
		for (Account ac : CreateAccount.accounts) 
		{
			if (ac.userName().equals(name)) 
			{
				return ac;
			}
		}
		return null;
	}

	// Function to Search Profile
	// Time Complexity - O(n)
	public void searchAcc() throws IOException
	{
		Main.clearScreen(); // Clear Screen

		// Input Username of the account to send request
		System.out.println("\n\n--------------------------------------");
		System.out.print(" Enter Username: ");
		String name = br.readLine();
		System.out.println("--------------------------------------");

		Main.clearScreen(); // Clear Screen

		Account account = findAccountByName(name);

		// If account does not exist
		if (account == null) 
		{
			System.out.println("\n\n-----------------------------");
			System.out.println("\n      User Not Found!");
			System.out.println("\n-----------------------------");

			System.out.print("\n\n\n Press Enter and Return..... ");

			s.nextLine();

			Main.clearScreen(); // Clear Screen

			return;
		}

		System.out.print("\n\n Press Enter to See " + account.getName() + "'s Profile.... ");
		s.nextLine();

		Main.clearScreen(); // Clear Screen

		// Show Profile
		System.out.println("\n\n----------------------------------------------------------------\n");
		System.out.println("\t\t" + account.getName() + "'s Profile");
		System.out.println("\n----------------------------------------------------------------");

		System.out.println("\n" + account.showProfile());

		System.out.println("\n----------------------------------------------------------------");

		System.out.print("\n\n\n Press Enter and Return..... ");
		s.nextLine();

		Main.clearScreen(); // Clear Screen
	}
}