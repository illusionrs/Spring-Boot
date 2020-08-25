package io.springquickstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    private List<Topics> topics= new ArrayList<>(Arrays.asList(
            new Topics("spring","spring framework","this is spring course"),
                new Topics("java","java course","object oriented")
        ));

    public List<Topics> getAllTopics(){

        return topics;
    }

    public Topics getTopic(String id){

       return topics.stream().filter(e->e.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Topics topic) {

        topics.add(topic);

    }
}
