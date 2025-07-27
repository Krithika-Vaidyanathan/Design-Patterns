package org.example.FacadeDesignPattern;

//Subsystem - Concrete restaurant class implementing menu
public class ChineseRestaurant implements Menu {

    @Override
    public void showMenu() {
        System.out.println("Chinese menu: Fried rice, manchurian, noodles");
    }
}
