package com.example.sc;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.example.sc.model.Book;
import com.example.sc.repository.BookRepository;


@Component
public class DBInit implements InitializingBean{

  private final BookRepository bookRepository;

  public DBInit(BookRepository bookRepository){
    this.bookRepository = bookRepository;
  }

  @Override
  public void afterPropertiesSet() throws Exception { 
    createBook("Harry Potter", "Rollin");
    createBook("億男", "川村元氣");
    createBook("異境之書：安伯托‧艾可最後人文藝術巨作", "安伯托‧艾可");
    createBook("窮查理的投資哲學與選股金律", "崔恩‧葛瑞芬");
    createBook("演算法星球：七天導覽行程，一次弄懂演算法", "賽巴斯提安･史帝樂");
    // StringUtils.
  }
  
  public void createBook(String name, String aurther){
    Book book = new Book();
    book.setName(name);
    book.setAuthor(aurther);
    bookRepository.save(book);
  }
}