package org.example.FlyweightDesignPattern;


//Step2: Concrete Flyweight - stores intrinsic (shared) state.
public class TreeType implements TreeFlyweight {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " " + name + " tree at (" + x + ", " + y + ") with texture " + texture );
    }
}
