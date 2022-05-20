package org.example.javaproblem.chapter5.p117_sort_map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String... args) {
        Map<Integer, Melon> melons1 = new HashMap<>();
        melons1.put(1, new Melon("Apollo", 3000));
        melons1.put(2, new Melon("Jade Dew", 3500));
        melons1.put(3, new Melon("Cantaloupe", 1500));

        Map<Integer, Melon> melons2 = new HashMap<>();
        melons2.put(3, new Melon("Maxono", 200));
        melons2.put(4, new Melon("Jade Dew", 3500));
        melons2.put(5, new Melon("Cantaloupe", 1500));

        Map<Integer, Melon> entryStream = new HashMap<>(melons1);
        melons2.forEach(
                (k, v) -> entryStream.merge(k, v, (melon, melon2) -> melon2));
        System.out.println("entryStream = " + entryStream);
    }
}
