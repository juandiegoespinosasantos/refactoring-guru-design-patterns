package org.example.design_patterns.creational.prototype.shapes;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 16, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/prototype">https://refactoring.guru/design-patterns/prototype</a>
 */
public class Circle extends Shape {

    private int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);

        if (source != null) {
            radius = source.getRadius();
        }
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}