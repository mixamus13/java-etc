package org.example.pattern_otus.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerB {

    /*
     * Большой и жирный класс со множеством полей
     *
     */

    private final static Logger logger = LoggerFactory.getLogger(ConsumerB.class);

    private final static Listener listener = data -> logger.info("consumer B = {}", data);

    public Listener getListener() {
        return listener;
    }
}
