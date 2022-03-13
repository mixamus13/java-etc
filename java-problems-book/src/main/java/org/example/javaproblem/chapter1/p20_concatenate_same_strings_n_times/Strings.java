package org.example.javaproblem.chapter1.p20_concatenate_same_strings_n_times;

public class Strings {
    public static String concatRepeat(String str, int n) {
        var sb = new StringBuilder(str.length() * n);
        for (int i = 0; i <= n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean hasOnlySubstrings(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() / 2; i++) {
            sb.append(str.charAt(i));

            String resultStr = str.replaceAll(sb.toString(), "");

            if (resultStr.length() == 0) {
                return true;
            }
        }

        return false;
    }
}
