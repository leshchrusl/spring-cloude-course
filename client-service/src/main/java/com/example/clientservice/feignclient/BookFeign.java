package com.example.clientservice.feignclient;

import com.example.clientservice.entity.Book;
import com.example.clientservice.fallback.Fallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-service", fallback = Fallback.class)
public interface BookFeign {

    @GetMapping("/api/book/all")
    List<Book> getAllBooks();

}
