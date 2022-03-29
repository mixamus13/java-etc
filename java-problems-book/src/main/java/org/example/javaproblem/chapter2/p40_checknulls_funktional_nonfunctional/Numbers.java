package org.example.javaproblem.chapter2.p40_checknulls_funktional_nonfunctional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Numbers {

    private Numbers() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static List<Integer> evenInteger(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> events = new ArrayList<>();
        for (Integer nr : integers) {
            if (Objects.nonNull(nr) && nr % 2 == 0) {
                events.add(nr);
            }
        }

        return events;
    }

    public static int sumIntegers(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            throw new IllegalArgumentException("List cannot be null");
        }

        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();
    }

    public static boolean integersContainsNull(List<Integer> integers) {
        if (Objects.isNull(integers)) {
            return false;
        }

        return integers.stream()
                .anyMatch(Objects::nonNull);
    }
}
