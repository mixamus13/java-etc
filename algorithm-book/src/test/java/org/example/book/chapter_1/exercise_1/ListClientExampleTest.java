package org.example.book.chapter_1.exercise_1;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListClientExampleTest {

    @Test
    public void testListClientExample() {
        ListClientExample example = new ListClientExample();

        List list = example.getList();

        Assert.assertThat(list, CoreMatchers.instanceOf(ArrayList.class));
    }
}