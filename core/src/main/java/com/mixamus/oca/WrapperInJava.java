package com.mixamus.oca;

public class WrapperInJava {

    public static void main(String... args) {
        boolean b = true;
        Boolean aBoolean = new Boolean(true);
        aBoolean.booleanValue();

        byte b1 = 1;
        Byte aByte = new Byte((byte) 1);

        short s = 1;
        Short sShort = new Short((short) 1);

        int i = 1;
        Integer integer = new Integer(1);
        int maxValue = integer.MAX_VALUE;
        Integer.valueOf("123"); // кэш integer

        long l = 32432424;
        Long lLong = new Long(242542);

        float f = 2.1f;
        Float fFloat = new Float(2.2);

        double d = 2.4;
        Double aDouble = new Double(23.4);
        Double.parseDouble("23.4");

        char c = 'd';
        Character character = new Character('e');

    }
}
