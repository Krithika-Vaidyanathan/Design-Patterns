package org.example.FacadeDesignPattern;

//Subsystem - Concrete restaurant class implementing menu
public class IndianRestaurant implements Menu {

    @Override
    public void showMenu() {
        System.out.println("Indian Menu: Paneer butter masala, naan, briyani");
    }
}
