package com.mixamus.oca.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cat {
    protected int size;
    private final int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Tiger extends Cat {

    private final Logger logger = LoggerFactory.getLogger(Tiger.class);
    private final int numberOfPaws = 4;

    public Tiger(int age) {
        super(age);
        //super.size = 14;
        this.size = 4;
    }

    public void showTigerInfo() {
        logger.debug("Возраст тигра {}", super.getAge());
        logger.debug("и он {} метра в длину", super.size);
        logger.debug("и у него есть {} лап", this.numberOfPaws);
    }

    public static void main(String... args) {
        Tiger tiger = new Tiger(12);
        tiger.showTigerInfo();
    }
}
