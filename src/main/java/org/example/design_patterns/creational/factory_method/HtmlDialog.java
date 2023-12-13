package org.example.design_patterns.creational.factory_method;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 12, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/factory-method">https://refactoring.guru/design-patterns/factory-method</a>
 */
public class HtmlDialog extends AbstractDialog {

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
}