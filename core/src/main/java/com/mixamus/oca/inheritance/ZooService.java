package com.mixamus.oca.inheritance;

public class ZooService {

    public static void main(String... args) {
        Animal lion = new Lion();
        lion.setAge(11);
        lion.setName("Simba");
        System.out.println("name = " + lion.getName());

        Animal animal = new Animal("Der", 13);
        System.out.println("animal = " + animal);

        //lion.test();

        Animal zebra = new Zebra();
        System.out.println("zebra = " + zebra);
    }
}
