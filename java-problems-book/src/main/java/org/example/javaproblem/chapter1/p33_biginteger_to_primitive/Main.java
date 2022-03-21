package org.example.javaproblem.chapter1.p33_biginteger_to_primitive;

import java.math.BigInteger;

public class Main {

    public static void main(String... args) {

        // 9_223_372_036_854_775_807
        BigInteger nr = BigInteger.valueOf(Long.MAX_VALUE);
        long nrLong = nr.longValue();
        System.out.println(nr + " as long is: " + nrLong);

        int nrInt = nr.intValue();
        System.out.println(nr + " as int is: " + nrInt);

        short nrShort = nr.shortValue();
        System.out.println(nr + " as short is: " + nrShort);

        byte nrByte = nr.byteValue();
        System.out.println(nr + " as byte is: " + nrByte);

        System.out.println("--------------------------------------------------");

        long nrExactLong = nr.longValueExact(); // ok
        System.out.println(nr + " as exact long is: " + nrExactLong);

        int nrExactInt = nr.intValueExact(); // ArithmeticException
        System.out.println(nr + " as exact int is: " + nrExactInt);

        short nrExactShort = nr.shortValueExact(); // ArithmeticException
        System.out.println(nr + " as exact short is: " + nrExactShort);

        byte nrExactByte = nr.byteValueExact(); // ArithmeticException
        System.out.println(nr + " as exact byte is: " + nrExactByte);
    }
}
