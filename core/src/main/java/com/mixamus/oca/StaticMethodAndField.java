package com.mixamus.oca;

import java.util.Arrays;

public class StaticMethodAndField {

    public static int count = 43;

    public static void main(String... args) {
        String[] s = new String[10];
        s[0] = "der";
        s[1] = "aer";
        s[4] = "ded";
        s[9] = "sss-ded";
        System.out.println("s = " + Arrays.toString(s));
        getInto();
    }

    private static int getInto() {
        System.out.println("count = " + count);
        return count;
    }
}
