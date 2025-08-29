package com.vinicius.subscriptions.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }
}
