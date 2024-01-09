package org.example.design_patterns.behavioral.chain_of_responsibility.middleware;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 08, 2024
 * @see <a href="https://refactoring.guru/design-patterns/chain-of-responsibility">https://refactoring.guru/design-patterns/chain-of-responsibility</a>
 * @since 17
 */
public class ThrottlingMiddleware extends Middleware {

    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(final String email, final String password) {
        long now = System.currentTimeMillis();

        if (now > (currentTime + 60_000L)) {
            request = 0;
            currentTime = now;
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }

        return checkNext(email, password);
    }
}