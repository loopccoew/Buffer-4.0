package com.example.demo2;

import java.util.*;

class Patient {

    //attributes of patient
    String patientName;
    String password;
    private int patientId;
    private String diagnosis;
    private String dateOfDiagnosis;
    public static ArrayList<Report> reports =new ArrayList<Report>();

    public Patient(String patientName,String password, int patientId, String diagnosis, String dateOfDiagnosis) {
        this.patientName = patientName;
        this.password=password;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.dateOfDiagnosis = dateOfDiagnosis;
    }

    public Patient() {

    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getDateOfDiagnosis() {
        return dateOfDiagnosis;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setDateOfDiagnosis(String dateOfDiagnosis) {
        this.dateOfDiagnosis = dateOfDiagnosis;
    }
    static void bookappointment(Doctor doctor1, Patient patient){
        MedicalRecordSystem.slot newslot=new MedicalRecordSystem.slot(patient);
        doctor1.appointments.add(newslot);
    }

    public String displayDetails(StringBuilder sb) {
        sb.append("Patient id: "+patientId+"\nPatient name: "+patientName+"\nDiagnosis: "+diagnosis+"\nDate of diagnosis: "+dateOfDiagnosis);
        viewAllReports(sb);
        return sb.toString();
    }
    //to add new report
    public void addReport() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details of report: \n");
        System.out.println("Date(dd/mm/yyyy): ");
        String date=sc.nextLine();
        System.out.println("Weight (in kg): ");
        double weight=sc.nextInt();
        System.out.println("Height (in cm): ");
        double height=sc.nextInt();
        System.out.println("High Blood pressure: ");
        int bpH=sc.nextInt();
        System.out.println("Low Blood pressure: ");
        int bpL=sc.nextInt();
        System.out.println("Haemoglobin: ");
        double haemoglobin=sc.nextInt();
        System.out.println("Cholesterol: ");
        double cholesterol=sc.nextInt();
        System.out.println("Sugar: ");
        double sugar=sc.nextInt();
        Report r=new Report(date,bpH,bpL,haemoglobin,weight,height,cholesterol,sugar);
        reports.add(r);
    }
    public void addReport(Report r) {
        reports.add(r);
    }
    public StringBuilder viewAllReports(StringBuilder sb) {
        for(Report r:reports) {
            r.display(sb);
            sb.append("\n");
        }
        return sb;
    }
    public void checkHealthTrends() {
        int bpH=0,bpL=0,bh=0,bl=0;
        double haemo=0,sugar=0,weight=0,choles=0,h=0,s=0,w=0,c=0;
        //to check increase or decrease in factors of report
        for(int i=1;i<reports.size();i++) {
            bpH=bpH+reports.get(i).getBpH()-reports.get(i-1).getBpH();
            bpL=bpL+reports.get(i).getBpL()-reports.get(i-1).getBpL();
            haemo=haemo+reports.get(i).getHaemoglobin()-reports.get(i-1).getHaemoglobin();
            sugar=sugar+reports.get(i).getSugar()-reports.get(i-1).getSugar();
            weight=weight+reports.get(i).getWeight()-reports.get(i-1).getWeight();
            choles=choles+reports.get(i).getCholesterol()-reports.get(i-1).getCholesterol();
            bh=reports.get(i).getBpH();
            bl=reports.get(i).getBpL();
            h=reports.get(i).getHaemoglobin();
            s=reports.get(i).getSugar();
            w=reports.get(i).getWeight();
            c=reports.get(i).getCholesterol();
        }
        //to check if safe limits are exceeded
        System.out.println("\n***BLOOD PRESSURE***");
        if(bh>125 || bl >85) {
            System.out.println("You have high Blood Pressure. (TIP: Reduce intake of salt in your diet.)");
        }
        else if(bh<115 || bl <75) {
            System.out.println("You have low Blood Pressure. (TIP: You should start doing breathing excercises.)");
        }
        else {
            System.out.println("You have normal blood pressure. (Keeping yourself fit!)");
        }

        System.out.println("\n***HAEMOGLOBIN***");
        if(h>14) {
            System.out.println("You have high Haemoglobin.");
        }
        else if(h<9) {
            System.out.println("You have low Haemoglobin. (TIP: You should start eating more red fruits!)");
        }
        else {
            System.out.println("You have normal haemoglobin. (Doing great!)");
        }
        if(haemo<0 ) {
            System.out.println("Your haemoglobin is getting lower. (Be cautious.)");
        }
        if(haemo>0 ) {
            System.out.println("Your haemoglobin is getting higher. (Good!)");
        }

        System.out.println("\n***SUGAR***");
        if(s>110) {
            System.out.println("You have high Sugar. (TIP: Reduce intake od sweets in your diet.");
        }
        else if(s<100) {
            System.out.println("You have low Sugar. (TIP: Have some desserrt twice a week!)");
        }
        else {
            System.out.println("You have normal sugar. (Doing great!)");
        }
        if(sugar<0 ) {
            System.out.println("Your blood sugar level is getting lower.");
        }
        if(sugar>0 ) {
            System.out.println("Your blood sugar level is getting higher.");
        }

        System.out.println("\n***WEIGHT***");
        if(w>80) {
            System.out.println("You have high weight. (TIP: Start excercising more.");
        }
        else if(w<50) {
            System.out.println("You have low weight. (TIP: Increace intake of proteins.)");
        }
        else {
            System.out.println("You have normal weight. (Doing great!)");
        }
        if(weight<0 ) {
            System.out.println("Your weight is decreasing.");
        }
        if(weight>0 ) {
            System.out.println("Your weight is increasing.");
        }

        System.out.println("\n***CHOLESTEROL***");
        if(c>180) {
            System.out.println("You have high cholesterol. (TIP: Stop eating oily foods.");
        }
        else {
            System.out.println("You have normal cholesterol. (Doing great!)");
        }
        if(choles<0 ) {
            System.out.println("Your cholesterol level is decreasing.");
        }
        if(choles>0 ) {
            System.out.println("Your cholesterol level is increasing.");
        }

    }

}



class Doctor {
    String doctorname;
    static Queue<MedicalRecordSystem.slot> appointments=new LinkedList<>();
    Doctor(String doctorname){
        this.doctorname=doctorname;
    }
    static String viewappointment(StringBuilder sb){
        int i=1;

        for (MedicalRecordSystem.slot item: appointments) {
            sb.append("\nAppointment no "+i++);
            sb.append("\nPatient Name: "+ MedicalRecordSystem.slot.patient.getPatientName());
            sb.append("\nPatient ID: "+ MedicalRecordSystem.slot.patient.getPatientId());

        }
return sb.toString();
    }
    void dequeAppointment(Doctor doctor){
        doctor.appointments.remove();
    }
}



class Hospital {
     static ArrayList<Patient> medicalRecords = new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);
    public static void addMedicalRecord() {
        System.out.println("Please enter the patient name:");
        String patientName = scanner.nextLine();

        System.out.println("Please enter the patient ID:");
        int patientId = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.println("Please enter the patient's diagnosis:");
        String diagnosis = scanner.nextLine();

        System.out.println("Please enter the patient's password:");
        String password = scanner.nextLine();

        System.out.println("Please enter the date of diagnosis (in the format of DD/MM/YYYY):");
        String dateOfDiagnosis = scanner.nextLine();

        Patient medicalRecord = new Patient(patientName, password,patientId, diagnosis, dateOfDiagnosis);
        medicalRecords.add(medicalRecord);
        System.out.println("New medical record added successfully!");
    }




