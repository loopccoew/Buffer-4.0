package socialnetwork;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

class DisplayFriends 
{
    Scanner s = new Scanner(System.in);

    // Function to See Friends
    // Time Complexity - O(n^2)
    public void displayFriends() throws InterruptedException, IOException 
    {
        List<Account> friends = Login.currentLoginAccount.getFriends();

        Main.clearScreen();

        if (friends.isEmpty()) 
        {
            System.out.println("\n\n--------------------------------------");
            System.out.println("\n       You have no Friends, XD!!!");
            System.out.println("\n--------------------------------------");

            System.out.print("\n\nPress Enter and Return..... ");
            s.nextLine();

            Main.clearScreen();

            return;
        }

        System.out.println("\n\n------------------------------------------------------");
        System.out.println("\t\t  YOUR FRIENDS");
        System.out.println("------------------------------------------------------\n");

        for (Account a : Login.currentLoginAccount.getFriends()) 
        {
            if (a.getFriends() != null) 
            {
                for (Account b : a.getFriends()) 
                {
                    if (Login.currentLoginAccount.hashCode() == b.hashCode()) 
                    {
                        System.out.println("\t\t" + a.getName());
                        System.out.println("------------------------------------------------------");
                    }
                }
            } 
        }

        System.out.print("\n\n\nPress Enter and Return..... ");
        s.nextLine();

        Main.clearScreen();

    }
}