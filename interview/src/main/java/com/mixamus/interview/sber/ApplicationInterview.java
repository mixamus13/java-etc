package com.mixamus.interview.sber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

public class ApplicationInterview {
    public static void main(String... args) {
        Map<String, Integer> integers = new HashMap<>();
        integers.put("Bob", 5);
        integers.put("Max", 44);
        integers.put("Jack", 44);
        integers.put("Peter", 443);
        integers.put("Elene", 443);
        integers.put("Max", 123);
        integers.put("Anna", 23);

//        for (Map.Entry<String, Integer> entry : integers.entrySet()) {
//            //integers.remove(6);  // ConcurrentHashMap<>();
//
//            System.out.println(entry);
//        }
        //System.out.println("integers.get(\"Max\") = " + integers.get("Max"));

        integers.entrySet().stream().sorted().forEachOrdered(System.out::println);

    }
}


class Q {
    public static void main(String[] args) {
        Q q = new Q();
        q.binSearch();
    }

    private void binSearch() {
        int[] inpArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer result = binSearchF(inpArr, 1, 0, inpArr.length - 1);
        System.out.println("-----------------------");
        result = binSearchF(inpArr, 2, 0, inpArr.length - 1);
        System.out.println("Found at position" + result);
    }

    private Integer binSearchF(int[] inpArr, int searchValue, int low, int high) {
        Integer index = null;
        while (low <= high) {
            System.out.println("New iteration, low = " + low + ", high = " + high);
            int mid = (low + high) / 2;
            System.out.println("trying mid = " + mid + "inpArr[mid] = " + inpArr[mid]);
            if (inpArr[mid] < searchValue) {
                low = mid + 1;
                System.out.println("inpArr[mid] (" + inpArr[mid] + ") <searchValue(" + searchValue + "), mid = " + mid + ",setting low = " + low);
            } else if (inpArr[mid] > searchValue) {
                high = mid - 1;
                System.out.println("inpArr[mid] (" + inpArr[mid] + ") >searchValue(" + searchValue + "), mid = " + mid + ",setting + high = " + high);
            } else if (inpArr[mid] == searchValue) {
                index = mid;
                System.out.println("found at index " + mid);
                break;
            }
        }
        return index;
    }
}

class App {
    public static void main(String... args) {
        Collector<String, List<String>, List<String>> toList = Collector.of(
                ArrayList::new,
                List::add,
                (strings1, strings2) -> {
                    strings1.addAll(strings2);
                    return strings1;
                }
        );
        System.out.println("toList = " + toList.finisher());
    }
}
