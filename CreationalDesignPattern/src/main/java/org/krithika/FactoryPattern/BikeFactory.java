package org.krithika.FactoryPattern;

//Concrete Factory
public class BikeFactory implements TransportFactory {

    @Override
    public Transport createVehicle() {
        return new Bike();
    }
}
