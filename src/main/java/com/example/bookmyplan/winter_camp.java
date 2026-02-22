package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class winter_camp {
    @GetMapping("/winter_camp")
    public String getData() {
        return "Hello, Welcome to bookmyplan, Please boot railway ticket at 10% discount";
    }
}
