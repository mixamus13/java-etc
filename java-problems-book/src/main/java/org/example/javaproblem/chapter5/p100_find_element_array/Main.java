package org.example.javaproblem.chapter5.p100_find_element_array;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String... args) {

        // array of numbers
        int[] numbers = new int[]{4, 5, 1, 3, 7, 4, 1, 5};

        // array of Melon
        Melon[] melons = new Melon[]{
                new Melon("Crenshaw", 2000),
                new Melon("Gac", 1200),
                new Melon("Bitter", 2200),
                new Melon("Makhan", 3300)};

        List<Melon> melonList = List.of(
                new Melon("Crenshaw", 2000),
                new Melon("Gac", 1200),
                new Melon("Bitter", 2200),
                new Melon("Makhan", 3300)
        );

        boolean containsElement = ArraySearch.containsElement(numbers, 4);
        System.out.println("containsElement = " + containsElement);

        boolean containsElementObject = ArraySearch.containsElementObject(melons, new Melon("Gac", 1200));
        System.out.println("containsElementObject = " + containsElementObject);

        Comparator<Melon> byWeight = Comparator.comparing(Melon::getWeight);
        Comparator<Melon> byType = Comparator.comparing(Melon::getType);
        boolean containElementComparator = ArraySearch.containElementComparator(melons, new Melon("Gac", 1201), byType);
        System.out.println("containElementComparator = " + containElementComparator);


        int indexOfElement = ArraySearch.findIndexOfElementStream(numbers, 5);
        System.out.println("indexOfElement = " + indexOfElement);

        int indexOfElementObjectStream = ArraySearch.findIndexOfElementObjectStream(melons, new Melon("Honeydew", 2000), byWeight);
        System.out.println("indexOfElementObjectStream = " + indexOfElementObjectStream);

        ArraySearch.findIndexOfElementListStream(melonList, new Melon("Honeydew", 2000), byWeight);
    }
}
