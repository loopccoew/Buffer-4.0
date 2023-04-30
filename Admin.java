package Travel;

import java.util.*;

public class Admin {
	String city55;
	String city2;
	String c1[];
	int num_city;
	City check_city1,Remov_city;
	User userinfo = new User();
	Graph busNetwork = new Graph(true,true,true,true,true,true,false);
	Scanner s = new Scanner(System.in);
	
	//Method for Admin login to check whether the entered password is correct or not
		String Checkpassword(String password) {
			Scanner scan=new Scanner(System.in);
			int exit=0;
			while(!password.equals("sam")){
				System.out.print("\nINCORRECT PASSWORD\nTO EXIT PRESS 1: ");
				exit=scan.nextInt();
				if(exit==1) {
					System.out.println("YOU HAVE EXIT SUCCESSFULLY!!");
					break;
				}
				else {
				System.out.print("\nPLEASE ENTER VALID PASSWORD: ");
				password = scan.next();
				}
			}
			return password;
		}
	public void AdminLogin() {
		int bc;
		int bd;
		int bt;
		int tc;
		int td;
		int tt;
		int choice = 0;
		System.out.println("\nAdmin is Loged in");
		do {
			System.out.println("\n***Enter the following choice***");
			System.out.println("0. Exit");
			System.out.println("1. Show booked trips");
			System.out.println("2. Add a city to your trip");
			System.out.println("3. Remove a city from planed trip");
			System.out.println("4. Show cities present");
			choice = s.nextInt();

			switch (choice) {
			case 0 :
				break;
			case 1:
				System.out.println("\nShowing the trips");
				userinfo.prevTrip();
				System.out.println("\nDo you want to know the path");
				System.out.println("1. yes / 2. No");
				int ch = s.nextInt();
				if (ch == 1) {
					userinfo.tripPath();
				} else {
					break;}
				break;
			case 2:
				System.out.println("\n**Adding city to trip**");
				System.out.print("\nEnter the City: ");
				city55 = s.next();
				City city55station = busNetwork.addCity(city55);
				System.out.println("\nEnter the number of routes you want to create");
				int n = s.nextInt();
				num_city = n;
				int i = 0;
				c1 = new String[50];
				while (n != 0) {
					System.out.println("\nEnter the nearest "+n+" cities");
					System.out.print("Enter " + (i+1) + " city : ");
					c1[i] = s.next();
				    check_city1 = userinfo.checkCity(c1[i]);
					if (userinfo.checkCity(c1[i]) != null) {
						System.out.println("\nFor city " + c1[i] + "\nEnter the Routes cost and time");
						System.out.print("\nBus cost: ");
						bc = s.nextInt();
						System.out.print("Bus distance: ");
						bd = s.nextInt();
						System.out.print("Bus time: ");
						bt = s.nextInt();
						System.out.print("train cost: ");
						tc = s.nextInt(); 
						System.out.print("train distance: ");
						td = s.nextInt();
						System.out.print("train time: ");
						tt = s.nextInt();
					} else {
						System.out.println("City not there. try for some other  5");
						break;
					}
					busNetwork.addRoutes(city55station, check_city1, bd, td, bc, tc, bt, tt);

					System.out.println("City is successfully added");
					i++;
					n--;
				}
				break;

			case 3:
				System.out.println("\nRemoving the city from planned trip");
				System.out.print("Enter the City to remove: ");
				city2 = s.next();
				for(int j=0;j<num_city;j++) {
				busNetwork.removeRoute(city2, c1[j]);
				}
				busNetwork.removeCity(city2);
				System.out.println("City Removed Sucessfully");
				break;
				
			case 4 :
				busNetwork.print();
				break;
			
			case 5:
				userinfo.userLogin();
				break;

			default:
				System.out.println("Invalid Entry");
			}

		} while (choice != 0);
		System.out.println("Exit Sucessfully");
	}
}