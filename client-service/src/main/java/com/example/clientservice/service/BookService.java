package com.example.clientservice.service;

import com.example.clientservice.entity.Book;
import com.example.clientservice.feignclient.BookServiceConnector;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private BookServiceConnector bookFeign;

    public List<Book> getAllBooks() {
        return bookFeign.getAllBooks();
    }

}
