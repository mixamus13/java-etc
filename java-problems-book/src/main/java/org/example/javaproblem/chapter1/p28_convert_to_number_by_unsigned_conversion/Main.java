package org.example.javaproblem.chapter1.p28_convert_to_number_by_unsigned_conversion;

public class Main {

    public static void main(String... args) {

        long result = Integer.toUnsignedLong(Integer.MIN_VALUE);

        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Result: " + result);

        System.out.println();

        int result1 = Short.toUnsignedInt(Short.MIN_VALUE);
        int result2 = Short.toUnsignedInt(Short.MAX_VALUE);

        System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE + " Short.MAX_VALUE: " + Short.MAX_VALUE);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
