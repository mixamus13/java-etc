package org.example.javaproblem.chapter5.p103_stream_from_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String... args) {
        String[] names = {"Bob", "Milena", "Max", "Jack", "Bob", "Anabel"};
        var streamNames = Arrays.stream(names, 1, 3);
        var streamOf = Stream.of(names);
        streamNames.forEach(System.out::println);

        var listNames = List.of("Bob", "Milena", "Max", "Jack", "Bob", "Anabel");
        var streamListNames = Stream.of(listNames.subList(1, 4));
        streamListNames.forEach(System.out::println);

        int[] intArr = {2, 3, 4, 56, 76, 8};
        var intStream = IntStream.of(intArr);
        //intStream.forEach(System.out::println);

        IntStream range = IntStream.range(0, intArr.length);
        range.forEach(System.out::println);

        int max = Arrays.stream(intArr).max().getAsInt();
        System.out.println("max = " + max);
    }
}
