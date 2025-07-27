package org.krithika.AbstractFactoryPattern;

public class Client {
    private Button button;
    private ScrollBar scrollBar;

    public Client(UIFactory factory) {
        button = factory.createButton();
        scrollBar = factory.createScrollbar();
    }

    public void renderUI() {
        button.render();
        scrollBar.scroll();
    }
}
