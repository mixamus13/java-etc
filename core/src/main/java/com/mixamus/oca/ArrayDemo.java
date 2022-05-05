package com.mixamus.oca;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String... args) {
        int[] numbers = new int[]{34, 56, 123};
        System.out.println("numbers = " + Arrays.toString(numbers));

        String[] birds = {"попугай", "канарейка", "ворона"};
        String[] alias = birds;
        System.out.println("birds.equals(alias) = " + Arrays.equals(birds, alias));
        System.out.println("Arrays.toString(birds) = " + Arrays.toString(birds));

        String [] strings = new String[20];
        strings [13] = "maximusys33-->";
        strings [6] = "poliogo14-->";
        System.out.println("strings = " + Arrays.toString(strings));

        int[] sum = new int[10];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = i + 5;
        }
    }
}
