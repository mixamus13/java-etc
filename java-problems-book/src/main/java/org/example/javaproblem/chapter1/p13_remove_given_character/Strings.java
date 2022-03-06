package org.example.javaproblem.chapter1.p13_remove_given_character;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Strings {

  public static String removeCharacterV1(String text, char aChar) {
    return text.replaceAll(Pattern.quote(String.valueOf(aChar)), "");
  }

  public static String removeCharacterV2(String text, char aChar) {
    StringBuilder sb = new StringBuilder();
    var chars = text.toCharArray();
    for (char c : chars) {
      if (c != aChar) {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public static String removeCharacterV3(String text, char ch) {
    if (text == null || text.isEmpty()) {
      // or throw IllegalArgumentException
      return "";
    }

    return text.chars()
        .filter(value -> value != ch)
        .mapToObj(value -> String.valueOf((char) value))
        .collect(Collectors.joining());
  }

  public static String removeCharacterV4(String text, String ch) {
    if (text == null || ch == null || text.isEmpty() || text.isBlank()) {
      return "";
    }

    if (ch.codePointCount(0, ch.length()) != 1) {
      return "";
    }

    var codepoint = ch.codePointAt(0);
    return text.codePoints()
        .filter(c -> c != codepoint)
        .mapToObj(c -> String.valueOf(Character.toChars(c)))
        .collect(Collectors.joining());
  }
}
