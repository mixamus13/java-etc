package org.example.pattern_otus.structural.bridge;

public class MasterCardPS implements PaymentSystem {

    @Override
    public void printName() {
        System.out.println("MasterCardPS" +
                "");
    }
}
