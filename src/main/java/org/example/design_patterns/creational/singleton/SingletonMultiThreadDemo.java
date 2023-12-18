package org.example.design_patterns.creational.singleton;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 17, 2023
 * @see <a href="https://refactoring.guru/design-patterns/singleton">https://refactoring.guru/design-patterns/singleton</a>
 * @since 17
 */
public class SingletonMultiThreadDemo {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (Yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (Booo!)" + "\n\n" +
                "RESULT:" + "\n");

        nonSafeThreadDemo();
//        safeThreadDemo();
    }

    private static void nonSafeThreadDemo() {
        Thread threadFoo = new Thread(new NonThreadSafeFoo());
        Thread threadBar = new Thread(new NonThreadSafeBar());

        threadFoo.start();
        threadBar.start();
    }

    private static void safeThreadDemo() {
        Thread threadFoo = new Thread(new ThreadSafeFoo());
        Thread threadBar = new Thread(new ThreadSafeBar());

        threadFoo.start();
        threadBar.start();
    }

    static class NonThreadSafeFoo implements Runnable {
        @Override
        public void run() {
            NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class NonThreadSafeBar implements Runnable {
        @Override
        public void run() {
            NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSafeFoo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSafeBar implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}