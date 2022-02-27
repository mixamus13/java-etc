package org.example.javaproblem.chapter1.p05_count_vowels_and_consonants;

import java.util.concurrent.TimeUnit;

public class Main {

  // 14 vowels, 19 consonants
  private static final String TEXT = " ... Illinois Mathematics & Science Academy ... ";

  public static void main(String... args) {

    System.out.println("Input text: \n" + TEXT + "\n");

    System.out.println("String.charAt() solution:");
    long startTimeV1 = System.nanoTime();

    Pair pairV1 = Strings.countVowelsAndConsonantsV1(TEXT);

    displayExecutionTime(System.nanoTime() - startTimeV1);
    System.out.println("Vowels: " + pairV1.getVowels());
    System.out.println("Consonants: " + pairV1.getConsonants());

    System.out.println();
    System.out.println("Java 8, functional-style solution:");
    long startTimeV2 = System.nanoTime();

    Pair pairV2 = Strings.countVowelsAndConsonantsV2(TEXT);

    displayExecutionTime(System.nanoTime() - startTimeV2);
    System.out.println("Vowels: " + pairV2.getVowels());
    System.out.println("Consonants: " + pairV2.getConsonants());

    System.out.println("--------------------------------------");
    System.out.println("StreamAPI");
    long startTimeStream = System.nanoTime();
    Pair pairStream = Strings.countVowelsAndConsonantsStream(TEXT);
    displayExecutionTime(System.nanoTime() - startTimeStream);
    System.out.println("pairStream = " + pairStream);
  }

  private static void displayExecutionTime(long time) {
    System.out.println("Execution time: " + time + " ns" + " ("
        + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
  }
}
