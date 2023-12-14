package org.example.design_patterns.creational.factory_method.dialogs;

import org.example.design_patterns.creational.factory_method.buttons.IButton;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 12, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/factory-method">https://refactoring.guru/design-patterns/factory-method</a>
 */
public abstract class AbstractDialog {

    public abstract IButton createButton();

    public void renderWindow() {
        IButton okButton = createButton();
        okButton.render();
    }
}
