package com.mixamus.oca.interfaces;

public class Elephant extends Fly
        implements WalksOnFourLegs, HasTrunk, Herbivore {
    @Override
    public void doSome() {
        System.out.println("do");
    }

    public static void main(String... args) {
        WalksOnFourLegs legs = new Elephant();
        System.out.println("WalksOnFourLegs.MINIMUM = " + WalksOnFourLegs.MINIMUM_DEPTH);
    }

    @Override
    public void doDefault() {
        WalksOnFourLegs.super.doDefault();
    }
}


// интерфейс это контракт, API, который должен реализовать класс
abstract interface WalksOnFourLegs {
    public static final int MINIMUM_DEPTH = 13;
    public static final String TYPE = "Setting";

    public abstract void doSome();

    /**
     * Это костыль
     */
    public default void doDefault() {
        System.out.println();
    }
}


interface HasTrunk {

}

interface Herbivore {

}

class Fly {

}

interface FlyBird {
    public static int getFlyHigh() {
        return 2000;
    }
}
class Bird implements FlyBird {

    public static void main(String... args) {
        printDetails();
    }
    public static void printDetails() {
        System.out.println(FlyBird.getFlyHigh());
    }
}
