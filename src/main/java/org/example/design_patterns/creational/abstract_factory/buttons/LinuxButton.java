package org.example.design_patterns.creational.abstract_factory.buttons;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 13, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/abstract-factory">https://refactoring.guru/design-patterns/abstract-factory</a>
 */
public class LinuxButton implements IButton {

    @Override
    public void paint() {
        System.out.println("You have created a LinuxButton!");
    }
}