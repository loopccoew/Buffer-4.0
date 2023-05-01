import java.util.*;
class Node{
String name;
Node next;
Node previous;
String date;


Node(String name,String date){   //constructor
next=null;
previous=null;
this.name=name;
this.date=date;
}
}


class op{
Scanner in=new Scanner(System.in);
Stack<String> stac = new Stack<>();

void details() {
int op=0;

do {
System.out.println("Enter the patient's name:");
String name=in.next();
System.out.println("Enter the patient's age:");
int age=in.nextInt();
System.out.println("Enter the patient's number:");
String contact=in.next();
System.out.println("Enter the admitted department:");
String d=in.next();
System.out.println("Last admitted date");
String admit=in.next();

stac.push("\nName"+name+"\nAge:"+age+"\nContact"+contact+"\nDept:"+d+"\nLast admitted:"+admit);

System.out.println("Press 1 if you have completed all the details");
op=in.nextInt();


} while(op==0);


}
void hist() {
Stack<String> st=new Stack<>();

if(stac.isEmpty()) {
System.out.println("No patient history yet.");
}
else {
while(!stac.isEmpty())
{
String det= stac.pop();

System.out.println(det+ " ");
st.push(det);
}
while(!st.isEmpty())
{
String det2 = st.pop();
stac.push(det2);
}
}
}
Node arr[]=new Node[5];
String str[]=new String[5];

op(){
for(int i=0;i<5;i++) {
arr[i]=null;
}
str[0]="Orthodentistry";
str[1]="Opthalmology";
str[2]="Cardiology";
str[3]="Gynaecology";
str[4]="Homeopathy";
}
void enq() {



System.out.println("\n1)Orthodentistry\n2)Opthalmology\n3)Cardiology\n4)Gynaecology\n5)Homeopathy\n");
System.out.println("Enter your choice:");
int ch=in.nextInt();

if(ch==1)
{
System.out.println("Enter the number of medicines you wish to add-");
int num=in.nextInt();
Node temp=null;
for(int i=0;i<num;i++)
{
System.out.println("Medicine name here:");  //user input
String name=in.next();
System.out.println("Medicine date:");
String date=in.next();
Node nn=new Node(name,date);
if(arr[0]==null)
{
arr[0]=nn;
temp=arr[0];
}
else
{
temp.next=nn;
temp=temp.next;
}
}
}
else if(ch==2)
{
System.out.println("How number of medicine you want to add");
int num=in.nextInt();
Node temp=null;
for(int i=0;i<num;i++)
{
System.out.println("Medicine name here:");  //user input
String name=in.next();
System.out.println("Medicine date:");
String date=in.next();
Node nn=new Node(name,date);
if(arr[1]==null)
{
arr[1]=nn;
temp=arr[1];
}
else
{
temp.next=nn;
temp=temp.next;
}
}
}
else if(ch==3)
{
System.out.println("Enter the number of medicines you wish to add-");
int num=in.nextInt();
Node temp=null;
for(int i=0;i<num;i++)
{
System.out.println("Medicine name here:");  //user input
String name=in.next();
System.out.println("Medicine date:");
String date=in.next();
Node nn=new Node(name,date);
if(arr[2]==null)
{
arr[2]=nn;
temp=arr[2];
}
else
{
temp.next=nn;
temp=temp.next;
}
}
}
else if(ch==4)
{
System.out.println("Enter the number of medicines you wish to add-");
int num=in.nextInt();
Node temp=null;
for(int i=0;i<num;i++)
{
System.out.println("Medicine name here:");  //user input
String name=in.next();
System.out.println("Medicine date:");
String date=in.next();
Node nn=new Node(name,date);
if(arr[3]==null)
{
arr[3]=nn;
temp=arr[3];
}
else
{
temp.next=nn;
temp=temp.next;
}
}
}
else if(ch==5)
{
System.out.println("Enter the number of medicines you wish to add-");
int num=in.nextInt();
Node temp=null;
for(int i=0;i<num;i++)
{
System.out.println("Medicine name here:");  //user input
String name=in.next();
System.out.println("Medicine date:");
String date=in.next();
Node nn=new Node(name,date);
if(arr[4]==null)
{
arr[4]=nn;
temp=arr[4];
}
else
{
temp.next=nn;
temp=temp.next;
}
}
}

}
void Display()
{
for(int i=0;i<arr.length;i++)
{

System.out.println(str[i]);
Node currentNode=arr[i];
if(currentNode==null)
{
System.out.println("Node is not present:");
return;
}
while(currentNode!=null) {
System.out.println("Medicine Name:"+currentNode.name+" "+"Medicine date:"+currentNode.date);
currentNode=currentNode.next;
}
}

}
}


public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
op obj=new op();
int x=1,ch=0;

do{
System.out.println("\n**********MENU FOR HOSPTIAL MANAGEMENT**********\n1.Medicine records\n"
+ "2.Machine conditions check\n3.Patient details allocation\n4.Patient History records");
System.out.println("Enter your choice");//user input
ch=sc.nextInt();
switch(ch)
{
case 1:

obj.enq();
obj.enq();
obj.enq();
obj.enq();
obj.enq();
obj.Display();

break;

case 2:
break;

case 3:
obj.details();
break;
case 4:
obj.hist();
break;

default:
System.out.println("\nEnter a valid value");//user input
}
System.out.println("\nDo you want to continue ?\nPress 1 to continue\nPress 0 to exit\n");//user input
x=sc.nextInt();
}while(x!=0);
if(x==0)
{
System.out.println("Thank-you for transacting with us,closing the application now.");
//end of program
}
}

}
