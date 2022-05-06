package com.mixamus.oca;

import java.util.Locale;

public class MethodString {

    public static void main(String... args) {
        String animal1 = "animal";
        String animal2 = "animal";
        String animal3 = "        aSimAl    ";
        char c = 'd';

        System.out.println(animal1.substring(2, 4));

        System.out.println("animal1.equals(animal2) = " + animal1.equals(animal2));

        System.out.println("animal.startsWith() = " + animal1.startsWith("an"));
        System.out.println("animal.endsWith(\"n\") = " + animal1.endsWith("n"));

        System.out.println("animal1.contains() = " + animal1.contains("ni"));

        System.out.println("animal1.replace() = " + animal1.replace("an", "der"));

        System.out.println("animal3.trim() = " + animal3.toLowerCase(Locale.ROOT)
                                                        .replace("s", "n")
                                                        .trim());
    }
}
