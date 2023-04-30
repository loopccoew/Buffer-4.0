package node;

public class Node {
	public Node next;
	public Node prev;
	public int event_no;
	public String event_name;
	public String event_date;
	public String event_time;
	public String event_details;
	public Node(){
		next = null;
		prev = null;
		event_date = "15-03-2023";
		event_time = "9 - 12";
		event_details = "xyz";
	}
}
