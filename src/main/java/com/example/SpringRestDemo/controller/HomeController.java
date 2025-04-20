package com.example.SpringRestDemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class HomeController {
    @GetMapping("/api/v1")
    public String demo() {
        return "Hello World!";
    }

    @GetMapping("/test")
    @Tag(name = "Test", description = "The Test API.")
    @SecurityRequirement(name = "springrestful-demo-api")
    public String test() {
        return "Test Api";
    }
}
