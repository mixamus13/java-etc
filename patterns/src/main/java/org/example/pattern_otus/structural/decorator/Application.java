package org.example.pattern_otus.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        var ds = new DataSourceImpl();
        printer(ds);

        printer(new DataSourceDecoratorAdder(ds));
        printer(new DataSourceDecoratorMultiplicator(ds));
        printer(new DataSourceDecoratorAdder(new DataSourceDecoratorMultiplicator(ds)));
    }

    private static void printer(DataSource ds) {
        logger.info("ds integer: {}", ds.getInteger());
    }
}
