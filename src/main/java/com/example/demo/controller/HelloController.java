package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/api")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Trilok! Spring Boot is working.";
    }
}
