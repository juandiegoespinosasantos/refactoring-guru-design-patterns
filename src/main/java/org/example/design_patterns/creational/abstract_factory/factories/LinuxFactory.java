package org.example.design_patterns.creational.abstract_factory.factories;

import org.example.design_patterns.creational.abstract_factory.buttons.IButton;
import org.example.design_patterns.creational.abstract_factory.buttons.LinuxButton;
import org.example.design_patterns.creational.abstract_factory.checkboxes.ICheckbox;
import org.example.design_patterns.creational.abstract_factory.checkboxes.LinuxCheckbox;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 13, 2023
 * @since 17
 */
public class LinuxFactory implements IGUIFactory{

    @Override
    public IButton createButton() {
        return new LinuxButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new LinuxCheckbox();
    }
}