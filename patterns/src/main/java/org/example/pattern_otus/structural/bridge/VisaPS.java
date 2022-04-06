package org.example.pattern_otus.structural.bridge;

public class VisaPS implements PaymentSystem {

    @Override
    public void printName() {
        System.out.println("VisaPS");
    }
}
