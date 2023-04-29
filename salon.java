/* This is the salon where the user books a salon for his/her pet mentioning time and date . Let's have a closer look into the code !*/


//Importing necessary packages
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//First we create a class appointment which would include info about the pet
class Appointment {
    private String petName;
    private String breed;
    private LocalDateTime dateTime;

    //Constructor of appointment
    public Appointment(String petName,String breed, LocalDateTime dateTime) {
        this.petName = petName;
        this.breed=breed;
        this.dateTime = dateTime;
    }

    public String getPetName() {
        return petName;
    }
   
    public String getbreed() {
        return breed;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    //Overriding the toString method to display appointment details.
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = dateTime.format(formatter);
        return petName + " at " + formattedDateTime;
    }
}

//This would be our functioning class where we will manage the user's Salon appointments
public class salon {
private static LinkedList<Appointment> appointments = new LinkedList<Appointment>();
salon(){
     
        // Create a LinkedList to store the salons
LinkedList<String> salonList = new LinkedList<>();
     
        // Add some salons to the list
        salonList.add("The Missing Paws Pet Salon - karvenagar");
        salonList.add("Pet Salon Service - karvenagar");
        salonList.add("Pet Parlor and Spa - kothrud");
        salonList.add("Pawfect Pet Salon - warje");
        salonList.add("Pet Spa and Grommers - Warje");
        salonList.add("Pet Makeup Center - katraj");
        salonList.add("The Pet Wash Salon - katraj");
        salonList.add("Natural Pet Center - Koregaon Park");
        salonList.add("Pet Wash & More - Shivaji Nagar");
        salonList.add("Pet Groom And Shroom - kothrud");
       
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
       
        // Display the menu
        System.out.println("Salon List Menu:");
        System.out.println("1. Display all salons");
        System.out.println("2. Display salons in a specific area");
        System.out.println("3. Salon Appointment");
       
        // Loop until the user chooses to exit
        boolean exit = false;
        while (!exit) {
           
            // Ask the user to choose an option
            System.out.print("Enter your choice (1-3): ");
            int choice = sc.nextInt();
           
            // Perform the chosen action
            switch (choice) {
                case 1:
                    // Display all salons
                    System.out.println("All salons:");
                    for (String salon : salonList) {
                        System.out.println(salon);
                    }
                    break;
                   
                case 2:
                    // Display salons in a specific area
                    System.out.print("Enter the area: ");
                    String area = sc.next();
                    System.out.println("Salons in " + area + ":");
                    for (String salon : salonList) {
                        if (salon.endsWith(area)) {
                            System.out.println(salon);
                        }
                    }
                    break;
                   
                case 3:
                    // Exit the program
                    exit = true;
                    System.out.println("Salon Appointment Booking System");
                    break;
                   
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    break;
            }
       
          // Print a blank line to separate the output from different menu choices
            System.out.println();
       
        
        }

       
     // This is another switch menu where the user can book,cancel and view a appointment.
        int choice;
       
        do {
           
            System.out.println("1. Book an appointment");
            System.out.println("2. Cancel an appointment");
            System.out.println("3. List all appointments");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bookAppointment();
                    break;
                case 2:
                    cancelAppointment();
                    break;
                case 3:
                    listAllAppointments();
                    break;
                case 4:
                    System.out.println("Exiting the program......");
                    System.out.println("Thank You for visiting our Salon!!!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        } while (choice != 4);

    }

//In the last stage of this module, we define all the functions mentioned in our list.
    private static void bookAppointment() {
        Scanner sc = new Scanner(System.in);
        int ch2,i;
        String x=null;
        String salon_name,str;
        System.out.println("Out of above salons in which salon you want to book your pets appointment?: ");
    salon_name=sc.nextLine();
        System.out.print("Enter pet name: ");
        String petName = sc.nextLine();
        System.out.print("Enter breed of pet: ");
        String breed = sc.nextLine();
        System.out.print("Enter appointment date and time (dd-MM-yyyy HH:mm): ");
        String dateTimeString = sc.nextLine();
       System.out.println("MENU:1.Bathing-Rs.575.00\n2.Ear cleaning and Nail Trimming-Rs.300.00\n3.Paw and Body Massage-Rs.750.00\n4.Teeth cleaning and Mouth spray-Rs.600.00\n5.Hair cutting-Rs.700.00");
         
     
       System.out.println("What do you want to do for your pet?:");//Enter in one line only
       str=sc.nextLine();  
        System.out.println("Custmer want to do following things for pet:"+str);
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        Appointment newAppointment = new Appointment(petName,breed, dateTime);
        boolean conflict = false;
        for (Appointment a : appointments) {
            if (a.getDateTime().equals(dateTime)) {
                System.out.println("Appointment slot already booked!Please book another slot");
                conflict = true;
                break;
            }
        }
        if (!conflict) {
            appointments.add(newAppointment);
            System.out.println("Appointment booked successfully!");
        }
    }

    private static void cancelAppointment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter appointment date and time to cancel (dd-MM-yyyy HH:mm): ");
        String dateTimeString = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        boolean removed = false;
        for (Appointment a : appointments) {
            if (a.getDateTime().equals(dateTime)) {
                appointments.remove(a);
                System.out.println("Appointment cancelled successfully!");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Appointment not found!");
        }
    }

    private static void listAllAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found!");
        } else {
            System.out.println("List of all appointments:");
            for (Appointment a : appointments) {
                System.out.println(a);
            }
        }
         
    }
}
