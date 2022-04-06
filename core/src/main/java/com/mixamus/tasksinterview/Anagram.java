package com.mixamus.tasksinterview;

import java.util.Arrays;

public class Anagram {

    public static void main(String... args) {
        String s1 = "qwerty";
        String s2 = "eqyrwt";
        boolean checkAnagram = checkAnagram(s1, s2);
        System.out.println("checkAnagram = " + checkAnagram);
    }
/* Две строки являются анаграммами, если из символов первой строки можно составить вторую строку и,
   наоборот, из символов второй строки можно составить первую строку.
   Например, "qwerty" и "eqyrwt" являются анаграммами.
   Нужно реализовать метод, который проверяет, являются ли две строки анаграммами
*/

    private static boolean checkAnagram(String s1, String s2) { // для простоты строки не null и не пустые
        for (int i = 0; i < s1.length(); i++) {
            if (!s2.chars().sorted().equals(s1.chars().sorted()) && s1.length() != s2.length()) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkAnagramStream(String s1, String s2) {

        if (s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        return Arrays.equals(s1.chars().sorted().toArray(), s1.chars().sorted().toArray());
    }
}
