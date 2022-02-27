package org.example.javaproblem.chapter7.P165_DynamicProxies.example_oracle;

public class FooImpl implements Foo {

  @Override
  public Object bar(Object obj) {
    System.out.println("<-------- invoked FooImpl.bar(Object obj)");
    return obj;
  }

}
