package org.example.FlyweightDesignPattern;

//Step1: Flyweight Interface (defines shared behavior)
public interface TreeFlyweight {
    void draw(int x, int y);  //draw with extrinsic data (position)
}
