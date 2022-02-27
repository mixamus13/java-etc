package org.example.javaproblem.chapter1.p08_remove_whitespaces_from_string;

public class Strings {

  private Strings() {
    throw new AssertionError("Cannot be instantiated");
  }

  public static String removeWhitespaces(String str) {
    if (str == null || str.isEmpty()) {
      //throw new IllegalArgumentException();
      return "";
    }

    return str.replaceAll("\\s", "");
  }
}
