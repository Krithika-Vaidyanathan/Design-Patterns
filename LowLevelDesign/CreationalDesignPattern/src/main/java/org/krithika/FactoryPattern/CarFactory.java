package org.krithika.FactoryPattern;

//Concrete Factory
public class CarFactory implements TransportFactory {

    @Override
    public Transport createVehicle() {
        return new Car();
    }
}
