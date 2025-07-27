package org.example.AdapterDesignPattern;

//Step2: Adaptee - existing class with an incompatible interface - Has a different method interface
public class AdvancedMediaPlayer {
    void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
