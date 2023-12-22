package org.example.design_patterns.structural.composite.shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 21, 2023
 * @see <a href="https://refactoring.guru/design-patterns/composite">https://refactoring.guru/design-patterns/composite</a>
 * @since 17
 */
public class Dot extends BaseShape {

    private static final int DOT_SIZE = 3;

    public Dot(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }
}