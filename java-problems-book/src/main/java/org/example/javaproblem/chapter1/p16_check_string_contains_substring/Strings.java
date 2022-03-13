package org.example.javaproblem.chapter1.p16_check_string_contains_substring;

import java.util.regex.Pattern;

public class Strings {

    public static boolean containsV1(String text, String subtext) {
        //return text.lastIndexOf(subtext) != -1;
        return text.contains(subtext);
    }

    public static boolean containsV2(String text, String subtext) {
        return text.matches("(?i).*" + Pattern.quote(subtext) + ".*");
    }
}
