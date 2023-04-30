package Travel;
import java.util.*;

public class Dijikstra {
	static Integer alternative ;
	static int z;
	static String a;
	static int cost;
	
	public int getCost() {
	    return cost;
	}
	
	public static Dictionary[] dijikstra(Graph g, City startingcity) {
		Dictionary<String, Integer> distances = new Hashtable<>();
		Dictionary<String, City> previous = new Hashtable<>();
		PriorityQueue<QueueObject> queue = new PriorityQueue<QueueObject>();
		
		queue.add(new QueueObject(startingcity, 0));
		
		for (City v: g.getCities()) {
			if (v != startingcity) {
				//as we don't want staring vertex to give max value
				distances.put(v.getCity(), Integer.MAX_VALUE);
			}
			previous.put(v.getCity(), new City("Null"));
		}
		//setting starting city to 0
		distances.put(startingcity.getCity(),0);

		while (queue.size() != 0) {
			City current = queue.poll().city;
			for (Routes e: current.getRoutes()) {

				//System.out.println(z);
				if(z==1) {
					alternative = distances.get(current.getCity()) + e.getBusDist();
				}
				else if(z==2) {
					alternative = distances.get(current.getCity()) + e.getBusCost();
				}
				else if(z==3) {
					alternative = distances.get(current.getCity()) + e.getBusTime();
				}
				else if(z==4) {
					alternative = distances.get(current.getCity()) + e.getTrainDist();
				}
				else if(z==5) {
					alternative = distances.get(current.getCity()) + e.getTrainCost();
				}
				else if(z==6) {
					alternative = distances.get(current.getCity()) + e.getTrainTime();
				}
				//                Integer alternative = distances.get(current.getCity()) + e.getBusDist();
				String neighborValue = e.getEnd().getCity();
				if (alternative < distances.get(neighborValue)) {
					distances.put(neighborValue, alternative);
					previous.put(neighborValue, current);
					queue.add(new QueueObject(e.getEnd(), distances.get(neighborValue)));
				}
			}
		}
		return new Dictionary[]{distances, previous};
	}

	public static void shortestPathBetween(Graph g, City startingcity,City targetcity) {
		int Busdist=0;
		int Buscost=0;
		int Bustime=0;
		int Traindist=0;
		int Traincost=0;
		int Traintime=0;

		Dictionary[] dijikstraDictionaries = dijikstra(g, startingcity);
		Dictionary distances = dijikstraDictionaries[0];
		Dictionary previous = dijikstraDictionaries[1];
		Dijikstra dj = new Dijikstra();
		
		Integer distance = (Integer) distances.get(targetcity.getCity());
//		System.out.println("\nShortest Distance between " + startingcity.getCity() + " and " + targetcity.getCity());
//		System.out.println(distance);

		ArrayList<City> path = new ArrayList<>();
		City v = targetcity;
		ArrayList<City> path2 = new ArrayList<>();
		City v2 = targetcity;
		
		while (v.getCity() != "Null") {
			path.add(0, v);
			v = (City) previous.get(v.getCity());
		}

		while (v2.getCity() != "Null") {
			path2.add(v2);

			for(Routes e : v2.getRoutes()) {

				if(z==1) {
					//For bus distance
					for(Routes e1 : v2.getRoutes()) {
						if(e1.getStart().equals(v2) && e1.getEnd().equals((City) previous.get(v2.getCity()))) {
							Buscost += e1.getBusCost();
							Bustime += e1.getBusTime();
						}
					}
				}
				if(z==2) {
					//For bus cost
					for(Routes e1 : v2.getRoutes()) {
						if(e1.getStart().equals(v2) && e1.getEnd().equals((City) previous.get(v2.getCity()))) {
							Busdist += e1.getBusDist();
							Bustime += e1.getBusTime();
						}
					}
				}
				if(z==3) {
					//For bus time
					for(Routes e1 : v2.getRoutes()) {
						if(e1.getStart().equals(v2) && e1.getEnd().equals((City) previous.get(v2.getCity()))) {
							Busdist += e1.getBusDist();
							Buscost += e1.getBusCost();
						}
					}
				}
				if(z==4) {
					//For train distance
					for(Routes e1 : v2.getRoutes()) {
						if(e1.getStart().equals(v2) && e1.getEnd().equals((City) previous.get(v2.getCity()))) {
							Traincost += e1.getTrainCost();
							Traintime += e1.getTrainTime();
						}
					}
				}
				if(z==5) {
					//for train cost
					for(Routes e1 : v2.getRoutes()) {
						if(e1.getStart().equals(v2) && e1.getEnd().equals((City) previous.get(v2.getCity()))) {
							Traindist += e1.getTrainDist();
							Traintime += e1.getTrainTime();
						}
					}
				}
				if(z==6) {
					//for train time
					for(Routes e1 : v2.getRoutes()) {
						if(e1.getStart().equals(v2) && e1.getEnd().equals((City) previous.get(v2.getCity()))) {
							Traindist += e1.getTrainDist();
							Traincost += e1.getTrainCost();
						}
					}
				}
				
				v2 = (City) previous.get(v2.getCity());
			}
			if(v2==null) {
				break;
			}
		}
		if(z==1) {
			System.out.println("\nShortest Distance between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" Km");
			System.out.println("Bus Cost: "+Buscost+" Rs");
			System.out.println("Bus Time: "+Bustime+" hr");
			dj.cost = Buscost;
		}
		if(z==2) {
			System.out.println("\nCheapest cost between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" Rs");
			System.out.println("Bus Distance: "+Busdist+" Km");
			System.out.println("Bus Time: "+Bustime+" hr");
			dj.cost = distance;
		}
		if(z==3) {
			System.out.println("\nLeast Time between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" hr");
			System.out.println("Bus Distance: "+Busdist+" Km");
			System.out.println("Bus Cost: "+Buscost+" Rs");
			dj.cost = Buscost;
		}
		if(z==4) {
			System.out.println("\nShortest Distance between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" Km");
			System.out.println("Train Cost: "+Traincost+" Rs");
			System.out.println("Train Time: "+Traintime+" hr");
			dj.cost = Traincost;
		}
		if(z==5) {
			System.out.println("\nCheapest Cost between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" Rs");
			System.out.println("Train Distance: "+Traindist+" Km");
			System.out.println("Train Time: "+Traintime+" hr");
			dj.cost = distance;
		}
		if(z==6) {
			System.out.println("\nLeast Time between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" hr");
			System.out.println("Train Distance: "+Traindist+" Km");
			System.out.println("Train Cost: "+Traincost+" Rs");
			dj.cost = Traincost;
		}

		int i=1;
		a = "Path : ";
		for (City pathVertex: path){
			if(i<path.size()) {
			a = a+pathVertex.getCity()+"->";
			i++;
			}
			else if(i == path.size()){
				a = a+pathVertex.getCity();
			}
		}
		System.out.println("\n"+a);
		
	}

	public static void dijikstraResultPrinter(Dictionary[] d){
//		System.out.println("Distances:\n");
		for (Enumeration keys = d[0].keys(); keys.hasMoreElements();){
			String nextKey = keys.nextElement().toString();
//			System.out.println(nextKey + ": " + d[0].get(nextKey));
		}
//		System.out.println("\nPrevious:\n");
		for (Enumeration keys = d[1].keys(); keys.hasMoreElements();) 
		{
			String nextKey = keys.nextElement().toString();
			City nextcity = (City) d[1].get(nextKey);
//			System.out.println(nextKey + ": " + nextcity.getCity());

		}

	}
}
