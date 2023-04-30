package versionTrial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Main
{
    public static void main(String[] args)
    {
   	 Scanner input=new Scanner(System.in);
   	 Operations obj=new Operations();
   	 Allocation obj1=new Allocation();
   	 
   	 try
   	 {
   		 HashMap<String, Student> hash_student=obj.store_student_data_in_hashmap();
   		 HashMap<Integer, College> hash_college=obj.store_college_data_in_hashmap();
   		 obj.assign_merit(hash_student);
   		 obj1.insert_in_queue(hash_student);
   		 obj1.allocate_by_preference(hash_college, hash_student);
   		 

   		 String verified=obj.login(hash_student);

   		 if(verified!=null)
   		 {
   			 String id=verified;
   			 int choice=0;
   			 while(choice!=4)
   			 {
   				 System.out.println("\n*****MENU*****");
   				 System.out.println("1)Change Password");
   				 System.out.println("2)View & Confirm Allocation");
   				 System.out.println("3)Update Preferences");
   				 System.out.println("4)Exit");
   				 

   				 
   				 System.out.print("Enter Choice: ");
   				 choice=input.nextInt();

   				 switch(choice)
   				 {

   					 case 1://change password
   						 boolean correct_pass=false;
   						 while(correct_pass!=true)
   						 {
   							 System.out.print("\nEnter Old Password: ");
   							 String pass= input.next();
   							 try
   							 {
   								 if(hash_student.get(id).password.equals(pass))
   								 {
   									 correct_pass=true;
   									 boolean correct_newpass=false;
   									 while(correct_newpass!=true)
   									 {
   										 System.out.print("Enter new Password: ");
   										 String new_pass=input.next();
   										 System.out.print("Re-enter new Password: ");
   										 String confirm_pass=input.next();
   										 if(confirm_pass.equals(pass))
   										 {
   											 System.out.println("\nNew password cannot be the same as old password!");
   										 }
   										 else if(new_pass.equals(confirm_pass))
   										 {
   											 correct_newpass=true;
   											 hash_student.get(id).password=new_pass;
   											 System.out.println("\nPassword changed successfully!");
   										 }
    
   									 }
   								 }
   								 else
   								 {
   									 System.out.println("Enter Correct Password!");
   								 }
   								 
    
   							 }
   							 catch(Exception e)
   							 {
   								 System.out.println("Invalid UserID!");
   							 }    
   						 }
   						 break;
    
    
   					 case 2://view and confirm allocation
   						 int alloted=hash_student.get(id).Status;
   					 
   						 switch(alloted)
   						 {
   							 case 1:
   								 String pref[]=hash_student.get(id).preference1.split(" ");
   								 System.out.print("\nYou have been allotted ");
   								 System.out.print("College: "+hash_college.get(Integer.parseInt(pref[0])).Name+" ,");
   								 System.out.print("Branch: "+pref[1]);
   								 obj1.ffw(id, hash_student,1);
   								 break;
   								 
   							 case 2:
   								 pref= hash_student.get(id).preference2.split(" ");
   								 System.out.print("\nYou have been allotted ");
   								 System.out.print("College: "+hash_college.get(Integer.parseInt(pref[0])).Name+" ,");
   								 System.out.print("Branch: "+pref[1]);
   								 obj1.ffw(id, hash_student,2);
   								 break;
   								 
   							 case 3:
   								 pref= hash_student.get(id).preference3.split(" ");
   								 System.out.print("\nYou have been allotted ");
   								 System.out.print("College: "+hash_college.get(Integer.parseInt(pref[0])).Name+" ,");
   								 System.out.print("Branch: "+pref[1]);
   								 obj1.ffw(id, hash_student,3);
   								 break;
   								 
   							 default:
   								 System.out.println("No College Allotted, Wait for next Round");
   							 
   						 }
   						 break;
    
    
   					 case 3://Update Preferences
   						 System.out.println("\n College Code \t\t   College");
   						 for(int j=0;j<hash_college.size();j++)
   					 	{
   							 int key=(int)hash_college.keySet().toArray()[j];
   							 System.out.println("   "+key+"\t\t"+hash_college.get(key).Name);
   					 	}
   						 
   						 System.out.println("\nPreference 1:");
   						 System.out.print("Enter College Code: ");
   						 String code=input.next();
   						 System.out.print("Enter Branch: ");
   						 String branch=input.next();
   						 hash_student.get(id).preference1=(code+" "+branch);
   						 
   						 System.out.println("\nPreference 2:");
   						 System.out.print("Enter College Code: ");
   						 code=input.next();
   						 System.out.print("Enter Branch: ");
   						 branch=input.next();
   						 hash_student.get(id).preference2=(code+" "+branch);
   						 
   						 System.out.println("\nPreference 3:");
   						 System.out.print("Enter College Code: ");
   						 code=input.next();
   						 System.out.print("Enter Branch: ");
   						 branch=input.next();
   						 hash_student.get(id).preference3=(code+" "+branch);
   						 
   						 break;
   				 }

   			 }    
   		 }
   		 
   	 }
   	 catch (IOException e)
   	 {
   		 e.printStackTrace();
   	 }

    }
}

