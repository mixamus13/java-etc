package com.mixamus.oca;

import java.util.List;
import java.util.Objects;

public class J07Lambdas {
    private final String species;
    private final boolean canHop;
    private final boolean canSwim;

    public J07Lambdas(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}
/*----------------------- FunctionalInterface --------------------------*/
@FunctionalInterface
interface CheckTrait {
    boolean test(J07Lambdas lambdas);
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
        List<J07Lambdas> animals = List.of(
                new J07Lambdas("fish", false, true),
                new J07Lambdas("kangaroo", true, false),
                new J07Lambdas("rabbit", true, false),
                new J07Lambdas("turtle", false, true)
        );

        print(animals, J07Lambdas::canHop);

        lambdaExample(J07Lambdas::canSwim);
        lambdaExample(lambdas -> lambdas.canSwim());
        lambdaExample((J07Lambdas lambda) -> {
            return lambda.canSwim();
        });

        lambdaExample(J07Lambdas::canSwim);
        lambdaExampleCustom(() -> true);
        lambdaExampleString(s -> s.startsWith("test"));
        lambdaExampleStringTwoArg((s1, s2) -> s1.startsWith("test"), Objects::deepEquals);
    }

    private static void lambdaExampleStringTwoArg(MyStringTwoArg arg1, MyStringTwoArg arg2) { }
    private static void lambdaExampleCustom(MyTrue myTrue) { }
    public static void lambdaExampleString(MyString myString) { }

    public static void lambdaExample(CheckTrait checkTrait) { }

    private static void print(List<J07Lambdas> animals, CheckTrait checker) {
        for (J07Lambdas animal : animals) {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
            System.out.println();
        }
    }

}

class Application7WithoutLambda {

    public static void main(String... args) {
        List<J07Lambdas> animals = List.of(
                new J07Lambdas("fish", false, true),
                new J07Lambdas("kangaroo", true, false),
                new J07Lambdas("rabbit", true, false),
                new J07Lambdas("turtle", false, true)
        );

        //print(animals, new CheckIfHopper());
    }

    private static void print(List<J07Lambdas> animals, CheckTrait checker) {
        for (J07Lambdas animal : animals) {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
            System.out.println();
        }
    }

}

//class CheckIfHopper implements CheckTrait {
//    @Override
//    public boolean test(J07Lambdas lambdas) {
//        return lambdas.canHop();
//    }
//}

