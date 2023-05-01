package Buffer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;



public class VotingSystem {
    private ArrayList<Candidate> candidates;
    private ArrayList<Voters> voters;

    public VotingSystem() {
        candidates = new ArrayList<Candidate>();
        voters = new ArrayList<Voters>();
    }

    public void addCandidate(String name) {
        candidates.add(new Candidate(name));
    }

    public void addVoter(int id, int passcode, String name) {
        voters.add(new Voters(id, passcode, name));
    }

    public boolean verifyVoter(int id, int passcode) {
        for (Voters voter : voters) {
            if (voter.getID() == id && voter.getPasscode() == passcode) {
                return true;
            }
        }
        return false;
    }


    public void castVote() {
        Scanner input = new Scanner(System.in);
        try{System.out.println("Enter your voter ID:");
        int id = input.nextInt();
        System.out.println("Enter your passcode:");
        int passcode = input.nextInt();
                
        if (verifyVoter(id, passcode)) {
            System.out.println("Voter verified.");
            System.out.println("Enter the name of the candidate you wish to vote for:");
            String candidateName = input.next();
            for (Candidate candidate : candidates) {
                if (candidate.getName().trim().equals(candidateName)) {
                    candidate.addVote();
                    System.out.println("Vote cast for " + candidateName + ".");
                    return;
                }
            }
            System.out.println("Candidate not found");
        } else {
            System.out.println("Voter not found or invalid passcode // The Voter has already casted Vote");
        }
        }catch (NoSuchElementException exception) {
            System.out.println("InValid Entry ");
        }
        input.close();
        
    }

 

    public void printResults() {
        System.out.println("Results:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes() + " votes.");
        }
    }
}
