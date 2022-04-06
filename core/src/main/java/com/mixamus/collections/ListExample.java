package com.mixamus.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String... args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Anna");
        stringList.add("Max");
        stringList.add("Bob");
        stringList.add("Max");
        stringList.add("Melisa");
        stringList.add("Len");

        stringList.forEach(System.out::println);
    }
}
