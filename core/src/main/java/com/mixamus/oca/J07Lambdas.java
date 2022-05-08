package com.mixamus.oca;

import java.util.List;

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

@FunctionalInterface
interface CheckTrait {
    boolean test(J07Lambdas lambdas);
}

class ApplicationLambda {

    public static void main(String... args) {
        List<J07Lambdas> animals = List.of(
                new J07Lambdas("fish", false, true),
                new J07Lambdas("kangaroo", true, false),
                new J07Lambdas("rabbit", true, false),
                new J07Lambdas("turtle", false, true)
        );

        print(animals, J07Lambdas::canHop);
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

