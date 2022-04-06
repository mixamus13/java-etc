package org.example.pattern_otus.structural.bridge;

public class Application {
    public static void main(String... args) {

        var card1 = new CreditCard(new VisaPS());
        card1.info();

        var card2 = new DebitCard(new MasterCardPS());
        card2.info();

        var card3 = new DebitCard(new MirPS());
        card3.info();
    }
}
