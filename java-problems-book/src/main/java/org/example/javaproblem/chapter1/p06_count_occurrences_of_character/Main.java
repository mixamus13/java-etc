package org.example.javaproblem.chapter1.p06_count_occurrences_of_character;

import java.util.concurrent.TimeUnit;

public class Main {

  private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
      + "showed me that anything is possible and that you're never too young to think big. "
      + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
      + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
      + "computer science.";
  private static final char CHAR_TO_COUNT = 'u';

  private static final String TEXT_CP = "😍 I love 💕 you Ӝ so much 💕 😍";
  private static final String CHAR_TO_COUNT_CP = "Ӝ";   // Unicode: \u04DC, Code Point: 1244
  private static final String CHAR_TO_COUNT_CPS = "💕"; // Unicode: \uD83D\uDC95, Code Point: 128149

  public static void main(String... args) {
    System.out.println();
    System.out.println("Input text: \n" + TEXT + "\n");

    System.out.println("\n\nASCII or 16 bits Unicode characters (less than 65,535 (0xFFFF)) examples:\n");

    System.out.println("replace() based solution:");
    long startTimeV1 = System.nanoTime();

    long characterStream = Strings.countOccurrencesOfACertainCharacterStream(TEXT_CP, CHAR_TO_COUNT);
    System.out.println("characterStream = " + characterStream);
    displayExecutionTime(System.nanoTime() - startTimeV1);
  }

  private static void displayExecutionTime(long time) {
    System.out.println("Execution time: " + time + " ns" + " ("
        + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
  }
}
