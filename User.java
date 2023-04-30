package Travel;

import java.util.*;

class Trip{
	String date[];
	String name[];
	int age[];
	String gender[];
	long phNo[];
	//Linked List to store shortest route of booked trip	
	String storedTrip[];
	//LinkedList inside LLtrip to store shortest routes of booked trips
	int n;

	Trip(String date[],String name[],int age[],String gender[],long phNo[],String storedTrip[]){
		this.date = date;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phNo = phNo;
		this.storedTrip = storedTrip;
	}
}

public class User {
	int num;//no.of passengers
	int j=0;
	int choice1;
	int y=0;
	String s1,s2;
	String Bank_Name;
	String CreditCard;
	static int routeType;
	String startLocation;
	String destination;
	String route;
	static City check_sLocation = null;
	static City check_destination = null;
	Scanner scn = new Scanner(System.in);
	Graph graph = new Graph(true,true,true,true,true,true,false);
	Dijikstra dj = new Dijikstra();
	Trip trip = new Trip(null,null,null,null,null,null);
	//Linked list to store previous Trip info with data type of class Trip
	//LinkedList to store all info of customer
	LinkedList<Trip> LLTrip = new LinkedList<Trip>(); 

	public void userLogin() {
		System.out.println("YOU ARE LOGGED IN AS USER");
		System.out.println("1.MAKE A TRIP");
		System.out.println("2.SHOW PREVIOUS TRIPS");
		System.out.print("\nENTER YOUR CHOICE: ");
		choice1 = scn.nextInt();

		switch(choice1) {
		case 1:
			makeTrip();
			tripPath();
			break;
		case 2:
			showTrip();
			break;
		}
	}

