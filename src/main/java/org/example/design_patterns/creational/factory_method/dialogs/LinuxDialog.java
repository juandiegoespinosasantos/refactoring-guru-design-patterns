package org.example.design_patterns.creational.factory_method.dialogs;

import org.example.design_patterns.creational.factory_method.buttons.IButton;
import org.example.design_patterns.creational.factory_method.buttons.LinuxButton;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 12, 2023
 * @see <a href="https://refactoring.guru/design-patterns/factory-method">https://refactoring.guru/design-patterns/factory-method</a>
 * @since 17
 */
public class LinuxDialog extends AbstractDialog {

    @Override
    public IButton createButton() {
        return new LinuxButton();
    }
}
