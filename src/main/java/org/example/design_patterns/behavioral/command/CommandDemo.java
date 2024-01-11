package org.example.design_patterns.behavioral.command;

import org.example.design_patterns.behavioral.command.editor.Editor;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 10, 2024
 * @see <a href="https://refactoring.guru/design-patterns/command">https://refactoring.guru/design-patterns/command</a>
 * @since 17
 */
public class CommandDemo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}