package com.example.demo;

import com.example.demo.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private People people;
    @RequestMapping("/hello")
    public String hello(){
        return people.getName()+":"+people.getAge();
    }
}
