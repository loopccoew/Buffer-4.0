
package buffer;
import java.util.*;
public class FarmerPortal {

        static int []age=new int [5];
        static int []income=new int [5];
        static double []land=new double [5];
        static String crop;
        static String crop_name;
        static String labour;
        static String animal_husbandry;
        static String water_reserve;
        static  int i=0,j;
        static int OTP=123;
       
             
         void input() {
         Scanner scanner = new Scanner(System.in);
         // enter farmer details
         
         System.out.print("Income: ");
         income[i] = scanner.nextInt();
         System.out.print("Land (in acres): ");
         land [i]= scanner.nextDouble();
         System.out.print("Age: ");
         age[i]= scanner.nextInt();
         System.out.print("Does your land has crop (Yes/No): ");
         crop = scanner.next();
         System.out.print("Are you a labour (Yes/No): ");
         labour = scanner.next();
         System.out.print("Do you raise animal stock (Yes/No): ");
         animal_husbandry = scanner.next();
         System.out.print("Do you have water reserve (Yes/No): ");
         water_reserve = scanner.next();
         }
         
         
         void display() {
         System.out.println("Check the entered details:");
         System.out.println("income: "+income[i]);
         System.out.println("land: "+land[i]);
         System.out.println("age: "+age[i]);
         System.out.println("crop: "+crop);
         System.out.println("labour: "+labour);
         System.out.println("animal_husbandry: "+animal_husbandry);
         System.out.println("water_reserve: "+water_reserve);
         }
         
         void PM_Kisan() {
             if(age[i]>18 && land[i]>5 && crop.equals("Yes || yes") && labour.equals("Yes || yes"))
       
             System.out.println("Eligible for PM-KISAN");
             System.out.println("For small & marginal farmers");
             System.out.println("Family member should not have any govt post");
             System.out.println("Will have pension of Rs.6000 per month");
             System.out.println("For more info - URL");
             System.out.println();
             
         }
         
         
         void PM_KMY() {
            if(age[i]<40 && land[i]<5 && labour.equals("Yes || yes") && animal_husbandry.equals("No || no") && water_reserve.equals("No || no") && crop.equals("No|| no"))
       
             System.out.println("eligible for PM-KMY ");
             System.out.println("Will have pension of Rs.3000 per month after 60 yrs of age");
             System.out.println("Will have to pay Rs.55-200 per month");
             System.out.println("For more info - URL");
             System.out.println();
             
         
         }
         
         void PM_Shramyogi() {
            if(age[i]<40 && income[i]<=15000 && labour.equals("Yes || yes") && animal_husbandry.equals("No || no") && water_reserve.equals("No || no") && crop.equals("No|| no"))
       
             System.out.println("eligible for PM-Shram yogi mandhan ");
             System.out.println("eligible for PM-Shramyogi ");
             System.out.println("Will have pension of Rs.3000 per month after 60 yrs of age");
             System.out.println("Will have to pay Rs.55-200 per month");
             System.out.println("For more info - URL");
             System.out.println();
             }
         
         void KCC() {
            if (age[i]<75 && animal_husbandry.equals("Yes || yes") && labour.equals("Yes || yes"))
       
       
             System.out.println("eligible for KCC ");
             System.out.println("Will have drwal repay within 12 months");
             System.out.println("Will have accidental insurance 25k-30k");
             System.out.println("Will have loan of 3 lakh with 4% interest rate");
             System.out.println("Extended to animal husbandry");
             System.out.println("For more info - URL");
             System.out.println();
             }
         
         void Pashu_Kisan() {
            if(animal_husbandry.equals("Yes || yes") && water_reserve.equals("Yes|| yes") && labour.equals("Yes || yes"))
       
             System.out.println("eligible for Pashu kisan credit card: ");
             System.out.println("Will have loan according to animal");
             System.out.println("Will have subsidy on water reserve");
             System.out.println("For more info - URL");
             System.out.println();
             }
         
         void PM_Mudra() {
            if (age[i]<65 && labour.equals("Yes || yes"))
       
       
             System.out.println("eligible for PM mudra yojana: ");
             System.out.println("Will have loan into categories from Rs.50k-10 lakh");
             System.out.println("labours+farmers access with group of 50");
             System.out.println("For more info - URL");
             System.out.println();
             }
           
         void PMFBY() {
             if(crop.equals("Yes || yes"))
       
       
             System.out.println("eligible for PMFBY: ");
             System.out.println("Will have subsidy of 2%, 1.5%, 5% on kharif crops, rabi crops & annual crops resp grown for 5-7 yrs");
             System.out.println("Damage repair due to disasters");
             System.out.println("For more info - URL");
             System.out.println();
             }
         
         void NADCP() {
            if (animal_husbandry.equals("Yes || yes"))
       
       
             System.out.println("eligible for NADCP: ");
             System.out.println("Will provide vaccination for animals hence controlling FMD");
             System.out.println("For more info - URL");
             System.out.println();
             }
         
         void PM_Aasha() {
             if(crop.equals("Yes || yes") && labour.equals("Yes || yes"))
       
       
             System.out.println("Eligible for PM-AASHA");
             System.out.println("Provides assurance of MSP for crops");
             System.out.println("For more info - URL");
             System.out.println();
             }
         
         void PM_Krishi_Sinchai() {
            if(labour.equals("Yes || yes") && water_reserve.equals("Yes || yes") && crop.equals("No|| no") &&animal_husbandry.equals("No || no"))
       
       
             System.out.println("PM krishi sinchai yojana");
             System.out.println("Subsidy on irrigation of about 50-60% esp on drip");
             System.out.println("For more info - URL");
             System.out.println();
             }
         
