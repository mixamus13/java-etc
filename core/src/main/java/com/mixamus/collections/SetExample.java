package com.mixamus.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetExample {
    public static void main(String... args) {
        Set<String> concurrent = new ConcurrentSkipListSet<>();
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Anna");
        stringSet.add("Max");
        stringSet.add("Bob");
        stringSet.add("Max");
        stringSet.add("Melisa");
        stringSet.add("Len");
        stringSet.add(null);
        stringSet.add("Fred");
        stringSet.add("Lora");

        stringSet.forEach(System.out::println);
    }
}

class SetExampleContains {
    public static void main(String... args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Anna");
        stringSet.add("Lora");
        stringSet.add("Max");
        stringSet.add("Bob");
        stringSet.add("Melisa");

        System.out.println("contains = " + stringSet.contains("Anna"));

    }
}