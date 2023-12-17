package org.example.design_patterns.creational.builder.directors;

import org.example.design_patterns.creational.builder.builders.IBuilder;
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
public class CarDirector {

    public void constructSportsCar(IBuilder builder) {
        builder.type(ECarTypes.SPORTS_CAR);
        builder.seats(2);
        builder.engine(new Engine(3.0, 0));
        builder.transmission(ETransmissions.SEMI_AUTOMATIC);
        builder.tripComputer(new TripComputer());
        builder.gpsNavigator(new GPSNavigator());
    }

    public void constructCityCar(IBuilder builder) {
        builder.type(ECarTypes.CITY_CAR);
        builder.seats(2);
        builder.engine(new Engine(1.2, 0));
        builder.transmission(ETransmissions.AUTOMATIC);
        builder.tripComputer(new TripComputer());
        builder.gpsNavigator(new GPSNavigator());
    }

    public void constructSUV(IBuilder builder) {
        builder.type(ECarTypes.SUV);
        builder.seats(4);
        builder.engine(new Engine(2.5, 0));
        builder.transmission(ETransmissions.MANUAL);
        builder.gpsNavigator(new GPSNavigator());
    }
}