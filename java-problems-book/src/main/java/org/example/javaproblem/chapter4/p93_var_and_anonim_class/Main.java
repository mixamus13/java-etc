package org.example.javaproblem.chapter4.p93_var_and_anonim_class;


import lombok.val;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String... args) {

        var ratio = fetchRatio(); // this is effectively final

        // Prefer
        var weighter = new Weighter() {
            @Override
            public float getWeight(Player player) {
                return ratio * 0.25f;
            }
        };

        Player player = new Player();
        float weight = weighter.getWeight(player);

        System.out.println("Player weight: " + weight);

        Supplier<?> ex = IllegalArgumentException::new;
        System.out.println("ex = " + ex);

        Square square = (var s) -> s * s;
        System.out.println("supplier = " + square.calculate(10));
    }

    public static float fetchRatio() {

        final var limit = new Random().nextFloat();    // this is final
        final var bmi = 0.00023f;                      // this is final

//         limit = 0.002f; // this reassignment will cause error
//         bmi = 0.25f; // this reassignment will cause error

        return limit * bmi / 100.12f;
    }
}

@FunctionalInterface
interface Square {

    int calculate(int x);
}
