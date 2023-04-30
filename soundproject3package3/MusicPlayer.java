package soundproject3package3;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import mygenericdoublylinkedlistpackage.*;
import soundsystempackage.*;

public class MusicPlayer {
    MyDoublyLinkedList<SongPath> l ;
    SimpleAudioPlayer sap;
    SongPath s1,s2,s3,s4,s5,s6;
    String str1 = "Lag Jaa Gale";
    String str2 = "Yeh Raatein yeh mausam";
    String str3 = "Achha Ji Main Haari";
    String str4 = "Pal Pal Dil Ke Paas";
    String str5 = "Chhookar Mere Mann Ko";
    String str6= "Tera Mujhse hai";
    MusicPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        s1=new SongPath("C:\\Users\\DAKSHA\\Downloads\\Lag Jaa Gale.wav",str1);
        s2=new SongPath("C:\\Users\\DAKSHA\\Downloads\\Yeh Ratein Yeh Mausam.wav",str2);
        s3=new SongPath("C:\\Users\\DAKSHA\\Downloads\\Achha Ji Main Haari.wav",str3);
        s4=new SongPath("C:\\Users\\DAKSHA\\Downloads\\Pal Pal Dil Ke Paas.wav",str4);
        s5=new SongPath("C:\\Users\\DAKSHA\\Downloads\\Chookar Mere Mann Ko.wav",str5);
        s6=new SongPath("C:\\Users\\DAKSHA\\Downloads\\Tera Mujhse Hai Pehle Ka Naata.wav",str6);
        l = new MyDoublyLinkedList<>();
        l.insertEnd(s1);
        l.insertEnd(s2);
        l.insertEnd(s3);
        l.insertEnd(s4);
        l.insertEnd(s5);
        l.insertEnd(s6);

    }




}