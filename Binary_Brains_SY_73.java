PACKAGE_1

CLASS :


Menu :

package Pack;

public class Menu {

	void Menu() {
		System.out.println("\n\t\t----: Menu :----");
		System.out.println("\n\t  #Item_Id\t\t\t\t#Item_Name\t\t\t\t\t#Price/Unit");
		System.out.println("\n\t\tC1\t\t\t\t     Rice\t\t\t\t\t\t55/-");
		System.out.println("\n\t\tC2\t\t\t\t     Wheat\t\t\t\t\t\t45/-");
		System.out.println("\n\t\tC3\t\t\t\t     Ragi\t\t\t\t\t\t40/-");
		System.out.println("\n\t\tC4\t\t\t\t     Barley\t\t\t\t\t\t35/-");
		System.out.println("\n\t\tC5\t\t\t\t     Maize\t\t\t\t\t\t42/-");


		System.out.println("\n\t\tC6\t\t\t\t     Hair Oil\t\t\t\t\t\t35/-");
		System.out.println("\n\t\tC7\t\t\t\t     Talcum Powder\t\t\t\t\t60/-");
		System.out.println("\n\t\tC8\t\t\t\t     Moisturizer\t\t\t\t\t110/-");
		System.out.println("\n\t\tC9\t\t\t\t     Face Wash\t\t\t\t\t\t70/-");
		System.out.println("\n\t\tC10\t\t\t\t     Perfume\t\t\t\t\t\t100/-");

		System.out.println("\n\t\tC11\t\t\t\t     Bread\t\t\t\t\t\t30/-");
		System.out.println("\n\t\tC12\t\t\t\t     Biscuites\t\t\t\t\t\t20/-");
		System.out.println("\n\t\tC13\t\t\t\t     Cake\t\t\t\t\t\t40/-");
		System.out.println("\n\t\tC14\t\t\t\t     Chocolates\t\t\t\t\t\t10/-");
		System.out.println("\n\t\tC15\t\t\t\t     Ice-Cream\t\t\t\t\t\t30/-");

		System.out.println("\n\t\tC16\t\t\t\t     Soaps\t\t\t\t\t\t55/-");
		System.out.println("\n\t\tC17\t\t\t\t     Detergents\t\t\t\t\t\t70/-");
		System.out.println("\n\t\tC18\t\t\t\t     Shampoo\t\t\t\t\t\t55/-");
		System.out.println("\n\t\tC19\t\t\t\t     Floor Cleaner\t\t\t\t\t80/-");
		System.out.println("\n\t\tC20\t\t\t\t     Toilet Cleaner\t\t\t\t\t77/-");

		System.out.println("\n\t\tC21\t\t\t\t     Milk\t\t\t\t\t\t53/-");
		System.out.println("\n\t\tC22\t\t\t\t     Paneer\t\t\t\t\t\t200/-");
		System.out.println("\n\t\tC23\t\t\t\t     Cheese\t\t\t\t\t\t350/-");
		System.out.println("\n\t\tC24\t\t\t\t     Butter/Ghee\t\t\t\t\t450/-");
		System.out.println("\n\t\tC25\t\t\t\t     Yoghurt/Buttermilk\t\t\t\t\t110/-");

	}
}






Cart:

package Pack;

import java.util.*;

class Cart{
	String item;
	float rate;
	String Id;
	String sections;
	String address;
	Cart next;

	Cart( ){
		this.item=item;
		this.rate=rate;
		this.Id=Id;
		this.sections=sections;
		this.address=address;
		next=null;
	}
}



Grocery_Management :

package Pack;

import java.util.*;

public class Grocery_Management  {

	Scanner sc=new Scanner(System.in);

	Menu m = new Menu();
	List <String> bag = new ArrayList <>();
	Cart obj[]=new Cart[50];

	Cart front,rear,prev;
	String addr;
	String products;
	String section; 
	float price;
	String ID;
	Cart ptr;

	public Grocery_Management(){
		front=null;
		rear=null;
	}

