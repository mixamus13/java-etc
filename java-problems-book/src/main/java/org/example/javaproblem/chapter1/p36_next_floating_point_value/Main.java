package org.example.javaproblem.chapter1.p36_next_floating_point_value;

public class Main {

    public static void main(String... args) {

        float f = 0.1f;
        System.out.println("float " + f);

        float nextf = Math.nextAfter(f, Float.NEGATIVE_INFINITY); // 0.099999994
        float next = Math.nextAfter(f, Float.POSITIVE_INFINITY); // 0.10000001
        System.out.println("nextf = " + nextf);

        float nextDownF = Math.nextDown(f);
        System.out.println("nextDownF = " + nextDownF);
        float nextUpF = Math.nextUp(f);
        System.out.println("nextUpF = " + nextUpF);

        System.out.println("-------------------------------------------------");

        double d = 0.1d;

        double nextDownD = Math.nextDown(d);
        System.out.println("nextDownD = " + nextDownD);
        double nextUpD = Math.nextUp(d);
        System.out.println("nextUpD = " + nextUpD);
    }
}
