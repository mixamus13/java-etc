package org.example.book.chapter_1.exercise_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample {

    @SuppressWarnings("rawtypes")
    private final List list;

    @SuppressWarnings("rawtypes")
    public ListClientExample() {
        list = new ArrayList();
    }

    @SuppressWarnings("rawtypes")
    public List getList() {
        return list;
    }

    public static void main(String... args) {
        ListClientExample example = new ListClientExample();
        List list = example.getList();
        list.add("Max");
        System.out.println(list);
    }
}
