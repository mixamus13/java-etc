package com.mixamus.oca.abstracto;

public class Cat extends Animal {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getAnimalName() {
        return name;
    }
}
