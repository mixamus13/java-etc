package org.example.javaproblem.chapter2.p49_50_51_ImmutableClass;

import lombok.Builder;
import lombok.Data;

@Data
public class Point {

    private final double x;
    private final double y;
    private final Radius radius;

    @Builder.Default
    private String login;
    @Builder.Default
    private String password;

    public Point(double x, double y, Radius radius) {
        this.x = x;
        this.y = y;
        this.radius = Radius.builder()
                .start(radius.getStart())
                .end(radius.getEnd()).build();
    }

    public Radius getRadius() {
        return Radius.builder()
                .end(this.radius.getEnd())
                .start(this.radius.getStart())
                .build();
    }
}
