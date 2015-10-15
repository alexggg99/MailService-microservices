package com.alexggg99.controllers;

import com.alexggg99.model.Email;
import com.alexggg99.model.Person;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by alexggg99 on 02.07.15.
 */

@RestController
public class PersonController {

    private static List<Person> persons = new CopyOnWriteArrayList<>();

    public void addPerson(Person person){
        persons.add(person);
    }

}
