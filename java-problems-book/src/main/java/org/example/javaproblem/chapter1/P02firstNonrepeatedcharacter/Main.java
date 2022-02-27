package org.example.javaproblem.chapter1.P02firstNonrepeatedcharacter;

public class Main {

  private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
      + "showed me that anything is possible and that you're never too young to think big. "
      + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
      + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
      + "computer science.";

  private static final String[] TEXT_STRING = {"A", "E", "S", "E", "A", "F", "E"};
  private static final String STRING = "A E S E A F E";

  // Ӝ -> Unicode: \u04DC, Code Point: 1244
  // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149
  private static final String TEXT_CP = "😍 💕 I Ӝ love you Ӝ so much 😍";

  public static void main(String... args) {

    System.out.println("-------------------------------------------------");

    char firstNonRepeatedCharacterV1 = Strings.firstNonRepeatedCharacterV1(TEXT);
    System.out.println("firstNonRepeatedCharacterV1 = " + firstNonRepeatedCharacterV1);
    System.out.println("-------------------------------------------------");

    System.out.println("-------------------------------------------------");
    char firstNonRepeatedCharacter = Strings.firstNonRepeatedCharacter(TEXT_CP);
    System.out.println("firstNonRepeatedCharacter = " + firstNonRepeatedCharacter);
    System.out.println("-------------------------------------------------");

    System.out.println("-------------------------------------------------");
    String firstNonRepeatedCharacterStream = Strings.firstNonRepeatedCharacterStream(STRING);
    System.out.println("firstNonRepeatedCharacterStream = " + firstNonRepeatedCharacterStream);
    System.out.println("-------------------------------------------------");
  }
}
