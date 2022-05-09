package com.mixamus.oca;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Value
public class J07AnimalLambdas {
    String species;
    boolean canHop;
    boolean canSwim;
}

/*----------------------- FunctionalInterface --------------------------*/
@FunctionalInterface
interface CheckTrait {
    boolean test(J07AnimalLambdas lambdas);
}

@FunctionalInterface
interface MyTrue {
    boolean test();
}

@FunctionalInterface
interface MyString {
    boolean test(String str);
}

@FunctionalInterface
interface MyStringTwoArg {
    boolean test(String s1, String s2);
}
/*----------------------- FunctionalInterface --------------------------*/

class ApplicationLambda {

    public static void main(String... args) {
        List<J07AnimalLambdas> animals = List.of(
                new J07AnimalLambdas("fish", false, true),
                new J07AnimalLambdas("kangaroo", true, false),
                new J07AnimalLambdas("rabbit", true, false),
                new J07AnimalLambdas("turtle", false, true)
        );

        print(animals, J07AnimalLambdas::isCanHop);

        lambdaExample(J07AnimalLambdas::isCanSwim);
        lambdaExample(lambdas -> lambdas.isCanSwim());
        lambdaExample((J07AnimalLambdas lambda) -> {
            return lambda.isCanSwim();
        });

        lambdaExample(J07AnimalLambdas::isCanSwim);
        lambdaExampleCustom(() -> true);
        lambdaExampleString(s -> s.startsWith("test"));
        lambdaExampleStringTwoArg((s1, s2) -> s1.startsWith("test"), Objects::deepEquals);
    }

    private static void lambdaExampleStringTwoArg(MyStringTwoArg arg1, MyStringTwoArg arg2) {
    }

    private static void lambdaExampleCustom(MyTrue myTrue) {
    }

    public static void lambdaExampleString(MyString myString) {
    }

    public static void lambdaExample(CheckTrait checkTrait) {
    }

    private static void print(List<J07AnimalLambdas> animals, CheckTrait checker) {
        for (J07AnimalLambdas animal : animals) {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
            System.out.println();
        }
    }
}

class Application7WithoutLambda {

    public static void main(String... args) {
        List<J07AnimalLambdas> animals = List.of(
                new J07AnimalLambdas("fish", false, true),
                new J07AnimalLambdas("kangaroo", true, false),
                new J07AnimalLambdas("rabbit", true, false),
                new J07AnimalLambdas("turtle", false, true)
        );

        print(animals, new CheckIfHopper());
    }

    private static void print(List<J07AnimalLambdas> animals, CheckTrait checker) {
        animals.forEach(animal -> {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
            System.out.println();
        });
    }
}

class Application7WithLambdaAndPredicate {

    public static void main(String... args) {
        List<J07AnimalLambdas> animals = List.of(
                new J07AnimalLambdas("fish", false, true),
                new J07AnimalLambdas("kangaroo", true, false),
                new J07AnimalLambdas("rabbit", true, false),
                new J07AnimalLambdas("turtle", false, true)
        );

        print(animals, J07AnimalLambdas::isCanHop);
    }

    private static void print(List<J07AnimalLambdas> animals, Predicate<J07AnimalLambdas> checker) {
        animals.forEach(animal -> {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
            System.out.println();
        });
    }
}

class dPredicateInJava {

    public static void main(String... args) {
        List<String> strings = List.of("fish", "kangaroo", "rabbit", "turtle");
        List<String> animals = new ArrayList<>(strings);
        System.out.println(animals);

        animals.removeIf(s -> s.charAt(0) != 'r');
        System.out.println(animals);
    }
}

class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(J07AnimalLambdas lambdas) {
        return lambdas.isCanHop();
    }
}
