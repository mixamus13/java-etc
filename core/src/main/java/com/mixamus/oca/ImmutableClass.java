package com.mixamus.oca;

public final class ImmutableClass {

    private final StringBuilder builder;

    public ImmutableClass(StringBuilder builder) {
        this.builder = new StringBuilder(builder);
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }
}

class Application {
    public static void main(String... args) {
        StringBuilder stringBuilder = new StringBuilder(" gera ");
        ImmutableClass immutableClass = new ImmutableClass(stringBuilder);
        stringBuilder.append("balon");
        System.out.println("immutableClass = " + immutableClass.getBuilder());
        System.out.println("stringBuilder = " + stringBuilder);
    }
}
