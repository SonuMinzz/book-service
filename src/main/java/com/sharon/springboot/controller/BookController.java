package com.sharon.springboot.controller;

import com.sharon.springboot.dao.BookDao;
import com.sharon.springboot.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @GetMapping("/get")
    public List<Book> getBooks()
    {
        return  bookDao.getBooks();
    }
}
