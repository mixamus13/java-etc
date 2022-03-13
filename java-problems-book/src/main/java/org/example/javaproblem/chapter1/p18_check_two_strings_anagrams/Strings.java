package org.example.javaproblem.chapter1.p18_check_two_strings_anagrams;

import java.util.Arrays;

public class Strings {

    private static final int EXTENDED_ASCII_CODES = 256;

    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static boolean isAnagramV1(String str1, String str2) {
        int[] chCounts = new int[EXTENDED_ASCII_CODES];
        char[] chStr1 = str1.replace("\\s", "").toLowerCase().toCharArray();
        char[] chStr2 = str2.replace("\\s", "").toLowerCase().toCharArray();

        if (chStr1.length != chStr2.length) {
            return false;
        }

        for (int i = 0; i < chStr1.length; i++) {
            chCounts[chStr1[i]]++;
            chCounts[chStr2[i]]--;
        }

        for (int chCount : chCounts) {
            if (chCount != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramV2(String str1, String str2) {
        return false;
    }

    public static boolean isAnagramStream(String str1, String str2) {
        str1 = str1.replace("\\s", "").toLowerCase();
        str2 = str2.replace("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        return Arrays.equals(
                str1.chars().sorted().toArray(),
                str2.chars().sorted().toArray()
        );
    }
}
