package org.example.AdapterDesignPattern;

//Step3: A simple player that can only handle MP3 by default - existing compatible class
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            System.out.println("Invalid format: " + audioType + " not supported directly.");
        }
    }
}
