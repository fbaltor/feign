package com.example.feigntest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    name = "BasicApi",
    url = "localhost:9999"
)
public interface BasicApiClient {
    
    @GetMapping("success")
    String getSuccess();

    @GetMapping("fail")
    String getFail();
}
