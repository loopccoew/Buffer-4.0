package appointment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import node.Node2;
import node.Node3;

public class Appointment_Dept3 {

	Scanner input=new Scanner(System.in);
	InputStreamReader i=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(i);

	public Node2 root1;
	Node3 front1;
	Node3 rear1;
	Node3 front2;
	Node3 rear2;


	int sr_no1;
	int sr_no2;

	int max1;
	int max2;

	int count1;
	int count2;

	int o_patient_id1;
	int n_patient_id1;

	public Appointment_Dept3()
	{
		root1=null;
		front1=null;
		rear1=null;
		front2=null;
		rear2=null;

		sr_no1=0;
		sr_no2=0;

		max1=10;
		max2=10;

		count1=0;
		count2=0;

		o_patient_id1=10;
		n_patient_id1=11;


	}

	int q1_full()
	{
		if(count1==max1)
			return 1;

		else
			return 0;
	}

	int q1_empty()
	{
		if(count1==0)
			return 1;

		else
			return 0;
	}

	int q2_full()
	{
		if(count2==max2)
			return 1;

		else
			return 0;
	}

	int q2_empty()
	{
		if(count2==0)
			return 1;

		else
			return 0;
	}

	public void old_patient_dept1() throws IOException//INSERTION IN BST
	{
		Node2 temp;
		int no=0;
		do
		{
			System.out.print("ENTER PATIENT NAME : ");
			String patient_name=br.readLine();

			System.out.print("ENTER PATIENT AGE : ");
			int patient_age=input.nextInt();

			while(patient_age<0)
			{
				System.out.print("ENTER VALID AGE : ");
				patient_age=input.nextInt();
			}
			System.out.print("ENTER PATIENT GENDER : ");
			String patient_gender=br.readLine();

			System.out.print("ENTER PATIENT ADDRESS : ");
			String patient_address=br.readLine();

			System.out.print("ENTER PATIENT MOBILE NUMBER : ");
			String patient_ph_no=br.readLine();

			while(patient_ph_no.length()!=10)
			{
				System.out.print("ENTER VALID MOBILE NUMBER : ");
				patient_ph_no=br.readLine();
			}

			Node2 tree_node=new Node2(o_patient_id1,patient_name,patient_age,patient_gender,patient_address,patient_ph_no);
			if(root1==null)
				root1=tree_node;

			else
			{
				temp=root1;
				while(temp!=null)
				{
					if(temp.patient_id>tree_node.patient_id)
					{
						if(temp.left1==null)
						{
							temp.left1=tree_node;
							break;
						}
						else
							temp=temp.left1;
					}
					else if(temp.patient_id<tree_node.patient_id)
					{
						if(temp.right1==null)
						{
							temp.right1=tree_node;
							break;
						}
						else
							temp=temp.right1;
					}
					else if(temp.patient_id==tree_node.patient_id)
					{
						System.out.println("NO DUPLICATION ALLOWED !!");
						break;
					}
				}
			}
			o_patient_id1--;
			System.out.println("Do you want to add more records : ");
			no=input.nextInt();
		}while(no==1);			
	}

