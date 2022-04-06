package com.mixamus.spring.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
//@Conditional(Condy.class)
public class Car {

    @Lookup
    public Passenger createPassenger() {
        return new Passenger();
    }

    public String drive(String name) {
        Passenger passenger = createPassenger();
        passenger.setName(name);
        return "car with " + passenger.getName();
    }
}
