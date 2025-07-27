package org.example.FacadeDesignPattern;

//Client - just talks to Facade object (Hotelkeeper), doesn't know about internal subsystems.
public class FacadePatternClient {
    public static void main(String[] args) {
        Hotel hotel = new HotelKeeper();
        hotel.getIndianMenu();
        hotel.getItalianMenu();
        hotel.getChineseMenu();
    }
}
