package node;

public class Node2 {
	public Node2 left1;
	public Node2 right1;
	public int patient_id;
	public String patient_name;
	public int patient_age;
	public String patient_gender;
	public String patient_address;
	public String patient_ph_no;
	public Node2(int id,String name,int age,String gender,String addr,String ph_no){
		patient_id = id;
		patient_name = name;
		patient_age = age;
		patient_gender = gender;
		patient_address = addr;
		patient_ph_no = ph_no;
		left1 = null;
		right1 = null;
	}
}
