package org.example.AdapterDesignPattern;

//Step4: The Adapter makes AdvancedMediaPlayer compatible with MediaPlayer
//MediaAdapter is designed only to adapt Adaptee(AdvancedMediaPlayer) formats (like vlc and mp4).
//The whole point of Adapter is to bridge only the incompatible formats.
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    //Initialize the adapter with an AdvancedMediaPlayer instance
    public MediaAdapter() {
        advancedMediaPlayer = new AdvancedMediaPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        //Translate the MediaPlayer request into AdvancedMediaPlayer calls
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else {
            System.out.println("Unsupported format: " + audioType);
        }
    }
}
