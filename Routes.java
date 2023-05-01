package Travel;

public class Routes {
	City start;
	City end;
	Integer busDist;
	Integer trainDist;
	Integer busCost;
	Integer trainCost;
	Integer busTime;
	Integer trainTime;
	
	//The reason of using Integer is that we can put null if we want to
	Routes(City start,City end,Integer busDist,Integer trainDist,Integer busCost,Integer trainCost,
			Integer busTime,Integer trainTime){
		this.start = start;
		this.end = end;
		this.busDist = busDist;
		this.trainDist  = trainDist;
		this.busCost = busCost;
		this.trainCost = trainCost;
		this.busTime = busTime;
		this.trainTime = trainTime;
	}
	
	public City getStart() {
		return this.start;
	}
	public City getEnd() {
		return this.end;
	}
	public Integer getBusDist() {
		return this.busDist;
	}
	public Integer getTrainDist() {
		return this.trainDist;
	}
	public Integer getBusCost() {
		return this.busCost;
	}
	public Integer getTrainCost() {
		return this.trainCost;
	}
	public Integer getBusTime() {
		return this.busTime;
	}
	public Integer getTrainTime() {
		return this.trainTime;
	}
}