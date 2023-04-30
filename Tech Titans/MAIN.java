
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class noder1{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	noder1 next;
	int organ1;
	int daibetic;
	int smoking;
	int severity;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int reciever;



	noder1(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,int organ1,int severity,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;

		this.next=null;
		this.organ1=1;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		int reciever=0;
		this.severity=severity;
	}
}



class noder2{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	noder2 next;
	int organ1;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int reciever;
	int severity;

	noder2(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,int organ1,int severity,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.next=null;
		this.organ1=2;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		reciever=0;
		this.severity=severity;

	}
}



class noder3{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	noder3 next;
	int organ1;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int reciever;
	int severity;


	noder3(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,int organ1,int severity,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.next=null;
		this.organ1=3;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		reciever=0;

		this.severity=severity;
	}
}


class noder4{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	noder4 next;
	int organ1;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int reciever;
	int severity;


	noder4(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,int organ1,int severity,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.next=null;
		this.organ1=4;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		reciever=0;
		this.severity=severity;

	}
}
class noder5{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	noder5 next;
	int organ1;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int reciever;
	int severity;


	noder5(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,int organ1,int severity,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.next=null;
		this.organ1=5;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		reciever=0;

		this.severity=severity;
	}
}


class donar{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;


	donar(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;

	}
}
class reciever{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;

	int severity;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;


	reciever(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,int severity,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;

		this.severity=severity;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;


	}
}

class node21{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	node21 next;
	String organ;
	int i =-1;
	int daibetic;
	int smoking;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int donated;


	node21(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,String organ,int daibetic, int smoking,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.next=null;
		this.organ=organ;
		this.daibetic = 0;
		this.smoking = 0;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		donated=0;

	}
}


class node31{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	node31 next;
	String organ;
	int i =-1;
	int daibetic;
	int smoking;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int donated;


	node31(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,String organ,int daibetic, int smoking,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.next=null;
		this.organ=organ;
		this.daibetic = 0;
		this.smoking = 0;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		donated=0;

	}
}
class node41{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	node41 next;
	String organ;
	int i =-1;
	int daibetic;
	int smoking;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int donated;


	node41(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,String organ,int daibetic, int smoking,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.next=null;
		this.organ=organ;
		this.daibetic = 0;
		this.smoking = 0;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		donated=0;

	}
}
class node51{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	node51 next;
	String organ;
	int i =-1;
	int daibetic;
	int smoking;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int donated;


	node51(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,String organ,int daibetic, int smoking,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.next=null;
		this.organ=organ;
		this.daibetic = 0;
		this.smoking = 0;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		donated=0;


	}
}
class node61{
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	node61 next;
	String organ;
	int i =-1;
	int daibetic;
	int smoking;
	int severity;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	int donated;


	node61(String name,String Add,String gender,String BG,String Adhar,String Mobile,int Age,int BMI,String noname,String noMobile,String organ,int daibetic, int smoking,String HLAA,String HLAB, String HLADRB1,String HLADQB1,String HLAC){
		this.name=name;
		this.Add=Add;
		this.gender=gender;
		this.BG=BG;
		this.Adhar=Adhar;
		this.Mobile=Mobile;
		this.Age=Age;
		this.BMI=BMI;
		this.noname=noname;
		this.noMobile=noMobile;
		this.next=null;
		this.organ=organ;
		this.daibetic = 0;
		this.smoking = 0;
		this.HLAA=HLAA;
		this.HLAB=HLAB;
		this.HLADRB1=HLADRB1;
		this.HLADQB1=HLADQB1;
		this.HLAC=HLAC;
		int donated=0;

	}
}


class d {

	ArrayList<donar> a1 = new ArrayList<>();
	ArrayList<donar> a2 = new ArrayList<>();
	ArrayList<donar> a3 = new ArrayList<>();
	ArrayList<donar> a4 = new ArrayList<>();
	ArrayList<donar> a5 = new ArrayList<>();
	ArrayList<reciever> a6 = new ArrayList<>();
	node21 head1 =null;
	node31 head2 =null;
	node41 head3 =null;
	node51 head4 =null;
	node61 head5 =null;

	noder1 headr1 =null;


	noder2 headr2 =null;

