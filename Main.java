package spotify_lite;
import java.sql.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

class Song_Node {

	String name;
	float length;
	String artist;
	Song_Node prev;
	Song_Node next;
	int song_id;

	Song_Node(String name, String artist, float length, int id) {
		this.artist = artist;
		this.name = name;
		this.length = length;
		song_id = id;
	}
}

class Playlist {
	List<Song_Node> SongList = new ArrayList<>();
	String username;
	int playlist_size = 0;
	Song_Node head = null;
	int size = 0;
	static int user_id = 0;

	Playlist() {
		user_id++;
	}

	void play_with_shuffle() {
//		HashMap <String,Integer> map=new HashMap<>();
		ArrayList<String> played = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int start = 1;
		int end = size;
		int c = 1;
		int counter = 0;
		while (c != 0 && counter <= size) {
			Random rand = new Random();
			int number = rand.nextInt((end - start) + 1) + start;
			Song_Node ptr = head;
			for (int i = 0; i < number; i++) {
				ptr = ptr.next;
			}
			if (played.contains(ptr.name)) {
				ptr = ptr.next;
				c = 1;
			} else {
				System.out.println("Playing : ");
				System.out.println(ptr.name);
				played.add(ptr.name);
				counter++;
				System.out.println("Enter 1 to continue.\nElse enter 0");
				c = sc.nextInt();
			}

		}

	}

	void addSong(Song_Node newsong) {

		// Song_Node newsong = new Song_Node(name, artist, length,id);

		if (head == null) {
			head = newsong;
		} else {
			Song_Node ptr = head;
			if (head.next == null) {
				head.next = newsong;
				newsong.prev = head;
				newsong.next = head;
				head.prev = newsong;
			} else {
				while (ptr.next != head) {
					ptr = ptr.next;

				}
				ptr.next = newsong;
				newsong.next = head;
				newsong.prev = ptr;
				head.prev = newsong;
			}
		}
		size++;
	}

	void playsong() {
		Song_Node ptr = head.prev;
		Song_Node temp = head.prev;
		int count = 1;
		do {

			System.out.println(
					count + "\nsong name : " + ptr.name + "\n artist : " + ptr.artist + "\n duration : " + ptr.length);
			ptr = ptr.prev;
			count++;
		} while (ptr.prev != temp.prev);
	}

	void removesong(String name) {

		Song_Node ptr = head;
		if (name == head.name) {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;

		} else {
			while (ptr.name != name) {
				ptr = ptr.next;
			}
			ptr.prev.next = ptr.next;
			ptr.next.prev = ptr.prev;
			ptr = null;
			System.out.println("Song removed.");
		}
		size--;
	}

	void match_playlists(Playlist p2) {
		HashMap<Integer, String> ht = new HashMap<>(26);
		Song_Node ptr = head;
		int count = 0;
		final DecimalFormat decfor = new DecimalFormat("0.00");
		for (int i = 0; i < size && ptr != null; i++) {
			ht.put(ptr.song_id, ptr.name);
			ptr = ptr.next;
		}
		Song_Node ptr2 = p2.head;
		for (int i = 0; i < p2.size; i++) {
			if (ht.containsValue(ptr2.name)) {

				count++;
			}
			ptr2 = ptr2.next;
		}
		float percent = ((float) count / (float) size) * 100;
		System.out.println(decfor.format(percent) + "% playlists match");
	}

}

public class Main {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	static final String DB_URL = "jdbc:mysql://localhost/library1463";
	static final String USER = "root";

	static final String PASS = "Root$1419";

	Connection conn = null;

	PreparedStatement pstmt = null;

	String query;

	Scanner scan = new Scanner(System.in);
	Scanner scn = new Scanner(System.in);

