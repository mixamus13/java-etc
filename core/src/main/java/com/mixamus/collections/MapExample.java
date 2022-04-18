package com.mixamus.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {

    public static void main(String... args) {
        Map<String, Integer> concurrent = new ConcurrentHashMap<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("max", 42);
        map.put("max", 42);
        map.put(null, 42);
        map.put("bob", 42);
        map.put("elen", 42);
        map.put("miro", null);

        map.entrySet().forEach(System.out::println);
    }
}