	public void create_order() {
		Cart temp ;
		int i;
		System.out.println("\n\t*****Welcome To At Your Door Mart*****");

		for(i=0;i<50;i++){
			obj[i]=new Cart();
		}

		m.Menu();

		System.out.println("\n\nEnter Customer Number(ID):");
		ID=sc.next();

		System.out.println("\nSelect Your Products:");

		System.out.println("\nEnter total items:");
		int no=sc.nextInt();

		System.out.println("\nAdd products into cart-->:");
		for(i=0;i<no;i++) {
			System.out.println("Item :"+(i+1));
			products=sc.next();
			order_check();
		}

		System.out.println("\nEnter customer address:");
		addr=sc.next();

		ptr=new Cart();
		ptr.item=products;
		ptr.Id=ID;
		ptr.address=addr;
		ptr.rate=price;
		ptr.next=null;

		temp=null;
		prev=null;

		if(front==null && rear==null) {
			front=ptr;
			rear=ptr;
			System.out.println("\n\tfirst order is placed");
			System.out.println("\n\tThank you....\n\tOrder will deliver soon. :)");
		}
		else {
			while(rear.next!=null) {
				rear=rear.next;
			}
			rear.next=ptr;
			System.out.println("\n\tOrder placed in queue");
			System.out.println("\n\tThank you....\n\tOrder will deliver soon. :)");
		}
	}

	void order_check() {
		System.out.println("\n Product ID \tProduct Name \tRate per unit Quantity");
		System.out.println("");

		if(products.equals("Rice")||products.equals("C1")){
			System.out.println("\tC1"+"\t     Rice"+"\t\t\t55/-");
			System.out.println("");
		}
		else if(products.equals("Wheat")||products.equals("C2")){
			System.out.println("\tC2"+"\t     Wheat"+"\t\t\t45/-");
			System.out.println("");
		}
		else if(products.equals("Ragi") ||products.equals("C3")){
			System.out.println("\tC3"+"\t     Ragi"+"\t\t\t40/-");
			System.out.println("");
		}
		else if(products.equals("Barley")||products.equals("C4")) {
			System.out.println("\tC4"+"\t     Barley"+"\t\t\t35/-");
			System.out.println("");
		}
		else if (products.equals("Maize")||products.equals("C5") ){
			System.out.println("\tC5"+"\t     Maize"+"\t\t\t42/-");
			System.out.println("");
		}

		else if(products.equals("Hair oil")||products.equals("C6")){
			System.out.println("\tC6"+"\t     Hair Oil"+"\t\t\t35/-");
			System.out.println("");
		}
		else if (products.equals("Talcum Powder")||products.equals("C7")){
			System.out.println("\tC7"+"\t     Talcum Powder"+"\t\t\t60/-");
			System.out.println("");
		}
		else if(products.equals("Moisturizer")||products.equals("C8")){
			System.out.println("\tC8"+"\t     Moisturizer"+"\t\t\t110/-");
			System.out.println("");
		}
		else if(products.equals("Face wash")||products.equals("C9")){
			System.out.println("\tC9"+"\t     Face Wash"+"\t\t\t70/-");
			System.out.println("");
		}
		else if(products.equals("Perfume")||products.equals("C10")) {
			System.out.println("\tC10"+"\t     Perfume"+"\t\t\t100/-");
			System.out.println("");
		}
		else if (products.equals("Bread")||products.equals("C11")){
			System.out.println("\tC11"+"\t     Bread"+"\t\t\t30/-");
			System.out.println("");
		}

		else if(products.equals("Biscuits")||products.equals("C12")){
			System.out.println("\tC12"+"\t     Biscuits"+"\t\t\t20/-");
			System.out.println("");
		}
		else if(products.equals("Cake")||products.equals("C13")){
			System.out.println("\tC13"+"\t     Cake"+"\t\t\t40/-");
			System.out.println("");
		}
		else if(products.equals("Choclates")||products.equals("C14") ){
			System.out.println("\tC14"+"\t     Choclates"+"\t\t\t10/-");
			System.out.println("");
		}
		else if(products.equals("Ice-Cream")||products.equals("C15")) {
			System.out.println("\tC15"+"\t    Ice-cream"+"\t\t\t30/-");
			System.out.println("");
		}
		else if (products.equals("Soaps")||products.equals("C16")){
			System.out.println("\tC16"+"\t     Soaps"+"\t\t\t55/-");
			System.out.println("");
		}
		else if (products.equals("Detergents")||products.equals("C17")){
			System.out.println("\tC17"+"\t     Detergents"+"\t\t\t70/-");
			System.out.println("");
		}
		else if (products.equals("Shampoo")||products.equals("C18")){
			System.out.println("\tC18"+"\t     Shampoo"+"\t\t\t55/-");
			System.out.println("");
		}
		else if (products.equals("Floor Cleaner")||products.equals("C19")){
			System.out.println("\tC19"+"\tFloor Cleaner"+"\t\t\t80/-");
			System.out.println("");
		}
		else if (products.equals("Toilet Cleaner")||products.equals("C20")){
			System.out.println("\tC20"+"\tToilet Cleaner"+"\t\t\t77/-");
			System.out.println("");
		}
		else if (products.equals("Milk")||products.equals("C21")){
			System.out.println("\tC21"+"\t     Milk"+"\t\t\t53/-");
			System.out.println("");
		}
		else if (products.equals("Paneer")||products.equals("C22")){
			System.out.println("\tC22"+"\t     Paneer"+"\t\t\t200/-");
			System.out.println("");
		}
		else if (products.equals("Cheese")||products.equals("C23")){
			System.out.println("\tC23"+"\t     Cheese"+"\t\t\t350/-");
			System.out.println("");
		}
		else if (products.equals("Butter")||products.equals("C24")){
			System.out.println("\tC24"+"\t     Butter"+"\t\t\t450/-");
			System.out.println("");
		}
		else if (products.equals("Yoghurt")||products.equals("C25")){
			System.out.println("\tC25"+"\t     Yoghurt"+"\t\t\t110/-");
			System.out.println("");
		}
		else {
			System.out.println("\n\nSorry For Inconvenience....\nProduct is not available now....");
			System.out.println("---------------------------------------------------------------------");
		}
	}


