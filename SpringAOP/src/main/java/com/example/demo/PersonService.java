package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public Person createPerson(String name) {
        return new Person(name);
    }
}


