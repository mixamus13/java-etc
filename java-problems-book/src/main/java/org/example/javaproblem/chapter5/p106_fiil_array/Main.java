package org.example.javaproblem.chapter5.p106_fiil_array;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String... args) {
        int[] arr = new int[15];
        Arrays.fill(arr, 5);
        System.out.println("arr = " + Arrays.toString(arr));

        Arrays.setAll(arr, IntUnaryOperator.identity());
        System.out.println("arr = " + Arrays.toString(arr));

        double[] arrDo = new double[10];
        Arrays.setAll(arrDo, value -> value);
        System.out.println("arrDo = " + Arrays.toString(arrDo));

        Arrays.parallelSetAll(arr, IntUnaryOperator.identity());

        Arrays.parallelPrefix(arr, Integer::sum);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
