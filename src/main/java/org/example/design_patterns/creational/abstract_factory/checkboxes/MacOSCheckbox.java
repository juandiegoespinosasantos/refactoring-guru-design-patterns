package org.example.design_patterns.creational.abstract_factory.checkboxes;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 13, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/abstract-factory">https://refactoring.guru/design-patterns/abstract-factory</a>
 */
public class MacOSCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("You have created a MacOSCheckbox!");
    }
}