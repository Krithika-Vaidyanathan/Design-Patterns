package org.krithika.FactoryPattern;

//Client code
public class Client {
    private Transport transport;

    public Client(TransportFactory factory) {
        transport = factory.createVehicle();
    }

    public Transport getVehicle() {
        return transport;
    }
}
