package org.example.javaproblem.chapter2.p41_null_then_throw_custom_npe;

import java.awt.*;

public class OldCar {

    private final String name;
    private final Color color;

    public OldCar(String name, Color color) {

        if (name == null) {
            throw new NullPointerException("Car name cannot be null");
        }

        if (color == null) {
            throw new NullPointerException("Car color cannot be null");
        }

        this.name = name;
        this.color = color;
    }

    public void assignDriver(String license, Point location) {

        if (license == null) {
            throw new NullPointerException("Driver license cannot be null");
        }

        if (location == null) {
            throw new NullPointerException("Start location cannot be null");
        }
    }
}
