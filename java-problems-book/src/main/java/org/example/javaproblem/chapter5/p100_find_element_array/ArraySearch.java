package org.example.javaproblem.chapter5.p100_find_element_array;

import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

@UtilityClass
public class ArraySearch {

    public boolean containsElement(int[] arr, int toContain) {
        return Arrays.stream(arr)
                .anyMatch(value -> value == toContain);
    }

    public <T> boolean containsElementObject(T[] arr, T toContain) {
        if (arr == null || toContain == null) {
            throw new IllegalArgumentException("None of the arguments can be null");
        }

        for (T elem : arr) {
            if (elem.equals(toContain)) {
                return true;
            }
        }
        return false;
    }

    public <E> boolean containElementComparator(E[] arr, E toContain, Comparator<? super E> comparator) {
        for (E element : arr) {
            if (comparator.compare(element, toContain) == 0) {
                return true;
            }
        }
        return false;
    }

    public int findIndexOfElement(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public int findIndexOfElementStream(int[] arr, int toFind) {
        return IntStream.range(0, arr.length)
                .filter(v -> toFind == arr[v])
                .findFirst()
                .orElse(-1);
    }

    public <T> int findIndexOfElementObjectStream(T[] arr, T toFind, Comparator<? super T> comparator) {
        return IntStream.range(0, arr.length)
                .filter(v -> comparator.compare(toFind, arr[v]) == 0)
                .findFirst()
                .orElse(-1);
    }
}