	void Display_Songs() {
		query = "select * from songs";
		try {

			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			pstmt = conn.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery(query);
			rs = pstmt.executeQuery(query);
			int i = 1;
			while (rs.next())

			{

				int song_id = rs.getInt("song_id");

				String song_name = rs.getString("name");

				String artist = rs.getString("artist");

				float length = rs.getFloat("length");
				System.out.println(i);

//			System.out.println("Song Name  : " + song_name);
//
//			System.out.println("Artist : " + artist);
//
//			System.out.println("Duration : " + length);
//			
//			System.out.println("Song ID : "+ song_id);
//			System.out.println();

				// System.out.println(" --------------------------- Details of Resolved
				// Complaint-------------------\n");
				System.out.format("%-15s %-30s %-30s %-25s\n", "Song Name  ", "Artist   ", "Song_id  ",
						"Song_duration  ");
				System.out.format("%-15s %-30s %-30s %-25s\n", song_name, artist, song_id, length);
				System.out
						.println(" -------------------------------------------------------------------------------\n");

				i++;
			}

			rs.close();

			pstmt.close();

			conn.close();

		} // End try block

		catch (ClassNotFoundException e) {

			System.out.println(" ");
		}

		catch (SQLException se) {

			System.out.println(" ");
		} catch (Exception e) {
			System.out.println(" ");
		}
	}

	Song_Node search(int id) {

		Song_Node node = null;
		try {

			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			int ID = id;

			query = "select * from songs where  song_id = ?";

			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, ID);

			ResultSet rs = pstmt.executeQuery();
			System.out.println("Query Executed");
			if (rs.next()) {
				int song_id = rs.getInt("song_id");

				String name = rs.getString("name");

				String artist = rs.getString("artist");

				float length = rs.getFloat("length");

				node = new Song_Node(name, artist, length, song_id);

			} else {
				System.out.println("No such song found.");
				node = null;
			}
			rs.close();
			pstmt.close();

			conn.close();

		} catch (ClassNotFoundException e) {

			System.out.println(" ");
		}

		catch (SQLException se) {

			System.out.println(" ");
		} catch (Exception e) {
			System.out.println(" ");
		}

