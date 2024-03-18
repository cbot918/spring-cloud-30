package com.example.sc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sc.model.Book;
import com.example.sc.repository.BookRepository;


@Service
public class BookService {
  
  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository){
    this.bookRepository = bookRepository;
  }

  public List<Book> findAll() {
    return bookRepository.findAll();
  } 
}
