package ua.intent.springbootdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topics {

    public static ArrayList<Topic> topics = new ArrayList<Topic>(
            Arrays.asList(
                    ( new Topic(0, "Events", "JavaScript", "")),
                    ( new Topic(1, "Types of data", "Java", "2021-03-01")),
                    ( new Topic(2, "Loops", "Java", "2021-03-02")),
                    ( new Topic(3, "Collections", "Java", "2021-03-05")),
                    ( new Topic(4, "Callback", "JavaScript", "2021-03-07")),
                    ( new Topic(5, "Selectors", "CSS", "2021-03-12")),
                    ( new Topic(6, "Promise", "JavaScript", "2021-04-01"))
            )
    );

}
