package com.example.hello.sample;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllar {
    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Hello world");
    }

    @GetMapping("/dogs")
    public Dog getDog(){
        return new Dog("ポチ","柴犬",3);
    }

    @DeleteMapping("/hello")
    public String deletehello(){return "delete hello";}

}