         public static void main(String[] args) {
         
         Scanner sc=new Scanner(System.in);
         FarmerPortal obj = new FarmerPortal();
       
         System.out.println("-------Welcome to the Farmer Portal--------");
         System.out.println("");
         
         do {
             System.out.println("-------Menu-------");
             System.out.println("1.Insert details\n2.Display available schemes\n3.Required documents\n4.Special Schemes \n5.MSP  ");
             
             System.out.println("Select the option:");
             int j=sc.nextInt();
         
        switch(j) {
        case 1:
                obj.input();
                do {
                System.out.println("Enter OTP:");
                OTP=sc.nextInt();
                if(OTP!=123) {
                System.out.println("ERROR");
                System.out.println("Enter correct OTP");
                          }
                   }
                while(OTP!=123);
                 
                 
                 if (OTP==123){
                 obj.display();
                break;
        }
        case 2:
                 System.out.println("You are eligible for following schemes:");
       
                 obj.PM_Kisan();
             
                 obj.PM_KMY();
               
                 obj.PM_Shramyogi();
               
                 obj.KCC();
                       
                 obj.Pashu_Kisan();                  
             
                 obj.PM_Mudra();
                  
                  obj.PMFBY();
                 
                 obj.NADCP();
           
                 obj.PM_Aasha();
           
                 obj.PM_Krishi_Sinchai();
          
                 break;
       
         
        case 3:
                 System.out.println("Checklist of Necessary Documents\n");
                 System.out.println("\n1.Passport size photographs\n2.Identity and address proof: VoterID card/PAN card/Aadhaar card/Driving license\n3.GST Certificate(if applicable)\n4.Copy of bank statement for last year\n5.Utility bills(Electricity/ water bill)\n");
                  break;
        case 4:
        	
            System.out.println("Following is the list of some special scheme along with their beneficiaries and provisions");
            System.out.println("");
            //scheme1
            System.out.println("1.KCC\nBeneficiaries: individual/ joint cultivators; tenant farmers and sharecroppers\nProvisions: Government of India implements an interest of 2% for short term crop loans upto 3 lakhs");
            System.out.println("");
            //scheme2
            System.out.println("2.E-NAM\nBeneficiaries: Farmers, Mandis, Traders, Buyers, Processors and Exporters\nProvisions: The Government has allocated Rs.200 crore to the newly created ATIF along with this fund SFAC will implement NAM for the upcoming years.Farmers can sell products without the interference of any brokers or mediators by generating competitive returns from their investment.\n    Traders will be able to perform secondary trading from one APMC to another marketing committee in India.\n    Buyers such as retailers, processors or exporters will be able to source commodities from any markets in India by decreasing the mediation cost.");
            System.out.println("");
            //scheme3
            System.out.println("3.MIDH\nBeneficiaries: All farmers including women\nProvisions: Subsidy for the construction of cold storage facilities for horticulture produce.\n    Subsidy for the construction of pack houses, ripening chambers, and other post-harvest management infrastructure.");
            System.out.println("");
            //schme4
            System.out.println("4.Fishery policy\nBeneficiaries:Member of a functional local fishers cooperative society/Federation/any other registered body.Beneficiary should be Below Poverty Line (BPL) and of between 18 and 60 years of age\nProvision:The beneficiary fishers will save Rs. 1500 over a period of 9 months during fishing season annually towards their contribution with a bank designated by the State/UT Department of Fisheries. States/UTs will devise suitable modalities to ensure transparency and smooth implementation of this activity.");
            System.out.println("");
            //scheme5
            System.out.println("5.Swamity Yojana\nBeneficiaries: People in rural areas to obtain land ownership records\nProvisions:Ensure financial stability to villagers by letting them use their property to take loans to form banks and financial institutions.\n     Create precise land records for rural planning.\n     Lessen property-related disputes.\n     Help create survey structure and GIS maps that will allow other departments to use these documents as per their requirement.\n     Determine property tax.");
            System.out.println("");
            break;

            
        
        case 5:
            Scanner key = new Scanner(System.in);
            System.out.println("Enter the crop name whose predicted MSP (in quintal) you wanted to know for 2023-24:");
            System.out.println();
            String crop_name = key.next();
            switch (crop_name)
            {
            case "wheat":
            System.out.println("The predicted MSP for wheat is Rs.2125");
            break;
            case "paddy":
            System.out.println("The predicted MSP for paddy is Rs.2600");
            break;
            case "bajra":
            System.out.println("The predicted MSP for bajra is Rs.2350");
            break;
            case "rice":
            System.out.println("The predicted MSP for rice is Rs.2040");
            break;
            case "jowar":
            System.out.println("The predicted MSP for jowar is Rs.2758");
            break;
            case "ragi":
            System.out.println("The predicted MSP for ragi is Rs.2125");
            break;
            case "soyabean":
            System.out.println("The predicted MSP for soyabean is Rs.4300");
            break;
            case "maize":
            System.out.println("The predicted MSP for maize is Rs.1962");
            break;
            default:
            System.out.println("The MSP of " +crop_name+ " will be updated soon");
            }
            break;
        
        }
         
         }
         while(j==0);
         
         

       System.out.println("Hope you recieved your preference");
       System.out.println("Thank you for visiting");
         
         }
         }

       
