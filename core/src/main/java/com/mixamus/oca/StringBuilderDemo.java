package com.mixamus.oca;

public class StringBuilderDemo {

    public static void main(String... args) {
        StringBuilder stringBuilder = new StringBuilder("Fernandes");
        for (char current = 'a'; current < 'z'; current++) {
            stringBuilder.append(current);
        }
        System.out.println(stringBuilder);


        StringBuilder sb = new StringBuilder("animals");
        sb.insert(1, "---");
        sb.insert(8, "-------");
        sb.delete(0, 5);

        sb.reverse();

        String s = sb.toString();

        System.out.println("s = " + s);

        System.out.println("sb.insert() = " + sb);

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilderDemo sbd = new StringBuilderDemo();
        System.out.println("sbd.equalsa(two) = " + sbd.equalsa(two));
    }

    public boolean equalsa(Object obj) {
        return (this == obj);
    }
}
