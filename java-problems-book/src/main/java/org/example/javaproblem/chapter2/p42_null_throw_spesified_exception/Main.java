package org.example.javaproblem.chapter2.p42_null_throw_spesified_exception;

import java.awt.*;

public class Main {

    public static void main(String... args) {

        Car car = new Car("Mazda", new Color(123, 123, 123));
        car.assignDriver(null, null);
    }
}
