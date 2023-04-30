//package Travel;
//
//import java.util.*;
//public class User {
//	int choice1;
//	String startLocation;
//	String destination;
//	String route;
//	static City check_sLocation = null;
//	static City check_destination = null;
//	Scanner scn = new Scanner(System.in);
//	Graph graph = new Graph(true,true,true,true,true,true,true);
//
//	public void userLogin() {
//		System.out.println(graph.cities.size());
//		System.out.println("YOU ARE LOGGED IN AS USER");
//		System.out.println("1.MAKE A TRIP");
//		System.out.println("2.SHOW PREVIOUS TRIPS");
//		System.out.print("\nENTER YOUR CHOICE: ");
//		choice1 = scn.nextInt();
//
//		switch(choice1) {
//		case 1:
//			makeTrip();
//			tripPath();
//			break;
//		case 2:
//			prevTrip();
//			break;
//		}
//	}
//
//	public void makeTrip() {
//		int choice;
////		City check_sLocation = null;
////		City check_destination = null;
//		String check_route;
//		System.out.print("\nENTER START LOCATION: ");
//		startLocation = scn.next();
//		check_sLocation=checkCity(startLocation);
//		if(check_sLocation!=null) {
//			System.out.print("\nENTER DESTINATION: ");
//			destination = scn.next();
//			check_destination=checkDestination(destination);
//			if(check_destination!=null) {
//				System.out.print("\nENTER ROUTE (BUS/TRAIN): ");
//				route = scn.next();
//				if(route.equalsIgnoreCase("bus") || route.equalsIgnoreCase("train")) {
//					System.out.println("\nYOU HAVE BOOKED FOR "+route.toUpperCase()+"!!");
//				}
//				while(!route.equalsIgnoreCase("bus") && !route.equalsIgnoreCase("train")) {		
//					System.out.print("\nINVALID ROUTE SELECTED!!\nENTER VAILD ROUTE (BUS/TRAIN) OR TO EXIT TYPE EXIT: ");
//					route = scn.next();
//					if(route.equalsIgnoreCase("exit")) {
//						System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
//						break;
//				}
//					else if(route.equalsIgnoreCase("bus") || route.equalsIgnoreCase("train")) {
//						System.out.println("\nYOU HAVE BOOKED FOR "+route.toUpperCase()+"!!");
//					}
//				}
//			}
//		}
//	}
//	public City checkCity(String city) {
//		City checksLocation=null;
//		checksLocation = graph.getCityByValue(city);
//		int choice=0;
//		while(checksLocation==null) {
//			System.out.println("\nCITY NOT PRESENT");
//			System.out.print("STILL WANT TO CONTINUE???\nPRESS 1 FOR EXIT: ");
//			choice = scn.nextInt();
//			if(choice!=1) {
//				System.out.print("\nENTER START LOCATION: ");
//				city = scn.next();
//				checksLocation = graph.getCityByValue(city
//						);
//			}
//			else {
//				System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
//				break;
//			}
//
//		}
//		return checksLocation;
//	}
//	public City checkDestination(String city) {
//		City checksLocation=null;
//		checksLocation = graph.getCityByValue(city);
//		int choice=0;
//		while(checksLocation==null) {
//			System.out.println("\nCITY NOT PRESENT");
//			System.out.print("STILL WANT TO CONTINUE???\nPRESS 1 FOR EXIT: ");
//			choice = scn.nextInt();
//			if(choice!=1) {
//				System.out.print("\nENTER DESTINATION: ");
//				city = scn.next();
//				checksLocation = graph.getCityByValue(city);
//			}
//			else {
//				System.out.println("\nYOU HAVE QUIT SUCCESSFULLY!!!");
//				break;
//			}
//
//		}
//		return checksLocation;
//	}
//
//public void prevTrip(){
//		
//	}
//	public void tripPath() {
//		
//		Dijikstra dj =new Dijikstra();
//		dj.dijikstraResultPrinter(dj.dijikstra(graph,check_sLocation));
//		dj.shortestPathBetween(graph,check_sLocation,check_destination);
//	}
//
//
//}	





package Travel;

