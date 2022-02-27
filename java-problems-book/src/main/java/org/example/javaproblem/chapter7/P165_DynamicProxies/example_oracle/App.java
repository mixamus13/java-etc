package org.example.javaproblem.chapter7.P165_DynamicProxies.example_oracle;

public class App {

  public static void main(String... args) {
    Foo foo = (Foo) DebugProxy.newInstance(new FooImpl());
    foo.bar(null);
  }

}
