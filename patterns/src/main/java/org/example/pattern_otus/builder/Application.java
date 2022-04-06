package org.example.pattern_otus.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {

        BuilderCustom maxBuilder = new BuilderCustom.Builder()
                .paramOne(546485345L)
                .paramTwo("mixamus")
                .paramThree("qwerty13")
                .paramFour("Max")
                .paramFive("Dokuchaev")
                .paramSix("mixamus@me.com")
                .paramSeven(43)
                .build();
        log.info("maxBuilder {}", maxBuilder);
    }
}
