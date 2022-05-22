package org.example.javaproblem.chapter5.p120_filter_collection_by_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String... args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Max", 43));
        employees.add(new Employee("Anna", 23));
        employees.add(new Employee("Millennia", 32));
        employees.add(new Employee("Bob", 65));
        employees.add(new Employee("Peter", 89));

        var names = Arrays.asList("Anna", "Max", "Bob");

        Set<String> convertListToSet = new HashSet<>(names);

        var result = employees.stream()
                .filter(t -> convertListToSet.contains(t.getName()))
                .toList();

        System.out.println("result = " + result);
    }
}
