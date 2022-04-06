package org.example.pattern_otus.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        new Application().usePattern();
        new Application().alternative();
    }

    public void usePattern() {
        var rotaryHummer = new RotaryHammer();
        var drill = new Drill();
        rotaryHummer.drill(new SDSadapter(drill));
    }

    public void alternative() {
        var rotaryHummer = new RotaryHammer();
        var drill = new Drill();
        rotaryHummer.drill(() -> logger.info("drill {}", drill));
    }
}
