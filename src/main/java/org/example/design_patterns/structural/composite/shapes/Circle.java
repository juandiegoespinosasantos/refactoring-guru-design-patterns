package org.example.design_patterns.structural.composite.shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 21, 2023
 * @see <a href="https://refactoring.guru/design-patterns/composite">https://refactoring.guru/design-patterns/composite</a>
 * @since 17
 */
public class Circle extends BaseShape {

    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}