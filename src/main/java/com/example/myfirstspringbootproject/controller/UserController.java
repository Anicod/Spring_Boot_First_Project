package com.example.myfirstspringbootproject.controller;

import com.example.myfirstspringbootproject.model.User;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public String postDetails(@RequestBody User user){
        return "hello" + " "  +  user.firstName + " " + user.lastName;
    }
}
