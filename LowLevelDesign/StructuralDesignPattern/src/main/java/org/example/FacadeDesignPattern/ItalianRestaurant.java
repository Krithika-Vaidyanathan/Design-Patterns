package org.example.FacadeDesignPattern;

//Subsystem - Concrete Restaurant class implementing menu
public class ItalianRestaurant implements Menu {

    @Override
    public void showMenu() {
        System.out.println("Italian Menu: Pizza, Pasta, Lasagna");
    }
}
