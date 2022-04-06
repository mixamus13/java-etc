package org.example.pattern_otus.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        var object = new SomeObject("initVal");
        var executor = new Executor(object);

        executor.addCommand(new AdderABC());
        executor.addCommand(new Echo());
        executor.addCommand(new AdderABC());
        executor.addCommand(new Custom());
        //executor.addCommand(() -> {});

        executor.executeCommands();
        logger.info("result object {}", object);
    }
}
