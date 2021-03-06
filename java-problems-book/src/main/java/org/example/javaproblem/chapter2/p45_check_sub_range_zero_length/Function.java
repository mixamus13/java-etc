package org.example.javaproblem.chapter2.p45_check_sub_range_zero_length;

import java.util.Objects;

public class Function {
    private static final int N_UPPER_BOUND = 101;

    private final int n;

    public Function(int n) {
        this.n = Objects.checkIndex(n, N_UPPER_BOUND);
    }

    public int yMinusX(int x, int y) {
        Objects.checkFromToIndex(x, y, n);
        return y - x;
    }
}
