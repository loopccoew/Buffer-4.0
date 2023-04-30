import java.util.LinkedList;
import java.util.Scanner;

// Define the Login class
class Login {
    String name;
    String email;
    String phone; 
    
    // Define the Login constructor
    Login() {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Define the Accept method to accept user input
    void Accept() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your Name :");
    	name = sc.nextLine(); // Read the user's name from the console
    	System.out.println("\nEnter your Email :");
    	email = sc.nextLine(); // Read the user's email from the console
    	System.out.println("\nEnter your Contact no. :");
    	phone = sc.nextLine(); // Read the user's phone number from the console
    }
}

//Define the Location class
class Location {
 String name;
 String Address;
 String Phone;
 String weblink;
 String place;
 double latitude;
 double longitude;
 
 // Define the Location constructor to set the values of the instance variables
 public Location(String name, String Address, String Phone, String weblink, String place, double latitude, double longitude) {
 	this.name = name;
     this.Address = Address;
     this.Phone = Phone;
     this.weblink = weblink;
     this.place = place;
     this.latitude = latitude;
     this.longitude = longitude;
 }   

 // Define the getter methods for the instance variables
 public String getname() {
     return name;
 }
 
 public String getAddress() {
 	return Address;
 }
 
 public String getPhone() {
 	return Phone;
 }
 
 public String getweblink() {
 	return weblink;
 }
 
 public String getplace() {
 	return place;
 }
 
 public double getLongitude() {
     return longitude;
 }
 
 public double getLatitude() {
     return latitude;
 }
}

//A class containing the NGO data 
class Categories{
	Categories(){
	}
	Scanner sc = new Scanner(System.in);
	void Food() {
		LinkedList<Location> locationList = new LinkedList<Location>();//Linked list locationList containing all the attributes from class Location 
		//Add all the food category NGOs' data stored in Linked list using .add() method
		
		 locationList.add(new Location("Sevadeep","Sky One 14 Th Floor, Nagar Road, Kalyani Nagar-Vadgaon Sheri, Pune - 411006 (Near Lunkad Plazza)\r\n"
					+ "https://goo.gl/maps/Rj8t61BgFqMu1bqr8", "06384471011","https://sevadeep.org/","Vadgaon Sheri",18.551265473928787, 73.92047876344155));
		 locationList.add(new Location("THE AKSHAYA PATRA FOUNDATION","The Akshaya Patra Foundation Sky One Building, 1st Floor, Office no -109, Kalyani Nagar Next Gold Gym, Pune - 411006\r\n"
					+"https://goo.gl/maps/nh4RcuR4fFvhbau69","02067236211","https://www.akshayapatra.org/","Kalyani nagar",18.54340079878753, 73.90478924243403)); 
		 locationList.add(new Location("Helping Hearts","1974, Gaffar Baig Street, F/1, Hermes Grace, Pune-1, Maharashtra, India. Regd. No. MAH/568/2017/Pune\"\r\n"
	        		+"https://goo.gl/maps/wG6bLoqGozUaoDE","9922418597","https://helpingheartsngo.com/","Hermes Grace",18.51407021833379, 73.87652562473457));
		 locationList.add(new Location("Me the Change"," 160 , Shivaji Nagar Gaothan, Pune 411005"+"https://goo.gl/maps/FfZJtVLQ2hUrrGJ28",
	      	  "+91 98810 98920","http://methechange.org/","Shivaji Nagar",18.5244929836071, 73.85102398476027));
	     locationList.add(new Location("MWF NGO"," HADAPSAR, PUNE\r\n"+"https://goo.gl/maps/uUBntCqmASeKT5Hq6",
	        		 "9130043999","https://mwfngo.com/","Hadapsar",18.51034241266777, 73.92550548674124));
	     locationList.add(new Location("Sanjivani","FLAT NO 17, SULAI COMPLEX, Near DESAI Hospital, Mohammed Wadi, Pune, Maharashtra 411060"
	     		+"https://goo.gl/maps/NgZCbgZPHW7AkVNm8"," 8956253672","https://sanjivani.ngo/","Mohammed Wadi",18.477488587626905, 73.91618030027031));
	     locationList.add(new Location("SAVALI – A Shelter for Care"," Plot No 13, S no 78, Left Bhusari colony, Paud Road, Kothrud, near PMT Depot, Pune, Maharashtra 411038\r\n"+
	        "https://goo.gl/maps/DokU1cAuQ63F3P4U7","02025282379","http://www.savalimrcp.org/","Kothrud",18.507662876443874, 73.80740339952126));
	     locationList.add(new Location("Annamrita","opposite Vastu Udyog Colony, Vaastu Udyog Colony, Ajmera Housing Society, Pimpri Colony, Haveli, Maharashtra 411018\r\n"+
	     		"https://goo.gl/maps/1bbTaNCCQDaDYAEb6","08605353496","http://annamritapune.org/","Haveli",18.515268585809203, 73.86817449873888));
	     locationList.add(new Location("Tapasya","A Wing, CHANDRANEEL SOCIETY, Flat-102, Sinhgad Rd, opposite cosmos bank, Anubandh Nagar, Dattawadi, Pune, Maharashtra 411030\r\n"+
	             "https://goo.gl/maps/faZkJdDXSXkcf6dUA","09456593160","https://www.tapasya.xyz/","Dattawadi",18.49602557870064, 73.83856167919969));
	     locationList.add(new Location("Access Life Pune"," Nirmal Bungalow , D/3 Hindustan Estates, Jupiter Society, opp. Starbucks Kalyani, Kalyani Nagar, Pune, Maharashtra 411006\r\n"+
	    		 "https://goo.gl/maps/mdgrkzqnYRUqCFDv6","08080222377","http://www.accesslife.org/","Kalyani Nagar",18.547233687558894, 73.90100116484267));
	     
	  // Create a null reference for the current location
	     Location currentLocation = null;

	     // Prompt the user to enter their preferred location
	     System.out.println("\nEnter your preferable location:");
	     System.out.println("----------------------------------------------------------");
	     System.out.println("Vadgaon Sheri\nKalyani Nagar\nHermes Grace\nShivaji Nagar\nHadapsar\nMohammed Wadi\nKothrud\nHaveli\nDattawadi");
	     System.out.println("----------------------------------------------------------");
	     String loc = sc.nextLine();

	     // Search for the user's preferred location in the location list
	     for (Location location : locationList) {
	         if (location.getplace().equalsIgnoreCase(loc)) {
	             currentLocation = location; // If the location is found, assign it to the current location variable
	             break;
	         }
	     }

	     // If the user's preferred location is not found, inform the user and exit the program
	     if (currentLocation == null) {
	         System.out.println("Location not found.");
	         return;
	     }

	     // Create a new instance of the Categories class
	     Categories main = new Categories();

	     // Find the nearest locations to the user's preferred location
	     LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);

