package org.example.design_patterns.creational.prototype.shapes;

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
public class Circle extends Shape {

    private int radius;

    public Circle(Circle source) {
        super(source);

        if (source != null) radius = source.getRadius();
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Circle) || !super.equals(other)) return false;

        Circle otherCircle = (Circle) other;

        return otherCircle.getRadius() == radius;
    }
}