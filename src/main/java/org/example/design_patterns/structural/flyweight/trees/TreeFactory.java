package org.example.design_patterns.structural.flyweight.trees;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 02, 2024
 * @see <a href="https://refactoring.guru/design-patterns/flyweight">https://refactoring.guru/design-patterns/flyweight</a>
 * @since 17
 */
public class TreeFactory {

    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(final String name, final Color color, final String otherTreeData) {
        TreeType resp = treeTypes.get(name);

        if (resp == null) {
            resp = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, resp);
        }

        return resp;
    }
}