package org.example.javaproblem.chapter1.p17_count_string_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static int countStringInStringV1(String string, String substring) {
        int position = 0;
        int count = 0;
        int n = substring.length();

        while ((position = string.indexOf(substring, position)) != -1) {
            position = position + n;
            count++;
        }
        return count;
    }

    public static int countStringInStringV2(String string, String substring) {
        int result = string.split(Pattern.quote(substring), -1).length -1;
        return Math.max(result, 0);
    }

    public static int countStringInStringV3(String string, String substring) {
        Pattern pattern = Pattern.compile(Pattern.quote(substring));
        Matcher matcher = pattern.matcher(string);

        int position = 0;
        int count = 0;

        while (matcher.find(position)) {
            position = matcher.start() + 1;
            count++;
        }

        return count;
    }
}
