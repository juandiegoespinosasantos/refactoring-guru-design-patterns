package org.example.design_patterns.creational.builder.cars;

import lombok.Getter;
import lombok.Setter;
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
@Getter
@Setter
public class Car {

    private ECarTypes type;
    private int seats;
    private Engine engine;
    private ETransmissions transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(ECarTypes type, int seats, Engine engine, ETransmissions transmission, TripComputer tripComputer,
               GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;

        if (this.tripComputer != null) this.tripComputer.setCar(this);
    }
}