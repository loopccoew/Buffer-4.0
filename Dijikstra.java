package Travel;
import java.util.*;

public class Dijikstra {
	static Integer alternative,alternative1,alternative2;
	static int z=0;
	static int r=0;
	static String a=null;
	public static Dictionary[] dijikstra(Graph g, City startingcity) {
        Dictionary<String, Integer> distances = new Hashtable<>();
        Dictionary<String, City> previous = new Hashtable<>();
        PriorityQueue<QueueObject> queue = new PriorityQueue<QueueObject>();

        queue.add(new QueueObject(startingcity, 0));

        for (City v: g.getCities()) {
            if (v != startingcity) {
                distances.put(v.getCity(), Integer.MAX_VALUE);
            }
            previous.put(v.getCity(), new City("Null"));
        }

        distances.put(startingcity.getCity(),0);

        while (queue.size() != 0) {
            City current = queue.poll().city;
            for (Routes e: current.getRoutes()) {
//            	Userr uu=new Userr();
            	
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

    public static String shortestPathBetween(Graph g, City startingcity,City targetcity) {
    	int Busdist=0;
		int Buscost=0;
		int Bustime=0;
		int Traindist=0;
		int Traincost=0;
		int Traintime=0;
		Trip trip = new Trip(null,null,null,null,null,null);
        Dictionary[] dijikstraDictionaries = dijikstra(g, startingcity);
        Dictionary distances = dijikstraDictionaries[0];
        Dictionary previous = dijikstraDictionaries[1];

        Integer distance = (Integer) distances.get(targetcity.getCity());
       // System.out.println("Shortest Distance between " + startingcity.getCity() + " and " + targetcity.getCity());
        //System.out.println(distance);

        ArrayList<City> path = new ArrayList<>();
        City v = targetcity;
        ArrayList<City> path2 = new ArrayList<>();
        City v2 = targetcity;
        while (v.getCity() != "Null") {
            path.add(0, v);
            v = (City) previous.get(v.getCity());
        }
        while (v.getCity() != "Null") {
			path.add(0, v);
			v = (City) previous.get(v.getCity());
		}
String u="";
		while (v2.getCity() != "Null") {//
			path2.add(v2);

			for(Routes e : v2.getRoutes()) {

				if(z==1) {
					//For bus distance
					for(Routes e1 : v2.getRoutes()) {
						//						System.out.println("start: "+e1.getStart().getCity());
						//						System.out.println("end: "+e1.getEnd().getCity());
						if(e1.getStart().equals(v2) && e1.getEnd().equals((City) previous.get(v2.getCity()))) {
							//						System.out.println("1 "+v2.getCity());
							//						System.out.println("2 "+v2.getRoutes());
							//						System.out.println("3 "+e1.getBusCost());
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
		}//
		if(z==1) {
			u=u+"\nBetween " + startingcity.getCity() + " and " + targetcity.getCity()+":\n\nShortest Distance:"+distance+" Km\n"+
					"Bus Cost: "+Buscost+" Rs\n"+"Bus Time: "+Bustime+" hr\n";
			System.out.println("\nBetween " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" Km");
			System.out.println("Bus Cost: "+Buscost+" Rs");
			System.out.println("Bus Time: "+Bustime+" hr");
		}
		if(z==2) {
			u=u+"\nBetween " + startingcity.getCity() + " and " + targetcity.getCity()+":\n\nCheapest Cost:"+distance+" Rs\n"+
					"Bus Distance: "+Busdist+" Km\n"+"Bus Time: "+Bustime+" hr\n";
			System.out.println("\nCheapest cost between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" Rs");
			System.out.println("Bus Cost: "+Busdist+" Km");
			System.out.println("Bus Time: "+Bustime+" hr");
		}
		if(z==3) {
			u=u+"\nBetween " + startingcity.getCity() + " and " + targetcity.getCity()+":\n\nLeast Time:"+distance+" hr\n"+
					"Bus Distance: "+Busdist+" Km\n"+"Bus Cost: "+Buscost+" Rs\n";
			System.out.println("\nLeast Time between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" hr");
			System.out.println("Bus Cost: "+Busdist+" Km");
			System.out.println("Bus Time: "+Buscost+" Rs");
		}
		if(z==4) {
			u=u+"\nBetween " + startingcity.getCity() + " and " + targetcity.getCity()+":\n\nShortest Distance:"+distance+" Km\n"+
					"Train Cost: "+Traincost+" Rs\n"+"Train Time: "+Traintime+" hr\n";
			System.out.println("\nShortest Distance between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" Km");
			System.out.println("Train Cost: "+Traincost+" Rs");
			System.out.println("Train Time: "+Traintime+" hr");
		}
		if(z==5) {
			u=u+"\nBetween " + startingcity.getCity() + " and " + targetcity.getCity()+":\n\nCheapest Cost:"+distance+" Rs\n"+
					"Train Distance: "+Traindist+" Km\n"+"Train Time: "+Traintime+" hr\n";
			System.out.println("\nCheapest Cost between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" Rs");
			System.out.println("Train Cost: "+Traindist+" Km");
			System.out.println("Train Time: "+Traintime+" hr");
		}
		if(z==6) {
			u=u+"\nBetween " + startingcity.getCity() + " and " + targetcity.getCity()+":\n\nLeast Time:"+distance+" hr\n"+
					"Train Distance: "+Traindist+" Km\n"+"Bus Cost: "+Traincost+" Rs\n";
			System.out.println("\nLeast Time between " + startingcity.getCity() + " and " + targetcity.getCity());
			System.out.println(distance+" hr");
			System.out.println("Train Cost: "+Traindist+" Km");
			System.out.println("Train Time: "+Traincost+" Rs");
		}//
        System.out.println("Shortest Path: ");
        int i=1;
        String ii="Shortest Path: ";
        for (City pathVertex: path){
        	if(i<path.size()) {
        		ii=ii+pathVertex.getCity()+" -> ";
           // System.out.print(pathVertex.getCity()+" -> ");
            i++;}
        	else if(i==path.size()) {
        		 //System.out.println(pathVertex.getCity());
        		ii=ii+pathVertex.getCity();
        	}
        }
return u+"\n"+ii;
    }
	public static void shortestPathBetweennn(Graph g, City startingcity,City targetcity) {
    	int cost=0;
    	Trip trip = new Trip(null,null,null,null,null,null);
    	
        Dictionary[] dijikstraDictionaries = dijikstra(g, startingcity);
        Dictionary distances = dijikstraDictionaries[0];
        Dictionary previous = dijikstraDictionaries[1];
        														
        Integer distance = (Integer) distances.get(targetcity.getCity());
        System.out.println("\nShortest Distance between " + startingcity.getCity() + " and " + targetcity.getCity());
        System.out.println(distance);

        ArrayList<City> path = new ArrayList<>();
        City v = targetcity;

        while (v.getCity() != "Null") {
            path.add(0, v);
            v = (City) previous.get(v.getCity());
        }
//        Trip.storedTrip = new LinkedList<String>();
        //String a=null;
        System.out.println(a);
        a="Shortest Path: ";
        int i=1;
        for (City pathVertex: path){
        	//a=a+pathVertex.getCity()+" -> ";
        	if(i<path.size()) {
        		a=a+pathVertex.getCity()+" -> ";
        		i++;
        	}
////            System.out.print(pathVertex.getCity()+" -> ");
////            i++;}
        	else if(i==path.size()) {
        		a=a+pathVertex.getCity();
        	}
//        		 System.out.println(pathVertex.getCity());
        	}
//        }
        
        System.out.println("\nShortest Path");
        //trip.storedTrip = new String[50];
//        int z=0;
        System.out.println(a);
        //trip.storedTrip[0]=a;
       // System.out.println(trip.storedTrip[0]);
        System.out.println("r"+r);
        r++;
//        for (City pathVertex: path){
//            System.out.println(pathVertex.getCity());
//            trip.storedTrip[i]=pathVertex.getCity();
//            i++;
//           
////            for(Routes e : pathVertex.getRoutes()) {
////            	if(z==1) {
////            	     cost += e.getBusCost();
////            	}
////            }
//        }
        System.out.println("\nCost is : "+cost);
            //For printing time and cost
    
    }
	
    public static int shortestPathBetweenn(Graph g, City startingcity,City targetcity) {
        Dictionary[] dijikstraDictionaries = dijikstra(g, startingcity);
        Dictionary distances = dijikstraDictionaries[0];
        Dictionary previous = dijikstraDictionaries[1];

        Integer distance = (Integer) distances.get(targetcity.getCity());
      
return distance;
    }
    
	public static void dijikstraResultPrinter(Dictionary[] d){
        System.out.println("Distances:\n");
        for (Enumeration keys = d[0].keys(); keys.hasMoreElements();){
            String nextKey = keys.nextElement().toString();
            System.out.println(nextKey + ": " + d[0].get(nextKey));
        }
        System.out.println("\nPrevious:\n");
        for (Enumeration keys = d[1].keys(); keys.hasMoreElements();) 
        {
            String nextKey = keys.nextElement().toString();
            City nextcity = (City) d[1].get(nextKey);
            System.out.println(nextKey + ": " + nextcity.getCity());
        }
	}
}
		




