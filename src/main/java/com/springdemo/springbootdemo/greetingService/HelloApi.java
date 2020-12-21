package com.springdemo.springbootdemo.greetingService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
    @RequestMapping("/hi")
    public String sayHi(){
        return "Hi SOHAM======>>>>>";
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello Sachin";
    }

}
