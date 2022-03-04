package org.example.javaproblem.chapter1.p09_join_multiple_strings;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Strings {

  private Strings() {
    throw new AssertionError("Cannot be instantiated");
  }

  public static String joinByDelimiterV1(char delimiter, String... args) {
    if (args == null || args.length == 0) {
      return "";
    }

    var result = new StringBuilder();

    int i;
    for (i = 0; i < args.length; i++) {
      result.append(args[i]).append(delimiter);
    }
    return result.toString();
  }

  public static String joinByDelimiterV2(char delimiter, String... args) {
    if (args == null || args.length == 0) {
      return "";
    }

    return Arrays.stream(args, 0, args.length)
        .collect(Collectors.joining(String.valueOf(delimiter)));
  }

  public static String joinByDelimiterV3(char delimiter, String... args) {
    if (args == null || args.length == 0) {
      return "";
    }

    var joiner = new StringJoiner(String.valueOf(delimiter));
    Arrays.stream(args).forEach(joiner::add);

    return joiner.toString();
  }
}
