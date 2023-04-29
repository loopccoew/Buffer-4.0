import java.util.Scanner;

public class Login {
    Login(){
        Scanner input = new Scanner(System.in);
        String username = "myusername";
        String password = "mypassword";
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter your username: ");
            String enteredUsername = input.nextLine();

            System.out.print("Enter your password: ");
            String enteredPassword = input.nextLine();

            if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                loggedIn = true;
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("What would you like to do?");
            System.out.println("1. Change username");
            System.out.println("2. Change password");
            System.out.println("3. Exit");

            int choice = input.nextInt();
            input.nextLine(); // clear the input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter new username: ");
                    String newUsername = input.nextLine();
                    username = newUsername;
                    System.out.println("Username changed to " + username);
                    break;
                case 2:
                    System.out.println("Forgot password? Enter new password: ");
                    String newPassword = input.nextLine();
                    password = newPassword;
                    System.out.println("Password changed.");
                    break;
                case 3:
                    System.out.println("------------------------------------------------------------------");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
