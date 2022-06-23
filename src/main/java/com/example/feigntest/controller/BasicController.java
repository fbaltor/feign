package com.example.feigntest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feigntest.client.BasicApiClient;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping
public class BasicController {

    private BasicApiClient client;

    @GetMapping("/{status}")
    public void post(@PathVariable final Boolean status) {
        if(status) {
            final String response = client.getSuccess();
            System.out.println(response);
        } else {
            final String response = client.getFail();
            System.out.println(response);
        }
    }
}
