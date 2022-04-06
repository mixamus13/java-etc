package org.example.pattern_otus.structural.bridge;

public class CreditCard extends Card {

    public CreditCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("credit card");
    }
}
