package Travel;

import java.util.*;
public class Graph{
	static LinkedList<City> cities;
	String value;
	boolean isBusDist;
	boolean isTrainDist;
	boolean isBusCost;
	boolean isTrainCost;
	boolean isBusTime;
	boolean isTrainTime;
	boolean isDirected;
	
	public Graph(boolean isBusDist,boolean isTrainDist,boolean isBusCost,
			boolean isTrainCost,boolean isBusTime,boolean isTrainTime,boolean isDirected){
		this.cities = new LinkedList<City>();
		this.isBusDist = isBusDist;
		this.isTrainDist=isTrainDist;
		this.isBusCost=isBusCost;
		this.isTrainCost=isTrainCost;
		this.isBusTime=isBusTime;
		this.isTrainTime=isTrainTime;
		this.isDirected=isDirected;
	}
	
	public City addCity(String city) {
		City newCity = new City(city);
		this.cities.add(newCity);
		return newCity;
	}
	
	//Abstraction 
	public void addRoutes(City city1, City city2,Integer busDist,Integer trainDist,Integer busCost,
			Integer trainCost,Integer busTime,Integer trainTime) {
		//Sadhya purt bus dist ghetl aahe
		if(!this.isBusDist) {
			busDist = null;
		}
		city1.addRoutes(city2,busDist,trainDist,busCost,trainCost,busTime,trainTime);
		if(!this.isDirected) {
			city2.addRoutes(city1,busDist,trainDist,busCost,trainCost,busTime,trainTime);
		}
	}
	
	public void removeRoutes(City city1,City city2) {
		city1.removeRoutes(city2);
		if(!this.isDirected) {
			city2.removeRoutes(city1);
		}
	}
	
	public void removeCity(City city) {
		this.cities.remove(city);
	}
	public void removeCity(String cityName) {
	    Iterator<City> iter = this.cities.iterator();
	    while (iter.hasNext()) {
	        City city = iter.next();
	        if (city.getCity().equals(cityName)) {
	            iter.remove();
	            return;
	        }
	    }
	}
	public void removeRoute(String city1Name, String city2Name) {
	    City city1 = getCityByValue(city1Name);
	    City city2 = getCityByValue(city2Name);
	    if (city1 == null || city2 == null) {
	        System.out.println("One or both cities do not exist.");
	        return;
	    }
	    city1.removeRoutes(city2);
	    if (!this.isDirected) {
	        city2.removeRoutes(city1);
	    }
	    System.out.println("Route between " + city1.getCity() + " and " + city2.getCity() + " has been removed.");
	}
	
	
	//Helper methods
	public LinkedList<City> getCities(){
		return this.cities;
	}
	//Sadhya purt bus dist ghetl aahe
	public boolean isBusDist() {
		return this.isBusDist();
	}
	public boolean isDirected() {
		return this.isDirected;
	}

	public City getCityByValue(String value) {
		for(City c : this.cities){
			if(c.getCity().equals(value)) {
				return c;
			}
			else
				continue;
		}
		return null;
	}
	
	public void print() {
		for(City c: this.cities) {
			//Sadhya purt bus dist ghetl aahe
			c.print(isBusDist);
		}
	}
	
	
	//This method add cities to the linked list
	public void addcityy() {
		City MumbaiStation = addCity("Mumbai");
		City PuneStation = addCity("Pune");
		City NagpurStation = addCity("Nagpur");
		City DelhiStation = addCity("Delhi");
		City AmravatiStation = addCity("Amravati");
		City AkolaStation = addCity("Akola");
		City BadneraStation = addCity("Badnera");
		
		addRoutes(MumbaiStation, PuneStation, 40, 30, 45, 30, 1, 2);
		addRoutes(MumbaiStation, DelhiStation, 40, 30, 15, 30, 1, 2);
		addRoutes(MumbaiStation, NagpurStation,80, 60, 55, 60, 2, 4);
		addRoutes(PuneStation, NagpurStation, 40, 30, 10, 30, 1, 2);
		addRoutes(NagpurStation, AmravatiStation, 40, 30, 55, 30, 1, 2);
		addRoutes(AmravatiStation, AkolaStation, 40, 30, 50, 30, 1, 2);
		addRoutes(PuneStation, BadneraStation, 20, 30, 25, 30, 1, 2);
		addRoutes(BadneraStation, AkolaStation, 10, 30, 55, 30, 1, 2);
	} 
	public static void main(String[]args) {
		int choice;
		
		User user = new User();
		Admin admin = new Admin();
		//ya line la error yeu shakto 
		Graph busNetwork = new Graph(true,true,true,true,true,true,false);
		busNetwork.addcityy();
		//Here if we put 'false' for isDirected then the graph becomes undirected
		//else it is directed
		
		Scanner scn = new Scanner(System.in);
		System.out.println("*****WELCOM TO GO TRAVEL*****");
		System.out.println("1.ADMIN LOGIN");
		System.out.println("2.USER LOGIN");
		choice = scn.nextInt();

		switch(choice) {
		case 1:
			String password;
			System.out.print("\nPLEASE ENTER PASSWORD: ");
			password = scn.next();
			password=admin.Checkpassword(password);
			admin.AdminLogin();
			break;

		case 2:
			user.userLogin();
			break;
		}
	}
}

