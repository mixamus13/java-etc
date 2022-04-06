package org.example.pattern_otus.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class Application {

    private final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        var originator = new Originator(LocalDateTime::now);

        var abc = new State(new String[]{"A, B, C"});
        logger.info("abc: {}", abc);

        originator.saveState(abc);
        abc.getArray()[0] = "A1";
        logger.info("A1 {}", abc);

        originator.saveState(abc);
        abc.getArray()[0] = "A2";
        logger.info("A2 {}", abc);

        originator.saveState(abc);
        abc.getArray()[0] = "A3";
        logger.info("A3 {}", abc);

        logger.info("  undo changes");

        abc = originator.restoreState();
        logger.info("abc restore {}", abc);

        abc = originator.restoreState();
        logger.info("abc restore {}", abc);

        abc = originator.restoreState();
        logger.info("abc restore {}", abc);
    }
}
