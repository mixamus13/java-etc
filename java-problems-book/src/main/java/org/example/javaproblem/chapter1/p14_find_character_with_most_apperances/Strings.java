package org.example.javaproblem.chapter1.p14_find_character_with_most_apperances;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

public class Strings {

  private static final int EXTENDED_ASCII_CODES = 256;

  private Strings() {
    throw new AssertionError("Cannot be instantiated");
  }

  public static Pair<Character, Integer> maxOccurenceCharacterV1(String str) {
    if (str == null || str.isBlank()) {
      // or throw IllegalArgumentException
      return Pair.of(Character.MIN_VALUE, -1);
    }

    Map<Character, Integer> counter = new HashMap<>();
    char[] chStr = str.toCharArray();
    for (char currentCh : chStr) {

      if (!Character.isWhitespace(currentCh)) { // ignore spaces
        Integer noCh = counter.get(currentCh);
        if (noCh == null) {
          counter.put(currentCh, 1);
        } else {
          counter.put(currentCh, ++noCh);
        }
      }
    }

    int maxOccurrences = Collections.max(counter.values());

    char maxCharacter = Character.MIN_VALUE;
    for (Entry<Character, Integer> entry : counter.entrySet()) {
      if (entry.getValue() == maxOccurrences) {
        maxCharacter = entry.getKey();
      }
    }

    return Pair.of(maxCharacter, maxOccurrences);
  }

  public static Pair<Character, Integer> maxOccurenceCharacterV2(String str) {
    if (str == null || str.isBlank()) {
      // or throw IllegalArgumentException
      return Pair.of(Character.MIN_VALUE, -1);
    }

    int maxOccurrences = -1;
    char maxCharacter = Character.MIN_VALUE;

    char[] chStr = str.toCharArray();
    int[] asciiCodes = new int[EXTENDED_ASCII_CODES];

    for (char currentCh : chStr) {
      if (!Character.isWhitespace(currentCh)) { // ignoring space
        asciiCodes[currentCh]++;
        if (asciiCodes[currentCh] > maxOccurrences) {
          maxOccurrences = asciiCodes[currentCh];
          maxCharacter = currentCh;
        }
      }
    }

    return Pair.of(maxCharacter, maxOccurrences);
  }

  public static Pair<Character, Long> maxOccurenceCharacterV3(String str) {
    return str.chars()
        .filter(c -> !Character.isWhitespace(c))
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .map(p -> Pair.of(p.getKey(), p.getValue()))
        .orElse(Pair.of(Character.MIN_VALUE, -1L));
  }
}
