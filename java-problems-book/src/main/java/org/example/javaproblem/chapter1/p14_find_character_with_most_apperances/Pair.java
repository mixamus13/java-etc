package org.example.javaproblem.chapter1.p14_find_character_with_most_apperances;

import static lombok.AccessLevel.PRIVATE;

import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(makeFinal = true, level = PRIVATE)
public class Pair<V, C> {

  V character;
  C occurrences;

  static <V, C> Pair<V, C> of(V character, C occurrences) {
    return new Pair<>(character, occurrences);
  }
}
