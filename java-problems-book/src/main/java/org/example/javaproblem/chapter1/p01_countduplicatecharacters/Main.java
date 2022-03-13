package org.example.javaproblem.chapter1.p01_countduplicatecharacters;

import java.util.Map;

public class Main {

  private static final String[] TEXT_STRING = {"A", "E", "S", "E", "A", "F", "E "};
  private static final String TEXT = "Be strong, be fearless, be beautiful. "
      + "And believe that anything is possible when you have the right "
      + "people there to support you. ";
  // Ӝ -> Unicode: \u04DC, Code Point: 1244
  // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149 <-- это сурогатная пара юникода - имеет два значения
  // 🎼 -> \uD83C\uDFBC, Code Point: 127932
  // 😍 ->\uD83D\uDE0D, Code Point: 128525
  private static final String TEXT_CP = TEXT + "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";

  public static void main(String... args) {
    Map<Character, Integer> duplicates = Strings.countDuplicateCharacter(TEXT);
    System.out.println("duplicates = " + duplicates);
  }

  static class DuplicatesStream {

    public static void main(String... args) {
      Map<Character, Long> duplicatesStream = Strings.countDuplicateCharacterStream(TEXT);
      System.out.println("duplicatesStream = " + duplicatesStream);
    }
  }

  static class DuplicateStringStream {

    public static void main(String... args) {
      Map<String, Long> duplicateStringStream = Strings.countDuplicateStringStream(TEXT_STRING);
      System.out.println("duplicateStringStream = " + duplicateStringStream);
    }
  }

  static class CountDuplicateCharactersVCP2 {

    public static void main(String... args) {
      Map<String, Long> stringLongMap = Strings.countDuplicateCharactersVCP2(TEXT);
      System.out.println("stringLongMap = " + stringLongMap);
    }
  }

  static class UnicodeSurrogate {

    public static void main(String... args) {
      String str = String.valueOf(Character.toChars(128149));
      System.out.println("valueOf = " + str);

      System.out.println("str.codePointCount(0, str.length()) = " + str.codePointCount(0, str.length()));
      System.out.println("str.codePointAtt = " + str.codePointAt(0));
    }
  }

  static class CountDuplicateCharacters {

    public static void main(String... args) {
      Map<String, Integer> stringIntegerMap = Strings.countDuplicateCharacters(TEXT);
      System.out.println("stringIntegerMap = " + stringIntegerMap);
    }
  }

  static class CountDuplicateCharactersStream {

    public static void main(String... args) {
      Map<String, Long> stringLongMap = Strings.countDuplicateCharactersStream(TEXT);
      System.out.println("stringLongMap = " + stringLongMap);
    }
  }
}
