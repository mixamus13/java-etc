package org.example.javaproblem.chapter2.p46_equals_and_hashcode.challenge;

import org.example.javaproblem.chapter2.p46_equals_and_hashcode.challenge.bad.JumpJet;
import org.example.javaproblem.chapter2.p46_equals_and_hashcode.challenge.bad.Vehicle;

public class Main {
    public static void main(String... args) {
        // bad
        Vehicle vBad = new org.example.javaproblem.chapter2.p46_equals_and_hashcode.challenge.bad.Vehicle("air", 1967);
        JumpJet jjBad = new org.example.javaproblem.chapter2.p46_equals_and_hashcode.challenge.bad.JumpJet("air", 1967, "Harrier");

        System.out.println("jjBad equal vBad: " + jjBad.equals(vBad));
        System.out.println("vBad equal jjBad: " + vBad.equals(jjBad));

        System.out.println();

        // good
        org.example.javaproblem.chapter2.p46_equals_and_hashcode.challenge.good.Vehicle vGood =
                new org.example.javaproblem.chapter2.p46_equals_and_hashcode.challenge.good.Vehicle("air", 1967);
        org.example.javaproblem.chapter2.p46_equals_and_hashcode.challenge.good.JumpJet jjGood =
                new org.example.javaproblem.chapter2.p46_equals_and_hashcode.challenge.good.JumpJet("air", 1967, "Harrier");

        System.out.println("jjGood equal vGood: " + jjGood.equals(vGood));
        System.out.println("vGood equal jjGood: " + vGood.equals(jjGood));
    }
}
