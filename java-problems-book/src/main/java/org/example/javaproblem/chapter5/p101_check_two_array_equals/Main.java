package org.example.javaproblem.chapter5.p101_check_two_array_equals;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String... args) {
        // arrays of integers
        int[] integers1 = new int[]{3, 4, 5, 6, 1, 5};
        int[] integers2 = new int[]{3, 4, 5, 6, 1, 5};
        int[] integers3 = new int[]{3, 4, 5, 6, 1, 3};
        int[] integers4 = new int[]{3, 4, 5, 6, 1, 3, 8, 12};
        int[] integers5 = new int[]{3, 4, 5, 6};

        // arrays of melons
        Melon[] melons1 = new Melon[]{new Melon("Horned", 1500), new Melon("Gac", 1000)};
        Melon[] melons2 = new Melon[]{new Melon("Horned", 1500), new Melon("Gac", 1000)};
        Melon[] melons3 = new Melon[]{new Melon("Hami", 1500), new Melon("Gac", 1100)};
        Melon[] melons4 = new Melon[]{new Melon("Hamilton", 3000), new Melon("G", 1100)};

        var equals = Arrays.equals(integers1, integers3);
        var equals2 = Arrays.equals(integers1, 1,4 ,integers3,1,4);
        System.out.println("equals2 = " + equals2);
        System.out.println("equals = " + equals);

        var equalsMelon = Arrays.equals(melons1, melons3);
        System.out.println("equalsMelon = " + equalsMelon);

        var mismatch = Arrays.mismatch(integers1, integers4);
        System.out.println("mismatch = " + mismatch);

        var comparator = Comparator.comparing(Melon::getWeight);
        var mis = Arrays.mismatch(melons1, melons3, comparator);
        System.out.println("mis = " + mis);

        int compare = Arrays.compare(integers5, integers2);
        System.out.println("compare = " + compare);

        int compareInterval = Arrays.compare(integers5, 2, 3, integers2, 2, 3);
        System.out.println("compareInterval = " + compareInterval);

        int compareMelon = Arrays.compare(melons1, melons3);
        System.out.println("compareMelon = " + compareMelon);

        Comparator<Melon> byType = Comparator.comparing(Melon::getType);
        int withoutComparatorInMelon = Arrays.compare(melons1, melons2, byType);
        System.out.println("withoutComparatorInMelon = " + withoutComparatorInMelon);

        var compareUnsigned = Arrays.compareUnsigned(integers1, integers2);
        System.out.println("compareUnsigned = " + compareUnsigned);
    }
}
