package com.mixamus.oca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String... args) {
        List<String> list0 = new ArrayList<>();
        List<String> list01 = new ArrayList<>();
        ArrayList list1 = new ArrayList<>(Collections.emptySet());
        ArrayList list2 = new ArrayList<>(13);
        List<String> list3 = Collections.synchronizedList(new ArrayList<>());
        list3.add("nax");
        list3.add("pop");
        list3.add(0, "der");
        list3.add("asa");
        list3.add("wwww");
        list3.remove("wwww");
        list3.set(2, "MIXAMUS");
        System.out.println("contains = " + list3.contains("aesa"));
        for (String s : list3) {
            System.out.println(s);
        }
        System.out.println("equals = " + list0.equals(list01));
        list3.clear();
        list3.forEach(System.out::println);
    }
}
