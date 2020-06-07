package com.skon.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "uncnown") String name){
        return "Hello " + name;
    }
}
