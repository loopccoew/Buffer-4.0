package soundsystempackage;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**

 *class that stores path of specific song and plays it
 */
public class SimpleAudioPlayer
{

    // to store current position
    public Long currentFrame;
    public Clip clip;

    // current status of clip
    String status = "";

    AudioInputStream audioInputStream;
    String filePath = " ";

    /**
     * @param newFilePath
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     * Constructor to initialize streams and clip
     *
     */
    public SimpleAudioPlayer(String newFilePath) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        filePath = newFilePath;
// create AudioInputStream object
        audioInputStream =
                AudioSystem.getAudioInputStream(new File(newFilePath).getAbsoluteFile());

// create clip reference
        clip = AudioSystem.getClip();

// open audioInputStream to the clip

    }

    /**
     * @param c choice
     * @throws IOException
     * @throws LineUnavailableException
     * @throws UnsupportedAudioFileException
     * Work as the user enters his choice
     */
    public void gotoChoice(int c) throws IOException, LineUnavailableException, UnsupportedAudioFileException
    {
        switch (c)
        {
            case 1:
                pause();
                break;

            case 2:
                try {
                    resumeAudio();
                }catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                restart();
                break;

            case 4:
                stop();
                resetAudioStream();
                break;

            case 5:
                play();
                break;

            default:
                break;
        }

    }

    /**
     * Method to play the audio, sets status to play
     * @throws IOException
     * @throws LineUnavailableException
     */
    public void play() throws LineUnavailableException, IOException
    {
        clip.open(audioInputStream);

        clip.loop(Clip.LOOP_CONTINUOUSLY);
        clip.start();
        status = "play";
    }

    /**
     * Method to pause the audio
     */
    public void pause()
    {
        if (status.equals("paused"))
        {
//System.out.println("audio is already paused");
            return;
        }
        this.currentFrame = this.clip.getMicrosecondPosition();
        System.out.println(currentFrame);
        clip.stop();
        System.out.println(clip);
        status = "paused";
        System.out.println(status);
    }

    /**
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     * Method to resume the audio
     */
    public void resumeAudio() throws UnsupportedAudioFileException,
            IOException, LineUnavailableException
    {
        if (status.equals("play"))
        {
            System.out.println("Audio is already "+ "being played");
            return;
        }
        clip.close();
        resetAudioStream();
        clip.setMicrosecondPosition(currentFrame);
        this.play();

    }

    /**
     * @throws IOException
     * @throws LineUnavailableException
     * @throws UnsupportedAudioFileException
     * Method to restart the audio
     */
    public void restart() throws IOException, LineUnavailableException, UnsupportedAudioFileException
    {
        clip.stop();
        clip.close();
        resetAudioStream();
        currentFrame = 0L;
        clip.setMicrosecondPosition(0);
        this.play();
    }

    /**
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     * Method to stop the audio
     */
    public void stop() throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        currentFrame = 0L;
        clip.stop();
        clip.close();
    }

    /**
     * @param c
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     * Method to jump over a specific part
     */
    public void jump(long c) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        if (c > 0 && c < clip.getMicrosecondLength())
        {
            clip.stop();
            clip.close();
            resetAudioStream();
            currentFrame = c;
            clip.setMicrosecondPosition(c);
            this.play();
        }
    }

    /**
     * @throws UnsupportedAudioFileException
     * @throws IOException
     * @throws LineUnavailableException
     * Method to reset audio stream
     */
    public void resetAudioStream() throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        audioInputStream = AudioSystem.getAudioInputStream(
                new File(filePath).getAbsoluteFile());
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

}