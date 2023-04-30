package Hospital_maganement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import appointment.Appointment_Dept1;
import appointment.Appointment_Dept2;
import appointment.Appointment_Dept3;
import services.About_us;
import services.Doctors;
import services.Events;
import services.Free_Checkup;
import services.Medicine;
import services.Reviews;

public class Hospital {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Doctors obj1=new Doctors();
		Events obj2=new Events();
		Reviews obj3=new Reviews();
		Free_Checkup obj4=new Free_Checkup();
		Appointment_Dept1 obj5=new Appointment_Dept1();
		Appointment_Dept2 obj6=new Appointment_Dept2();
		Appointment_Dept3 obj7=new Appointment_Dept3();
		Medicine obj8=new Medicine();
		int ans;
		int choice;
		int answer;
		System.out.println("\n\t******** WELCOME **********");
		System.out.println("\n\n\t-------- LOGIN AS -------- ");
		System.out.println("\n\t\t1.ADMIN\n\t\t2.USER");
		do {
			System.out.print("\nENTER YOUR CHOICE : ");
			int ch=input.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("\n\t\t*************** MENU ***************");
				System.out.println("\n\t\t\t 1.HOME");
				System.out.println("\n\t\t\t 2.ABOUT US");
				System.out.println("\n\t\t\t 3.DOCTORS");
				System.out.println("\n\t\t\t 4.SERVICES");
				System.out.println("\n\t\t\t 5.REVIEWS");
				System.out.println("\n\t\t\t 6.APPOINTMENTS");
				System.out.println("\n=============================================================================");
				System.out.println("=============================================================================");
				do {
					System.out.print("\nENTER YOUR CHOICE  : ");
					choice = sc.nextInt();
					switch(choice) {
					case 1:
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\t   WELCOME to");
						System.out.println("\t\t\tSWAYAM MULTI - SPECIALITY Hospital");
						System.out.println("\n\n\t\t\tMaking Health Care Better Together");
						System.out.println("\n\tFrom preventive Care and Checkups, to immuunizations and exams, ");
						System.out.println("\tour primary care physicians and provides work to keep you and ");
						System.out.println("\tyour whole family healthy and strong each and every day.");
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");	
						break;
					case 2:
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tABOUT US");
						About_us.main(args);
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");
						break;
					case 3:
						int no=0;
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tDOCTORS ");
						System.out.println("\n\t\t*************** MENU ***************");
						System.out.println("\n\t\t\t 1.INSERT DOCTOR INFORMATION");
						System.out.println("\n\t\t\t 2.DISPLAY DOCTORS RECORD");
						System.out.println("\n\t\t\t 3.DELETE DOCTOR RECORD");
						do {
							System.out.print("\nENTER YOUR CHOICE : ");
							int chh=input.nextInt();
							switch(chh)
							{
							case 1:
								obj1.insert();
								break;
							case 2:
								obj1.display();
								break;
							case 3:
								obj1.delete();
								break;
							default:
								System.out.println("INVALID CHOICE !!");
							}
							System.out.println("\nDo You Want To Continue?");
							System.out.println("\nPress : ");
							System.out.println("\t1 to CONTINUE");
							System.out.println("\t0 to EXIT");
							no=input.nextInt();
							if(no == 0) {
								System.out.println("\nTHANK FOR VISITING");
							}
						}while(no==1);
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================\n");
						break;
					case 4:
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tSERVICES ");
						System.out.println("\n\t\t*************** MENU ***************");
						System.out.println("\n\t\t\t 1.ENTER EVENT DETAILS");
						System.out.println("\n\t\t\t 2.DISPLAY EVENT DETAILS");		
						System.out.println("\n\t\t\t 3.DISPLAY THE REGISTRATIONS FOR FREE CHECKUP");
						System.out.println("\n\t\t\t 4.MEDICAL FACILITIES");
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================\n");
						System.out.print("\nENTER YOUR CHOICE : ");
						int chh=input.nextInt();
						switch(chh)
						{
						case 1:
							obj2.insert();
							break;
						case 2:
							obj2.display();
							break;
						case 3:
							obj4.display_free_checkup();
							break;
						case 4:
							int no1=0;
							System.out.println("\n");
							System.out.println("=============================================================================");
							System.out.println("=============================================================================");
							System.out.println("\n\t\t\t\tMEDICAL ");
							System.out.println("\n\t\t*************** MENU ***************");
							System.out.println("\n\t\t\t 1.INSERT MEDICINE DATA");
							System.out.println("\n\t\t\t 2.DISPLAY MEDICINE DATA");
							System.out.println("\n\t\t\t 3.SEARCH FOR A MEDICINE");
							System.out.println("\n\t\t\t 4.DELETE A PARTICULAR MEDICINE DATA");
							System.out.println("\n\t\t\t 5.UPDATE A PARTICULAT MEDICINE DATA");
							System.out.println("\n=============================================================================");
							System.out.println("=============================================================================");
							do {
								System.out.print("ENTER YOUR CHOICE : ");
								int ch1=input.nextInt();
								switch(ch1)
								{
								case 1:
									obj8.insert();
									break;
								case 2:
									obj8.display();
									break;
								case 3:
									obj8.search();
									break;
								case 4:
									obj8.delete();
									break;
								case 5:
									obj8.update();
									break;
								default:
									System.out.println("INVALID CHOICE !!");
								}
								System.out.println("Do You Want To Continue?");
								//System.out.println("Do you want to visit another page ???");
								System.out.println("Press : ");
								System.out.println("\t1 to CONTINUE");
								System.out.println("\t0 to EXIT");
								no1=input.nextInt();
								if(no1 == 0) {
									System.out.println("\nTHANK FOR VISITING");
								}
							}while(no1==1);
						}
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");
						break;
					case 5:
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tREVIEWS ");
						obj3.display();
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");
						break;
					case 6:
						int no3=0;
						int no4=0;
						int no5=0;
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tAPPOINTMENTS ");
						System.out.println("\n\t\t*************** MENU ***************");
						System.out.println("\n\t\t\t 1.DEPARTMENT - 1 : PEDIATRICIAN");
						System.out.println("\n\t\t\t 2.DEPARTMENT - 2 : DERMATOLOGIST");
						System.out.println("\n\t\t\t 3.DEPARTMENT - 3 : PSYCHIATRIST");
						//System.out.println("\n=============================================================================");
						//System.out.println("=============================================================================");
						do {
							System.out.print("\nENTER YOUR CHOICE : ");
							int ch1=input.nextInt();
							switch(ch1)
							{
							case 1: //Departmentt - 1 : Pediatrician
								System.out.println("\n");
								System.out.println("=============================================================================");
								System.out.println("=============================================================================");
								//System.out.println("\n\t\t\t\tAPPOINTMENTS ");
								System.out.println("\n\t\t*************** MENU ***************");
								System.out.println("\n\t\t\t 1.INSERT OLD PATIENT DETAILS");
								System.out.println("\n\t\t\t 2.DISPLAY PATIENTS HISTORY");
								System.out.println("\n\t\t\t 3.DISPLAY ALL APPOINTMENTS");
								//System.out.println("\n=============================================================================");
								//System.out.println("=============================================================================");
								do {
									System.out.print("\nENTER YOUR CHOICE : ");
									int ch2=input.nextInt();
									switch(ch2)
									{
									case 1:
										obj5.old_patient_dept1();
										break;
									case 2:
										obj5.display_record(obj5.root1);
										break;
									case 3:
										System.out.println("\n\t1.DOCTOR - 1 : Dr. NEETA KHONDALLA");
										System.out.println("\t2.DOCTOR - 2 : Dr. SAKSHI WANKHEDE");
										do {
											System.out.print("\nENTER YOUR CHOICE : ");
											int ch3=input.nextInt();
											System.out.println("\n\t1.SLOT 1 APPOINTMENTS");
											System.out.println("\n\t2.SLOT 2 APPOINTMENTS");
											System.out.println("\n\t3.SLOT 1 AND 2 APPOINTMENTS");
											System.out.println("\nENTER YOUR CHOICE : ");
											int ch4=input.nextInt();
											switch(ch3)
											{
											case 1:
												switch(ch4)
												{
												case 1:
													obj5.display_q1();
													break;
												case 2:
													obj5.display_q2();
													break;
												case 3:
													obj5.display_q1q2();
													break;
												default:
													System.out.println("\nINVALID CHOICE !! ");
												}
												break;
											case 2:
												switch(ch4)
												{
												case 1:
													obj5.display_q3();
													break;
												case 2:
													obj5.display_q4();
													break;
												case 3:
													obj5.display_q3q4();
													break;
												default:
													System.out.println("\nINVALID CHOICE !!");
												}
											default:
												System.out.println("\nINVALID CHOICE !!");
											}
											System.out.println("\nDo You Want To See More Appointments?");
											System.out.println("Press : ");
											System.out.println("\t1 to CONTINUE");
											System.out.println("\t0 to EXIT");
											no5=input.nextInt();
											if(no5 == 0) {
												System.out.println("\nTHANK FOR VISITING");
											}
											
										}while(no5==1);
									default:
										System.out.println("INVALID CHOICE !!");
									}
									System.out.println("Do You Want To Continue?");
									System.out.println("Press : ");
									System.out.println("\t1 to CONTINUE");
									System.out.println("\t0 to EXIT");
									no4=input.nextInt();
									if(no4 == 0) {
										System.out.println("\nTHANK FOR VISITING");
									}
								}while(no4==1);
								break;
							case 2:
								System.out.println("\n"); // Department 2 : DERMATOLOGIST
								System.out.println("=============================================================================");
								System.out.println("=============================================================================");
								System.out.println("\n\t\t\t\tAPPOINTMENTS ");
								System.out.println("\n\t\t*************** MENU ***************");
								System.out.println("\n\t\t\t 1.INSERT OLD PATIENT RECORD");
								System.out.println("\n\t\t\t 2.DISPLAY DETAILS OF ALL PATIENTS");
								System.out.println("\n\t\t\t 3.DISPLAY ALL APPOINTMENTS");
								//System.out.println("\n=============================================================================");
								//System.out.println("=============================================================================");
								do {
									System.out.print("\nENTER YOUR CHOICE : ");
									int ch2=input.nextInt();
									switch(ch2)
									{
									case 1:
										obj6.old_patient_dept1();
										break;
									case 2:
										obj6.display_record(obj6.root1);
										break;
									case 3:
										System.out.println("\n\t1.DOCTOR - 1 : Dr. SAMIKSHA JADHAV");
										System.out.println("\t2.DOCTOR - 2 : Dr. MANOHAR KHAIRNA");
										do {
											System.out.print("\nENTER YOUR CHOICE : ");
											int ch3=input.nextInt();
											System.out.println("\n\t1.SLOT 1 APPOINTMENTS");
											System.out.println("\n\t2.SLOT 2 APPOINTMENTS");
											System.out.println("\n\t3.SLOT 1 AND 2 APPOINTMENTS");
											System.out.println("\nENTER YOUR CHOICE : ");
											int ch4=input.nextInt();
											switch(ch3)
											{
											case 1:
												switch(ch4)
												{
												case 1:
													obj6.display_q1();
													break;
												case 2:
													obj6.display_q2();
													break;
												case 3:
													obj6.display_q1q2();
													break;
												default:
													System.out.println("\nINVALID CHOICE !!");
												}
												break;
											case 2:
												switch(ch4)
												{
												case 1:
													obj6.display_q3();
													break;
												case 2:
													obj6.display_q4();
													break;
												case 3:
													obj6.display_q3q4();
													break;
												default:
													System.out.println("\nINVALID CHOICE !!");
												}
											default:
												System.out.println("\nINVALID CHOICE !!");
											}
											System.out.println("\nDo You Want To See More Appointments?");
											System.out.println("Press : ");
											System.out.println("\t1 to CONTINUE");
											System.out.println("\t0 to EXIT");
											no5=input.nextInt();
											if(no5 == 0) {
												System.out.println("\nTHANK FOR VISITING");
											}
										}while(no5==1);
									default:
										System.out.println("\nINVALID CHOICE !!");
									}
									System.out.println("\nDo You Want To Continue?");
									System.out.println("Press : ");
									System.out.println("\t1 to CONTINUE");
									System.out.println("\t0 to EXIT");
									no4=input.nextInt();
									if(no4 == 0) {
										System.out.println("\nTHANK FOR VISITING");
									}
								}while(no4==1);
								break;
							case 3:
								System.out.println("\n"); // Department 3 : PSYCHIATRIST
								System.out.println("=============================================================================");
								System.out.println("=============================================================================");
								System.out.println("\n\t\t\t\tAPPOINTMENTS ");
								System.out.println("\n\t\t*************** MENU ***************");
								System.out.println("\n\t\t\t 1.INSERT OLD PATIENT RECORD");
								System.out.println("\n\t\t\t 2.DISPLAY ALL PATIENTS DETAILS");
								System.out.println("\n\t\t\t 3.DISPLAY ALL APPOINTMENTS");
								//System.out.println("\n=============================================================================");
								//System.out.println("=============================================================================");
								System.out.println("\n\t1.DOCTOR - 1 : Dr. GAUTAM KULKARNI");
								do {
									System.out.print("\nENTER YOUR CHOICE : ");
									int ch2=input.nextInt();
									switch(ch2)
									{
									case 1:
										obj7.old_patient_dept1();
										break;
									case 2:
										obj7.display_record(obj7.root1);
										break;
									case 3:
										System.out.println("\n\t1.SLOT 1 APPOINTMENTS");
										System.out.println("\n\t2.SLOT 2 APPOINTMENTS");
										System.out.println("\n\t3.SLOT 1 AND 2 APPOINTMENTS");
										do {
											System.out.println("\nENTER YOUR CHOICE : ");
											int ch3=input.nextInt();
											switch(ch3)
											{
											case 1:
												obj7.display_q1();
												break;
											case 2:
												obj7.display_q2();
												break;
											case 3:
												obj7.display_q1q2();
												break;
											default:
												System.out.println("\nINVALID CHOICE !!");
											}
											System.out.println("\nDo You Want To See More Appointments?");
											System.out.println("Press : ");
											System.out.println("\t1 to CONTINUE");
											System.out.println("\t0 to EXIT");
											no5=input.nextInt();
											if(no5 == 0) {
												System.out.println("\nTHANK FOR VISITING");
											}
										}while(no5==1);		
										break;
									default :
										System.out.println("\n");
										System.out.println("=============================================================================");
										System.out.println("=============================================================================");
										System.out.println("\n\t\t\t\tENTER VALID OPTION......");
										System.out.println("\t\t\t TRY AGAIN !!!!!");
										System.out.println("\n=============================================================================");
										System.out.println("=============================================================================");
										break;
									}
									System.out.println();
									System.out.println("\nDo you want to visit another page ???");
									System.out.println("Press : ");
									System.out.println("\t1 to CONTINUE");
									System.out.println("\t0 to EXIT");
									ans = sc.nextInt();
									if(ans == 0) {
										System.out.println("\nTHANK FOR VISITING");
									}
								}while(ans == 1);
							}
							System.out.println();
							System.out.println("\nDo you want to visit another page ???");
							System.out.println("Press : ");
							System.out.println("\t1 to CONTINUE");
							System.out.println("\t0 to EXIT");
							ans = sc.nextInt();
							if(ans == 0) {
								System.out.println("\nTHANK FOR VISITING");
							}
						}while(ans == 1);
						break;
					default:
						System.out.println("\nINVALID CHOOCE !!");
					}
					System.out.println();
					System.out.println("\nDo you want to continue as ADMIN ???");
					System.out.println("Press : ");
					System.out.println("\t1 to CONTINUE");
					System.out.println("\t0 to EXIT");
					ans = sc.nextInt();
					if(ans == 0) {
						System.out.println("\nTHANK FOR VISITING");
					}
				}while(ans == 1);
				break;
			
			case 2:
				System.out.println("\n\t\t*************** MENU ***************");
				System.out.println("\n\t\t\t 1.HOME");
				System.out.println("\n\t\t\t 2.ABOUT HOSPITAL");
				System.out.println("\n\t\t\t 3.DOCTORS");
				System.out.println("\n\t\t\t 4.SERVICES");
				System.out.println("\n\t\t\t 5.BOOK APPOINTMENT");
				System.out.println("\n\t\t\t 6.REVIEWS");
				System.out.println("\n=============================================================================");
				System.out.println("=============================================================================");
				do {
					System.out.print("\nENTER YOUR CHOICE : ");
					choice = input.nextInt();
					int no;
					switch(choice) {
					case 1:
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\t   WELCOME to");
						System.out.println("\t\t\tSWAYAM MULTI - SPECIALITY Hospital");
						System.out.println("\n\n\t\t\tMaking Health Care Better Together");
						System.out.println("\n\tFrom preventive Care and Checkups, to immuunizations and exams, ");
						System.out.println("\tour primary care physicians and provides work to keep you and ");
						System.out.println("\tyour whole family healthy and strong each and every day.");
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");
						break;
					case 2:
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tABOUT US");
						About_us.main(args);
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");
						break;
					case 3:
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tDOCTORS ");
						//obj1.search();
						obj1.display();
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");
						break;
					case 4:
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tSERVICES ");
						System.out.println("\n\t\t*************** MENU ***************");
						System.out.println("\n\t\t\t 1.VIEW EVENTS");
						System.out.println("\n\t\t\t 2.SEARCH FOR AN EVENT");
						System.out.println("\n\t\t\t 3.REGISTER FOR FREE CHECKUP");
						System.out.println("\n\t\t\t 4.BUY MEDICINES");
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");
						System.out.print("Enter your choice: ");
						int chh=input.nextInt();
						switch(chh)
						{
						case 1:
							obj2.display();
							break;
						case 2:
							obj2.search();
							break;
						case 3:
							int no1=0;
							InputStreamReader i=new InputStreamReader(System.in);
							BufferedReader br=new BufferedReader(i);
							System.out.print("\nENTER REGISTRATION FOR  : ");
							String event_name=br.readLine();
							if(event_name.equals("FREE CHECKUP"))
							{

								System.out.print("ENTER REGISTRATION DATE : ");
								String date=br.readLine();
								//Creater the DateTimeFormatter matching the input string format
								DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");
								//Using parse method to convert the string to LocalDate object
								LocalDate dt1 = LocalDate.parse(date,format);
								//System.out.println(dt1); OUTPUT=2021-08-30
								LocalDate dt2 = LocalDate.parse("2023-05-01");
								//System.out.println(dt2); OUTPUT=2021-08-30
								if(dt1.equals(dt2))
								{
									System.out.println("\n\t1.Register\n\t2.Search\n\t3.Delete");
									do {
										System.out.print("\nENTER YOUR CHOICE : ");
										int ch1=input.nextInt();
										switch(ch1)
										{
										case 1:
											obj4.insert();
											break;
										case 2:
											obj4.search();
											break;
										case 3:
											obj4.delete();
											break;
										default:
											System.out.println("\n");
											System.out.println("=============================================================================");
											System.out.println("=============================================================================");
											System.out.println("\n\t\t\t\tENTER VALID OPTION......");
											System.out.println("\t\t\t TRY AGAIN !!!!!");
											System.out.println("\n=============================================================================");
											System.out.println("=============================================================================");
										}
										System.out.print("Do you want do continue?" );
										System.out.println("Press : ");
										System.out.println("\t1 to CONTINUE");
										System.out.println("\t0 to EXIT");
										no1=input.nextInt();
										if(no1 == 0) {
											System.out.println("\nTHANK FOR VISITING");
										}
										
									}while(no1==1);
									System.out.println("\n=============================================================================");
									System.out.println("=============================================================================");
								}
								else
								{
									System.out.println("\n");
									System.out.println("=============================================================================");
									System.out.println("=============================================================================");
									System.out.println("\n\t\t\t\tENTER VALID OPTION......");
									System.out.println("\t\t\t TRY AGAIN !!!!!");
									System.out.println("\n=============================================================================");
									System.out.println("=============================================================================");
								}
							}
							else
							{
								System.out.println("\n");
								System.out.println("=============================================================================");
								System.out.println("=============================================================================");
								System.out.println("\n\t\t\t\tENTER VALID OPTION......");
								System.out.println("\t\t\t TRY AGAIN !!!!!");
								System.out.println("\n=============================================================================");
								System.out.println("=============================================================================");
							}
							break;
						case 4:
							obj8.order();
							break;
						}
						break;
					case 5:
						int no1=0;
						System.out.println("\n\t\t******* Departments *******\n\t\t1.DEPARTMENT - 1 : PEDITRICIAN \n\t\t2.DEPARTMENT - 2 : DERMATOLOGIST \n\t\t3.DEPARTMENT - 3 : PSYCHIATRIST");
						do {
							
							System.out.print("ENTER YOUR DEPARTMENT : ");
							int ch1=input.nextInt()	;
							switch(ch1)//FOR DEPARTMENT
							{
							case 1://DEPARTMENT 1
								System.out.println("\n\t**** DEPARTMENT - 1 : PEDITRICIAN ***** ");
								System.out.println("\n\t\t1.BOOK APPOINTMENT \n\t\t2.DELETE APPOINTMENT\n\t\t3.UPDATE PATIENT DETAILS");
								System.out.print("ENTER YOUR CHOICE : ");
								int ch2=input.nextInt();
								switch(ch2)//YOUR CHOICE
								{
								case 1://BOOK APPOINTMENT
									System.out.println("\n\tBOOK APPOINTMENT : ");
									obj5.book_app_dept1();
									break;
								case 2://DELETE APPOINTMENT
									System.out.println("\n\tDELETE APPOINTMENT : ");
									System.out.println("\n\t\t1.DOCTOR - 1 : Dr. VARUN KUMAR \n\t\t2.DOCTOR - 2 : Dr. NEETA KHOND");
									System.out.print("ENTER YOUR DOCTOR : ");
									int ch3=input.nextInt();
									System.out.println("\n\tSLOT TAKEN : ");
									System.out.println("\n\t\t1.9 am - 1 pm\n\t\t2.4 pm - 8 pm");
									System.out.print("ENTER YOUR SLOT : ");
									int ch4=input.nextInt();
									switch(ch3)//FOR DOCTOR
									{
									case 1:
										switch(ch4)//FOR SLOT
										{
										case 1:
											obj5.delete_q1();
											break;
										case 2:
											obj5.delete_q2();
											break;
										default:
											System.out.println("INVALID CHOICE !!");
										}
										break;
									case 2:
										switch(ch4)
										{
										case 1:
											obj5.delete_q3();
											break;
										case 2:
											obj5.delete_q4();
											break;
										default:
											System.out.println("INVALID CHOICE !!");
										}
										break;
									default:
										System.out.println("INVALID CHOICE !!");
									}
									break;
								case 3:
									obj5.update_tree();
									break;
								default:
									System.out.println("INVALID CHOICE!!");
								}
								break;
							case 2:
								System.out.println("\n\t**** DEPARTMENT - 2 : DERMATOLOGIST ***** ");
								System.out.println("\n\t\t1.BOOK APPOINTMENT \n\t\t2.DELETE APPOINTMENT\n\t\t3.UPDATE PATIENT DETAILS");
								System.out.print("ENTER YOUR CHOICE : ");
								int ch5=input.nextInt();
								switch(ch5)
								{
								case 1:
									System.out.println("\n\tBOOK APPOINTMENT : ");
									obj6.book_app_dept1();
									break;
								case 2:
									System.out.println("\n\tDELETE APPOINTMENT : ");
									System.out.println("\n\t\t1.DOCTOR - 1 : Dr.MOHIT SHAH \n\t\t2.DOCTOR - 2 : NIKITA PATEL");
		
									System.out.print("ENTER YOUR DOCTOR : ");
									int ch6=input.nextInt();
									System.out.println("\n\tSLOT TAKEN : ");
									System.out.println("\n\t\t1.9 am - 1 pm\n\t\t2.4 pm - 8 pm");
								
									System.out.print("ENTER YOUR SLOT : ");
									int ch7=input.nextInt();
									switch(ch6)
									{
									case 1:
										switch(ch7)
										{
										case 1:
											obj6.delete_q1();
											break;
										case 2:
											obj6.delete_q2();
											break;
										default:
											System.out.println("INVALID CHOICE !!");
										}
										break;
									case 2:
										switch(ch7)
										{
										case 1:
											obj6.delete_q3();
											break;
										case 2:
											obj6.delete_q4();
											break;
										default:
											System.out.println("INVALID CHOICE !!");
										}
										break;
									default:
										System.out.println("INVALID CHOICE !!");
									}
									break;
								case 3:
									obj6.update_tree();
									break;
								default:
									System.out.println("INVALID CHOICE !!");
								}
								break;
							case 3:
								int no2=0;
								System.out.println("\n\t**** DEPARTMENT - 3 : PSYCHIATRIST ***** ");
								System.out.println("\n\t\t1.BOOK APPOINTMENT \n\t\t2.DELETE APPOINTMENT\n\t\t3.UPDATE PATIENT DETAILS");
								System.out.print("ENTER YOUR CHOICE : ");
								int ch8=input.nextInt();
								switch(ch8)
								{
								case 1:
									System.out.println("\n\tBOOK APPOINTMENT : ");
									obj7.book_app_dept1();
									break;
								case 2:
									System.out.println("\n\tDELETE APPOINTMENT : ");
									System.out.println("\n\t\t1.DOCTOR - 1 : GAUTAM KULKARNI");
									System.out.println("\n\tSLOT TAKEN : ");
									System.out.println("\n\t\t1.9 am - 1 pm\n\t\t2.4 pm - 8 pm");
									System.out.print("ENTER YOUR SLOT : ");
									int ch9=input.nextInt();
									switch(ch9)
									{
									case 1:
										obj7.delete_q1();
										break;
									case 2:
										obj7.delete_q2();
										break;
									default:
										System.out.println("INVALID CHOICE !!");
									}
									break;
								case 3:
									obj7.update_tree();
									break;
								default:
									System.out.println("INVALID CHOICE !!");
								}
								break;
							default:
								System.out.println("INVALID CHOICE !!");
							}
							System.out.print("Do you want to Book more Appointments? ");
							System.out.println("PRESS : ");
							System.out.println("1 : YES ");
							System.out.println("0 : NO");
							no1=input.nextInt();
						}while(no1==1);
						System.out.println("Do you want to Buy Medicines?");
						System.out.println("PRESS : ");
						System.out.println("1 : YES ");
						System.out.println("0 : NO");
						int no2=input.nextInt();
						if(no2==1)
							obj8.order();
						else
							System.out.println("THANK YOU !!");
						System.out.println("Do You Want To Give Reviews To Our Hospital?");
						System.out.println("PRESS : ");
						System.out.println("1 : YES ");
						System.out.println("0 : NO");
						int no3=input.nextInt();
						if(no3==1)
						{
							obj3.accept();
							System.out.println("THANK YOU FOR GIVING YOUR REVIEWS !!");
						}
						else
							System.out.println("THANK YOU!!");
						break;
					case 6:
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tREVIEWS ");
						System.out.println("\n\t\t*************** MENU ***************");
						System.out.println("\n\t\t\t1.ADD REVIEWS\n\t\t\t2.DISPLAY REVIEWS");
						do {
							System.out.print("ENTER YOUR CHOICE : ");
							int ch1=input.nextInt();
							switch(ch1) {
							case 1:
								obj3.accept();
								break;
							case 2:
								obj3.display();
								break;
							}
							System.out.print("Do you want do continue? ");
							System.out.println("Press : ");
							System.out.println("\t1 to CONTINUE");
							System.out.println("\t0 to EXIT");
							no=input.nextInt();
							if(no == 0) {
								System.out.println("\nTHANK FOR VISITING");
							}
						}while(no==1);
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");
						break;
					default :
						System.out.println("\n");
						System.out.println("=============================================================================");
						System.out.println("=============================================================================");
						System.out.println("\n\t\t\t\tENTER VALID OPTION......");
						System.out.println("\t\t\t TRY AGAIN !!!!!");
						System.out.println("\n=============================================================================");
						System.out.println("=============================================================================");
						break;
					}
					System.out.println();
					System.out.println("Do you want to continue as USER ???");
					System.out.println("Press : ");
					System.out.println("\t1 to CONTINUE");
					System.out.println("\t0 to EXIT");
					ans = input.nextInt();
					if(ans == 0) {
						System.out.println("\nTHANK FOR VISITING");
					}
				}while(ans == 1);
				break;
			default:
				System.out.println("INVALID CHOICE !!");
			}
			System.out.println("Do You Want To Continue?");
			System.out.println("Press : ");
			System.out.println("\t1 to CONTINUE");
			System.out.println("\t0 to EXIT");
			answer=input.nextInt();
			if(answer == 0) {
				System.out.println("\nTHANK FOR VISITING");
			}		
		}while(answer==1);
	}
}

