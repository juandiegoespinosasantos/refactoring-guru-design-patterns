package org.example.design_patterns.creational.builder.components;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.design_patterns.creational.builder.cars.Car;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 17, 2023
 * @see <a href="https://refactoring.guru/design-patterns/builder">https://refactoring.guru/design-patterns/builder</a>
 * @since 17
 */
@NoArgsConstructor
@Setter
public class TripComputer {

    private Car car;

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}