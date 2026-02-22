package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class railway {
    @GetMapping("/railway")
    public String getData() {
        return "Hello, Welcome to bookmyplan, Please boot railway ticket at 10% discount";
    }
}
