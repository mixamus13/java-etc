package org.example.javaproblem.chapter2.p40_checknulls_funktional_nonfunctional;

import java.util.*;

public class Main {

    public static void main(String... args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 17, 7, null);

        List<Integer> evens = Numbers.evenInteger(numbers);
        System.out.println("evens = " + evens);

        int sum = Numbers.sumIntegers(numbers);
        System.out.println("sum = " + sum);

        boolean nulls = Numbers.integersContainsNull(numbers);
        System.out.println("nulls = " + nulls);
    }

}
