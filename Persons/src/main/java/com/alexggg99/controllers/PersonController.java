package com.alexggg99.controllers;

import com.alexggg99.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * Created by alexggg99 on 02.07.15.
 */

@RestController
public class PersonController {

    private static List<Person> persons = new CopyOnWriteArrayList<>();

    public void addPerson(Person person){
        persons.add(person);
    }

    @RequestMapping("/")
    public ResponseEntity<List<Person>> getAll(){
        return new ResponseEntity<List<Person>>(persons, HttpStatus.OK);
    }

    @RequestMapping("/whoSentMailsTo/{id}")
    public List<Person> getParticipants(@PathVariable String id) {
        return persons.stream().filter(p -> p.getPersonToList().contains(id)).collect(Collectors.toList());
    }

}
