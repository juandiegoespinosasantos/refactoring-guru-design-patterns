package org.example.design_patterns.creational.singleton;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 17, 2023
 * @see <a href="https://refactoring.guru/design-patterns/singleton">https://refactoring.guru/design-patterns/singleton</a>
 * @since 17
 */
public class SingletonThreadDemo {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (Yay!)\n" +
                "If you see different values, then 2 singletons were created (Booo!)\n\n" +
                "RESULT:" + "\n");

        NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance("FOO");
        NonThreadSafeSingleton anotherSingleton = NonThreadSafeSingleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}