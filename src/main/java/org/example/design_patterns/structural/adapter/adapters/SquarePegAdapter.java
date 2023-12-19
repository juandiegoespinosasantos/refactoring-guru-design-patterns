package org.example.design_patterns.structural.adapter.adapters;

import org.example.design_patterns.structural.adapter.round.RoundPeg;
import org.example.design_patterns.structural.adapter.square.SquarePeg;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 18, 2023
 * @see <a href="https://refactoring.guru/design-patterns/adapter">https://refactoring.guru/design-patterns/adapter</a>
 * @since 17
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double a = peg.getWidth() / 2;
        double b = Math.pow(a, 2);

        return Math.sqrt(b * 2);
    }
}