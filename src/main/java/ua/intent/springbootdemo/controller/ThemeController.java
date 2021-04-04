package ua.intent.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.intent.springbootdemo.Topic;
import ua.intent.springbootdemo.Topics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("theme")
public class ThemeController {

    @GetMapping
    public ArrayList<Topic> list() {
        return Topics.topics;
    }


    @GetMapping("{theme}")
    public List<Topic> getTheme(@PathVariable String theme) {
        return Topics.topics.stream()
                .filter( topic -> topic.getTheme().toLowerCase().equals(theme.toLowerCase()) )
                .collect(Collectors.toList());
    }

}

