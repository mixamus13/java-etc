package org.example.javaproblem.chapter4.p87_var_and_scope;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Stream;

public class Main {
    public static void main(String... args) {
        // Prefer
        var stack = new Stack<String>();
        stack.push("John");
        stack.push("Martin");
        stack.push("Anghel");
        stack.push("Christian");

        // John, Martin, Anghel, Christian
        stack.forEach(System.out::println);

        // 50 lines of code that doesn't use stack
    }
}

class Main88 {
    public static void main(String... args) {
        boolean containsEven = false;
        var evensOrOdds = containsEven ? List.of(1, 2, 3) : Set.of(4, 5, 6);
        System.out.println("evensOrOdds = " + evensOrOdds);

        //int[] array = {2, 4, 6, 8};
        String[] array = {"Fe", "de", "rals"};
        for (var i : array) {
            System.out.println(i);
        }

        var numbers = Stream.of(1, 3, 44, 66, 71, 9);
        numbers.filter(integer -> integer >= 66).forEach(System.out::println);
    }
}
