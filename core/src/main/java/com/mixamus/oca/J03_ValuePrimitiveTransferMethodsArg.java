package com.mixamus.oca;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class J03_ValuePrimitiveTransferMethodsArg {

    private static final Logger logger = LoggerFactory.getLogger(J03_ValuePrimitiveTransferMethodsArg.class);

    //static int num = 4;

    public static void main(String... args) {
        int num = 4;
        logger.debug("Переменная int num = 4; в методе main() {}", num);
        num = newNumber(135);
        logger.debug(" num = newNumber(135);  в методе main() --> после вызова метода newNumber() {}", num);
    }

    public static int newNumber(int num) {
        logger.debug("Аргумент int num ИЗ метода newNumber() {}", num);
        num = 888_666;
        logger.debug(" num = 888_666;  ИЗ метода newNumber() {}", num);
        return num;
    }
}

class ValueReferenceTransferMethodsArg {
    //static String name = "Maxim";

    private static final Logger logger = LoggerFactory.getLogger(ValueReferenceTransferMethodsArg.class);

    public static void main(String... args) {
        String name = "Maxim";
        logger.debug("Имя переменой равно: {}", name);
        String speak = speak(name);
        logger.debug("Имя из метода speak : {}", speak);
    }

    public static String speak(String name) {
        logger.debug("Имя аргумента из метода speak : {}", name);
        return name = name + " Ben";
    }
}


class ValueReferenceTransferMethodsArgBuilder {

    private static final Logger logger = LoggerFactory.getLogger(ValueReferenceTransferMethodsArgBuilder.class);

    public static void main(String... args) {
        StringBuilder name = new StringBuilder();
        speak(name);
        logger.debug("Изменения из метода speak() из main(): {}", name);
    }

    public static void speak(StringBuilder name) {
        name.append("Внутри Ben");
    }
}
