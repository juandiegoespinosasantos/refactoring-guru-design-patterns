package org.example.design_patterns.creational.factory_method;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 12, 2023
 * @since 17
 * @see <a href="https://refactoring.guru/design-patterns/factory-method">https://refactoring.guru/design-patterns/factory-method</a>
 */
public class FactoryMethodDemo {

    private static AbstractDialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        String os = System.getProperty("os.name");
        System.out.println("os.name = " + os);

        if (os.equals("Linux")) {
            dialog = new LinuxDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
