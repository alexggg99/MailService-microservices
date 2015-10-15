package com.alexggg99.controllers;


import com.alexggg99.model.Priority;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by alexggg99 on 02.07.15.
 */

@RestController
public class PriorityController {

    private static List<Priority> persons = new CopyOnWriteArrayList<>();

    public void addPriority(Priority priority){
        persons.add(priority);
    }

}
