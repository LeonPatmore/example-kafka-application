package com.leon.patmore.examplekafkaapplication;

import com.nexmo.spring.kafka.Listener;
import com.nexmo.spring.kafka.ProcessConfiguration;
import com.nexmo.spring.kafka.Processor;

public class ExampleListener extends Listener<ExampleDomain, ExampleContext> {

    public ExampleListener(Processor<ExampleDomain, ExampleContext> processor, ProcessConfiguration configuration) {
        super(processor, configuration);
    }

}
