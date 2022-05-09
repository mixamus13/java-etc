package com.mixamus.oca.abstracto;

public class Application {
    public static void main(String... args) {
        Animal cat = new Cat("Molokos");
        String animalName = cat.getAnimalName();
        System.out.println("animalName = " + animalName);
    }
}
