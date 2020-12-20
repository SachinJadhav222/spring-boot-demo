package com.springdemo.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return Arrays.asList(
                new Topics("123","Spring","Spring boot framework"),
                new Topics("1234","Spring123","Spring boot framework345"),
                new Topics("12345","Spring12345","Spring boot framework12345")
        );
    }
}
