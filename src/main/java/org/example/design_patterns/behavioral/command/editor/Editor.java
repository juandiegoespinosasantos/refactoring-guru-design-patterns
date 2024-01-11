package org.example.design_patterns.behavioral.command.editor;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import org.example.design_patterns.behavioral.command.commands.Command;
import org.example.design_patterns.behavioral.command.commands.CommandHistory;
import org.example.design_patterns.behavioral.command.commands.CopyCommand;
import org.example.design_patterns.behavioral.command.commands.CutCommand;
import org.example.design_patterns.behavioral.command.commands.PasteCommand;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 10, 2024
 * @see <a href="https://refactoring.guru/design-patterns/command">https://refactoring.guru/design-patterns/command</a>
 * @since 17
 */
public class Editor {

    private CommandHistory history = new CommandHistory();
    public JTextArea textField;
    public String clipboard;

    public void init() {
        JPanel content = new JPanel();

        JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Editor editor = this;

        JButton ctrlC = createButton("Ctrl+C", new CopyCommand(editor));
        buttons.add(ctrlC);

        JButton ctrlX = createButton("Ctrl+X", new CutCommand(editor));
        buttons.add(ctrlX);

        JButton ctrlV = createButton("Ctrl+V", new PasteCommand(editor));
        buttons.add(ctrlV);

        JButton ctrlZ = new JButton("Ctrl+Z");
        ctrlZ.addActionListener(e -> undo());
        buttons.add(ctrlZ);

        content.add(buttons);

        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JButton createButton(final String label, final Command command) {
        JButton button = new JButton(label);
        button.addActionListener(e -> executeCommand(command));

        return button;
    }

    private void executeCommand(final Command command) {
        if (command.execute()) history.push(command);
    }

    private void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) command.undo();
    }
}