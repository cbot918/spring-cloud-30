package com.example.sc.book;

import java.util.List;

import org.springframework.stereotype.Service;


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