	public void book_app_dept1() throws IOException
	{
		Node2 temp;
		String slot;
		System.out.println("\n\t*********** DEPARTMENT - 3 : PSYCHIATRIST *************");
		System.out.println("\n\t\t1.Doctor - 1 : Dr. GAUTAM KULKARNI");
		System.out.println("1.New Patient\t2.Regular Patient");
		System.out.print("Enter your choice: ");
		int ch1=input.nextInt();

		switch(ch1)
		{
		case 1:

			System.out.print("Enter patient name: ");
			String patient_name=br.readLine();

			System.out.print("Enter patient age: ");
			int patient_age=input.nextInt();

			while(patient_age<0)
			{
				System.out.print("Please enter a valid age: ");
				patient_age=input.nextInt();
			}

			System.out.print("Enter patient gender: ");
			String patient_gender=br.readLine();

			System.out.print("Enter patient address: ");
			String patient_address=br.readLine();

			System.out.print("Enter patient phone no: ");
			String patient_ph_no=br.readLine();

			while(patient_ph_no.length()!=10)
			{
				System.out.print("Please enter a 10 digit Phone no: ");
				patient_ph_no=br.readLine();
			}

			System.out.println("Enter your symptoms: ");
			String sym=br.readLine();

			System.out.println("Enter your previous prescription: ");
			String pres=br.readLine();

			Node2 tree_node1=new Node2(n_patient_id1,patient_name,patient_age,patient_gender,patient_address,patient_ph_no);

			if(root1==null)
				root1=tree_node1;

			else
			{
				temp=root1;
				while(temp!=null)
				{
					if(temp.patient_id>tree_node1.patient_id)
					{
						if(temp.left1==null)
						{
							temp.left1=tree_node1;
							break;
						}
						else
							temp=temp.left1;
					}
					else if(temp.patient_id<tree_node1.patient_id)
					{
						if(temp.right1==null)
						{
							temp.right1=tree_node1;
							break;
						}
						else
							temp=temp.right1;
					}
					else if(temp.patient_id==tree_node1.patient_id)
					{
						System.out.println("No Duplicates Allowed!!");
						break;
					}
				}
			}

			System.out.println("1.9 am to 1 pm\t2.4 pm to 8 pm");
			System.out.println("Enter your slot: ");
			int ch3=input.nextInt();

			if(ch3==1)
			{
				if(q1_full()==1)
					System.out.println("Queue Full!!");

				else
				{
					count1++;
					sr_no1++;
					slot="9 am to 1 pm";
					Node3 queue_node1=new Node3(sr_no1,n_patient_id1,patient_name,slot,patient_age,patient_gender,patient_ph_no,sym,pres);
					if(front1==null)
					{
						front1=queue_node1;
						rear1=queue_node1;
					}

					else
					{
						rear1.next=queue_node1;
						rear1=rear1.next;
					}
				}
				System.out.println("**************************************");
				System.out.println("Appointment Booked Successfully!!");
				System.out.println("Patient ID: "+n_patient_id1);
				System.out.println("Patient Name: "+patient_name);
				System.out.println("Appointment No: "+sr_no1);
				System.out.println("Slot: 9 am to 1 pm");
				System.out.println("**************************************");
				n_patient_id1++;
			}

			else if(ch3==2)
			{
				if(q2_full()==1)
					System.out.println("Queue Full!!");

				else
				{
					count2++;
					sr_no2++;
					slot="4 pm to 8 pm";
					Node3 queue_node2=new Node3(sr_no2,n_patient_id1,patient_name,slot,patient_age,patient_gender,patient_ph_no,sym,pres);

					if(front2==null)
					{
						front2=queue_node2;
						rear2=queue_node2;
					}

					else
					{
						rear2.next=queue_node2;
						rear2=rear2.next;
					}
				}
				System.out.println("**************************************");
				System.out.println("Appointment Booked Successfully!!");
				System.out.println("Patient ID: "+n_patient_id1);
				System.out.println("Patient Name: "+patient_name);
				System.out.println("Appointment No: "+sr_no2);
				System.out.println("Slot: 4 pm to 8 pm");
				System.out.println("**************************************");
				n_patient_id1++;
			}
			else
				System.out.println("Invalid Choice");

			break;

		case 2://for regular patient

			int flag=0;
			System.out.print("Enter Patient ID: ");
			int id=input.nextInt();

			temp=root1;
			if(root1==null)
				System.out.println("Tree Not Created!!");

			else
			{
				while(temp!=null)
				{
					if(temp.patient_id>id)
					{
						temp=temp.left1;
					}
					else if(temp.patient_id<id)
						temp=temp.right1;

					else if(temp.patient_id==id)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					System.out.println("Patient Record Found!!");

					String name=temp.patient_name;
					int age=temp.patient_age;
					String gender=temp.patient_gender;
					String phno=temp.patient_ph_no;
					int patient_id=temp.patient_id;

					System.out.print("Enter Symptoms: ");
					String symp=br.readLine();

					System.out.println("Enter previous prescription: ");
					String pre=br.readLine();

					System.out.println("1.9 am to 1 pm\t2.4 pm to 8 pm");
					System.out.println("Enter your slot: ");
					int ch4=input.nextInt();

					if(ch4==1)
					{
						count1++;
						sr_no1++;
						slot="9 am to 1 pm";

						Node3 queue_node1=new Node3(sr_no1,patient_id,name,slot,age,gender,phno,symp,pre);
						if(front1==null)
						{
							front1=queue_node1;
							rear1=queue_node1;
						}

						else
						{
							rear1.next=queue_node1;
							queue_node1.prev=rear1;
							rear1=rear1.next;
						}
						System.out.println("*************************************");
						System.out.println("Appointment Booked Successfully!!");
						System.out.println("Patient ID: "+patient_id);
						System.out.println("Patient Name: "+name);
						System.out.println("Appointment No: "+sr_no1);
						System.out.println("Slot: 9 am to 1 pm");
						System.out.println("*************************************");
					}

					else if(ch4==2)
					{
						count2++;
						sr_no2++;
						slot="4 pm to 8 pm";
						Node3 queue_node2=new Node3(sr_no2,patient_id,name,slot,age,gender,phno,symp,pre);

						if(front2==null)
						{
							front2=queue_node2;
							queue_node2.prev=rear2;
							rear2=queue_node2;
						}

						else
						{
							rear2.next=queue_node2;
							rear2=rear2.next;
						}
						System.out.println("*************************************");
						System.out.println("Appointment Booked Successfully!!");
						System.out.println("Patient ID: "+patient_id);
						System.out.println("Patient Name: "+name);
						System.out.println("Appointment No: "+sr_no2);
						System.out.println("Slot: 4 pm to 8 pm");
						System.out.println("*************************************");
					}

					else
						System.out.println("Invalid Choice");


				}
				else
					System.out.println("Patient Record Not Found!!");
			}

			break;

		default:
			System.out.println("Invalid Choice!!");
		}

	}

