package com.mixamus.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Reflections {

    public static void main(String... args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<CustomClass> clazz = CustomClass.class;
        Constructor<CustomClass> constructor = clazz.getConstructor();
        System.out.println("==================================================");
        System.out.println("constructor = " + constructor);

        System.out.println("==================================================");
        var methods = clazz.getMethods();
        System.out.println("methods = " + Arrays.toString(methods));
        System.out.println("count = " + Arrays.stream(methods).count());

        System.out.println("==================================================");
        var clazzName = clazz.getName();
        System.out.println("clazzName = " + clazzName);

        System.out.println("==================================================");
        var fields = clazz.getFields();
        System.out.println("fields = " + Arrays.toString(fields));

        System.out.println("==================================================");
        var classLoader = clazz.getClassLoader();
        System.out.println("classLoader = " + classLoader.getParent());

        System.out.println("==================================================");
        var annotationPresent = clazz.isAnnotationPresent(CustomAnnotation.class);
        System.out.println("annotationPresent = " + annotationPresent);
        System.out.println("clazz.getAnnotations() = " + Arrays.toString(clazz.getAnnotations()));

        System.out.println("==================================================");
        for (var method : clazz.getMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                try {
                    method.invoke(null);
                } catch (Throwable e) {
                    System.out.printf("Test %s failed: %s %n", method, e.getCause());
                }
            }
        }
        System.out.println("==================================================");
        System.out.println("clazz.getGenericSuperclass() = " + clazz.getGenericSuperclass());
        System.out.println("clazz.getGenericInterfaces() = " + Arrays.toString(clazz.getGenericInterfaces()));

        //getGenericTupe();
        Collection<String> collection = new HashSet<>();
        collection.add("Max");
        System.out.println("collection.getClass().getGenericInterfaces() = " + Arrays.toString(collection.getClass().getGenericInterfaces()));

        System.out.println("==================================================");
        System.out.println("==================================================");

    }
}

class Program {
    /**
     * not work
     * @param args
     * @throws MalformedURLException
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void main(String... args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        URL url = Path.of(".").toUri().toURL();
        ClassLoader classLoader = new URLClassLoader(new URL[]{url});
        Class<?> clazz = classLoader.loadClass("Program");

        Method method = clazz.getMethod("main", String[].class);
        method.invoke(null, new String[]{"hell"});

        Constructor<?> constructor = clazz.getConstructor();
        Runnable instance = (Runnable) constructor.newInstance();
        instance.run();
    }
}
