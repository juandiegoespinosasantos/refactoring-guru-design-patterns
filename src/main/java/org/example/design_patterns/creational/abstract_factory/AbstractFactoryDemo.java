package org.example.design_patterns.creational.abstract_factory;

import java.util.Locale;
import org.example.design_patterns.creational.abstract_factory.factories.IGUIFactory;
import org.example.design_patterns.creational.abstract_factory.factories.LinuxFactory;
import org.example.design_patterns.creational.abstract_factory.factories.MacOSFactory;
import org.example.design_patterns.creational.abstract_factory.factories.WindowsFactory;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 13, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/abstract-factory">https://refactoring.guru/design-patterns/abstract-factory</a>
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        String os = System.getProperty("os.name").toUpperCase(Locale.ROOT);
        System.out.println("os.name = " + os);

        IGUIFactory factory = switch (os) {
            case "LINUX" -> new LinuxFactory();
            case "MAC" -> new MacOSFactory();
            default -> new WindowsFactory();
        };

        return new Application(factory);
    }
}