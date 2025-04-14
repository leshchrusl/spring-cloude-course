package com.example.clientservice.feignclient;

import com.example.clientservice.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-service")
public interface BookFeign {

    @GetMapping("/api/book/all")
    List<Book> getAllBooks();

}
