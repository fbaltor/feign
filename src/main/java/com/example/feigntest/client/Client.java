package com.example.feigntest.client;

import com.example.feigntest.client.configuration.ClientConfiguration;
import com.example.feigntest.client.fallback.ClientFallback;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    name = "BasicApi",
    url = "localhost:9999",
    configuration = ClientConfiguration.class,
    fallback = ClientFallback.class
)
public interface Client {
    
    @GetMapping("success")
    String getSuccess();

    @GetMapping("fail")
    String getFail();
}
