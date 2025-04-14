package com.example.bookservice.init;

import com.example.bookservice.entity.Book;
import com.example.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
public class Init {

    private final BookService bookService;
    private Book book1;
    private Book book2;

    @Autowired
    public Init(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init() {
         book1 = Book.builder()
                .id(UUID.randomUUID().toString())
                .title("Book 1")
                .description("Book 1")
                .imageLink("Book1.com")
                .build();

         book2 = Book.builder()
                .id(UUID.randomUUID().toString())
                .title("Book 2")
                .description("Book 2")
                .imageLink("Book2.com")
                .build();

        bookService.save(book1);
        bookService.save(book2);
    }


    @PreDestroy
    public void destroy() {
        bookService.deleteById(book1.getId());
        bookService.deleteById(book2.getId());
    }
}
