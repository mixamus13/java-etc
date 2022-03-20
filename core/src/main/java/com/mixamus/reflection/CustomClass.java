package com.mixamus.reflection;

//@Test
public class CustomClass<T> implements CustomInterface<String> {

    private String name;
    private int age;
    private T gen;

    public CustomClass() {
    }

    public CustomClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @CustomAnnotation(id = 43, data = "13.12.2022")
    public String getCustom(int table, int money) {
        return "new method()";
    }

    @Test
    public String getForTest(int one, double two) {
        return null;
    }


    @Override
    public String getGeneric() {
        return null;
    }
}
