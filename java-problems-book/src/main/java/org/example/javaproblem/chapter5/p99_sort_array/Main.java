package org.example.javaproblem.chapter5.p99_sort_array;

import org.springframework.util.comparator.Comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<Melon> melons = new ArrayList<>();
        melons.add(new Melon("Red", 3));
        melons.add(new Melon("Zolo", 73));
        melons.add(new Melon("Black", 23));
        melons.add(new Melon("Yellow", 1));
        melons.add(new Melon("White", 6));


        var melonList = melons.stream()
                .sorted(Comparator.comparing(Melon::getWeight))
                .toList();
        melonList.forEach(System.out::println);

        Integer[] integers = new Integer[]{3, 1, 5};
        Arrays.sort(integers);
        System.out.println("integers  sort order = " + Arrays.toString(integers));

        Arrays.sort(integers, Collections.reverseOrder());
        System.out.println("integers  reverse order = " + Arrays.toString(integers));
    }
}

class Bubble {
    public static void main(String... args) {
        Comparator<Melon> byType = Comparator.comparing(Melon::getType);
        int[] arr = new int[]{1, 4, 8, 3, 4, 5, 98, 6, 23, 340};
        bubbleSort(arr);
        bubbleSortOptimized(arr);

    }

    public static void bubbleSort(int[] arr) {
        var n = arr.length;
        for (var i = 0; i < n - 1; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    var temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimized(int[] arr) {
        var n = arr.length;
        while (n != 0) {
            int swap = 0;
            for (var i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    var temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    swap = i;
                }
            }
            n = swap;
        }
    }

    public static <T> void bubbleSortWithComparator(T arr[], Comparator<? super T> comparator) {
        var n = arr.length;
        for (var i = 0; i < n - 1; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
