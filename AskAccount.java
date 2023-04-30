package Project;

import java.util.Scanner;

public class AskAccount {

	public static void whichacc() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if(Project.Login.ll.size()!=1) {
			System.out.println("**Select Account**");
			for(int i=0;i<Project.Login.ll.size();i++) {
				System.out.println((i+1)+") Acc "+(i+1));
			}
			int n=sc.nextInt();
			
			System.out.println("Using Account "+n);
			
		}
	}

}
