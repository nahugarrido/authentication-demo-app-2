package com.example.authenticationdemo2.repository;

import com.example.authenticationdemo2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}