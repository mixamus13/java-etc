package org.example.javaproblem.chapter2.p53_cloning_objects.construct;

/**
 * Clone constructor
 */
public class Main {
    public static void main(String... args) {

        Person person = new Person();
        person.setAge(43);
        person.setName("Max");
        person.setEmail("mixamus@me.com");

        Person personOne = new Person(person);
        personOne.setName("Peter");

        System.out.println("person = " + person);
        System.out.println("person one = " + personOne);
    }
}
