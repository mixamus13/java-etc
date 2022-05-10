package com.mixamus.oca.interfaces;

public class Elephant extends Fly
                      implements WalksOnFourLegs, HasTrunk, Herbivore {
    @Override
    public void doSome() {
        System.out.println("do");
    }

    public static void main(String... args) {
        WalksOnFourLegs legs = new Elephant();
        System.out.println("WalksOnFourLegs.MINIMUM = " + WalksOnFourLegs.MINIMUM);
    }
}


// интерфейс это контракт, API, который должен реализовать класс
abstract interface WalksOnFourLegs {
    public static final int MINIMUM = 2;

    public abstract void doSome();
}


interface HasTrunk {

}

interface Herbivore {

}

class Fly {

}
