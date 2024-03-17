package com.example.sc.book;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer bookid;
    private String name;
    private String author;
}
