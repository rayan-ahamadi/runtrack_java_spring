package com.runtrack.spring.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${greeting.dev.message}")
    private String helloMessage;

    @GetMapping("/hello")
    public String hello() {
        return helloMessage;
    }


}
