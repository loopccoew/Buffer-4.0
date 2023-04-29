/* This is the PetShop module where the user purchase the items from the shop and bill will generate. Let's have a closer look into the code !*/


//Importing necessary packages
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;

class Shop{
   
    String shop;
   
   
    public Shop( String shop) {
        this.shop= shop;
       
    }
    public String getshop(){
        return shop;
    }
   
}

  public class Petshop{

   static LinkedList<Item> items = new LinkedList<Item>();
 
   Petshop(){
   
        // Create a LinkedList to store the shops
     LinkedList<String> shops = new  LinkedList<>();
     
  // Add some shops to the list
     shops.add("Shops - 1.Delight Petshop  2.Platinum Petshop - karvenagar");
     shops.add("Shops - 1.Boltz Petcare   2.Princess Paw Petstore-hinjewadi");
     shops.add("Shops - 1.Sardarji Pet's  2.Pawpie Petshop- baner");
     shops.add("Shops - 1.Just Dogs   2.PETSGALLERY- aundh");
     shops.add("Shops - 1.Pets Passion House  2.Rohit's Pets corner -kothrud");
     shops.add("Shops - 1.Oxfire Petshop  2.Khushi Petshop - katraj");

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
       
       
        // Display the menu
        System.out.println("------MENU-----");
        System.out.println("1. Display all Shops");
        System.out.println("2. Display Shops in a specific area");
        System.out.println("3. Petshop");
       
        // Loop until the user chooses to exit
        boolean exit = false;
        while (!exit) {
           
            // Ask the user to choose an option
            System.out.print("Enter your choice (1-3): ");
            int choice = input.nextInt();
           
            // Perform the chosen action
            switch (choice) {
                case 1:
                    // Display all shops
                    System.out.println("All Pet Shops:");
                    for (String shop : shops) {
                        System.out.println(shop);
                    }
                   
                    break;
                   
                case 2:
                    // Display shops in a specific area
                    System.out.print("Enter the area: ");
                    String area = input.next();
                    System.out.println("Shops in " + area + ":");
                    for (String shop : shops) {
                        if (shop.endsWith(area)) {
                            System.out.println(shop);
                        }
                    }
                    break;
                   
                case 3:
                // Exit the program
                exit = true;
                System.out.println("***PET SHOP MANAGEMENT SYSTEM***");
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
     
   
    System.out.println("**************Welcome to  ARMS Pet Shop!**************");

 // List of all items available in shop.
    items.add(new Item("Pedigree",100.00,1));
    items.add(new Item("Canin",80.00,1));
    items.add(new Item("Waggy Zone", 120.00,1));
    items.add(new Item("Dogsee", 169.00,1));
    items.add(new Item("Raw Bites",668.00,1));
    items.add(new Item("Toy",2100,1));
    items.add(new Item("Collar",50,1));
    items.add(new Item("Leash",21,1));
    items.add(new Item("DogZkart",427,1));
    items.add(new Item("Basil shampoo",512,1));
    items.add(new Item("Top Dog Mist",403,1));
    items.add(new Item("Petkin",759,1));
     
    	int ch ;
   
    do {
        System.out.println("\nPlease select an option:");
        System.out.println("1. Purchase items");
        System.out.println("2. View items");
        System.out.println("3.Shop");
       ch=sc.nextInt();

        switch (ch) {
            case 1:
                purchaseItems();
                break;
            case 2:
                viewItems();
                break;
            case 3:
                System.out.println("Thank you for Visiting Pet Shop.Bye!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }while(ch!=3);
        
   }
static void purchaseItems() {

     LinkedList<Item> cart = new LinkedList<Item>();
   
    while (true) {
        System.out.println("\nPlease select an item to purchase:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName() + " (Rs." + items.get(i).getPrice() + ")");
        }
        System.out.println("0. Complete purchase");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if (option == 0) {
            break;
        }

        if (option < 1 || option > items.size()) {

            System.out.println("Invalid option. Please try again.");
            continue;
        }

       
        Item selectedItem = items.get(option - 1);
        cart.add(selectedItem);


        System.out.println(selectedItem.getName() + " added to cart.");
    }

    if (cart.isEmpty()) {
        System.out.println("Cart is empty. Please add items to cart.");
        return;
    }
    // Display all items in cart
System.out.println("\nItems in Cart:");
for (int i = 0; i < cart.size(); i++) {
    System.out.println((i + 1) + ". " + cart.get(i).getName() + " (Rs." + cart.get(i).getPrice() + ")");
}


    System.out.println("\nPlease enter your name:");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    System.out.println("Please enter your email address:");
    Scanner sc = new Scanner(System.in);
    String email = sc.nextLine();

    LocalDateTime dateTime = LocalDateTime.now();

    Bill bill = new Bill(name, email);

    System.out.println("\nBill generated successfully!");



// Generate and display the bill
double total = 0.0;
System.out.println("\n---------------BILL------------------");
System.out.println("Item\t\t\tPrice\t\tQuantity\tTotal");
for (Item item : cart) {
    double itemTotal = item.getPrice() * item.getQuantity();
    System.out.printf("%-20s\t%-10.2f\t%-10d\t%-10.2f\n",
            item.getName(),           item.getPrice(),             item.getQuantity(),             itemTotal);
    total += itemTotal;
}
System.out.println("---------------------------------------------------");
System.out.printf("Total\t\t\t\t\t\t\t%-10.2f", total);
}

static class Item {

    private String name;
    private double price;
    private int quantity;
    private int i;

    public Item(String name, double price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity=quantity;
   
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
   
}

static void viewItems() {
    if (items.isEmpty()) {
        System.out.println("\nNo items available.");
        return;
    }

    System.out.println("\nList of items:");

    for (int i = 0; i < items.size(); i++) {
        System.out.println((i + 1) + ". " + items.get(i).getName() + " (Rs." + items.get(i).getPrice() + ")");
    }
}

static class Bill {

     String name;
     String email;
     
   
     Bill(String name, String email) {
        this.name = name;
        this.email = email;
       
    }
       
        public String getName() {
        return name;
        }
        public String getEmail() {
        return email;
        }
       
         
}
  }
   
  
   