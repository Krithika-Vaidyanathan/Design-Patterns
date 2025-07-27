package org.example.ProxyDesignPattern;

//Step3: Proxy class - ProxyImage acts as a surrogate for the RealImage.
//Holds a reference to the real object and controls access to it.
//Proxy can add extra logic like logging, caching, or security checks before calling the real object's method.
//The display() method checks whether the real image has been loaded.
//If not, it creates a new instance of RealImage and delegates the display() call to it.
//This lazy loading mechanism ensures that the real image is loaded only when necessary.
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
