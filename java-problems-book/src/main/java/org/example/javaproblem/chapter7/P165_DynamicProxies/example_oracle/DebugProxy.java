package org.example.javaproblem.chapter7.P165_DynamicProxies.example_oracle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DebugProxy implements InvocationHandler {

  private final Object obj;

  public static Object newInstance(Object obj) {
    return Proxy.newProxyInstance(
        obj.getClass().getClassLoader(),
        obj.getClass().getInterfaces(),
        new DebugProxy(obj));
  }

  public DebugProxy(Object obj) {
    this.obj = obj;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object result;

    System.out.println("before method.getName() = " + method.getName());

    result = method.invoke(obj, args);

    System.out.println("after method.getName() = " + method.getName());

    return result;
  }
}