class Student
{
    String id;
    String password;
    String Name;
    String email;
    float math_percentile;
    float physics_percentile;
    float chemistry_percentile;
    float total_percentile;
    float HSC_PCM;
    String preference1;
    String preference2;
    String preference3;
    int Status;
    int merit_number;
    int floate,freeze,withdraw;
    float PCM_12TH;


    Student()
    {
   	 id=null;
   	 password=null;
   	 Name=null;
   	 email=null;
   	 math_percentile=0;
   	 physics_percentile=0;
   	 chemistry_percentile=0;
   	 total_percentile=0;
   	 HSC_PCM=0;
   	 preference1=null;
   	 preference2=null;
   	 preference3=null;
   	 Status=0;
   	 merit_number=0;
   	 floate=freeze=withdraw=0;
   	 PCM_12TH=0;

    }
}


class College
{
    int Total_Seats;
    int Code;
    String Name;
    int Comp_filled;
    int Comp_Available;
    int ENTC_filled;
    int ENTC_Available;
    int IT_filled;
    int IT_Available;
    int total_filled;
    int total_available;

    College()
    {
   	 Total_Seats=0;
   	 Code=0;
   	 Name=null;
   	 Comp_filled=0;
   	 Comp_Available=0;
   	 ENTC_filled=0;
   	 ENTC_Available=0;
   	 IT_filled=0;
   	 IT_Available=0;
   	 total_filled=0;
   	 total_available=0;
    }
}


class Operations
{


    HashMap<String, Student> store_student_data_in_hashmap()
    {

   	 HashMap<String, Student> Student_data= new HashMap<>();
   	 //Student_data.put(id,obj);
   	 try
   	 {
   		 File file = new File("enter file path");
   		 FileReader fr = new FileReader(file);
   		 BufferedReader br = new BufferedReader(fr);
   		 String line = "";
   		 String[] tempArr;
   		 int i=0;
   		 while((line = br.readLine()) != null)
   		 {
   			 if(i!=0)
   			 {
   				 Student obj=new Student();
   				 tempArr = line.split(",");
   				 obj.id=tempArr[0];
   				 obj.password=tempArr[1];
   				 obj.Name=tempArr[2];
   				 obj.email=tempArr[3];
   				 obj.math_percentile=Float.parseFloat(tempArr[4]);
   				 obj.physics_percentile=Float.parseFloat(tempArr[5]);
   				 obj.chemistry_percentile=Float.parseFloat(tempArr[6]);
   				 obj.total_percentile=Float.parseFloat(tempArr[7]);
   				 obj.preference1=tempArr[8];
   				 obj.preference2=tempArr[9];
   				 obj.preference3=tempArr[10];
   				 obj.Status=Integer.parseInt(tempArr[11]);
   				 obj.PCM_12TH=Float.parseFloat(tempArr[12]);
   				 obj.freeze=Integer.parseInt(tempArr[13]);
   				 obj.floate=Integer.parseInt(tempArr[14]);
   				 obj.withdraw=Integer.parseInt(tempArr[15]);
   				 Student_data.put(obj.id,obj);
   			 }

   			 i++;

   		 }
   		 br.close();
   	 }
   	 catch(IOException e1)
   	 {

   	 }

   	 return Student_data;
    }


    String login(HashMap<String, Student> Student_data ) throws IOException
    {
   	 Scanner sc= new Scanner(System.in);
   	 String a=null;
   	 int choice=0;
   	 System.out.println("MENU");
   	 System.out.println("1. Student Login");
   	 System.out.println("2. Exit");

   	 System.out.print("Enter your choice:");
   	 choice=sc.nextInt();
   	 switch(choice)
   	 {
   	 case 1:
   		 boolean correct=false;
   		 while(correct==false )
   		 {
   			 System.out.print("\nEnter UserID: ");
   			 String id=sc.next();
   			 String text1=Student_data.get( id).password;
   			 System.out.print("Enter Password: ");
   			 String pass= sc.next();

   			 if(text1.equals(pass))
   			 {
   				 correct=true;
   				 a=id;
   				 break;

   			 }
   			 else
   			 {
   				 System.out.println("Wrong Password!");
   				 System.out.println("Re-enter UserId and Password: ");
   				 //correct=false;
   			 }
   		 }
   		 break;

   	 case 2:
   		 choice=2;
   		 break;
   	 
   	 }
   	 return a;
    }    






