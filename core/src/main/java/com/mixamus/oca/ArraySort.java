package com.mixamus.oca;

public class ArraySort {
    public static void main(String... args) {
        int[] numbers = {6, 9, 1, 4, 7, 2};

        bubbleSortExample(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void bubbleSortExample(int[] numbers) {
        int n = numbers.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
