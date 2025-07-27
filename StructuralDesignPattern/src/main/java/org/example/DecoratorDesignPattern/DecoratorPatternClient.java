package org.example.DecoratorDesignPattern;

//Decorator design pattern - Add new behavior (features) to objects dynamically without modifying their original class.
//By "wrapping" original object inside decorator objects.
//When you have a base component with basic functionality, but you need to add additional features to it dynamically without altering its structure.
//Decorators allow you to add new responsibilities to objects at runtime.
//We could also achieve something similar to the decorator's job using Strategy Design Pattern.
//Instead of wrapping objects, we define different notification strategies.
//In strategy design pattern, we need to create anew class for every new combination
//(like EmailSmsWhatsappNotifier, EmailOnlyNotifier, EmailSmsNotifier) which leads to class explosion.
//*Decorator - Best when you want dynamic combinations (can add/remove features at runtime).
//*Strategy - Best when you want flexible behavior switching, but not necessarily chaining.

public class DecoratorPatternClient {
    public static void main(String[] args) {
        //Base: Email only
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello User!");

        System.out.println("***************");

        //Add SMS feature dynamically
        Notifier smsAndEmailNotifier = new SMSDecorator(new EmailNotifier());
        smsAndEmailNotifier.send("Hello users!");
    }
}
