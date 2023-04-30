package socialnetwork;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;


class CreateAccount 
{
    Scanner sc = new Scanner(System.in);
    Scanner s = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Create list of newly added accounts
    public static List<Account> accounts = new ArrayList<>(); 

    // Create single account
    public Account account = null;

    // Function to Create Account
    // Time Complexity - O(n)
    
    public void createAccount() throws IOException, InterruptedException 
    {
        System.out.println("\n===========================================");
        System.out.println("\t\t SIGN UP");
        System.out.println("===========================================");

        // Local Variables
        String fname;
        String lname;
        String mob;
        String email;
        String userName;
        String password1;
        String password2;
        String dob;
        String bio = "NA";
        char gender = 'O';

        // Input First Name
        System.out.print("\n First Name: ");
        fname = br.readLine();

        // Input Last Name
        System.out.print("\n Last Name: ");
        lname = br.readLine();


            System.out.print("\n Mobile Number: ");
            mob = sc.next();

            System.out.print("\n Email ID: ");
            email = sc.next();

        System.out.println("\n-------------------------------------------");

            System.out.print("\n Username: ");
            userName = sc.next();



        // Input New Password
        do
        {
            System.out.print("\n New Password: ");
            password1 = sc.next();

            System.out.print("\n Confirm Password: ");
            password2 = sc.next();

            // Check if New password and Confirmed password matches or not
            if(!password1.equals(password2))
            {
                System.out.println("\n Password Does Not Match! Enter Again!");
            }
        
        } while(!password1.equals(password2));

        System.out.println("\n-------------------------------------------");
        
        
        // Regex to check valid DOB
        String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";

        // Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        Matcher m;

        // Input DOB and check if it is valid or not
        boolean bool;
        do {
            System.out.print("\n Date of Birth(MM/DD/YYYY): ");
            dob = sc.next();

            m = pattern.matcher(dob);
            bool = m.matches();

            if (!bool)
                System.err.println("\n Invalid Date of Birth! Enter Again!");
        } while (!bool);

        System.out.println("\n-------------------------------------------");

        // Input Gender
        int ch;
        do {
            System.out.println("\n 1. Male\n 2. Female\n 3. Other");

            System.out.print("\n Select Gender: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    gender = 'M';
                    break;

                case 2:
                    gender = 'F';
                    break;

                case 3:
                    gender = 'O';
                    break;

                default:
                    System.out.println("\n Invalid Selection! Select Again!");
            }
        } while (ch != 1 && ch != 2 && ch != 3);

        System.out.println("\n-------------------------------------------");
        
        // Input Bio
        int b = 0;
        System.out.println("\n Do you want to add a Bio? 1:YES 0:NO");
        System.out.print(" Enter Here: ");
        b = sc.nextInt();
        if(b==1) {
        	System.out.print("\n Bio: ");
            bio = br.readLine();
        }
        
        System.out.println("\n-------------------------------------------");

        System.out.print("\n\n Press Enter to Continue..... ");

        s.nextLine();

        Main.clearScreen();

        // Create Account
        account = new Account(fname, lname, mob, email, userName, password1, dob, gender, bio);

        // Add account in the list
        accounts.add(account);

        Main.clearScreen(); // Clear Screen

        System.out.println("\n\n\n-------------------------------------------\n");
        System.out.println("           SIGN UP COMPLETED!!!\n");
        System.out.println("-------------------------------------------");

        System.out.print("\n\n\n Press Enter to Continue..... ");

        s.nextLine();

        Main.clearScreen(); // Clear Screen

        // Show Created Account Information
        System.out.println("\n\n\n-------------------------------------------\n");
        System.out.println("       Account Created Successfully!\n");
        System.out.println("-------------------------------------------");

        System.out.println("\n" + account.toString());

        System.out.println("\n-------------------------------------------");

        System.out.print("\n\n\n Press Enter and Return to the HOME PAGE..... ");

        s.nextLine();
    }
}


