import java.util.Scanner;
import java.util.Stack;

class Place {
    int pin;
    Place next;
    String PName;
    Place(int n,String name){
        this.pin=n;
        this.PName=name;
        this.next=null;
    }
}
class InfoGuide{
    static class Node {
        String Place;
        String info;

        Node left, right;


        Node(String place, String data) {
// Constructor to initialize data of Node i.e. Binary Tree Node
            Place = place;
            info = data;
            this.left = null;
            this.right = null;

        }
    }

    Node root;
    InfoGuide() {
        root = null;
    }


    void insert(String pl, String da) {
        Node temp = new Node(pl, da);
        if (root == null) {
            root = temp;
        } else {
            Node ptr = root;
            boolean flag = false;
            while (flag == false) {
                if (temp.Place.compareToIgnoreCase(ptr.Place) < 0) {
                    if (ptr.left == null) {
                        ptr.left = temp;
                        flag = true;
                        break;
                    } else {
                        ptr = ptr.left;
                    }
                } else if (temp.Place.compareTo(ptr.Place) > 0) {
                    if (ptr.right == null) {
                        ptr.right = temp;
                        flag = true;
                        break;
                    } else {
                        ptr = ptr.right;
                    }
                }
            }
        }
    }

    public String Search(String placeToSearch, InfoGuide b1) {
        Node ptr = b1.root;
        while (ptr != null) {
            if (ptr.Place.equalsIgnoreCase(placeToSearch)) {
                return ptr.info;
            } else if (ptr.Place.compareToIgnoreCase(placeToSearch) > 0) {
                ptr = ptr.left;
            } else if (ptr.Place.compareToIgnoreCase(placeToSearch) < 0) {
                ptr = ptr.right;
            }
        }
        return null;
    }

