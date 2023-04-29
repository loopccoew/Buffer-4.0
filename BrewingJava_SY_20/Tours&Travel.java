//JET-SET-JOURNEYS- BY TEAM BREWINGJAVA
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
class Booking1 
{
	//bookingQueue1:tour
	//bookingQueue2:travel
	String tourDestination;
	double budgetAllocation;
	double mem;
	Booking1(String name, String mail, String tourDestination, double budgetAllocation, double mem)
	{
		this.tourDestination = tourDestination;
		this.budgetAllocation = budgetAllocation;
		this.mem = mem;
		this.name=name;
		this.email=mail;
	}
	String name;
	int age;
	double price1;
	String email;

	Booking1(String name, int age, String email, double price1) 
	{
		this.name = name;
		this.age = age;
		this.email = email;
		this.price1 = price1;
	}
	public String toString() 
	{
		return "\nName: " + name + "\nAge: " + age + "\nEmail:" + email
				+ "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n\nTotal amount to be paid :" + price1
				+ "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
	}
}

class BST1
{
	Node root, result;
	static final int Total_vertex = 6;
	Queue<Booking1> bookingQueue1 = new LinkedList<>();
	Queue<Booking1> bookingQueue2 = new LinkedList<>();

	static class Node 
	{
		int value;
		Node left, right;
		String str;

		Node(int value) 
		{
			this.value = value;
			left = right = null;
		}

		Node(String str) 
		{
			this.str = str;
			left = right = null;
		}

	}

	public void add(int value)
	{
		root = insert(root, value);
	}

	private Node insert(Node node, int value) 
	{
		if (node == null)
		{
			node = new Node(value);
		} else if (value < node.value) 
		{
			node.left = insert(node.left, value);
		} else if (value > node.value) 
		{
			node.right = insert(node.right, value);
		}
		return node;
	}

	public boolean search(Node node, double value)
	{
		if (node == null) 
		{
			return false;
		}
		else if (value == node.value) 
		{
			System.out.println("Tour available at the specified amount: " + node.value);
			return true;
		} 
		else if (value < node.value)
		{
			return search(node.left, value);

		} 
		else if (value > node.value) 
		{
			return search(node.right, value);
		}
		return false;
	}

	public Node findSmaller(Node node, double value, Node prev) 
	{
		if (node == null)
		{
			return prev;
		}
		if (node.value == value)
		{
			return node;
		} else if (node.value < value) 
		{
			return findSmaller(node.right, value, node);
		} else {
			return findSmaller(node.left, value, prev);
		}
	}

	HashMap<String, String> hm = new HashMap<>();

	void signup() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username to create account: ");
		String username = sc.next();
		System.out.println("Enter password: ");
		String password = sc.next();

		// Hash the password
		String hashedPassword = hashPassword(password);
		// Store the username and hashed password in your database

