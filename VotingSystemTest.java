package Buffer;

import java.io.File;
import java.util.Scanner;


public class VotingSystemTest {
    public static void main(String[] args) throws Exception {
        VotingSystem votingSystem = new VotingSystem();

        // Add candidates
        votingSystem.addCandidate("CandidateA") ;
        votingSystem.addCandidate("CandidateB");
        votingSystem.addCandidate("CandidateC");
        

        // Read voters from CSV file
        Scanner voterScanner = new Scanner(new File("D:\\Buffer 4.0\\Codes\\Buffer\\codes.csv"));
        while (voterScanner.hasNextLine()) {
            String[] voterInfo = voterScanner.nextLine().split(",");
            int id = Integer.parseInt(voterInfo[0].trim());
            int passcode = Integer.parseInt(voterInfo[1].trim());
            String name = voterInfo[2].trim();
            //int flag = Integer.parseInt(voterInfo[3].trim());
            votingSystem.addVoter(id, passcode, name);
        }
        voterScanner.close();

        

        // Cast votes
        votingSystem.castVote();
        votingSystem.castVote();
        votingSystem.castVote();
        votingSystem.castVote();
        votingSystem.castVote();
        votingSystem.castVote();

        // Print results
        votingSystem.printResults();
    }
}
