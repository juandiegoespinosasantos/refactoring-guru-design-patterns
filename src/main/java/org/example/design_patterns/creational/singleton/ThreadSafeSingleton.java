package org.example.design_patterns.creational.singleton;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 17, 2023
 * @see <a href="https://refactoring.guru/design-patterns/singleton">https://refactoring.guru/design-patterns/singleton</a>
 * @since 17
 */
public final class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    public String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        ThreadSafeSingleton result = instance;

        if (result != null) return result;

        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) instance = new ThreadSafeSingleton(value);

            return instance;
        }
    }
}