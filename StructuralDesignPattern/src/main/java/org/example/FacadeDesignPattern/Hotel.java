package org.example.FacadeDesignPattern;

//Step1: Face Interface
//Facade knows which subsystem classes are responsible to a request.
//Facade delegates client requests to appropriate subsystem objects.
public interface Hotel {
    void getIndianMenu();
    void getChineseMenu();
    void getItalianMenu();
}
