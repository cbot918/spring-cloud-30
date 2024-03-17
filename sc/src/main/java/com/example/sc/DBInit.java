package com.example.sc;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.example.sc.book.Book;
import com.example.sc.book.BookRepository;


@Component
public class DBInit implements InitializingBean{

  private final BookRepository bookRepository;

  public DBInit(BookRepository bookRepository){
    this.bookRepository = bookRepository;
  }

  @Override
  public void afterPropertiesSet() throws Exception { 
    createBook("Harry Potter", "Rollin");
    // StringUtils.
  }
  
  public void createBook(String name, String aurther){
    Book book = new Book();
    book.setName(name);
    book.setAuthor(aurther);
    bookRepository.save(book);
  }
}