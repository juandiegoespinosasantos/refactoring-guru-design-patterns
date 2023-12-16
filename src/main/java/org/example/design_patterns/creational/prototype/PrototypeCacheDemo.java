package org.example.design_patterns.creational.prototype;

import org.example.design_patterns.creational.prototype.cache.BundledShapeCache;
import org.example.design_patterns.creational.prototype.shapes.Shape;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 16, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/prototype">https://refactoring.guru/design-patterns/prototype</a>
 */
public class PrototypeCacheDemo {

    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if ((shape1 != shape2) && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (Yay!)");
        } else {
            System.err.println("Big green circle == Medium blue rectangle (Booo!)");
        }

        if (shape2 == shape3) {
            System.err.println("Rectangle objects are the same (Booo!)");
        } else {
            System.out.println("Medium blue rectangles are two different objects (Yay!)");

            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (Yay!)");
            } else {
                System.err.println("But they are not identical (Booo!)");
            }
        }
    }
}