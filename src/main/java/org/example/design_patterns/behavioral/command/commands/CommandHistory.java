package org.example.design_patterns.behavioral.command.commands;

import java.util.Stack;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 10, 2024
 * @see <a href="https://refactoring.guru/design-patterns/command">https://refactoring.guru/design-patterns/command</a>
 * @since 17
 */
public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(final Command command) {
        history.push(command);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}