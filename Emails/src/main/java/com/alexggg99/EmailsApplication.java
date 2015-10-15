package com.alexggg99;

import com.alexggg99.controllers.EmailController;
import com.alexggg99.controllers.PersonController;
import com.alexggg99.controllers.PriorityController;
import com.alexggg99.model.Email;
import com.alexggg99.model.Gender;
import com.alexggg99.model.Person;
import com.alexggg99.model.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class EmailsApplication implements CommandLineRunner {

    @Autowired
    private EmailController emailController;
    @Autowired
    private PersonController personController;
    @Autowired
    private PriorityController priorityController;

    public static void main(String[] args) {
        SpringApplication.run(EmailsApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        Person person1 = new Person(1, 30, Gender.MALE, "Alex GGG99", "alexggg99", "123");
        Person person2 = new Person(2, 33, Gender.FEMALE, "Maria Wach", "mari", "123");
        personController.addPerson(person1);
        personController.addPerson(person2);
        Priority priority = new Priority(1, "severe", 100);
        emailController.addEmail(new Email(1, person1, person2, "Hi", "love message", new Date(), priority));
    }

}
