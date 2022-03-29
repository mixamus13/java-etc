package org.example.javaproblem.chapter2.p42_null_throw_spesified_exception;

import java.awt.*;

public class Car {

    private final String name;
    private final Color color;

    public Car(String name, Color color) {
        this.name = MyObjects.requireNonNullElseThrow(name, new UnsupportedOperationException("Name cannot be set as null"));
        this.color = MyObjects.requireNotNullElseThrow(color, () -> new UnsupportedOperationException("Color cannot be set as null"));
    }

    public void assignDriver(String license, Point location) {
        MyObjects.requireNotNullElseThrowIAE(license, "License cannot be null");
        MyObjects.requireNotNullElseThrowIAE(location, () -> "Location cannot be null");
    }
}
