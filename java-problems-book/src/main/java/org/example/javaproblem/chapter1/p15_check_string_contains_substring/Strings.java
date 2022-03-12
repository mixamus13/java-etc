package org.example.javaproblem.chapter1.p15_check_string_contains_substring;

import java.util.Arrays;
import java.util.Comparator;

public class Strings {

    public Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    public enum Sort {
        ASC, DESC
    }

    public static void sortArrayByLengthV1(String[] strings, Sort direction) {
        if (direction.equals(Sort.ASC)) {
            Arrays.sort(strings, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        } else {
            Arrays.sort(strings, (o1, o2) -> (-1) * Integer.compare(o1.length(), o2.length()));
        }
    }

    public static void sortArrayByLengthV2(String[] strings, Sort direction) {
        if (direction.equals(Sort.DESC)) {
            Arrays.sort(strings, Comparator.comparingInt(String::length));
        } else {
            Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());
        }
    }

    public static String[] sortArrayByLengthV3(String[] strings, Sort direction) {
        return direction.equals(Sort.ASC) ? Arrays.stream(strings)
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new) : Arrays.stream(strings)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toArray(String[]::new);
    }
}
