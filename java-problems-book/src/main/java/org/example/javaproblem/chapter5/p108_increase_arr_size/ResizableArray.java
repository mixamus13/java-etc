package org.example.javaproblem.chapter5.p108_increase_arr_size;

import java.util.Arrays;
import java.util.Objects;

public class ResizableArray {
    private ResizableArray() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static int[] add(int[] arr, int item) {

        if (arr == null) {
            throw new IllegalArgumentException("The given array cannot be null");
        }

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = item;

        // or, using System.arraycopy()
        // int[] newArr = new int[arr.length + 1];
        // System.arraycopy(arr, 0, newArr, 0, arr.length);
        // newArr[newArr.length - 1] = item;
        return newArr;
    }

    public static int[] remove(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("The given array cannot be null");
        }

        if (arr.length < 1) {
            throw new IllegalArgumentException("The given array length must be greater than 0");
        }

        int[] newArr = Arrays.copyOf(arr, arr.length - 1);

        // or, using System.arraycopy()
        // int[] newArr = new int[arr.length - 1];
        // System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
        return newArr;
    }

    public static int[] resize(int[] arr, int length) {
        Objects.requireNonNull(arr, "The given array cannot be null");
        if (length < 0) {
            throw new IllegalArgumentException("The given length cannot be smaller than 0");
        }
        return Arrays.copyOf(arr, arr.length + length);
    }

    public static <T> T[] addObject(T[] arr, T item) {
        Objects.requireNonNull(arr, "The given array cannot be null");
        Objects.requireNonNull(item, "The given item cannot be null");
        T[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = item;
        return newArr;
    }

    public static <T> T[] removeObject(T[] arr) {
        Objects.requireNonNull(arr, "The given array cannot be null");
        return Arrays.copyOf(arr, arr.length - 1);
    }

    public static <T> T[] resize(T[] arr, int length) {
        Objects.requireNonNull(arr, "The given array cannot be null");
        if (length < 0) {
            throw new IllegalArgumentException("The given length cannot be smaller than 0");
        }
        return Arrays.copyOf(arr, arr.length + length);
    }
}
