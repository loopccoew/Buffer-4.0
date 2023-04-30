package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import node.Node4;

public class Register {

		public static void main(String[] args) throws IOException {
			Scanner input=new Scanner(System.in);
			int no;
			InputStreamReader i=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(i);

			System.out.print("\nENTER EVENT NAME : ");
			String event_name=br.readLine();

			if(event_name.equals("FREE CHECK UP ")){
				System.out.print("\nENTER REGISTRATION DATE : ");
				String date=br.readLine();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");

				LocalDate dt1 = LocalDate.parse(date,format);

				LocalDate dt2 = LocalDate.parse("2021-08-30");
				if(dt1.equals(dt2)){
					Free_Checkup obj1=new Free_Checkup();
					System.out.println("\n\t****** REGISTER MENU ******");
					System.out.println("\n\t\t1.REGISTER");
					System.out.println("\t\t2.DISPLAY");
					System.out.println("\t\t3.SEARCH");
					System.out.println("\t\t4.DELETE");
					do {
						System.out.print("\nENTER YOUR CHOICE : ");
						int ch=input.nextInt();
						switch(ch){
						case 1:
							obj1.insert();
							break;

						case 2:
							obj1.display_free_checkup();
							break;

						case 3:
							obj1.search();
							break;

						case 4:
							obj1.delete();
							break;

						default:
							System.out.println("\nINVALID INPUT !!");
							break;
						}
						System.out.println();
						System.out.println("\nDo you want to visit another page ???");
						System.out.println("\nPRESS : ");
						System.out.println("\n\t1 to CONTINUE");
						System.out.println("\t0 to EXIT");
						no = input.nextInt();
						if(no == 0) {
							System.out.println("\nTHANK FOR VISITING");
						}
						
					}while(no==1);
				}
				else
					System.out.println("\nDATE NOT MATCHED !!");
			}
		}

	}

