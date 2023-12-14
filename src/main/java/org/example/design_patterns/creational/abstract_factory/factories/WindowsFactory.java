package org.example.design_patterns.creational.abstract_factory.factories;

import org.example.design_patterns.creational.abstract_factory.buttons.IButton;
import org.example.design_patterns.creational.abstract_factory.buttons.WindowsButton;
import org.example.design_patterns.creational.abstract_factory.checkboxes.ICheckbox;
import org.example.design_patterns.creational.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 13, 2023
 * @since 17
 */
public class WindowsFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}