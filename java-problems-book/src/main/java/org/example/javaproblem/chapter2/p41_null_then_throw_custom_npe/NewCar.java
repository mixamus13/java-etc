package org.example.javaproblem.chapter2.p41_null_then_throw_custom_npe;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class NewCar {

    //List<NewCar> carList = new ArrayList<>();

    private final String name;
    private final Color color;

    public NewCar(String name, Color color) {
        this.name = Objects.requireNonNull(name, "Car name cannot be null");
        this.color = Objects.requireNonNull(color, "Car color cannot be null");
    }


//    public NewCar(String name, Color color) {
//        this.name = Objects.requireNonNull(name, () -> "Car name cannot be null... Get it from " + carList);
//        this.color = color;
//    }

    public void assignDriver(String license, Point location) {
        Objects.requireNonNull(license, "Driver license cannot be null");
        Objects.requireNonNull(location, "Start location cannot be null");
    }
}