    HashMap<Integer, College> store_college_data_in_hashmap()
    {

   	 HashMap<Integer, College> College_data = new HashMap<>();

   	 try
   	 {
   		 File file = new File("D:\\Pradnya\\Downloads\\Buffer College - Sheet1.csv");
   		 FileReader fr = new FileReader(file);
   		 BufferedReader br = new BufferedReader(fr);
   		 String line = "";
   		 String[] tempArr;
   		 int i=0;
   		 while((line = br.readLine()) != null)
   		 {
   			 if(i!=0)
   			 {
   				 College obj=new College();
   				 tempArr = line.split(",");
   				 obj.Code=Integer.parseInt(tempArr[0]);
   				 obj.Name=tempArr[1];
   				 obj.Comp_filled=Integer.parseInt(tempArr[2]);
   				 obj.Comp_Available=Integer.parseInt(tempArr[3]);
   				 obj.ENTC_filled=Integer.parseInt(tempArr[4]);
   				 obj.ENTC_Available=Integer.parseInt(tempArr[5]);
   				 obj.IT_filled=Integer.parseInt(tempArr[6]);
   				 obj.IT_Available=Integer.parseInt(tempArr[7]);
   				 obj.total_filled=Integer.parseInt(tempArr[8]);
   				 obj.total_available=Integer.parseInt(tempArr[9]);
   				 obj.Total_Seats=Integer.parseInt(tempArr[10]);
   				 College_data.put(obj.Code,obj);
   			 }

   			 i++;

   		 }
   		 br.close();
   	 }
   	 catch(IOException e1)
   	 {

   	 }
   	 return College_data;

    }


    void assign_merit(HashMap<String, Student> Student_data)
    {
   	 Student[] array=new Student[Student_data.size()];
   	 for(int j=0;j<Student_data.size();j++)
   	 {
   		 String key=(String)Student_data.keySet().toArray()[j];
   		 array[j]=Student_data.get(key);
   	 }

   	 for(int i=0;i<array.length-1;i++)
   	 {
   		 for(int k=0;k<array.length-1;k++)
   		 {
   			 if((array[k].total_percentile)>(array[k+1].total_percentile))
   			 {
   				 Student obj=array[k];
   				 array[k]=array[k+1];
   				 array[k+1]=obj;
   			 }
   			 else if((array[k].total_percentile)==(array[k+1].total_percentile))
   			 {
   				 if((array[k].math_percentile)>(array[k+1].math_percentile))
   				 {
   					 Student obj=array[k];
   					 array[k]=array[k+1];
   					 array[k+1]=obj;
   				 }
   				 else if((array[k].math_percentile)==(array[k+1].math_percentile))
   				 {
   					 if((array[k].physics_percentile)>(array[k+1].physics_percentile))
   					 {
   						 Student obj=array[k];
   						 array[k]=array[k+1];
   						 array[k+1]=obj;
   					 }
   					 else if((array[k].physics_percentile)==(array[k+1].physics_percentile))
   					 {
   						 if((array[k].chemistry_percentile)>(array[k+1].chemistry_percentile))
   						 {
   							 Student obj=array[k];
   							 array[k]=array[k+1];
   							 array[k+1]=obj;
   						 }
   						 else if((array[k].chemistry_percentile)==(array[k+1].chemistry_percentile))
   						 {
   							 if((array[k].HSC_PCM)>(array[k+1].HSC_PCM))
   							 {
   								 Student obj=array[k];
   								 array[k]=array[k+1];
   								 array[k+1]=obj;
   							 }
   							 else if((array[k].HSC_PCM)==(array[k+1].HSC_PCM))
   							 {
   								 //do nothing, asude tasach
   							 }
   						 }
   					 }
   				 }
   			 }
   		 }
   	 }


   	 for(int k=0;k<array.length;k++)
   	 {
   		 array[k].merit_number=(k+1);
   	 }

    }

}





class Allocation
{
    PriorityQueue<Student> queue = new PriorityQueue<Student>(1000, new MyComparator());


    void insert_in_queue(HashMap<String, Student> Student_data)
    {
   	 for(int i=0;i<Student_data.size();i++)
   	 {
   		 String key=(String)Student_data.keySet().toArray()[i];
   		 queue.add(Student_data.get(key));  
   	 }
    }



