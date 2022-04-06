package org.example.pattern_otus.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class EventProducer {

    private final Logger logger = LoggerFactory.getLogger(EventProducer.class);

    private final List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    public void event(String data) {
        listeners.forEach(listener -> {
            try {
                listener.onUpdate(data);
            } catch (Exception ex) {
                logger.info("listener not update {}", listener);
                throw ex;
                // log ex
            }
        });
    }
}
