package org.example.javaproblem.chapter5.p125_tuple;

import lombok.Value;

import java.util.Map;

@Value
public class Pair<L, R> {
    L left;
    R right;

    public static <L, R> Pair<L, R> of(L left, R right) {
        return new Pair<>(left, right);
    }
}
