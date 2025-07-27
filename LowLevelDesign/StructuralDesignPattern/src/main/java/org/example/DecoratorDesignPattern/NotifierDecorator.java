package org.example.DecoratorDesignPattern;

//Step3: Decorator abstract class - has reference to component object.
//Decorators are responsible for adding new behaviors to the wrapped component object.
public abstract class NotifierDecorator implements Notifier {

    protected Notifier wrappedNotifier;
    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }
    @Override
    public void send(String message) {
        wrappedNotifier.send(message);   //delegate to wrapped object
    }
}
