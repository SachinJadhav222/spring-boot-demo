package com.springdemo.springbootdemo.topicService;

import org.springframework.web.bind.annotation.RequestBody;

public class Topics {

    private String id;
    private String name;
    private String description;

    public Topics() {

    }

    public Topics(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
