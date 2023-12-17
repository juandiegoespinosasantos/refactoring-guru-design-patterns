package org.example.design_patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import org.example.design_patterns.creational.prototype.shapes.Circle;
import org.example.design_patterns.creational.prototype.shapes.Rectangle;
import org.example.design_patterns.creational.prototype.shapes.Shape;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 16, 2023
 * @see <a href="https://refactoring.guru/design-patterns/prototype">https://refactoring.guru/design-patterns/prototype</a>
 * @since 17
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(final List<Shape> shapes, final List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        Shape shape;
        Shape shapeCopy;

        for (int i = 0; i < shapes.size(); i++) {
            shape = shapes.get(i);
            shapeCopy = shapesCopy.get(i);

            if (shape == shapeCopy) {
                System.err.println(i + ": Shape objects are the same (Booo!)");
            } else {
                System.out.println(i + ": Shapes are different objects (Yay!)");

                if (shape.equals(shapeCopy)) {
                    System.out.println(i + ": And they are identical (Yay!)");
                } else {
                    System.err.println(i + ": But they are not identical (Booo!)");
                }
            }
        }
    }
}