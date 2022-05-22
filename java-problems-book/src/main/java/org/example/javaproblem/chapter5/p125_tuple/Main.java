package org.example.javaproblem.chapter5.p125_tuple;

import org.example.javaproblem.chapter5.p120_filter_collection_by_list.Employee;

import java.util.Comparator;
import java.util.Map;

public class Main {
    public static void main(String... args) {
        Employee[] employees = new Employee[]{
                new Employee("Max", 43),
                new Employee("Lena", 81),
                new Employee("Anna", 11),
                new Employee("Oli", 5),
                new Employee("Bob", 33),
                new Employee("Ken", 99)
        };

        Comparator<Employee> byAge = Comparator.comparing(Employee::getAge);

        Map.Entry<Employee, Employee> minmax1 = Bounds.arrayV1(employees, byAge);
        System.out.println("minmax1.getKey() = " + minmax1.getKey());
        System.out.println("minmax1.getValue() = " + minmax1.getValue());

        Pair<Employee, Employee> minmax2 = Bounds.arrayV2(employees, byAge);
        System.out.println("minmax2.getLeft() = " + minmax2.getLeft());
        System.out.println("minmax2.getRight() = " + minmax2.getRight());
    }
}
