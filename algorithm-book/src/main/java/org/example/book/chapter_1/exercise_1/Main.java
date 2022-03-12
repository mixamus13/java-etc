package org.example.book.chapter_1.exercise_1;

public class Main {
    public static void main(String... args) {
        Integer integer = 12; // <--- это число this
        int compareTo = integer.compareTo(122);
        System.out.println("compareTo = " + compareTo);

    }
}
