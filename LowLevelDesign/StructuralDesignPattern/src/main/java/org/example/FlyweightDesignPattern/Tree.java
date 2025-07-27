package org.example.FlyweightDesignPattern;

//Step4: Context - holds the extrinsic state (position) and a reference to shared flyweight
public class Tree {
    private int x;
    private int y;
    private TreeFlyweight type;  //uses interface now

    public Tree(int x, int y, TreeFlyweight type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y);  //delegate drawing, passing extrinsic data
    }
}
