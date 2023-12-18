package org.example.design_patterns.creational.singleton;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 17, 2023
 * @see <a href="https://refactoring.guru/design-patterns/singleton">https://refactoring.guru/design-patterns/singleton</a>
 * @since 17
 */
public final class NonThreadSafeSingleton {

    private static NonThreadSafeSingleton instance;

    public String value;

    private NonThreadSafeSingleton(String value) {
        try {
            Thread.sleep(1_000L);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        this.value = value;
    }

    public static NonThreadSafeSingleton getInstance(String value) {
        if (instance == null) instance = new NonThreadSafeSingleton(value);

        return instance;
    }
}