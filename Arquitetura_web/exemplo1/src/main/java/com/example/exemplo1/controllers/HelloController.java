package com.example.exemplo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá Evelyn!";
    }
    
}
