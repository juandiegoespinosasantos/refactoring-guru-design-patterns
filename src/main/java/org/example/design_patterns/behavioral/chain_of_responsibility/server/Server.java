package org.example.design_patterns.behavioral.chain_of_responsibility.server;

import java.util.HashMap;
import java.util.Map;
import org.example.design_patterns.behavioral.chain_of_responsibility.middleware.Middleware;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 08, 2024
 * @see <a href="https://refactoring.guru/design-patterns/chain-of-responsibility">https://refactoring.guru/design-patterns/chain-of-responsibility</a>
 * @since 17
 */
public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean login(final String email, final String password) {
        if (!middleware.check(email, password)) return false;

        System.out.println("Authorization have been successful!");

        return true;
    }

    public void register(final String email, final String password) {
        users.put(email, password);
    }

    public boolean hasEmail(final String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(final String email, final String password) {
        return users.get(email).equals(password);
    }
}