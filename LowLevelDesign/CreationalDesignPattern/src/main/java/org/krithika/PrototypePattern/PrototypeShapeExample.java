package org.krithika.PrototypePattern;

//Prototype Interface
interface Shape {
    Shape clone();  //Make a copy of itself
    void draw();    //Draw the shape
}

//Concrete Prototype
class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {  //Creates a copy of the circle
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle.");
    }
}

class Square implements Shape {
    private String color;
    public Square(String color) {
        this.color = color;
    }
    public Shape clone() {
        return new Square(this.color);
    }
    public void draw() {
        System.out.println("Drawing a " + color + " square.");
    }
}

//Client code
class ShapeClient {
    private Shape shapePrototype;

    //When you create a client, you give it a prototype (a shape)
    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    //This method creates a new shape using the prototype
    public Shape createShape() {
        return shapePrototype.clone();
    }
}

//Main class
public class PrototypeShapeExample {
    public static void main(String[] args) {
        //Create a concrete prototype (a red circle)
        Shape circlePrototype = new Circle("red");

        //Create a client and give it a prototype
        ShapeClient client = new ShapeClient(circlePrototype);

        //Use the prototype to create a new shape (a red circle)
        Shape redCircle = client.createShape();

        //Draw the newly created red circle.
        redCircle.draw();


        Shape squarePrototype = new Square("blue");
        ShapeClient sqClient = new ShapeClient(squarePrototype);
        Shape blueSquare = sqClient.createShape();
        blueSquare.draw();
    }
}
