package com.mixamus.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListExample {
    public static void main(String... args) {
        List<String> concurrent = new CopyOnWriteArrayList<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("Anna");
        stringList.add("Max");
        stringList.add("Bob");
        stringList.add("Max");
        stringList.add("Melisa");
        stringList.add("Len");
        stringList.add(null);

        stringList.forEach(System.out::println);
    }
}


class LinkedListExample {
    public static void main(String... args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("Anna");
        stringList.add("Max");
        stringList.add("Bob");
        stringList.add("Max");
        stringList.add(null);
        stringList.add("Melisa");
        stringList.add("Len");

        stringList.forEach(System.out::println);
    }
}