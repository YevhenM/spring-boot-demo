package ua.intent.springbootdemo.controller;

import org.springframework.web.bind.annotation.*;
import ua.intent.springbootdemo.Topic;
import ua.intent.springbootdemo.Topics;
import ua.intent.springbootdemo.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("topic")
public class TopicController {

    @GetMapping
    public ArrayList<Topic> list() {
        return Topics.topics;
    }

    @GetMapping("{name}")
    public Topic getName(@PathVariable String name) {
        return Topics.topics.stream()
                .filter(topic -> topic.getName().toLowerCase().equals(name.toLowerCase()))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    @GetMapping("/order")
    public List<Topic> getOrder(@RequestParam(name = "order", defaultValue = "true") boolean order) {

        if (order){
            return Topics.topics.stream()
                    .sorted( Comparator.comparing(Topic::getDate))
                    .collect(Collectors.toList());
        }
        return Topics.topics.stream()
                .sorted( Comparator.comparing(Topic::getDate)
                        .reversed())
                .collect(Collectors.toList());
    }


}
