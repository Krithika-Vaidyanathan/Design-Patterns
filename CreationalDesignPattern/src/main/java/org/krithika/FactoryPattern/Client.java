package org.krithika.FactoryPattern;

//Client code - loosely coupled to concrete classes (Car, Bike).
//Adding new transport does not require modification in the client code.
//Transport type can be passed at run time.
public class Client {
    private Transport transport;

    public Client(TransportFactory factory) {
        transport = factory.createVehicle();
    }

    public Transport getVehicle() {
        return transport;
    }
}
