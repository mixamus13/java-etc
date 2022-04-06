package org.example.pattern_otus.singleton;

import java.util.Objects;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new LazySingleton();
        }
        return instance;
    }
}


class LazySingletonDemo {
    public static void main(String... args) {

        System.out.println("--- begin ---");

        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.printf("singleton1 == singleton2 => %b\n", singleton1 == singleton2);
        System.out.println("---end ---");
    }
}