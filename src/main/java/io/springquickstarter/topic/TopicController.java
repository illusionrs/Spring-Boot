package io.springquickstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {



    @Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){

        return topicService.getAllTopics();
    }

  @RequestMapping("/topics/{id}")
  public Topics getTopic( @PathVariable String id){

        return topicService.getTopic(id);
  }

  @RequestMapping(method = RequestMethod.POST,value = "/topics")
  public void addTopic( @RequestBody Topics topic){

        topicService.addTopic(topic);

  }


  @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
  public void updateTopic(@RequestBody Topics topic,@PathVariable String id){

        topicService.updateTopic(topic,id);
  }
}
