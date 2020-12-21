package com.springdemo.springbootdemo.topicService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicServices {

    private List<Topics> topics= new ArrayList<>( Arrays.asList(
            new Topics("123","Spring","Spring boot framework"),
            new Topics("1234","Spring123","Spring boot framework345"),
            new Topics("12345","Spring12345","Spring boot framework12345")
    )
    );

    public List<Topics> getAllTopics(){
        return topics;
    }

    public Topics getTopic(String id){
       return  topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }
    public void addTopic( Topics topic){
        topics.add(topic);
    }

    public void updateTopic(Topics topic, String id) {
        for (int i=0;i<topics.size();i++){
            Topics t=topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return ;
            }


        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));
    }
}