    void allocate_by_preference(HashMap<Integer, College> College_data,HashMap<String, Student> Student_data)
    {
   	 Operations obj=new Operations();

   	 while (!queue.isEmpty())
   	 {
   		 Student student=queue.poll(); //student is removed from queue after allocation, new queue will be created for new round
   		 String id=student.id;

   		 String pref1[]=student.preference1.split(" ");
   		 String pref2[]=student.preference2.split(" ");
   		 String pref3[]=student.preference3.split(" ");


   		 if (allocate(pref1[1],College_data,Integer.parseInt(pref1[0]))==1)
   		 {
   			 //first preference alloted therefore change status to 1
   			 Student_data.get(id).Status=1;
   		 }

   		 else if (allocate(pref2[1],College_data,Integer.parseInt(pref2[0]))==1)
   		 {
   			 //second preference alloted therefore change status to 2
   			 Student_data.get(id).Status=2;
   		 }

   		 else if (allocate(pref3[1],College_data,Integer.parseInt(pref3[0]))==1)
   		 {
   			 //third preference alloted therefore change status to 3
   			 Student_data.get(id).Status=3;
   		 }

   		 else
   		 {
   			 System.out.println("No College allotted!");
   			 //student still removed from queue, can be added for next round
   		 }

   	 }
    }



    int allocate(String branch,HashMap<Integer, College> College_data,int college_code)
    {
   	 boolean flag=false;
   	 switch(branch)
   	 {
   	 case "COMP":
   		 if(College_data.get(college_code).Comp_Available!=0)
   		 {
   			 College_data.get(college_code).Comp_Available--;
   			 College_data.get(college_code).Comp_filled++;
   			 flag=true;
   		 }
   		 break;

   	 case "ENTC":
   		 if(College_data.get(college_code).ENTC_Available!=0)
   		 {
   			 College_data.get(college_code).ENTC_Available--;
   			 College_data.get(college_code).ENTC_filled++;
   			 flag=true;
   		 }
   		 break;

   	 case "IT":
   		 if(College_data.get(college_code).IT_Available!=0)
   		 {
   			 College_data.get(college_code).IT_Available--;
   			 College_data.get(college_code).IT_filled++;
   			 flag=true;
   		 }
   		 break;

   	 }
   	 if(flag==true)
   	 {
   		 //implies preference was alloted
   		 return 1;
   	 }
   	 else
   	 {
   		 return 0;
   	 }
    }



    void ffw(String id,HashMap<String, Student> Student_data,int preference)
    {
   	 Scanner sc = new Scanner(System.in);
   	 System.out.println("\nDo you want to Freeze, Float or Withdraw?");
   	 System.out.println("1. Freeze");
   	 System.out.println("2. Float");
   	 System.out.println("3. Withdraw");
   	 System.out.print("Option: ");
   	 int ch = sc.nextInt();
   	 switch (ch) {
   	 case 1:
   		 if(Student_data.get(id).freeze==0)
   		 {
   			 switch(preference)
   			 {
   				 case 1:
   					 System.out.println("Your allocation for " + Student_data.get(id).preference1 + " is frozen");
   					 break;
   					 
   				 case 2:
   					 System.out.println("Your allocation for " + Student_data.get(id).preference2 + " is frozen");
   					 break;
   					 
   				 case 3:
   					 System.out.println("Your allocation for " + Student_data.get(id).preference3 + " is frozen");
   					 break;
   			 }
   			 Student_data.get(id).freeze = 1;
   			 
   		 }
   		 else
   		 {
   			 System.out.println("Seat already frozen!");
   		 }
   		 break;
   		 
   		 
   		 
   	 case 2:
   		 if(Student_data.get(id).floate ==0)
   		 {
   			 switch(preference)
   			 {
   				 case 1:
   					 System.out.println("Your allocation for " + Student_data.get(id).preference1 + " is floated");
   					 break;
   					 
   				 case 2:
   					 System.out.println("Your allocation for " + Student_data.get(id).preference2 + " is floated");
   					 break;
   					 
   				 case 3:
   					 System.out.println("Your allocation for " + Student_data.get(id).preference3 + " is floated");
   					 break;
   			 }
   			 Student_data.get(id).floate = 1;
   		 }
   		 else
   		 {
   			 System.out.println("Seat already floated!");
   		 }
   		 
   		 break;
   		 
   		 
   	 case 3:
   		 System.out.println("Your application is withdrawn, no seat will be allotted");
   		 Student_data.get(id).withdraw =1;
   		 break;
   		 
   	 default:
   		 System.out.println("Invalid choice");
   		 return;
   	 }
   	 
    }
}


class MyComparator implements Comparator<Student>
{
    public int compare(Student student1, Student student2)
    {
   	 //   We are returning the object in descending order of their merit
   	 if (student1.merit_number < student2.merit_number)
   		 return 1;
   	 else if (student1.merit_number > student2.merit_number)
   		 return -1;
   	 return 0;
    }
}



