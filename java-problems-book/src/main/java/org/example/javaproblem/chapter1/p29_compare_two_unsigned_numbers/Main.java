package org.example.javaproblem.chapter1.p29_compare_two_unsigned_numbers;

public class Main {

    public static void main(String... args) {

        int resultSigned = Integer.compare(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int resultUnsigned = Integer.compareUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println("Signed ints: " + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE);
        System.out.println("-----------------------------------------------");
        System.out.println("Result of comparing signed: " + resultSigned);
        System.out.println("Result of comparing unsigned: " + resultUnsigned);
    }
}
