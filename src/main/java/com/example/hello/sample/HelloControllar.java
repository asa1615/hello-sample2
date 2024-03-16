package com.example.hello.sample;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllar {
    @GetMapping("/hello")
    public String hello(){return "hello world";}

    @DeleteMapping("/hello")
    public String deletehello(){return "delete hello";}

}
