package org.example.design_patterns.structural.flyweight.forest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.example.design_patterns.structural.flyweight.trees.Tree;
import org.example.design_patterns.structural.flyweight.trees.TreeFactory;
import org.example.design_patterns.structural.flyweight.trees.TreeType;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 02, 2024
 * @see <a href="https://refactoring.guru/design-patterns/flyweight">https://refactoring.guru/design-patterns/flyweight</a>
 * @since 17
 */
public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();

    @Override
    public void paint(Graphics g) {
        trees.forEach(tree -> tree.draw(g));
    }

    public void planTree(final int x, final int y, final String name, final Color color, final String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }
}