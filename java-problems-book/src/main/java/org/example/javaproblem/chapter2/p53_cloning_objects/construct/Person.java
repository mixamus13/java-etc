package org.example.javaproblem.chapter2.p53_cloning_objects.construct;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clone constructor
 */
@Data
@NoArgsConstructor
public class Person {

    private int age;
    private String name;
    private String email;

    public Person(Person personClone) {
        this.age = personClone.age;
        this.name = personClone.name;
        this.email = personClone.email;
    }
}