	public void deliver_order() {
		Cart temp,prev;
		prev=null;
		temp=front;

		if(temp==null) {
			System.out.println("\n\tNo order to deliver..");
		}
		else {
			while(temp.next!=null) {
				prev=temp;
				temp=temp.next;
			}
			if(prev==null) {
				front=null;
			}
			else {
				front=front.next;
				temp.next=null;
				temp=null;
				System.out.println("\n\tOrder delivered....");
			}
		}
	}


	public void display() {
		Cart temp;
		temp=front;
		if(front ==null && rear==null) {
			System.out.println("\n\tNo order yet..");
		}

		else {
			temp=front;
			while(temp!=null) {
				System.out.println("\n\tOrder ID:"+temp.Id);
				System.out.println("\n\tAddress of delivery: "+temp.address);
				System.out.println("--------------------------------------------------------------------------------------------------");
				temp=temp.next;
			}
		}
	}
}




PACKAGE_2:

CLASS:

AT_your_door_mart:

package Pack2;

import Pack.*;

import java.util.Scanner;

public class At_your_door_mart {

	public static void main(String args[]) {
		
		Scanner sc1=new Scanner (System.in);
		int ch,no;
		Grocery_Management obj1 = new Grocery_Management();
		

		do {
			System.out.println("\n\t\t*****  At Your Door Mart  ***** \t");
			System.out.println("\n\n\t1.Place order \n\t2.Deliver order \n\t3.Display remaining orders \n\t4.Exit ");
			System.out.println("\nEnter choice:");
			ch=sc1.nextInt();


			switch (ch) {
			case 1:
				obj1.create_order();
				break;

			case 2:
				obj1.deliver_order();
				System.out.println("\nNext order to deliver is :==>");
				obj1.display();
				break;

			case 3:
				obj1.display( );
				break;

			case 4:
				System.out.println("\nThank You For Visiting Us");
				System.exit(0);

			default:
				System.out.println("\nInvalid choice...");
			}

			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.println("\nDo you want to continue? press 1 otherwise 0 ");
			no=sc1.nextInt();
		}while(no!=0);
		System.out.println("\n\tYou exited successfully :) \n\t\n\t\t^_^  THANK YOU  ^_^");
	}
}
