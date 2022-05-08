package com.mixamus.oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class J02_OptionalSpecifiers {

    /**
     * static
     * abstract
     * final
     * synchronized
     * native
     * strictfp
     */

    public final static void mains(String... args) {

    }

    abstract void walk1();


    public static void main(String... args) {
        List<String> of = new ArrayList<>();
        of.add("Maxim");
        of.add("Milena");
        List<String> anInt = getInt(of, "we", "w", "43", "12", "45", Arrays.toString(of.toArray()));
        System.out.println("anInt = " + anInt);
        get();
    }


    public static void get() {
        return;
    }

    static int getInt(int a) {
        return 23;
    }
    int getInt(int a, int b) {
        return 23;
    }

    static List<String> getInt(List<String> a, String... b) {
        return List.of(b);
    }

    int getInt(int a, float b) {
        return 23;
    }

    static int getInt(byte a, int b) {
        return 23;
    }
}

class Application2 {}