		hm.put(username, hashedPassword);
		System.out.println("User signed up successfully!");
	}

	public static String hashPassword(String password) 
	{
		String hashedPassword = null;
		try 
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			// Add password bytes to digest
			md.update(password.getBytes());
			// Get the hash's bytes
			byte[] bytes = md.digest();
			// Convert the byte array into hexadecimal representation
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}

			// Assign the hashed password
			hashedPassword = sb.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hashedPassword;
	}
	boolean login(String user, String pass) {
		String newpass = hashPassword(pass);
		for (int i = 0; i < hm.size(); i++) {
			if (hm.containsKey(user)) {
				if (hm.get(user).equals(newpass)) {
					System.out.println("\nLogged in successfully!");
					return true;
				}
			}
		}
		return false;
	}

	void tour() {
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		// Create the ArrayList with the initial elements
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pune,Ladakh");
		list.add("Pune,Manali");
		list.add("Pune,Sikkim");
		double seats = 30;

		List<BST1> bstList = new ArrayList<>();

		// Creating BST for each location and adding root node with different values

		BST1 puneLadakh = new BST1();
		puneLadakh.add(41000);
		puneLadakh.add(20000);
		puneLadakh.add(45000);
		puneLadakh.add(10000);
		puneLadakh.add(21000);
		puneLadakh.add(40000);
		puneLadakh.add(50000);
		puneLadakh.add(8000);
		puneLadakh.add(12000);
		puneLadakh.add(15000);
		puneLadakh.add(25000);
		puneLadakh.add(35000);
		puneLadakh.add(42000);
		puneLadakh.add(48000);
		puneLadakh.add(55000);

		BST1 puneManali = new BST1();
		puneManali.add(48000);
		puneManali.add(30000);
		puneManali.add(50000);
		puneManali.add(25000);
		puneManali.add(35000);
		puneManali.add(45000);
		puneManali.add(55000);
		puneManali.add(20000);
		puneManali.add(28000);
		puneManali.add(32000);
		puneManali.add(40000);

		BST1 puneSikkim = new BST1();
		puneSikkim.add(39000);
		puneSikkim.add(32000);
		puneSikkim.add(40000);
		puneSikkim.add(25000);
		puneSikkim.add(35000);
		puneSikkim.add(38000);
		puneSikkim.add(45000);

		// Adding all BSTs to the list
		bstList.add(puneLadakh);
		bstList.add(puneManali);
		bstList.add(puneSikkim);
		do {

			System.out.println("Please choose your preferred tour destination :");
			System.out.println("1.Pune To Ladakh\n2.Pune to Manali\n3.Pune to Sikkim");
			int ch = sc.nextInt();
			System.out.println("Kindly specify the budget allocation per person for the tour");
			double amt = sc.nextDouble();
			System.out.println("Enter no of members: ");
			int mem = sc.nextInt();
			double total_amt = 0;
			switch (ch) {

			case 1:
				if (puneLadakh.search(puneLadakh.root, amt)) {
					System.out.println("Tour with this package is Available..");
					System.out.println("Would you like to go with this package?: " + amt);
					System.out.println("Enter 1 to continue to 0 to stop!");
					int choice = sc.nextInt();
					if (choice == 1) {
						if (mem <= seats) {
							System.out.print("\nEnter Name: ");
							String name = sc.next();
							System.out.print("Enter Age: ");
							int age = sc.nextInt();
							System.out.println("Enter EMail: ");
							String email = sc.next();

							total_amt = mem * amt;
							bookingQueue1.add(new Booking1(name, email, "Pune to Ladakh", total_amt, mem));
							
							System.out.println("Booking");
							System.out.println("**************************************************\n");
							System.out.println("Tour :Pune to Ladakh");
							System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email);
							System.out.println("Package for one person: " + amt);
							System.out.println("No of members: " + mem);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Total amount to be paid: " + total_amt);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
							int mode = sc.nextInt();
							 System.out.println("\nBooking Successful!");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							payment(name, age, mem, total_amt);
							seats = seats - mem;

						} else {
							System.out.println("Seats not availble!");
							System.out.println("Seats available: " + seats);
						}
					} else {
						System.out.println("THANK YOU YOU MAY SEARCH FOR OTHER TOUR.");
					}

				} else if (!puneLadakh.search(puneLadakh.root, amt)) {

					BST1.Node smallerNode = puneLadakh.findSmaller(puneLadakh.root, amt, null);
					System.out.println("Tour with this package is unavailable..");
					System.out.println("Would you like to go with this package?: " + smallerNode.value);
					System.out.println("Enter 1 to continue ot 0 to stop!");
					int choice = sc.nextInt();
					if (choice == 1) {

						if (smallerNode != null) {
							if (mem <= seats) {
								System.out.print("\nEnter Name: ");
								String name = sc.next();
								System.out.print("Enter Age: ");
								int age = sc.nextInt();
								System.out.println("Enter EMail: ");
								String email = sc.next();
								bookingQueue1.offer(new Booking1(name, email, "Pune to Ladakh", smallerNode.value, mem));
								total_amt = mem * smallerNode.value;
								seats = seats - mem;
								System.out.println("Bookings in the queue:");

								System.out.println("Tour :Pune to Ladakh");
								System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email);
								System.out.println("Package for one person: " + smallerNode.value);
								System.out.println("No of members: " + mem);
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("Total amount to be paid: " + total_amt);
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
								int mode = sc.nextInt();
								System.out.println("\nBooking Successful!");
								payment(name, age, mem, total_amt);

							} 
							else {
								System.out.println("Seats not availble!");
								System.out.println("Seats available: " + seats);
							}
						}
					}
					else 
					{
						System.out.println("THANK YOU YOU MAY SEARCH FOR OTHER TOUR.");
					}
				}
				break;
			case 2:
				if (puneManali.search(puneManali.root, amt)) {
					System.out.println("Tour with this package is Available..");
					System.out.println("Would you like to go with this package?: " + amt);
					System.out.println("Enter 1 to continue to 0 to stop!");
					int choice = sc.nextInt();
					if (choice == 1) {

						if (mem <= seats) {
							System.out.print("\nEnter Name: ");
							String name = sc.next();
							System.out.print("Enter Age: ");
							int age = sc.nextInt();
							System.out.println("Enter EMail: ");
							String email = sc.next();
							bookingQueue1.add(new Booking1(name, email, "Pune to Manali", amt, mem));

							total_amt = mem * amt;

							System.out.println("Bookings in the queue:");
							System.out.println("Tour: Pune to Manali ");
							System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email);
							System.out.println("Package for one person: " + amt);
							System.out.println("No of members: " + mem);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Total amount to be paid: " + total_amt);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
							int mode = sc.nextInt();
                            System.out.println("\nBooking Successful!");
							payment(name, age, mem, total_amt);
							seats = seats - mem;

						} 
						else 
						{
							System.out.println("Seats not availble!");
							System.out.println("Seats available: " + seats);

						}
					} 
					else 
					{
						System.out.println("THANK YOU YOU MAY SEARCH FOR OTHER TOUR.");
					}

				} 
				else if (!puneManali.search(puneManali.root, amt)) 
				{

					BST1.Node smallerNode = puneLadakh.findSmaller(puneManali.root, amt, null);
					System.out.println("Tour with this package is unavailable..");
					System.out.println("Would you like to go with this package?: " + smallerNode.value);
					System.out.println("Enter 1 to continue ot 0 to stop!");
					int choice = sc.nextInt();
					if (choice == 1) {

						if (smallerNode != null) {
							if (mem <= seats) {
								System.out.print("\nEnter Name: ");
								String name = sc.next();
								System.out.print("Enter Age: ");
								int age = sc.nextInt();
								System.out.println("Enter EMail: ");
								String email = sc.next();
								bookingQueue1.offer(new Booking1(name, email, "Pune to Manali", smallerNode.value, mem));
								total_amt = mem * smallerNode.value;
								seats = seats - mem;
								System.out.println("Bookings in the queue:");

								System.out.println("Tour :Pune to Manali");
								System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email);
								System.out.println("Package for one person: " + smallerNode.value);
								System.out.println("No of members: " + mem);
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("Total amount to be paid: " + total_amt);
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
								int mode = sc.nextInt();
								System.out.println("\nBooking Successful!");
								payment(name, age, mem, total_amt);

							} 
							else 
							{
								System.out.println("Seats not availble!");
								System.out.println("Seats available: " + seats);
							}
						}
					} 
					else 
					{
						System.out.println("THANK YOU YOU MAY SEARCH FOR OTHER TOUR.");
					}
				}
				break;
			case 3:
				if (puneSikkim.search(puneSikkim.root, amt)) {
					System.out.println("Tour with this package is Available..");
					System.out.println("Would you like to go with this package?: " + amt);
					System.out.println("Enter 1 to continue ot 0 to stop!");
					int choice = sc.nextInt();
					if (choice == 1) {

						if (mem <= seats) {
							System.out.print("\nEnter Name: ");
							String name = sc.next();
							System.out.print("Enter Age: ");
							int age = sc.nextInt();
							System.out.println("Enter EMail: ");
							String email = sc.next();
							bookingQueue1.add(new Booking1(name, email, "Pune to Sikkim", amt, mem));

							total_amt = mem * amt;

							System.out.println("Tour: Pune to Sikkim ");
							System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email);
							System.out.println("Package for one person: " + amt);
							System.out.println("No of members: " + mem);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Total amount to be paid: " + total_amt);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
							int mode = sc.nextInt();
                            System.out.println("\nBooking Successful!");
							payment(name, age, mem, total_amt);
							seats = seats - mem;

						} else {
							System.out.println("Seats not availble!");
							System.out.println("Seats available: " + seats);

						}
					} else {
						System.out.println("THANK YOU YOU MAY SEARCH FOR OTHER TOUR.");
					}

				} else if (!puneSikkim.search(puneSikkim.root, amt)) {

					BST1.Node smallerNode = puneSikkim.findSmaller(puneSikkim.root, amt, null);
					System.out.println("Tour with this package is unavailable..");
					System.out.println("Would you like to go with this package?: " + smallerNode.value);
					System.out.println("Enter 1 to continue ot 0 to stop!");
					int choice = sc.nextInt();
					if (choice == 1) {

						if (smallerNode != null) {
							if (mem <= seats) {
								System.out.print("\nEnter Name: ");
								String name = sc.next();
								System.out.print("Enter Age: ");
								int age = sc.nextInt();
								System.out.println("Enter EMail: ");
								String email = sc.next();
								bookingQueue1.offer(new Booking1(name, email, "Pune to Sikkim", smallerNode.value, mem));
								total_amt = mem * smallerNode.value;
								seats = seats - mem;
								System.out.println("Tour: Pune to Sikkim ");
								System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email);
								System.out.println("Package for one person: " + amt);
								System.out.println("No of members: " + mem);
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("Total amount to be paid: " + total_amt);
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
								int mode = sc.nextInt();
								System.out.println("\nBooking Successful!");
								payment(name, age, mem, total_amt);

							} else {
								System.out.println("Seats not availble!");
								System.out.println("Seats available: " + seats);

							}

						}

					} else {
						System.out.println("THANK YOU YOU MAY SEARCH FOR OTHER TOUR.");
					}

				}
				break;

			case 4:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Enter appropriate choice!!");
				break;
			}
			System.out.println("Do you want to continue??");
			System.out.println("Enter 1 to continue or 0 to stop..");
			opt = sc.nextInt();

		} while (opt == 1);
	}

	public int Min_Dist(int distance[], Boolean P[]) {
		int m = Integer.MAX_VALUE;
		int m_index = 0;
		for (int i = 0; i < Total_vertex; i++) {
			if (P[i] == false && distance[i] <= m) {
				m = distance[i];
				m_index = i;
			}
		}
		return m_index;
	}

	public void Display(int distance[], int n, int ch)
	{
		Scanner sc = new Scanner(System.in);
		{
			switch (ch) {
			case 1:
				System.out.println("The shortest distance from Pune to Kolhapur is :" + distance[5] + " km");
				break;
			case 2:
				System.out.println("The shortest distance from Pune to Satara is :" + distance[1] + " km");
				break;
			case 3:
				System.out.println("The shortest distance from Pune to Nagpur is :" + distance[2] + " km");
				break;

			case 4:
				System.out.println("The shortest distance from Pune to Nashik is :" + distance[3] + " km");
				break;
			case 5:
				System.out.println("The shortest distance from Pune to Mumbai(CST) is :" + distance[4] + " km");
				break;
			}
		}
	}

	public void Dijiktras(int ch1) 
	{
		int s = 0;
		int graph[][] = new int[][] { { -1, 173, -1, -1, 242, -1, 101 }, { 215, -1, 784, -1, -1, 311 },
				{ -1, 345, -1, 386, -1, 178 }, { 203, -1, 450, -1, 173, 198 }, { -1, 713, -1, 530, -1, 25 },
				{ 405, -1, 215, -1, -1, -1 },

		};
		int distance[] = new int[Total_vertex];
		Boolean P[] = new Boolean[Total_vertex];
		for (int i = 0; i < Total_vertex; i++) {
			distance[i] = Integer.MAX_VALUE;
			P[i] = false; // non visited vertex
		}
		distance[s] = 0; // distance from source to itself is zero
		for (int j = 0; j < Total_vertex - 1; j++) {
			int u = Min_Dist(distance, P);
			P[u] = true; // now the node is visited
			for (int v = 0; v < Total_vertex; v++) {
				if (!P[v] && graph[u][v] != -1 && distance[u] != Integer.MAX_VALUE
						&& distance[u] + graph[u][v] < distance[v]) {
					distance[v] = distance[u] + graph[u][v];
				}
			}

		}
		Display(distance, Total_vertex, ch1);
	}

	void travel() {
		Scanner sc = new Scanner(System.in);
		double price1 = 0;
		int members, capacity1 = 30, capacity2 = 30, capacity3 = 30;
		int capacity = 30;
		System.out.println("****************Shortest distance******************");

		System.out.println("Please choose your preferred travel destination");
		System.out.println(
				"1. Pune to Kolhapur \n2. Pune to Satara \n3. Pune to Nagpur \n4. Pune to Nashik \n5. Pune to Mumbai(CST)");
		System.out.println("\nEnter your choice:");
		int ch = sc.nextInt();
		Dijiktras(ch);
		if (ch == 1) {
			price1 = 400;
		}
		if (ch == 2) {
			price1 = 1000;
		}
		if (ch == 3) {
			price1 = 800;
		}
		if (ch == 4) {
			price1 = 300;
		}

		switch (ch) {
		case 1:
			System.out.println("\nEnter Mode of Transport:");
			System.out.println("1. Bus \n2. Train \n3. Aeroplane");
			int ch1 = sc.nextInt();
			System.out.println("How many members: ");
			members = sc.nextInt();
			switch (ch1) {
			case 1:

				capacity1 = capacity1 - members;

				if (capacity1 > capacity || capacity1 < 0) 
				{
					System.out.println("\nSorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')
					{
						System.out.print("\nEnter Name: ");
						String name = sc.next();
						System.out.print("Enter Age: ");
						int age = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking = new Booking1(name, age, email, (members * price1));
						bookingQueue2.add(booking);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("\nBooking Successful!");
						System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name, age, members, price1);
					} 
					else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");
				}
				break;

			case 2:

				capacity2 = capacity2 - members;

				if (capacity2 > capacity || capacity2 < 0) {
					System.out.println("\nSorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')

					{
						System.out.print("\nEnter Name: ");
						String name1 = sc.next();
						System.out.print("Enter Age: ");
						int age1 = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking1 = new Booking1(name1, age1, email, (members * (price1 + 1500)));
						bookingQueue2.add(booking1);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("\nBooking Successful!");
						System.out.println("\nName: " + name1 + "\nAge: " + age1 + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name1, age1, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");
				}
				break;

			case 3:

				capacity3 = capacity3 - members;

				if (capacity3 > capacity || capacity3 < 0) {
					System.out.println("\nSorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')
					{
						System.out.print("\nEnter name: ");
						String name2 = sc.next();
						System.out.print("Enter Age: ");
						int age2 = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking2 = new Booking1(name2, age2, email, (members * (price1 - 200)));
						bookingQueue2.add(booking2);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("\nBooking Successful!");
						System.out.println("\nName: " + name2 + "\nAge: " + age2 + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name2, age2, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");

				}
				break;

			default:
				System.out.println("Enter valid choice");

			}
			break;

		case 2:
			System.out.println("\nEnter Mode of Transport:");
			System.out.println("1. Bus \n2. Train \n3. Aeroplane");
			int ch2 = sc.nextInt();
			System.out.println("How many members: ");
			members = sc.nextInt();
			switch (ch2) {
			case 1:

				capacity1 = capacity1 - members;

				if (capacity1 > capacity || capacity1 < 0) {
					System.out.println("\nSorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')

					{
						System.out.print("\nEnter Name: ");
						String name = sc.next();
						System.out.print("Enter Age: ");
						int age = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking = new Booking1(name, age, email, (members * price1));
						bookingQueue2.add(booking);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("\nBooking Successful!");
						System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name, age, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");

				}
				break;
			case 2:

				capacity2 = capacity2 - members;

				if (capacity2 > capacity || capacity2 < 0) {
					System.out.println("\nSorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')

					{
						System.out.print("\nEnter Name: ");
						String name1 = sc.next();
						System.out.print("Enter Age: ");
						int age1 = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking1 = new Booking1(name1, age1, email, (members * (price1 + 1500)));
						bookingQueue2.add(booking1);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("\nBooking Successful!");
						System.out.println("\nName: " + name1 + "\nAge: " + age1 + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name1, age1, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");

				}
				break;

			case 3:

				capacity3 = capacity3 - members;

				if (capacity3 > capacity || capacity3 < 0) {
					System.out.println("\nSorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')

					{
						System.out.print("\nEnter Name: ");
						String name2 = sc.next();
						System.out.print("Enter Age: ");
						int age2 = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking2 = new Booking1(name2, age2, email, (members * (price1 - 200)));
						bookingQueue2.add(booking2);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("\nBooking Successful!");
						System.out.println("\nName: " + name2 + "\nAge: " + age2 + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name2, age2, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");

				}
				break;

			default:
				System.out.println("Please Enter valid choice!");
			}
			break;
		case 3:
			System.out.println("\nEnter Mode of Transport:");
			System.out.println("1. Bus \n2. Train \n3. Aeroplane");
			int ch3 = sc.nextInt();
			System.out.println("How many members: ");
			members = sc.nextInt();
			switch (ch3) {
			case 1:
				capacity1 = capacity1 - members;
				if (capacity1 > capacity || capacity1 < 0) {
					System.out.println("\nSorry limited seats available!!");
				} else {
					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')

					{
						System.out.print("\nEnter name: ");
						String name = sc.next();
						System.out.print("Enter Age: ");
						int age = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking = new Booking1(name, age, email, (members * price1));
						bookingQueue2.add(booking);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("\nBooking Successful!");
						System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name, age, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");

				}
				break;

			case 2:
				capacity2 = capacity2 - members;
				if (capacity2 > capacity || capacity2 < 0) {
					System.out.println("\nSorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')

					{
						System.out.print("\nEnter Name: ");
						String name1 = sc.next();
						System.out.print("Enter Age: ");
						int age1 = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking1 = new Booking1(name1, age1, email, (members * (price1 + 1500)));
						bookingQueue2.add(booking1);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("Booking Successful!");
						System.out.println("\nName: " + name1 + "\nPhone number: " + age1 + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name1, age1, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");
				}
				break;

			case 3:
				capacity3 = capacity3 - members;
				if (capacity3 > capacity || capacity3 < 0) {
					System.out.println("Sorry limited seats available!!");
				} else {
					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')
					{
						System.out.print("Enter Name: ");
						String name2 = sc.next();
						System.out.print("Enter Age: ");
						int age2 = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking2 = new Booking1(name2, age2, email, (members * (price1 - 200)));
						bookingQueue2.add(booking2);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("\nName: " + name2 + "\nAge: " + age2 + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name2, age2, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");
				}
				break;
			default:
				System.out.println("Enter valid choice!");
			}
			break;

		case 4:
			System.out.println("\nEnter Mode of Transport:");
			System.out.println("1. Bus\n2. Train \n3. Aeroplane");
			int ch4 = sc.nextInt();
			System.out.println("How many members: ");
			members = sc.nextInt();
			switch (ch4) {
			case 1:// bus

				capacity1 = capacity1 - members;
				if (capacity1 > capacity || capacity1 < 0) {
					System.out.println("Sorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')

					{
						System.out.print("\nEnter name: ");
						String name = sc.next();
						System.out.print("Enter Age: ");
						int age = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking = new Booking1(name, age, email, (members * price1));
						bookingQueue2.add(booking);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("\nBooking Successful!");
						System.out.println("\nName: " + name + "\nAge: " + age + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name, age, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");

				}
				break;

			case 2: // train
				capacity2 = capacity2 - members;

				if (capacity2 > capacity || capacity2 < 0) {
					System.out.println("\nSorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')
					{
						System.out.print("\nEnter Name: ");
						String name1 = sc.next();
						System.out.print("Enter Age: ");
						int age1 = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking1 = new Booking1(name1, age1, email, (members * (price1 + 1500)));
						bookingQueue2.add(booking1);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						System.out.println("Booking Successful!");
						System.out.println("\nName: " + name1 + "\nAge: " + age1 + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name1, age1, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");

				}
				break;

			case 3:// plane

				capacity3 = capacity3 - members;

				if (capacity3 > capacity || capacity3 < 0) {
					System.out.println("\nSorry limited seats available!!");
				} else {

					System.out.println("Do you want to book tickets for your journey? Enter Y to book or N to stop ");
					char book = sc.next().charAt(0);
					if (book == 'Y' || book=='y')
					{
						System.out.print("\nEnter Name: ");
						String name2 = sc.next();
						System.out.print("Enter Phone number: ");
						int age2 = sc.nextInt();
						System.out.println("Enter EMail: ");
						String email = sc.next();
						Booking1 booking2 = new Booking1(name2, age2, email, (members * (price1 - 200)));
						bookingQueue2.add(booking2);
						System.out.println("Enter mode of payment:\n1.Gpay\n2.PhonePe\n3.Paytm\n4.Net Banking\n5.Credit Card");
						int mode = sc.nextInt();
						Random random = new Random();
				        long randomNumber = random.nextLong() % 1000000000000L; // generate a random long and ensure it has 12 digits
				        if (randomNumber < 0) {
				            randomNumber = -randomNumber;
				        }
				        System.out.println("Transaction ID : "+randomNumber);
						System.out.println("\nBooking Successful!");
						System.out.println("\nName: " + name2 + "\nAge: " + age2 + "\nEmail:" + email
								+ "\n\nTotal amount to be paid :" + price1);
						payment(name2, age2, members, price1);
					} else
						System.out.println("THANK YOU! YOU MAY SEARCH FOR OTHER TRAVEL LOCATION.");
				}
				break;

			default:
				System.out.println("\nPlease Enter valid choice!");
			}
			break;

		default:
			System.out.println("\nPlease Enter valid choice!");
		}
	}

	void payment(String name, int age, int members, double price1) {
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\t\t GET YOUR RECEIPT HERE");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		long tripno = 92233720;
		long tno = 44897565;
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\t\tTRIP INFORMATION");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\nTRIP NUMBER:" + (tripno));
		System.out.println("TICKET NUMBER:" + (tno));
		calender();
		System.out.println("Departure time from Starting Point:10:30 Hrs");
		System.out.println("No. of seats: " + members);
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\t\tPASSENGERS INFORMATION");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Seat Status: Confirmed");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\t\tTOTAL FARE DETAILS");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Total Amount to be paid(Including GST): " + price1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Random random = new Random();
        long randomNumber = random.nextLong() % 1000000000000L; // generate a random long and ensure it has 12 digits
        if (randomNumber < 0) {
            randomNumber = -randomNumber;
        }
        System.out.println("Transaction ID : "+randomNumber);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		tripno++;
		tno++;

	}
	void cancel(Queue<Booking1> q,String name, String mail)
	{
		boolean found = false;
		Queue<Booking1> tempQueue = new LinkedList<>();// to add polled value temporary
		while (!q.isEmpty()) {
			// Dequeue an element from the original queue
			Booking1 item = q.poll();
			// Check if the dequeued element is the one we want to remove
			if ((item.name).equals(name))
			{
				found = true;
				System.out.println("Booking cancelled successfully!\nPayment will be refunded shortly!");
				break;
			} 
			else 
			{
				// If not, enqueue it to a temporary queue
				tempQueue.add(item);
			}
		}
		if (found)
		{
			// Move the remaining elements back to the original queue
			q.addAll(tempQueue);

		} else {
			// If the element was not found, restore the original queue
			q.addAll(tempQueue);
		}
	}
void calender()
{
	String months[] = 
		{
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        System.out.println("Booking Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("Booking Time: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));	
}
}
public class trial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		BST1 b = new BST1();
		System.out.println("\n~~~~~~~~~~~~ WELCOME TO JetSetJourneys ~~~~~~~~~~~~~~~");
		int option = 0;
		System.out.println("\nEnter username: ");
		String user = sc.next();
		System.out.println("Enter Password: ");
		String pass = sc.next();
		if (b.login(user, pass)) 
		{
			System.out.println("\nLogin Successful!");
			do 
			{

				System.out.println("1.Tour ");
				System.out.println("2.Travel");
				System.out.println("Explore: ");
				int explore = sc.nextInt();
				switch (explore) {
				case 1:
					b.tour();
					break;

				case 2:
					b.travel();
					break;

				case 3:
					System.out.println("Enter name: ");
					String name = sc.next();
					System.out.println("Enter email: ");
					String mail = sc.next();
					b.cancel(b.bookingQueue1,name, mail);

				case 4:
					System.out.println("Enter name: ");
					String name2 = sc.next();
					System.out.println("Enter email: ");
					String mail2 = sc.next();
					b.cancel(b.bookingQueue1,name2, mail2);
					break;
					
				default:
					System.out.println("Invalid choice!");
					break;
				}
				System.out.println("\nEnter 1 for MAINMENU or 0 to logout");
				option = sc.nextInt();
				if(option==0)
				{
					System.out.println("Logged out successfully..!");
				}
			} 
			while (option == 1);
		}
		else 
		{
			System.out.println("\nAccount does not exist.Create account!");
			b.signup();
			System.out.println("Account created successfully!!");
			while(true) {
			System.out.println("Re-enter username to login: ");
			String newuser = sc.next();
			System.out.println("Re-enter Password to login: ");
			String newpass = sc.next();
			if (b.login(newuser, newpass)) 
			{
				do 
				{
					System.out.println("Would you like to take a guided tour or travel independently?");
					System.out.println("\n**** MAIN MENU ****");
					System.out.println("1.Tour ");
					System.out.println("2.Travel");
					System.out.println("3.Cancel travel");
					System.out.println("4.Cancel tour");
					System.out.println("Explore: ");
					int explore = sc.nextInt();
					switch (explore) {
					case 1:
						b.tour();
						break;

					case 2:
						b.travel();
						break;

					case 3:
						System.out.println("Enter name: ");
						String name = sc.next();
						System.out.println("Enter email: ");
						String mail = sc.next();
						b.cancel(b.bookingQueue2,name, mail);
						break;

					case 4:
						System.out.println("Enter name: ");
						String name2 = sc.next();
						System.out.println("Enter email: ");
						String mail2 = sc.next();
						b.cancel(b.bookingQueue1,name2, mail2);
						break;
					default:
						System.out.println("Invalid choice!");
						break;
					}
					System.out.println("\nWould you like to go the MAINMENU??");
					System.out.println("Enter 1 to continue or 0 to stop..");
					option = sc.nextInt();
				} 
				while (option == 1);
				System.out.println("\nTHANK YOU VISIT AGAIN :)");
				break;
			} 
			else 
			{
				System.out.println("Invalid username or password!");
			}
		  }
		}
	}
}







