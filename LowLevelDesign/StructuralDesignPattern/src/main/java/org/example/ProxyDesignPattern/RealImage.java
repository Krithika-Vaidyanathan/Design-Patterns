package org.example.ProxyDesignPattern;

//Step2: Real Subject - contains actual logic or operation that the client wants to use.
public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    public void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
