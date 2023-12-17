package org.example.design_patterns.creational.factory_method.buttons;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 12, 2023
 * @see <a href="https://refactoring.guru/design-patterns/factory-method">https://refactoring.guru/design-patterns/factory-method</a>
 * @since 17
 */
public class HtmlButton implements IButton {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}