package com.leon.patmore.examplekafkaapplication;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ExampleProperties.class)
public class ExampleConfiguration {

    @Bean
    public ExampleProcessor exampleProcessor() {
        return new ExampleProcessor();
    }

    @Bean
    public ExampleListener exampleListener(ExampleProcessor exampleProcessor, ExampleProperties exampleProperties) {
        return new ExampleListener(exampleProcessor, exampleProperties);
    }

}