	public void makeTrip() {
		int choice;
		String check_route;
		System.out.print("\nENTER START LOCATION: ");
		s1 = scn.next();
		startLocation = s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase(); 
		check_sLocation=checkCity(startLocation);
		if(check_sLocation!=null) {
			System.out.print("\nENTER DESTINATION: ");
			s2 = scn.next();
			destination = s2.substring(0, 1).toUpperCase() + s2.substring(1).toLowerCase();  
			check_destination=checkDestination(destination);
			if(check_destination!=null) {
				System.out.print("\nENTER ROUTE (BUS/TRAIN): ");
				route = scn.next();

				if(route.equalsIgnoreCase("bus") ) {

					System.out.println("\nYOU HAVE BOOKED FOR "+route.toUpperCase()+"!!");
					//int routeType;
					System.out.println("ROUTETYPES: \n1 Shortest Distance \n2 Cheapest Cost  \n3 Least Time");
					routeType=scn.nextInt();
					if(routeType==1) {
						y=1;
					}
					else if(routeType==2) {
						y=2;
					}
					else if(routeType==3) {
						y=3;
					}
					while(routeType!=1&&routeType!=2&&routeType!=3) {
						System.out.println("YOU HAVE PROVIDED INVALID ROUTETYPE TO ENTER AGAIN PRESS 1 ELSE PRESS 0: ");
						int enter=scn.nextInt();
						if(enter==1) {
							System.out.print("ENTER VALID ROUTETYPE: ");
							routeType=scn.nextInt();
							if(routeType==1) {
								y=1;
							}
							else if(routeType==2) {
								y=2;
							}
							else if(routeType==3) {
								y=3;
							}
						}
						else {
							System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
							break;
						}
					}
				}
				else if(route.equalsIgnoreCase("train")) {
					System.out.println("\nYOU HAVE BOOKED FOR "+route.toUpperCase()+"!!");
					//int routeType;
					System.out.println("ROUTETYPES: \n1 Shortest Distance \n2 Cheapest Cost  \n3 Least Time");
					routeType=scn.nextInt();
					if(routeType!=1||routeType!=2||routeType!=3) {
						y=1;
					}
					if(routeType==1) {
						y=4;
					}
					else if(routeType==2) {
						y=5;
					}
					else if(routeType==3) {
						y=6;
					}
					while(routeType!=1&&routeType!=2&&routeType!=3) {
						System.out.println("YOU HAVE PROVIDED INVALID ROUTETYPE TO ENTER AGAIN PRESS 1 ELSE PRESS 0: ");
						int enter=scn.nextInt();
						if(enter==1) {
							System.out.print("ENTER VALID ROUTETYPE: ");
							routeType=scn.nextInt();
							if(routeType==1) {
								y=4;
							}
							else if(routeType==2) {
								y=5;
							}
							else if(routeType==3) {
								y=6;
							}
						}
						else {
							System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
							break;
						}
					}
				}
				while(!route.equalsIgnoreCase("bus") && !route.equalsIgnoreCase("train")) {		
					System.out.print("\nINVALID ROUTE SELECTED!!\nENTER VAILD ROUTE (BUS/TRAIN) OR TO EXIT TYPE EXIT: ");
					route = scn.next();
					if(route.equalsIgnoreCase("exit")) {
						System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
						break;
					}
					else if(route.equalsIgnoreCase("bus")) {
						System.out.println("\nYOU HAVE BOOKED FOR "+route.toUpperCase()+"!!");
						//int routeType;
						System.out.println("ROUTETYPES: \n1 Shortest Distance \n2 Cheapest Cost  \n3 Least Time");
						routeType=scn.nextInt();
						if(routeType==1) {
							y=1;
						}
						else if(routeType==2) {
							y=2;
						}
						else if(routeType==3) {
							y=3;
						}
						while(routeType!=1&&routeType!=2&&routeType!=3) {
							System.out.println("YOU HAVE PROVIDED INVALID ROUTETYPE TO ENTER AGAIN PRESS 1 ELSE PRESS 0: ");
							int enter=scn.nextInt();
							if(enter==1) {
								System.out.print("ENTER VALID ROUTETYPE: ");
								routeType=scn.nextInt();
								if(routeType==1) {
									y=1;
								}
								else if(routeType==2) {
									y=2;
								}
								else if(routeType==3) {
									y=3;
								}
							}
							else {
								System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
								break;
							}
						}
					}
					else if(route.equalsIgnoreCase("train")) {
						System.out.println("\nYOU HAVE BOOKED FOR "+route.toUpperCase()+"!!");
						//int routeType;
						System.out.println("ROUTETYPES: \n1 Shortest Distance \n2 Cheapest Cost  \n3 Least Time");
						routeType=scn.nextInt();
						if(routeType==1) {
							y=4;
						}
						else if(routeType==2) {
							y=5;
						}
						else if(routeType==3) {
							y=6;
						}
						while(routeType!=1&&routeType!=2&&routeType!=3) {
							System.out.println("YOU HAVE PROVIDED INVALID ROUTETYPE TO ENTER AGAIN PRESS 1 ELSE PRESS 0: ");
							int enter=scn.nextInt();
							if(enter==1) {
								System.out.print("ENTER VALID ROUTETYPE: ");
								routeType=scn.nextInt();
								if(routeType==1) {
									y=4;
								}
								else if(routeType==2) {
									y=5;
								}
								else if(routeType==3) {
									y=6;
								}
							}
							else {
								System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
								break;
							}
						}
					}
				}
			}
		}
	}
	public City checkCity(String city) {
		City checksLocation=null;
		checksLocation = graph.getCityByValue(city);
		int choice=0;
		while(checksLocation==null) {
			System.out.println("\nCITY NOT PRESENT");
			System.out.print("STILL WANT TO CONTINUE???\nPRESS 1 FOR EXIT: ");
			choice = scn.nextInt();
			if(choice!=1) {
				System.out.print("\nENTER START LOCATION: ");
				city = scn.next();
				checksLocation = graph.getCityByValue(city);
			}
			else {
				System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
				break;
			}

		}
		return checksLocation;
	}
	public City checkDestination(String city) {
		City checksLocation=null;
		checksLocation = graph.getCityByValue(city);
		int choice=0;
		while(checksLocation==null) {
			System.out.println("\nCITY NOT PRESENT");
			System.out.print("STILL WANT TO CONTINUE???\nPRESS 1 FOR EXIT: ");
			choice = scn.nextInt();
			if(choice!=1) {
				System.out.print("\nENTER DESTINATION: ");
				city = scn.next();
				checksLocation = graph.getCityByValue(city);
			}
			else {
				System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
				break;
			}
		}
		return checksLocation;
	}

	public void prevTrip(){
		//Saving booked trip
		Trip info;
		info = new Trip(trip.date,trip.name,trip.age,trip.gender,trip.phNo,trip.storedTrip);
		LLTrip.add(j,info);
		j++;
	}

