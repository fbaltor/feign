package com.example.feigntest.client.fallback;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import com.example.feigntest.client.Client;

@Component
public class ClientFallbackFactory implements FallbackFactory<Client> {

    private final ObjectFactory<ClientFallback> basicApiFallback;

    @Autowired
    public ClientFallbackFactory(final ObjectFactory<ClientFallback> basicApiFallback) {
        this.basicApiFallback = basicApiFallback;
    }


    
    @Override
    public Client create(final Throwable cause) {
        final ClientFallback fallback = basicApiFallback.getObject();
        fallback.setCause(cause);
        return fallback;
    }
}
