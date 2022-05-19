package org.example.javaproblem.chapter5.p109_unmodified_immutable_collection;

import java.util.Arrays;

public final class ImmutableArray<M> {
    private final M[] array;

    public ImmutableArray(M[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public static <M> ImmutableArray<M> from(M[] array) {
        return new ImmutableArray<>(array);
    }

    public M getArray(int index) {
        return array[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableArray<?> that = (ImmutableArray<?>) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "ImmutableArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
