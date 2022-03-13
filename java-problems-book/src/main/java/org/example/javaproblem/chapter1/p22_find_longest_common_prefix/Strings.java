package org.example.javaproblem.chapter1.p22_find_longest_common_prefix;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Strings {

    public static String longestCommonPrefixV1(String[] strings) {
        if (strings.length == 1) {
            return strings[0];
        }

        int firstLen = strings[0].length();

        for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
            char ch = strings[0].charAt(prefixLen);
            for (int i = 1; i < strings.length; i++) {
                if (prefixLen >= strings[i].length() || strings[i].charAt(prefixLen) != ch) {
                    return strings[i].substring(0, prefixLen);
                }
            }
        }

        return strings[0];
    }

    public static String longestCommonPrefixV2(String[] strings) {

        if (strings == null || strings.length == 0) {
            // or throw IllegalArgumentException
            return "";
        }

        if (strings.length == 1) {
            return strings[0];
        }

        int minStr = Arrays.stream(strings).mapToInt(String::length).min().orElse(Integer.MAX_VALUE);

        String result = "";
        int left = 0;
        int right = minStr;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isPrefixInAll(strings, left, middle)) {
                result += strings[0].substring(left, middle + 1);
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return result;
    }

    private static boolean isPrefixInAll(String[] strings, int start, int end) {

        String str = strings[0];

        return Arrays.stream(strings)
                .noneMatch(currentString -> IntStream.rangeClosed(start, end)
                        .anyMatch(i -> currentString.charAt(i) != str.charAt(i)));
    }
}




















