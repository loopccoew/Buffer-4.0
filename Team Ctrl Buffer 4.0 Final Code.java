//SAMPLE CODE:
package Buffer;

import java.util.*;
//public class AL

public class Main {
	

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("-------------------------------------------------Welcome to ClubGenie!!-------------------------------------------------------------------");
	System.out.println("Discover clubs of your Choice");
	
	do{
	System.out.println("Please select the desired option from following: \n1.Club Names \n2.Personalize Club suggestions \n3.Events \n0.Exit");
	System.out.println("Enter your desired choice: ");
	int choice=sc.nextInt();
	switch(choice){
	
	case 0:
	System.out.println("Thank you!!\nRegards TEAM CLUBGENIE");
	System.exit(0);
	break;

	case 1:
		System.out.println("\nClub Names: \n1.Aaveg \n2.Adira \n3.AICVS \n4.Bharadwaj" + "\n5.Code Club \n6.Debate \n7.E-Cell YUKTA \n8.FiSOC" 
				+ "\n9.GDSC \n10.Insia \n11.Kalwant \n12.Loop" + "\n13.Math Club \n14.Mozilla Club \n15.Vinidra \n16.Zenith");
				System.out.println("Enter the club number for more information:");
				int c=sc.nextInt();
	ClubNames(c);
	break;
	
	case 2:
		int[] ch= new int[16];
		System.out.println("Welcome to Personalised section!!!");
		sc.nextLine();
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		System.out.println("Enter your Current Year in college:(1/2/3/4) ");//current year
		int yr = sc.nextInt();
		if (yr > 4 || yr < 0) 
		{
			System.err.println("Invalid Input. Final Year date incorrect. Please Restart");
			System.exit(0);
		}
		sc.nextLine();
		System.out.println("Enter\tFor\nCE\tComputer Engineering\n"
							+ "EC\tElectronics And Telecommunications\n"
							+ "IT\tInformation Technology\n"		
							+ "ME\tMechanical Engineering\n"
							+ "IC\tInstrumentation and Control\nYour Branch Name: ");
		String br = sc.nextLine();

		String cat[]= {"Robotics","E-vehicles","Artificial Intelligence","Avionics",
				"Coding","Public Speaking","Entrepreneurship","Finance","Dance",
				"Maths","Satellite","ATV"};
		

		System.out.println("Do You Like Hands on Projects: ");
		System.err.println("Enter y/n");
		if((sc.nextLine().equalsIgnoreCase("Y")))
				{
					ch[0]+=3;
					ch[1]+=3;
					ch[5]+=3;
					ch[6]+=3;
					ch[13]+=3;
				}
		

		System.out.println("Can you say that you are technology oriented: ");
		System.err.println("Enter y/n");
		if((sc.nextLine().equalsIgnoreCase("Y")))
				{
					ch[2]+=3;
					ch[3]+=3;
					ch[4]+=3;
					ch[10]+=3;
					ch[12]+=3;
				}
		

		System.out.println("Do You Like Performance Skills: ");
		System.err.println("Enter y/n");
		if((sc.nextLine().equalsIgnoreCase("Y")))
				{
					ch[7]+=3;
					ch[9]+=3;
					ch[15]+=3;
				}

		for(int i=0;i<cat.length;i++)
		{ 
		// "Technical Skills"
		// "Finances And Real World Topics"
		// "Creative and Speaking skills Skills"
		System.out.println("Enter the type of characteristics you want in a club and we will help you find it\n\n\n");
		System.out.println("Interest in "+cat[i]);
		
		System.err.println(
				"Select the level of liking from 1 to 5.\nRemember higher the number more preference is give to the Characteristic .");
		int choose=sc.nextInt();
		sc.nextLine();
		if(choose>=3)
		{
			switch(i+1)
			{
			case 1://robotics
				ch[13]+=choose;
				break;			

			case 2://e-vehicle
				ch[5]+=choose;
				break;			
				
			case 3://AI
				ch[10]+=choose;
				break;			
				
			case 4://Avionics
				ch[6]+=choose;
				break;
							
			case 5://Coding
				ch[2]+=choose;
				ch[3]+=choose;
				ch[4]+=choose;
				ch[10]+=choose;
				ch[12]+=choose;
				break;	
				

			case 6://Public Speaking
				ch[15]+=choose;
				ch[9]+=choose;
				break;			
				
			case 7://Entrepreneurship
				ch[14]+=choose;
				break;			
				
			case 8://finance
				ch[11]+=choose;
				break;
							
			case 9://dance
				ch[7]+=choose;
				break;	
				
			case 10://maths
				ch[8]+=choose;
				break;			
				
			case 11://satellites
				ch[0]+=choose;
				break;			
				
			case 12://atv
				ch[1]+=choose;
				break;
			}}
			else
			{
			switch(i+1)
			{
			case 1://robotics
				ch[13]=  (ch[13]-(5-choose));
				break;			

			case 2://e-vehicle
				ch[5]=  (ch[5]-(5-choose));
				break;			
				
			case 3://AI
				ch[10]=  (ch[10]-(5-choose));
				break;			
				
			case 4://Avionics
				ch[6]=  (ch[6]-(5-choose));
				break;
							
			case 5://Coding
				ch[2]=  (ch[2]-(5-choose));
				ch[3]=  (ch[3]-(5-choose));
				ch[4]=  (ch[4]-(5-choose));
				ch[10]=  (ch[10]-(5-choose));
				ch[12]=  (ch[12]-(5-choose));
				break;	
				

			case 6://Public Speaking
				ch[15]=  (ch[15]-(5-choose));
				ch[9]=  (ch[9]-(5-choose));
				break;			
				
			case 7://Entrepreneurship
				ch[14]=  (ch[14]-(5-choose));
				break;			
				
			case 8://finance
				ch[11]=  (ch[11]-(5-choose));
				break;
							
			case 9://dance
				ch[7]=  (ch[7]-(5-choose));
				break;	
				
			case 10://maths
				ch[8]=  (ch[8]-(5-choose));
				break;			
				
			case 11://satellites
				ch[0]=  (ch[0]-(5-choose));
				break;			
				
			case 12://atv
				ch[1]=  (ch[1]-(5-choose));
				break;
			}
			}
		}
	

		if(yr==1)
		{
			ch[4]*=-1;
			ch[2]*=-1;
			ch[9]*=-1;
			ch[12]*=-1;;
		}
		String list[][]= {{ "Vinidra(Satellite Team)", "Team Zenith", "GDSC", "Mozilla Club", "Team Loop",
					"Team Adira", "Team Bharadwaj", "Insia", "Math Club", "Kalawant", "AICVS", "FISOC", "Code Club",
					"Team Aaveg", "E-cell Yukta", "Debate Club" },
				{"0","0","0","0",
						"0","0","0","0",
						"0","0","0","0",
						"0","0","0","0"}};

		for(int i=0;i<16;i++)
		{
		list[1][i]=String.valueOf(ch[i]);
		}
		int n=ch.length;
		for(int i=0;i<n-1;i++)
		{
			int max_idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(Integer.parseInt(list[1][j])>Integer.parseInt(list[1][max_idx]))
					max_idx=j;				
				
				for(int k=0;k<2;k++)
				{
				String temp=list[k][max_idx];
				list[k][max_idx]=list[k][i];
				list[k][i]=temp;
				}
			}
		}
		System.out.println("Dear "+name+"\nThe Clubs most Suited to you are:");
		for(int i=0;i<5;i++)
		{
			System.out.println((i+1)+" "+list[0][i]);
		}
		System.out.println("For More Information On the Clubs visit the Menu.");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________");

	break;

	case 3:
		System.out.println("Enter 1 to get a look at the Past Events and 2 for Upcoming Events");
		int num=sc.nextInt();
	Events(num);
	break;

	default:
	System.out.println("\n\nYOU ENTERED THE WRONG CHOICE!!!!");
	}

	}while(true);
	}

	public static void ClubNames(int c)
	{
		ArrayList<String> al=new ArrayList<String>();
	
	al.add("WHAT IS TEAM AAVEG?\r\n"
			+ "\r\n"
			+ "A team of women deeply passionate about robotics and resolute to make a mark in the field of robotics. The team was formed\n "
			+ "in the year 2012. We participate in the ABU Robocon competition every year and our AIR has been consistently increasing \n"
			+ "(AIR 13 / 80 teams: 2022 ).\r\n"
			+ "CONTACT INFO:\n robocon@cumminscollege.in \n3916_Prerana Ghorpade- prerana.ghorpade@cumminscollege.in\r\n"
			+ "1742_SUPRADA MAHADIK- suprada.mahadik@cumminscollege.in");
	
	al.add("Team Adira presents you with the college’s first ever Electric Student Style Racing Vehicle. \r\n"
			+ "After landing an absolutely stunning podium finish and qualifying the Class 1 combustion category of Formula Bharat 2022-23, \n"
			+ "the one and only student formula team in Cummins college and also the only all-girls team in Asia.\r\n"
			+ "For Recruitment prepare for the following topics:\r\n"
			+ "1)General:\r\n"
			+ "About Formula Bharat\r\n"
			+ "2)Team Work\r\n"
			+ "3)HR\r\n"
			+ "4)Suspension:\r\n"
			+ "*Kinematics\r\n"
			+ "*Mechanics\r\n"
			+ "*Spring Damper Systems\r\n"
			+ "*Finite Element analysis\r\n"
			+ "*Suspension Geometries\r\n"
			+ "*Free Body Diagram\r\n"
			+ "5)Steering:\r\n"
			+ "*Steering mechanisms\r\n"
			+ "*Ackerman geometry\r\n"
			+ "*Steering Geometry (Caster,Camber,Toe-In & Out, KPI,Ackerman etc)\r\n"
			+ "*Types of joints used in Steering system\r\n"
			+ "*Rotational Mechanics\r\n"
			+ "6)Low Voltage Systems:\r\n"
			+ "*Mesh analysis problems\r\n"
			+ "*Basic electronic components(transistors, op amp, bjt)\r\n"
			+ "*Sensors and Actuators basic difference\r\n"
			+ "*Power electronics ( AC, DC current)\r\n"
			+ "*Microcontrollers\r\n"
			+ "\nCONTACT INFO\r\n"
			+ "TeamAdira Formula \r\n"
			+ "teamadira.formula@cumminscollege.in\r\n"
			+ "Pranjal Chouhan: pranjal.chouhan@cumminscollege.in\r\n"
			+ "Vismaya Mulay: vismaya.mulay@cumminscollege.in\r\n"
			+ "");
	al.add("Artificial Intelligence and Computer Vision Society\r\n"
			+ "We as a club aim to introduce the students to techniques of AI and Computer Vision.\n"
			+ "We aim to equip them with a primary skill set in Deep Learning and the knowledge to implement various algorithms and gain a good\n"
			+ "understanding of what happens behind the scenes. We aim to spread awareness about AI/ML and computer vision through workshops,\n"
			+ "seminars,guest lectures and competitions.\r\n"
			+ "\r\n"
			+ "Coordinator: Piyusha Nair Email: piyusha.nair@cumminscollege.in\r\n"
			+ "Club Email id: aicvs.cummins@cumminscollege.in \n"
			+ "Instagram : https://www.instagram.com/aicvs/?hl=en");
	al.add("Aeromodelling Club: Team Aero Bharadwaj! \r\n"
			+ "\r\n"
			+ "We are a group of dedicated aeronautical/aerospace enthusiasts who conceive, design/model, fabricate and pilot fixed wing RC aircrafts \n"
			+ "in competitions across India such as the Society of Automotive Engineers (SAE) Aero Design Challenge (ADC, now known as DDC). \r\n"
			+ "Along with this, we also participate in various Drone Design and Ideation Competitions, such as the BIT SMART DRONE DESIGN Competition, \n"
			+ "MIT UDAAN DRONE Ideation, etc. \r\n"
			+ "\r\n"
			+ "We believe that our Ranks speak for us; and surely we have managed to create unbeatable records:\r\n"
			+ "\r\n"
			+ "2019 - AIR 6 - Micro Class Overall \r\n"
			+ "2020 - AIR 3 - Regular Class Overall \r\n"
			+ "2021 - AIR 1 - Regular Class Best Technical Presentation \r\n"
			+ "2021 - AIR 1 - BIT TechFest SmartDrone\r\n"
			+ "2022 - AIR 9 - Micro Class Overall \n"
			+ "\nFor more info, Contact: \r\n"
			+ "Captain - Krishna Chavan - +917020532698 \n"
			+ "Instagram : https://instagram.com/teambharadwaj?igshid=YmMyMTA2M2Y= ");
	
	al.add("The Code Club /r/n"
			+ "We are a college club open to students of all branches with the aim of improving your coding skills and enhancing the culture \n"
			+ "of competitive coding. We provide a dynamic platform to learn, innovate and interact with your seniors to learn from their experiences.\r\n"
			+ "Code Club is a one-stop solution for all your dynamic coding needs \n"
			+"Contact Info :Coordinator– Ishwari Patil Email: ishwari.patil@cumminscollege.in\r\n"
			+ "Club Email id: codeclub@cumminscollege.in \n"
			+ "Our Social Media \nInstagram\r\n"
			+ "https://www.instagram.com/codeclub_ccew/?utm_medium=copy_link\r\n"
			+ "Telegram:\r\n"
			+ "https://t.me/joinchat/401VWhGgbGMxYTRl\r\n"
			+ "LinkedIn:\r\n"
			+ "https://www.linkedin.com/company/code-club-ccew");
	
	al.add("WHY DEBATE CLUB ?\r\n"
			+ "~Improve oratory skills\r\n"
			+ "~Share healthy opinions\r\n"
			+ "~Boosts confidence\r\n"
			+ "~Motivation to research and learn\r\n"
			+ "~Team bonding and collaboration\r\n"
			+"AIM OF THE CLUB\r\n"
			+ "At the very least, debate helps learners to "
			+ "see the power of deploying rational,\r\n"
			+ "reasoned arguments and compelling "
			+ "evidence in action.\r\n"
			+ "The debating society thus promotes the art "
			+ "of debating, researching, interacting and\r\n"
			+ "articulating one's thoughts and beliefs. "
			+ "Thus, instilling skills such as public\r\n"
			+ "speaking, team spirit and creative thinking\r\n"
			+ "\nContact Info: \nSaumya Thakur:"
			+ "8668756785\r\n"
			+ "Anushka Ghodekar:"
			+ "7559207190\r\n"
			+ "Social media handles-\r\n"
			+ "Instagram:\r\n"
			+ "https://www.instagram.com/ccoew_debating_society/\r\n"
			+ "LinkedIn:\r\n"
			+ "https://www.linkedin.com/company/the-debating-society-ccoew/\r\n");
	
	al.add("We Assist. We Innovate. We Inspire.\r\n"
			+ "E-Cell Yukta is a Non-Profit Organization run by the students of MKSSS's Cummins College of Engineering, Pune. \n"
			+ "Our organisation is dedicated to build entrepreneurial vision and instinct in women engineers. We create awareness among the students about \n"
			+ "Entrepreneurship through our various activities and programs like podcasts, E-summits, speaker sessions, workshops, competitions and may \n"
			+ "other such events.\r\n"
			+ "E-Cell Yukta began in August, 2018 and has flourished since then in its activities and various programs, inviting renowned guests to grace \n"
			+ "the occasions and events. We support and encourage all the budding and upcoming Entrepreneurs by providing them necessary guidance and \n"
			+ "resources like mentors,consultancy,funds and networking with elite and renowned CEOs .\r\n"
			+ "Every year, during our Annual Technical Fest, INNOVATION, we organize events like Business Idea Competition along with cash prizes and \n"
			+ "mentoring under esteemed judges and founders who provide assistance as well as funds to the selected few for their business ideas and startups. \n"
			+ "Contact Info:\r\n"
			+ "E-Cell's Profile\r\n"
			+ "linkedin.com/in/ecellyukta\r\n"
			+ "Website\r\n"
			+ "instagram.com/ecell_yukta?igshid=lpv4z77jowlx \n");
	al.add("Finance and Economics Club\r\n"
			+ "The Finance and Economics Club (FiSOC) provides a platform for ardent students to come together to learn the intriguing world of \n"
			+ "finance and economics through seminars/webinars with industry experts and organizing debates and discussions to explore career \n"
			+ "opportunities in the financial sector.\r\n"
			+ "\r\n"
			+ "Coordinator- Snigdha Srivastava Email: snigdha.srivastava@cumminscollege.in\r\n"
			+ "Club Email id- fisoc@cumminscollege.in \n");
	al.add("GDSC CCOEW is a university-based developers club, supported by Google. We at GDSC, organize and curate events spread across the \n"
			+ "entire academic calendar, foster a sense of creativity, and aim to inspire young developers with like minds to collaborate, \n"
	 		+ "help each other, and grow to their fullest potential. Prospering and sharing Knowledge and technology through peer-to-peer \n"
			+ "learning has endowed and encouraged many to become exceptional developers by pulling out the best in them. Our team welcomes \n"
			+ "you to join the ecosystem which propagates learning and teaching synergistically.\r\n"
			+ "\r\n"
			+ "Coordinator- Ruchika Suryawanshi Email: ruchika.suryawanshi@cumminscollege.in\r\n"
			+ "Club Email id- developerstudentclub@cumminscollege.in \n"
			+ "Instagram : https://instagram.com/gdsc_cummins?igshid=YmMyMTA2M2Y= \n");
	al.add("Dance Club- Insia\r\n"
			+ "Dance Club -Take more chances. Dance more dances! Come and be a part of the Cummins Dance Club and learn different dance forms. \n"
			+ "You might get chance to participate in various events.\r\n"
			+ "\r\n"
			+ "Coordinator-Ayushi Varshney \n"
			+ "ayushi.varshney@cumminscollege.in \n"
			+ "Instagram : https://instagram.com/insia_cummins?igshid=YmMyMTA2M2Y= \n");
	al.add("Cultural Club- Kalawant\r\n"
			+ "Kalawant is the Cultural Club of Cummins College of Engineering which has brought glory to the college, time and again owing to \n"
			+ "its amazing legacy. A platform that encourages, educates and guides enthusiasts to participate in vivid theatrical competitions, \n"
			+ "fine arts performing arts.\r\n"
			+ "\r\n"
			+ "Coordinator- Aakanksha Panhale,  Maitreyi Mhaiskar\r\n"
			+ "Email: aakanksha.panhale@cumminscollege.in,  maitreyi.mhaiskar@cumminscollege.in\r\n"
			+ "Club Email id- kalawant@cumminscollege.in \n");
	
	al.add("Team Loop is a Coding Club with the primary motive of creating awareness about the various Data Structures and Algorithms. \n"
			+ "We conduct activities such as hosting Coding contests, volunteering sessions, and group discussions, for all years of our College.\n"
			+ " We also promote application-based learning of fundamental concepts by creating utility or game-based projects.\n"
			+ "Events \r\n"
			+ "~10 days of DSA\r\n"
			+ "~Buffer\r\n"
			+ "~Codigo\r\n"
			+ "~Getting started with DSA and CP\r\n"
			+ "~Cipher\r\n"
			+ "~DSA bulletins\r\n"
			+ "\r\n"
			+ "Available posts:\r\n"
			+ "Head Coordinator\r\n"
			+ "Joint Head Coordinator\r\n"
			+ "Technical Head\r\n"
			+ "Outreach Representative\r\n"
			+ "Organizers\r\n"
			+ "\r\n"
			+ "Plateform handles\r\n"
			+ "Telegram\r\n"
			+ "https://www.google.com/url?q=https://t.me/%2BseiovgBvaadjNDll&source=gmail&ust=1681211668965000&usg=AOvVaw2aunVrBZEqSzrlAFwyHkfR\r\n"
			+ "Instagram\r\n"
			+ "https://instagram.com/loopccew?igshid=YmMyMTA2M2Y=\r\n"
			+ "Linkedin\r\n"
			+ "https://www.linkedin.com/company/loopccew/ \n");
	
	al.add(" Math Club\r\n"
			+ "The Math Club is a student’s club with an aim to empower students with mathematics and to help students explore and celebrate \n"
			+ "the world of mathematics by conducting various fun and engaging activities. It is a platform to provide opportunities for \n"
			+ "everyone to showcase, share and improve their mathematical skills.\r\n"
			+ "\r\n"
			+ "Coordinator– Vidhi Vaswani  Email: vidhi.vaswani@cumminscollege.in\r\n"
			+ "Club Email id– math.club@cumminscollege.in \n");
	al.add("Mozilla Campus Club is a club dedicated to Open source development and community building. It is a club works to spread awareness \n"
			+ "on Open Source software. Mozilla Campus Club gives an opportunity to join the awesome world of open source where students \n"
			+ "have many opportunities to learn and grow in various fields, be it technical or non-technical.\r\n"
			+ "CONTACT INFO:\r\n"
			+ "Head co-ordinator: Krushna Girnar Email: krushna.girnar@cumminscollege.in\r\n"
			+ "Joint head co-ordinator: Gaurika Gupta Email: gaurika.gupta@cumminscollege.in\r\n"
			+ "Club Email id– mozilla_club@cumminscollege.in \n"
			+ "Instagram : https://instagram.com/moz_cummins?igshid=YmMyMTA2M2Y= \n");
	al.add("What is a satellite team? Our aim is to design, build and launch our own satellite, in collaboration with ISRO. \n"
			+ "We are a more research-oriented team, with subsystems needing talent from across the student body. \n"
			+ "If you are someone who is excited about space and its secrets, Vinidra is the right platform for you!\r\n"
			+ "\nContact us at: satellite@cumminscollege.in \n"
			+ "Instagram : https://www.instagram.com/teamvinidra/ \n"
			+ "LinkedIn : https://www.linkedin.com/company/vinidra-ccew/");
	al.add("Team Zenith is the official BAJA SAE team of MKSSS's Cummins College of Engineering for Women.   \r\n"
			+ "\r\n"
			+ "SAE BAJA challenges us to design, fabricate, test and race an off-road vehicle, helping us simulate a real-world engineering \n"
			+ "design project and its corresponding challenges by giving us a hands-on approach to engineering. \n"
			+ "\nCONTACT INFO:\n Email:teamzenith.baja@cumminscollege.in\n"
			+ "Instagram :https://instagram.com/team_zenith_baja?igshid=YmMyMTA2M2Y= \n"
			+ "Youtube : https://www.youtube.com/channel/UCN29VMw7SW3HCU1XfQ-9c8w \n");
	
	if(c>0&&c<=al.size())
	{
	System.out.println("_____________________________________________________________________________________________________________________________________________________________________");
	System.out.println(al.get(c-1));
	System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
	}
	else
	{
		System.out.println("YOU HAVE ENTERED WRONG CHOICE!");
	}
	}
	
	public static void Events(int num)
	{
		ArrayList<String> past=new ArrayList<String>();
		ArrayList<String> future=new ArrayList<String>();
		//Taking 10 March as the reference date for deciding past and future events
		future.add("AICVS- \n"
				+ "Game Based Learning Approach To AI \r\n"
				+ "Date: 27th March 2023\r\n"
				+ "AICVS brings to you an engaging and effective session by our speaker Dr.Minakshi Atre to promote an excellent way to learn AI concepts with\r\n"
				+ "a game-based approach to get a deeper understanding of the subject matter.\r\n"
				+ "");
		past.add("AICVS- \n"
				+ "Visionics \r\n"
				+ "AICVS is inviting you to participate in our poster making competition: \"Visionics\" where you can showcase your innovative ideas and win incredible prizes.\r\n"
				+ "This is your chance to have your work seen by a panel of experts and take your creativity to the next level.\r\n"
				+ "The topics for the ideas can vary from Artificial Intelligence & Machine Learning to Data Science, Computer Vision, Deep Learning.\r\n"
				+ "The event will be conducted on the first day of Innovation.You can prepare your posters and present it in front of the panel on 17th February,2023. \r\n"
				+ "");
		past.add("AICVS- \n"
				+ "Demystifying AI\r\n"
				+ "AICVS is back with some exciting things lined up for you guys.\r\n"
				+ "From this week we are starting \"Demystifying AI\" as a fun-and-learn quiz.\r\n"
				+ "Tired of reading articles and surfing google for hours??\r\n"
				+ "We are here to help you clear your basics right from scratch with visuals!!\r\n"
				+ "Yes, you guessed it right!!\r\n"
				+ "We will be posting a video for your learning reference and you can brush up on your topics by giving a quiz.\r\n"
				+ "We will be announcing the winners at the End of the Week.\n ");
		future.add("Code club-\r\n"
				+ "Ideathon\r\n"
				+ "You have to pitch the implementation process; the how's and what's and leave the execution for another day.\r\n"
				+ "As a newbie this means no worries about the complexity of coding and for the skilled coders out there it's the perfect chance to find project ideas!\r\n"
				+ "Take up this opportunity to think of something new and exciting while perfecting your presentation and pitching skills.\r\n"
				+ "18th -19th March\n");
		past.add("Code club- \r\n"
				+ "DSA Weekly Test Series\r\n"
				+ "Each test is a blend of 5-6 MCQs and 2-3 coding questions that will have to be solved in 60-75 minutes.\r\n"
				+ "Every week a new topic will be covered in the test. The topics and timeline are shared in the attachment below.\r\n"
				+ "Attempting these meticulously curated tests will not only give you the opportunity to gauge your strengths and\r\n"
				+ "weaknesses, but also the essence of time-bound coding and a chance to analyse where you stand amongst your peers. \r\n"
				+ "12 February 2023( Sunday)\n");
		past.add("Code club- \r\n"
				+ "CounselConnect \r\n"
				+ "A Mentorship Program that aims to make every student,\r\n"
				+ "a successful individual!\r\n"
				+ "In this program:\r\n"
				+ "Mentees will be matched with amazing mentors having impressive achievements\r\n"
				+ "Mentors will aid students in growth and development in chosen field of interest\r\n"
				+ "14th January 2023\r\n"
				+ "");
		future.add("Debate club-\r\n"
				+ "AAP KI ADAALAT\r\n"
				+ "After a maximum of two elimination rounds, a total of eight teams\r\n"
				+ "will be selected for the event, with two teams chosen from each\r\n"
				+ "year.\r\n"
				+ "Date: 5th april\r\n"
				+ "");
		past.add("Debate club-\r\n"
				+ "Inter-department Debate competition, GOONJ'22\r\n"
				+ "Date:18 and 19 november,2022\r\n"
				+ "");
		future.add("E-cell YUKTA-\r\n"
				+ "EMPULSE 2023\r\n"
				+ "Empulse, a two-day entrepreneurial fest packed with exciting events and opportunities to explore the world of startups and innovation.\r\n"
				+ "The event will take place on 21st and 22nd of April, where you can showcase your entrepreneurial skills,\r\n"
				+ "meet like-minded individuals and learn from some of the most experienced minds in the industry.\r\n"
				+ "Empulse features a variety of events that cater to all interests and skill sets. \r\n"
				+ "The Business Hackathon is perfect for those who love to create, ideate and innovate.\r\n"
				+ "The Startup Expo provides a platform for entrepreneurs to showcase their startups to a vast audience. \r\n"
				+ "ECell Wars is where you can engage in the ultimate entrepreneurial showdown with exciting competitions with the E-Cell teams from different colleges.\r\n"
				+ "");
		future.add("FiSOC-\r\n"
				+ "Discussion - Investments 2.0\r\n"
				+ "Investing is an essential part of financial planning, and it helps us reach our long-term financial goals. \r\n"
				+ "However, it can be a daunting task for those new to the investing world. \r\n"
				+ "This discussion aims to help you understand the basics of investing and make informed decisions.\r\n"
				+ "The questions we will cover are:\r\n"
				+ "How do we start investing? How much should we invest and when?\r\n"
				+ "What are the risks involved?\r\n"
				+ "What is a fund?\r\n"
				+ "What does an ideal investment portfolio look like?\r\n"
				+ "If you are someone who is just beginning their investment journey, this is an excellent opportunity to share your views and learn something new. \r\n"
				+ "We really hope to see you there!\r\n"
				+ "Date: 15th Mar (Wednesday)\n");
		past.add("GDSC-\r\n"
				+ "DSA Sprint\r\n"
				+ "Our first week will be dedicated to the very first and very important topics:\r\n"
				+ "1.Basic Maths\r\n"
				+ "2.Time Complexity \r\n"
				+ "3.Space Complexity\r\n"
				+ "4.Arrays.\r\n"
				+ "Date- Feb 20, 2023\n");
		past.add("GDSC-\n"
				+ "Google Solution Challenge 2023\r\n"
				+ "It will be a very exciting and informative session where students can get to know the process for participating in this solution challenge \r\n"
				+ "and can interact with our speaker!\r\n"
				+ "Date- 1st Feb 2023\n");
		future.add("INSIA-\r\n"
				+ "Flashmob for Gandhaar-6 April 2023\r\n"
				+ "");
		past.add("INSIA-\n"
				+ "Flashmob for Freshers-20 Dec 2022\r\n"
				+ "");
		future.add("Kalawant-\r\n"
				+ "Kalawant play in Gandhar-Charane\r\n"
				+ "Date: 06/04/2023\r\n"
				+ "");
		future.add("Kalawant-\n"
				+ "Kalawant Art Exhibition\r\n"
				+ "Date : 17/3/23\n");
		future.add("Loop-\r\n"
				+ "Codigo 1.2\r\n"
				+ "This coding contest is going to be a 1-day event consisting of three rounds and students of first, second, and third years can participate.\r\n"
				+ "MCQ Round - Online\r\n"
				+ "Coding Round - Offline\r\n"
				+ "Interview (non-technical) - Offline\r\n"
				+ "Date: 22nd April 2023\n");
		future.add("Loop-\n"
				+ "Cipher 5.2\r\n"
				+ "It will be an online coding contest having individual participation and it will be conducted on HackerRank platform. \r\n"
				+ "The students from First, Second and Third Years can participate.\r\n"
				+ "Friday, 14th April 2023 from 6pm to 8pm\r\n"
				+ "");
		future.add("Loop-\n"
				+ "10 days of DSA\r\n"
				+ "We know that attending our lectures daily leaves us with little time to consistently practice our coding. \r\n"
				+ "We at Loop believe that the key to master coding is consistency. So, here we are with an activity to get you into the habit of coding!\r\n"
				+ "We are introducing to you 10 days of DSA!!\r\n"
				+ "In this activity, We will be sharing in-depth information from brute force to the most optimized solution for 1 question based on a DSA Concept daily (Till 30th March).\r\n"
				+ "Starting from 20th March, 2023 onwards\n");
		past.add("Loop-\n"
				+ "Buffer 4.0\r\n"
				+ "Buffer is a Data Structures and Algorithms Project series, in which students can participate as mentees in teams of 3-4 people. \r\n"
				+ "Collaboration with peers from other branches is encouraged. (A team can have teammates of the same year) \r\n"
				+ "All teams will be allotted with mentors to guide you throughout the competition.\r\n"
				+ "The projects will be judged on the basis of impressive use of data structures and its real-life application. \r\n"
				+ "An aesthetic UI will be appreciated, but remember, this competition is about DSA. \r\n"
				+ "This year the themes on which students can create a project are-\r\n"
				+ "1.Healthcare\r\n"
				+ "2.Digital Society\r\n"
				+ "3.Open Innovation\r\n"
				+ "4.Custom data structure to store data\n");
		past.add("Loop-\n"
				+ "DSA Sheet January\r\n"
				+ "DSA Sheet February\n");
		future.add("Loop-\n"
				+ "DSA Sheet March\r\n"
				+ "DSA Sheet April\n");
		past.add("Math Club-\r\n"
				+ "Logic Quest\r\n"
				+ "Mathematical treasure hunt to rattle your brain and bring out your inner Ramanujan. This is open to all branches and years.\r\n"
				+ "Date- 17th Feb\r\n"
				+ "");
		past.add("Math Club-\n"
				+ "MATH CLUB'S ARTICLE WRITING COMPETITION\r\n"
				+ "Theme- \"Mathematics in Technology\"\r\n"
				+ "Every week, the best article would be chosen out of all the submissions, and the winner would be awarded a certificate. \r\n"
				+ "The best piece from all the weeks would also be posted on LinkedIn and our campus notice board at the conclusion of this competition.\r\n"
				+ "");
		future.add("Mozilla club-\r\n"
				+ "Spring of Code\r\n"
				+ "Spring Of Code is 10-day hacktoberfest like event that aims to bring awareness about open-source contributions. \r\n"
				+ "This event is for everyone and every branch. You need not to know only technical skills to contribute as we encourage non-technical contributions as well, \r\n"
				+ "so FYs don’t hesitate to participate,we have taken care of you all!\r\n"
				+ "Attempting this Spring Of Code will give you hands on experience of how you can do open source contributions and will definitely be \r\n"
				+ "helpful for your future hacktoberfest participations!So pull up your socks and get ready to do more and more pull requests!\r\n"
				+ "Participants who will be able to merge 4 pull requests will be awarded with certificates.Rulebook about rules to be followed during the event will be shared soon.\r\n"
				+ "Date:20th to 31st March\n");
		past.add("Mozilla Club-\n"
				+ "Code 101: Unlocking the Open-Source World\r\n"
				+ "As the name suggests, this event is planned so that you get to know all about open source contributions and get rid of fear of repositories,\r\n"
				+ "pull-requests, clones or any other commands, believe us, all of this will be on your fingertips after this.\r\n"
				+ "Code 101 unfolds with :\r\n"
				+ "1. Newsletters to provide you all information on :\r\n"
				+ "a. How to contribute to Open Source:\r\n"
				+ "This newsletter will give you brief idea about what exactly is open source contribution and how you can start doing it as well! \r\n"
				+ "This newsletter will be published on 1st of March'23 \r\n"
				+ "b. Non technical contributions:\r\n"
				+ "This newsletter will burst many myths that open source contributions are all about technical things, and coding is all you can contribute with! \r\n"
				+ "there are so many non technical things where you can contribute. Don't forget to read this newsletter, publishing on 3rd of March'23 \r\n"
				+ "c. Opportunities in Open source:\r\n"
				+ "This newsletter will help you to start your journey in contributing in competitions like GSOC, MLH and some other prestigious competitions. \r\n"
				+ "This newsletter will be releasing on 5th of March'23.\r\n"
				+ "2. Second thing we are coming up with is an online workshop to give you hands on experience so that you can practically implement and enhance your skills\r\n"
				+ "And last but not the least...\r\n"
				+ "3. Fun quiz to test your knowledge and... the top 3 winners will be given certificates and shout-out on our instagram page, so people don’t miss this amazing opportunity\r\n"
				+ "");
		switch(num)
		{
		case 1:
			System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
			System.out.println("_______________________________________________________________________________________________________________________________________________________________________");

			System.out.println("PAST EVENTS:");
			for(int i=0;i<past.size();i++)
			{
				System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
				System.out.println(past.get(i));
				System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
			}
			System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
			break;
		case 2:
			System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
			System.out.println("_______________________________________________________________________________________________________________________________________________________________________");

			System.out.println("UPCOMING EVENTS:");
			for(int i=0;i<future.size();i++)
			{
				System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
				System.out.println(future.get(i));
				System.out.println("_______________________________________________________________________________________________________________________________________________________________________");
			}
			break;
		default:
				System.out.println("YOU HAVE ENTERED WRONG CHOICE!!");
				break;
		}
	}
}