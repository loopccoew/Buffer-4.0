package node;

public class Node3 {
	public int sr_no;
	public int patient_id;
	public String patient_name;
	public String slot;
	public int patient_age;
	public String patient_gender;
	public String patient_ph_no;
	public String symptoms;
	public String prescription;
	public Node3 next;
	public Node3 prev;
	public Node3(int no,int id,String n,String s,int age,String g,String ph_no,String pres,String sym){
		sr_no = no;
		patient_id = id;
		patient_name = n;
		slot = s;
		patient_age = age;
		patient_gender = g;
		patient_ph_no = ph_no;
		symptoms = sym;
		prescription = pres;
		next = null;
		prev = null;
	}
}
