package org.example.design_patterns.creational.builder.builders;

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
public interface IBuilder {

    void type(ECarTypes type);

    void seats(int seats);

    void engine(Engine engine);

    void transmission(ETransmissions transmission);

    void tripComputer(TripComputer tripComputer);

    void gpsNavigator(GPSNavigator gpsNavigator);
}