	public void display_q1()
	{
		Node3 temp;

		if(q1_empty()==1)
			System.out.println("No Appointments Booked Yet!!");

		else
		{
			temp=front1;
			while(temp!=null)
			{
				System.out.println("**********************************");
				System.out.println("Appointment No: "+temp.sr_no);
				System.out.println("Patient ID: "+temp.patient_id);
				System.out.println("Patient Name: "+temp.patient_name);
				System.out.println("Patient Age: "+temp.patient_age);
				System.out.println("Patient Gender: "+temp.patient_gender);
				System.out.println("Symptoms: "+temp.symptoms);
				System.out.println("Previous Prescription: "+temp.prescription);
				System.out.println("**********************************");

				temp=temp.next;
			}
		}
	}

	public void display_q2()
	{
		Node3 temp;
		if(q2_empty()==1)
			System.out.println("No Appointments Booked Yet!!");

		else
		{
			temp=front2;
			while(temp!=null)
			{
				System.out.println("**********************************");
				System.out.println("Appointment No: "+temp.sr_no);
				System.out.println("Patient ID: "+temp.patient_id);
				System.out.println("Patient Name: "+temp.patient_name);
				System.out.println("Patient Age: "+temp.patient_age);
				System.out.println("Patient Gender: "+temp.patient_gender);
				System.out.println("Symptoms: "+temp.symptoms);
				System.out.println("Previous Prescription: "+temp.prescription);
				System.out.println("**********************************");

				temp=temp.next;
			}
		}
	}

	public void display_q1q2()
	{
		Node3 temp;
		System.out.println("------Slot 1------");

		temp=front1;
		while(temp!=null)
		{
			System.out.println("**********************************");
			System.out.println("Appointment No: "+temp.sr_no);
			System.out.println("Patient ID: "+temp.patient_id);
			System.out.println("Patient Name: "+temp.patient_name);
			System.out.println("Patient Age: "+temp.patient_age);
			System.out.println("Patient Gender: "+temp.patient_gender);
			System.out.println("Symptoms: "+temp.symptoms);
			System.out.println("Previous Prescription: "+temp.prescription);
			System.out.println("**********************************");

			temp=temp.next;
		}

		System.out.println("------Slot 2------");

		temp=front2;
		while(temp!=null)
		{
			System.out.println("**********************************");
			System.out.println("Appointment No: "+temp.sr_no);
			System.out.println("Patient ID: "+temp.patient_id);
			System.out.println("Patient Name: "+temp.patient_name);
			System.out.println("Patient Age: "+temp.patient_age);
			System.out.println("Patient Gender: "+temp.patient_gender);
			System.out.println("Symptoms: "+temp.symptoms);
			System.out.println("Previous Prescription: "+temp.prescription);
			System.out.println("**********************************");

			temp=temp.next;
		}
	}

