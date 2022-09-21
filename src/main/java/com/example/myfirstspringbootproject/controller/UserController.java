package com.example.myfirstspringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/get")
    public String getName(){
        return "animesh";
    }
    @GetMapping("/userinput")
    public String getFirstName(@RequestParam String name){
        return "hello" + name;
    }
    @GetMapping("/pathvar/{name}")
    public String getPathName(@PathVariable String name){
        return "hello" + " " + name;
    }
}
