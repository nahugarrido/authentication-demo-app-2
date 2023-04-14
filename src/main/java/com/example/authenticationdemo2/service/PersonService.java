package com.example.authenticationdemo2.service;

import com.example.authenticationdemo2.entity.Person;
import com.example.authenticationdemo2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
