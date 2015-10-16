package com.alexggg99.controllers;

import com.alexggg99.model.Email;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by alexggg99 on 02.07.15.
 */

@RestController
public class EmailController {

    private static List<Email> emails = new CopyOnWriteArrayList<>();

    public void addEmail(Email email){
        emails.add(email);
    }

    @RequestMapping("/email")
    public ResponseEntity<List<Email>> getAll(){
        return new ResponseEntity<List<Email>>(emails, HttpStatus.OK);
    }

}
