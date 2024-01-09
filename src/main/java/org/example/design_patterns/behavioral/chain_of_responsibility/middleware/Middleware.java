package org.example.design_patterns.behavioral.chain_of_responsibility.middleware;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 08, 2024
 * @see <a href="https://refactoring.guru/design-patterns/chain-of-responsibility">https://refactoring.guru/design-patterns/chain-of-responsibility</a>
 * @since 17
 */
public abstract class Middleware {

    private Middleware next;

    public abstract boolean check(String email, String password);

    public static Middleware link(final Middleware first, final Middleware... chain) {
        Middleware head = first;

        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }

        return first;
    }

    protected boolean checkNext(final String email, final String password) {
        return (next == null) || next.check(email, password);
    }
}