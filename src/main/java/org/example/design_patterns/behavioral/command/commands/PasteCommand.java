package org.example.design_patterns.behavioral.command.commands;

import org.example.design_patterns.behavioral.command.editor.Editor;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 10, 2024
 * @see <a href="https://refactoring.guru/design-patterns/command">https://refactoring.guru/design-patterns/command</a>
 * @since 17
 */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if ((editor.clipboard == null) || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());

        return true;
    }
}