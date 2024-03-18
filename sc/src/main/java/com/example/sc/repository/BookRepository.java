package com.example.sc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sc.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