    public static void addReportToPatient() {
        System.out.println("Enter patient id: ");
        int pid=scanner.nextInt();
        for(Patient p: medicalRecords) {
            if(p.getPatientId()==pid) {
                p.addReport();
            }
        }
    }


}


class Report{

    //attributes of report
    private String date;
    private int bpH; //high bp
    private int bpL; //low bp
    private double haemoglobin;
    private double weight;
    private double height;
    private double cholesterol;
    private double sugar;

    public Report(String date,int bpH, int bpL, double haemoglobin, double weight, double height, double cholesterol,
                  double sugar) {
        super();
        this.date=date;
        this.bpH = bpH;
        this.bpL = bpL;
        this.haemoglobin = haemoglobin;
        this.weight = weight;
        this.height = height;
        this.cholesterol = cholesterol;
        this.sugar = sugar;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBpH() {
        return bpH;
    }
    public void setBpH(int bpH) {
        this.bpH = bpH;
    }
    public int getBpL() {
        return bpL;
    }
    public void setBpL(int bpL) {
        this.bpL = bpL;
    }
    public double getHaemoglobin() {
        return haemoglobin;
    }
    public void setHaemoglobin(double haemoglobin) {
        this.haemoglobin = haemoglobin;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getCholesterol() {
        return cholesterol;
    }
    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }
    public double getSugar() {
        return sugar;
    }
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    public String display(StringBuilder sb) {
        sb.append("Date: "+date+"\nWeight: "+weight+" kg\nHeight: "+height+" cm\nBlood pressure: "+bpH+"-"+bpL+"\nHaemoglobin: "+haemoglobin+"\nCholesterol: "+cholesterol+"\nSugar: "+sugar);
        return sb.toString();
    }
}




class MedicalRecordSystem {
    static class slot {
        static Patient patient;

