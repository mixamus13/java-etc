package org.example.javaproblem.chapter2.p45_check_sub_range_zero_length;

public class Main {
    public static void main(String... args) {
        Function f = new Function(50);

        int r = f.yMinusX(10, 30);
        System.out.println("r=" + r);
    }
}
