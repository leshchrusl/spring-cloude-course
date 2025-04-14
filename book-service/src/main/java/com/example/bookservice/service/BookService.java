package com.example.bookservice.service;

import com.example.bookservice.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book save(Book book);

    void deleteById(String id);

}
