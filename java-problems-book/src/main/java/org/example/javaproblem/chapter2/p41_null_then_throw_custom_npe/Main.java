package org.example.javaproblem.chapter2.p41_null_then_throw_custom_npe;

import java.awt.*;

public class Main {

    public static void main(String... args) {

        // This code will cause a NullPointerException

        var newCar = new NewCar("Mazda", null);
        var oldCar = new OldCar(null, new Color(123, 123, 223));

        newCar.assignDriver(null, new Point(1, 1));
        oldCar.assignDriver("Transport", null);
    }

}
