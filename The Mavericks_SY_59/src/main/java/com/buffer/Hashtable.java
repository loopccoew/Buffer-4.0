package com.buffer;

import java.util.Scanner;



public class Hashtable {

	Parking[] Floor1=new Parking[16];

	Parking[] Floor2=new Parking[16];

	Parking[] Floor3=new Parking[16];

	Parking[] Parking_Lot[]= {Floor1,Floor2,Floor3};

	

	long generateHeapKey(String parkingID) {



		long ans = 0;

		ans += Integer.parseInt(parkingID.substring(0, 1));

		String c = parkingID.substring(1,2);

		ans *= 10;

	

		if(c.equals("B")){

		ans += 2;

		}

		

		else if(c.equals("R" )||c.equals("L" )) {

		ans += 1;

		}



		String s = parkingID.substring(2);

		ans *= Math.pow(10, s.length());

		ans += Integer.parseInt(s);



		return ans;



		}

	

    Hashtable()

	{

    

    	for(int i=0;i<3;i++) 

		{

    		for(int j=0;j<16;j++)

			 {

    			

    			if(j<6) {

    				Parking newnode=new Parking(Integer.toString(i+1)+"R"+Integer.toString(j+1));

    				Parking_Lot[i][j]=newnode;

    				Parking_Lot[i][j].heapKey=generateHeapKey(Integer.toString(i+1)+"R"+Integer.toString(j+1));

    				}

    			else if(j<=10 && j>=6) {

    				Parking newnode=new Parking(Integer.toString(i+1)+"L"+Integer.toString(j-5));

    				Parking_Lot[i][j]=newnode;

    				Parking_Lot[i][j].heapKey=generateHeapKey(Integer.toString(i+1)+"L"+Integer.toString(j-5));

				}

    			else {

    			

					Parking newnode=new Parking(Integer.toString(i+1)+"B"+Integer.toString(j-10));

    				Parking_Lot[i][j]=newnode;

    				Parking_Lot[i][j].heapKey=generateHeapKey(Integer.toString(i+1)+"B"+Integer.toString(j-10));

				}

    			}

    		}

        

    }}



class Method{  

	Scanner input=new Scanner(System.in);

	

	Hashtable node=new Hashtable();

	

	int outerHashkey(String key){

		int key1;

		String Str=key.substring(0,1);

		key1=Integer.parseInt(Str);

		return key1-1;	

	}

	

	int Innerhashkey(String Key) {

		int key1;

		String str =Key.substring(1,2);

		String Str1=Key.substring(2,3);

		int a=Integer.parseInt(Str1);

		if(str.equals("R")) {

			return a-1;

		}

		else if(str.equals("L")) {

			return a+5;

		}

		else {

			return a+10;

		}

	}

	

	void Put(String Key,Parking Node){

		int i=outerHashkey(Key);

		int j=Innerhashkey(Key);

		node.Parking_Lot[i][j]=Node;

	}



	Parking search(String Key){

		int i=outerHashkey(Key);

		int j=Innerhashkey(Key);

		return node.Parking_Lot[i][j];

	}

	

	Vehicle exit(String Key){

		int i=outerHashkey(Key);
		int j=Innerhashkey(Key);
		Vehicle newnode=new Vehicle();
		Vehicle x=node.Parking_Lot[i][j].User;
		node.Parking_Lot[i][j].User=newnode;
		node.Parking_Lot[i][j].fill=false;
		return x;

	}

	

	void entry(String Key,Vehicle newnode){

		int i=outerHashkey(Key);

		int j=Innerhashkey(Key);

		node.Parking_Lot[i][j].User=newnode;

		node.Parking_Lot[i][j].fill=true;

	}

	

	boolean notfill(Parking newnode) {

		if(newnode.fill==false) {

			return true;

		}

		else {

			return false;

		}

	}}

	

	
