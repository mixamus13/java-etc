package org.example.javaproblem.chapter1.p24_transform_string;

import java.util.stream.Stream;

public class Main {
    public static void main(String... args) {

        System.out.println("-------------------------------------------------");

        String resultOneMap = Stream.of("Hello")
                .map(s -> s + " world")
                .findFirst()
                .get();
        System.out.println("resultOneMap = " + resultOneMap);

        System.out.println("-------------------------------------------------");

        String transform = "hello".transform(s -> s + " world");
        System.out.println("transform = " + transform);

        System.out.println("-------------------------------------------------");

        String resultTwoMap = Stream.of("goooool! ")
                .map(String::toUpperCase)
                .map(s -> s.repeat(3))
                .map(s -> s.replaceAll("O", "OOOO"))
                .findFirst().get();
        System.out.println("resultTwoMap = " + resultTwoMap);

        System.out.println("-------------------------------------------------");

        String resultTwo = "goooool! ".transform(String::toUpperCase)
                .transform(s -> s.repeat(3))
                .transform(s -> s.replaceAll("O", "OOOO"));
        System.out.println("resultTwo = " + resultTwo);

        System.out.println("-------------------------------------------------");
    }
}
