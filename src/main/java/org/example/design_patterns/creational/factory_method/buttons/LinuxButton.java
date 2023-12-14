package org.example.design_patterns.creational.factory_method.buttons;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 12, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/factory-method">https://refactoring.guru/design-patterns/factory-method</a>
 */
public class LinuxButton implements IButton {

    private final JPanel panel = new JPanel();
    private final JFrame frame = new JFrame();
    private JButton button;

    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = buildLabel();

        frame.getContentPane().add(panel);
        panel.add(label);

        onClick();

        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);

        onClick();
    }

    @Override
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(event -> {
            frame.setVisible(false);
            System.exit(0);
        });
    }

    private JLabel buildLabel() {
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(253, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setLayout(new FlowLayout(FlowLayout.CENTER));

        return label;
    }
}