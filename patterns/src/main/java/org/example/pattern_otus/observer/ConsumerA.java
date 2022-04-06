package org.example.pattern_otus.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerA implements Listener {

    private final Logger logger = LoggerFactory.getLogger(ConsumerA.class);

    @Override
    public void onUpdate(String data) {
        logger.info("consumer A = {}", data);
    }
}
