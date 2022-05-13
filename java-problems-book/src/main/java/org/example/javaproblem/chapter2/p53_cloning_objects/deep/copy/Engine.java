package org.example.javaproblem.chapter2.p53_cloning_objects.deep.copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine implements Serializable {

    private int power;
    private String litre;
}
