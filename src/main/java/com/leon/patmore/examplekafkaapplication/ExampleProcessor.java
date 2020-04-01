package com.leon.patmore.examplekafkaapplication;

import com.nexmo.spring.kafka.Processor;
import reactor.core.publisher.Mono;

import java.time.Duration;

public class ExampleProcessor implements Processor<ExampleDomain, ExampleContext> {

    @Override
    public ExampleContext createContext(String s, ExampleDomain exampleDomain) {
        return new ExampleContext(s, exampleDomain);
    }

    @Override
    public Mono<ExampleContext> process(ExampleContext exampleContext) {
        return Mono.delay(Duration.ofSeconds(40)).thenReturn(exampleContext);
    }

    @Override
    public Mono<ExampleDomain> deserializeMessage(String s) {
        return Mono.just(new ExampleDomain());
    }

}
