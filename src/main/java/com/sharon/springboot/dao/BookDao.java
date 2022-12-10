package com.sharon.springboot.dao;

import com.sharon.springboot.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class BookDao {

    public List<Book> getBooks()
    {
        return Stream.of(
                new Book("ikigai",300.80),
                new Book("master your emotions",250.34),
                new Book("power of unsubconsious mind",150.50)
        ).collect(Collectors.toList());
    }
}
