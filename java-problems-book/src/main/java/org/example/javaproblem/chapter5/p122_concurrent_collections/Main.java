package org.example.javaproblem.chapter5.p122_concurrent_collections;

import org.example.javaproblem.chapter5.p120_filter_collection_by_list.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String... args) {
        List<Employee> employees = new CopyOnWriteArrayList<>();
        employees.add(new Employee("Max", 43));
        employees.add(new Employee("Anna", 23));
        employees.add(new Employee("Millennia", 32));
        employees.add(new Employee("Bob", 65));
        employees.add(new Employee("Peter", 89));

        List<String> names = Arrays.asList("Anna", "Max", "Bob");

        Set<String> convertListToSet = new CopyOnWriteArraySet<>(names);

        List<Employee> result = employees.stream()
                .filter(t -> convertListToSet.contains(t.getName()))
                .toList();

        System.out.println("result = " + result);
    }
}

class MainConcurrentMap {
    public static void main(String... args) {
        Map<Integer, Employee> employeeMap = new ConcurrentHashMap<>();
        employeeMap.put(1, new Employee("Max", 43));
        employeeMap.put(2, new Employee("Anna", 23));
        employeeMap.put(3, new Employee("Millennia", 32));
        employeeMap.put(4, new Employee("Bob", 65));
        employeeMap.put(5, new Employee("Peter", 89));


        employeeMap.entrySet().stream()
                .map(employee -> "employee age = " + employee.getValue().getAge())
                .forEach(System.out::println);

        employeeMap.entrySet().stream()
                .flatMap(employee -> Stream.of(employee.getValue().getName()))
                .toList()
                .forEach(System.out::println);
    }
}

class MainConcurrentMapTwo {
    public static void main(String... args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Tylor");
        map.put(2, "Jenny");
        map.put(3, "Tymmy");
        map.put(4, "Anna");
        map.put(5, "Tysha");
        map.put(6, "Maria");

        System.out.println("Map: \n" + map);

        String result = map.reduce(2, (k, v) -> v = v + "   ", (t, v) -> t + v);
        System.out.println("\nNames concatenated and separated by tab via reduce():\n" + result);

        Integer maxKey = map.reduceKeys(2, (k1, k2) -> k1.compareTo(k2) > 0 ? k1 : k2);
        System.out.println("\nMaximum key via reduceKeys(): " + maxKey);

        String resultValue = map.reduceValues(2, v -> v = v + "   ", (t, v) -> t + v);
        System.out.println("\nNames concatenated and separated by tab via reduceValues():\n" + resultValue);

        Collection<Map.Entry<Integer, String>> synchronizedCollection = Collections.synchronizedCollection(map.entrySet());
        System.out.println("synchronizedCollection = " + synchronizedCollection);
    }
}