	public void delete_q1()
	{
		System.out.print("Enter your patient id: ");
		int id=input.nextInt();
		int flag=0;

		Node3 temp;
		temp=front1;

		while(temp!=null)
		{
			if(temp.patient_id==id)
			{
				flag=1;
				break;
			}
			temp=temp.next;
		}

		if(flag==1)
		{
			if(temp.next==null&&temp.prev==null)
			{
				temp=null;
				front1=null;
				rear1=null;
			}
			else if(temp==front1)
			{
				front1=front1.next;
				front1.prev=null;
				temp.next=null;
				temp=null;
			}
			else if(temp==rear1)
			{
				rear1=rear1.prev;
				rear1.next=null;
				temp.prev=null;
				temp=null;
			}
			else
			{
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;

				temp.prev=null;
				temp.next=null;
				temp=null;
			}
			count1--;
			System.out.println("Appointment Deleted Successfully!!");
		}
		else
			System.out.println("Patient record not Found!!");
	}
	public void delete_q2()
	{
		System.out.print("Enter your patient id: ");
		int id=input.nextInt();
		int flag=0;

		Node3 temp;
		temp=front2;

		while(temp!=null)
		{
			if(temp.patient_id==id)
			{
				flag=1;
				break;
			}
			temp=temp.next;
		}

		if(flag==1)
		{
			if(temp.next==null&&temp.prev==null)
			{
				temp=null;
				front2=null;
				rear2=null;
			}
			else if(temp==front2)
			{
				front2=front2.next;
				front2.prev=null;
				temp.next=null;
				temp=null;
			}
			else if(temp==rear2)
			{
				rear2=rear2.prev;
				rear2.next=null;
				temp.prev=null;
				temp=null;
			}
			else
			{
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				temp=null;
			}
			count2--;
			System.out.println("Appointment Deleted Successfully!!");
		}
	}

	public void display_record(Node2 root) {

		if(root!=null)
		{
			display_record(root.left1);
			System.out.println(root.patient_id+"\t\t"+root.patient_name+"\t\t"+root.patient_age+"\t\t"+root.patient_gender+"\t\t"+root.patient_address+"\t\t"+root.patient_ph_no);			
			display_record(root.right1);
		}
	}

	public void update_tree() throws IOException
	{
		Node2 temp;

		int flag=0;

		System.out.print("Enter Patient ID: ");
		int id=input.nextInt();

		temp=root1;
		if(root1==null)
			System.out.println("Tree Not Created!!");

		else
		{
			while(temp!=null)
			{
				if(temp.patient_id>id)
				{
					temp=temp.left1;
				}
				else if(temp.patient_id<id)
					temp=temp.right1;

				else if(temp.patient_id==id)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Patient Record Not Found!!");
			}
			else
			{
				System.out.println("Patient Record Found!!");
				System.out.print("1.Patient Age\t2.Patient Address\t3.Patient Mobile No");
				System.out.print("Enter your choice: ");
				int ch=input.nextInt();

				switch(ch)
				{
				case 1:
					System.out.print("Enter new age: ");
					int n_age=input.nextInt();

					while(n_age<0)
					{
						System.out.print("Please enter a valid age: ");
						n_age=input.nextInt();
					}
					temp.patient_age=n_age;

					break;

				case 2:
					System.out.print("Enter new address: ");
					String n_addr=input.next();

					temp.patient_address=n_addr;
					break;

				case 3:
					System.out.print("Enter new Mobile no: ");
					String n_no=br.readLine();

					while(n_no.length()!=10)
					{
						System.out.print("Please enter a 10 digit Mobile No: ");
						n_no=br.readLine();
					}

					temp.patient_ph_no=n_no;
					break;

				default:
					System.out.println("Invalid Choice!");
				}
			}
		}
	}

}
