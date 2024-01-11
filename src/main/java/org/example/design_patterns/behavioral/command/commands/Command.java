package org.example.design_patterns.behavioral.command.commands;

import org.example.design_patterns.behavioral.command.editor.Editor;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 10, 2024
 * @see <a href="https://refactoring.guru/design-patterns/command">https://refactoring.guru/design-patterns/command</a>
 * @since 17
 */
public abstract class Command {

    public Editor editor;
    private String backup;

    protected Command(Editor editor) {
        this.editor = editor;
    }

    public abstract boolean execute();

    public void undo() {
        editor.textField.setText(backup);
    }

    void backup() {
        backup = editor.textField.getText();
    }
}