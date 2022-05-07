package com.mixamus.oca;

public class J06_OverloadConstructor {

    public static void main(String... args) {
        Bear bear = new Bear("Golovok");
    }
}

class Bear {
    private String name;
    private int age;
    private int weight;

    public Bear(String name) {
        this(name, 0);
    }

    public Bear(String name, int age) {
        this(name, age, 20);
    }

    public Bear(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
