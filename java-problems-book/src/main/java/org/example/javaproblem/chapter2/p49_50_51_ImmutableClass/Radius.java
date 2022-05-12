package org.example.javaproblem.chapter2.p49_50_51_ImmutableClass;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Radius {

    private int start;
    private int end;
}
