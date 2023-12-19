package org.example.design_patterns.structural.adapter.square;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 18, 2023
 * @see <a href="https://refactoring.guru/design-patterns/adapter">https://refactoring.guru/design-patterns/adapter</a>
 * @since 17
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class SquarePeg {

    private double width;

    public double getSquare() {
        return Math.pow(width, 2);
    }
}