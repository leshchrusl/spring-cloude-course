package com.example.clientservice2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @GetMapping("/test")
    public String test() {
        return "Client Service 2 is running!";
    }

}
