package org.example.javaproblem.chapter7.P165_DynamicProxies;

import static lombok.AccessLevel.PRIVATE;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = PRIVATE)
public class CountingInvocationHandler implements InvocationHandler {

  Map<String, Integer> counter = new HashMap<>();
  Object targetObject;

  public CountingInvocationHandler(Object targetObject) {
    this.targetObject = targetObject;
    Arrays.stream(targetObject.getClass().getDeclaredMethods())
        .forEach(method -> this.counter.put(method.getName() + Arrays.toString(method.getParameterTypes()), 0));
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    var resultOfInvocation = method.invoke(targetObject, args);
    counter.computeIfPresent(method.getName() + Arrays.toString(method.getParameterTypes()), (k, v) -> ++v);
    return resultOfInvocation;
  }

  public Map<String, Integer> countOf(String methodName) {
    return counter.entrySet().stream()
        .filter(e -> e.getKey().startsWith(methodName + "["))
        .filter(e -> e.getValue() != 0)
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
  }
}