	noder3 headr3 =null;
	noder4 headr4 =null;
	noder5 headr5 =null;
	String HLAA;
	String HLAB;
	String HLADRB1;
	String HLADQB1;
	String HLAC;
	String city;
	String name;
	String Add;
	String gender;
	String BG;
	String Adhar;
	String Mobile;
	int Age;
	int BMI;
	String noname;
	String noMobile;
	String organ;
	int daibetic = 0;
	int smoking = 0;
	int organ1=0;
	boolean a= false;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);


	public void create()throws IOException {
		System.out.println("Enter your name:");
		name=br.readLine();
		System.out.println("Enter your Adharcard no:");
		Adhar=br.readLine();
		System.out.println("Enter your mobile no:");
		Mobile=br.readLine();
		if(Mobile.length()<10||Mobile.length()>10) {
			System.out.println("Enter valid mob no.");
			Mobile=br.readLine();
		}
		System.out.println("Enter your Address");
		Add=br.readLine();
		System.out.println("Enter organ name");
		organ=sc.next();
		switch (organ.toLowerCase()) {
		case "eye":
			System.out.println("Enter your age");
			Age=sc.nextInt();
			if(Age>=2&&Age<74) {
				System.out.println("Enter your blood group");
				BG=sc.next();
				if(BG.equals("A+")==false&&BG.equals("A-")==false&&BG.equals("B+")==false&&BG.equals("B-")==false&&BG.equals("AB+")==false&&BG.equals("AB-")==false&&BG.equals("O+")==false&&BG.equals("O-")==false) {
					System.out.println("Enter valid blood group:");
					BG=sc.next();
				}
				System.out.println("Enter your BMI");
				BMI=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your nominee name");
				noname=sc.nextLine();

				System.out.println("Enter your nominee phone no.");
				noMobile=br.readLine();
				if(noMobile.length()<10||noMobile.length()>10) {
					System.out.println("Enter valid mob no.");
					noMobile=br.readLine();
				}
				br.readLine();
				System.out.println("Enter your HLA-A");
				HLAA=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-B");
				HLAB=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DRB1");
				HLADRB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DQB1");
				HLADQB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-C");
				HLAC=br.readLine();
				br.readLine();
				System.out.println("Are you daibetic?\t0:No 1:Yes");
				daibetic = sc.nextInt();
				System.out.println("Are you smoking?\t0:No 1:Yes");
				smoking = sc.nextInt() ;
				if(daibetic==0) {
					System.out.println("you are eligible to donate");

				}
				else {
					System.out.println("you are not eligible to donate,age crieteria not satisfied..");
					return;
				}


			}
			else {
				System.out.println("you are not eligible for donation");
				return;
			}
			break;
		case "kidney":
			System.out.println("Enter your age");
			Age=sc.nextInt();
			if(Age>=18&&Age<65) {
				System.out.println("Enter your blood group");
				BG=sc.next();
				if(BG.equals("A+")==false&&BG.equals("A-")==false&&BG.equals("B+")==false&&BG.equals("B-")==false&&BG.equals("AB+")==false&&BG.equals("AB-")==false&&BG.equals("O+")==false&&BG.equals("O-")==false) {
					System.out.println("Enter valid blood group:");
					BG=sc.next();
				}
				System.out.println("Enter your BMI");
				BMI=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your nominee name");
				noname=sc.nextLine();

				System.out.println("Enter your nominee phone no.");
				noMobile=br.readLine();
				if(noMobile.length()<10||noMobile.length()>10) {
					System.out.println("Enter valid mob no.");
					noMobile=br.readLine();
				}
				System.out.println("Enter your HLA-A");
				HLAA=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-B");
				HLAB=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DRB1");
				HLADRB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DQB1");
				HLADQB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-C");
				HLAC=br.readLine();
				br.readLine();
				System.out.println("Are you daibetic?\t0:No 1:Yes");
				daibetic = sc.nextInt();
				System.out.println("Are you smoking?\t0:No 1:Yes");
				smoking = sc.nextInt() ;
				System.out.println("hi");
				if(BMI <= 35 && 0==daibetic && 0==smoking ) {
					System.out.println("you are eligible to donate");
				}
				else {
					System.out.println("you are not eligible to donate");
					return;
				}
			}

			else {
				System.out.println("you are not eligible to donate");
				return;
			}
			break;

		case "heart":
			System.out.println("Enter your age");
			Age=sc.nextInt();
			if(Age>=15&&Age<50) {
				System.out.println("Enter your blood group");
				BG=sc.next();
				if(BG.equals("A+")==false&&BG.equals("A-")==false&&BG.equals("B+")==false&&BG.equals("B-")==false&&BG.equals("AB+")==false&&BG.equals("AB-")==false&&BG.equals("O+")==false&&BG.equals("O-")==false) {
					System.out.println("Enter valid blood group:");
					BG=sc.next();
				}
				System.out.println("Enter your BMI");
				BMI=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your nominee name");
				noname=sc.nextLine();

				System.out.println("Enter your nominee phone no.");
				noMobile=br.readLine();
				if(noMobile.length()<10||noMobile.length()>10) {
					System.out.println("Enter valid mob no.");
					noMobile=br.readLine();
				}
				br.readLine();
				System.out.println("Enter your HLA-A");
				HLAA=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-B");
				HLAB=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DRB1");
				HLADRB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DQB1");
				HLADQB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-C");
				HLAC=br.readLine();
				br.readLine();
				System.out.println("Are you daibetic?\t0:No 1:Yes");
				daibetic = sc.nextInt();
				System.out.println("Are you smoking?\t0:No 1:Yes");
				smoking = sc.nextInt() ;
				if(BMI<30 && 0==daibetic&& 0==smoking ) {
					System.out.println("you are eligible to donate");

				}
				else {
					System.out.println("you are not eligible to donate");
					return;
				}
			}

			else {
				System.out.println("you are not eligible to donate");
				return;
			}
			break;
		case "lungs":
			System.out.println("Enter your age");
			Age=sc.nextInt();
			if(Age>=15&&Age<50) {
				System.out.println("Enter your blood group");
				BG=sc.next();
				if(BG.equals("A+")==false&&BG.equals("A-")==false&&BG.equals("B+")==false&&BG.equals("B-")==false&&BG.equals("AB+")==false&&BG.equals("AB-")==false&&BG.equals("O+")==false&&BG.equals("O-")==false) {
					System.out.println("Enter valid blood group:");
					BG=sc.next();
				}
				System.out.println("Enter your BMI");
				BMI=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your nominee name");
				noname=sc.nextLine();

				System.out.println("Enter your nominee phone no.");
				noMobile=br.readLine();
				if(noMobile.length()<10||noMobile.length()>10) {
					System.out.println("Enter valid mob no.");
					noMobile=br.readLine();
				}
				br.readLine();
				System.out.println("Enter your HLA-A");
				HLAA=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-B");
				HLAB=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DRB1");
				HLADRB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DQB1");
				HLADQB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-C");
				HLAC=br.readLine();
				br.readLine();
				System.out.println("Are you daibetic?\t0:No 1:Yes");
				daibetic = sc.nextInt();
				System.out.println("Are you smoking?\t0:No 1:Yes");
				smoking = sc.nextInt() ;
				if(BMI<30 && 0==daibetic&& 0==smoking ) {
					System.out.println("you are eligible to donate");
				}
				else {
					System.out.println("you are not eligible to donate due to smoking ");
					return;
				}
			}

			else {
				System.out.println("you are not eligible to donate ,age crieteria not satisfied..");
				return;
			}
			break;
		case "liver":
			System.out.println("Enter your age");
			Age=sc.nextInt();
			if(Age>=18 && Age<70){
				System.out.println("Enter your blood group");
				BG=br.readLine();
				if(BG.equals("A+")==false&&BG.equals("A-")==false&&BG.equals("B+")==false&&BG.equals("B-")==false&&BG.equals("AB+")==false&&BG.equals("AB-")==false&&BG.equals("O+")==false&&BG.equals("O-")==false) {
					System.out.println("Enter valid blood group:");
					BG=sc.next();
				}
				System.out.println("Enter your BMI");
				BMI=sc.nextInt();

				System.out.println("Enter your Gender");
				gender=br.readLine();
				System.out.println("Are you daibetic?\t0:No 1:Yes");
				daibetic = sc.nextInt();
				System.out.println("Are you smoking?\t0:No 1:Yes");
				smoking = sc.nextInt() ;
				System.out.println("Enter your nominee name");
				noname=br.readLine();
				System.out.println("Enter your nominee phone no.");
				noMobile=br.readLine();
				if(noMobile.length()<10||noMobile.length()>10) {
					System.out.println("Enter valid mob no.");
					noMobile=br.readLine();
				}
				System.out.println("Enter your HLA-A");
				HLAA=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-B");
				HLAB=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DRB1");
				HLADRB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-DQB1");
				HLADQB1=br.readLine();
				br.readLine();
				System.out.println("Enter your HLA-C");
				HLAC=br.readLine();
				br.readLine();

				if(BMI<30 && daibetic==0 && smoking==0 ) {
					System.out.println("you are eligible to donate");
				}
				else {
					System.out.println("you are not eligible to donate due to smoking/diabetic");
					return;
				}
			}

			else {
				System.out.println("you are not eligible to donate due to age crieteria");
				return;
			}
			break;
		}
		if(organ.equalsIgnoreCase("EYE")) {
			//node21 head1 = new node21("Jack", "Shivajinagar", "male","A+", "793489349390", "7834392323", 34,21, "tina", "3548935345","eye",0,0,"12","12","12","12", "12" ,"Pune");
			node21  n1 = new node21(name,Add,gender,BG,Adhar,Mobile, Age ,BMI, noname, noMobile,organ,daibetic,  smoking,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(head1==null) {
				head1=n1;
			}
			else {
				n1.next=head1;
				head1=n1;
			}
		}
		if(organ.equalsIgnoreCase("kidney")) {
			node31  n2 = new node31(name,Add,gender,BG,Adhar,Mobile, Age ,BMI, noname, noMobile,organ,daibetic,  smoking,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(head2==null) {
				head2=n2;
			}
			else {
				n2.next=head2;
				head2=n2;
			}
		}
		if(organ.equalsIgnoreCase("heart")) {
			node41  n3 = new node41(name,Add,gender,BG,Adhar,Mobile, Age ,BMI, noname, noMobile,organ,daibetic,  smoking,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(head3==null) {
				head3=n3;
			}
			else {
				n3.next=head3;
				head3=n3;
			}
		}
		if(organ.equalsIgnoreCase("lungs")) {
			node51  n4 = new node51(name,Add,gender,BG,Adhar,Mobile, Age ,BMI, noname, noMobile,organ,daibetic,  smoking,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(head4==null) {
				head4=n4;
			}
			else {
				n4.next=head4;
				head4=n4;
			}
		}
		if(organ.equalsIgnoreCase("liver")) {
			node61  n5 = new node61(name,Add,gender,BG,Adhar,Mobile, Age ,BMI, noname, noMobile,organ,daibetic,  smoking,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(head5==null) {
				head5=n5;
			}
			else {
				n5.next=head5;
				head5=n5;
			}
		}


	}


	public void display() {
		System.out.println("Which organ's donor you want to see: Eye\tKidney\tLiver\tLungs\tHeart");
		String o = sc.next();
		if (o.equalsIgnoreCase("EYE")) {
			if (head1 == null) {
				System.out.println("nothing");
			} else {
				node21 temp = head1;
				while (temp != null) {
					System.out.println("Name of donor:");
					System.out.println(temp.name);
					System.out.println("Adhar of donor:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of donor:");
					System.out.println(temp.Mobile);
					System.out.println("Age of donor:");
					System.out.println(temp.Age);
					System.out.println("Gender of donor:");
					System.out.println(temp.gender);
					System.out.println("Blood group of donor:");
					System.out.println(temp.BG);
					System.out.println("Nominee name of donor:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of donor:");
					System.out.println(temp.noMobile);
					temp = temp.next;
				}
			}
		} else if (o.equalsIgnoreCase("kidney")) {
			if (head2 == null) {
				System.out.println("nothing");
			} else {
				node31 temp = head2;
				while (temp != null) {
					System.out.println("Name of donor:");
					System.out.println(temp.name);
					System.out.println("Adhar of donor:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of donor:");
					System.out.println(temp.Mobile);
					System.out.println("Age of donor:");
					System.out.println(temp.Age);
					System.out.println("Gender of donor:");
					System.out.println(temp.gender);
					System.out.println("Blood group of donor:");
					System.out.println(temp.BG);
					System.out.println("Nominee name of donor:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of donor:");
					System.out.println(temp.noMobile);
					temp = temp.next;
				}
			}
		} else if (o.equalsIgnoreCase("heart")) {
			if (head3 == null) {
				System.out.println("nothing");
			} else {
				node41 temp = head3;
				while (temp != null) {
					System.out.println("Name of donor:");
					System.out.println(temp.name);
					System.out.println("Adhar of donor:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of donor:");
					System.out.println(temp.Mobile);
					System.out.println("Age of donor:");
					System.out.println(temp.Age);
					System.out.println("Gender of donor:");
					System.out.println(temp.gender);
					System.out.println("Blood group of donor:");
					System.out.println(temp.BG);
					System.out.println("Nominee name of donor:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of donor:");
					System.out.println(temp.noMobile);
					temp = temp.next;
				}
			}
		} 
		else if (o.equalsIgnoreCase("lungs")) {
			if (head4 == null) {
				System.out.println("nothing");
			} else {
				node51 temp = head4;
				while (temp != null) {
					System.out.println("Name of donor:");
					System.out.println(temp.name);
					System.out.println("Adhar of donor:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of donor:");
					System.out.println(temp.Mobile);
					System.out.println("Age of donor:");
					System.out.println(temp.Age);
					System.out.println("Gender of donor:");
					System.out.println(temp.gender);
					System.out.println("Blood group of donor:");
					System.out.println(temp.BG);
					System.out.println("Nominee name of donor:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of donor:");
					System.out.println(temp.noMobile);
					temp = temp.next;
				}
			}
		}
		else if (o.equalsIgnoreCase("liver")) {
			if (head5 == null) {
				System.out.println("Nothing to display");
			} else {
				node61 temp = head5;
				while (temp != null) {
					System.out.println("Name of donor:");
					System.out.println(temp.name);
					System.out.println("Adhar of donor:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of donor:");
					System.out.println(temp.Mobile);
					System.out.println("Age of donor:");
					System.out.println(temp.Age);
					System.out.println("Gender of donor:");
					System.out.println(temp.gender);
					System.out.println("Blood group of donor:");
					System.out.println(temp.BG);
					System.out.println("Nominee name of donor:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of donor:");
					System.out.println(temp.noMobile);
					temp = temp.next;
				}
			}
		}
	}


	public void create1()throws IOException {
		System.out.println("Enter your name:");
		name=br.readLine();
		System.out.println("Enter your Adhar card no:");
		Adhar=br.readLine();
		System.out.println("Enter your mobile no:");
		Mobile=br.readLine();
		if(Mobile.length()<10||Mobile.length()>10) {
			System.out.println("Enter valid mob no.");
			Mobile=br.readLine();
		}

		System.out.println("Enter your Address");
		Add=br.readLine();
		System.out.println("Enter organ name");
		System.out.println("Enter 1:Eye\nEnter 2:Kidney\nEnter 3:Heart\nEnter 4.Lungs\nEnter 5.Liver");
		organ1=sc.nextInt();
		br.readLine();

		System.out.println("Enter your age");
		Age=br.read();
		br.readLine();
		System.out.println("Enter your BMI");
		BMI=br.read();
		br.readLine();

		System.out.println("Enter your blood group");
		BG=sc.next();
		if(BG.equals("A+")==false&&BG.equals("A-")==false&&BG.equals("B+")==false&&BG.equals("B-")==false&&BG.equals("AB+")==false&&BG.equals("AB-")==false&&BG.equals("O+")==false&&BG.equals("O-")==false) {
			System.out.println("Enter valid blood group:");
			BG=sc.next();
		}

		//br.readLine();
		System.out.println("Enter your nominee name");
		noname=sc.nextLine();
		br.readLine();
		System.out.println("Enter your nominee phone no.");
		noMobile=br.readLine();
		if(noMobile.length()<10||noMobile.length()>10) {
			System.out.println("Enter valid mob no.");
			noMobile=br.readLine();
		}
		br.readLine();
		System.out.println("Enter your HLA-A");
		HLAA=br.readLine();
		br.readLine();
		System.out.println("Enter your HLA-B");
		HLAB=br.readLine();
		br.readLine();
		System.out.println("Enter your HLA-DRB1");
		HLADRB1=br.readLine();
		br.readLine();
		System.out.println("Enter your HLA-DQB1");
		HLADQB1=br.readLine();
		br.readLine();
		System.out.println("Enter your HLA-C");
		HLAC=br.readLine();
		br.readLine();
		System.out.println("Enter the count of severity of diseaseSeverity levels:\n1.Asymptomatic\n2.Mild\n3.Moderate\n4.Severe\n5.Critical");
		int severity = sc.nextInt();
		if(organ1==1) {
			System.out.println("Record added..");
			noder1  nr1 = new noder1(name, Add, gender,BG, Adhar, Mobile, Age,BMI, noname, noMobile,organ1,severity,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(headr1==null) {
				headr1=nr1;
				System.out.println(headr1.name);

			}
			else {
				nr1.next=headr1;
				headr1=nr1;
			}
		}
		else if(organ1==2) {
			System.out.println("Record added..");
			noder2  nr2 = new noder2(name, Add, gender,BG, Adhar, Mobile, Age,BMI, noname, noMobile,organ1,severity,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(headr2==null) {
				headr2=nr2;

			}
			else {
				nr2.next=headr2;
				headr2=nr2;
			}
		}
		else if(organ1==3) {
			System.out.println("Record added..");
			noder3  nr3 = new noder3(name, Add, gender,BG, Adhar, Mobile, Age,BMI, noname, noMobile,organ1,severity,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(headr3==null) {
				headr3=nr3;
			}
			else {
				nr3.next=headr3;
				headr3=nr3;
			}
		}
		else if(organ1==4) {
			System.out.println("Record added..");
			noder4  nr4 = new noder4(name, Add, gender,BG, Adhar, Mobile, Age,BMI, noname, noMobile,organ1,severity,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(headr4==null) {
				headr4=nr4;
			}
			else {
				nr4.next=headr4;
				headr4=nr4;
			}
		}
		else if(organ1==5) {
			System.out.println("Record added..");
			noder5  nr5 = new noder5(name, Add, gender,BG, Adhar, Mobile, Age,BMI, noname, noMobile,organ1,severity,HLAA,HLAB,HLADRB1,HLADQB1, HLAC);
			if(headr5==null) {
				headr5=nr5;
			}
			else {
				nr5.next=headr5;
				headr5=nr5;
			}
		}
		else {
			System.out.println("BYE");
		}
	}


	public void display1() {

		System.out.println("Which organ's reciever you want to see:Enter 1:Eye\nEnter 2:Kidney\nEnter 3:Heart\nEnter 4.Lungs\nEnter 5.Liver");
		int o1=sc.nextInt();
		if(o1==1) {
			if(headr1==null) {
				System.out.println("Nothing to display");
			}
			else {
				noder1 temp =headr1;
				while(temp != null) {
					System.out.println("Name of receiver:");
					System.out.println(temp.name);
					System.out.println("Adhar of receiver:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of receiver:");
					System.out.println(temp.Mobile);
					System.out.println("Age of receiver:");
					System.out.println(temp.Age);
					System.out.println("Gender of receiver:");
					System.out.println(temp.gender);
					System.out.println("Blood group of receiver:");;
					System.out.println(temp.BG);
					System.out.println("Nominee name of receiver:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of receiver:");
					System.out.println(temp.noMobile);


					temp=temp.next;
				}
			}

		}
		if(o1==2) {
			if(headr2==null) {
				System.out.println("Nothing to display");
			}
			else {
				noder2 temp =headr2;
				while(temp != null) {
					System.out.println("Name of receiver:");
					System.out.println(temp.name);
					System.out.println("Adhar of receiver:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of receiver:");
					System.out.println(temp.Mobile);
					System.out.println("Age of receiver:");
					System.out.println(temp.Age);
					System.out.println("Gender of receiver:");
					System.out.println(temp.gender);
					System.out.println("Blood group of receiver:");;
					System.out.println(temp.BG);
					System.out.println("Nominee name of receiver:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of receiver:");
					System.out.println(temp.noMobile);


					temp=temp.next;
				}
			}


		}
		if(o1==3) {
			if(headr3==null) {
				System.out.println("Nothing to display");
			}
			else {
				noder3 temp =headr3;
				while(temp != null) {
					System.out.println("Name of receiver:");
					System.out.println(temp.name);
					System.out.println("Adhar of receiver:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of receiver:");
					System.out.println(temp.Mobile);
					System.out.println("Age of receiver:");
					System.out.println(temp.Age);
					System.out.println("Gender of receiver:");
					System.out.println(temp.gender);
					System.out.println("Blood group of receiver:");;
					System.out.println(temp.BG);
					System.out.println("Nominee name of receiver:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of receiver:");
					System.out.println(temp.noMobile);

					temp=temp.next;
				}
			}


		}
		if(o1==4) {
			if(headr4==null) {
				System.out.println("Nothing to display");
			}
			else {
				noder4 temp =headr4;
				while(temp != null) {
					System.out.println("Name of receiver:");
					System.out.println(temp.name);
					System.out.println("Adhar of receiver:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of receiver:");
					System.out.println(temp.Mobile);
					System.out.println("Age of receiver:");
					System.out.println(temp.Age);
					System.out.println("Gender of receiver:");
					System.out.println(temp.gender);
					System.out.println("Blood group of receiver:");;
					System.out.println(temp.BG);
					System.out.println("Nominee name of receiver:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of receiver:");
					System.out.println(temp.noMobile);

					temp=temp.next;
				}
			}


		}
		if(o1==5) {
			if(headr5==null) {
				System.out.println("Nothing to display");
			}
			else {
				noder5 temp =headr5;
				while(temp != null) {
					System.out.println("Name of receiver:");
					System.out.println(temp.name);
					System.out.println("Adhar of receiver:");
					System.out.println(temp.Adhar);
					System.out.println("Mobile no of receiver:");
					System.out.println(temp.Mobile);
					System.out.println("Age of receiver:");
					System.out.println(temp.Age);
					System.out.println("Gender of receiver:");
					System.out.println(temp.gender);
					System.out.println("Blood group of receiver:");;
					System.out.println(temp.BG);
					System.out.println("Nominee name of receiver:");
					System.out.println(temp.noname);
					System.out.println("Nominee phone no. of receiver:");
					System.out.println(temp.noMobile);

					temp=temp.next;
				}
			}


		}


	}

	noder1 temp = headr1;
	noder2 temp2 = headr2;
	noder3 temp4 = headr3;
	noder4 temp6 = headr4;
	noder5 temp8 = headr5;


	//Search
	node21 temp1 = head1;
	node21 availableDonorsHeadeye = null;
	node21 availableDonorsTaileye = null; 


	node31 temp3 = head2;
	node31 availableDonorsHeadkidney = null;
	node31 availableDonorsTailkidney = null; 

	node41 temp5 = head3;
	node41 availableDonorsHeadheart = null;
	node41 availableDonorsTailheart = null; 

	node51 temp7 = head4;
	node51 availableDonorsHeadlungs = null;
	node51 availableDonorsTaillungs = null; 

	node61 temp9 = head5;
	node61 availableDonorsHeadliver = null;
	node61 availableDonorsTailliver = null; 

	public void search() {
		int flag = 0;
		System.out.println("Enter the organ for which you are registered:");
		System.out.println("Enter 1:Eye\nEnter 2:Kidney\nEnter 3:Heart\nEnter 4.Lungs\nEnter 5.Liver");
		int organ5 = sc.nextInt();
		System.out.println("Enter your id");
		String id = sc.next();
		int p1=0;
		int p2=0;
		int p3=0;
		int p4=0;
		int p5=0;
		int count=0;
		if (organ5 == 1) {
			noder1 temp = headr1;
			while (temp != null) {
				if (id.equals(temp.Adhar)&&temp.reciever==0) {
					flag = 1;

					a6.add(new reciever(temp.name, temp.Add, temp.gender, temp.BG, temp.Adhar, temp.Mobile, temp.Age, temp.BMI, temp.noname, temp.noMobile, temp.severity,temp.HLAA, temp.HLAB,temp.HLADRB1,temp.HLADQB1, temp.HLAC));
					break;
				}
				temp = temp.next;
			}
			if (flag == 0) {
				System.out.println("Record is not present");
			} 

			else {
				node21 temp1 = head1;
				int c = 0;



				// The following loop modifies the list while iterating over it, which can cause errors
				while(temp1 !=null) {
					if ((a6.get(0).BG).equals((temp1.BG))&&temp1.donated==0) {
						p1=1;
						//a6.add(new reciever(temp.name, temp.Add, temp.gender, temp.BG, temp.Adhar, temp.Mobile, temp.Age, temp.BMI, temp.noname, temp.noMobile, temp.severity));
						a1.add(new donar(temp1.name, temp1.Add, temp1.gender, temp1.BG, temp1.Adhar, temp1.Mobile, temp1.Age, temp1.BMI, temp1.noname, temp1.noMobile,temp1.HLAA, temp1.HLAB,temp1.HLADRB1,temp1.HLADQB1, temp1.HLAC));
						System.out.println("Donor is available");

						if (availableDonorsHeadeye == null) {
							availableDonorsHeadeye = temp1;
							availableDonorsTaileye = temp1;
						} else {
							availableDonorsTaileye.next = temp1;
							availableDonorsTaileye = temp1;
						}

						mapSearch();

					}
					temp1=temp1.next;
				}



				if(p1==0) {
					System.out.println("Donar is not available");
					a6.remove(0);
				}

				if (availableDonorsTaileye != null) {
					availableDonorsTaileye.next = null;
				}


				//				displayAvailableDonors();

			}

		}
		if (organ5 == 2) {
			noder2 temp2 = headr2;
			while (temp2 != null) {
				if (id.equals(temp2.Adhar)) {
					flag = 1;


					a6.add(new reciever(temp2.name, temp2.Add, temp2.gender, temp2.BG, temp2.Adhar, temp2.Mobile, temp2.Age, temp2.BMI, temp2.noname, temp2.noMobile, temp2.severity,temp2.HLAA, temp2.HLAB,temp2.HLADRB1,temp2.HLADQB1, temp2.HLAC));
					break;
				}
				temp2 = temp2.next;
			}
			if (flag == 0) {
				System.out.println("Record is not present");
			} else {
				node31 temp3 = head2;
				int c = 0;



				// The following loop modifies the list while iterating over it, which can cause errors
				while(temp3 !=null) {
					count=0;

					if ((a6.get(0).BG).equals((temp3.BG))&&temp3.donated==0) {
						if((a6.get(0).HLAA).equals((temp3.HLAA))) {
							count++;

						}
						if((a6.get(0).HLAB).equals((temp3.HLAB))) {
							count++;

						}
						if((a6.get(0).HLADRB1).equals((temp3.HLADRB1))) {
							count++;

						}
						if((a6.get(0).HLADQB1).equals((temp3.HLADQB1))) {
							count++;

						}
						if((a6.get(0).HLAC).equals((temp3.HLAC))) {
							count++;

						}




					}
					if(count>=3) {
						p2=1;

						a2.add(new donar(temp3.name, temp3.Add, temp3.gender, temp3.BG, temp3.Adhar, temp3.Mobile, temp3.Age, temp3.BMI, temp3.noname, temp3.noMobile,temp3.HLAA, temp3.HLAB,temp3.HLADRB1,temp3.HLADQB1, temp3.HLAC));
						System.out.println("Donor is available");


						if (availableDonorsHeadkidney == null) {
							availableDonorsHeadkidney = temp3;
							availableDonorsTailkidney = temp3;
						} else {
							availableDonorsTailkidney.next = temp3;
							availableDonorsTailkidney = temp3;
						}

						mapSearch();

					}
					temp3=temp3.next;
				}


				if(p2==0) {
					System.out.println("Donar is not available");
					a6.remove(0);
				}

				if (availableDonorsTailkidney != null) {
					availableDonorsTailkidney.next = null;
				}


				// The following lines assume that the donor list is non-empty and contains a donor with the correct blood group
				// This is a duplicate line
			}
		}

		if (organ5 == 3) {
			noder3 temp4 = headr3;
			while (temp4 != null) {
				if (id.equals(temp4.Adhar)) {
					flag = 1;


					a6.add(new reciever(temp4.name, temp4.Add, temp4.gender, temp4.BG, temp4.Adhar, temp4.Mobile, temp4.Age, temp4.BMI, temp4.noname, temp4.noMobile, temp4.severity,temp4.HLAA, temp4.HLAB,temp4.HLADRB1,temp4.HLADQB1, temp4.HLAC));
					break;
				}
				temp4 = temp4.next;
			}
			if (flag == 0) {
				System.out.println("Record is not present");
			} else {
				node41 temp5 = head3;
				int c = 0;



				// The following loop modifies the list while iterating over it, which can cause errors
				while(temp5 !=null) {
					count=0;
					if ((a6.get(0).BG).equals((temp5.BG))&&temp5.donated==0) {
						if((a6.get(0).HLAA).equals((temp5.HLAA))) {
							count++;

						}
						if((a6.get(0).HLAB).equals((temp5.HLAB))) {
							count++;

						}
						if((a6.get(0).HLADRB1).equals((temp5.HLADRB1))) {
							count++;

						}
						if((a6.get(0).HLADQB1).equals((temp5.HLADQB1))) {
							count++;

						}
						if((a6.get(0).HLAC).equals((temp5.HLAC))) {
							count++;

						}



					}
					if(count>=4) {
						p3=1;
						//a6.add(new reciever(temp4.name, temp4.Add, temp4.gender, temp4.BG, temp4.Adhar, temp4.Mobile, temp4.Age, temp4.BMI, temp4.noname, temp4.noMobile, temp4.severity));

						a3.add(new donar(temp5.name, temp5.Add, temp5.gender, temp5.BG, temp5.Adhar, temp5.Mobile, temp5.Age, temp5.BMI, temp5.noname, temp5.noMobile,temp5.HLAA, temp5.HLAB,temp5.HLADRB1,temp5.HLADQB1, temp5.HLAC));
						System.out.println("Donor is available");

						if (availableDonorsHeadheart == null) {
							availableDonorsHeadheart = temp5;
							availableDonorsTailheart = temp5;
						} else {
							availableDonorsTailheart.next = temp5;
							availableDonorsTailheart = temp5;
						}
						//System.out.println("YES");

						mapSearch();
					}
					temp5=temp5.next;
				}
				if(p3==0) {
					System.out.println("Donar is not available");
					a6.remove(0);
				}

				if (availableDonorsTailheart != null) {
					availableDonorsTailheart.next = null;
				}


				// The following lines assume that the donor list is non-empty and contains a donor with the correct blood group
				// This is a duplicate line
			}
		}
		if (organ5 == 4) {
			noder4 temp6 = headr4;
			while (temp6 != null) {
				if (id.equals(temp6.Adhar)) {
					flag = 1;

					// The following line creates a new object but does not use it
					a6.add(new reciever(temp6.name, temp6.Add, temp6.gender, temp6.BG, temp6.Adhar, temp6.Mobile, temp6.Age, temp6.BMI, temp6.noname, temp6.noMobile, temp6.severity,temp6.HLAA, temp6.HLAB,temp6.HLADRB1,temp6.HLADQB1, temp6.HLAC));
					break;
				}
				temp6 = temp6.next;
			}
			if (flag == 0) {
				System.out.println("Record is not present");
			} else {

				//				node21 temp7 = head1;

				node51 temp7 = head4;
				int c = 0;



				// The following loop modifies the list while iterating over it, which can cause errors
				while(temp7 !=null) {
					count=0;
					if ((a6.get(0).BG).equals((temp7.BG))&&temp7.donated==0) {
						if((a6.get(0).HLAA).equals((temp7.HLAA))) {
							count++;

						}
						if((a6.get(0).HLAB).equals((temp7.HLAB))) {
							count++;

						}
						if((a6.get(0).HLADRB1).equals((temp7.HLADRB1))) {
							count++;

						}
						if((a6.get(0).HLADQB1).equals((temp7.HLADQB1))) {
							count++;

						}
						if((a6.get(0).HLAC).equals((temp7.HLAC))) {
							count++;

						}




					}
					if(count>=4) {
						p4=1;
						// a6.add(new reciever(temp6.name, temp6.Add, temp6.gender, temp6.BG, temp6.Adhar, temp6.Mobile, temp6.Age, temp6.BMI, temp6.noname, temp6.noMobile, temp6.severity));
						a4.add(new donar(temp7.name, temp7.Add, temp7.gender, temp7.BG, temp7.Adhar, temp7.Mobile, temp7.Age, temp7.BMI, temp7.noname, temp7.noMobile,temp7.HLAA, temp7.HLAB,temp7.HLADRB1,temp7.HLADQB1, temp7.HLAC));
						System.out.println("Donor is available");


						if (availableDonorsHeadlungs == null) {
							availableDonorsHeadlungs = temp7;
							availableDonorsTaillungs = temp7;
						} else {
							availableDonorsTaillungs.next = temp7;
							availableDonorsTaillungs = temp7;
						}

						mapSearch();
					}

					temp7=temp7.next;
				}
				if(p4==0) {
					System.out.println("Donar is not available");
					a6.remove(0);
				}

				if (availableDonorsTaillungs != null) {
					availableDonorsTaillungs.next = null;
				}
				// The following lines assume that the donor list is non-empty and contains a donor with the correct blood group
				// This is a duplicate line
			}
		}
		if (organ5 == 5) {
			noder5 temp8 = headr5;
			while (temp8 != null) {
				if (id.equals(temp8.Adhar)) {
					flag = 1;

					// The following line creates a new object but does not use it
					a6.add(new reciever(temp8.name, temp8.Add, temp8.gender, temp8.BG, temp8.Adhar, temp8.Mobile, temp8.Age, temp8.BMI, temp8.noname, temp8.noMobile, temp8.severity,temp8.HLAA, temp8.HLAB,temp8.HLADRB1,temp8.HLADQB1, temp8.HLAC));
					break;
				}
				temp8 = temp8.next;
			}
			if (flag == 0) {
				System.out.println("Record is not present");
			} else {
				//				node21 temp9 = head1;
				node61 temp9=head5;
				int c = 0;



				// The following loop modifies the list while iterating over it, which can cause errors
				while(temp9 !=null) {
					count=0;
					if ((a6.get(0).BG).equals((temp9.BG))&&temp9.donated==0) {
						if((a6.get(0).HLAA).equals((temp9.HLAA))) {
							count++;

						}
						if((a6.get(0).HLAB).equals((temp9.HLAB))) {
							count++;

						}
						if((a6.get(0).HLADRB1).equals((temp9.HLADRB1))) {
							count++;

						}
						if((a6.get(0).HLADQB1).equals((temp9.HLADQB1))) {
							count++;

						}
						if((a6.get(0).HLAC).equals((temp9.HLAC))) {
							count++;

						}
					}
					if(count>=4) {
						p5=1;
						// a6.add(new reciever(temp8.name, temp8.Add, temp8.gender, temp8.BG, temp8.Adhar, temp8.Mobile, temp8.Age, temp8.BMI, temp8.noname, temp8.noMobile, temp8.severity));
						a5.add(new donar(temp9.name, temp9.Add, temp9.gender, temp9.BG, temp9.Adhar, temp9.Mobile, temp9.Age, temp9.BMI, temp9.noname, temp9.noMobile,temp9.HLAA, temp9.HLAB,temp9.HLADRB1,temp9.HLADQB1, temp9.HLAC));
						System.out.println("Donor is available");


						if (availableDonorsHeadliver == null) {
							availableDonorsHeadliver = temp9;
							availableDonorsTailliver = temp9;
						} else {
							availableDonorsTailliver.next = temp9;
							availableDonorsTailliver = temp9;
						}

						mapSearch();
					}
					temp9=temp9.next;
				}
				if(p5==0) {
					System.out.println("Donar is not available");
					a6.remove(0);
				}

				if (availableDonorsTailliver != null) {
					availableDonorsTailliver.next = null;
				}

			}
		}
	}
	//Function to find the shortest distance of all the vertices
	//from the source vertex S.
	static String dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S, HashMap<String, Integer> cityToVertex, String key)
	{
		int[] dist = new int[V]; // to store the distance from source vertex
		int[] prev = new int[V]; // to store the previous vertex in the path
		Arrays.fill(dist, Integer.MAX_VALUE);            //2147483647" is the maximum value that can be stored in an integer variable
		Arrays.fill(prev, -1);
		dist[S] = 0; // distance from source to source is zero
		PriorityQueue<Pair> q = new PriorityQueue<> () ;

		q.add(new Pair(0,S));       // weight and vertex(Source for 1st time)

		while(q.size()!=0){
			Pair curr = q.remove();
			int u = curr.v;      //vertex of current pair

			if(dist[u] < curr.wt){
				continue;
			}

			ArrayList<ArrayList<Integer>> neighbors = adj.get(u);
			for(ArrayList<Integer> list : neighbors){
				int vertex = list.get(0);                 
				int wt = list.get(1);						

				if(dist[u]+wt < dist[vertex]){
					dist[vertex] = dist[u]+wt;
					prev[vertex] = u;
					q.add(new Pair(dist[vertex], vertex));
				}
			} 
		}
		int[] a= new int[3];
		int j=0;
		// output the shortest path and distance from the source vertex
		for(int i=0; i<V; i++){
			if(i==2 || i==3 || i==5) {
				a[j]=dist[i];
				j++;
			}
		}

		HashMap<String, Integer> CV = new HashMap<>();
		CV.put("Kothrud", 0);
		CV.put("Sasoon_Road", 1);
		CV.put("Sangamvadi", 2);

		for(int i=0;i<V;i++) {
			if(dist[i] == Integer.MAX_VALUE){
				System.out.println("No path from source " + S + " to vertex " + i);
			}
			else{
				System.out.print("Shortest distance from source " + S + " to vertex " + i + ": " + dist[i] + ", shortest path: ");
				int p = prev[i];
				Stack<Integer> stack = new Stack<>();
				while(p != -1){
					stack.push(p);
					p = prev[p];
				}
				while(!stack.isEmpty()) {
					System.out.print(stack.pop() + " -> ");
				}
				System.out.println(i);
			}
		}

		int min=a[0];

		int k=0;
		for(int i=0;i<a.length;i++) {
			if(min>=a[i]) {
				min=a[i];
				k=i;
			}
		}
		for (Map.Entry<String, Integer> entry : CV.entrySet()) {
			if (entry.getValue() == k) {
				key = entry.getKey();
				break;
			}
		}
		System.out.println("Nearest Transplant center from Patient Location is "+key);
		return key ;
	}


	static DistanceF head=null;

	static class DistanceF //create a class
	{
		int distDonorD;
		String Aadhar;
		String donor;
		DistanceF next;

		DistanceF(String donor,String Aadhar,int distDonorD)
		{
			this.Aadhar=Aadhar;
			this.distDonorD=distDonorD;
			this.donor=donor;
			next=null; 
		}
	}

	public static int calculateShortestDistances(HashMap<String, Integer> cityToVertex, ArrayList<ArrayList<ArrayList<Integer>>> adj, String donor,String Aadhar, String destination) {
		// Get the vertex numbers for the donor and destination cities
		int vertexD = cityToVertex.get(destination);
		int vertexDonor = cityToVertex.get(donor);

		// Initialize the distance array with infinity values
		int[] distance = new int[adj.size()];
		Arrays.fill(distance, Integer.MAX_VALUE);

		// Use a priority queue to implement Dijkstra's algorithm
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		distance[vertexD] = 0;
		pq.add(vertexD);

		while (!pq.isEmpty()) {
			int u = pq.poll();
			for (int i = 0; i < adj.get(u).size(); i++) {
				int v = adj.get(u).get(i).get(0);
				int weight = adj.get(u).get(i).get(1);
				if (distance[v] > distance[u] + weight) {
					distance[v] = distance[u] + weight;
					pq.add(v);
				}
			}
		}

		// Print the shortest distance from the donor to the destination
		int distDonorD = distance[vertexDonor];
		System.out.println("Donor at " + donor + ":");
		System.out.println("Shortest distance from " + donor + " to " + destination + ": " + distDonorD);


		DistanceF newNode = new DistanceF(donor,Aadhar,distDonorD);
		if(head==null) {
			head=newNode;
		}
		else {
			DistanceF temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}


		return distDonorD;
	}


	public DistanceF findSmallestNode(DistanceF head) {
		int minValue = Integer.MAX_VALUE; // set minValue to a very large value
		DistanceF minNode = null; // set minNode to null

		DistanceF currentNode = head;
		while (currentNode != null) {
			if (currentNode.distDonorD < minValue) {
				minValue = currentNode.distDonorD;
				minNode = currentNode;
			}
			currentNode = currentNode.next;
		}

		return minNode;
	}


	static NodeA headA=null;
	class NodeA{
		String rec_id;
		String don_id;
		String organ;
		NodeA next;
		NodeA(String organ, String don_id,String rec_id){
			this.rec_id=rec_id;
			this.don_id=don_id;
			this.organ=organ;
			this.next=null;

		}

	}


	public  void mapSearch() {



		int V = 7;
		HashMap<String, Integer> cityToVertex = new HashMap<>();
		cityToVertex.put("Deccan_Gymkhana", 0);
		cityToVertex.put("Nagar_Road", 1);
		cityToVertex.put("Kothrud", 2);
		cityToVertex.put("Sasoon_Road", 3);
		cityToVertex.put("Shivaji_Nagar", 4);
		cityToVertex.put("Sangamvadi", 5);
		cityToVertex.put("Chinchwad", 6);
		ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<> ();
		for(int i=0; i<V; i++){
			adj.add(new ArrayList<> ());
		}
		// add edges
		//    adj.get(cityToVertex.get("Deccan Gymkhana")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Nagar Road"), (int) 6.7)));
		//    adj.get(cityToVertex.get("Deccan Gymkhana")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Kothrud"), (int) 4.79)));
		MAIN A=new MAIN();
		adj.get(cityToVertex.get("Deccan_Gymkhana")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Nagar_Road"), 6)));
		adj.get(cityToVertex.get("Deccan_Gymkhana")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Kothrud"), 9)));
		adj.get(cityToVertex.get("Deccan_Gymkhana")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sasoon_Road"), 2)));
		adj.get(cityToVertex.get("Deccan_Gymkhana")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Shivaji_Nagar"), 2)));
		adj.get(cityToVertex.get("Deccan_Gymkhana")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Chinchwad"), 3)));
		adj.get(cityToVertex.get("Deccan_Gymkhana")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sangamvadi"), 1)));

		adj.get(cityToVertex.get("Nagar_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Deccan_Gymkhana"), 6)));
		adj.get(cityToVertex.get("Nagar_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Kothrud"), 7)));
		adj.get(cityToVertex.get("Nagar_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sasoon_Road"), 7)));
		adj.get(cityToVertex.get("Nagar_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sangamvadi"), 4)));
		adj.get(cityToVertex.get("Nagar_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Shivaji_Nagar"), 8)));
		adj.get(cityToVertex.get("Nagar_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Chinchwad"), 8)));

		adj.get(cityToVertex.get("Kothrud")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Nagar_Road"), 7)));
		adj.get(cityToVertex.get("Kothrud")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Deccan_Gymkhana"), 9)));
		adj.get(cityToVertex.get("Kothrud")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sasoon_Road"), 8)));
		adj.get(cityToVertex.get("Kothrud")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Shivaji_Nagar"), 7)));
		adj.get(cityToVertex.get("Kothrud")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sangamvadi"), 7)));
		adj.get(cityToVertex.get("Kothrud")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Chinchwad"), 8)));

		adj.get(cityToVertex.get("Sasoon_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Nagar_Road"), 7)));
		adj.get(cityToVertex.get("Sasoon_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Deccan_Gymkhana"), 2)));
		adj.get(cityToVertex.get("Sasoon_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Shivaji_Nagar"), 8)));
		adj.get(cityToVertex.get("Sasoon_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Chinchwad"), 7)));
		adj.get(cityToVertex.get("Sasoon_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sangamvadi"), 12)));
		adj.get(cityToVertex.get("Sasoon_Road")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Kothrud"), 8)));

		adj.get(cityToVertex.get("Shivaji_Nagar")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Deccan_Gymkhana"), 2)));
		adj.get(cityToVertex.get("Shivaji_Nagar")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Kothrud"), 8)));
		adj.get(cityToVertex.get("Shivaji_Nagar")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sangamvadi"), 81)));
		adj.get(cityToVertex.get("Shivaji_Nagar")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Chinchwad"), 12)));
		adj.get(cityToVertex.get("Shivaji_Nagar")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Nagar_Road"), 8)));
		adj.get(cityToVertex.get("Shivaji_Nagar")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sasoon_Road"), 8)));


		adj.get(cityToVertex.get("Sangamvadi")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Deccan_Gymkhana"), 1)));
		adj.get(cityToVertex.get("Sangamvadi")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Kothrud"), 7)));
		adj.get(cityToVertex.get("Sangamvadi")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Shivaji_Nagar"), 81)));
		adj.get(cityToVertex.get("Sangamvadi")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Nagar_Road"), 4)));
		adj.get(cityToVertex.get("Sangamvadi")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sasoon_Road"), 12)));
		adj.get(cityToVertex.get("Sangamvadi")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Chinchwad"), 50)));

		adj.get(cityToVertex.get("Chinchwad")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Deccan_Gymkhana"), 3)));
		adj.get(cityToVertex.get("Chinchwad")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Kothrud"), 8)));
		adj.get(cityToVertex.get("Chinchwad")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sangamvadi"), 50)));
		adj.get(cityToVertex.get("Chinchwad")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Shivaji_Nagar"), 12)));
		adj.get(cityToVertex.get("Chinchwad")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Nagar_Road"), 8)));
		adj.get(cityToVertex.get("Chinchwad")).add(new ArrayList<Integer> (Arrays.asList(cityToVertex.get("Sasoon_Road"), 7)));
		Scanner sc = new Scanner(System.in);



		String source=null;
		noder1 eye=headr1;
		node21 donarCities1=availableDonorsHeadeye;	


		noder2 kidney=headr2;
		node31 donarCities2=availableDonorsHeadkidney;


		noder3 heart=headr3;
		node41 donarCities3=availableDonorsHeadheart;

		noder4 lungs=headr4;
		node51 donarCities4=availableDonorsHeadlungs;

		noder5 liver=headr5;
		node61 donarCities5=availableDonorsHeadliver;

		int finalDist[]=new int[7];
		Arrays.fill(finalDist, Integer.MAX_VALUE);
		int i=0;

		int min=finalDist[0];
		String returnedKey=null;

		//for eye

		while(eye!=null) {
			source =eye.Add;
			if(!cityToVertex.containsKey(source)){
				System.out.println("City you have entered does not exist.");
				return;
			}
			else {
				int S = cityToVertex.get(source);
				returnedKey = dijkstra(V, adj, S, cityToVertex, null);
				System.out.println(donarCities1.Add);
				while (donarCities1 != null) {
					String donorA = donarCities1.Add;
					String Aadhar=donarCities1.Adhar;

					calculateShortestDistances(cityToVertex, adj, donorA, Aadhar, returnedKey);
					donarCities1 = donarCities1.next;
				}					
			}
			DistanceF headNode = head; 
			DistanceF smallestNode = findSmallestNode(headNode);

			// Do something with the smallest node, such as printing its value
			if (smallestNode != null) {
				System.out.println("The smallest node has a distance of " + smallestNode.distDonorD);
			} else {
				System.out.println("empty list");
			}

			System.out.println();
			System.out.println("SELECTED DONOR : Donor who have shortest distance "+smallestNode.distDonorD+ "  from "+returnedKey+ " is at "+ smallestNode.donor);



			NodeA newNodeA = new NodeA("eye",smallestNode.Aadhar,eye.Adhar);
			if(headA==null) {
				headA=newNodeA;
			}
			else {
				DistanceF temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=temp;
			}


			eye=eye.next;
		}






		while(kidney!=null) {
			source =kidney.Add;
			if(!cityToVertex.containsKey(source)){
				System.out.println("City you have entered does not exist.");
				return;
			}
			else {
				int S = cityToVertex.get(source);
				returnedKey = dijkstra(V, adj, S, cityToVertex, null);
				System.out.println(donarCities2.Add);
				while (donarCities2 != null) {
					String donorA = donarCities2.Add;
					String Aadhar=donarCities2.Adhar;

					calculateShortestDistances(cityToVertex, adj, donorA, Aadhar, returnedKey);
					donarCities2 = donarCities2.next;
				}					
			}
			DistanceF headNode = head; 
			DistanceF smallestNode = findSmallestNode(headNode);

			// Do something with the smallest node, such as printing its value
			if (smallestNode == null) {
				System.out.println("empty list");
			} 

			System.out.println();
			System.out.println("SELECTED DONOR : Donor who have shortest distance "+smallestNode.distDonorD+ "  from "+returnedKey+ " is at "+ smallestNode.donor);



			NodeA newNodeA = new NodeA("kedney",smallestNode.Aadhar,kidney.Adhar);
			if(headA==null) {
				headA=newNodeA;
			}
			else {
				DistanceF temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=temp;
			}
			kidney=kidney.next;
		}



		//for heart
		while(heart!=null) {
			source =heart.Add;
			if(!cityToVertex.containsKey(source)){
				System.out.println("City you have entered does not exist.");
				return;
			}
			else {
				int S = cityToVertex.get(source);
				returnedKey = dijkstra(V, adj, S, cityToVertex, null);
				System.out.println(donarCities3.Add);
				while (donarCities3 != null) {
					String donorA = donarCities3.Add;
					String Aadhar=donarCities3.Adhar;

					calculateShortestDistances(cityToVertex, adj, donorA, Aadhar, returnedKey);
					donarCities3 = donarCities3.next;
				}					
			}
			DistanceF headNode = head; 
			DistanceF smallestNode = findSmallestNode(headNode);

			if (smallestNode == null) {
				System.out.println("empty list");
			} 
			System.out.println();
			System.out.println("SELECTED DONOR : Donor who have shortest distance "+smallestNode.distDonorD+ "  from "+returnedKey+ " is at "+ smallestNode.donor);



			NodeA newNodeA = new NodeA("heart",smallestNode.Aadhar,heart.Adhar);
			if(headA==null) {
				headA=newNodeA;
			}
			else {
				DistanceF temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=temp;
			}

			heart=heart.next;
		}


		while(lungs!=null) {
			source =lungs.Add;
			if(!cityToVertex.containsKey(source)){
				System.out.println("City you have entered does not exist.");
				return;
			}
			else {
				int S = cityToVertex.get(source);
				returnedKey = dijkstra(V, adj, S, cityToVertex, null);
				System.out.println(donarCities4.Add);
				while (donarCities4 != null) {
					String donorA = donarCities4.Add;
					String Aadhar=donarCities4.Adhar;

					calculateShortestDistances(cityToVertex, adj, donorA, Aadhar, returnedKey);
					donarCities4 = donarCities4.next;
				}					
			}
			DistanceF headNode = head; 
			DistanceF smallestNode = findSmallestNode(headNode);

			if (smallestNode == null) {
				System.out.println("empty list");
			} 

			System.out.println();
			System.out.println("SELECTED DONOR : Donor who have shortest distance "+smallestNode.distDonorD+ "  from "+returnedKey+ " is at "+ smallestNode.donor);



			NodeA newNodeA = new NodeA("Lungs",smallestNode.Aadhar,lungs.Adhar);
			if(headA==null) {
				headA=newNodeA;
			}
			else {
				DistanceF temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=temp;
			}
			lungs=lungs.next;
		}

		while(liver!=null) {
			source =liver.Add;
			if(!cityToVertex.containsKey(source)){
				System.out.println("City you have entered does not exist.");
				return;
			}
			else {
				int S = cityToVertex.get(source);
				returnedKey = dijkstra(V, adj, S, cityToVertex, null);
				System.out.println(donarCities5.Add);
				while (donarCities5 != null) {
					String donorA = donarCities5.Add;
					String Aadhar=donarCities5.Adhar;

					calculateShortestDistances(cityToVertex, adj, donorA, Aadhar, returnedKey);
					donarCities5 = donarCities5.next;
				}					
			}
			DistanceF headNode = head; 
			DistanceF smallestNode = findSmallestNode(headNode);

			if (smallestNode == null) {
				System.out.println("empty list");
			} 
			System.out.println();
			System.out.println("SELECTED DONOR : Donor who have shortest distance "+smallestNode.distDonorD+ "  from "+returnedKey+ " is at "+ smallestNode.donor);



			NodeA newNodeA = new NodeA("Liver",smallestNode.Aadhar,liver.Adhar);
			if(headA==null) {
				headA=newNodeA;
			}
			else {
				DistanceF temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=temp;
			}

			liver=liver.next;
		}


	}


	public void Displayyyyy() {
		NodeA curr=headA;
		int i=1;

		while(curr!=null) {
			System.out.println(i);
			System.out.println("Organ: "+curr.organ+", Matched donor id: "+curr.don_id+", Matched rec id:"+curr.rec_id);
			i++;
			curr=curr.next;
		}
	}



}


class Pair implements Comparable<Pair>{
	int wt;
	int v;
	public Pair(int wt, int v){
		this.wt=wt;
		this.v=v;
	}

	public int compareTo(Pair that){
		return this.wt-that.wt;
	}
}

public class MAIN{


	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("******************************Saving Lives Together******************************");
		System.out.println("The aim of the organ donation system is to save and improve the lives of \nindividuals with end-stageorgan failure by facilitating the selfless act of donation\nand transplantation of organs, ensuring equitable access to organs, and\nproviding ongoing support to donors and recipients.");
		System.out.println("Organs can be donated & requested\n\n1.Eye\t2.Kidney\t3.Liver\t\t4.Lungs\t\t5.Heart");
		System.out.println("==================================================================================");
		System.out.println("We provide organs for residents of Pune from areas mentioned below- \n\t->Deccan Gymkhana\n\t->Sangamwadi      (Transplant Center)\n\t->Nagar Road\n\t->Sasoon Road     (Transplant Center)\n\t->Shivaji Nagar\n\t->Kothrud         (Transplant Center)\n");
		System.out.println("====================================================================================");


		d d1 = new d();
		char continue1;
		do {
			System.out.println("\t\t\tWELCOME TO ORGAN DONATION SYSTEM");
			System.out.println("====================================================================================");
			System.out.println("Enter 1-Admin\nEnter 2-Receiver\nEnter 3-Donor");
			int option=sc.nextInt();
			if(option==1) {
				System.out.println("Enter username for admin:");
				String username=sc.next();
				System.out.println("Enter password for admin:");
				String pass=sc.next();
				if(username.equals("John") && pass.equals("7878")) {

					System.out.println("---------Welcome To Admin Section----------\n ");
					System.out.println("Enter 1:Display Receiver List\nEnter 2:Display Donor List\nEnter 3:Find Matched Receiver and Donor");
					int op=sc.nextInt();

					if(op==1) {
						d1.display1();
					}
					else if(op==2) {
						d1.display();
					}
					else if(op==3) {
						//donor and receiver matching list




						d admin = new d();
						admin.Displayyyyy();

					}

				}
				else {
					System.out.println("Invalid login credentials..");
				}

			}
			else if(option==2) {
				System.out.println("---------Welcome To Receiver Section----------");
				System.out.println("Do you want to fill the form:Enter yes");
				String op=sc.next();
				if(op.equals("yes")) {
					System.out.println("Inside create rec");
					d1.create1();
					d1.search();


				}

			}
			else if(option==3) {
				System.out.println("---------Welcome To Donor Section----------");

				System.out.println("Do you want to fill the form:Enter yes");
				String op=sc.next();
				if(op.equals("yes")) {
					d1.create();
				}

			}
			System.out.println("Do you want to continue:Enter Y");
			continue1 = sc.next().charAt(0);

		}
		while(continue1=='Y');
	}

}




























