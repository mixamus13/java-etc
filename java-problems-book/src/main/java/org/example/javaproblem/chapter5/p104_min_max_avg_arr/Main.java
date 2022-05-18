package org.example.javaproblem.chapter5.p104_min_max_avg_arr;

import org.example.javaproblem.chapter5.p101_check_two_array_equals.Melon;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String... args) {
        // arrays of melons
        Melon[] melons1 = new Melon[]{new Melon("Horned", 1500), new Melon("Gac", 1000)};
        Melon[] melons2 = new Melon[]{new Melon("Horned", 1500), new Melon("Gac", 1000),
                new Melon("Boro", 3000), new Melon("Garli", 400)};
        Melon[] melons3 = new Melon[]{new Melon("Hami", 1500), new Melon("Gac", 1100)};
        Melon[] melons4 = new Melon[]{new Melon("Hamilton", 3000), new Melon("G", 1100)};

        Comparator<Melon> byType = Comparator.comparing(Melon::getType);
        Melon melon = Arrays.stream(melons1).max(byType).orElseThrow();
        System.out.println("melon = " + melon);

        double[] intArr = {2.0, 3.0, 4.0, 56.0, 76.0, 8.0};
        double asDouble = Arrays.stream(intArr)
                .average().orElseThrow();
        System.out.println("asDouble = " + asDouble);
    }
}
