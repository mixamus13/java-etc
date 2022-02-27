package org.example.javaproblem.chapter1.p05_count_vowels_and_consonants;

import static lombok.AccessLevel.PRIVATE;

import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(makeFinal = true, level = PRIVATE)
public final class Pair<V, C> {

  V vowels;
  C consonants;

  static <V, C> Pair<V, C> of(V vowels, C consonants) {
    return new Pair<>(vowels, consonants);
  }
}
