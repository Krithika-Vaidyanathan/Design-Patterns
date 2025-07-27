package org.example.ProxyDesignPattern;

//Client interacts with proxy and proxy decides when and how to forward the request to the real object.
public class ProxyPatternClient {
    public static void main(String[] args) {
        Image image = new ProxyImage("example.jpg");

        image.display();  //Image will be loaded from disk when display() is called.
        image.display();  //Image will not be loaded again, as it has been cached in the proxy.
    }
}
