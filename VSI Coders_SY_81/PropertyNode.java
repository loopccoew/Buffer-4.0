package Buffer;
import java.util.*;
public class PropertyNode {
	  private int id;
	  private String name;
	  private int size;
	  private int price;
	  private String amenities;
	  private String phoneNumber;
	  private boolean available;
	  private SpecialNode area;
	  private ArrayList<PropertyNode> neighbors;
	  private Queue<BookingRequest> bookingRequestQueue;
	  
	  public PropertyNode(int id, String name, int size, int price, String amenities, String phoneNumber, boolean available, SpecialNode area) {
	      this.id = id;
	      this.name = name;
	      this.size = size;
	      this.price = price;
	      this.amenities = amenities;
	      this.phoneNumber = phoneNumber;
	      this.available = available;
	      this.area = area;
	      this.neighbors = new ArrayList<PropertyNode>();
	      this.bookingRequestQueue = new LinkedList<>();
	  }
	  
	  public int getId() {
	      return id;
	  }
	  
	  public String getName() {
	      return name;
	  }
	  
	  public int getSize() {
	      return size;
	  }
	  public void setSize(int size) {
		  this.size=size;
	  }
	  
	  public int getPrice() {
	      return price;
	  }
	  public void setPrice(int price) {
		  this.price=price;
	  }
	  
	  public String getAmenities() {
	      return amenities;
	  }
	  public void setAmenities(String amenities ) {
		  this.amenities=amenities;
	  }
	  
	  public String getPhoneNumber() {
	      return phoneNumber;
	  }
	  public void setPhoneNumber(String phoneNumber ) {
		  this.phoneNumber=phoneNumber;
	  }
	  public boolean isAvailable() {
	      return available;
	  }
	  
	  public void setAvailable(boolean available) {
	      this.available = available;
	  }
	  
	  public SpecialNode getArea() {
	      return area;
	  }
	  
	  public ArrayList<PropertyNode> getNeighbors() {
	      return neighbors;
	  }
	  
	  public void addNeighbor(PropertyNode neighbor) {
	      neighbors.add(neighbor);
	  }
	  
	  public void removeNeighbor(PropertyNode neighbor) {
	      neighbors.remove(neighbor);
	  }

	public void addBookingRequest(BookingRequest bookingRequest) {
		 this.bookingRequestQueue.offer(bookingRequest);
	}

	public Queue<BookingRequest> getBookingRequestQueue() {
		return bookingRequestQueue;
	}

	public Queue<BookingRequest> getBookings() {
	    Queue<BookingRequest> bookings = new LinkedList<>();
	    for (BookingRequest bookingRequest : bookingRequestQueue) {
	        if (bookingRequest.getProperty().isAvailable() && !bookings.contains(bookingRequest)) {
	            bookings.offer(bookingRequest);
	        }
	    }
	    return bookings;
	}
	}