import java.util.*;
class Trip{
	String date[];
	String name[];
	int age[];
	String gender[];
	int phNo[];
	//Linked List to store shortest route of booked trip	
    String storedTrip[];
	//LinkedList inside LLtrip to store shortest routes of booked trips
	int n;
//	int j=0;
	Trip(String date[],String name[],int age[],String gender[],int phNo[],String storedTrip[]){
		this.date = date;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phNo = phNo;
		this.storedTrip = storedTrip;
	}
}
public class Userr {
	int num;
	int j=0;
	int choice1;
	int y=0;
	static int routeType;
	String str=null;
	//Bus1 bb=new Bus1();
	String startLocation;
	String destination;
	String route;
	static City check_sLocation = null;
	static City check_destination = null;
	Scanner scn = new Scanner(System.in);
	Graph graph = new Graph(true,true,true,true,true,true,true);
   Trip trip=new Trip(null,null,null,null,null,null);
   LinkedList<Trip> LLTrip = new LinkedList<Trip>();
	public void userLogin() {
		System.out.println(graph.cities.size());
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
			prevTrip();
			break;
		}
	}

	public void makeTrip() {
		int choice;
//		City check_sLocation = null;
//		City check_destination = null;
//		int y=0;
		String check_route;
//		System.out.print("\nENTER START LOCATION: ");
		//bb.startLocation = scn.next();
		check_sLocation=checkCity(startLocation);
		if(check_sLocation!=null) {
			//System.out.print("\nENTER DESTINATION: ");
			//bb.destination = scn.next();
			check_destination=checkDestination(destination);
			if(check_destination!=null) {
				System.out.print("\nENTER ROUTE (BUS/TRAIN): ");
				route = scn.next();
				
				if(route.equalsIgnoreCase("bus") ) {
					
					System.out.println("\nYOU HAVE BOOKED FOR "+route.toUpperCase()+"!!");
					//int routeType;
					System.out.print("ROUTETYPES: \nPress 1 for Shortest Distance 2 for Cheapest Cost and 3 for Least Time");
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
					System.out.print("ROUTETYPES: \nPress 1 for Shortest Distance 2 for Cheapest Cost and 3 for Least Time");
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
						System.out.print("ROUTETYPES: \nPress 1 for Shortest Distance 2 for Cheapest Cost and 3 for Least Time");
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
						System.out.print("ROUTETYPES: \nPress 1 for Shortest Distance 2 for Cheapest Cost and 3 for Least Time");
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
				///
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
				checksLocation = graph.getCityByValue(city
						);
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
		System.out.println("j"+j);
//		System.out.println("path12"+LLTrip.get(j).storedTrip[0]+" "+LLTrip.get(j).storedTrip[1]);
//		if(j==1) {
//			System.out.println("path12 for j=0"+LLTrip.get(0).storedTrip[0]+" "+LLTrip.get(0).storedTrip[1]);
//		}
		j++;
		
//		System.out.println("path2"+LLTrip.get(1).storedTrip[0]+" "+LLTrip.get(1).storedTrip[1]);

	}
	public void tripPath() {
		if(y==1||y==2||y==3||y==4||y==5||y==6) {
			Dijikstra dj =new Dijikstra();

			dj.z=y;
			System.out.println(y);
			dj.dijikstraResultPrinter(dj.dijikstra(graph,check_sLocation));
			dj.shortestPathBetweennn(graph,check_sLocation,check_destination);

			
			//System.out.println("path1"+trip.storedTrip[dj.r]);
//			System.out.println("path2"+LLTrip.get(1).storedTrip[0]+" "+LLTrip.get(1).storedTrip[1]);

			
			System.out.println("1. Do you want to book for this trip ?");
			System.out.println("2. Go back");
			System.out.println("Enter 1 to book");
			int book = scn.nextInt();
//trip.storedTrip=new String[0];
			if(book==1) {
				//Details of customer 

				System.out.println("Enter the no. of passengers: ");
				num = scn.nextInt();

				trip.date = new String[num];
				trip.name=new String[num];
				trip.age=new int[num];
				trip.gender=new String[num];
				trip.phNo=new int[num];
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
					trip.storedTrip[i]=dj.a;
					
				}
				dj.a=null;
				check_sLocation = null;
				check_destination = null;
				//Storing confirmed trip 
				prevTrip();

				System.out.println("Your total travel time: ");
				System.out.println("Your total travel charge: ");
				System.out.println("1. Confirm booking");
				System.out.println("2. Cancel booking");
				int booking = scn.nextInt();
				if(booking==1) {
					System.out.println("Your Trip booked sucessfully");
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
		System.out.println("Your prev trips: ");
		for(int i=0;i<LLTrip.size();i++) {
			System.out.println("\nTrip "+(i+1));
			for(int k=0;k<(LLTrip.get(i).name.length);k++) {
				System.out.println("\nPassenger "+(k+1));
				System.out.println("Date Of Travel: "+LLTrip.get(i).date[k]);
				System.out.println("Name: "+LLTrip.get(i).name[k]);
				System.out.println("Age: "+LLTrip.get(i).age[k]);
				System.out.println("Gender: "+LLTrip.get(i).gender[k]);
				System.out.println("PhoneNo: "+LLTrip.get(i).phNo[k]);
//				System.out.print(LLTrip.get(i).storedTrip[j]+"-->");
				System.out.println("\npath "+LLTrip.get(i).storedTrip[k]);
			}
//			for(j=0;j<2;j++) {
//				System.out.println("\npath "+LLTrip.get(i).storedTrip[k]);
//			}
//			System.out.println("\n");
//			System.out.println("Path: ");
//			for(int j=0;j<trip.storedTrip.length;j++) {
//				System.out.print(LLTrip.get(i).storedTrip[j]+"-->");
//			}
			//System.out.println("chat:"+String.join("->",trip.storedTrip));
		}
//		for(int j=0;j<LLTrip.size();j++) {
//			int len = LLTrip.get(j).storedTrip.length;
//			for(int i=0;i<len;i++) {
//				
//			}
//		}
	}
public String showStringTrip() {
	str=str+"Your prev trips: ";
	
	for(int i=0;i<LLTrip.size();i++) {
		System.out.println("\nTrip "+(i+1));
		for(int k=0;k<(LLTrip.get(i).name.length);k++) {
			str=str+"\nPassenger "+(k+1)+"Date Of Travel: "+LLTrip.get(i).date[k]+"Name: "+LLTrip.get(i).name[k]+"Age: "+LLTrip.get(i).age[k]
					+"Gender: "+LLTrip.get(i).gender[k]+"PhoneNo: "+LLTrip.get(i).phNo[k]+"\npath "+LLTrip.get(i).storedTrip[k];

		}

	}
	return str;

}

}	
//
//
//
