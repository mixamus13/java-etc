package org.example.javaproblem.chapter1.P03_ReverseWords;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Strings {

  public static String reverseWordsV1(String str) {
    String[] words = str.split(" ");
    StringBuilder reversedString = new StringBuilder();

    for (String word : words) {
      StringBuilder reversedWord = new StringBuilder();

      for (int i = word.length() - 1; i >= 0; i--) {
        reversedWord.append(word.charAt(i));
      }

      reversedString.append(reversedWord).append(" ");
    }

    return reversedString.toString();
  }

  public static String reverseWordsStream(String str) {
    return Pattern.compile(" +").splitAsStream(str)
        .map(s -> new StringBuilder(s).reverse())
        .collect(Collectors.joining(" "));
  }

  public static String reverse(String str) {
    return new StringBuilder(str).reverse().toString();
  }
}
