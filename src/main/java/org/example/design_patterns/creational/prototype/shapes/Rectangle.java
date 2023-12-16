package org.example.design_patterns.creational.prototype.shapes;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 16, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/prototype">https://refactoring.guru/design-patterns/prototype</a>
 */
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle source) {
        super(source);

        if (source != null) {
            width = source.getWidth();
            height = source.getHeight();
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Rectangle) || !super.equals(other)) return false;

        Rectangle otherRectangle = (Rectangle) other;

        return (otherRectangle.getWidth() == width) && (otherRectangle.getHeight() == height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}