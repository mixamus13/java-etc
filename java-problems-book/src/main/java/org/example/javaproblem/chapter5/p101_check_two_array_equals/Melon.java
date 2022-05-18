package org.example.javaproblem.chapter5.p101_check_two_array_equals;

import lombok.Value;
import org.jetbrains.annotations.NotNull;

@Value
public class Melon implements Comparable<Melon> {
    String type;
    int weight;

    @Override
    public int compareTo(@NotNull Melon o) {
        return Integer.compare(this.getWeight(), o.getWeight());
    }
}
