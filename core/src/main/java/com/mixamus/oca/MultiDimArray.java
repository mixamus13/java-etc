package com.mixamus.oca;

import java.util.Arrays;

public class MultiDimArray {
    public static void main(String... args) {
        int[][] vars1 = new int[3][3];
        vars1[1][2] = 4;

        String[][] rectangle = new String[3][2];
        rectangle[0][1] = "set";
        System.out.println("rectangle = " + Arrays.deepToString(rectangle));

        int[][] different = {{1, 4}, {3}, {9, 8, 7}, {1, 2, 3}};
        System.out.println("different = " + Arrays.deepToString(different));
        String[][][] f = new String[3][3][3];
        f[1][2][2] = "forto";
        System.out.println("f = " + Arrays.deepToString(f));

        for (int i = 0; i < vars1.length; i++) {
            for (int j = 0; j < vars1[i].length; j++) {
                System.out.print(vars1[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("======================================");

        for (int[] ints : different) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }

        System.out.println("======================================");

        for (String[][] strings : f) {
            for (int j = 0; j < strings.length; j++) {
                for (int k = 0; k < f[j].length; k++) {
                    System.out.print(strings[j][k] + "  ");
                }
            }
            System.out.println();
        }
    }
}
