package org.example.javaproblem.chapter5.p125_tuple;

import org.example.javaproblem.chapter5.p120_filter_collection_by_list.Employee;

import java.util.Comparator;
import java.util.Map;

public class Bounds {

    public static <T> Map.Entry<T, T> arrayV1(T[] arr, Comparator<? super T> comparator) {
        T min = arr[0];
        T max = arr[0];

        for (T elem : arr) {
            if (comparator.compare(min, elem) > 0) {
                min = elem;
            } else if (comparator.compare(max, elem) < 0) {
                max = elem;
            }
        }
        return Map.entry(min, max);
    }

    public static <T> Pair<T, T> arrayV2(T[] arr, Comparator<? super T> comparator) {
        T min = arr[0];
        T max = arr[0];

        for (T elem : arr) {
            if (comparator.compare(min, elem) > 0) {
                min = elem;
            } else if (comparator.compare(max, elem) < 0) {
                max = elem;
            }
        }
        return Pair.of(min, max);
    }
}
