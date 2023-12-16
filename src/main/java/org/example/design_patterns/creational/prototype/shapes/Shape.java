package org.example.design_patterns.creational.prototype.shapes;

import java.util.Objects;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 16, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/prototype">https://refactoring.guru/design-patterns/prototype</a>
 */
public abstract class Shape {

    private int x;
    private int y;
    private String color;

    protected Shape() {
    }

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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}