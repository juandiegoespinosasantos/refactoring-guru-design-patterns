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
public class Manual {

    private ECarTypes type;
    private int seats;
    private Engine engine;
    private ETransmissions transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Manual(ECarTypes type, int seats, Engine engine, ETransmissions transmission, TripComputer tripComputer,
                  GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        String info = "" +
                "Type of car: " + type + "\n" +
                "Count of seats: " + seats + "\n" +
                "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n" +
                "Transmission: " + transmission + "\n";

        if (tripComputer == null) {
            info += "Trip Computer: N/A" + "\n";
        } else {
            info += "Trip Computer: Functional" + "\n";
        }

        if (gpsNavigator == null) {
            info += "GPS Navigator: N/A" + "\n";
        } else {
            info += "GPS Navigator: Functional" + "\n";
        }

        return info;
    }
}