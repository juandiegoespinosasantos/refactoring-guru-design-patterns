package org.example.design_patterns.structural.adapter;

import org.example.design_patterns.structural.adapter.adapters.SquarePegAdapter;
import org.example.design_patterns.structural.adapter.round.RoundHole;
import org.example.design_patterns.structural.adapter.round.RoundPeg;
import org.example.design_patterns.structural.adapter.square.SquarePeg;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 18, 2023
 * @see <a href="https://refactoring.guru/design-patterns/adapter">https://refactoring.guru/design-patterns/adapter</a>
 * @since 17
 */
public class AdapterDemo {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);

        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) System.out.println("Round peg r5 fits round roundHole r5.");

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        if (roundHole.fits(smallSqPegAdapter)) System.out.println("Square peg w2 fits round roundHole r5.");

        SquarePeg largeSqPeg = new SquarePeg(20);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (!roundHole.fits(largeSqPegAdapter)) System.err.println("Square peg w20 does not fit into round roundHole r5.");
    }
}