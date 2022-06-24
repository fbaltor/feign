package com.example.feigntest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feigntest.client.Client;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@RestController
@RequestMapping
@Slf4j
public class Controller {

    private Client client;

    @GetMapping("/{status}")
    public void post(@PathVariable final Boolean status) {
        if(status) {
            final String response = client.getSuccess();
        } else {
            final String response = client.getFail();
        }
    }
}
