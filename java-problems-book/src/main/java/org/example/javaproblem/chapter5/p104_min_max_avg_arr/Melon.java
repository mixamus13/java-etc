package org.example.javaproblem.chapter5.p104_min_max_avg_arr;

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
