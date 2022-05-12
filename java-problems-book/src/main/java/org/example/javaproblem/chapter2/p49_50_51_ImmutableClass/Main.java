package org.example.javaproblem.chapter2.p49_50_51_ImmutableClass;

public class Main {
    public static void main(String... args) {
        Radius r = Radius.builder()
                .start(0)
                .end(120)
                .build();

        Point p = new Point(1.23, 4.12, r);

        System.out.println("Radius start: " + p.getRadius().getStart());
        r.setStart(5);
        p.getRadius().setStart(5);
        System.out.println("Radius start: " + p.getRadius().getStart());
    }
}
