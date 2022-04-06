package org.example.pattern_otus.singleton;

public class Singleton {

    private Singleton() {
        System.out.println("lazy creation");
    }

    static Singleton getInstance() {
        System.out.println("getInstance");
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        static {
            System.out.println("init SingletonHolder");
        }

        static final Singleton INSTANCE = new Singleton();
    }
}


class Application {
    public static void main(String... args) {
        System.out.println("--- begin ---");
        System.out.println("- singleton 1");
        Singleton singleton1 = Singleton.getInstance();

        System.out.println();
        System.out.println("- singleton 2");
        Singleton singleton2 = Singleton.getInstance();

        System.out.println();
        System.out.printf("singleton1 == singleton2 => %b\n", singleton1 == singleton2);
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println("---end ---");
    }
}

class Run {
    public static void main(String... args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("runtime.availableProcessors() = " + runtime.availableProcessors());
        System.out.println("runtime.freeMemory() = " + runtime.freeMemory());
        System.out.println("runtime.maxMemory() = " + runtime.maxMemory());
        //runtime.gc();
    }
}