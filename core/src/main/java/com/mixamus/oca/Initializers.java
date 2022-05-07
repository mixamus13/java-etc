package com.mixamus.oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Initializers {

    private static final List<String> values = new ArrayList<>();

    public static void main(String... args) {
        values.add("Soroka");
        values.add("Molo");

        System.out.println("values = " + values);

        List<String> arrNew = values;

        arrNew.add("coma");
        System.out.println("arrNew = " + arrNew);

       // values = new ArrayList<>(); ERROR because final
    }
}

class StaticInits {

    private static final int SUM;

    static {
        int numberOne = 60;
        int numberTwo = 60;
        SUM = numberOne * numberTwo;
    }

    public static void main(String... args) {
        System.out.println("StaticInits.SUM = " + StaticInits.SUM);
        List<String> objects = Arrays.asList();
        objects.add("dolop");
    }
}
