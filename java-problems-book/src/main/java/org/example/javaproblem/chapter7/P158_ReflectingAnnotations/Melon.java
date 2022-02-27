package org.example.javaproblem.chapter7.P158_ReflectingAnnotations;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Melon {

  String type;
  int weight;

  @Ripe(value = true)
  public void eat() {

  }
}
