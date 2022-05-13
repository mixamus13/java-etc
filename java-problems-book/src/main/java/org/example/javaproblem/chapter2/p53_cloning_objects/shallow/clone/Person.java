package org.example.javaproblem.chapter2.p53_cloning_objects.shallow.clone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person implements Cloneable {

    private int age;
    private String name;
    private String email;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
