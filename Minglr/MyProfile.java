package socialnetwork;

import java.io.IOException;
import java.util.Scanner;

class MyProfile 
{
	Scanner s = new Scanner(System.in);

	public void myProfile() throws IOException
	{
		// Show Profile
		System.out.println("\n\n\n------------------------------------------------------------\n");
		System.out.println("     " + Login.currentLoginAccount.getName() + "'s Profile");
		System.out.println("\n------------------------------------------------------------");

		System.out.println("\n" + Login.currentLoginAccount.showProfile());

		System.out.println("\n------------------------------------------------------------");


		System.out.print("\n\n\nPress Enter and Return..... ");
		s.nextLine();

		Main.clearScreen(); // Clear Screen
	}
}