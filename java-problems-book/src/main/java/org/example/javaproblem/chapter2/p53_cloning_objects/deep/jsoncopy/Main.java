package org.example.javaproblem.chapter2.p53_cloning_objects.deep.jsoncopy;

import com.google.gson.Gson;
import org.example.javaproblem.chapter2.p53_cloning_objects.deep.copy.Car;
import org.example.javaproblem.chapter2.p53_cloning_objects.deep.copy.Engine;

public class Main {
    public static void main(String... args) {
        Car car = new Car(1978, "Ford", new Engine(350, "5"));
        Car cloneCar = cloneToJson(car);

        System.out.println("car = " + car);
        System.out.println("clone car = " + cloneCar);
    }

    private static <T> T cloneToJson(T t) {
        Gson gson = new Gson();
        String json = gson.toJson(t);
        return (T) gson.fromJson(json, t.getClass());
    }
}
