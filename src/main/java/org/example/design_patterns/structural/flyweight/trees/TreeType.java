package org.example.design_patterns.structural.flyweight.trees;

import java.awt.Color;
import java.awt.Graphics;
import lombok.AllArgsConstructor;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 02, 2024
 * @see <a href="https://refactoring.guru/design-patterns/flyweight">https://refactoring.guru/design-patterns/flyweight</a>
 * @since 17
 */
@AllArgsConstructor
public class TreeType {

    private String name;
    private Color color;
    private String otherTreeData;

    public void draw(final Graphics g, final int x, final int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}