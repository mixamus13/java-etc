package com.mixamus.oca;

public class ImmutableApp {
    public static void main(String... args) {
        String name1 = new String("Pushok");
        String name2 = "Pushok";

        System.out.println(name1);
        System.out.println(name2);

        System.out.println(Integer.toHexString(name1.hashCode()));
    }
}