    public void addPlcae() {
        insert("Parvati Temple", "Parvati Hill is a hillock in Pune, India. The hillock rises to 2,100 feet (640 m) above sea level.\n Atop the hillock is the Parvati Temple, one of the most scenic locations in Pune.\n The temple is the oldest heritage structure in Pune and was built during the rule\n of the Peshwa dynasty. For visitors, Parvati hill is also an observation point that offers\n a panoramic view of Pune. It is the second highest point\n in Pune (after Vetal Hill). The hill has 108 steps (considered a holy number in Hinduism) \nleading to the top of the hill where the temple is situated. The hill was owned\n by the Patil named Taware. Peshwa purchased the hill to build a temple of Shiva.\n The Devi temple was believed to be of Taware's kulswami whose angara was\n able to cure a leg ailment of Kashibai, mother of Peshwa Balaji Baji Rao.\n Thereafter, the Peshwa built a temple complex there.\r\n"
                + "The main temple, Devdeveshwara, is made of blackstone. It was completed under\n Balaji Baji Rao in 1749, and a gold pinnacle was added\n to the temple in 1760. Other temples are dedicated to Vitthal and Rukmini, Vishnu,\n and Kartikeya");
        insert("Empress Botanical Garden", "Sprawling botanical garden specializing in regional plants,\nwith rare trees, flowers & a kids' area.");
        insert("Dagdusheth temple", "The Dagadusheth Halwai Ganapati temple is a Hindu Temple located\nin Pune and is dedicated to the Hindu god Ganesh. The temple is \nvisited by over hundred thousand pilgrims every year.\r\n"
                + "Shrimant Dagadusheth Halwai and his wife Laxmibai was a trader\nand sweet maker settled in Pune. His original halwai shop still\nexists under the name \"Dagdusheth Halwai Sweets\" near Datta Mandir in Pune.\nEventually he became a successful sweet seller and a rich businessman. In the later 1800s,\nthey lost their only son in a plague epidemic. They were approached by a compassionate sage who\nadvised them to build a Ganesha temple in Pune\r\n"
                + "");
        insert("Aga Khan Palace", "The Aga Khan Palace was built by Sultan Muhammed Shah Aga Khan III in the city of Pune, India.\r\n"
                + "The palace was an act of charity by the spiritual leader of the Nizari Ismaili Muslims,\nwho wanted to help the poor in the neighbouring areas of Pune, who were drastically hit by famine by\noffering them work.The Aga Khan Palace is a majestic building");
        insert("Shaniwarwada", "Shaniwar Wada is a historical fortification in the city of Pune, India.\r\n"
                + "The Shaniwar Wada was normally the seven-story capital building of the\nPeshwas of the Maratha Empire. It was supposed to be made entirely of stone but\nafter the completion of the base floor or the first story, the people of Satara (the national capital)\ncomplained to the Chatrapati Shahu Maharaj(King) saying that a stone monument can be\nsanctioned and built only by the king himself and not the Peshwas.");
        insert("Pune Okayama Friendship Garden", "Pune-Okayama Friendship Garden or Pu La Deshpande Udyan is one of the largest gardens\nin Pune located on Tanaji Malusare road (Sinhgad road) in Pune, Maharashtra, India.\r\n"
                + "The garden was inspired by the 300-year-old Kōraku-en Garden in Okayama,\nso it is also called the Pune-Okayama Friendship Garden. The garden has naturally\nflowing water from a canal, and this flow has been spread across the garden.\nThe garden is well maintained, and walking on the lawn is not allowed. The garden is built on 10 acres.\nThe style is devised in such a way that people can take a walk through a garden enjoying\nthe landscape, which changes along the garden paths.\r\n"
                + "");
        insert("Khadakwasla Dam", "Khadakwasla Dam is a dam on the Mutha River 21 km (13 mi) from the centre of the\ncity of Pune in Maharashtra, India.[1][2] The dam created a reservoir known as Khadakwasla Lake\nwhich is the main source of water for Pune and its suburbs.\r\n"
                + "In the vicinity of Khadakwasla Dam is the National Defence Academy (NDA),\nthe Defence Institute of Advanced Technology (DIAT), the College of Military Engineering, Pune (CME, Dapodi)\nand Central Water and Power Research Station (CWPRS). A few kilometres to the south lies Sinhagad Fort.");
        insert("Science Park", "Pimpri Chinchwad Science Park is one of the latest tourist attraction and activity\nbased Science Centre of Pune region. The Science Centre houses Galleries on different themes\nof Science & Technology, Activity area, Inflatable Taramandal and an Auditorium. It also has a open\nair Science Park spread over 3.5acres. Most of the exhibits in the science centre\nand science park are interactive in nature and visitors can explore science in an entertaining way.\nThe Centre also conducts many Science shows such as 3D Shows, Taramandal Shows and Live Demonstrations\nfor visiting people and student groups. It also organises activity based programmes and\nworkshops for students and teachers.");
        insert("Sinhagad Fort", "Sinhagad is an ancient hill fortress located at around 49 km southwest of the city of Pune, India.\r\n"
                + "Previously known as Kondhana, the fort had been the site of many battles, most notably\nthe Battle of Sinhagad in 1670. It is Located near the Pune district in Maharashtra.\nThe fort is also on the famous fort in Maharashtra which has a great history of Tanaji Malusare.\nThe fort was captured by Tanaji Malusare and his brother. Sinhagad (Lion's Fort) fort was strategically built\nto provide natural protection from the enemies due to its very steep slopes");
        insert("Trampoline Park", "A cutting edge Indoor Amusement Park in Pune to have unparalleled experience of Amusement, Adventure, Fun, Fitness and Sports together. This makes it a ultimate venue for Birthday Parties, School Trips, Corporate Parties and Active Social events. At SkyJumper Trampoline Park, feel like a Superman by jumping off the walls, flying through the air and having fun with family and friends in a playground of over 100+ interconnected, world-class trampolines! The place is suitable for all age groups above 3 Years and has designated kids and adults area.");
    }

}

class Graph{
    //Scanner sc = new Scanner(System.in);
    int pins,lanes;
    /*
     * 0 411011-Shaniwar Wada
     * 1 411006-Aga Khan Palace
     * 2 411002-Dagdusheth temple
     * 3 411007-Trampoline Park
     * 4 411001-Empress Botanical Garden
     * 5 411030-Pune Okayama Friendship Garden
     * 6 411023-Khadakwasla Dam
     * 7 411041-Sinhagad Fort
     * 8 411018-Science Park
     * 9 411009-Parvati Temple
     * */
    int [] pins_arr = {411011,411006,411002,411007,411001,411030,411023,411041,411018,411009};
    static double [][] graph = new double[10][10];
    static int numNodes = 10;
    static double [] distances;
    private static boolean[] visited;

