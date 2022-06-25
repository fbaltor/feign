package com.example.feigntest.client.fallback;

import com.example.feigntest.client.Client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ClientFallback implements Client {

    @Override
    public String getSuccess() {
        final String errorMessage = "[Fallback] Error on getSuccess";
        log.info(errorMessage) ;
        return errorMessage;
    }

    @Override
    public String getFail() {
        final String errorMessage = "[Fallback] Error on getFail";
        log.info(errorMessage) ;
        return errorMessage;
    }
}
