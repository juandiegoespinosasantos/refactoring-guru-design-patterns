package org.example.design_patterns.creational.builder.components;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 17, 2023
 * @see <a href="https://refactoring.guru/design-patterns/builder">https://refactoring.guru/design-patterns/builder</a>
 * @since 17
 */
@NoArgsConstructor
@Getter
@Setter
public class GPSNavigator {

    private String route;

    public GPSNavigator(String route) {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }
}