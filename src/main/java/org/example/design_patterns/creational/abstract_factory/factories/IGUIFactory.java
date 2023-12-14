package org.example.design_patterns.creational.abstract_factory.factories;

import org.example.design_patterns.creational.abstract_factory.buttons.IButton;
import org.example.design_patterns.creational.abstract_factory.checkboxes.ICheckbox;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 13, 2023
 * @since 17
 */
public interface IGUIFactory {

    IButton createButton();

    ICheckbox createCheckbox();
}