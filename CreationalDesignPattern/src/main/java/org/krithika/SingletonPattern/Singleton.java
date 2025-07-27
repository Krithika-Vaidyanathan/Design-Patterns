package org.krithika.SingletonPattern;

public class Singleton {

    //Create a static instance -  Eager Instantiation
    private static final Singleton instance = new Singleton();

    //Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    //Provide global access method
    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton");
    }

    //Main method to test
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s2.showMessage();

        //Check if both objects are the same
        System.out.println("Same instance: " + (s1==s2));
    }
}
