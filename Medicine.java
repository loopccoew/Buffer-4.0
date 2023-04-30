package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import node.Node5;
import node.bill;

public class Medicine {

	InputStreamReader i=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(i);

	int table_size;
	Node5 hash_table[];
	int key1;
	int key2;
	int key3;
	int count;

	public Medicine()
	{
		table_size=11;
		hash_table=new Node5[table_size];
		count=0;
	}
	public void insert() throws IOException
	{
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.print("ENTER NO OF MEDICINES PRESENT : ");
		int no=Integer.parseInt(br.readLine());
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");

		count=count+no;

		if(no<0||count>table_size) {
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("INVALID NO...");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
		else
		{
			//System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("\n\t******* MEDICINE DETAILS ******** ");
			for(int i=0;i<no;i++)
			{
				System.out.print("\nENTER CODE : ");
				int med_code=Integer.parseInt(br.readLine());

				while(med_code<=0)
				{
					System.out.println("\nENTERED INVALID CODE !!");
					System.out.print("\nRE - ENETER THE MEDICINE CODE : ");
					med_code=Integer.parseInt(br.readLine());
				}
				System.out.print("\nENTER NAME : ");
				String name=br.readLine();

				System.out.print("\nENTER COST : ");
				float cost=Float.parseFloat(br.readLine());
				while(cost<=0)
				{
					System.out.println("\nENTERED INVALID COST!!");
					System.out.print("\nRE - ENETER THE MEDICINE COST : ");
					cost=Float.parseFloat(br.readLine());
				}

				System.out.print("\nENTER QUANTITY : ");
				int count1=Integer.parseInt(br.readLine());

				while(count1<=0)
				{
					System.out.println("\nENTERED INVALID QUANTITY!!");
					System.out.print("\nRE - ENETER THE MEDICINE QUANTITY : ");
					count1=Integer.parseInt(br.readLine());
				}

				Node5 new_node=new Node5(med_code,name,cost,count1);

				key1=med_code%table_size;

				if(hash_table[key1]==null)
					hash_table[key1]=new_node;

				else
				{
					//COLLISING HANDLING THROUGH DOUBLE HASHING PROBING
					int j=1;

					key2=8-(med_code%8);
					key3=(key1+j*key2)%table_size;

					if(hash_table[key3]==null)
						hash_table[key3]=new_node;

					else
					{
						while(hash_table[key3]!=null)
						{
							j++;
							key3=(key1+j*key2)%table_size;
						}
						hash_table[key3]=new_node;
					}
				}
			    System.out.println("\n-----------------------------------------------------------------------------\n");
			}
		}
	}

	public void display()
	{
		System.out.println("\nMEDICINE CODE \tMEDICINE NAME \tMEDICINE COST \tQUANTITY\n");
		for(int i=0;i<table_size;i++)
		{
			if(hash_table[i]==null||hash_table[i].count==0)
				continue;

			else
				
				System.out.println(hash_table[i].med_code+"\t\t"+hash_table[i].med_name+"\t\t"+hash_table[i].med_cost+"\t\t"+hash_table[i].count);
				System.out.println();
		}		
	}

	public void search() throws IOException
	{
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.print("\nENTER MEDICINE CODE : ");
		int code=Integer.parseInt(br.readLine());
		int flag=0;

		key1=code%table_size;

		if(hash_table[key1]==null) {
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("MEDICINE DATA NOT FILLED YET !!");
			System.out.println("TRY AFTER SOME TIME !!!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
		else if(hash_table[key1].med_code==code)
		{
			flag=1;
			System.out.println("\n\t***** Medicine Found ****** ");
			System.out.println("\n\tMedicine Code: "+hash_table[key1].med_code);
			System.out.println("\n\tMedicine Name: "+hash_table[key1].med_name);
			System.out.println("\n\tMedicine Cost: "+hash_table[key1].med_cost);
			System.out.println("\n\tMedicine Quantity: "+hash_table[key1].count);
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}

		else
		{
			int j=1;

			key2=8-(code%8);
			key3=(key1+j*key2)%table_size;

			while(hash_table[key3]!=null)
			{
				key3=(key1+j*key2)%table_size;

				if(hash_table[key3]==null) {
					System.out.println("\nMedicine Not Found!!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}
				else
				{
					if(hash_table[key3].med_code==code)
					{
						flag=1;
						System.out.println("\n\t***** MEDICINE FOUND *****");
						System.out.println("\n\t\tMEDICINE CODE : "+hash_table[key3].med_code);
						System.out.println("\n\t\tMEDICINE NAME : "+hash_table[key3].med_name);
						System.out.println("\n\t\tMEDICINE COST : "+hash_table[key3].med_cost);
						System.out.println("\n\t\tMEDICINE QUANTITY : "+hash_table[key3].count);
						System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
						break;
					}
					else
						j++;
				}
			}
		}

		if(flag==0) {
			System.out.println("\nMEDICINE NOT FOUND !!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
	}

	public void delete() throws NumberFormatException, IOException
	{
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.print("\nENTER MEDICINE CODE : ");
		int code=Integer.parseInt(br.readLine());
		int flag=0;

		key1=code%table_size;

		if(hash_table[key1]==null) {
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("\nMEDICINE NOT FOUND !!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
		else if(hash_table[key1].med_code==code)
		{
			flag=1;
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("\nMEDICINE CODE FOUND !!");
			hash_table[key1].med_code=0;
			hash_table[key1].med_name=null;
			hash_table[key1].med_cost=0f;
			hash_table[key1].count=0;

			System.out.println("\nSUCCESSFULLY DELETED MEDICINE RECORD !!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			count--;
		}

		else
		{
			int j=1;

			key2=8-(code%8);
			key3=(key1+j*key2)%table_size;

			while(hash_table[key3]!=null)
			{
				if(hash_table[key3]==null) {
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
					System.out.println("MEDICINE NOT FOUND !!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}
				else
				{
					key3=(key1+j*key2)%table_size;
					if(hash_table[key3].med_code==code)
					{
						flag=1;
						System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
						System.out.println("MEDICINE FOUND !!");
						hash_table[key3].med_code=0;
						hash_table[key3].med_name=null;
						hash_table[key3].med_cost=0f;
						hash_table[key3].count=0;

						System.out.println("\nSUCCESSFULLY DELETED MEDICINE RECORD !!");
						System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
						count--;
						break;
					}
					else
						j++;
				}
			}
		}

		if(flag==0) {
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("MEDICINE NOT FOUND !!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
	}

	public void update() throws IOException
	{
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.print("\nENTER MEDICINE CODE : ");
		int code=Integer.parseInt(br.readLine());
		int flag=0;

		key1=code%table_size;

		if(hash_table[key1]==null) {
			
			System.out.println("MEDICINE NOT FOUND !!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}

		else if(hash_table[key1].med_code==code)
		{
			flag=1;
		}

		else
		{
			int j=1;

			key2=8-(code%8);
			key3=(key1+j*key2)%table_size;

			while(hash_table[key3]!=null)
			{
				key3=(key1+j*key2)%table_size;

				if(hash_table[key3]==null) {
					System.out.println("MEDICINE NOT FOUND !!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}
				else
				{
					if(hash_table[key3].med_code==code)
					{
						flag=2;						
						break;
					}
					else
						j++;
				}
			}
		}

		if(flag==0) {
			System.out.println("\nMEDICINE NOT FOUND !!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
		else
		{
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("\n\t******** UPDATE MENU ********");
			System.out.println("\n\t\t1.Medicine Name\n\t\t2.Medicine Cost\n\t\t3.Quantity");
			System.out.print("\nENTER YOUR CHOICE : ");
			int ch=Integer.parseInt(br.readLine());

			switch(ch)
			{
			case 1:
				System.out.print("\nENTER MEDICINE NAME : ");
				String name=br.readLine();

				if(flag==1)
					hash_table[key1].med_name=name;

				else
					hash_table[key3].med_name=name;

				System.out.println("\nUPDATED SUCCESSFULLY !!");
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				break;

			case 2:
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				System.out.print("\nENTER MEDICINE COST : ");
				float cost=Integer.parseInt(br.readLine());

				while(cost<=0)
				{
					System.out.println("\nENTERED INVALID COST !!");
					System.out.print("\nRE - ENETER THE MEDICINE COST : ");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
					cost=Integer.parseInt(br.readLine());
				}

				if(flag==1)
					hash_table[key1].med_cost=cost;

				else
					hash_table[key3].med_cost=cost;

				System.out.println("\nUPDATED SUCCESSFULLY !!");
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				break;

			case 3:
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				System.out.print("\nENTER MEDICINE QUANTITY : ");
				int q=Integer.parseInt(br.readLine());

				while(q<=0)
				{
					System.out.println("\nENTERED INVALID QUANTITY !!");
					System.out.print("\nRE - ENETER THE MEDICINE QUANTITY : ");
					q=Integer.parseInt(br.readLine());
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}

				if(flag==1)
					hash_table[key1].count=q;

				else
					hash_table[key3].count=q;

				System.out.println("\nUPDATED SUCCESSFULLY !!");
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				break;

			default:
				System.out.println("\nINVALID CHOICE !!");
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			}
		}
	}

	public void order() throws IOException
	{
		float total_cost=0;
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.println("\n\t***** CUSTOMER DETAILS ******");
		System.out.print("\nENTER CUSTOMER NAME : ");
		String c_name=br.readLine();

		System.out.print("\nENTER CUTOMER MOBILE NUMBER : ");
		String ph_no=br.readLine();

		while(ph_no.length()!=10)
		{
			System.out.print("\nENTERED INVALID MOBILE NUMBER....");
			System.out.print("\nENTER VALID MOBILE NUMBER : ");
			ph_no=br.readLine();
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}

		System.out.print("\nENTER CUSTOMER ADDRESS : ");
		String addr=br.readLine();

		System.out.print("\nENTER NO OF MEDICINES TO BUY : ");
		int no=Integer.parseInt(br.readLine());

		while(no<=0)
		{
			System.out.println("\nENTERED INVALID MEDICINE NUMBER !!");
			System.out.print("\nRE - ENETER THE MEDICINE QUANTITY :");
			no=Integer.parseInt(br.readLine());
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}

		bill arr[]=new bill[no];

		for(int i=0;i<no;i++)
		{
			arr[i]=new bill();
			arr[i].flag=0;
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.print("\nENTER MEDICINE CODE :  ");
			arr[i].med_code=Integer.parseInt(br.readLine());

			key1=arr[i].med_code%table_size;

			if(hash_table[key1]==null)
			{
				System.out.println("\nMEDICINE NOT AVAILABLE !!");
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				arr[i].flag=2;
			}

			else if(hash_table[key1].med_code==arr[i].med_code)
			{
				arr[i].flag=1;
				System.out.print("\nENTER QUANTITY : ");
				arr[i].quantity=Integer.parseInt(br.readLine());

				while(arr[i].quantity<=0)
				{
					System.out.println("\nENETERED INVALID QUANTIYT !!");
					System.out.print("\nRE - ENTER MEDICINE QUATITY : ");
					arr[i].quantity=Integer.parseInt(br.readLine());
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}

				if(hash_table[key1].count==0)
					arr[i].flag=2;

				else if(hash_table[key1].count>=arr[i].quantity)
				{
					arr[i].rate=hash_table[key1].med_cost;
					arr[i].med_name=hash_table[key1].med_name;

					arr[i].amount=arr[i].rate*arr[i].quantity;
					hash_table[key1].count=hash_table[key1].count-arr[i].quantity;

					total_cost=total_cost+arr[i].amount;
				}

				else if(hash_table[key1].count<arr[i].quantity&&hash_table[key1].count>0)
				{
					arr[i].flag=0;
					System.out.println("\nQUANTITY LEFT : "+hash_table[key1].count);
					System.out.println("DO YOU WANT OT BUY QUANTITY OF : "+hash_table[key1].count);
					System.out.println("\nPRESS :  ");
					System.out.println("\n\t1 : YES");
					System.out.println("\n\t0 : NO");
					int ch=Integer.parseInt(br.readLine());
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");

					if(ch==1)
					{
						arr[i].quantity=hash_table[key1].count;
						arr[i].rate=hash_table[key1].med_cost;
						arr[i].med_name=hash_table[key1].med_name;

						arr[i].amount=arr[i].rate*arr[i].quantity;
						hash_table[key1].count=hash_table[key1].count-arr[i].quantity;

						total_cost=total_cost+arr[i].amount;
					}
					else
						arr[i].flag=2;
				}

				else
				{
					System.out.println("\nNOT AVAILABLE !!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
					arr[i].flag=2;					
				}

			}

			else
			{
				int j=1;

				key2=8-(arr[i].med_code%8);
				key3=(key1+j*key2)%table_size;

				if(hash_table[key3]==null)
				{
					System.out.println("\nNOT AVAILABLE !!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
					arr[i].flag=2;
				}
				else
				{
					while(hash_table[key3]!=null)
					{
						key3=(key1+j*key2)%table_size;

						if(hash_table[key3]==null)
						{
							System.out.println("\nNOT AVAILABLE !!");
							System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
							arr[i].flag=2;
						}
						else if(hash_table[key3].med_code==arr[i].med_code)
						{
							arr[i].flag=1;
							System.out.print("\nENTER QUANTITY : ");
							arr[i].quantity=Integer.parseInt(br.readLine());

							if(hash_table[key3].count==0)
								arr[i].flag=2;

							else if(hash_table[key3].count>=arr[i].quantity)
							{
								arr[i].rate=hash_table[key3].med_cost;
								arr[i].med_name=hash_table[key3].med_name;

								arr[i].amount=arr[i].rate*arr[i].quantity;
								hash_table[key3].count=hash_table[key3].count-arr[i].quantity;

								total_cost=total_cost+arr[i].amount;
							}

							else if(hash_table[key3].count<arr[i].quantity&&hash_table[key3].count>0)
							{
								arr[i].flag=0;
								System.out.println("\nQUANTITY LEFT : "+hash_table[key3].count);
								System.out.println("DO YOU WANT OT BUY QUANTITY OF :"+hash_table[key3].count);
								System.out.println("\nPRESS :  ");
								System.out.println("\n\t1 : YES");
								System.out.println("\n\t0 : NO");
								int ch=Integer.parseInt(br.readLine());

								if(ch==1)
								{
									arr[i].quantity=hash_table[key3].count;
									hash_table[key3].count=hash_table[key3].count-arr[i].quantity;

									arr[i].rate=hash_table[key3].med_cost;
									arr[i].med_name=hash_table[key3].med_name;

									arr[i].amount=arr[i].rate*arr[i].quantity;

									total_cost=total_cost+arr[i].amount;
								}
								else
									arr[i].flag=2;
							}

							else
							{
								System.out.println("\nNOT AVAILABLE !!");
								System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
								arr[i].flag=2;					
							}
							break;				
						}
						else
						{
							arr[i].flag=2;
							j++;
						}
					}

				}
			}
		}

		System.out.println("\n\t***** MEDICAL STORE *****");
		System.out.println("\n\tCUSTOMER NAME : "+c_name);
		System.out.println("\tCUSTOMER ADDRESS : "+addr);

		int flag=1;
		int j=0;
			System.out.println("\n-------------------------------------------------------------------------------\n");
			
		System.out.println("\n\tSR. NO.\tMEDICINE CODE \tMEDICINE NAME \tQUANTITY \tRATE      \tAMOUNT");
		for(int i=0;i<no;i++)
		{

			if(arr[i].flag==2)
			{
				flag=0;
				continue;	
			}

			else
			{
				if(arr[i].flag==0)
					flag=0;

				j++;
				System.out.println("\n\t"+j+"\t"+arr[i].med_code+"\t\t"+arr[i].med_name+"\t\t"+arr[i].quantity+"\t\t"+arr[i].rate+"\t\t"+arr[i].amount);
			}
		}

		System.out.println("\n\n\tTOTAL COST : \t\t\t\t\t\t\t\t"+total_cost);
		System.out.println("\n-------------------------------------------------------------------------------\n");

		if(flag==0){
			System.out.println("\n\t***** RECOMMENDED MEDICAL SHOPS ***** ");
			System.out.println("\n\t\t1.ADITYA MEDICAL");
			System.out.println("\t\t2.MEDI PLUS");
			System.out.println("\t\t3.AARSHIRWAD MEDICAL");
			System.out.println("\t\t4.WELLNESS FOREVER");
			System.out.println("\t\t5.AMIT MEDICAL");
		}
	}
	public static void main(String[] args) throws IOException {
		Medicine m = new Medicine();
		Scanner sc = new Scanner(System.in);
		int ch;
		int ans;
		
		do {
			System.out.print("enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				m.insert();
				break;
			case 2:
				m.display();
				break;
			case 3:
				m.delete();
				break;
			case 4 :
				m.search();
				break;
			case 5:
				m.update();
				break;
			case 6: 
				m.order();
				break;
			default :
				System.out.println("invalid input");
				break;
				
			
			}
			
			System.out.println("do you want to continue ?");
			System.out.println("press :");
			System.out.println("1 : continue");
			System.out.println("0 : eixt");
			ans = sc.nextInt();
			if(ans == 0) {
				System.out.println("exit");
			}
		}while(ans == 1);
		
	}
}


