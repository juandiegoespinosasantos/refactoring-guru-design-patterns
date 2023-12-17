package org.example.design_patterns.creational.prototype.shapes;

import java.util.Objects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 16, 2023
 * @see <a href="https://refactoring.guru/design-patterns/prototype">https://refactoring.guru/design-patterns/prototype</a>
 * @since 17
 */
@NoArgsConstructor
@Getter
@Setter
public abstract class Shape {

    private int x;
    private int y;
    private String color;

    protected Shape(Shape source) {
        if (source != null) {
            x = source.getX();
            y = source.getY();
            color = source.getColor();
        }
    }

    @Override
    public abstract Shape clone();

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Shape)) return false;

        Shape otherShape = (Shape) other;

        return (otherShape.getX() == x) &&
                (otherShape.getY() == y) &&
                Objects.equals(otherShape.getColor(), color);
    }
}