package com.mixamus.oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToArray {

    public static void main(String... args) {
        List<String> array = new ArrayList<>();
        array.add("So");
        array.add("Qo");
        array.add("Eo");
        array.add("Do");
        Object[] strings = array.toArray();
        System.out.println("strings = " + Arrays.toString(strings));

        String[] stringArray = array.toArray(new String[0]);
        System.out.println("strings = " + Arrays.toString(stringArray));


        List<String> REVERT = Arrays.asList(stringArray);
        System.out.println("REVERT = " + REVERT);
    }
}
