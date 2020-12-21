package com.springdemo.springbootdemo.topicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicServices topicServices;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return topicServices.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id){
       return  topicServices.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topics topic){
        topicServices.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topics topic, @PathVariable String id){
        topicServices.updateTopic(topic, id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicServices.deleteTopic(id);
    }



}
