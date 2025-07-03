//package com.example.clientservice.fallback;
//
//import com.example.clientservice.entity.Book;
//import com.example.clientservice.feignclient.BookFeign;
//import org.springframework.stereotype.Component;
//
//import java.util.Collections;
//import java.util.List;
//
//@Component
//public class Fallback implements BookFeign {
//    @Override
//    public List<Book> getAllBooks() {
//        return Collections.emptyList();
//    }
//}
