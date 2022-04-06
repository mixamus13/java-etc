package org.example.pattern_otus.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayDeque;
import java.util.Deque;

public class Originator {

    private final Logger logger = LoggerFactory.getLogger(Originator.class);

    //Фактически, это stack
    private final Deque<Memento> stack = new ArrayDeque<>();

    private final DateTimeProvider dateTimeProvider;

    public Originator(DateTimeProvider dateTimeProvider) {
        this.dateTimeProvider = dateTimeProvider;
    }

    public void saveState(State state) {
        stack.push(new Memento(state, dateTimeProvider.getTime()));
    }

    public State restoreState() {
        var memento = stack.pop();
        logger.info("createdAt: {}", memento.createdAt());
        return memento.state();
    }
}
