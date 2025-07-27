package org.krithika.AbstractFactoryPattern;

//Concrete Product
public class WindowsScrollbar implements ScrollBar {

    @Override
    public void scroll() {
        System.out.println("Scrolling windows scrollbar");
    }
}
