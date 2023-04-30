package soundproject3package3;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import soundsystempackage.SimpleAudioPlayer;

public class SongPath {
    Scanner sc;
    String path;
    String songName;
    SimpleAudioPlayer s1;

    SongPath(String path, String songName) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        sc = new Scanner(System.in);
        this.path = path;
        this.songName = songName;

    }

    /**
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException      Plays a single song Clip
     *
     */
    void playSong(int c) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        s1 = new SimpleAudioPlayer(path);

		/*
		 * while (true) {
		 *
		 * System.out.
		 * println("Song Options:\nStop the song to go to the previous or next one");
		 * System.out.println("1. PAUSE"); System.out.println("2. RESUME");
		 * System.out.println("3. RESTART"); System.out.println("4. STOP");
		 *
		 *
		 *
		    { break; } }
		 */
        //

        s1.gotoChoice(c);
//		         if(c==4)
//				s1.resetAudioStream();



        return;

    }

    public String toString() {
        return String.format("%s", songName);

    }
}