        slot(Patient patient) {
            this.patient = patient;
        }

    }


    /* System has arraylist of Patients
     * each patient has name,id,disease to be diagnosed, date of diagnosis and
     * an arraylist storing all the reports of that patient.
     */
   /* Username, password
    Patient1234,1234
    * Hospital1234, Hospital1234
    * "Patient1234","1234"
    "Patient5678", "5678"
    "Patient9101", "9101"
    "Patient1121", "1121"
    "Patient3141", "3141"
    *
    */
    Scanner scanner = new Scanner(System.in);
    static HashMap<String, Patient> patientTable = new HashMap<>();
    static Hospital hospital1 = new Hospital();
    static Doctor doctor_a = new Doctor("Dr Ajay Joshi");
    static Doctor doctor_b = new Doctor("Dr Meenal Kumar");
    static Patient patient1 = new Patient("Patient1234", "1234", 1234, "Cancer", "12-12-2022");
    static Patient patient2 = new Patient("Patient5678", "5678", 5678, "Diabetes", "05-05-2023");
    static Patient patient3 = new Patient("Patient9101", "9101", 9101, "Heart Disease", "08-08-2024");
    static Patient patient4 = new Patient("Patient1121", "1121", 1121, "Arthritis", "01-01-2025");
    static Patient patient5 = new Patient("Patient3141", "3141", 3141, "Migraine", "06-06-2026");

    static void mdr() {

        patientTable.put("1234", patient1);
        patientTable.put("5678", patient2);
        patientTable.put("9101", patient3);
        patientTable.put("1121", patient4);
        patientTable.put("3141", patient5);


    }

    static void patientfunctions() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {

            System.out.println("\nPatients, Please select an option:");
        System.out.println("1. Add/Edit name");
        System.out.println("2. Add/Edit Diagnosis");
        System.out.println("3. Add/Edit diagnosis date");
        System.out.println("4. Add report");
        System.out.println("5. View all details");
        System.out.println("6. Check your health trends.");
        System.out.println("7. Book an appointment");
        System.out.println("8. Patient Logout");

        choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String n = scanner.nextLine();
                    patient1.setPatientName(n);
                    break;
                case 2:
                    System.out.println("Enter diagnosis: ");
                    String diagnosis = scanner.nextLine();
                    patient1.setDiagnosis(diagnosis);
                    break;
                case 3:
                    System.out.println("Enter diagnosis date: ");
                    String date = scanner.nextLine();
                    patient1.setDateOfDiagnosis(date);
                    break;
                case 4:
                    patient1.addReport();
                    break;
                case 5:
                    //patient1.displayDetails();
                    break;
                case 6:
                    patient1.checkHealthTrends();
                    break;
                case 7:
                    System.out.println("Welcome to appointment booking system!");
                    System.out.println("Which doctor would you like to consult?");
                    System.out.println("1. Dr Ajay Joshi");
                    System.out.println("2. Dr Meenal Kumar");
                    int doc_choice = scanner.nextInt();
                    System.out.println("Appointment booked successfully");
                    switch (doc_choice) {
                        case 1:
                            patient1.bookappointment(doctor_a, patient1);
                            break;
                        case 2:
                            patient1.bookappointment(doctor_b, patient1);
                            break;
                        default:
                            System.out.println("invalid response");
                            break;
                    }
                    break;


                case 8:
                    //running = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;


            }


        } while (choice!=8);

    }



    }