	public void tripPath() {
		if(y==1||y==2||y==3||y==4||y==5||y==6) {
			Dijikstra dj =new Dijikstra();

			dj.z=y;
			System.out.println(y);
			dj.dijikstraResultPrinter(dj.dijikstra(graph,check_sLocation));
			dj.shortestPathBetween(graph,check_sLocation,check_destination);
	
			System.out.println("\n1. Do you want to book for this trip ?");
			System.out.println("2. Go back");
			System.out.println("Enter 1 to book");
			int book = scn.nextInt();

			if(book==1) {
				//Details of customer 

				System.out.println("Enter the no. of passengers: ");
				num = scn.nextInt();

				trip.date = new String[num];
				trip.name=new String[num];
				trip.age=new int[num];
				trip.gender=new String[num];
				trip.phNo=new long[num];
				trip.storedTrip=new String[num];
				
				for(int i=0;i<num;i++) {
					System.out.println("Enter details of passenger "+(i+1));
					System.out.println("Enter Date and Day of Travel: ");
					trip.date[i] = scn.next();
					System.out.println("Name: ");
					trip.name[i] = scn.next();
					System.out.println("Age: ");
					trip.age[i] = scn.nextInt();
					System.out.println("Gender: ");
					trip.gender[i] = scn.next();
					System.out.println("Phone No.: ");
					trip.phNo[i] = scn.nextInt();
					trip.storedTrip[i] = dj.a;
				}
				//Storing confirmed trip 
				prevTrip();
				dj.a = null;

				dj.shortestPathBetween(graph,check_sLocation,check_destination);
				System.out.println("\n1. Proceed to Payment");
				System.out.println("2. Cancel booking");
				int booking = scn.nextInt();
				if(booking==1) {
					System.out.println("\nTotal number of Passengers: "+num);
					System.out.println("Total Booking Price: "+(num*dj.getCost())+" Rs");
					System.out.println("\n***PAYMENT***");
					System.out.println("Enter your Bank Name: ");
					Bank_Name = scn.next();
					System.out.println("Enter Credit card details: ");
					CreditCard = scn.next();
					
					System.out.println("\nTrip booked sucessfully");
					System.out.println("\n1. Make another trip\n2. Show previous Trips\n3. Exit");
					int another_trip = scn.nextInt();

					if(another_trip==1) {
						makeTrip();
						tripPath();

					}
					else if(another_trip==2) {
						showTrip();
					}
					else {
						System.out.println("Exit sucessfully");
					}
				}
				else {
					System.out.println("Booking canceled");
					for(int i=0;i<LLTrip.size();i++) {
						LLTrip.remove(i).date=null;
						LLTrip.remove(i).name=null;
						LLTrip.remove(i).age=null;
						LLTrip.remove(i).gender=null;
						LLTrip.remove(i).phNo=null;
						LLTrip.remove(i).storedTrip=null;
					}
				}
			}
			else if(book==2){
				userLogin();
			}
			else{
				System.out.println("Do you want to exit");
				System.out.println("2. Exit");
				tripPath();
			}
		}
	}
	
	public void showTrip(){
		if(LLTrip.size() != 0) {
		System.out.println("***Your prev trips*** ");
		for(int i=0;i<LLTrip.size();i++) {
			System.out.println("\n---Trip "+(i+1)+"---");
			for(int k=0;k<(LLTrip.get(i).name.length);k++) {
				System.out.println("\nPassenger "+(k+1));
				System.out.println("Date Of Travel: "+LLTrip.get(i).date[k]);
				System.out.println("Name: "+LLTrip.get(i).name[k]);
				System.out.println("Age: "+LLTrip.get(i).age[k]);
				System.out.println("Gender: "+LLTrip.get(i).gender[k]);
				System.out.println("PhoneNo: "+LLTrip.get(i).phNo[k]);
				System.out.println(LLTrip.get(i).storedTrip[k]);
			}
		}
		System.out.println("\n1. Make another trip\n2.Show previous Trips\n3.Exit");
		int another_trip = scn.nextInt();

		if(another_trip==1) {
			makeTrip();
			tripPath();

		}
		else if(another_trip==2) {
			showTrip();
		}
		else {
			System.out.println("Exit sucessfully");
		}
		}
		
		else {
			System.out.println("No booked Trips");
		}
	}
}


