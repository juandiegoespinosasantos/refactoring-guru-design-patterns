package org.example.design_patterns.creational.abstract_factory;

import org.example.design_patterns.creational.abstract_factory.buttons.IButton;
import org.example.design_patterns.creational.abstract_factory.checkboxes.ICheckbox;
import org.example.design_patterns.creational.abstract_factory.factories.IGUIFactory;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 13, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/abstract-factory">https://refactoring.guru/design-patterns/abstract-factory</a>
 */
public class Application {

    private IButton button;
    private ICheckbox checkbox;

    public Application(IGUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}