		return node;
	}

	public static void main(String[] args) {
		Main ob = new Main();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		// final ArrayList<Playlist> users = new ArrayList<>();
		Playlist obj1 = new Playlist();
		Song_Node new_song = ob.search(1035);
		obj1.addSong(new_song);
		new_song = ob.search(1145);
		obj1.addSong(new_song);
		new_song = ob.search(1212);
		obj1.addSong(new_song);
		new_song = ob.search(1003);
		obj1.addSong(new_song);
		new_song = ob.search(1267);
		obj1.addSong(new_song);
		new_song = ob.search(1349);
		obj1.addSong(new_song);
		new_song = ob.search(3234);
		obj1.addSong(new_song);
		new_song = ob.search(6353);
		obj1.addSong(new_song);
		new_song = ob.search(2760);
		obj1.addSong(new_song);
		new_song = ob.search(7782);
		obj1.addSong(new_song);
		new_song = ob.search(6329);
		obj1.addSong(new_song);

		Playlist obj2 = new Playlist();

		new_song = ob.search(1789);
		obj2.addSong(new_song);
		new_song = ob.search(2483);
		obj2.addSong(new_song);
		new_song = ob.search(4263);
		obj2.addSong(new_song);
		new_song = ob.search(5371);
		obj2.addSong(new_song);
		new_song = ob.search(9837);
		obj2.addSong(new_song);
		new_song = ob.search(2166);
		obj2.addSong(new_song);
		new_song = ob.search(1427);
		obj2.addSong(new_song);
		new_song = ob.search(1267);
		obj2.addSong(new_song);
		new_song = ob.search(1349);
		obj2.addSong(new_song);
		new_song = ob.search(6353);
		obj2.addSong(new_song);
		new_song = ob.search(3762);
		obj2.addSong(new_song);
		new_song = ob.search(1632);
		obj2.addSong(new_song);
		new_song = ob.search(1953);
		obj2.addSong(new_song);
		new_song = ob.search(4936);
		obj2.addSong(new_song);

		Playlist obj3 = new Playlist();
		new_song = ob.search(5241);
		obj3.addSong(new_song);
		new_song = ob.search(5631);
		obj3.addSong(new_song);
		new_song = ob.search(2346);
		obj3.addSong(new_song);
		new_song = ob.search(2566);
		obj3.addSong(new_song);
		new_song = ob.search(1273);
		obj3.addSong(new_song);
		new_song = ob.search(3234);
		obj3.addSong(new_song);
		new_song = ob.search(3762);
		obj3.addSong(new_song);
		new_song = ob.search(1069);
		obj3.addSong(new_song);
		new_song = ob.search(3280);
		obj3.addSong(new_song);
		new_song = ob.search(1419);
		obj3.addSong(new_song);
		new_song = ob.search(7623);
		obj3.addSong(new_song);
		new_song = ob.search(1953);
		obj3.addSong(new_song);
		new_song = ob.search(5827);
		obj3.addSong(new_song);
		
		Playlist obj4 = new Playlist();
		new_song = ob.search(2954);
		obj4.addSong(new_song);
		new_song = ob.search(1632);
		obj4.addSong(new_song);
		new_song = ob.search(5371);
		obj4.addSong(new_song);
		new_song = ob.search(6329);
		obj4.addSong(new_song);
		new_song = ob.search(2760);
		obj4.addSong(new_song);
		new_song = ob.search(9837);
		obj4.addSong(new_song);
		new_song = ob.search(3657);
		obj4.addSong(new_song);
		new_song = ob.search(7623);
		obj4.addSong(new_song);
		new_song = ob.search(5827);
		obj4.addSong(new_song);
		new_song = ob.search(7139);
		obj4.addSong(new_song);
		new_song = ob.search(4936);
		obj4.addSong(new_song);
		new_song = ob.search(1003);
		obj4.addSong(new_song);
		new_song = ob.search(1035);
		obj4.addSong(new_song);
		new_song = ob.search(1010);
		obj4.addSong(new_song);
		new_song = ob.search(1136);
		obj4.addSong(new_song);
		Playlist obj6 = new Playlist();

		ob.Display_Songs();
		System.out.println("MAKE YOUR PLAYLIST NOW !!");
		System.out.println("Enter which songs would you like to add in your playlist : ");
		int ch = 1;
		int id = 0;
		while (ch == 1) {
			System.out.println("Enter song_id : ");
			id = sc.nextInt();
			Song_Node new_song1 = ob.search(id);
			if (new_song1 != null)
				obj6.addSong(new_song1);
			System.out.println("Enter 1 to continue adding songs. Else enter 0.");
			ch = sc.nextInt();
		}

		char c = 'y';
		while (c == 'y') {
			System.out.println(
					"Enter 1 to play all the songs serially.\nEnter 2 to shuffle.\nEnter 3 to see how much your playlist matches with other users.");
			int choice = 0;
			choice = sc.nextInt();
			if (choice == 1) {
				obj6.playsong();
			}
			if (choice == 2) {
				System.out.println("Shuffle-Play");
				System.out.println();
				obj6.play_with_shuffle();
			}

			if (choice == 3) {
				System.out.println("List of other users : ");
				for (int i = 0; i < 4; i++) {
					System.out.println("User " + (i + 1));
				}
				System.out.println("Enter with which user you want to match your playlist : ");
				int uc = sc.nextInt();
				if (uc == 1) {
					
					obj6.match_playlists(obj1);
					System.out.println("User "+uc+"'s"+" playlist : ");
					obj1.playsong();
				}
				if (uc == 2) {
					obj6.match_playlists(obj2);
					System.out.println("User "+uc+"'s"+" playlist : ");
					obj2.playsong();
				}
				if (uc == 3) {
					obj6.match_playlists(obj3);
					System.out.println("User "+uc+"'s"+" playlist : ");
					obj3.playsong();
				}
				if (uc == 4) {
					obj6.match_playlists(obj4);
					System.out.println("User "+uc+"'s"+" playlist : ");
					obj4.playsong();
				}
			}

			
			System.out.println("Enter 'y' to continue the program. Else enter 'n'.");
			c = sc.next().charAt(0);

		}

	}

}
