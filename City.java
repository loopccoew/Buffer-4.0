package Travel;

import java.util.*;

class City{
	String city;
	LinkedList<Routes> routes;
	int flag=0;
	//Constructor of class City	
	City(String city){
		this.city = city;
		this.routes = new LinkedList<Routes>();
	}

	public void addRoutes(City endCity,Integer busDist,Integer trainDist,Integer busCost,
			Integer trainCost,Integer busTime,Integer trainTime) {
		this.routes.add(new Routes(this,endCity,busDist,trainDist,busCost,trainCost,busTime,trainTime));
	}
	
	public void removeRoutes(City endCity) {
		//The arrow operator is used to create lambda expressions, 
		//linking/separating parameters with the lambda body
		this.routes.removeIf(routes -> routes.getEnd().equals(endCity));
	}
	
	//helper methods
	public String getCity() {
		return this.city;
	}
	
	public LinkedList<Routes> getRoutes(){
		return this.routes;
	}
	
	
	//To show the weights
	public void print(boolean showDist) {

		String message=" ";
		

		if(this.routes.size() == 0) {
			
			System.out.println(this.city+"--->");
			return;
		}
	
		
		for(int i=0;i<this.routes.size();i++) {
			if(i == 0) {
				
				message += this.routes.get(i).getStart().city+"-->";
			}
			
			
		
			message += this.routes.get(i).getEnd().city;
			
			if(showDist) {
				message += "("+ " BusDist"+this.routes.get(i).getBusDist()+" TrainDist"+this.routes.get(i).getTrainDist()+" BusCost"+
						this.routes.get(i).getBusCost()+" TrainCost"+
						this.routes.get(i).getTrainCost()+" BusTime"+this.routes.get(i).getBusTime()+
						" TrainTime"+this.routes.get(i).getTrainTime()+")";
				
			}
			
			
			if(i!= this.routes.size() - 1) {
				message += ", ";
			}
		}
		System.out.println(message);
		
	}


}

