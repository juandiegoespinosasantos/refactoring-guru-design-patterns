package org.example.design_patterns.creational.prototype.cache;

import java.util.HashMap;
import java.util.Map;
import org.example.design_patterns.creational.prototype.shapes.Circle;
import org.example.design_patterns.creational.prototype.shapes.Rectangle;
import org.example.design_patterns.creational.prototype.shapes.Shape;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 16, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/prototype">https://refactoring.guru/design-patterns/prototype</a>
 */
public class BundledShapeCache {

    private final Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.setX(5);
        circle.setY(7);
        circle.setRadius(45);
        circle.setColor("Green");
        cache.put("Big green circle", circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(6);
        rectangle.setY(9);
        rectangle.setWidth(8);
        rectangle.setHeight(10);
        rectangle.setColor("Blue");
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(final String key, final Shape shape) {
        return cache.put(key, shape);
    }

    public Shape get(final String key) {
        return cache.get(key);
    }
}