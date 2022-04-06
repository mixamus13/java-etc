package com.mixamus.spring.lookup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

//@Profile("dev")
@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);

        Car car = new Car();
        String maxim = car.drive("MAXIM");
        System.out.println("maxim = " + maxim);

    }
}
