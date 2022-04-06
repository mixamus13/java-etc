package org.example.pattern_otus.structural.bridge;

public class MirPS implements PaymentSystem {

    @Override
    public void printName() {
        System.out.println("MirPS");
    }
}
