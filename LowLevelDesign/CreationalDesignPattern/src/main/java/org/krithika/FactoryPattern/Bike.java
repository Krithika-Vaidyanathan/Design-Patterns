package org.krithika.FactoryPattern;

//Concrete Product
public class Bike implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by Bike");
    }
}
