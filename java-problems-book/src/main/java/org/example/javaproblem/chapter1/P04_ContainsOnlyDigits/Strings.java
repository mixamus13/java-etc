package org.example.javaproblem.chapter1.P04_ContainsOnlyDigits;

import java.util.stream.IntStream;

public final class Strings {


  public static boolean containsOnlyDigitsV1(String str) {
    if (str == null || str.isBlank()) {
      return false;
    }

    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public static boolean containsOnlyDigitsV2(String str) {
    if (str == null || str.isBlank()) {
      return false;
    }

    return str.matches("[0-9]+");
  }

  public static boolean containsOnlyDigitsV3(String str) {
    if (str == null || str.isBlank()) {
      return false;
    }

    return str.chars()
        .anyMatch(value -> !Character.isDigit(value));
  }

  public static boolean containsOnlyDigit(String string) {
    for (int i = 0; i < string.length(); i++) {
      if (!Character.isDigit(string.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public static boolean containsOnlyDigitStream(String string) {
    return IntStream.range(0, string.length()).allMatch(i -> Character.isDigit(string.charAt(i)));
  }
}
