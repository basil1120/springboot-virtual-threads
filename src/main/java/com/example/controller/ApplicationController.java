package com.example.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class ApplicationController {

    @Value("${spring.application.name}")
    private String applicationName;
    private final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);

    @GetMapping(path = "hello")
    public String getValue(){
        LOGGER.info("Thread Info: {}", Thread.currentThread());
        String response = "Hello World from : "+ applicationName;
        LOGGER.info("Response: {}", response);
        return response;
    }

}
