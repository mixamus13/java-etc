package org.example.javaproblem.chapter1.P05_CountVowelsAndConsonants;

import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(makeFinal = true)
public final class Pair<V, C> {

  V vowels;
  C consonants;

  static <V, C> Pair<V, C> of(V vowels, C consonants) {
    return new Pair<>(vowels, consonants);
  }

}