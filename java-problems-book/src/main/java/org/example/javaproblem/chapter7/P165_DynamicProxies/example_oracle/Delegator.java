package org.example.javaproblem.chapter7.P165_DynamicProxies.example_oracle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Delegator implements InvocationHandler {

  // preloaded Method objects for the methods in java.lang.Object
  private static Method hashCodeMethod;
  private static Method equalsMethod;
  private static Method toStringMethod;

  static {
    try {
      hashCodeMethod = Object.class.getMethod("hashCode", null);
      equalsMethod =
          Object.class.getMethod("equals", new Class[]{Object.class});
      toStringMethod = Object.class.getMethod("toString", null);
    } catch (NoSuchMethodException e) {
      throw new NoSuchMethodError(e.getMessage());
    }
  }

  private Class[] interfaces;
  private Object[] delegates;

  public Delegator(Class[] interfaces, Object[] delegates) {
    this.interfaces = (Class[]) interfaces.clone();
    this.delegates = (Object[]) delegates.clone();
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Class declaringClass = method.getDeclaringClass();

    if (declaringClass == Object.class) {
      if (method.equals(hashCodeMethod)) {
        return proxyHashCode(proxy);
      } else if (method.equals(equalsMethod)) {
        return proxyEquals(proxy, args[0]);
      } else if (method.equals(toStringMethod)) {
        return proxyToString(proxy);
      } else {
        throw new InternalError(
            "unexpected Object method dispatched: " + method);
      }
    } else {
      for (int i = 0; i < interfaces.length; i++) {
        if (declaringClass.isAssignableFrom(interfaces[i])) {
          try {
            return method.invoke(delegates[i], args);
          } catch (InvocationTargetException e) {
            throw e.getTargetException();
          }
        }
      }

      return invokeNotDelegated(proxy, method, args);
    }
  }

  protected Object invokeNotDelegated(Object proxy, Method method, Object[] args) throws Throwable {
    throw new InternalError("unexpected method dispatched: " + method);
  }

  protected Integer proxyHashCode(Object proxy) {
    return new Integer(System.identityHashCode(proxy));
  }

  protected Boolean proxyEquals(Object proxy, Object other) {
    return (proxy == other ? Boolean.TRUE : Boolean.FALSE);
  }

  protected String proxyToString(Object proxy) {
    return proxy.getClass().getName() + '@' +
        Integer.toHexString(proxy.hashCode());
  }
}
