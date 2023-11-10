package Buffer;
import java.util.*;
public class User {
    private String username;
    private String password;
    private String phoneNumber;
    private ArrayList<PropertyNode> properties;
    
    public User(String username, String password,String phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber=phoneNumber;
        this.properties = new ArrayList<PropertyNode>();
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public ArrayList<PropertyNode> getProperties() {
        return properties;
    }
    
    public void addProperty(PropertyNode property) {
        properties.add(property);
    }
}

class Owner extends User {
	 
    public Owner(String username, String password, String phoneNumber) {
		super(username, password, phoneNumber);
	}
}

class Tenant extends User { 
    public Tenant(String username, String password, String phoneNumber) {
        super(username, password,phoneNumber);
    }
    
}
