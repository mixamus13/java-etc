package org.example.pattern_otus.observer;

public class Application {

    public static void main(String... args) {

        var producer = new EventProducer();
        var consumerA = new ConsumerA();
        var consumerB = new ConsumerB();

        producer.addListener(consumerA);
        producer.addListener(consumerB.getListener());

        producer.event("Event A");
        producer.event("Event B");

        //Критически важно удалять, когда не нужны
        producer.removeListener(consumerA);
        producer.removeListener(consumerB.getListener());

        producer.event("Event C");
        producer.event("Event D");
        producer.event("Event E");
    }
}
