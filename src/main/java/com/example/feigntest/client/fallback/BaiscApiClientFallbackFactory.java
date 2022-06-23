package com.example.feigntest.client.fallback;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import com.example.feigntest.client.BasicApiClient;

@Component
public class BaiscApiClientFallbackFactory implements FallbackFactory<BasicApiClient> {

    private final ObjectFactory<BasicApiClientFallback> basicApiFallback;

    @Autowired
    public BaiscApiClientFallbackFactory(final ObjectFactory<BasicApiClientFallback> basicApiFallback) {
        this.basicApiFallback = basicApiFallback;
    }


    
    @Override
    public BasicApiClient create(final Throwable cause) {
        final BasicApiClientFallback fallback = basicApiFallback.getObject();
        fallback.setCause(cause);
        return fallback;
    }
}
