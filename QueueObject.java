package Travel;

public class QueueObject implements Comparable<QueueObject>{
	public City city;
	public int priority;
	
	public QueueObject(City v,int p) {
		this.city =v;
		this.priority =p;
	}
	
	//override
	public int compareTo(QueueObject o) {
		if(this.priority == o.priority) {
			return 0;
		}
		else if (this.priority > o.priority) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
