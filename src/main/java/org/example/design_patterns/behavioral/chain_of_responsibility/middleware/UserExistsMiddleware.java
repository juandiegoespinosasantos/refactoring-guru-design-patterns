package org.example.design_patterns.behavioral.chain_of_responsibility.middleware;

import lombok.AllArgsConstructor;
import org.example.design_patterns.behavioral.chain_of_responsibility.server.Server;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 08, 2024
 * @see <a href="https://refactoring.guru/design-patterns/chain-of-responsibility">https://refactoring.guru/design-patterns/chain-of-responsibility</a>
 * @since 17
 */
@AllArgsConstructor
public class UserExistsMiddleware extends Middleware {

    private Server server;


    @Override
    public boolean check(final String email, final String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");

            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");

            return false;
        }

        return checkNext(email, password);
    }
}