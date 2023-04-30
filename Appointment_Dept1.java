package appointment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import node.Node;
import node.Node2;
import node.Node3;

public class Appointment_Dept1 {

	Scanner input=new Scanner(System.in);
	InputStreamReader i=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(i);

	public Node2 root1;
	Node3 front1;
	Node3 rear1;
	Node3 front2;
	Node3 rear2;
	Node3 front3;
	Node3 rear3;
	Node3 front4;
	Node3 rear4;

	int sr_no1;
	int sr_no2;
	int sr_no3;
	int sr_no4;
	int max1;
	int max2;
	int max3;
	int max4;

	int count1;
	int count2;
	int count3;
	int count4;

	int o_patient_id1;
	int n_patient_id1;

	public Appointment_Dept1()
	{
		root1=null;
		front1=null;
		rear1=null;
		front2=null;
		rear2=null;
		front3=null;
		rear3=null;
		front4=null;
		rear4=null;
		sr_no1=0;
		sr_no2=0;
		sr_no3=0;
		sr_no4=0;
		max1=10;
		max2=10;
		max3=0;
		max4=0;
		count1=0;
		count2=0;
		count3=0;
		count4=0;
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

	int q3_full()
	{
		if(count3==max1)
			return 1;

		else
			return 0;
	}

	int q3_empty()
	{
		if(count3==0)
			return 1;

		else
			return 0;
	}
	int q4_full()
	{
		if(count4==max1)
			return 1;

		else
			return 0;
	}

	int q4_empty()
	{
		if(count4==0)
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
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.print("\nENTER PATIENT NAME : ");
			String patient_name=br.readLine();

			System.out.print("\nENTER PATIENT AGE : ");
			int patient_age=input.nextInt();

			while(patient_age<0)
			{
				System.out.print("\nPLEASE ENTER VALID AGE : ");
				patient_age=input.nextInt();
			}
			System.out.print("\nENTER PATIENT GENDER : ");
			String patient_gender=br.readLine();

			System.out.print("\nENTER PATIENT ADDRESS : ");
			String patient_address=br.readLine();

			System.out.print("\nENTER PATIENT MOBILE NUMBER : ");
			String patient_ph_no=br.readLine();

			while(patient_ph_no.length()!=10)
			{
				System.out.print("\nPLEASE ENTER VALID MOBILE NUMBER : ");
				patient_ph_no=br.readLine();
			}
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");

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
						System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
						System.out.println("NO DUPLICATIONS ALLOWED !!");
						System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
						break;
					}
				}
			}
			o_patient_id1--;
			System.out.println("\nDo you want to add more records : ");
			no=input.nextInt();
		}while(no==1);			
	}

	public void book_app_dept1() throws IOException
	{
		
		Node2 temp;
		String slot;
		System.out.println("\n\t*********** DEPARTMENT - 1 : PEDIATRICIAN *************");
		System.out.println("\n\t\t1.Doctor - 1 : Dr. NEETA KHONDALLA\n\t\t2.Doctor- 2 : Dr. SAKSHI WANKHEDE");
		System.out.print("\nENTER YOUR CHOICE : ");
		int ch1=input.nextInt();

		switch(ch1)
		{

		case 1://for doctor

			System.out.println("\n\t1.NEW PATIENT \t2.REGULAR PATIENT");
			System.out.print("\nENTER YOUR CHOICE : ");
			int ch2=input.nextInt();

			switch(ch2)
			{
			case 1://for new patient
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				System.out.print("\nENTER PATIENT NAME : ");
				String patient_name=br.readLine();

				System.out.print("\nENTER PATIENT AGE : ");
				int patient_age=input.nextInt();

				while(patient_age<0)
				{
					System.out.print("\nPLEASE ENTER VALID AGE : ");
					patient_age=input.nextInt();
				}
				
				System.out.print("\nENTER PATIENT GENDER : ");
				String patient_gender=br.readLine();

				System.out.print("\nENTER PATIENT ADDRESS : ");
				String patient_address=br.readLine();

				System.out.print("\nENTER PATIENT MOBILE NUMBER : ");
				String patient_ph_no=br.readLine();
				
				while(patient_ph_no.length()!=10)
				{
					System.out.print("\nPLEASE ENTER VALID MOBLE NUMBER : ");
					patient_ph_no=br.readLine();
				}

				System.out.println("\nENTER YOUR SYMPTOMS : ");
				String sym=br.readLine();

				System.out.println("\nENTER YOUR PREVIOUS PRESCRIPTION : ");
				String pres=br.readLine();
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
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
							System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
							System.out.println("NO DUPLICATIONS ALLOWED !!");
							System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
							break;
						}
					}
				}
				System.out.println("\n\t***** BOOK YOUR SLOT TIME ******");
				System.out.println("\n\t\t1.9 am to 1 pm\n\t\t2.4 pm to 8 pm");
				System.out.println("\nENTER YOUR SLOT : ");
				int ch3=input.nextInt();

				if(ch3==1)
				{
					if(q1_full()==1)
						System.out.println("\nQUEUE FULL !!");

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
					System.out.println("\n**************************************\n");
					System.out.println("APPOINTMENT BOOKED SUCCESSFULLY !!");
					System.out.println("\nPATIENT ID: "+n_patient_id1);
					System.out.println("\nPATIENT NAME : "+patient_name);
					System.out.println("\nAPPOINTMENT NO. : "+sr_no1);
					System.out.println("\nSLOT : 9 am to  1 pm");
					System.out.println("\n**************************************\n");
					n_patient_id1++;
				}

				else if(ch3==2)
				{
					if(q2_full()==1)
						System.out.println("\nQUEUE FULL !!");

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
					System.out.println("\n**************************************\n");
					System.out.println("APPOINTMENT BOOKED SUCCESSFULLY !!");
					System.out.println("\nPATIENT ID: "+n_patient_id1);
					System.out.println("\nPATIENT NAME : "+patient_name);
					System.out.println("\nAPPOINTMENT NO. : "+sr_no2);
					System.out.println("\nSLOT : 4 pm to  8 pm");
					System.out.println("\n**************************************\n");
					n_patient_id1++;
				}
				else
					System.out.println("\nINVALID CHOICE !!");

				break;

			case 2://for regular patient

				int flag=0;
				System.out.print("\nENTER PATIENT ID: ");
				int id=input.nextInt();

				temp=root1;
				if(root1==null)
					System.out.println("\nRECORDS NOT CREATED YET !!");

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
						System.out.println("\nPATIENT RECORD FOUND !!");

						String name=temp.patient_name;
						int age=temp.patient_age;
						String gender=temp.patient_gender;
						String phno=temp.patient_ph_no;
						int patient_id=temp.patient_id;
			
						System.out.print("\nENTER SYMPTOMS : ");
						String symp=br.readLine();

						System.out.println("\nENTER PREVIUOS PRESCRIPTIONS : ");
						String pre=br.readLine();
						System.out.println("\n\t**** BOOK YOUR SLOT TIME  *****");

						System.out.println("\n\t\t1.9 am to  1 pm\n\t\t2.4 pm to 8 pm");
						System.out.println("\nENTER YOUR SLOT : ");
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
							System.out.println("\n*************************************\n");
							System.out.println("APPOINTMENT BOOKED SUCCESSFULLY !!");
							System.out.println("\nPATIENT ID : "+patient_id);
							System.out.println("\nPATIENT NAME : "+name);
							System.out.println("\nAPPOINTMENT NO. : "+sr_no1);
							System.out.println("\nSLOT : 9 am to  1 pm");
							System.out.println("\n*************************************\n");
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
							System.out.println("\n*************************************\n");
							System.out.println("APPOINTMENT BOOKED SUCCESSFULLY !!");
							System.out.println("\nPATIENT ID : "+patient_id);
							System.out.println("\nPATIENT NAME : "+name);
							System.out.println("\nAPPOINTMENT NO. : "+sr_no2);
							System.out.println("\nSLOT : 4 pm to  8 pm");
							System.out.println("\n*************************************\n");
						}

						else
							System.out.println("\nINVALID CHOICE");


					}
					else
						System.out.println("\nPATIENT RECORD NOT FOUND !!");
				}

				break;

			default:
				System.out.println("\nINVALID CHOICE !!");
			}

			break;

		case 2://for doct 2

			System.out.println("\n\t1.NEW PATIENT \t2.REGULAR PATIENT");
			System.out.print("\nENTER YOUR CHOICE : ");
			int ch3=input.nextInt();

			switch(ch3)
			{
			case 1:

				System.out.print("\nENTER PATIENT NAME : ");
				String patient_name=br.readLine();

				System.out.print("\nENTER PATIENT AGE  : ");
				int patient_age=input.nextInt();
				
				while(patient_age<0)
				{
					System.out.print("\nPLEASE ENTER VALID AGE  : ");
					patient_age=input.nextInt();
				}

				System.out.print("\nENTER PATIENT GENDER  : ");
				String patient_gender=br.readLine();

				System.out.print("\nENTER PATIENT ADDRESS  : ");
				String patient_address=br.readLine();

				System.out.print("\nENTER PATIENT MOBILE NUMBER  : ");
				String patient_ph_no=br.readLine();
				
				while(patient_ph_no.length()!=10)
				{
					System.out.print("\nPLEASE ENTER VALID MOBLE NUMBER : ");
					patient_ph_no=br.readLine();
				}

				System.out.println("\nENTER YOUR SYMPTOMS : ");
				String sym=br.readLine();

				System.out.println("\nENTER YOUR PREVIOUS PRESCRIPTION : ");
				String pres=br.readLine();

				Node2 tree_node2=new Node2(n_patient_id1,patient_name,patient_age,patient_gender,patient_address,patient_ph_no);

				if(root1==null)
					root1=tree_node2;

				else
				{
					temp=root1;
					while(temp!=null)
					{
						if(temp.patient_id>tree_node2.patient_id)
						{
							if(temp.left1==null)
							{
								temp.left1=tree_node2;
								break;
							}
							else
								temp=temp.left1;
						}
						else if(temp.patient_id<tree_node2.patient_id)
						{
							if(temp.right1==null)
							{
								temp.right1=tree_node2;
								break;
							}
							else
								temp=temp.right1;
						}
						else if(temp.patient_id==tree_node2.patient_id)
						{
							System.out.println("\nNO DUPLICATIONS ALLOWED !!");
							break;
						}
					}
				}

				System.out.println("\n\t***** BOOK YOUR SLOT TIME ******");
				System.out.println("\n\t\t1.9 am to 1 pm\n\t\t2.4 pm to 8 pm");
				System.out.println("\nENTER YOUR SLOT : ");
				int ch4=input.nextInt();

				if(ch4==1)
				{
					if(q3_full()==1)
						System.out.println("\nQUEUE FULL !!");

					else
					{
						count3++;
						sr_no3++;
						slot="9 am to 1 pm";
						Node3 queue_node3=new Node3(sr_no3,n_patient_id1,patient_name,slot,patient_age,patient_gender,patient_ph_no,sym,pres);
						if(front3==null)
						{
							front3=queue_node3;
							rear3=queue_node3;
						}

						else
						{
							rear3.next=queue_node3;
							rear3=rear3.next;
						}
					}
					System.out.println("\n**************************************\n");
					System.out.println("APPOINTMENT BOOKED SUCCESSFULLY !!");
					System.out.println("\nPATIENT ID:  : "+n_patient_id1);
					System.out.println("\nPATIENT NAME : "+patient_name);
					System.out.println("\nAPPOINTMENT NO. : "+sr_no3);
					System.out.println("\nSLOT : 9 am to 1 pm");
					System.out.println("\n**************************************\n");
					n_patient_id1++;
				}

				else if(ch4==2)
				{
					if(q4_full()==1)
						System.out.println("\nQUEUE FULL !!");

					else
					{
						count4++;
						sr_no4++;
						slot="4 pm to 8 pm";
						Node3 queue_node4=new Node3(sr_no4,n_patient_id1,patient_name,slot,patient_age,patient_gender,patient_ph_no,sym,pres);

						if(front4==null)
						{
							front4=queue_node4;
							rear4=queue_node4;
						}

						else
						{
							rear4.next=queue_node4;
							rear4=rear4.next;
						}
					}
					System.out.println("\n**************************************\n");
					System.out.println("APPOINTMENT BOOKED SUCCESSFULLY !!");
					System.out.println("\nPATIENT ID : "+n_patient_id1);
					System.out.println("\nPATIENT NAME : "+patient_name);
					System.out.println("\nAPPOINTMENT NO. :  "+sr_no4);
					System.out.println("\nSLOT : 4 pm to 8 pm");
					System.out.println("\n**************************************\n");
					n_patient_id1++;
				}
				else
					System.out.println("\nINVALID CHOICE !!");

				break;

			case 2:

				int flag=0;
				System.out.print("\nENTER PATIENT ID : ");
				int id=input.nextInt();

				temp=root1;
				if(root1==null)
					System.out.println("\nRECORDS NOT CREATED YET !!");

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
						System.out.println("\nPATIENT RECORD FOUND !!");

						String name=temp.patient_name;
						int age=temp.patient_age;
						String gender=temp.patient_gender;
						String phno=temp.patient_ph_no;
						int patient_id=temp.patient_id;
						
						System.out.print("\nENTER SYMPTOMS : ");
						String symp=br.readLine();

						System.out.println("\nENTER PREVIUOS PRESCRIPTIONS : ");
						String pre=br.readLine();

						System.out.println("\n\t**** BOOK YOUR SLOT TIME  *****");
						System.out.println("\n\t\t1.9 am to  1 pm\n\t\t2.4 pm to 8 pm");
						System.out.println("\nENTER YOUR SLOT : ");
						int ch5=input.nextInt();

						if(ch5==1)
						{
							count3++;
							sr_no3++;
							slot="9 am to 1 pm";

							Node3 queue_node3=new Node3(sr_no3,patient_id,name,slot,age,gender,phno,symp,pre);
							if(front3==null)
							{
								front3=queue_node3;
								rear3=queue_node3;
							}

							else
							{
								rear3.next=queue_node3;
								queue_node3.prev=rear3;
								rear3=rear3.next;
							}
							System.out.println("\n*************************************\n");
							System.out.println("APPOINTMENT BOOKED SUCCESSFULLY !!");
							System.out.println("\nPATIENT ID  : "+patient_id);
							System.out.println("\nPATIENT NAME  : "+name);
							System.out.println("\nAPPOINTMENT NO : "+sr_no3);
							System.out.println("\nSLOT : 9 am to 1 pm");
							System.out.println("\n*************************************\n");
						}

						else if(ch5==2)
						{
							count4++;
							sr_no4++;
							slot="4 pm to 8 pm";
							Node3 queue_node4=new Node3(sr_no4,patient_id,name,slot,age,gender,phno,symp,pre);

							if(front4==null)
							{
								front4=queue_node4;
								queue_node4.prev=rear4;
								rear4=queue_node4;
							}

							else
							{
								rear2.next=queue_node4;
								rear2=rear2.next;
							}
							System.out.println("\n*************************************\n");
							System.out.println("APPOINTMENT BOOKED SUCCESSFULLY !!");
							System.out.println("\nPATIENT ID  : "+patient_id);
							System.out.println("\nPATIENT NAME  : "+name);
							System.out.println("\nAPPOINTMENT NO. : "+sr_no2);
							System.out.println("\nSlot: 4 pm to 8 pm");
							System.out.println("\n*************************************\n");
						}

						else
							System.out.println("\nINVALID CHOICE !!");


					}
					else
						System.out.println("\nPATIENT RECORD NOT FOUND !!");
				}

				break;

			default:
				System.out.println("\nINVALID CHOICE !!");
			}

			break;

		default:
			System.out.println("\nINVALID CHOICE !!");
		}
	}

	public void display_q1()
	{
		Node3 temp;

		if(q1_empty()==1)
			System.out.println("\nNO APPOINTMENT BOOKED YET !!");

		else
		{
			temp=front1;
			while(temp!=null)
			{
				System.out.println("\n**********************************\n");
				System.out.println("APPOINTMENT NO. : "+temp.sr_no);
				System.out.println("\nPATIENT ID : "+temp.patient_id);
				System.out.println("\nPATEINT NAME : "+temp.patient_name);
				System.out.println("\nPATIENT AGE : "+temp.patient_age);
				System.out.println("\nPATIENT GENDER : "+temp.patient_gender);
				System.out.println("\nSYMPTOMS : "+temp.symptoms);
				System.out.println("\nPREVIOUS PRESCRIPTIONS : "+temp.prescription);
				System.out.println("\n**********************************\n");

				temp=temp.next;
			}
		}
	}

	public void display_q2()
	{
		Node3 temp;
		if(q2_empty()==1)
			System.out.println("\nNO APPOINTMENT BOOKED YET !!");

		else
		{
			temp=front2;
			while(temp!=null)
			{
				System.out.println("\n**********************************\n");
				System.out.println("APPOINTMENT NO. : "+temp.sr_no);
				System.out.println("\nPATIENT ID : "+temp.patient_id);
				System.out.println("\nPATEINT NAME : "+temp.patient_name);
				System.out.println("\nPATIENT AGE : "+temp.patient_age);
				System.out.println("\nPATIENT GENDER : "+temp.patient_gender);
				System.out.println("\nSYMPTOMS : "+temp.symptoms);
				System.out.println("\nPREVIOUS PRESCRIPTIONS : "+temp.prescription);
				System.out.println("\n**********************************\n");

				temp=temp.next;
			}
		}
	}

	public void display_q3()
	{
		Node3 temp;

		if(q3_empty()==1)
			System.out.println("\nNO APPOINTMENT BOOKED YET !!");

		else
		{
			temp=front3;
			while(temp!=null)
			{
				System.out.println("\n**********************************\n");
				System.out.println("APPOINTMENT NO. : "+temp.sr_no);
				System.out.println("\nPATIENT ID : "+temp.patient_id);
				System.out.println("\nPATEINT NAME : "+temp.patient_name);
				System.out.println("\nPATIENT AGE : "+temp.patient_age);
				System.out.println("\nPATIENT GENDER : "+temp.patient_gender);
				System.out.println("\nSYMPTOMS : "+temp.symptoms);
				System.out.println("\nPREVIOUS PRESCRIPTIONS : "+temp.prescription);
				System.out.println("\n**********************************\n");

				temp=temp.next;
			}
		}
	}

	public void display_q4()
	{
		Node3 temp;

		if(q4_empty()==1)
			System.out.println("\nNO APPOINTMENT BOOKED YET !!");

		else
		{
			temp=front4;
			while(temp!=null)
			{
				System.out.println("\n**********************************\n");
				System.out.println("APPOINTMENT NO. : "+temp.sr_no);
				System.out.println("\nPATIENT ID : "+temp.patient_id);
				System.out.println("\nPATEINT NAME : "+temp.patient_name);
				System.out.println("\nPATIENT AGE : "+temp.patient_age);
				System.out.println("\nPATIENT GENDER : "+temp.patient_gender);
				System.out.println("\nSYMPTOMS : "+temp.symptoms);
				System.out.println("\nPREVIOUS PRESCRIPTIONS : "+temp.prescription);
				System.out.println("\n**********************************\n");

				temp=temp.next;
			}
		}
	}

	public void display_q1q2()
	{
		Node3 temp;
		System.out.println("\n\t ***** Slot 1 ******");

		temp=front1;
		while(temp!=null)
		{
			System.out.println("\n**********************************\n");
			System.out.println("APPOINTMENT NO. : "+temp.sr_no);
			System.out.println("\nPATIENT ID : "+temp.patient_id);
			System.out.println("\nPATEINT NAME : "+temp.patient_name);
			System.out.println("\nPATIENT AGE : "+temp.patient_age);
			System.out.println("\nPATIENT GENDER : "+temp.patient_gender);
			System.out.println("\nSYMPTOMS : "+temp.symptoms);
			System.out.println("\nPREVIOUS PRESCRIPTIONS : "+temp.prescription);
			System.out.println("\n**********************************\n");

			temp=temp.next;
		}

		System.out.println("\n\t****** Slot 2 ******");

		temp=front2;
		while(temp!=null)
		{
			System.out.println("\n**********************************\n");
			System.out.println("\n\t\tAPPOINTMENT NO. : "+temp.sr_no);
			System.out.println("\nPATIENT ID : "+temp.patient_id);
			System.out.println("\nPATEINT NAME : "+temp.patient_name);
			System.out.println("\nPATIENT AGE : "+temp.patient_age);
			System.out.println("\nPATIENT GENDER : "+temp.patient_gender);
			System.out.println("\nSYMPTOMS : "+temp.symptoms);
			System.out.println("\nPREVIOUS PRESCRIPTIONS : "+temp.prescription);
			System.out.println("\n**********************************\n");

			temp=temp.next;
		}
	}
	public void display_q3q4()
	{
		Node3 temp;
		System.out.println("\n\t ******* Slot 1 ********");

		temp=front3;
		while(temp!=null)
		{
			System.out.println("\n\t**********************************");
			System.out.println("\n\t\tAPPOINTMENT NO. : "+temp.sr_no);
			System.out.println("\t\tPATIENT ID : "+temp.patient_id);
			System.out.println("\t\tPATEINT NAME : "+temp.patient_name);
			System.out.println("\t\tPATIENT AGE : "+temp.patient_age);
			System.out.println("\t\tPATIENT GENDER : "+temp.patient_gender);
			System.out.println("\t\tSYMPTOMS : "+temp.symptoms);
			System.out.println("\t\tPREVIOUS PRESCRIPTIONS : "+temp.prescription);
			System.out.println("\n**********************************\n");

			temp=temp.next;
		}

		System.out.println("\n\t****** Slot 2 *******");

		temp=front4;
		while(temp!=null)
		{
			System.out.println("\n\t**********************************");
			System.out.println("\n\t\tAPPOINTMENT NO. : "+temp.sr_no);
			System.out.println("\t\tPATIENT ID : "+temp.patient_id);
			System.out.println("\t\tPATEINT NAME : "+temp.patient_name);
			System.out.println("\t\tPATIENT AGE : "+temp.patient_age);
			System.out.println("\t\tPATIENT GENDER : "+temp.patient_gender);
			System.out.println("\t\tSYMPTOMS : "+temp.symptoms);
			System.out.println("\t\tPREVIOUS PRESCRIPTIONS : "+temp.prescription);
			System.out.println("\n**********************************\n");

			temp=temp.next;
		}
	}

	public void delete_q1()
	{
		System.out.print("ENTER PATIENT ID : ");
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
			System.out.println("APPOINTMENT DELETED SUCCESSFULLY !!");
		}
		else
			System.out.println("PATIENT RECORD NOT FOUND !!");
	}
	public void delete_q2()
	{
		System.out.print("ENTER PATIENT ID : ");
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
			System.out.println("APPOINTMENT DELETED SUCCESSFULLY !!");
		}
	}

	public void delete_q3()
	{
		System.out.print("ENTER PATIENT ID : ");
		int id=input.nextInt();
		int flag=0;

		Node3 temp;
		temp=front3;

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
				front3=null;
				rear3=null;
			}
			else if(temp==front3)
			{
				front3=front3.next;
				front3.prev=null;
				temp.next=null;
				temp=null;
			}
			else if(temp==rear3)
			{
				rear3=rear3.prev;
				rear3.next=null;
				temp.prev=null;
				temp=null;
			}
			else
			{
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				temp=null;
			}
			count3--;
			System.out.println("APPOINTMENT DELETED SUCCESSFULLY !!");
		}
	}
	public void delete_q4()
	{
		System.out.print("ENTER PATIENT ID : ");
		int id=input.nextInt();
		int flag=0;

		Node3 temp;
		temp=front4;

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
				front4=null;
				rear4=null;
			}
			else if(temp==front4)
			{
				front4=front4.next;
				front4.prev=null;
				temp.next=null;
				temp=null;
			}
			else if(temp==rear4)
			{
				rear4=rear4.prev;
				rear4.next=null;
				temp.prev=null;
				temp=null;
			}
			else
			{
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
				temp=null;
			}
			count4--;
			System.out.println("APPOINTMENT DELETED SUCCESSFULLY !!");
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

		System.out.print("ENTER PATIENT ID : ");
		int id=input.nextInt();

		temp=root1;
		if(root1==null)
			System.out.println("EMPTY RECORD !!");

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
				System.out.println("PATIENT RECORD NOT FOUND !!");
			}
			else
			{
				System.out.println("PATIENT RECORD FOUND !!");
				System.out.println("\n\t****** UPDATE MENU *****");
				System.out.print("\n\t\t1.PATIENT AGE\n\t\t2.PATIENT ADDRESS\n\t\t3.PATIENT MOBILE NUMBER ");
				System.out.print("ENTER YOUR CHOICE : ");
				int ch=input.nextInt();

				switch(ch)
				{
				case 1:
					System.out.print("ENTER PRESENT AGE : ");
					int n_age=input.nextInt();

					while(n_age<0)
					{
						System.out.print("PLEASE ENTER VALID AGE : ");
						n_age=input.nextInt();
					}
					temp.patient_age=n_age;
					
					break;

				case 2:
					System.out.print("ENTER NEW ADDRESS : ");
					String n_addr=input.next();

					temp.patient_address=n_addr;
					break;

				case 3:
					System.out.print("ENTER NEW MOBILE NUMBER : ");
					String n_no=br.readLine();

					while(n_no.length()!=10)
					{
						System.out.print("PLEASE ENTER VALID NUMBER : ");
						n_no=br.readLine();
					}
					
					temp.patient_ph_no=n_no;
					break;

				default:
					System.out.println("INVALID INPUT !!");
				}
			}
		}
	}

}

