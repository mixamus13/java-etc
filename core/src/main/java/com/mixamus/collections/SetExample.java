package com.mixamus.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String... args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Anna");
        stringSet.add("Max");
        stringSet.add("Bob");
        stringSet.add("Max");
        stringSet.add("Melisa");
        stringSet.add("Len");
        stringSet.add("Fred");
        stringSet.add("Lora");

        stringSet.forEach(System.out::println);
    }
}
