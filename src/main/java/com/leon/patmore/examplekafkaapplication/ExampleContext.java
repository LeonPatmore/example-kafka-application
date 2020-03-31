package com.leon.patmore.examplekafkaapplication;

import com.nexmo.spring.kafka.ProcessContext;

public class ExampleContext extends ProcessContext<ExampleDomain> {

    public ExampleContext(String stateId, ExampleDomain message) {
        super(stateId, message);
    }
    
}
