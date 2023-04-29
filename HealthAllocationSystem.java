import java.util.*;

class Patient {
    int age;
    String status;
    String name;

    public Patient(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getAge() {
        return age;
    }
}

class HealthAllocationSystem {
    Stack<Patient> P1 = new Stack<>();
    List<Patient> P2=new ArrayList<>();
    int flag=0;
    public void addPatient(Patient P) {
        if ((P.getStatus().equalsIgnoreCase("Normal"))) {
            P2.add(P);
        } else {
            P1.push(P);
        }
    }

    public Patient getNextPatient() {
        if (!P1.isEmpty()) {
            return P1.pop();
        } else if (!P2.isEmpty()) {
            return P2.remove(flag);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         HealthAllocationSystem HA = new HealthAllocationSystem();
        System.out.println("Enter the number of patients");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline character
        int age;
        String name, status;
        for (int i = 0; i < n; i++) {
            System.out.println("Patient No:"+(i+1));
            System.out.println("Enter the name of the patient");
            name = sc.nextLine();
            System.out.println("Enter age of the patient");
            age = sc.nextInt();
            sc.nextLine(); // consume newline character
            System.out.println("Enter status (Critical/Normal) of the person");
            status = sc.nextLine();
            HA.addPatient(new Patient(name, age, status));
       System.out.println("-------------------------------------------------------");
        }
        System.out.println("Enter the number of beds available:");
        int b = sc.nextInt();
        Patient nextPA = HA.getNextPatient();
        int i = 0;
        while ((nextPA != null) && (i != b)) {
            System.out.println("Treating patient: " + nextPA.getName());
            nextPA = HA.getNextPatient();
            i++;
  }
 }
}

