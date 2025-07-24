package org.krithika.FactoryPattern;

public class FactoryPatternService {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        Client carClient = new Client(carFactory);
        Transport car = carClient.getVehicle();
        car.deliver();

        TransportFactory bikeFactory = new BikeFactory();
        Client bikeClient = new Client(bikeFactory);
        Transport bike = bikeClient.getVehicle();
        bike.deliver();
    }
}
