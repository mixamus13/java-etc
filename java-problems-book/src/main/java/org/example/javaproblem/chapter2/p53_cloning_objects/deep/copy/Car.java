package org.example.javaproblem.chapter2.p53_cloning_objects.deep.copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {

    private int year;
    private String model;
    private Engine engine;
}
