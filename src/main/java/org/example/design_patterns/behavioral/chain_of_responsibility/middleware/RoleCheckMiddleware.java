package org.example.design_patterns.behavioral.chain_of_responsibility.middleware;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 08, 2024
 * @see <a href="https://refactoring.guru/design-patterns/chain-of-responsibility">https://refactoring.guru/design-patterns/chain-of-responsibility</a>
 * @since 17
 */
public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(final String email, final String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");

            return true;
        }

        System.out.println("Hello, user!");

        return checkNext(email, password);
    }
}