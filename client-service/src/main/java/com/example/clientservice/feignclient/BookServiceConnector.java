package com.example.clientservice.feignclient;

import com.example.clientservice.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@FeignClient(name = "book-service", fallbackFactory = BookServiceConnectorFallbackFactory.class)


public interface BookServiceConnector {

    @GetMapping("/api/book/all")
    List<Book> getAllBooks();

}


@Component
class BookServiceConnectorFallbackFactory implements FallbackFactory<FallbackWithFactory> {

    @Override
    public FallbackWithFactory create(Throwable cause) {
        return new FallbackWithFactory(cause.getMessage());
    }
}

@Slf4j
record FallbackWithFactory(String reason) implements BookServiceConnector {
    @Override
    public List<Book> getAllBooks() {
        log.info("Failed send request on book service, reason {}", reason);
        return Collections.emptyList();
    }
}