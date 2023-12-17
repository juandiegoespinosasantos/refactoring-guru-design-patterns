package org.example.design_patterns.creational.factory_method.dialogs;

import org.example.design_patterns.creational.factory_method.buttons.HtmlButton;
import org.example.design_patterns.creational.factory_method.buttons.IButton;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 12, 2023
 * @see <a href="https://refactoring.guru/design-patterns/factory-method">https://refactoring.guru/design-patterns/factory-method</a>
 * @since 17
 */
public class HtmlDialog extends AbstractDialog {

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
}