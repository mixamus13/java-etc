package com.mixamus.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String... args) {
        Set<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(54);
        treeSet.add(4);
        treeSet.add(23);
        treeSet.add(1);
        treeSet.add(434);
        //treeSet.add(null);
        treeSet.forEach(System.out::println);
    }
}
