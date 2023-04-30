package Buffer;

import java.util.*;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, Owner> owners=new HashMap<String, Owner>();
    private static HashMap<String, Tenant> tenants= new HashMap<String, Tenant>();
    private static Graph graph=new Graph();
    static BookingRequest check;
    
		public static void main(String[] args) {
			
	        boolean isRunning = true;
	        
	        while (isRunning) {
	            System.out.println("************************************");
	            System.out.println("=== House Rent Management System ===");        
	            System.out.println("************************************");
	            System.out.println("1. Owner Login");
	            System.out.println("2. Tenant Login");
	            System.out.println("3. Create Owner Account");
	            System.out.println("4. Create Tenant Account");
	            System.out.println("5. Exit");
	            System.out.println("------------------------------------");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine();
	            System.out.println("------------------------------------");
	            
	            switch (choice) {
	                case 1:
	                	System.out.println("Enter your username: ");
	                	String username=scanner.nextLine();
	                	System.out.println("Enter your password: ");
	                	String password=scanner.nextLine();
	                	while(password.length()<6||password.length()>6) {
	                		System.out.println("Please enter a 6 figure password.");
	                		password=scanner.next();
	                	}
	                	String type="owner";
	                	User obj1=login(username, password,type);	
	                    break;
	                case 2:
	                	System.out.println("Enter your username: ");
	                	String username1=scanner.nextLine();
	                	System.out.println("Enter your password: ");
	                	String password1=scanner.nextLine();
	                	while(password1.length()<6||password1.length()>6) {
	                		System.out.println("Please enter a 6 figure password.");
	                		password1=scanner.next();
	                	}
	                	String type1="tenant";
	                	User obj2=login(username1, password1,type1);
	                    break;
	                case 3:
	                	System.out.println("Enter your username: ");
	                	String username2=scanner.nextLine();
	                	System.out.println("Enter your password: ");
	                	String password2=scanner.nextLine();
	                	while(password2.length()<6||password2.length()>6) {
	                		System.out.println("Please enter a 6 figure password.");
	                		password2=scanner.next();
	                	}
	                	System.out.println("Enter your phone Number: ");
	                	String phoneNumber2=scanner.next();
	                	while(phoneNumber2.length()<10||phoneNumber2.length()>10) {
	                		System.out.println("Invalid phone number! Please enter a valid phone number.");
		                	phoneNumber2=scanner.next();
	                	}
	                	createOwnerAccount(username2, password2, phoneNumber2);
	                    break;
	                case 4:
	                	System.out.println("Enter your username: ");
	                	String username3=scanner.nextLine();
	                	System.out.println("Enter your password: ");
	                	String password3=scanner.nextLine();
	                	while(password3.length()<6||password3.length()>6) {
	                		System.out.println("Please enter a 6 figure password.");
	                		password3=scanner.next();
	                	}
	                	System.out.println("Enter your phone Number: ");
	                	String phoneNumber3=scanner.next();
	                	while(phoneNumber3.length()<10||phoneNumber3.length()>10) {
	                		System.out.println("Invalid phone number! Please enter a valid phone number.");
		                	phoneNumber3=scanner.next();
	                	}
	                	createTenantAccount(username3, password3, phoneNumber3);
	                    break;
	                case 5:
	                	System.out.println("************");
	                	System.out.println("Thankyou!!!!");
	                	System.out.println("************");
	                    isRunning = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	    }
		public static User login(String username, String password, String type) {
	        if (type.equals("owner")) {
	            Owner owner = owners.get(username);
	            if(owner==null){
	            	System.out.println("Account with this username does not exist.");
	            }
	            else if (owner != null && owner.getPassword().equals(password)) {
	                owneroptions(owner);
	                return owner;
	            }else {
	            	System.out.println("Invalid username or password.");
	            }
	        }
	        else if (type.equals("tenant")) {
	            Tenant tenant = tenants.get(username);
	            if(tenant==null){
	            	System.out.println("Account with this username does not exist.");
	            }
	            else if (tenant != null && tenant.getPassword().equals(password)) {
	            	tenantoptions(tenant);
	                return tenant;
	            }else {
	            	System.out.println("Invalid username or password.");
	            }
	        }
	        return null;
	    }
		
		public static void createOwnerAccount(String username, String password, String phoneNumber) {
	        Owner owner = new Owner(username, password, phoneNumber);
	        owners.put(username, owner);
	        owneroptions(owner);
	        
	    }
	    
		 public static void createTenantAccount(String username, String password, String phoneNumber) {
		        Tenant tenant = new Tenant(username, password, phoneNumber);
		        tenants.put(username, tenant);
		        tenantoptions(tenant);
		    }
		static void owneroptions(User owner) {
			System.out.println();
			System.out.println("*********************");
	        System.out.println("=== Owner Options ===");
	        System.out.println("*********************");
	            boolean isLoggedIn = true;
	            
	            while (isLoggedIn) {
	            	System.out.println("------------------------------------");
	                System.out.println("1. Add Property");
	                System.out.println("2. Update Property");
	                System.out.println("3. view booking requests");
	                System.out.println("4. View your property details");
	                System.out.println("5. Logout");
	                System.out.println("------------------------------------");
	                System.out.print("Enter your choice: ");                
	                int choice = scanner.nextInt();
	                scanner.nextLine();
	                System.out.println("------------------------------------");
	                switch (choice) {
	                    case 1:
		                	System.out.println("Enter owner name: ");
	                    	String name=scanner.nextLine();
	                    	System.out.println("Enter size of the property in square meter: ");
	                    	int size=scanner.nextInt();
	                    	System.out.println("Enter price of the property: ");
	                    	int price=scanner.nextInt();
	                    	System.out.println("Enter amenities of the property: ");
	                    	String amenities=scanner.next();
	                    	System.out.println("Enter availability of the property true or false: ");
	                    	boolean available=scanner.nextBoolean();
	                    	System.out.println("Enter area of the property: ");
	                    	String areaLabel=scanner.next();
	                    	addProperty(owner.getUsername(),name, size, price,amenities,owner.getPhoneNumber(),available,areaLabel);
	                        break;
	                    case 2:
	                    	System.out.println("Enter your propertyid: ");
		                	int id1=scanner.nextInt();  
	                    	updateProperty(owner.getUsername(),id1);
	                        break;
	                    case 3:
	                    	System.out.println("Enter property id which you want to check: ");
	                    	int propertyId1=scanner.nextInt();
	                 		check=acceptBookingRequest(owner.getProperties(),propertyId1);
	                        break;
	                    case 4:
		                	System.out.println("Enter your propertyid: ");
		                	int id2=scanner.nextInt();
	                        viewProperties(owner.getUsername(),id2);
	                        break;
	                    case 5:
	                    	System.out.println("----------------------");
	                    	System.out.println("You have logged out!!!");
	                    	System.out.println("----------------------");
	                    	isLoggedIn = false;
	                        break;
	                        
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	                        break;
	                }
	            }
	        }
	      
		static void tenantoptions(User tenant) {
			System.out.println();
			System.out.println("**********************");
	        System.out.println("=== Tenant Options ===");
	        System.out.println("**********************");
	            boolean isLoggedIn = true;
	            while (isLoggedIn) {
	            	System.out.println("------------------------------------");
	                System.out.println("1. View Properties in your interested area");
	                System.out.println("2. Send Booking Request");
	                System.out.println("3. View Status of Booked Properties");
	                System.out.println("4. Logout");
	                System.out.println("------------------------------------");
	                System.out.print("Enter your choice: ");	                
	                int choice1 =scanner.nextInt();
	                System.out.println("------------------------------------");
	                switch (choice1) {
                    case 1:
                    	System.out.println("Enter your interesed area: ");
                    	String searcharea=scanner.next();
                    	System.out.println();
                    	System.out.println("Area: "+searcharea);
                    	System.out.println("==============================");
                    	Graph.searchprop(searcharea);
                    	System.out.println();
                    	break;
                    case 2:
                    	System.out.println("Enter property id which you want to book: ");
                    	int propertyId=scanner.nextInt();
                    	System.out.println("Enter name of tenant: ");
                    	String tenantName=scanner.next();
                    	System.out.println("Enter contact number of tenant: ");
                    	String tenantContact=scanner.next();
                    	while(tenantContact.length()<10||tenantContact.length()>10) {
	                		System.out.println("Invalid phone number! Please enter a valid phone number.");
	                		tenantContact=scanner.next();
	                	}
                    	sendBookingRequest(tenant.getProperties(), propertyId, tenantName,tenantContact);
                        break;
                    case 3:
                    	System.out.println("Enter property id to check status: ");
                    	int propertyId1=scanner.nextInt();
                    	seeStatus(check,tenant.getProperties(),propertyId1);
                        break;
                    case 4:
                    	System.out.println("----------------------");
                    	System.out.println("You have logged out!!!");
                    	System.out.println("----------------------");
                    	isLoggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
	        }          
		}
		
		public static void addProperty(String username, String name, int size, int price, String amenities, String phoneNumber, boolean available, String areaLabel) {
	        User owner = owners.get(username);
	        if (owner == null) {
	            return;
	        }
	        SpecialNode area = null;
	        
	        for (SpecialNode node : graph.getSpecialNodes()) {
	            if (node.getLabel().equals(areaLabel)) {
	                area = node;
	                break;
	            }
	        }
	        if (area == null) {
	            area = new SpecialNode(areaLabel);
	            graph.addSpecialNode(area);
	        }
	        
	        PropertyNode property = new PropertyNode(graph.getPropertyNodes().size() + 1, name, size, price, amenities, phoneNumber, available, area);
	        graph.addPropertyNode(property);
	        owner.addProperty(property);
	        System.out.println("================================");
	        System.out.println("Property added successfully!!!!!");
	        System.out.println("Id of your property is: " + property.getId());
	        System.out.println("================================");
	    }
		
		public static void updateProperty(String username,int propid){
			User owner = owners.get(username);
			if (owner == null) {
	            return;
	        }
			for (PropertyNode node : graph.getPropertyNodes()) {
	            if (node.getId()==propid ) {
	            	System.out.println("-----------------------");
	                System.out.println("Your Property details: ");
	                System.out.println("-----------------------");
	                System.out.println("Size of your Property is: "+node.getSize());
	                System.out.println("Price of your Property is: "+node.getPrice());
	                System.out.println("Amenities of your Property is: "+node.getAmenities());
	                System.out.println("Availability of your Property is: "+node.isAvailable());
	                System.out.println("---------------------------------------------");
	                boolean flag=true;
	                while(flag==true) {
	                System.out.println("----------------------");
	                System.out.println("1. update size");
	                System.out.println("2. update price");
	                System.out.println("3. update amenities");
	                System.out.println("4. update availaibility status of property");
	                System.out.println("5. update owner phoneno");
	                System.out.println("6. exit");
	                System.out.println("----------------------");
	                System.out.print("Enter your choice: ");                
	                int choice1 =scanner.nextInt();
	                System.out.println("----------------------");
	                switch (choice1) {
                    case 1:
                    	System.out.println("Enter updated size: ");
                    	int upsize=scanner.nextInt();
                    	node.setSize(upsize);
                    	break;
                    case 2:
                    	System.out.println("Enter updated price: ");
                    	int upprice=scanner.nextInt();
                    	node.setPrice(upprice);
                        break;
                    case 3:
                    	System.out.println("Enter updated amenities: ");
                    	String upamenities=scanner.next();
                    	node.setAmenities(upamenities);
                        break;
                    case 4:
                    	System.out.println("Enter updated status of property: ");
                    	boolean upstatus=scanner.nextBoolean();
                    	node.setAvailable(upstatus);
                        break;
                    case 5:
                    	System.out.println("Enter updated phoneno: ");
                    	String upphoneno=scanner.next();
                    	node.setPhoneNumber(upphoneno);
                        break;
                    case 6:
                    	System.out.println("All required details are updated. ");
                    	System.out.println("----------------------------------");
                    	flag = false;
                    	return;
                        
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
	                	}
	                }
	                break;
	            }
	           
	        }	
			System.out.println("Property not found.");
			return;
		}
		
		public static void viewProperties(String username,int ID) {
			Owner owner = owners.get(username);
			if (owner == null) {
	            return;
	        }
			for (PropertyNode node : graph.getPropertyNodes()) {
	            if (node.getId()==ID ) {
	            	System.out.println("-----------------------");
	                System.out.println("Your Property details: ");
	                System.out.println("-----------------------");
	                System.out.println("Size of your Property is: "+node.getSize());
	                System.out.println("Price of your Property is: "+node.getPrice());
	                System.out.println("Amenities of your Property is: "+node.getAmenities());
	                System.out.println("Availability of your Property is: "+node.isAvailable());
	                System.out.println("---------------------------------------------");
	                break;
	            }
	            else {
	            	System.out.println("Property not found");
	            }
	        }	
		}		
		
		public static void sendBookingRequest(ArrayList<PropertyNode> properties, int propertyId, String tenantName, String tenantContact) {
		    boolean propertyFound = false;
		    for (PropertyNode property : graph.getPropertyNodes()) {;
		        if (property.getId()==propertyId) {
		            propertyFound = true;
		            if (property.isAvailable()) {
		                property.addBookingRequest(new BookingRequest(tenantName, tenantContact,propertyId));
		                System.out.println();
		                System.out.println("Booking request sent to property owner for Property ID: " + propertyId);
		                System.out.println();
		            } else {
		            	System.out.println();
		                System.out.println("Property with ID " + propertyId + " is already booked.");
		                System.out.println();
		            }
		            break;
		        }        
		    }
		    if (!propertyFound) {
		        System.out.println("Property with ID " + propertyId + " not found.");
		    }
		}
		public static BookingRequest acceptBookingRequest(ArrayList<PropertyNode> properties, int propertyId) {   
		    PropertyNode property = null;
		    for (PropertyNode p : graph.getPropertyNodes()) {
		        if (p.getId() == propertyId) {
		            property = p;
		            break;
		        }
		    }
		    if (property == null) {
		        System.out.println("Property not found.");
		        return null;
		    }
		    BookingRequest bookingRequest = property.getBookingRequestQueue().poll();
		    if (bookingRequest == null) {
		        System.out.println("No booking requests found for property with ID " + propertyId+". ");
		        return null;
		    }
		    System.out.println("------------------------");
		    System.out.println("The tenant details are: ");
		    System.out.println("------------------------");
		    System.out.println("Name of tenant: "+bookingRequest.getTenantName());
		    System.out.println("Contact of tenant: "+bookingRequest.getTenantContact());
		    System.out.println("-----------------------------------");
		    System.out.println("Do you want to accept this request? (Press 1 to accept or 2 to reject)");
		    int ch=scanner.nextInt();
		    System.out.println("------------------------");
		    switch(ch) {
		    case 1:
		    	bookingRequest.setStatus("Accepted");
		    	property.setAvailable(false);
		    	System.out.println("Booking request accepted for "+bookingRequest.getTenantName()+" for Property ID: " + propertyId+". ");
		    	break;
		    case 2:
		    	bookingRequest.setStatus("Rejected");
		    	property.setAvailable(true);
		    	System.out.println("Booking request rejected for "+bookingRequest.getTenantName()+" for Property ID: " + propertyId+". ");
		    	break;
		    default :
		    	System.out.println("Invalid choice! Enter vaild choice.");
		    	break;
		    }
		    return bookingRequest;		    
		}		
		
		public static void seeStatus(BookingRequest check, ArrayList<PropertyNode> properties,int propertyId) {
			PropertyNode property = null;
		    for (PropertyNode p : graph.getPropertyNodes()) {
		        if (p.getId() == propertyId) {
		            property = p;
		            break;
		        }
		    }
		    if(property.isAvailable()==true&&check==null) {
		    	System.out.println("--------------------------------------------------------------");
		    	System.out.println("Your booking request for property "+property.getId()+" is in queue" );
		    	System.out.println("--------------------------------------------------------------");
		    }
		    else if(property.isAvailable()==false&&check.getStatus()=="Accepted") {
		    	System.out.println("--------------------------------------------------------------");
			System.out.println("Your booking request for property "+property.getId()+" is Accepted" );
			System.out.println("--------------------------------------------------------------");
			}
		    
		    else {
		    	System.out.println("--------------------------------------------------------------");
				System.out.println("Your booking request for property "+property.getId()+" is Rejected" );
				System.out.println("--------------------------------------------------------------");
			}
		    System.out.println();
		}
	}




