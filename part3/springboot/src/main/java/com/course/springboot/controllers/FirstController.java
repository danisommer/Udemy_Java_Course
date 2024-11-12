package com.course.springboot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping(path="/ola")
    public String ola() {
        return "Hello World!!!";
    }

    @PostMapping(path="/ola")
    public String ola2() {
        return "Hola mundo!!!";
    }
}
