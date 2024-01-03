package org.example.design_patterns.structural.flyweight.trees;

import java.awt.Graphics;
import java.io.Serializable;
import lombok.AllArgsConstructor;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 02, 2024
 * @see <a href="https://refactoring.guru/design-patterns/flyweight">https://refactoring.guru/design-patterns/flyweight</a>
 * @since 17
 */
@AllArgsConstructor
public class Tree implements Serializable {

    private int x;
    private int y;
    private TreeType type;

    public void draw(final Graphics g) {
        type.draw(g, x, y);
    }
}