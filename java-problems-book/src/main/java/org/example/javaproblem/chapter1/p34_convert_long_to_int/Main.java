package org.example.javaproblem.chapter1.p34_convert_long_to_int;

public class Main {

    public static void main(String... args) {

        long nrLong = Integer.MAX_VALUE;
        long nrMaxLong = Long.MAX_VALUE;

        int intNrCast = (int) nrLong; // Ok
        int intNrMaxCast = (int) nrMaxLong; // Not ok
        System.out.println("Cast Integer.MAX_VALUE: " + intNrCast);
        System.out.println("Cast Long.MAX_VALUE: " + intNrMaxCast);

        int intNrValue = Long.valueOf(nrLong).intValue(); // Ok
        int intNrMaxValue = Long.valueOf(nrMaxLong).intValue(); // Not ok

        System.out.println();
        System.out.println("intValue() Integer.MAX_VALUE: " + intNrValue);
        System.out.println("intValue() Long.MAX_VALUE: " + intNrMaxValue);

        int intNrExact = Math.toIntExact(nrLong); // Ok
        //int intNrMaxExact = Math.toIntExact(nrMaxLong); // ArithmeticException
        System.out.println("intNrExact = " + intNrExact);
        //System.out.println("intNrMaxExact = " + intNrMaxExact);
    }
}