	     // Print the nearest locations to the user
	     System.out.println("\nHere are some NGO's according to your preferable location choice :");
	     for (Location location : nearestLocations) {
	    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
	     }
	}
	void Environment() {
		LinkedList<Location> locationList = new LinkedList<Location>();
		
        locationList.add(new Location("Sevadeep","Sky One 14 Th Floor, Nagar Road, Kalyani Nagar-Vadgaon Sheri, Pune - 411006 (Near Lunkad Plazza)\r\n"
				+ "https://goo.gl/maps/Rj8t61BgFqMu1bqr8", "06384471011","https://sevadeep.org/","Vadgaon Sheri",18.551265473928787, 73.92047876344155));
        locationList.add(new Location("Sanjivani","FLAT NO 17, SULAI COMPLEX, Near DESAI Hospital, Mohammed Wadi, Pune, Maharashtra 411060"
				+ "https://goo.gl/maps/NgZCbgZPHW7AkVNm8","8956253672","https://sanjivani.ngo/\r\n","Mohammed Wadi",18.475291053675768, 73.91635423111805));
        locationList.add(new Location(" Wings","G28 Ashoka mall, Bund Garden Road, Pune-411001\n"
				+ "https://goo.gl/maps/5T5RYXwLN834DTtt8","8698637796","https://wingsfordreams.org/","Sangamwadi",18.536161693143118, 73.88030458917565));
        locationList.add(new Location("Vasundhara Abhiyan","Vasundhara Abhiyan Baner, Next to Reelicon Alpine Ridge, Pan Card Clubs area, Baner Pune, Maharashtra - 411045 India\n"
				+ "https://goo.gl/maps/WpbpSqDe1uy8Um8PA","9882501501","https://vasundharaabhiyan.org/","Baner",18.55897837011818, 73.78731566520608));
        locationList.add(new Location("Parisar","Yamuna, ICS Colony, Ganeshkhind Road,Pune, Maharashtra, 411 007 India\n"
				+ "https://goo.gl/maps/QGm4u3u9moj3ggDP7","8007999515","https://parisar.org/","Ganeshkhind Road",18.543128772868904, 73.83258819589871));
        locationList.add(new Location("Applied Environmental Research Foundation","36-C, Krishnarjun, Madhavbaug Co-op Hsg Society, Paud Rd, Akhil Shivtirth Nagar Colony, Kothrud, Pune, Maharashtra 411038\n"
				+ "https://goo.gl/maps/PbbmQw5xXrrBfe846","8668875037","https://www.aerfindia.org/","Kothrud",18.514595929736636, 73.80631912823758));
        locationList.add(new Location("Ecosan Services Foundation"," Flat No. 1, First Floor, 24, Prashantnagar, 721/1, Sadashiv Peth, L.B.S.Road Pune 411030, Maharashtra, India., Sadashiv Peth, Pune, Maharashtra 411030\n"
				+ " https://g.co/kgs/zaejj4"," 02024530061"," http://www.ecosanservices.org/","Sadashiv Peth",18.506660862965262, 73.84354007634266));
        locationList.add(new Location("SHASHWAT ECO SOLUTION FOUNDATION"," Office No. 14, 3 Floor, Building D2, Popular Nagar, Opp. Mai Mangeshkar Hospital, Warje, Pune, Maharashtra 411052\n"
				+ "https://g.co/kgs/KgXvJr","72195 19598", "http://ww38.shashwatecosolution.org/","Warje",18.485287387201524, 73.79984101124364));
        locationList.add(new Location("Green Peace"," Telephone Exchange Building, Sr No 69/1, Sinhagad Road, Vadgaon Dhayari, Vadgaon Bk, Pune, Maharashtra 411041\n"
				+ "  https://g.co/kgs/4WySR2","020 2439 0694","  https://www.greenpeace.org/india/en/","Vadgaon Bk",18.46325586216561, 73.81114289231958));
        locationList.add(new Location("MAHA NGO FEDERATION","35/A, 1A, Katraj - Kondhwa Rd, opposite Paramount Garden, Swami Samartha Nagar, Kondhwa Budruk, Pune, Maharashtra 411048\n"
				+ "https://goo.gl/maps/R6k4JPJhaVnvBK9K7","9665440000","https://www.mahangofederation.org/index","Kondhwa Budruk",18.448395277204693, 73.87046875356957));
        
        Location currentLocation = null;
        System.out.println("\nEnter your preferable location:");
        System.out.println("------------------------------------------------------------");
        System.out.println("Vadgaon Sheri\nSangamwadi\nBaner\nGaneshkhind Road\nSadashiv Peth\nMohammed Wadi\nKothrud\nWarje\nVadgaon Bk\nKondhwa Budruk");
        System.out.println("------------------------------------------------------------");
        String loc = sc.nextLine();
        for (Location location : locationList) {
            if (location.getplace().equalsIgnoreCase(loc)) {
                currentLocation = location;
                break;
            }
        }
        if (currentLocation == null) {
            System.out.println("Location not found.");
            return;
        }
        Categories main = new Categories();
        LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);
        System.out.println("\nHere are some NGO's according to your preferable location choice :");
	     for (Location location : nearestLocations) {
	    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
	     }
    }
	
	void Education() {
		LinkedList<Location> locationList = new LinkedList<Location>();
		
		locationList.add(new Location("Helping Hearts","1974, Gaffar Baig Street, F/1, Hermes Grace, Pune-1, Maharashtra, India. Regd. No. MAH/568/2017/Pune\"\r\n"
        		+"https://goo.gl/maps/wG6bLoqGozUaoDE","9922418597","https://helpingheartsngo.com/","Hermes Grace",18.51407021833379, 73.87652562473457));
		locationList.add(new Location("MWF NGO","TRUST,PCMC, HADAPSAR, PUNE\n"
				+ " https://goo.gl/maps/uUBntCqmASeKT5Hq6","9130043999","https://mwfngo.com/","Hadapsar",18.50229605674967, 73.93907444255834));
		locationList.add(new Location("Sanjivani","FLAT NO 17, SULAI COMPLEX, Near DESAI Hospital, Mohammed Wadi, Pune, Maharashtra 411060"
				+ "https://goo.gl/maps/NgZCbgZPHW7AkVNm8","8956253672","https://sanjivani.ngo/\r\n","Mohammed Wadi",18.475291053675768, 73.91635423111805));
		locationList.add(new Location("Loksewa Social Foundation","Brahma Avenue, C-4/404, Sr No. 60+I+2, Off Nibm Road, Kondwa, Pune-48, Maharashtra. Pin No.- 411048\n"
				+ "https://goo.gl/maps/QRK8wQczEXe5hxpe8","91 7038807386 | 9922970768","http://loksewafoundation.org/","Kondwa",18.477780212961694, 73.88723671971466));
		locationList.add(new Location("Tratr","Sagar Co-Operative Housing Society, Bavdhan, Pune, Maharashtra\n"
				+ "https://goo.gl/maps/XvbzYxGFQBmMtWMr7","9845673476","https://tratr.org/","Bavdhan",18.515768503915115, 73.78101636074847));
		locationList.add(new Location("Pratham Education Foundation","Chintamani Building, off, Pan Card Club Rd, Westport lane, Baner, Pune, Maharashtra 411045 \n"
				+ "https://goo.gl/maps/dayT94mFWSnz2RiC6"," 9423580094|9869811421","https://www.pratham.org/","Baner",18.55815531159483, 73.7773906718874));
		locationList.add(new Location("Advika Welfare Foundation","Plot No 3, Kusuma Bunglow, Sahajanand Society, Kothrud, Pune, Maharashtra 411038\n"
				+ "https://goo.gl/maps/jcRhYKP34mekgKvL6","9552560631","http://advikawelfarefoundation.org/","Kothrud",18.499225743634646, 73.80228384717243));
		locationList.add(new Location("Akanksha Foundation","GR5M+C3R, Bhalekar Chawl, Erandwane, Pune, Maharashtra 411004\n"
				+ "https://goo.gl/maps/qvsa2sZGmX6uDVWb6","020 6605 1380","https://www.akanksha.org/","Erandwane",18.508765090969533, 73.83261913822452));
		locationList.add(new Location("Lend-A-Hand India","9, Jeevan Vihar Housing Society, Senapati Bapat Rd, near Pride Panaroma, Gokhalenagar, Pune, Maharashtra 411016\n"
				+ "https://goo.gl/maps/C7phfAqorNbDA9Bt8","020 2563 0090","https://lendahandindia.org/","Gokhalenagar",18.53489346344252, 73.8275453861209));
		locationList.add(new Location(" Akshar Paaul NGO","Sr. No. 97/8, Kothrud Depot, C-2/10, Dhanlaxmi Park, Paud Rd, Bhusari Colony, Pune, Maharashtra 411038\n"
				+ "https://goo.gl/maps/dYfCKBy4kNH22jw56","8856935553","https://www.aksharpaaul.org/","Kothrud",18.509005737079722, 73.79414158126377));
		locationList.add(new Location("Community Aid & Sponsorship Programme","Pashan, Pune, Maharashtra 411021\n"
				+ "https://goo.gl/maps/1RP4yDtFm3W9apr58","020 2586 2842","https://caspindia.org/","Pashan",18.53379255814895, 73.76016482611695));
		
		Location currentLocation = null;
		 System.out.println("\nEnter your preferable location:");
		 System.out.println("------------------------------------------------------------");
		 System.out.println("Hadapsar\nHermes Grace\nBaner\nKondwa\nBavdhan\nMohammed Wadi\nKothrud\nErandwane\nGokhalenagar\nPashan");
		 System.out.println("------------------------------------------------------------");
		 String loc = sc.nextLine();
		 for (Location location : locationList) {
			 if (location.getplace().equalsIgnoreCase(loc)) {
				 currentLocation = location;
				 break;
	          }	
		 }
        if (currentLocation == null) {
            System.out.println("Location not found.");
            return;
        }
        Categories main = new Categories();
        LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);
        System.out.println("\nHere are some NGO's according to your preferable location choice :");
	     for (Location location : nearestLocations) {
	    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
	     }
	}
	
	void Children() {
		LinkedList<Location> locationList = new LinkedList<Location>();
		
		locationList.add(new Location("THE AKSHAYA PATRA FOUNDATION","The Akshaya Patra Foundation Sky One Building, 1st Floor, Office no -109 Kalyani Nagar Next Gold Gym, Pune - 411006,\n"
				+ "https://goo.gl/maps/nh4RcuR4fFvhbau69","02067236211","https://www.akshayapatra.org/","Kalyani Nagar",18.535237024485017, 73.83003605901862));
		locationList.add(new Location("Helping Hearts","1974, Gaffar Baig Street, F/1, Hermes Grace, Pune-1, Maharashtra, India. Regd. No. MAH/568/2017/Pune\"\r\n"
        		+"https://goo.gl/maps/wG6bLoqGozUaoDE","9922418597","https://helpingheartsngo.com/","Hermes Grace",18.51407021833379, 73.87652562473457));
		locationList.add(new Location("MWF NGO","TRUST,PCMC, HADAPSAR, PUNE\n"
				+ " https://goo.gl/maps/uUBntCqmASeKT5Hq6","9130043999","https://mwfngo.com/","Hadapsar",18.50229605674967, 73.93907444255834));
		locationList.add(new Location("Samavedana","c/o Sahyadri Corporate Office, Plot No. 54, Lane 2, Lokmanya Colony, Opp. Jeet Ground, Near Vanaz Corner, Paud Rd, Kothrud, Pune 411038\n"
				+ "https://goo.gl/maps/BdhCuZyZaCQz2QQTA","020- 6721 5000 / 5008","https://samavedana.org/","Kothrud",18.50796422196873, 73.80455476891746));
		locationList.add(new Location("Sanjivani","FLAT NO 17, SULAI COMPLEX, Near DESAI Hospital, Mohammed Wadi, Pune, Maharashtra 411060"
				+ "https://goo.gl/maps/NgZCbgZPHW7AkVNm8","8956253672","https://sanjivani.ngo/\r\n","Mohammed Wadi",18.475291053675768, 73.91635423111805));
		locationList.add(new Location("Loksewa Social Foundation","Brahma Avenue, C-4/404, Sr No. 60+I+2, Off Nibm Road, Kondwa, Pune-48, Maharashtra. Pin No.- 411048\n"
				+ "https://goo.gl/maps/QRK8wQczEXe5hxpe8","91 7038807386 | 9922970768","http://loksewafoundation.org/","Kondwa",18.477780212961694, 73.88723671971466));
		locationList.add(new Location("Swdhar IDWC","Flat No 301, Dhan-Shree Apt, Opp Chittaranjan Vatika, Model Colony, Shivajinagar, Pune 411005\n"
				+ "https://goo.gl/maps/gUVoWo3vTY7L88Gh8","(020) 2565 8600","https://www.swadharpune.org/","Shivajinagar",18.529917034238984, 73.84920792056742));
		locationList.add(new Location(" Bhagini Nivedita Pratishthan","7, Bhupati complex, 985 Sadashiv peth, Pune: 411030,\n"
				+ "https://goo.gl/maps/P8r98Kx71zxgYEWt7","020 24459734 |+91-8275765734","https://niveditapune.org.in/","Sadashiv peth",18.512227626444947, 73.84621849198689));
		locationList.add(new Location(" Wings","G28 Ashoka mall, Bund Garden Road, Pune-411001\n"
				+ "https://goo.gl/maps/5T5RYXwLN834DTtt8","8698637796","https://wingsfordreams.org/","Sangamwadi",18.536161693143118, 73.88030458917565));
		locationList.add(new Location(" Akshar Paaul NGO","Sr. No. 97/8, Kothrud Depot, C-2/10, Dhanlaxmi Park, Paud Rd, Bhusari Colony, Pune, Maharashtra 411038\n"
				+ "https://goo.gl/maps/dYfCKBy4kNH22jw56","8856935553","https://www.aksharpaaul.org/","Kothrud",18.509005737079722, 73.79414158126377));
		locationList.add(new Location("Teach for India","Connaught place building, 4th Floor, office no 406, Bund Garden Rd, opposite wadia college, Pune, 411001\n"
				+ "https://goo.gl/maps/o6w5jmwfJdKFuLu77","020 6400 1558","https://www.teachforindia.org/","Bund Garden Road",18.53540080729663, 73.88027686520547));
		
		Location currentLocation = null;
		System.out.println("\nEnter your preferable location:");
		System.out.println("------------------------------------------------------------");
        System.out.println("Kalyani Nagar\nHermes Grace\nHadapsar\nKothrud\nKondwa\nMohammed Wadi\nShivajinagar\nSadashiv peth\nSangamwadi\nBund Garden Road");
        System.out.println("------------------------------------------------------------");
        String loc = sc.nextLine();
        for (Location location : locationList) {
            if (location.getplace().equalsIgnoreCase(loc)) {
                currentLocation = location;
                break;
            }
        }
        if (currentLocation == null) {
            System.out.println("Location not found.");
            return;
        }
        Categories main = new Categories();
        LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);
        System.out.println("\nHere are some NGO's according to your preferable location choice :");
	     for (Location location : nearestLocations) {
	    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
	     }
	}
	
	void Healthcare() {
		LinkedList<Location> locationList = new LinkedList<Location>();
		
		locationList.add(new Location("Samavedana","c/o Sahyadri Corporate Office, Plot No. 54, Lane 2, Lokmanya Colony, Opp. Jeet Ground, Near Vanaz Corner, Paud Rd, Kothrud, Pune 411038\r\n"
	     		+"https://goo.gl/maps/BdhCuZyZaCQz2QQTA","020- 6721 5000 / 5008","https://samavedana.org/","Kothrud",18.508116830933613, 73.80453331087514));
	    locationList.add(new Location("Helpage India","9/67, Phule Nagar, Behind Alandi Road R.T.O. Ground,Near Bodhichitta  Vihar,Pune - 411006\r\n"+
	     		"https://goo.gl/maps/fGuAA4Ceo3rhjgZ18","08275435513" ,"https://www.helpageindia.org/","Phule Nagar",18.557413628551167, 73.8764507666958));
	    locationList.add(new Location("Sanjivani","FLAT NO 17, SULAI COMPLEX, Near DESAI Hospital, Mohammed Wadi, Pune, Maharashtra 411060\r\n"+
	        		"https://goo.gl/maps/NgZCbgZPHW7AkVNm8","8956253672","https://sanjivani.ngo/","Mohammed Wadi",18.477488587626905, 73.91618030027031));
	    locationList.add(new Location("Loksewa Social Foundation","Brahma Avenue, C-4/404, Sr No. 60+I+2, Off Nibm Road, Kondwa, Pune-48, Maharashtra. Pin No.- 411048\r\n"+ 
	        		"https://goo.gl/maps/QRK8wQczEXe5hxpe8","91 7038807386 | 9922970768","http://loksewafoundation.org/","Kondwa",18.47165700898552, 73.8999562108742));
	    locationList.add(new Location(" Tratr","Sagar Co-Operative Housing Society, Bavdhan, Pune, Maharashtra\r\n"+
	     		"https://goo.gl/maps/XvbzYxGFQBmMtWMr7","9845673476","https://tratr.org/","Bavdhan",18.51782906761821, 73.78111625425437));
	    locationList.add(new Location("Community Aid & Sponsorship Programme","Pashan, Pune, Maharashtra 411021\r\n"+
	     		"https://goo.gl/maps/1RP4yDtFm3W9apr58","020 2586 2842","https://caspindia.org/","Pashan",18.54102352003517, 73.7926235763334));
	    locationList.add(new Location("SAHYADRI MEDICAL AND EDUCATION FOUNDATION","MAULI NIVAS, S. NO.23, R.G.NAGAR ANAND VIHAR, VITTHALWADI HIGANE KHURD, Pune, Maharashtra 411051\r\n"+
	             "https://goo.gl/maps/6kuTEPXXsnunfHq88","09763797199","http://www.doaram.com/organization/sahyadri-medical-and-education-foundation","Hingane khurd",18.482170759601416, 73.82949638272072));
	    locationList.add(new Location("Foundation For Research In Community Health","3-4 85, Trimiti B Apartment, Anand Park, Aundh, Aundh, Pune, Maharashtra 411007\r\n"+
	     		"https://goo.gl/maps/SPkJvtydoxLquTL67","02025881308","http://www.frchindia.org/","Aundh",18.55924147917422, 73.80837120781204));
	    locationList.add(new Location("Seva Arogya Foundation","Sr. No. 19/1 8B, Samaj Mandir, Hingane Home Colony, Pune, Maharashtra 411052\r\n"+
	     		"https://goo.gl/maps/ZDFFBN1xsSckVvzh6","09075081977","https://www.sevaarogya.org/","Hingane Home Colony",18.489191565816533, 73.81022808041689));
	    locationList.add(new Location("Wings For Dreams","Ashoka Mall, G28, Bund Garden Rd, Sangamvadi, Pune, Maharashtra 411001\r\n"+
	     		"https://goo.gl/maps/qy9QUZzbeEReT92L9","08698637796","http://www.wingsfordreams.org/","Sangamvadi",18.536175325127502, 73.8762135335144));
	    
	    Location currentLocation = null;
        System.out.println("\nEnter your preferable location:");
        System.out.println("------------------------------------------------------------");
        System.out.println("Kothrud\nPhule Nagar\nMohammed Wadi\nKondwa\nBavdhan\nPashan\nHingane Khurd\nAundh\nHingane Home Colony\nSangamvadi");
        System.out.println("------------------------------------------------------------");
        String loc = sc.nextLine();
        for (Location location : locationList) {
            if (location.getplace().equalsIgnoreCase(loc)) {
                currentLocation = location;
                break;
            }
        }
        if (currentLocation == null) {
            System.out.println("Location not found.");
            return;
        }
        Categories main = new Categories();
        LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);
        System.out.println("\nHere are some NGO's according to your preferable location choice :");
	     for (Location location : nearestLocations) {
	    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
	     }
	}
	
	void Mental_Health() {
		LinkedList<Location> locationList = new LinkedList<Location>();
		
		locationList.add(new Location("Connecting NGO", "Atur Chambers, 2nd Floor,Above Coffee House, Opposite SGS Mall, Moledina Road,Camp, Pune 411001\r\n"+
	             "https://goo.gl/maps/EsszmDzCQVVF7LNy5","020 41200845","https://connectingngo.org/","Camp",18.519865540217157, 73.87552608203931));
	    locationList.add(new Location("AASRA","Shriroz Paradise-1,flat no.106, Dehu - Alandi Rd, near raj wada, Chikhali, Pune, Maharashtra 411062\r\n"+"https://goo.gl/maps/gds5ye3asVHmnAkPA",
	    		"91-9820466726","http://aasra.info/","Chikhali",18.683996204793164, 73.81444239553527));
	    locationList.add(new Location("Manahsrushti","4th floor, Dixit Co-op Society, Infront of Yes Bank, Law College Rd, Pune, Maharashtra 411004\r\n"+"https://g.co/kgs/wJJcM6",
	         	"090280 95032","https://manahsrushti.business.site/","Law College Rd",18.51567528419633, 73.8285447915992));
	    locationList.add(new Location("Mental Health Organisation (MHO)","5 & 6, 770/4, Shriniketan, Bhandarkar Rd, Deccan Gymkhana, Pune, Maharashtra 411004\r\n"+
	     		"https://g.co/kgs/yf3NtN","099237 97923","https://mental-health-organisation-mho.business.site/","Deccan Gymkhana",18.517689297220905, 73.8362815715697));
	    locationList.add(new Location("SAHYADRI MEDICAL AND EDUCATION FOUNDATION","MAULI NIVAS, S. NO.23, R.G.NAGAR ANAND VIHAR, VITTHALWADI HIGANE KHURD, Pune, Maharashtra 411051\r\n"+
	     		"https://g.co/kgs/e8BxrC","097637 97199","http://www.doaram.com/organization/sahyadri-medical-and-education-foundation","Hingane khurd",18.482170759601416, 73.82949638272072));
	    locationList.add(new Location("Umed Pariwar","428/B, Shanti Complex, Narapatgiri Chowk, Mangalwar Peth, Pune, Maharashtra 411011\r\n"+
	     		"https://g.co/kgs/q2H1RU","020 2614 0456","https://umedpariwar.org/","Mangalwar Peth",18.52584869991159, 73.86460958287331));
	    locationList.add(new Location("Healstation Foundation","E604, Daulatnagar, Suncity Road, Sinhgad Rd, Anand Nagar, Pune, Maharashtra 411051\r\n"+
	     		"https://g.co/kgs/zkPJBY","079709 94279","https://www.healstation.org/","Anand Nagar",18.479005606826874, 73.82399755953878));
	    locationList.add(new Location("Niwant Andh Mukta Vikasalaya"," S.No.33, Plot No. 75, Vidyanagar, Pune, Maharashtra 411032\r\n"+
	     		"https://g.co/kgs/4wwbdB","099237 72375","http://www.niwantvision.com/home.aspx","Vidyanagar",18.581229139433496, 73.89481468669153));
	    
	    Location currentLocation = null;
        System.out.println("\nEnter your preferable location:");
        System.out.println("------------------------------------------------------------");
        System.out.println("Camp\nChikhali\nLaw College Rd\nDeccan Gymkhana\nHingane Khurd\nMangalwar Peth\nAnand Nagar\nVidyanagar");
        System.out.println("------------------------------------------------------------");
        String loc = sc.nextLine();
        for (Location location : locationList) {
            if (location.getplace().equalsIgnoreCase(loc)) {
                currentLocation = location;
                break;
            }
        }
        if (currentLocation == null) {
            System.out.println("Location not found.");
            return;
        }
        Categories main = new Categories();
        LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);
        System.out.println("\nHere are some NGO's according to your preferable location choice :");
	     for (Location location : nearestLocations) {
	    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
	     }
	}
	
	void Specially_Abled() {
		LinkedList<Location> locationList = new LinkedList<Location>();
		locationList.add(new Location("Prayatna-  FOR PEOPLE WITH SPECIAL NEEDS", "NIBM Rd, Kondhwa, Pune, Maharashtra 411048\n"+"https://g.co/kgs/Rqz6Rp",
	     		"+91 830 829 5272","https://www.prayatnapune.org/","Kondhwa",18.473546891830406, 73.89976054127966));
		locationList.add(new Location("Samarthanam Trust for the Disabled","Shri Prashanti Nilayam, BAIF Road (Sambhaji Nagar), Opp Mart Inn,Wagholi, Pune-412207\n"+"https://g.co/kgs/uhQnk6)",
			        "+91 6364867806","centerhead_pune@samarthanam.org","Wagholi",18.58838138192911, 73.97991958929258));
	    locationList.add(new Location("Snehkshitij Foundation","Address: 351, Shukrawar Peth Ankita Chambers Building, Road, near Kotnis Hospital, Shivajinagar, Pune, Maharashtra 411002\n"+"https://g.co/kgs/Cb4rZn",
			        "09823292718","https://g.co/kgs/Cb4rZn","Shivaji nagar",18.532873879852506, 73.84494920154592));		 
	    locationList.add(new Location("Advika Welfare Foundation","Ground Floor, Kusuma Bunglow, Plot No 3, Sahajanand Soc, Kothrud, Pune 411038\n"+"https://g.co/kgs/bPqz7t","91 830 829 5272",
			        "http://www.advikawelfarefoundation.org/","Kothrud",18.508650776208402, 73.8176375523921));	 
	    locationList.add(new Location("Aashayein- vocational and life skills training centre for special needs","Bunglow 55, near cloud 9, Sainik Vihar, Mohammed Wadi, Pune, Maharashtra 411048\n"+"https://g.co/kgs/6mCx44",
			        "9989161026","https://nayi-disha.org/business/aashayein-2/","Mohammed Wadi",18.477488587626905, 73.91600863889217));	
	    locationList.add(new Location("Optimus Social and Education Society Pune Maharashtra India","Office.A-10,A-wing,Krushankunj Society,Pune,Maharashtra\n"+"https://g.co/kgs/BMoSnw",
			        "+91 9404840373/+91 8484818038","https://www.oesngo.org/","Krushankunj Society",18.489042858985083, 73.8162683820386));
	    locationList.add(new Location("EKansh Trust","Ghorpadi, Pune, Maharashtra 411001\n"+"https://g.co/kgs/xYcPLZ","09503715015","https://g.co/kgs/xYcPLZ"
	    		 ,"Ghorpadi",18.52665918365879, 73.90565101441084));
	    locationList.add(new Location("Prayas Youth Forum And Social Awareness Foundation","no.18,Karve Nagar Rd,Karve Nagar,Pune,Maharashtra 411052\n"+"https://g.co/kgs/b8adVm",
			        " +91 99607 18056, +91 83800 78088 ","https://prayasyouthforum.org/","Karve Nagar",18.491212479601863, 73.81818528102595));
	    locationList.add(new Location("Adivasi Vikas Prabodhini","119, Urit Nagar, Warje, Pune, Maharashtra 411058\n"+" https://g.co/kgs/qAx1kw","+91 9604531339"
	    		 ,"https://www.creativepeople24.org/","Warje",18.490405051063416, 73.7954992835282));
	    locationList.add(new Location("Snehalaya Institute For Handicapped","Awhalwadi Rd, Anand Park, Wagholi, Pune, Maharashtra 412207\n"+"https://g.co/kgs/G3BZhw","098225 80248",
			        "https://www.snehalayapune.in/","Wagholi",18.574808912647818, 73.98673179859821));
	    
	    Location currentLocation = null;
        System.out.println("\nEnter your preferable location:");
        System.out.println("------------------------------------------------------------");
        System.out.println("Kondhwa\nWagholi\nShivaji nagar\nKothrud\nMohammed Wadi\nKrushankunj Society\nGhorpadi\nKarve Nagar\nWarje");
        System.out.println("------------------------------------------------------------");
        String loc = sc.nextLine();
        for (Location location : locationList) {
            if (location.getplace().equalsIgnoreCase(loc)) {
                currentLocation = location;
                break;
            }
        }
        if (currentLocation == null) {
            System.out.println("Location not found.");
            return;
        }
        Categories main = new Categories();
        LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);
        System.out.println("\nHere are some NGO's according to your preferable location choice :");
	     for (Location location : nearestLocations) {
	    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
	     }
	}
	
	void Women() {
		LinkedList<Location> locationList = new LinkedList<Location>();
		
		locationList.add(new Location("Sevadeep","Sky One 14 Th Floor, Nagar Road, Kalyani Nagar-Vadgaon Sheri, Pune - 411006 (Near Lunkad Plazza)\r\n"
					+ "https://goo.gl/maps/Rj8t61BgFqMu1bqr8", "06384471011","https://sevadeep.org/\r\n","Vadgaon Sheri",18.5513, 73.9210));
	    locationList.add(new Location("THE AKSHAYA PATRA FOUNDATION","The Akshaya Patra Foundation Sky One Building, 1st Floor, Office no -109,Kalyani Nagar,Bavdhan Next Gold Gym, Pune - 411006\n"
					+ "https://goo.gl/maps/nh4RcuR4fFvhbau69", "02067236211","https://www.akshayapatra.org/\r\n","Bavdhan",18.5135 , 73.7699));
	    locationList.add(new Location("Helping Hearts\r\n","  1974, Gaffar Baig Street, F/1, Hermes Grace, Pune-1, Maharashtra, India. Regd. No. MAH/568/2017/Pune\r\n"
					+ "https://goo.gl/maps/wG6bLoqGozUaoDEL8\r\n", "9922418597\r\n","https://helpingheartsngo.com/\r\n","Camp",18.4990, 73.8957));
	    locationList.add(new Location("Samavedana\r\n","c/o Sahyadri Corporate Office, Plot No. 54, Lane 2, Lokmanya Colony, Opp. Jeet Ground, Near Vanaz Corner, Paud Rd, Kothrud, Pune 411038\r\n"
					+ "https://goo.gl/maps/BdhCuZyZaCQz2QQTA\r\n", "020- 6721 5000 / 5008\r\n","https://samavedana.org/\r\n","Kothrud",18.5074, 73.8077));
	    locationList.add(new Location("Sanjivani\r\n","FLAT NO 17, SULAI COMPLEX, Near DESAI Hospital, Mohammed Wadi, Pune, Maharashtra 411060\r\n"
					+ "https://goo.gl/maps/NgZCbgZPHW7AkVNm8\r\n", "8956253672\r\n","https://sanjivani.ngo/\r\n","Mohammed Wadi",18.4751, 73.9163));
	    locationList.add(new Location("Tratr\r\n","Sagar Co-Operative Housing Society, Bavdhan, Pune, Maharashtra\r\n"
					+ "https://goo.gl/maps/XvbzYxGFQBmMtWMr7\r\n","9845673476 \r\n","https://tratr.org/\r\n","Bavdhan",18.5135 , 73.7699));
	    locationList.add(new Location("Swdhar IDWC\r\n","Swadhar IDWC Main Office\r\n Flat No 301, Dhan-Shree Apt, Opp Chittaranjan Vatika, Model Colony, Shivajinagar, Pune 411005\r\n"
					+ "https://goo.gl/maps/gUVoWo3vTY7L88Gh8\r\n", "(020) 2565 8600\r\n","https://www.swadharpune.org/\r\n","Shivaji Nagar",18.5314,73.8446));
	    locationList.add(new Location("Bhagini Nivedita Pratishthan\r\n","Bhupati complex, 985 Sadashiv peth, Pune: 411030,\r\n"+ "https://goo.gl/maps/P8r98Kx71zxgYEWt7\r\n", " 020 24459734 |+91-8275765734\r\n"
					,"https://niveditapune.org.in/\r\n","Sadashiv Peth",18.5082,73.8441));
	    locationList.add(new Location("The Poona School and Home For The Blind Girls\r\n", "Address: Survey No.36/3, Gandhi Bhavan Road, Kothrud, Pune, Maharashtra 411038\r\n"+ "https://g.co/kgs/dbMhZU\r\n", " 020 2538 4589\r\n"
					,"https://www.puneblindschool.org/\r\n","Kothrud",18.5074, 73.8077));
	    
	    Location currentLocation = null;
        System.out.println("\nEnter your preferable location:");
        System.out.println("------------------------------------------------------------");
        System.out.println("Vadgaon Sheri\nBavdhan\nCamp\nKothrud\nMohammed Wadi\nShivaji Nagar\nSadashiv Peth");
        System.out.println("------------------------------------------------------------");
        String loc = sc.nextLine();
        for (Location location : locationList) {
            if (location.getplace().equalsIgnoreCase(loc)) {
                currentLocation = location;
                break;
            }
        }
        if (currentLocation == null) {
            System.out.println("Location not found.");
            return;
        }
        Categories main = new Categories();
        LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);
        System.out.println("\nHere are some NGO's according to your preferable location choice :");
	     for (Location location : nearestLocations) {
	    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
	     }
	}
	
	 void Old_AgeHomes() {
		 LinkedList<Location> locationList = new LinkedList<Location>();
		 
		 locationList.add(new Location("Sevadeep","Sky One 14 Th Floor, Nagar Road, Kalyani Nagar-Vadgaon Sheri, Pune - 411006 (Near Lunkad Plazza)\r\n"
	   				+ "https://goo.gl/maps/Rj8t61BgFqMu1bqr8", "06384471011","https://sevadeep.org/\r\n","Vadgaon Sheri",18.5513, 73.9210));
	     locationList.add(new Location("MWF NGO\r\n"," Address : NGO: TRUST\r\n PCMC, HADAPSAR, PUNE\r\n"+ " https://goo.gl/maps/uUBntCqmASeKT5Hq6\r\n", " 9130043999.\r\n","https://mwfngo.com/\r\n","Hadapsar",18.5089, 73.9259));
	     locationList.add(new Location("Helpage India\r\n","9/67, Phule Nagar, Behind Alandi Road R.T.O. Ground,Near Bodhichitta Vihar,Pune - 411006\r\n"
	   				+ "https://goo.gl/maps/fGuAA4Ceo3rhjgZ18\r\n", "08275435513\r\n","https://www.helpageindia.org/\r\n","Phule Nagar",18.5610, 73.8750));
	     locationList.add(new Location("Sanjivani\r\n","FLAT NO 17, SULAI COMPLEX, Near DESAI Hospital, Mohammed Wadi, Pune, Maharashtra 411060\r\n"
	   				+ "https://goo.gl/maps/NgZCbgZPHW7AkVNm8\r\n", "Contact no : 8956253672\r\n","https://sanjivani.ngo/\r\n","Mohammed Wadi",18.4751, 73.9163));
	     locationList.add(new Location("Abhalmaya old age home\r\n","Swapnil Building, National Park, Sinhgad Road'near Indian Oli Petrol Pump,Manikbaug'' Pune Maharashtra India -411051\r\n"
	   				+ "https://goo.gl/maps/faB1Nm9riAJyjrSo6\r\n", " 08048127571\r\n"," https://www.bestoldagehome.com/\r\n","Sinhgad Road",18.6298, 73.7997));
	     locationList.add(new Location("Swaranagari old age home\r\n","Chinchwad - Akurdi Link Rd, Triveni Nagar, Sahyog Nagar, Pimpri-Chinchwad, Maharashtra 411019\r\n"
	   				+ "Location: https://goo.gl/maps/kGGfoEd2tzfxZfmP9\r\n", "  08048047447\r\n"," https://www.oldagehomecare.in/\r\n","Pimpri-Chichwad",18.6298, 73.7997));
	     locationList.add(new Location("Shivtej old age home\r\n"," Raj Plaza, Bhakti Marg Path, New Rajgad Society, Vivek Nagar, Balaji Nagar, Pune, Maharashtra 411043\r\n"
	   				+ " https://goo.gl/maps/sGJxT3rK4o2SmuZKA\r\n", "  08069874579\r\n"," Website: https://shivtejoldagehome.in/\r\n","Balaji nagar",18.4646, 73.8603));
	     locationList.add(new Location(" Mauli Sushrushaa Kendra\r\n","Flat No-1001, Urban Space PH-2, SR No 25/7A , Mohammed Wadi, Autadwadi Handewadi, Maharashtra 411060, India, Mohamadwadi, Pune - 411060\r\n"
	   				+ " https://goo.gl/maps/Myqu6kmL5yxVruPN9\r\n", " 07569011874\r\n"," https://www.sulekha.com/mauli-sushrushaa-kendra-mohamadwadi-pune-contact-address\r\n","Mohammed Wadi",18.4751, 73.9163));
	     locationList.add(new Location(" Jivhala old age homes\r\n","Raavi Nagar, Sus, Pune, Maharashtra 411021, Pune\r\n"+ "https://goo.gl/maps/Eqz1G7tMAjzbBHT68\r\n", " 08048094538\r\n"
	   				,"http://www.jivhalaoldagehome.com/\r\n","Sus",18.5534, 73.7532));
	     locationList.add(new Location("International Longevity Centre\r\n"," CASP Bhavan, S. No. 132/2, Plot 3, Pashan Baner Link Road, Pashan, Pune-411021"+ "https://goo.gl/maps/GusMcqqMBgDvtVYb9\r\n", " 7276695540\r\n"
	   				," https://ilcindia.in/\r\n","Pashan",18.5415, 73.7925));
	     
	     Location currentLocation = null;
	        System.out.println("\nEnter your preferable location:");
	        System.out.println("------------------------------------------------------------");
	        System.out.println("Vadgaon Sheri\nHadapsar\nPhule Nagar\nMohammed Wadi\nSinhgad Road\nPimpri-Chinchwad\nBalaji Nagar\nSus\nPashan");
	        System.out.println("------------------------------------------------------------");
	        String loc = sc.nextLine();
	        for (Location location : locationList) {
	            if (location.getplace().equalsIgnoreCase(loc)) {
	                currentLocation = location;
	                break;
	            }
	        }
	        if (currentLocation == null) {
	            System.out.println("Location not found.");
	            return;
	        }
	        Categories main = new Categories();
	        LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);
	        System.out.println("\nHere are some NGO's according to your preferable location choice :");
		     for (Location location : nearestLocations) {
		    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
		     }
	 }
	 
	 void Animal_Husbandry() {
		 LinkedList<Location> locationList = new LinkedList<Location>();
		 
		 locationList.add(new Location("Helping Hearts\r\n","  1974, Gaffar Baig Street, F/1, Hermes Grace, Pune-1, Maharashtra, India. Regd. No. MAH/568/2017/Pune\r\n"
	 				+ "https://goo.gl/maps/wG6bLoqGozUaoDEL8\r\n", "9922418597\r\n","https://helpingheartsngo.com/\r\n","Camp",18.4990, 73.8957));
		 locationList.add(new Location("Sanjivani\r\n","FLAT NO 17, SULAI COMPLEX, Near DESAI Hospital, Mohammed Wadi, Pune, Maharashtra 411060\r\n"
	 				+ "https://goo.gl/maps/NgZCbgZPHW7AkVNm8\r\n", "Contact no : 8956253672\r\n","https://sanjivani.ngo/\r\n","Mohammed Wadi",18.4751, 73.9163));
		 locationList.add(new Location("Tratr\r\n","Sagar Co-Operative Housing Society, Bavdhan, Pune, Maharashtra\r\n"
	 				+ "https://goo.gl/maps/XvbzYxGFQBmMtWMr7\r\n","9845673476\r\n","https://tratr.org/\r\n","Bavdhan",18.5135 , 73.7699));
		 locationList.add(new Location("ANIMAL VOLUNTEERS OF INDIA\r\n","Address: Water’s Square, G229, Vishal Nagar, Pimple Nilakh, Pune, Maharashtra 411027\r\n"
	 				+ " https://g.co/kgs/MdseGt\r\n","090212 25519\r\n","https://www.animalvolunteersofindia.in/\r\n","Pimple Nilakh",18.5790, 73.7860));
		 locationList.add(new Location("Paw's For A Cause Charitable Trust\r\n","Manorama Apt, 962, Honaji Bala Path, Budhwar Peth, Pune, Maharashtra 411002\r\n"
	 				+ "https://g.co/kgs/oEqwyC\r\n","097657 23123\r\n","https://www.instagram.com/pawsforacausencr/?hl=en\r\n","Budhwar Peth",18.515879,73.85804));
		 locationList.add(new Location("Pranimal Foundation\r\n","B56, Purandar Apartment, Kashid Nagar, Pimple Gurav, Pimpri-Chinchwad, Maharashtra 411061\r\n"
	 				+ "https://g.co/kgs/1MXPFQ\r\n","096970 05454\r\n","https://www.instagram.com/pranimalfoundation/?hl=en\r\n","Pimpri-Chichwad",18.6298, 73.7997));
		 locationList.add(new Location("Society for Animal Safety, India (SAS India)\r\n","Office no 401, Sanskriti Arcade Chhatrapati Chowk, I, Kaspate Wasti, Wakad, Pune, Maharashtra 411057\r\n"
	 				+ "https://g.co/kgs/ahM639\r\n","097305 09104\r\n","https://www.sasindia.org/\r\n","Wakad",18.6011, 73.7641));
		 locationList.add(new Location("Gomata Seva Pratistan\r\n","Address: Gomataseva Pratistan, Near Laxmi Nagar 61/487, Shahu College, Parvati Hills, Parvati Darshan, Pune, Maharashtra 411009\r\n"
	 				+ "https://g.co/kgs/ahM639\r\n","097305 09104\r\n","https://www.sasindia.org/\r\n","Parvati Hills",18.4949, 73.8441));
		 locationList.add(new Location("Sinhagad Animal Welfare Charitable Trust\r\n","Sinhgad Rd, Vadgaon Khurd, Nanded Fata, Pandurang Industrial Area, Nanded, Pune, Maharashtra 411041\r\n"
	 				+ "https://g.co/kgs/1kxN7J\r\n","093731 48876\r\n","https://sawct.org/\r\n","Sinhgad Road",18.6298, 73.7997));
		 
		 Location currentLocation = null;
	        System.out.println("Enter your preferable location:");
	        System.out.println("------------------------------------------------------------");
	        System.out.println("Camp\nMohammed Wadi\nPimple Nilakh\nBudhwar Peth\nPimpri-Chinchwad\nWakad\nParvati Hills\nSinhagad Road");
	        System.out.println("------------------------------------------------------------");
	        String loc = sc.nextLine();
	        for (Location location : locationList) {
	            if (location.getplace().equalsIgnoreCase(loc)) {
	                currentLocation = location;
	                break;
	            }
	        }
	        if (currentLocation == null) {
	            System.out.println("Location not found.");
	            return;
	        }
	        Categories main = new Categories();
	        LinkedList<Location> nearestLocations = main.findNearestLocations(currentLocation, locationList);
	        System.out.println("\nHere are some NGO's according to your preferable location choice :");
		     for (Location location : nearestLocations) {
		    	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		         System.out.println("NGO name : " + location.getname() + "\nNGO Address : " + location.getAddress() + "\nNGO Phone No. : " + location.getPhone() + "\nNGO Website link : " + location.getweblink());
		     }
	    }
	
	 public LinkedList<Location> findNearestLocations(Location currentLocation, LinkedList<Location> locationList) {
		    // create a new linked list to hold the nearest locations
		    LinkedList<Location> nearestLocations = new LinkedList<Location>();
		    
		    // loop until all locations have been processed
		    while (!locationList.isEmpty()) {
		        // find the nearest location to the current location
		        Location nearestLocation = findNearestLocation(currentLocation, locationList);
		        
		        // add the nearest location to the list of nearest locations
		        nearestLocations.add(nearestLocation);
		    }
		    
		    // return the list of nearest locations
		    return nearestLocations;
		}

		public Location findNearestLocation(Location currentLocation, LinkedList<Location> locationList) {
		    // if the location list is empty, return null
		    if (locationList.isEmpty()) {
		        return null;
		    }
		    
		    // initialize the nearest location and shortest distance variables
		    Location nearestLocation = null;
		    double shortestDistance = Double.MAX_VALUE;
		    
		    // loop through all the locations in the list
		    for (Location location : locationList) {
		        // calculate the distance between the current location and the location in the list
		        double distance = calculateDistance(currentLocation, location);
		        
		        // if the distance is shorter than the shortest distance so far, update the nearest location and shortest distance
		        if (distance < shortestDistance) {
		            shortestDistance = distance;
		            nearestLocation = location;
		        }
		    }
		    
		    // remove the nearest location from the list
		    locationList.remove(nearestLocation);
		    
		    // return the nearest location
		    return nearestLocation;
		}

		// calculates the distance between two locations using the haversine formula
		double calculateDistance(Location location1, Location location2) {
		    // get the latitude and longitude of the two locations
		    double lat1 = location1.getLatitude();
		    double lon1 = location1.getLongitude();
		    double lat2 = location2.getLatitude();
		    double lon2 = location2.getLongitude();
		    
		    // calculate the difference in latitude and longitude
		    double dLat = Math.toRadians(lat2 - lat1);
		    double dLon = Math.toRadians(lon2 - lon1);
		    
		    // apply the haversine formula to calculate the distance between the two locations
		    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
		               Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
		               Math.sin(dLon / 2) * Math.sin(dLon / 2);
		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		    double distance = 6371 * c;
		    
		    // return the distance
		    return distance;
		}
}
public class Main {
	public static void main(String[] args) {
				
		// create a Scanner object to read user input
		Scanner sc1 = new Scanner(System.in);
		int ch;
		int temp;
				
		// create objects for Login and Categories classes
		Login l1 = new Login();
		Categories c1 = new Categories();
				
		// print welcome message and ask user to enter 1 to proceed or 0 to exit
		System.out.println("------------------------------------------------------------");
		System.out.println("Welcome, Let's contribute for some social work.....");
		System.out.println("Enter 1 to proceed and 0 to exit :");
		System.out.println("------------------------------------------------------------");
				
		// read user input
		int num = sc1.nextInt();
				
		// check if user entered 1 to proceed
		if (num == 1) {
					
			// print message to ask user to enter their details
			System.out.println("Enter your details below :");
			System.out.println("---------------------------------------------------------");
					
			// call the Accept method from the Login object to get user details
			l1.Accept();
					
			// print message to ask user what they want to do
			do {
			System.out.println("\nWhat do you want to do :");
			System.out.println("----------------------------------------------------------");
			System.out.println("1.Donate\n2.Volunteer\n3.Join");
			System.out.println("----------------------------------------------------------");
					
			// read user input for their choice
			System.out.println("Enter your choice :");
			System.out.println("----------------------------------------------------------");
			ch = sc1.nextInt();
				
			// use a switch statement to execute different cases based on user input
			switch (ch) {
					
			case 1:
				// if user chose to donate, print message to ask which type of NGO they want to donate to
				System.out.println("\nPlease select type of NGO where You want to donate :");
				System.out.println("----------------------------------------------------------");
				System.out.println("1.Food\n2.Environment\n3.Education\n4.Children\n5.Women\n6.Old Age Homes\n7.Healthcare\n8.Mental Health\n9.Specially Abled\n10.Animal Husbandry");
				System.out.println("----------------------------------------------------------");		
				// read user input for their choice
				System.out.println("Enter your choice :");
				System.out.println("----------------------------------------------------------");
				int choice = sc1.nextInt();
				// use a switch statement to execute different cases based on user input
				switch (choice) {
						
				case 1:
					c1.Food();
					break;
				case 2:
					c1.Environment();
					break;
				case 3:
					c1.Education();
					break;
				case 4:
					c1.Children();
					break;
				case 5:
					c1.Women();
					break;
				case 6:
					c1.Old_AgeHomes();
					break;
				case 7:
					c1.Healthcare();
					break;
				case 8:
					c1.Mental_Health();
					break;
				case 9:
					c1.Specially_Abled();
					break;
				case 10:
					c1.Animal_Husbandry();
					break;
				}
						break;
						
			case 2:
				System.out.println("\nPlease select type of NGO where You want to Volunteer:");
				System.out.println("----------------------------------------------------------");
				System.out.println("1.Food\n2.Environment\n3.Education\n4.Children\n5.Women\n6.Old Age Homes\n7.Healthcare\n8.Mental Health\n9.Specially Abled\n10.Animal Husbandry");
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter your choice :");
				System.out.println("----------------------------------------------------------");
				int choice1 = sc1.nextInt();
				switch(choice1) {
				case 1:
					c1.Food();
					break;
				case 2:
					c1.Environment();
					break;
				case 3:
					c1.Education();
					break;
				case 4:
					c1.Children();
					break;
				case 5:
					c1.Women();
					break;
				case 6:
					c1.Old_AgeHomes();
					break;
				case 7:
					c1.Healthcare();
					break;
				case 8:
					c1.Mental_Health();
					break;
				case 9:
					c1.Specially_Abled();
					break;
				case 10:
					c1.Animal_Husbandry();
					break;
				}
				break;
				
			case 3:
				System.out.println("\nPlease select type of NGO where You want to Join:");
				System.out.println("----------------------------------------------------------");
				System.out.println("1.Food\n2.Environment\n3.Education\n4.Children\n5.Women\n6.Old Age Homes\n7.Healthcare\n8.Mental Health\n9.Specially Abled\n10.Animal Husbandry");
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter your choice :");
				System.out.println("----------------------------------------------------------");
				int choice2 = sc1.nextInt();
				switch(choice2) {
				case 1:
					c1.Food();
					break;
				case 2:
					c1.Environment();
					break;
				case 3:
					c1.Education();
					break;
				case 4:
					c1.Children();
					break;
				case 5:
					c1.Women();
					break;
				case 6:
					c1.Old_AgeHomes();
					break;
				case 7:
					c1.Healthcare();
					break;
				case 8:
					c1.Mental_Health();
					break;
				case 9:
					c1.Specially_Abled();
					break;
				case 10:
					c1.Animal_Husbandry();
					break;
				}
				break;
			default :
				System.out.println("Invalid Information");
			}
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println ("\nDo you want to go for one more NGO : ");
			System.out.println ("Press 1 to continue.");
			System.out.println ("Press 0 to end.");
			System.out.println("----------------------------------------------------------");
			temp = sc1.nextInt ();
			if(temp==0) {
				System.out.println("Thank you so much for applying...\nYour Contribution means a lot for society.");
			}
			
			}while(temp==1);
		}
	}
}