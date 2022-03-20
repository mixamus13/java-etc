package com.mixamus.reflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface CustomAnnotation {
    int id();
    String data();
}
