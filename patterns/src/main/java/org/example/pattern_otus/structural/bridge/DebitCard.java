package org.example.pattern_otus.structural.bridge;

public class DebitCard extends Card {

    public DebitCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("debit card");
    }
}
