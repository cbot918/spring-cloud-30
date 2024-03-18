package com.example.sc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.sc.model.Book;
import com.example.sc.service.BookService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/book")
public class BookController {

  private final BookService bookService;

  public BookController(BookService bookService){
    this.bookService = bookService;
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping(value = "/v1/get-all")
  public List<Book> getAll() {
      return bookService.findAll();
  }
}