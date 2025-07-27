package org.example.FacadeDesignPattern;

//Step2: Facade class that simplifies access
public class HotelKeeper implements Hotel {
    private final IndianRestaurant indianRestaurant;
    private final ChineseRestaurant chineseRestaurant;
    private final ItalianRestaurant italianRestaurant;

    public HotelKeeper() {
        this.indianRestaurant = new IndianRestaurant();
        this.chineseRestaurant = new ChineseRestaurant();
        this.italianRestaurant = new ItalianRestaurant();
    }

    @Override
    public void getIndianMenu() {
        indianRestaurant.showMenu();
    }

    @Override
    public void getChineseMenu() {
        chineseRestaurant.showMenu();
    }

    @Override
    public void getItalianMenu() {
        italianRestaurant.showMenu();
    }
}
