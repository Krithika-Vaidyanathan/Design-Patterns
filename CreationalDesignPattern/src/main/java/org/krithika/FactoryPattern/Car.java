package org.krithika.FactoryPattern;

//Concrete Product
public class Car implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by Car");
    }
}
