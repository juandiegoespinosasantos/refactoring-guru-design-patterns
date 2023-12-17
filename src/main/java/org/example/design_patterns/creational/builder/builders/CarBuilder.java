package org.example.design_patterns.creational.builder.builders;

import org.example.design_patterns.creational.builder.cars.Car;
import org.example.design_patterns.creational.builder.components.Engine;
import org.example.design_patterns.creational.builder.components.GPSNavigator;
import org.example.design_patterns.creational.builder.components.TripComputer;
import org.example.design_patterns.creational.builder.enums.ECarTypes;
import org.example.design_patterns.creational.builder.enums.ETransmissions;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 17, 2023
 * @see <a href="https://refactoring.guru/design-patterns/builder">https://refactoring.guru/design-patterns/builder</a>
 * @since 17
 */
public class CarBuilder implements IBuilder {

    private ECarTypes type;
    private int seats;
    private Engine engine;
    private ETransmissions transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void type(ECarTypes type) {
        this.type = type;
    }

    @Override
    public void seats(int seats) {
        this.seats = seats;
    }

    @Override
    public void engine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void transmission(ETransmissions transmission) {
        this.transmission = transmission;
    }

    @Override
    public void tripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void gpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car build() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}