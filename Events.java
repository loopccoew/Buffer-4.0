package services;

import node.Node;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Events {
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);

	Node front;
	Node rear;
	Node temp;
	int max_count;
	int count;
	int event_no;
	public Events(){
		front=null;
		rear=null;
		max_count=10;
		count=0;
		event_no=count;
	}
	

	int q_full(){
		if(count==max_count)
			return 1;

		else
			return 0;
	}

	int q_empty(){
		if(count==0)
			return 1;

		else
			return 0;
	}

	public void insert() throws IOException{
		if(q_full()!=1){
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.print("\nENTER NO OF EVENTS : ");
			int no = Integer.parseInt(br.readLine());
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			
			for(int i=0;i<no;i++){
				Node new_node=new Node();
				count++;
				new_node.event_no=count;
				
				System.out.print("\nENTER EVENT NAME "+new_node.event_no+": ");
				new_node.event_name=br.readLine();

				System.out.print("\nENTER EVENT DATE : ");
				new_node.event_date=br.readLine();

				DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");

				LocalDate dt1 = LocalDate.parse(new_node.event_date,format);


				System.out.print("\nENTER EVENT TIME : ");
				new_node.event_time=br.readLine();			

				System.out.print("\nENTER EVENT DETAILS "+new_node.event_no+": ");
				new_node.event_details=br.readLine();
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");

				if(front==null){
					front=new_node;
					rear=new_node;
					System.out.println("\nSUCCESSFULLY ENTERED THE EVENT DETAILS!!!!!!");
				}
				else{
					temp=front;
					while(temp.next!=null){
						temp=temp.next;
					}
					temp.next=new_node;
					new_node.prev=rear;
					rear=rear.next;
					System.out.println("\nSUCCESSFULLY ENTERED THE EVENT DETAILS !!!!!!");
				}
			}
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
		else
			System.out.println("\nQUEUE IS FULL!!");
	}
	public void display(){
		if(q_empty()!=1){
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("\nEVENT NAME \tEVENT DATE \tEVENT TIME \tEVENT DETAILS\n");
			temp=front;
			while(temp!=null){
				System.out.println(temp.event_name+"\t\t"+temp.event_date+"\t\t"+temp.event_time+"\t\t"+temp.event_details);
				temp=temp.next;
				}
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
		else {
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("\nEVENT DETAILS TO BE AANOUNCED !!!!!");
			System.out.println("\nSTAY CONNECTED !!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
	}
	}
	public void search() throws IOException{
		if(q_empty()!=1){
			temp=front;
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.print("\nENTER EVENT NAME  : ");
			String search=br.readLine();
			int flag=0;

			while(temp!=null){
				if(temp.event_name.equals(search)){
					flag=1;
					break;
				}

				temp=temp.next;
			}
			if(flag==0) {
				
				System.out.println("EVENT NOT FOUND !!!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			}
			else{
				System.out.println("EVENT FOUND !!! ");
				System.out.println("\n******* EVENT DETAILS *******");
				System.out.println("\nEVENT NO : "+temp.event_no);
				System.out.println("EVENT NAME : "+temp.event_name);
				System.out.println("EVENT DETAILS : "+temp.event_details);
				System.out.println("EVENT DATE : "+temp.event_date);
				System.out.println("EVENT TIME : "+temp.event_time);
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			}
		}
		else {
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("NO EVENT ANNOUNCED YET !!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
	}
	}
	public void delete() throws IOException{
		if(q_empty()!=1){
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.print("ENTER EVENT NAME : ");
			String delete=br.readLine();
			int flag=0;

			temp=front;
			while(temp!=null){
				while(temp!=null){
					if(temp.event_name.equals(delete)){
						flag=1;
						break;
					}

					temp=temp.next;
				}
				if(flag==0) {
					//System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
					System.out.println("EVENT NOT FOUND !!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}
				else{
					if(temp==front&&temp==rear){
						temp=null;
						front=null;
						rear=null;		
					}
					else if(temp==front&&temp!=rear){
						front=front.next;
						temp.next=null;
						temp=null;
					}
					else if(temp==rear && temp!=front){
						rear=rear.prev;
						rear.next=null;
						temp.prev=null;
						temp=null;
					}
					else
					{
						temp.next.prev=temp.prev;
						temp.prev.next=temp.next;
						temp.prev=null;
						temp.next=null;
						temp=null;

					}
					count--;
					System.out.println("EVENT DELETED!!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}
			}
		}
		else {
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("NO REGISTRATIONS YET !!!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
	}
	}
}

