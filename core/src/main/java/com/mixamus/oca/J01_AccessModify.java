package com.mixamus.oca;

public class J01_AccessModify {
    public static void main(String... args) {

    }

    public void walk1(){}
    protected void walk2(){}
    void walk3(){}
    private void walk4(){}
}

class App {
    public static void main(String... args) {
        var accessModify01 = new J01_AccessModify();
        accessModify01.walk1();
        accessModify01.walk2();
        accessModify01.walk3();
        //accessModify01.walk4();
    }
}
