package org.example.design_patterns.creational.factory_method;

import java.util.Locale;
import org.example.design_patterns.creational.factory_method.dialogs.AbstractDialog;
import org.example.design_patterns.creational.factory_method.dialogs.HtmlDialog;
import org.example.design_patterns.creational.factory_method.dialogs.LinuxDialog;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 12, 2023
 * @see <a href="https://refactoring.guru/design-patterns/factory-method">https://refactoring.guru/design-patterns/factory-method</a>
 * @since 17
 */
public class FactoryMethodDemo {

    private static AbstractDialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        String os = System.getProperty("os.name").toUpperCase(Locale.ROOT);
        System.out.println("os.name = " + os);

        dialog = os.equalsIgnoreCase("LINUX") ?
                new LinuxDialog() :
                new HtmlDialog();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
