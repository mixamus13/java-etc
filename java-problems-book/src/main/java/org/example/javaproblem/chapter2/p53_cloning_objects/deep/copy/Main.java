package org.example.javaproblem.chapter2.p53_cloning_objects.deep.copy;

import org.apache.commons.lang3.SerializationUtils;

public class Main {

    public static void main(String... args) {
        Car car = new Car(1978, "Ford", new Engine(350, "5"));
        Car cloneCar = SerializationUtils.clone(car);

        System.out.println("car = " + car);
        System.out.println("clone car = " + cloneCar);
    }
}
