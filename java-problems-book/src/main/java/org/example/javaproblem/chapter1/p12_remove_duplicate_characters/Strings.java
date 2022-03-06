package org.example.javaproblem.chapter1.p12_remove_duplicate_characters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Strings {

  public static String removeDuplicatesV1(String str) {
    var chArray = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char ch : chArray) {
      if (sb.indexOf(String.valueOf(ch)) == -1) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }

  public static String removeDuplicatesV2(String str) {
    var chArray = str.toCharArray();
    var sb = new StringBuilder();
    var chHashSet = new HashSet<Character>();
    for (char c : chArray) {
      if (chHashSet.add(c)) {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public static String removeDuplicatesV3(String str) {
    return Arrays.stream(str.split(""))
        .distinct()
        .collect(Collectors.joining());
  }
}
