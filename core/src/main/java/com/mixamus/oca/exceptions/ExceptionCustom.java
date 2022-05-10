package com.mixamus.oca.exceptions;

public class ExceptionCustom {


    // runtime (unchecked)  <p></p>
    ArithmeticException arithmeticException;
    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
    ClassCastException classCastException;
    IllegalArgumentException illegalArgumentException;
    NullPointerException nullPointerException;
    NumberFormatException numberFormatException;

    // checked
    public void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            System.out.println(e.getStackTrace());
            getUp();
        } finally {
            seeMore();
        }
        getHome();
    }

    private void seeMore() {
        System.out.println("seeMore()");
    }

    private void getHome() {
        System.out.println("getHome()");
    }

    public void fall() {
        throw new RuntimeException("I'm unchecked exception");
    }

    public void getUp() {
        System.out.println("getUp()");
    }

    public static void main(String... args) {
        ExceptionCustom exceptionCustom = null;
        exceptionCustom.explore();

        //int an = 11 / 0;
    }
}
