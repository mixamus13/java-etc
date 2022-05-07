package com.mixamus.oca;

public class J05_OverloadVararg {

    public static void main(String... args) {
        fly(1, 2, 3);
        fly(new int[]{1, 2, 3});
    }

    public static void fly(int... leno) { }
}
