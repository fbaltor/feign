package com.example.feigntest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.feigntest.client.configuration.ClientConfiguration;

@FeignClient(
    name = "BasicApi",
    url = "localhost:9999",
    configuration = ClientConfiguration.class
)
public interface Client {
    
    @GetMapping("success")
    String getSuccess();

    @GetMapping("fail")
    String getFail();
}
