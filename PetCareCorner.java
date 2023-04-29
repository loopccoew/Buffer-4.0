// Theme : Digital Society
//The Pet Care Corner :
//Provides a platform for pet owners to access various pet services.
//The application includes options for Vet Clinics, Pet Shops, Day Care, and Salons. Users can log in and choose the type of service they require for their pet.



import java.util.Scanner;
public class PetCareCorner {
	public static void main(String[] args) {
		   System.out.println("------------------------WElCOME TO PET CARE CORNER!!!--------------------");
		   System.out.println("=>>>>>>>Login Details");
		   Login lo = new Login();
		   System.out.println("*****************MENU*****************");
		   Scanner sc = new Scanner(System.in);
		   int ch=0 ;
		   do {  
			  
			   System.out.println("1.Clinics");
			   System.out.println("2.DayCare");
			   System.out.println("3.Salons");
			   System.out.println("4.PetShop");  
			   System.out.println("5.Exit");
			   System.out.print("Enter your choice: ");
	            ch = sc.nextInt();
			   
			   switch(ch) {
			   case 1 : 
				    VetClinic vc = new VetClinic();
				    break;
			   case 2 :
				   Daycare dc = new Daycare();
				   break;
			   case 3:
				   salon so = new salon();
				   break;
			   case 4 :
				   Petshop ps = new Petshop();
				   break;
			   case 5 :
				   System.out.println("Thank you for Visiting ,Goodbye!");
	                break;
	            default:
	                System.out.println("Invalid option. Please try again.");
	                break;
			   
			   }
		   }
		   while(ch!=5);
		   System.out.println();
		
		
		
	}
}
//the Pet Care Corner is a simple, yet effective application for pet owners to access various services for their furry friends. 
//It provides a user-friendly interface and can be easily expanded to include more services and functionalities.
