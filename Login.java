//System.out.print("");
package Project;
import java.util.*;
public class Login {
	static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("rawtypes")
	public static LinkedList<Stack> ll = new LinkedList<>();
	public static void display(Stack<Double> history)
    {
        if(history.empty())
        return ;        
        Double x = history.peek();
        history.pop();
        System.out.println(x);
        display(history);
        history.push(x);
        
    }
	@SuppressWarnings("unused")
	public static void main(String[] args) {
        System.out.println("Hello User!!!");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Set MPIN: ");
        int mpin = sc.nextInt();
        System.out.println("No of account to be added: ");
   	    int n= sc.nextInt();
        for(int i=0;i<=n-1;i++){ 
                	Stack<String> stk = new Stack<>();
                	System.out.println("\nBank name: ");
                	String BankAcc = sc.next();
                	stk.add(BankAcc);
                System.out.print("IFSC code: ");
                String ifcs = sc.next();
                stk.add(ifcs);
                System.out.print("Account no: ");
                String acc = sc.next();
                stk.add(acc);
                System.out.print("CRN: ");
                String crn = sc.next();
                stk.add(crn);
                ll.add(stk);
                System.out.println("Account added Succefully!!!!");
                
         
        }
        System.out.println("\nUsing Account no 1");
        Project.Feature.main(1,mpin);
        
	}

}
