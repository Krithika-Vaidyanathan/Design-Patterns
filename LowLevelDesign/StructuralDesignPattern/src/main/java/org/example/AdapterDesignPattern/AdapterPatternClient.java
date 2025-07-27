package org.example.AdapterDesignPattern;
//Adapter design pattern is used to make two incompatible interfaces work together without changing their code.
//Step5: The client - uses only MediaPlayer interface, unaware of the adapter details
public class AdapterPatternClient {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        //playing mp3 directly supported by AudioPlayer
        player.play("mp3", "song.mp3");

        //using adapter to play mp4 and vlc (not supported directly)
        MediaPlayer mp4Adapter = new MediaAdapter();
        mp4Adapter.play("mp4", "video.mp4");

        MediaPlayer vlcAdapter = new MediaAdapter();
        vlcAdapter.play("vlc", "movie.vlc");
    }
}
