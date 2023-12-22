package org.example.design_patterns.structural.composite.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 21, 2023
 * @see <a href="https://refactoring.guru/design-patterns/composite">https://refactoring.guru/design-patterns/composite</a>
 * @since 17
 */
public class CompoundShape extends BaseShape {

    protected List<IShape> children = new ArrayList<>();

    public CompoundShape(IShape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    @Override
    public int getX() {
        if (children.isEmpty()) return 0;

        int x = children.get(0).getX();

        for (IShape child : children) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }

        return x;
    }

    @Override
    public int getY() {
        if (children.isEmpty()) return 0;

        int y = children.get(0).getY();

        for (IShape child : children) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }

        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();

        for (IShape child : children) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();

            if (childWidth > maxWidth) maxWidth = childWidth;
        }

        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();

        for (IShape child : children) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();

            if (childHeight > maxHeight) maxHeight = childHeight;
        }

        return maxHeight;
    }

    @Override
    public void move(int x, int y) {
        children.forEach(child -> child.move(x, y));
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        for (IShape child : children) {
            if (child.isInsideBounds(x, y)) return true;
        }

        return false;
    }

    @Override
    public void unSelect() {
        super.unSelect();

        children.forEach(IShape::unSelect);
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        children.forEach(child -> child.paint(graphics));
    }

    public void add(IShape component) {
        children.add(component);
    }

    public void add(IShape... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(IShape child) {
        children.remove(child);
    }

    public void remove(IShape... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    public boolean selectChildAt(int x, int y) {
        for (IShape child : children) {
            if (child.isInsideBounds(x, y)) {
                child.select();
                return true;
            }
        }

        return false;
    }
}