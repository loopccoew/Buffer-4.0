package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import node.Node4;

public class Free_Checkup {

	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);

	Node4 front;
	Node4 rear;
	Node4 temp;
	int max_count;
	int count;
	int patient_id;
	
	public Free_Checkup()
	{
		rear=null;
		front=null;
		max_count=10;
		count=0;
		patient_id=0;
	}

	int q_full()
	{
		if(count==max_count)
			return 1;

		else
			return 0;
	}

	int q_empty()
	{
		if(count==0)
			return 1;

		else
			return 0;
	}
	public void insert() throws IOException
	{
		int n=0;

		do {
			if(q_full()==1)
				System.out.println("\nQueue Full!!");

			else
			{
				System.out.print("\nEnter the number of records to be added: ");
				int no = Integer.parseInt(br.readLine());

				for(int i=0;i<no;i++)
				{
					patient_id++;
					count++;
					System.out.print("\nEnter patient name: ");
					String patient_name=br.readLine();

					System.out.print("\nEnter patient age: ");
					int patient_age=Integer.parseInt(br.readLine());

					System.out.print("\nEnter patient gender: ");
					String patient_gender=br.readLine();

					System.out.print("\nEnter patient address: ");
					String patient_address=br.readLine();

					System.out.print("\nEnter patient phone no: ");
					String patient_ph_no=br.readLine();

					while(patient_ph_no.length()!=10)
					{
						System.out.println("\nPlease enter 10 digit no!!");
						patient_ph_no=br.readLine();
					}
					Node4 new_node=new Node4(patient_id,patient_name,patient_age,patient_gender,patient_address,patient_ph_no);

					if(front==null && rear==null)
					{
						front=new_node;
						rear=new_node;
					}
					else
					{
						temp=front;

						while(temp.next!=null)
						{
							temp=temp.next;
						}
						temp.next=new_node;
						new_node.prev=rear;
						rear=rear.next;
					}
					System.out.println("\nPatient ID: "+patient_id);
					System.out.println("\nRegistered Successfully!!");
				}
			}
			System.out.println("Do You Want To Continue?");
			System.out.println("\nPRESS : ");
			System.out.println("\n\t1 to CONTINUE");
			System.out.println("\t0 to EXIT");
			n=Integer.parseInt(br.readLine());
			if(n == 0) {
				System.out.println("\nTHANK FOR VISITING");
			}
			
		}while(n==1);
	}

	public void display_free_checkup()
	{
		if(q_empty()==1)
			System.out.println("Queue Empty!!");

		else
		{
			System.out.println("\nTotal No Of Registrations: "+count);
			System.out.println("\nPatient ID\tPatient Name\tPatient Age\tPatient Gender\tPatient Address\tPh No");
			temp=front;
			while(temp!=null)
			{
				System.out.println(temp.patient_id+"\t\t"+temp.patient_name+"\t\t"+temp.patient_age+"\t\t"+temp.patient_gender+"\t\t"+temp.patient_address+"\t\t"+temp.patient_ph_no);
				temp=temp.next;
			}
		}
	}

	public void search() throws NumberFormatException, IOException
	{

		int no=0;

		do {
			if(q_empty()!=1)
			{
				System.out.print("\nEnter the Patient ID to be searched: ");
				int search_id=Integer.parseInt(br.readLine());
				int flag=0;

				temp=front;
				while(temp!=null)
				{
					if(temp.patient_id==search_id)
					{
						flag=1;
						break;
					}
					else
						temp=temp.next;
				}
				if(flag==1)
				{
					System.out.println("\nPATIENT IS FOUND!");
					System.out.println("\nPatient ID: "+temp.patient_id);
					System.out.println("\nPatient Name: "+temp.patient_name);
					System.out.println("\nPatient Age: "+temp.patient_age);
					System.out.println("\nPatient Gender: "+temp.patient_gender);
					System.out.println("\nPatient Address: "+temp.patient_address);
					System.out.println("\nPatient Ph No: "+temp.patient_ph_no);

				}
				else
					System.out.println("\nPatient Not Found!");
			}
			else
				System.out.println("\nNo Registrations Yet!");

			System.out.println("\nDo You Want To Continue?");
			System.out.println("\nPRESS : ");
			System.out.println("\n\t1 to CONTINUE");
			System.out.println("\t0 to EXIT");
			no=Integer.parseInt(br.readLine());
			if(no == 0) {
				System.out.println("\nTHANK FOR VISITING");
			}
		}while(no==1);

	}

	public void delete() throws NumberFormatException, IOException
	{
		int no=0;

		do {
			if(q_empty()!=1)
			{
				System.out.print("\nEnter the Patient Id: ");
				int delete_id=Integer.parseInt(br.readLine());

				int flag=0;

				temp=front;
				while(temp!=null)
				{
					if(temp.patient_id==delete_id)
					{
						flag=1;
						break;
					}
					else
						temp=temp.next;
				}
				if(flag==1)
				{
					System.out.println("\nPATIENT FOUND!");
					if(temp==front&&temp==rear)
					{
						//if(temp.next==null)//ONLY 1 EVENT REGISTERED
						//{
						temp=null;
						front=null;
						rear=null;
					}
					else if(temp==front&&temp!=rear)
					{
						front=front.next;
						temp.next=null;
						temp=null;

					}

					else if(temp==rear && temp!=front)
					{
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
					System.out.println("\nRegistration Deleted!");
				}
				else
					System.out.println("\nPatient Not Found!");
			}
			else
				System.out.println("\nNo Registrations Yet!!");

			System.out.println("\nDo You Want To Continue?");
			System.out.println("\nPRESS : ");
			System.out.println("\n\t1 to CONTINUE");
			System.out.println("\t0 to EXIT");
			no=Integer.parseInt(br.readLine());
			if(no == 0) {
				System.out.println("\nTHANK FOR VISITING");
			}
			
			
		}while(no==1);
	}

}

