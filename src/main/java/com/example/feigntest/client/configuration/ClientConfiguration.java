package com.example.feigntest.client.configuration;

import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.context.annotation.Bean;

import feign.Logger;

public class ClientConfiguration extends FeignClientConfiguration {
    
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
