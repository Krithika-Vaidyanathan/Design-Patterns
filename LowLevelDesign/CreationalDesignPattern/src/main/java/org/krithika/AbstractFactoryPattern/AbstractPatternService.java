package org.krithika.AbstractFactoryPattern;

public class AbstractPatternService {
    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowsFactory();
        Client windows = new Client(windowsFactory);
        windows.renderUI();

        System.out.println("**********");
        UIFactory macOSFactory = new MacOSFactory();
        Client macos = new Client(macOSFactory);
        macos.renderUI();
    }
}
