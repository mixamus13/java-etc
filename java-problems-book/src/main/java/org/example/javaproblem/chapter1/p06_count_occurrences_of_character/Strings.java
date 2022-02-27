package org.example.javaproblem.chapter1.p06_count_occurrences_of_character;

public class Strings {

  public static long countOccurrencesOfACertainCharacterStream(String str, char ch) {
    if (str == null || str.isEmpty()) {
      // or throw IllegalArgumentException
      return -1;
    }

    return str.chars()
        .filter(value -> value == ch)
        .count();
  }
}
