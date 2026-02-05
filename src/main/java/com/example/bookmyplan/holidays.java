package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holidays {
    @GetMapping("/holidays")
    public String getData() {
        return "Hello Welcome to bookmyplan, Please book ticket at 10% discount" ;
    }
}
