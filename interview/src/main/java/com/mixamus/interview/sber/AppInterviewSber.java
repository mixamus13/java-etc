package com.mixamus.interview.sber;

import java.util.ArrayList;
import java.util.List;

public class AppInterviewSber {

    public static void main(String... args) {
        final List<Integer> integers = new ArrayList<>();
        integers.add(3);
        //integers = new ArrayList<>();
    }
}

class ApplicationSearchNumbers {
    public static void main(String... args) {
        Integer[] numbers = {3, 34, 1, -45, 4, 72, 9, 34, 5, 7, 26};
        Integer near = 6;

        System.out.println("getNearNumberOne(numbers) = " + getNearNumberOne(numbers, near));
    }

    public static Integer getNearNumberOne(Integer[] numbers, Integer target) {
        int max = Integer.MAX_VALUE;
        Integer result = target;
        for (var v : numbers) {
            final int diff = Math.abs(v - target);
            if (diff < max) {
                max = diff;
                result = v;
            }
        }
        return result;
    }
}
