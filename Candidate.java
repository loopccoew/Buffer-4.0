package Buffer;
public class Candidate {
    private String name;
    private int votes;
 
    public Candidate(String name) {
       this.name = name;
       votes = 0;
    }
 
    public String getName() {
       return name;
    }
 
    public int getVotes() {
       return votes;
    }
 
    public void addVote() {
       votes++;
    }
 }
 