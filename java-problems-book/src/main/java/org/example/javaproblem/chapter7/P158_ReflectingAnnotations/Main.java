package org.example.javaproblem.chapter7.P158_ReflectingAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import lombok.SneakyThrows;

public class Main {

  @SneakyThrows
  public static void main(String... args) {
    Class<Melon> clazz = Melon.class;
    Method methodEat = clazz.getDeclaredMethod("eat");
    Annotation[] methodAnnotations = methodEat.getDeclaredAnnotations();
    System.out.println("methodAnnotations = " + Arrays.toString(methodAnnotations));

    Ripe ripeAnnotation = (Ripe) methodAnnotations[0];
    System.out.println("ripeAnnotation.value() = " + ripeAnnotation.value());

    Ripe ripeAnnotationMethod = methodEat.getDeclaredAnnotation(Ripe.class);
    System.out.println("ripeAnnotationMethod = " + ripeAnnotationMethod);
  }
}
