package org.krithika.AbstractFactoryPattern;

//Concrete factory class
public class MacOSFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new MacOSScrollbar();
    }
}
