import java.io.*;
import java.util.*;
import java.util.Calendar;

class staff
{
 String s_id, s_name, design, sex;
 int salary;
 void new_staff()
 {
 Scanner input = new Scanner(System.in);
 System.out.print("id:-");
 s_id = input.nextLine();
 System.out.print("name:-");
 s_name = input.nextLine();
 System.out.print("desigination:-");
 design = input.nextLine();
 System.out.print("sex:-");
 sex = input.nextLine();
 System.out.print("salary:-");
 salary = input.nextInt();
 }
 void staff_info()
 {
 System.out.println(s_id + "\t" + s_name + "\t" + sex + "\t" + salary);
 }
}
class doctor
{
 String dr_id, dr_name, specilist, appoint, doc_qual;
 int dr_room;
 void new_doctor()
 {
 Scanner input = new Scanner(System.in);
 System.out.print("id:-");
 dr_id = input.nextLine();
 System.out.print("name:-");
 dr_name = input.nextLine();
 System.out.print("specilization:-");
 specilist = input.nextLine();
 System.out.print("work time:-");
 appoint = input.nextLine();
 System.out.print("qualification:-");
 doc_qual = input.nextLine();
 System.out.print("room no.:-");
 dr_room = input.nextInt();
 }
 void doctor_info()
 {
 System.out.println(dr_id + " \t" + dr_name + " \t" + specilist + " \t" + appoint + " \t" + doc_qual + " \t" + dr_room);
 }
}
class patient
{
 String p_id, p_name, disease, sex, admit_status;
 int age;
 void new_patient()
 {
 Scanner input = new Scanner(System.in);
 System.out.print("id:-");
 p_id = input.nextLine();
 System.out.print("name:-");
 p_name = input.nextLine();
 System.out.print("disease:-");
 disease = input.nextLine();
 System.out.print("sex:-");
 sex = input.nextLine();
 System.out.print("admit_status:-");
 admit_status = input.nextLine();
 System.out.print("age:-");
 age = input.nextInt();
 }
 void patient_info()
 {
 System.out.println(p_id + "\t" + p_name + " \t" + disease + " \t" + sex + " \t" + admit_status + "\t" + age);
 }
}
class medical
{
 String med_name, med_comp, exp_date, manu_date;
 int med_cost, count;
 void new_medi()
 {
 Scanner input = new Scanner(System.in);
 System.out.print("name:-");
 med_name = input.nextLine();
 System.out.print("company name:-");
 med_comp = input.nextLine();
 System.out.print("manufacturing date:-");
 manu_date = input.nextLine();
 System.out.print("expiry date:-");
 exp_date = input.nextLine();
 System.out.print("cost:-");
 med_cost = input.nextInt();
 System.out.print("no of unit:-");
 count = input.nextInt();
 }
 void find_medi()
 {
 System.out.println(med_name + " \t" + med_comp + " \t" + manu_date + " \t" + exp_date + " \t" + med_cost);
 }
}
class lab
{
 String facility;
 int lab_cost;
 void new_faci()
 {
 Scanner input = new Scanner(System.in);
 System.out.print("facility:-");
 facility = input.nextLine();
 System.out.print("cost:-");
 lab_cost = input.nextInt();
 }
 void faci_list()
 {
 System.out.println(facility + "\t\t" + lab_cost);
 }
}
class facility 
{
 String fac_name;
 void add_faci()
 {
 Scanner input = new Scanner(System.in);
 System.out.print("facility:-");
 fac_name = input.nextLine();
 }
 void show_faci()
 {
 System.out.println(fac_name);
 }
}
public class Main
{
 public static void main(String args[])
 {
 String months[] = {
 "Jan",
 "Feb",
 "Mar",
 "Apr",
 "May",
 "Jun",
 "Jul",
 "Aug",
 "Sep",
 "Oct",
 "Nov",
 "Dec"
 };
 Calendar calendar = Calendar.getInstance();
 int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
 System.out.println("\n--------------------------------------------------------------------------------");
 System.out.println(" *** Welcome to The Life Savers Hospital Management System ***");
 System.out.println("--------------------------------------------------------------------------------");
 System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
 System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
 doctor[] dr = new doctor[25];
 patient[] p = new patient[100];
 lab[] l = new lab[20];
 facility[] f = new facility[20];
 medical[] m = new medical[100];
 staff[] s = new staff[100];
 int i;
 
 for (i = 0; i < 25; i++)
 dr[i] = new doctor();
 
 for (i = 0; i < 100; i++)
 p[i] = new patient();
 
 for (i = 0; i < 20; i++)
 l[i] = new lab();
 
 for (i = 0; i < 20; i++)
 f[i] = new facility();
 
 for (i = 0; i < 100; i++)
 m[i] = new medical();
 
 for (i = 0; i < 100; i++)
 s[i] = new staff();

 dr[0].dr_id = "21";
 dr[0].dr_name = "Dr.Sneha";
 dr[0].specilist = "ENT";
 dr[0].appoint = "9AM-12PM";
 dr[0].doc_qual = "MBBS,MD";
 dr[0].dr_room = 17;
 
 dr[1].dr_id = "34";
 dr[1].dr_name = "Dr.Vikas";
 dr[1].specilist = "Physician";
 dr[1].appoint = "10AM-2PM";
 dr[1].doc_qual = "MBBS,MD";
 dr[1].dr_room = 45;
 
 dr[2].dr_id = "30";
 dr[2].dr_name = "Dr.Shivani";
 dr[2].specilist = "Surgeon";
 dr[2].appoint = "8AM-2PM";
 dr[2].doc_qual = "BDM";
 dr[2].dr_room = 8;
 
 dr[3].dr_id = "33";
 dr[3].dr_name = "Dr.Pramod";
 dr[3].specilist = "Artho";
 dr[3].appoint = "10-4PM";
 dr[3].doc_qual = "MBBS,MS";
 dr[3].dr_room = 40;

 p[0].p_id = "12";
 p[0].p_name = "Pankaj";
 p[0].disease = "Cancer";
 p[0].sex = "Male";
 p[0].admit_status = "yes";
 p[0].age = 30;
 
 p[1].p_id = "13";
 p[1].p_name = "Sujit";
 p[1].disease = "Cold";
 p[1].sex = "Male";
 p[1].admit_status = "yes";
 p[1].age = 23;
 
 p[2].p_id = "14";
 p[2].p_name = "Shalu";
 p[2].disease = "Maleria";
 p[2].sex = "Female";
 p[2].admit_status = "yes";
 p[2].age = 45;
 
 p[3].p_id = "15";
 p[3].p_name = "Ravi";
 p[3].disease = "Diabetes";
 p[3].sex = "Male";
 p[3].admit_status = "yes";
 p[3].age = 25;

 m[0].med_name = "Corex";
 m[0].med_comp = "Cino pvt";
 m[0].manu_date= "11-9-21";
 m[0].exp_date = "10-12-23";
 m[0].med_cost = 55;
 m[0].count = 8;
 
 m[1].med_name = "Nytra";
 m[1].med_comp = "Ace pvt";
 m[1].manu_date= "15-9-21";
 m[1].exp_date = "4-4-25";
 m[1].med_cost = 500;
 m[1].count = 5;
 
 m[2].med_name = "Brufa";
 m[2].med_comp = "Reckitt";
 m[2].manu_date= "10-5-21";
 m[2].exp_date = "22-7-23";
 m[2].med_cost = 50;
 m[2].count = 56;
 
 m[3].med_name = "Pride";
 m[3].med_comp = "DDF pvt";
 m[3].manu_date= "6-2-21";
 m[3].exp_date = "12-4-23";
 m[3].med_cost = 1100;
 m[3].count = 100;

 l[0].facility = "X-ray ";
 l[0].lab_cost = 900;
 
 l[1].facility = "CT Scan ";
 l[1].lab_cost = 1500;
 
 l[2].facility = "Endoplasty ";
 l[2].lab_cost = 1700;
 
 l[3].facility = "Blood Bank";
 l[3].lab_cost = 700;

 f[0].fac_name = "Ambulance";
 f[1].fac_name = "Admit Facility ";
 f[2].fac_name = "Canteen";
 f[3].fac_name = "Emergency";

 s[0].s_id = "22";
 s[0].s_name = "Prashant";
 s[0].design = "Worker";
 s[0].sex = "Male";
 s[0].salary = 5000;
 
 s[1].s_id = "23";
 s[1].s_name = "Suhani";
 s[1].design = "Nurse";
 s[1].sex = "Female";
 s[1].salary = 2000;
 
 s[2].s_id = "24";
 s[2].s_name = "Rajesh";
 s[2].design = "Worker";
 s[2].sex = "Male";
 s[2].salary = 5000;
 
 s[3].s_id = "25";
 s[3].s_name = "Rakhi";
 s[3].design = "Nurse";
 s[3].sex = "Female";
 s[3].salary = 20000;
 
 s[3].s_id = "40";
 s[3].s_name = "Mahesh";
 s[3].design = "Security";
 s[3].sex = "Male";
 s[3].salary = 20000;


 Scanner input = new Scanner(System.in);
 int choice, a, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
 while (status == 1)
 {
 System.out.println("\n MAIN MENU");
 System.out.println("-----------------------------------------------------------------------------------");
 System.out.println("1.Doctors 2. Patients 3.Medicines 4.Laboratories 5. Facilities 6. Staff ");
 System.out.println("-----------------------------------------------------------------------------------");
 choice = input.nextInt();
 switch (choice)
 {
 case 1:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println(" DOCTOR's SECTION");
 System.out.println("--------------------------------------------------------------------------------");
 s1 = 1;
 while (s1 == 1)
 {
 System.out.println("1.Add New Entry\n2.Existing Doctors List");
 c1 = input.nextInt();
 switch (c1)
 {
 case 1:
 {
 dr[count1].new_doctor();
 count1++;
 break;
 }
 case 2:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println("id \t Name \t Specilist \t Timing \t Qualification \t Room No.");
 System.out.println("--------------------------------------------------------------------------------");
 for (a = 0; a < count1; a++)
 {
 dr[a].doctor_info();
 }
 break;
 }
 }
 System.out.println("\n Return to Back Press 1 and for Main Menu Press 0");
 s1 = input.nextInt();
 }
 break;
 }
 case 2:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println(" PATIENT SECTION");
 System.out.println("--------------------------------------------------------------------------------");
 s2 = 1;
 while (s2 == 1)
 {
 System.out.println("1.Add New Entry\n2.Existing Patients List");
 c1 = input.nextInt();
 switch (c1)
 {
 case 1:
 {
 p[count2].new_patient();
 count2++;
 break;
 }
 case 2:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println("id \t Name \tDisease \tGender \tAdt_Stat. \tAge");
 System.out.println("--------------------------------------------------------------------------------");
 for (a = 0; a < count2; a++) 
 {
 p[a].patient_info();
 }
 break;
 }
 }
 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
 s2 = input.nextInt();
 }
 break;
 }
 case 3:
 {
 s3 = 1;
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println(" MEDICINE SECTION");
 System.out.println("--------------------------------------------------------------------------------");
 while (s3 == 1)
 {
 System.out.println("1.Add New Entry of medicines \n2. Existing Medicines List");
 c1 = input.nextInt();
 switch (c1)
 {
 case 1:
 {
 m[count3].new_medi();
 count3++;
 break;
 }
 case 2:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println("Name \t Company \tMft date \tExpiry Date \tCost");
 System.out.println("--------------------------------------------------------------------------------");
 for (a = 0; a < count3; a++) {
 m[a].find_medi();
 }
 break;
 }
 }
 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
 s3 = input.nextInt();
 }
 break;
 }
 case 4:
 {
 s4 = 1;
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println(" LABORATORY SECTION");
 System.out.println("--------------------------------------------------------------------------------");
 while (s4 == 1)
 {
 System.out.println("1.Add New Entry \n2.Existing Laboratories List");
 c1 = input.nextInt();
 switch (c1)
 {
 case 1:
 {
 l[count4].new_faci();
 count4++;
 break;
 }
 case 2:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println("Testing Facilities\t \t Cost");
 System.out.println("--------------------------------------------------------------------------------");
 for (a = 0; a < count4; a++) {
 l[a].faci_list();
 }
 break;
 }
 }
 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
 s4 = input.nextInt();
 }
 break;
 }
 case 5:
 {
 s5 = 1;
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println(" HOSPITAL FACILITY SECTION");
 System.out.println("--------------------------------------------------------------------------------");
 while (s5 == 1)
 {
 System.out.println("1.Add New Facility\n2.Existing Facilities List");
 c1 = input.nextInt();
 switch (c1)
 {
 case 1:
 {
 f[count5].add_faci();
 count5++;
 break;
 }
 case 2:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println("Hospital Facility are:");
 System.out.println("--------------------------------------------------------------------------------");
 for (a = 0; a < count5; a++) {
 f[a].show_faci();
 }
 break;
 }
 }
 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
 s5 = input.nextInt();
 }
 break;
 }
 case 6:
 {
 s6 = 1;
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println(" STAFF SECTION");
 System.out.println("--------------------------------------------------------------------------------");
 while (s6 == 1)
 {
 String w = "Nurse", x = "Worker", y = "Security";
 System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
 c1 = input.nextInt();
 switch (c1)
 {
 case 1:
 {
 s[count6].new_staff();
 count6++;
 break;
 }
 case 2:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println("id \tName \tGender \tSalary");
 System.out.println("--------------------------------------------------------------------------------");
 for (a = 0; a < count6; a++)
 {
 if (w.equals(s[a].design))
 s[a].staff_info();
 }
 break;
 }
 case 3:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println("id \tName \tGender \tSalary");
 System.out.println("--------------------------------------------------------------------------------");
 for (a = 0; a < count6; a++)
 {
 if (x.equals(s[a].design))
 s[a].staff_info();
 }
 break;
 }
 case 4:
 {
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println("id \tName \tGender \tSalary");
 System.out.println("--------------------------------------------------------------------------------");
 for (a = 0; a < count6; a++)
 {
 if (y.equals(s[a].design))
 s[a].staff_info();
 }
 break;
 }
 }
 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
 s6 = input.nextInt();
 }
 break;
 }
 default:
 {
 System.out.println(" You Have Enter Wrong Choice!!!");
 }
 }
 System.out.println("\nReturn to MAIN MENU Press 1");
 status = input.nextInt();
 }
}
}