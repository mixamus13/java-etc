package org.example.javaproblem.chapter7.P165_DynamicProxies;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class Main {

  @SuppressWarnings("unchecked")
  public static void main(String... args) {

    var invocationHandler = new CountingInvocationHandler(new ArrayList<>());

    List<String> listProxy = (List<String>) Proxy.newProxyInstance(
        List.class.getClassLoader(), new Class[]{List.class},
        invocationHandler);

    listProxy.add("Adda");
    listProxy.add("Mark");
    listProxy.add("Melisa");
    listProxy.add("M");
    listProxy.add("John");
    listProxy.remove("Adda");
    listProxy.add("Marcel");
    listProxy.remove("Mark");
    listProxy.add(0, "Akiuy");

    System.out.println("-----------------------");
    System.out.println(invocationHandler.countOf("add"));
    System.out.println("-----------------------");
    System.out.println(invocationHandler.countOf("remove"));
    System.out.println("-----------------------");
  }
}
