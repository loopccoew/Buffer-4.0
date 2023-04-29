/* This is the Clinic module where the user books a clinic appointment for his/her pet mentioning time and date . Let's have a closer look into the code !*/

//Importing necessary packages
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Clinic{
    private String clinic;
    private String petName;
    private LocalDateTime dateTime;
    private String petType;

    public Clinic( String clinic, String petName, LocalDateTime dateTime,String petType) {
        this.clinic = clinic;
        this.petName = petName;
        this.dateTime = dateTime;
        this.petType = petType;
    }
    public String getclinic(){
        return clinic;
        
    }
    public String getPetName() {
        return petName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public String getpetType() {
        return petType;
    }
    

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = dateTime.format(formatter);
        return "Clinic Name:"+ clinic + " petName:"+ petName + " at " + formattedDateTime;
    }
}


//This would be our functioning class where we will manage the user's clinic appointments
public class VetClinic{
	 
private static LinkedList<Clinic> appointments = new LinkedList<Clinic>();
VetClinic(){
        // Create a LinkedList to store the shops
LinkedList<String> clinics = new LinkedList<>();
     
        // Add some shops to the list
        clinics.add("PET_CARE - karvenagar");
        clinics.add("WE_CARE - karvenagar");
       clinics.add("HAPPY_PETS - kothrud");
        clinics.add("PAWS & CLAWS - warje");
        clinics.add("THE PET HOUSE - kothrud");
        clinics.add("THE BARKING LOT - karvenagar");
        clinics.add("THE PET - karvenagar");
       clinics.add("CARE-A-LOT - warje");
        clinics.add("RAINBOW - kothrud");
        clinics.add("HAPPY TAILS - warje");
        
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
       
        // Display the menu
        System.out.println("------MENU-----");
        System.out.println("1. Display all clinics");
        System.out.println("2. Display clinics in a specific area");
        System.out.println("3. Appointment");
       
        // Loop until the user chooses to exit
        boolean exit = false;
        while (!exit) {
           
            // Ask the user to choose an option
            System.out.print("Enter your choice (1-3): ");
            int choice = input.nextInt();
           
            // Perform the chosen action
            switch (choice) {
                case 1:
                    // Display all clinics
                    System.out.println("All clinics:");
                    for (String clinic : clinics) {
                        System.out.println(clinic);
                    }
                    break;
                   
                case 2:
                    // Display clinics in a specific area
                    System.out.print("Enter the area: ");
                    String area = input.next();
                    System.out.println("clinic in " + area + ":");
                    for (String clinic : clinics) {
                        if (clinic.endsWith(area)) {
                            System.out.println(clinic);
                        }
                    }
                    break;
                   
                case 3:
                    // Exit the program
                    exit = true;
                    System.out.println("Clinic Appointment Booking System");
                    break;
                   
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    break;
            }
       
          // Print a blank line to separate the output from different menu choices
            System.out.println();
       
           
        }
        Scanner sc = new Scanner(System.in);
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
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        } while (choice != 4);
    }
 
    private static void bookAppointment() {
        Scanner sc = new Scanner(System.in);
        int ch2;
        System.out.print("Enter Clinic name: ");
        String clinic = sc.nextLine();
        System.out.print("Enter pet name: ");
        String petName = sc.nextLine();
        System.out.print("Enter pet Type: ");
        String petType = sc.nextLine();
        
        System.out.print("Enter appointment date and time (dd-MM-yyyy HH:mm): ");
        String dateTimeString = sc.nextLine();
       
        System.out.println();
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        Clinic newAppointment = new Clinic(clinic, petName, dateTime,petType);
        boolean conflict = false;
        for (Clinic a : appointments) {
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
        for (Clinic a : appointments) {
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
            for (Clinic a : appointments) {
                System.out.println(a);
            }
        }
         
    }
}
