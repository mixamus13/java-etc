package org.example.refactoring_guru.prototype;

public class Application {

    public static void main(String... args) throws CloneNotSupportedException {
        copyExample();
        cloneExample();
    }

    /**
     * Custom copy()
     */
    public static void copyExample() {
        System.out.println("======== copyExample ========");
        CopyableCar original = new CopyableCar("unknown");

        CopyableCar copied = original.copy();
        copied.setModel("AUDI");

        System.out.println("original = " + original);
        System.out.println("copied = " + copied);
        System.out.println("original.getName() = " + original.getModel());
        System.out.println("copied.getModel() = " + copied.getModel());
    }


    /**
     * Стандартный clone()
     *
     * @throws CloneNotSupportedException
     */
    public static void cloneExample() throws CloneNotSupportedException {
        System.out.println("======== cloneExample ========");
        CloneableCar original = new CloneableCar("unknown");

        CloneableCar cloned = original.clone();
        cloned.setModel("FORD");

        System.out.println("original = " + original);
        System.out.println("cloned = " + cloned);
        System.out.println("original.getModel() = " + original.getModel());
        System.out.println("cloned.getModel() = " + cloned.getModel());
    }
}
