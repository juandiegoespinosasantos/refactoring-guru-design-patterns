package org.example.design_patterns.structural.flyweight;

import java.awt.Color;
import org.example.design_patterns.structural.flyweight.forest.Forest;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 02, 2024
 * @see <a href="https://refactoring.guru/design-patterns/flyweight">https://refactoring.guru/design-patterns/flyweight</a>
 * @since 17
 */
public class FlyweightDemo {

    private static final int CANVAS_SIZE = 500;
    private static final int TREES_TO_DRAW = 1_000_000;
    private static final int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.planTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN,
                    "Oak texture stub");
            forest.planTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE,
                    "Autumn Oak texture stub");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("-".repeat(80));
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("-".repeat(80));
        System.out.println("Total: " + convertToMb((TREES_TO_DRAW * 8) + (TREE_TYPES * 30)) + "MB " +
                "(instead of " + convertToMb(TREES_TO_DRAW * 38) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private static int convertToMb(final int x) {
        return (x / 1_024) / 1_024;
    }
}
