package services;

import node.Node1;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Doctors {
	
	Scanner sc = new Scanner(System.in);
	
	String doc_name;
	String qualification;
	String department;
	int experience;
	
	Node1 head;
	Node1 tail;
	InputStreamReader r = new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);
	public Doctors(){
		head = null;
		tail = null;
	}
	public void insert() throws IOException {
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.print("\nENTER DOCTOR NAME : "+"Dr. ");
		doc_name = br.readLine();
		System.out.print("\nENTER QUALIFICATION : "); 
		qualification = br.readLine();
		System.out.print("\nENTER DEPARTMENT : "); 
		department = br.readLine();
		System.out.print("\nENTER EXPERIENCE : ");
		experience = sc.nextInt();
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		Node1 ptr;
		Node1 prev;
		Node1 cur;
		prev = null;
		cur = head;
		
		while(cur != null && (cur.name.compareTo(doc_name) < 0)) {
			prev = cur;
			cur = cur.next;
		}
		if(cur != null && (cur.name.equals(doc_name))) {
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("DUPLICATION NOT ALLOWED !!");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
		else {
			ptr = new Node1();
			ptr.name = doc_name;
			ptr.quali = qualification;
			ptr.depart = department;
			ptr.exp = experience;
			ptr.next = null;
			ptr.back = null;
			if(head == null) {
				head = ptr;
				tail = ptr;
				//System.out.println("Creted 1 st node......");
			}
			else if(prev == null) {
				ptr.next = head;
				cur.back =ptr;
				head = ptr;
				//System.out.println("\n inserted @ head");
			}
			else if(prev != null && cur == null) {
				/*
				 * insert @ end
				 */
				prev.next = ptr;
				ptr.back = prev;
				tail = ptr;
				//System.out.println("\ninserted @ end");
			}
			else {
				/*insert in between*/
				prev.next = ptr;
				ptr.back = prev;
				cur.back = ptr;
				ptr.next = cur;
				//System.out.println("\n inserted in between");
			}
		}
		
	}
	public void delete() throws IOException {
		Node1 cur;
		Node1 prev;
		String doc_name1;
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.print("\nENTER DOCTOR NAME TO DELETE : ");
		doc_name1 = br.readLine();
		if(head == null) {
			System.out.println("\nDOCTORS LIST IS EMPTY");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
		else {
			prev = null;
			cur = head;
			while(cur != null && cur.name.compareTo(doc_name1) < 0) {
				prev = cur;
				cur = cur.next;
			}
			if(cur != null && !(cur.name.equals(doc_name1))) {
				System.out.println("\nDOCTOR NAME DOES NOT EXIST...");
				System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			}
			else {
				
				if(prev == null && cur.next == null) {
					/*cur is only node to delete*/
					head = null;
					tail = null;
					cur = null;
					//System.out.println("\nDeleted only node...");
					System.out.println("\nDELETED SUCCESSFULLY !!!!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}
				else if(prev == null) {
					/*delete from head*/
					cur.next.back = null;
					head = cur.next;
					cur.next = null;
					cur = null;
					//System.out.println("\ndeleted from head");
					System.out.println("\nDELETED SUCCESSFULLY !!!!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}
				else if(prev != null && cur.next == null) {
					cur.back = null;
					prev.next = null;
					tail = prev;
					//System.out.println("\ndeleted from end");
					System.out.println("\nDELETED SUCCESSFULLY !!!!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}
				else {
					/*delete from in between*/
					prev.next = cur.next;
					cur.next.back = prev;
					cur.next = null;
					cur.back = null;
					cur = null;
					//System.out.println("\ndeleted from between");
					System.out.println("\nDELETED SUCCESSFULLY !!!!");
					System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
				}
			}
		}
	}
	public void display() {
		Node1 cur;
		if(head == null) {
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("\nDOCTORS LIST IS EMPTY...");
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
		else {
			cur = head;
			System.out.println();
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			
			System.out.println("   NAME \t\t\t\t  QUALIFICATION \t\t\t   DEPARTMENT\t\t       EXPERIENCE(yrs)\n");
			while(cur != null) {
				System.out.println("Dr."+cur.name+"\t\t\t\t"+cur.quali+"\t\t\t\t"+cur.depart+"\t\t\t  "+cur.exp);
				cur = cur.next;
			}
			System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		}
	}
	void show_reverse() {
		Node1 cur;
		if(head == null) {
			System.out.println("\nDOCTORS LIST IS EMPTY ...");
		}
		else {
			cur = head;
			/*now traverse till last node*/
			while(cur.next != null) {
				cur = cur.next;
			}
			System.out.println();
			System.out.println("_______________________________________________________________________________________________\n");
			System.out.println("NAME \t QUALIFICATION \t DEPARTMENT \t EXPERIENCE");
			while(cur != null) {
				System.out.println(cur.name+"\t"+cur.quali+"\t"+cur.depart+"\t"+cur.exp);
				cur = cur.back;
			}
			System.out.println("_______________________________________________________________________________________________\n");	
		}
	}
}


