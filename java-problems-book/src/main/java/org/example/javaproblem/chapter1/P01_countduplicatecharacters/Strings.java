package org.example.javaproblem.chapter1.P01_countduplicatecharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

final class Strings {

  private Strings() {
    throw new AssertionError("Cannot be instantiated");
  }

  public static Map<Character, Integer> countDuplicateCharacter(String str) {

    Map<Character, Integer> result = new HashMap<>();
    for (char ch : str.toCharArray()) {
      result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
    }
    return result;
  }

  public static Map<Character, Long> countDuplicateCharacterStream(String str) {
    return str.chars()
        .mapToObj(value -> (char) value)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  public static Map<String, Long> countDuplicateStringStream(String[] textString) {
    return Arrays.stream(textString)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  public static Map<String, Long> countDuplicateCharactersVCP2(String str) {
    return str.codePoints()
        .mapToObj(c -> String.valueOf(Character.toChars(c)))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
  }

  public static Map<String, Integer> countDuplicateCharacters(String str) {
    Map<String, Integer> result = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      String ch = String.valueOf(Character.toChars(str.codePointAt(i)));
      if (i < str.length() - 1 && str.codePointCount(i, i + 2) == 1) {
        i++;
      }
      result.compute(ch, (s, integer) -> (integer == null) ? 1 : ++integer);
    }
    return result;
  }

  public static Map<String, Long> countDuplicateCharactersStream(String str) {
    return str.codePoints()
        .mapToObj(value -> String.valueOf(Character.toChars(value)))
        .collect(Collectors.groupingBy(o -> o, Collectors.counting()));
  }
}
