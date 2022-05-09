package com.mixamus.oca.abstracto;

public abstract class Animal {
    protected int age;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getAnimalName();

    public static void main(String... args) {
//        Animal animal = new Animal();
    }
}

class Dog extends Animal {

    @Override
    public String getAnimalName() {
        return null;
    }

    public static void main(String... args) {
        Animal animal = new Dog();
    }
}
