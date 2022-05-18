package org.example.javaproblem.chapter5.p104_reverce_array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String... args) {
        int[] integers = {-1, 2, 3, 1, 4, 5, 3, 2, 22};
        Melon[] melons = {new Melon("Crenshaw", 2000), new Melon("Gac", 3200), new Melon("Bitter", 5200)};

        IntStream intStream = IntStream.rangeClosed(1, integers.length)
                .map(o -> integers[integers.length - o]);
        intStream.forEach(System.out::println);

        System.out.println("before melons = " + Arrays.toString(melons));
        //Collections.reverse(Arrays.asList(melons));
        System.out.println("after melons = " + Arrays.toString(melons));

        Melon[] melonsImmutable = IntStream.rangeClosed(1, melons.length)
                .mapToObj(operand -> melons[melons.length - operand])
                .toArray(Melon[]::new);
        System.out.println("melonsImmutable = " + Arrays.toString(melonsImmutable));
    }
}
