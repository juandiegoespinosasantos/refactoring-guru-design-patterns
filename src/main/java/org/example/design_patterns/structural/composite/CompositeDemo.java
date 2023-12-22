package org.example.design_patterns.structural.composite;

import java.awt.Color;
import org.example.design_patterns.structural.composite.editor.ImageEditor;
import org.example.design_patterns.structural.composite.shapes.Circle;
import org.example.design_patterns.structural.composite.shapes.CompoundShape;
import org.example.design_patterns.structural.composite.shapes.Dot;
import org.example.design_patterns.structural.composite.shapes.Rectangle;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 21, 2023
 * @see <a href="https://refactoring.guru/design-patterns/composite">https://refactoring.guru/design-patterns/composite</a>
 * @since 17
 */
public class CompositeDemo {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN))
        );
    }
}