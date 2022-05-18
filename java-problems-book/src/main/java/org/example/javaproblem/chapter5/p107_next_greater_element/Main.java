package org.example.javaproblem.chapter5.p107_next_greater_element;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class Main {
    public static void main(String... args) {
        int[] integers = {1, 2, 3, 4, 12, 2, 1, 4};
        System.out.println("Quick solution:");
        println(integers);
        int[] fetch = fetch(integers);
        System.out.println("fetch = " + Arrays.toString(fetch));
    }

    private static void println(int[] arr) {
        int nge;
        for (int k : arr) {
            nge = -1;
            for (int i : arr) {
                if (k < i) {
                    nge = i;
                    break;
                }
            }
            System.out.println(k + " : " + nge);
        }
    }

    public static int[] fetch(int[] arr) {

        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int nge[] = new int[n];
        IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).forEach(i -> {
            if (!stack.empty()) {
                while (!stack.empty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            nge[i] = stack.empty() ? -1 : stack.peek();
            stack.push(arr[i]);
        });
        return nge;
    }
}
