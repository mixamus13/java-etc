package org.example.javaproblem.chapter1.p02_first_nonrepeatedcharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Strings {

    // http://www.alansofficespace.com/unicode/unicd99.htm
    private static final int EXTENDED_ASCII_CODES = 256; // can be increased to 65535

    public Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    static char firstNonRepeatedCharacter(String str) {

        Map<Character, Integer> chars = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

    static String firstNonRepeatedCharacterStream(String str) {
        Map<Integer, Long> chs = str.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        int cp = chs.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Entry::getKey)
                .orElse((int) Character.MIN_VALUE);

        return String.valueOf(Character.toChars(cp));
    }

    static char firstNonRepeatedCharacterV1(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return Character.MIN_VALUE;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }
}
