package com.example.clientservice.service;

import com.example.clientservice.entity.Book;
import com.example.clientservice.feignclient.BookFeign;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private BookFeign bookFeign;

    public List<Book> getAllBooks() {
        return bookFeign.getAllBooks();
    }

}
