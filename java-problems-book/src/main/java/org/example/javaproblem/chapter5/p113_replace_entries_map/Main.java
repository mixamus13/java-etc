package org.example.javaproblem.chapter5.p113_replace_entries_map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    public static void main(String... args) {
        Map<Integer, Melon> melonMap = new HashMap<>(Map.of(
                1, new Melon("Apollo", 3000),
                2, new Melon("Jade Dew", 3500),
                3, new Melon("Cantaloupe", 1500)
        ));

        melonMap.replace(2, new Melon("Gac", 1000));

        melonMap.replace(3, new Melon("Cantaloupe", 1500), new Melon("Salanar", 5500));

        System.out.println("melonMap = " + melonMap);

        BiFunction<Integer, Melon, Melon> function =
                (integer, melon) -> {
                    if (melon.getWeight() > 1000) {
                        return new Melon(melon.getType(), 9999);
                    } else {
                        return melon;
                    }
                };
        melonMap.replaceAll(function);
        System.out.println("melonMap function = " + melonMap);
    }
}
