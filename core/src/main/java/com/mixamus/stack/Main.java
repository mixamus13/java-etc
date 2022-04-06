package com.mixamus.stack;

public class Main {
    public static void main(String... args) {
        getOne();
    }

    static int getOne() {
        return getOne();

    }
}


class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class PersonBuilder {
    private static Person buildPerson(int id, String name) {
        return new Person(id, name);
    }

    public static void main(String[] args) {
        int id = 23;
        String name = "John";
        Person person = null;
        person = buildPerson(id, name);
    }
}


class MyRunnable implements Runnable {

    @Override
    public void run() {
        methodOne();
    }

    public void methodOne() {
        int localVariable1 = 45;
        MySharedObject localVariable2 = MySharedObject.sharedInstance;

        //... do more with local variables.

        methodTwo();
    }

    public void methodTwo() {
        Integer localVariable1 = new Integer(99);

        //... do more with local variable.
    }
}

class MySharedObject {

    //static variable pointing to instance of MySharedObject
    public static final MySharedObject sharedInstance = new MySharedObject();

    //member variables pointing to two objects on the heap
    public Integer object2 = new Integer(22);
    public Integer object4 = new Integer(44);

    public long member1 = 12345;
    public long member2 = 67890;
}