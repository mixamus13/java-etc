package com.mixamus.oca.polimorfism;

public class Lemur extends Primate implements HasTail {
    public int age = 10;

    @Override
    public boolean isTailsStriped() {
        return false;
    }

    public static void main(String... args) {
        Lemur lemur = new Lemur();
        System.out.println("lemur.age = " + lemur.age);
        lemur.isTailsStriped();
        lemur.hasHair();

        HasTail hasTail = lemur;
        System.out.println("hasTail.isTailsStriped() = " + hasTail.isTailsStriped());

        Primate primate = lemur;
        System.out.println("primate.hasHair() = " + primate.hasHair());

        Lemur lemurCast = (Lemur) primate;

        Lemur lemur1 = (Lemur) primate;
        System.out.println("lemur1.age = " + lemur1.age);
        lemur1.isTailsStriped();
        lemur1.hasHair();

        Primate primate1 = new Primate();
        primate1.hasHair();
    }
}


class Rodent {
    public boolean hasHair() {
        return true;
    }
}

class Capybara extends Rodent {
    private int age = 10;
    public static void main(String... args) {
        Rodent rodent = new Rodent();
        if (rodent instanceof Capybara) {
            Capybara capybara = (Capybara) rodent;
            System.out.println("capybara = " + capybara.hasHair());
        }

        Capybara capybara = new Capybara();
        if (capybara instanceof Rodent) {
            Rodent rodent1 = capybara;
            System.out.println("rodent1 = " + rodent1.hasHair());
        }
    }
}