    public static void dijkstra(int source) {
        distances = new double[numNodes];
        visited = new boolean[numNodes];
        for (int i = 0; i < numNodes; i++) {
            distances[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        distances[source] = 0;
        for (int i = 0; i < numNodes - 1; i++) {
            int a = findMinimumDistance();
            visited[a] = true;
            for (int b = 0; b < numNodes; b++) {
                if (!visited[b] && graph[a][b] != 0 && distances[a] != Integer.MAX_VALUE && distances[a] + graph[a][b] < distances[b]) {
                    distances[b] = distances[a] + graph[a][b];
                }
            }
        }
    }

    public static int findMinimumDistance() {
        double min = Double.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < numNodes; i++) {
            if (!visited[i] && distances[i] <= min) {
                min = distances[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    void createAdjMat(){
        graph[6][7] = 15;
        graph[7][6] = 15;
        graph[5][6] = 9.8;
        graph[6][5] = 9.8;
        graph[5][9] = 4.1;
        graph[9][5] = 4.1;
        graph[9][2] = 3.3;
        graph[2][9] = 3.3;
        graph[0][2] = 0.8;
        graph[2][0] = 0.8;
        graph[0][5] = 5.5;
        graph[5][0] = 5.5;
        graph[0][3] = 8.2;
        graph[3][0] = 8.2;
        graph[0][4] = 6.2;
        graph[4][0] = 6.2;
        graph[8][4] = 19;
        graph[4][8] = 19;
        graph[1][4] = 7.1;
        graph[4][1] = 7.1;
        graph[3][4] = 6.5;
        graph[4][3] = 6.5;
        graph[1][8] = 19;
        graph[8][1] = 19;
    }
    void displayAdjMat(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println();
        }
    }

    void dfsAM(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        boolean [] visited = new boolean[10+1];

        int strt = 0;

        System.out.print("Enter start location for Pune darshan tour: ");
        String start = (sc1.nextLine()).toLowerCase();
        switch (start) {
            case "shaniwar wada":
            case "1":
                strt = 0;
                break;
            case "aga khan palace":
            case "2":
                strt = 1;
                break;
            case "dagdusheth temple":
            case "3":
                strt = 2;
                break;
            case "trampoline park":
            case "4":
                strt = 3;
                break;
            case "empress botanical garden":
            case "5":
                strt = 4;
                break;
            case "pune okayama friendship garden":
            case "6":
                strt = 5;
                break;
            case "khadakwasla dam":
            case "7":
                strt = 6;
                break;
            case "sinhagad fort":
            case "8":
                strt = 7;
                break;
            case "science park":
            case "9":
                strt = 8;
                break;
            case "parvati temple":
            case "10":
                strt = 9;
                break;

            default:
                System.out.println("Invalid input!\n");
                return;
        }

        s.push(strt);
        visited[strt] = true;
        while (!s.empty()){
            int a = s.pop();
            System.out.print(" --> ");
            switch(a) {
                case 0:
                    System.out.println("Shaniwar Wada");
                    break;
                case 1:
                    System.out.println("Aga Khan Palace");
                    break;
                case 2:
                    System.out.println("Dagdusheth temple");
                    break;
                case 3:
                    System.out.println("Trampoline Park");
                    break;
                case 4:
                    System.out.println("Empress Botanical Garden");
                    break;
                case 5:
                    System.out.println("Pune Okayama Friendship Garden");
                    break;
                case 6:
                    System.out.println("Khadakwasla Dam");
                    break;
                case 7:
                    System.out.println("Sinhagad Fort");
                    break;
                case 8:
                    System.out.println("Science Park");
                    break;
                case 9:
                    System.out.println("Parvati Temple");
                    break;
                default:
                    System.out.println("Invalid input!");
            }

            for (int i=0;i<=9;i++){
                if(graph[a][i]!=0 && !visited[i]){
                    s.push(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Graph g = new Graph();
        String ch=null;
        g.createAdjMat();

        String[] places = new String[10];
        places[0] = "shaniwar wada";
        places[1] = "aga khan palace";
        places[2] = "dagdusheth temple";
        places[3] = "trampoline park";
        places[4] = "empress botanical garden";
        places[5] = "pune okayama friendship garden";
        places[6] = "khadakwasla dam";
        places[7] = "sinhagad fort";
        places[8] = "science park";
        places[9] = "parvati temple";

        do{
            System.out.println(" _   _              _          ______                    \n" +
                    "| | | |            (_)         | ___ \\                   \n" +
                    "| | | | _ __   ____ _  _ __    | |_/ /_   _  _ __    ___ \n" +
                    "| | | || '_ \\ |_  /| || '_ \\   |  __/| | | || '_ \\  / _ \\\n" +
                    "| |_| || | | | / / | || |_) |  | |   | |_| || | | ||  __/\n" +
                    " \\___/ |_| |_|/___||_|| .__/   \\_|    \\__,_||_| |_| \\___|\n" +
                    "                      | |                                \n" +
                    "                      |_|                                ");
            System.out.println("0  Exit");
            System.out.println("1. Get the distance between tourist spots in Pune: ");
            System.out.println("2. Pune darshan tour plan");
            System.out.println("3. View Top Rated Places in Pune");

            System.out.print("Enter your choice: ");
            ch=sc.nextLine();

            if(ch.equals("1") ||ch.equals("2")  ||ch.equals("3") ) {
                System.out.println("\n1 Shaniwar Wada");
                System.out.println("2 Aga Khan Palace");
                System.out.println("3 Dagdusheth Temple");
                System.out.println("4 Trampoline Park");
                System.out.println("5 Empress Botanical Garden");
                System.out.println("6 Pune Okayama Friendship Garden");
                System.out.println("7 Khadakwasla Dam");
                System.out.println("8 Sinhagad Fort");
                System.out.println("9 Science Park");
                System.out.println("10 Parvati Temple\n");
            }

            switch (ch){
                case "0":
                    System.out.println("\nTERMINATING THE PROGRAM...");
                    System.exit(0);
                case "1":

                    String source;
                    String destination;
                    int invalid = 0 ;
                    int source_location = -999;
                    int dest_location = -999;

                    System.out.print("Enter the source location: ");
                    source = sc2.nextLine();
                    System.out.print("Enter the destination: ");
                    destination = sc3.nextLine();

                    if(source.equalsIgnoreCase(destination)) {
                        System.out.println("You entered same source and destination!\n");
                        continue;
                    }

                    for(int i  = 0 ; i<places.length; i++) {
                        if(source.equalsIgnoreCase(places[i])) {
                            source_location = i;
                        }
                        if(destination.equalsIgnoreCase(places[i])) {
                            dest_location = i;
                        }
                    }
                    if(source_location == -999 || dest_location == -999 ) {
                        try {
                            if(source_location == -999) {
                                source_location = Integer.parseInt(source)-1;invalid = 0;
                            }
                            if(dest_location == -999) {
                                dest_location = Integer.parseInt(destination)-1;invalid = 0;
                            }
                            invalid = 0;
                        }
                        catch(NumberFormatException e) {
                            System.out.println("Invalid input!!\n");
                            invalid = 1;
                        }

                    }
                    if((source_location < 0 && source_location != -999) || (dest_location < 0 && dest_location != -999) || source_location >=10  || dest_location >= 10) {
                        invalid = 1;
                        System.out.println("Invalid input!!\n");
                    }

                    if(invalid == 1) {
                        break;
                    }

                    if(invalid==0) {
                        g.dijkstra(source_location);
                        System.out.printf("Shortest distance from %s to %s is %.2f km",source.toUpperCase(),destination.toUpperCase(),g.distances[dest_location]);
                        System.out.println("\n");}
                    break;

                case "2":
                    g.dfsAM();
                    System.out.println();
                    break;

                case "3":
                    int src = -1;
                    int inv = 0;
                    String place;
                    do {
                        Scanner sc4 = new Scanner(System.in);
                        System.out.print("Enter the place name you want to get information: ");
                        place = sc4.nextLine();

                        for(int i  = 0 ; i<places.length; i++) {
                            if(place.equalsIgnoreCase(places[i])) {
                                src = i; inv = 0;
                            }
                        }
                        if(src == -1) {
                            try {
                                src = Integer.parseInt(place)-1;
                                inv = 0;
                                break;
                            }
                            catch(NumberFormatException e) {
                                inv = 1;
                            }
                            System.out.println("Invalid input\nPlease enter location again...\n");

                        }
                    }while(inv == 1);

                    InfoGuide B = new InfoGuide();
                    B.addPlcae();
                    if(B.Search(places[src], B) != null) {
                        System.out.println( B.Search(places[src], B));}
                    else {
                        System.out.println("Invalid input..");
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid input!");
            }
        }while (ch!="0");
    }
}
