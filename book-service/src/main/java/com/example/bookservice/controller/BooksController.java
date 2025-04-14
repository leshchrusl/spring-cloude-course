package com.example.bookservice.controller;

import com.example.bookservice.entity.Book;
import com.example.bookservice.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@AllArgsConstructor
public class BooksController {

    private BookService bookService;

    @GetMapping("all")
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

}
