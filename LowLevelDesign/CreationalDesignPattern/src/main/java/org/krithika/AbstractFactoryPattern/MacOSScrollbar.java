package org.krithika.AbstractFactoryPattern;

//Concrete Product
public class MacOSScrollbar implements ScrollBar {

    @Override
    public void scroll() {
        System.out.println("Scrolling macos scrollbar");
    }
}
