package org.example.javaproblem.chapter2.p44_check_index_between_zero_length;

public class Main {
    public static void main(String... args) {

        int r1= Function.oneMinusY(5);
        System.out.println("r1 = " + r1);

        Function f = new Function(4);
        int r2 = f.xMinusY(3);
        System.out.println("r2 = " + r2);
    }
}
