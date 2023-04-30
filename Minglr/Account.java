package socialnetwork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Account 
{
    Scanner s = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    private String fname;
    private String lname;
    private String mob;
    private String email;
    private String userName;
    private String password;
    private String dob;
    private String gender;
    private String bio = "NA";

    private List<Account> friends = null; // This is for Adjacency List

    
    // Parameterized Constructor
    public Account(String fname, String lname, String mob, String email, String userName, String password, String dob,
            char gender, String bio) {
        super();

        this.fname = fname;
        this.lname = lname;
        this.mob = mob;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.dob = dob;

        if (gender == 'M')
            this.gender = "Male";
        else if (gender == 'F')
            this.gender = "Female";
        else
            this.gender = "Other";

        this.bio = bio;

        this.friends = new ArrayList<>();
    }
    
    
    // Return First name 
    private String getFName() 
    {
        return fname;
    }
    
    // Return Last name 
    private String getLname() 
    {
        return lname;
    }

    // Return Username 
    private String getUserName() 
    {
        return userName;
    }

    // Return First Name + Last Name
    public String getName() 
    {
        return this.getFName() + " " + this.getLname();
    }

    // Return Mobile Number 
    private String getMob() 
    {
        return mob;
    }

    // Return Password
    private String getPassword() 
    {
        return password;
    }

    // Return Email ID
    private String getEmail()
    {
        return email;
    }

    // Return Date of Birth
    private String getDob() 
    {
        return dob;
    }

    private String getGender() 
    {
        return gender;
    }


    @Override
    public String toString() 
    {
        return "  Name: " + this.getFName() + " " + this.getLname() + "\n\n" + "  Username: " + this.getUserName() 
                +"\n\n" + "  Mobile Number: " + this.getMob() + "\n\n" + "  Email ID: " + this.getEmail();
    }

    public String showProfile()
    {
        String res =  this.toString() + "\n\n\n" + "  Date Of Birth: " + this.getDob()  + "\tGender: " + this.getGender();
        String stat = "\n\n  Bio: " + this.bio;

        if(!this.bio.equals("NA"))
            res += stat;
        return res;
    }

    // Return Username
    public String userName()
    {
        return this.getUserName();
    }

    // Return Password
    public String password() 
    {
        return this.getPassword();
    }

    // Return friends list
    public List<Account> getFriends() 
    {
        return this.friends;
    }
    
    // Add an account to the friends list
    public void addFriend(Account a) 
    {
        this.friends.add(a);
    }

    // Remove an account from friends list
    public void removeFriend(Account a)
    {
        this.friends.remove(a);
    }
}

