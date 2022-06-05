package com.mixamus.interview.sber;

public class ApplicationInterviewItOne {
    public static void main(String... args) {
        System.out.println("getBoo(true, false) = " + getBoo(false, true));
    }

    public static boolean getBoo(boolean a, boolean b) {
        return a || b;
    }
}

/**
 * Укажите, что будет выведено на экран при исполнении метода print()
 */
class BooleanOps {

    public void print() {
        System.out.println(true); // true
        System.out.println(false); // false
        System.out.println(true || false); //
        System.out.println(true && false); //
        System.out.println(false || false); //
        System.out.println(true && true); //
        System.out.println(!(true || false) || (true && false)); //
    }
}

/**
 * Допишите метод bar так, чтобы он возвращал такой же ответ, как и foo,
 * при любых входных параметрах, не используя скобки и дополнительные переменные.
 */
class DiscreteMath {

    public boolean foo(boolean a, boolean b) {
        return !(a || b) || (a && b);
    }

    public boolean bar(boolean a, boolean b) {
        return a == b;
    }
}


/**
 * Дан класс прямоугольного треугольника.
 * Напишите метод, возвращающий площадь этого треугольника.
 */
class RightTriangle {
    private final int x;
    private final int y;

    public RightTriangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getSquare() {
        return x * y / 2.0;
    }

    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle(5, 5);
        System.out.println("rt.getSquare() = " + rt.getSquare());
    }
}


/**
 * Скомпилируется ли данный код? Обосновать.
 */
interface MyInterfaceOne {
    public void doAnything();

    public void doSomething();
}

interface MyInterfaceTwo {
    public void doAnything();

    public default void doSomething() {
    }
}

abstract class MyClassOne {
}

abstract class MyClassTwo {
}

class Test extends MyClassOne implements MyInterfaceOne, MyInterfaceTwo {
    public static void main(String args[]) {
    }

    public void doAnything() {
    }

    @Override
    public void doSomething() {

    }


}


class MainOne {
    public static void main(String... args) {
        ListIterator.print(new ListIterator.Node(new ListIterator.Node(), 46));
    }
}

/**
 * Написать метод, выводящий все элементы связного списка в прямом порядке
 */
class ListIterator {

    public static void print(Node head) {
//        Node node = head;
//        int size = 0;
//        int index = -1;
//        for (int i=0; i<size; i++) {
//            if (equals(head, node.value)) {
//                index = i;
//            }
//            node = node.next;
//        }
//        return index;
    }

    static class Node {
        Node next;
        int value;

        public Node() {
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}

class MainTwo {
    public static void main(String... args) {

    }
}

class MainTree {
    public static void main(String... args) {

    }
}
