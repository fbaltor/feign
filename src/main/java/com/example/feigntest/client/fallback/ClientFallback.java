package com.example.feigntest.client.fallback;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.feigntest.client.Client;
import lombok.Setter;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class ClientFallback implements Client {


    
    @Setter
    private Throwable cause;

    @Override
    public String getSuccess() {
        return "";
    }

    @Override
    public String getFail() {
        return "";
    }
}
