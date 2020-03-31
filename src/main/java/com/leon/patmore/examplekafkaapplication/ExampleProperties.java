package com.leon.patmore.examplekafkaapplication;

import com.nexmo.spring.kafka.ProcessConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("test-app")
public class ExampleProperties extends ProcessConfiguration {}
