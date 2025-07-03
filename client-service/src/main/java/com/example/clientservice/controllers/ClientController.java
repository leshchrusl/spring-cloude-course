package com.example.clientservice.controllers;

import com.example.clientservice.entity.Book;
import com.example.clientservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final BookService bookService;

    @Value("${eureka.instance.instance-id}")
    private String service_id;

    @Autowired
    public ClientController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/test")
    public String test() {
        return service_id;
    }

}
