package org.example.design_patterns.structural.composite.editor;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import org.example.design_patterns.structural.composite.shapes.CompoundShape;
import org.example.design_patterns.structural.composite.shapes.IShape;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 21, 2023
 * @see <a href="https://refactoring.guru/design-patterns/composite">https://refactoring.guru/design-patterns/composite</a>
 * @since 17
 */
public class ImageEditor {

    private EditorCanvas canvas;
    private CompoundShape allShapes = new CompoundShape();

    public ImageEditor() {
        canvas = new EditorCanvas();
    }

    public void loadShapes(IShape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    private class EditorCanvas extends Canvas {
        JFrame frame;

        private static final int PADDING = 10;

        EditorCanvas() {
            createFrame();
            refresh();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent event) {
                    allShapes.unSelect();
                    allShapes.selectChildAt(event.getX(), event.getY());
                    event.getComponent().repaint();
                }
            });
        }

        void createFrame() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel contentPanel = new JPanel();
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPanel.setBorder(padding);
            frame.setContentPane(contentPanel);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        @Override
        public int getWidth() {
            return allShapes.getX() + allShapes.getWidth() + PADDING;
        }

        @Override
        public int getHeight() {
            return allShapes.getY() + allShapes.getHeight() + PADDING;
        }

        @Override
        public void paint(Graphics graphics) {
            allShapes.paint(graphics);
        }

        void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }
    }
}