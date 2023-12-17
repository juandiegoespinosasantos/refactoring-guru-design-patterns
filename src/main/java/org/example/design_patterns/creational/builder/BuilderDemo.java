package org.example.design_patterns.creational.builder;

import org.example.design_patterns.creational.builder.builders.CarBuilder;
import org.example.design_patterns.creational.builder.builders.CarManualBuilder;
import org.example.design_patterns.creational.builder.cars.Car;
import org.example.design_patterns.creational.builder.cars.Manual;
import org.example.design_patterns.creational.builder.directors.CarDirector;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 17, 2023
 * @see <a href="https://refactoring.guru/design-patterns/builder">https://refactoring.guru/design-patterns/builder</a>
 * @since 17
 */
public class BuilderDemo {

    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.build();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.build();
        System.out.println("\nCar manual built:\n" + manual.toString());
    }
}