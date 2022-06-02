package org.example.javaproblem.chapter5.p129_bloom_filter;

import org.example.javaproblem.chapter2.p53_cloning_objects.construct.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String... args) {

        // use one of the available constructors
        // 0.3 = 30% false positives probability expected, 10 elements expected
        BloomFilter bf = new BloomFilter(0.3, 10);
        List<String> lists = new LinkedList<>();

        bf.add("Octavia");
        bf.add("Anghel");
        bf.add("Jonnhy");
        bf.add("Marua");
        bf.add("Maria");
        bf.add("Mary");
        bf.add("Qunto");
        bf.add("Alexander");
        bf.add("Alin");
        bf.add("Myrriad");

        System.out.println("False positive probability between 0 and 1: " + bf.getFalsePositiveProbability());
        System.out.println("False positive probability in percent: " + bf.getFalsePositiveProbabilityAsPercent());
        System.out.println("Number of hash functions: " + bf.getNumberOfHashFunctions());

        System.out.println("Marua is there? " + bf.contains("Marua")); // expected true
        System.out.println("Alexandra is there? " + bf.contains("Alexandra")); // expected false
    }
}
final class ImmutableClass {

    private final StringBuilder builder;

    public ImmutableClass(StringBuilder builder) {
        this.builder = new StringBuilder(builder);
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }
}


final class Cesar {
    private final List<String> list;

    public Cesar(List<String> list) {
        this.list = new ArrayList<>(list);
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }
}


 class Test25 {
    public static void main(String[] args) {
        List<String> list = List.of("Maks", "Petr");
        Cesar cesar = new Cesar(list);
        System.out.println("First call");
        cesar.getList().forEach(System.out::println);

        System.out.println("Second call");
        cesar.getList().add("Vasya");
        cesar.getList().forEach(System.out::println);
    }
}
