/* This is the Daycare module where the user books a boarding for his/her pet mentioning time and duration(days) . Let's have a closer look into the code !*/

//Importing necessary packages
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.DateFormat;


//First we create a class boarding which would include info about the pet and boarding.
class Boarding {
    private String petName;
    private LocalDate date;
    private int dur;
    private String pettype;
   
    //Constructor of boarding
    public Boarding(String petName, LocalDate date , int dur,String pettype) {
        this.petName = petName;
        this.date = date;
        this.dur = dur;
        this.pettype = pettype;
    }

    public String getPetName() {
        return petName;
    }

    public LocalDate getDate() {
        return date;
    }

    public int dur(){
        return dur;
    }
   
    public String getpettype() {
    return pettype;
    }
   
    //Overriding the toString method to display appointment details.
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);
        return petName + " at " + formattedDate + " for " + dur + " days " ;
    }
}

//This would be our functioning class where we will manage the user's appointments
public class Daycare {
   
    //Creating a linked list of type boarding as all the boardings of a user would be linked.
    private static LinkedList <Boarding> boardings = new LinkedList<Boarding>();

    //The entire daycare would be in the form of a constructor as done below.
     Daycare() {
   
    Scanner sc = new Scanner(System.in);
    LinkedList<String> daycareList = new LinkedList<>();
   
    // Adding daycares from different areas
    daycareList.add("Pets! - karvenagar");
    daycareList.add("Happy Pups - kothrud");
    daycareList.add("Tails of the city - Hadapsar");
    daycareList.add("Crazy Paws - pimpri");
    daycareList.add("Pawsome - bavdhan");
    daycareList.add("Pet Sniffer - Nanded city");
    daycareList.add("Barking barn - katraj");
   

    System.out.println("Daycare List:");
    System.out.println("1. All Daycares");
    System.out.println("2. Display from a specific area");
    System.out.println("3. Exit");
   
    boolean exit = false;
    while (!exit) {
       
        int choice = sc.nextInt();
        String daycare;
       
    //Creating a switch menu for finding daycares
        switch (choice) {
            case 1:
               
                System.out.println("All daycares:");
                for (String dc : daycareList) {
                    System.out.println(dc);
                }
                daycare = dayc();
                System.out.println("Your daycare :"+daycare);
                exit=true;
                break;
               
            case 2:
               
                System.out.print("Enter the area: ");
                String area = sc.next();
                System.out.println("daycares in " + area + ":");
                for (String dc : daycareList) {
                    if (dc.endsWith(area)) {
                        System.out.println(dc);
                    }
                }
                daycare = dayc();
                System.out.println("Your daycare :"+daycare);
                exit=true;
                break;
               
            case 3:
                exit = true;
                System.out.println("Exiting....");
                break;
               
            default:
             
                System.out.println("Invalid choice ! Please try again");
                break;
        }
       
        System.out.println();
    }
       
     int choice=0;
       
       // This is another switch menu where the user can book,cancel and view a specific boarding.
        do {
            System.out.println("Dog Daycare");
            System.out.println("1. Book a new Boarding");
            System.out.println("2. Cancel Boarding");
            System.out.println("3. List all boardings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    newBoarding();
                    break;
                case 2:
                    cancelBoarding();
                    break;
                case 3:
                    AllBoardings();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        } while (choice != 4);
   
    }

   //In the last stage of this module, we define all the functions mentioned in our list.

    private static void newBoarding() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pet name: ");
        String petName = sc.nextLine();
        System.out.print("Enter appointment date (yyyy-MM-dd): ");
        String dateString = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.print("Enter the duration of boarding(days):");
        int dur = sc.nextInt();
        System.out.println("Enter the breed of your dog:");
        String pettype = sc.next();
        Boarding newb = new Boarding(petName, date , dur, pettype);
        boardings.add(newb);
        System.out.println("Boarding added sucessfully !");
        System.out.println(" Thank you for booking ! Our agent will come to pickup soon");
    }

    private static void cancelBoarding() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter appointment date to cancel (dd-MM-yyyy): ");
        String dateString = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        boolean removed = false;
        for (Boarding x : boardings) {
            if (x.getDate().equals(date)) {
                boardings.remove(x);
                System.out.println("Boarding cancelled successfully!");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Boarding not found!");
        }
    }

    private static void AllBoardings() {
        if (boardings.isEmpty()) {
            System.out.println("No boardings found!");
        } else {
            System.out.println("List of all boardings:");
            for (Boarding x : boardings) {
                System.out.println(x);
            }
        }
    }
   
    private static String dayc()
    {
    System.out.println("Type the daycare you wish to book:");
    Scanner ab = new Scanner(System.in);
    String dc = ab.nextLine();
    return dc;
    }
}
//}