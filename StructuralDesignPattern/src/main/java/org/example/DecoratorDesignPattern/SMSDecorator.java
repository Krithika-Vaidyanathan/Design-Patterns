package org.example.DecoratorDesignPattern;

//Step4: Concrete Decorator - Each concrete decorator can add one or more behaviors to the component.
public class SMSDecorator extends NotifierDecorator {

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);  //first send email
        System.out.println("SMS sent: " + message);
    }
}
