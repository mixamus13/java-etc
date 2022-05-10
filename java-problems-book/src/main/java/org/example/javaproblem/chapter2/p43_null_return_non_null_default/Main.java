package org.example.javaproblem.chapter2.p43_null_return_non_null_default;

public class Main {

    public static void main(String... args) {
        Car car = new Car("Mazda", null);
        System.out.println("Car name: " + car.getName());
        System.out.println("Car color: " + car.getColor());
    }
}
