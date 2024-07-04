package org.example.tomjen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Home {

    @GetMapping("/getData")
    public String getData(){
        return "Hello World";
    }
}
