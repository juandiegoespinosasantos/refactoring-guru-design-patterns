package org.example.design_patterns.creational.abstract_factory.checkboxes;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 13, 2023
 * @see <a href="https://refactoring.guru/design-patterns/abstract-factory">https://refactoring.guru/design-patterns/abstract-factory</a>
 * @since 17
 */
public class WindowsCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("You have created a WindowsCheckbox!");
    }
}