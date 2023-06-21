package socialnetwork;

import java.io.IOException;
import java.util.*;

// Login class
class Login 
{
    // Create Current Login Account
    public static Account currentLoginAccount = null;

    Scanner sc = new Scanner(System.in);

    Scanner s = new Scanner(System.in);

    // Function to Login
    public void login() throws IOException, InterruptedException 
    {
        Main.clearScreen();

        // Object of FindAccount Class
        FindAccount obj1 = new FindAccount();
        
        // Object of ShowFriends Class
        DisplayFriends obj3 = new DisplayFriends();

        // Object of SearchProfile Class
        SearchAcc obj6 = new SearchAcc();

        // Object of YourProfile Class
        MyProfile obj7 = new MyProfile();

        String userName, password;

        System.out.println("\n\n---------------------------------");
        System.out.println("\t    LOGIN");
        System.out.println("---------------------------------\n");
        System.out.print(" Username: ");
        userName = sc.next();

        System.out.print("\n Password: ");
        password = sc.next();
        System.out.println("\n---------------------------------");

        System.out.print("\n\n Press Enter to Login..... ");
        s.nextLine();

        // Find Current Login Account
        currentLoginAccount = obj1.findAccount(userName, password);

        if (currentLoginAccount == null) 
        {
            Main.clearScreen();

            System.out.println("\n\n----------------------");
            System.out.println("\n     Login failed!");
            System.out.println("\n----------------------");

            System.out.println("\n\n Check Your Username Or Password Again!");
           
            System.out.print("\n\n Press Enter and Return to the HOME PAGE..... ");
            s.nextLine();

            Main.clearScreen();

            return;
        }

        Main.clearScreen();

        System.out.println("\n\n--------------------------");
        System.out.println("\n Logged In Successfully!!");
        System.out.println("\n--------------------------");

        System.out.print("\n\n Press Enter to Continue..... ");
        s.nextLine();

        Main.clearScreen();

        int choice;

        do {
            System.out.println("\n\n---------------------------------------------------------------");
            System.out.println("\t\t  What's on your mind?");
            System.out.println("---------------------------------------------------------------");

            System.out.println("\n\t1. See My Profile");

            System.out.println("\n\t2. Show Friend List");

            System.out.println("\n\t3. Search");

            System.out.println("\n\t4. Logout");

            System.out.println("\n----------------------------------------------------------------");

            System.out.print("\n Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                	// Your Profile
                    obj7.myProfile();

                    break;

                case 2:
                    // Show Friend List
                    obj3.displayFriends();

                    break;

                case 3:
                	// Search Profile
                    obj6.searchAcc();

                    break;

                case 4:
                    // Logout
                    System.out.print("\n\n\n Press Enter to Logout..... ");
                    s.nextLine();

                    Main.clearScreen();

                    currentLoginAccount = null;

                    System.out.println("\n\n---------------------------");
                    System.out.println("\n Logged Out Successfully!!");
                    System.out.println("\n---------------------------");

                    System.out.print("\n\n\n Press Enter and Return to the HOME PAGE..... ");
                    s.nextLine();
                    
                    break;

                default:
                    System.out.println("INVALID CHOICE, TRY AGAIN!!!");
            }
        } while (choice != 4);
    }
}