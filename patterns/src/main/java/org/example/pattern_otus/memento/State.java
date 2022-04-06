package org.example.pattern_otus.memento;

import java.util.Arrays;

public class State {

    private final String[] array;

    public State(String[] array) {
        this.array = array;
    }

    public State(State state) {
        //Не забывайте про "глубокую" копию
        this.array = Arrays.copyOf(state.getArray(), state.getArray().length);
    }

    public String[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "State{" +
                "array=" + (array == null ? null : Arrays.toString(array)) +
                '}';
    }
}
