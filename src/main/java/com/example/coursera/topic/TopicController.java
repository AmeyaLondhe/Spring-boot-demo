package com.example.coursera.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable int id){
        return topicService.getTopicById(id);
    }

    @PostMapping("/new")
    public void saveTopic(@RequestBody Topic t){
        topicService.saveTopic(t);
    }

    @DeleteMapping("delete/{id}")
    public List<Topic> deleteTopic(@PathVariable int id){
        return topicService.deleteTopic(id);
    }

}
