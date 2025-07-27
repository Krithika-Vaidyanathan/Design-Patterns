package org.krithika.AbstractFactoryPattern;

//Concrete Product
public class MacOSButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering macos button");
    }
}
