package org.example.javaproblem.chapter5.p115_merge_map;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String... args) {
        Map<String, Melon> melonMap = new HashMap<>();
        melonMap.put("tree", new Melon("Cantaloupe", 1500));
        melonMap.put("zero", new Melon("Fazarat", 200));
        melonMap.put("one", new Melon("Apollo", 3000));
        melonMap.put("four", new Melon("Lopo", 4600));
        melonMap.put("two", new Melon("Jade Dew", 3500));

        System.out.println("melonMap = " + melonMap);

//        TreeMap<String, Melon> melonTreeMap = new TreeMap<>(melonMap);
//        System.out.println("melonTreeMap = " + melonTreeMap);

//        List<String> list = new ArrayList<>(melonMap.keySet());
//        Collections.sort(list);
//        System.out.println("list = " + list);
//        System.out.println("sort keys  = " + melonMap);

        SortedSet<String> key = new TreeSet<>(melonMap.keySet());
        System.out.println("key = " + key);
        SortedSet<Melon> melonSortedSet = new TreeSet<>(melonMap.values());
        System.out.println("melonSortedSet = " + melonSortedSet);

    }
}
