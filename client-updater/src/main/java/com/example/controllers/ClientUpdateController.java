package com.example.controllers;


import com.example.feignclient.BookFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientUpdateController {

    private final BookFeign bookFeign;

    @Autowired
    public ClientUpdateController(BookFeign bookFeign) {
        this.bookFeign = bookFeign;
    }

    @GetMapping("/update")
    public String callFeign() {
        return bookFeign.getMessage();
    }

}
