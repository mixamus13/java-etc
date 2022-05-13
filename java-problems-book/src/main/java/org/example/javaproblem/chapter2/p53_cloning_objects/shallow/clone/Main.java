package org.example.javaproblem.chapter2.p53_cloning_objects.shallow.clone;


import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String... args) {
        Person person = new Person(54, "Melisa", "nelesa@me.com");
        Person person2 = (Person) person.clone();
        System.out.println("person = " + person.hashCode());
        System.out.println("person2 = " + person2.hashCode());
        System.out.println("person.canEqual(person2) = " + person.canEqual(person2));
    }
}



