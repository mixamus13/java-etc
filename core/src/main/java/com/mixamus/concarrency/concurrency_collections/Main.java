package com.mixamus.concarrency.concurrency_collections;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String... args) {
        Collection<String> coll = Collections.synchronizedList(new ArrayList<>());
        coll.add("Wer");
        coll.add("Fas");
        coll.add("Nop");
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            coll.add("Kol");
            coll.remove(2);
            System.out.println(coll);
        }
    }
}


