package com.mixamus.oca;

public class Equality {
    public static void main(String... args) {
        String x = "Hello";
        String y = " Hello".trim();

        System.out.println(x == y);

        System.out.println(x.equals(y));
    }
}
