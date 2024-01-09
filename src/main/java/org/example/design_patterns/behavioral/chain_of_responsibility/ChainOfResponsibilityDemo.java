package org.example.design_patterns.behavioral.chain_of_responsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.example.design_patterns.behavioral.chain_of_responsibility.middleware.Middleware;
import org.example.design_patterns.behavioral.chain_of_responsibility.middleware.RoleCheckMiddleware;
import org.example.design_patterns.behavioral.chain_of_responsibility.middleware.ThrottlingMiddleware;
import org.example.design_patterns.behavioral.chain_of_responsibility.middleware.UserExistsMiddleware;
import org.example.design_patterns.behavioral.chain_of_responsibility.server.Server;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 08, 2024
 * @see <a href="https://refactoring.guru/design-patterns/chain-of-responsibility">https://refactoring.guru/design-patterns/chain-of-responsibility</a>
 * @since 17
 */
public class ChainOfResponsibilityDemo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void main(String[] args) throws IOException {
        init();

        boolean success = false;

        while (!success) {
            System.out.print("Enter email: ");
            String email = reader.readLine();

            System.out.print("Enter password: ");
            String password = reader.readLine();

            success = server.login(email, password);
        }
    }

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }
}