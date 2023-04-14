package com.example.authenticationdemo2.controller;


import com.example.authenticationdemo2.entity.Person;
import com.example.authenticationdemo2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(value = "/")
    public List<Person> getPersons() {
        return personService.getAllPersons();
    }
}
