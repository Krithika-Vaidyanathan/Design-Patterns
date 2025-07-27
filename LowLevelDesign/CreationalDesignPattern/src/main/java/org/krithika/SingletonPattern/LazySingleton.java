package org.krithika.SingletonPattern;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton instance created");
    }

    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void greet() {
        System.out.println("Greetings from Lazy Singleton.");
    }

    public static void main(String[] args) {
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();

        l1.greet();
        System.out.println("Same instance: " + (l1==l2));
    }
}
