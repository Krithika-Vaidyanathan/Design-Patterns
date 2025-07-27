package org.example.AdapterDesignPattern;

//Step1: Target Interface - what our client code expects to work with.
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
