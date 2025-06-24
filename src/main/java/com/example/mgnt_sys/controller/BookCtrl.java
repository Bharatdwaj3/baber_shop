package com.example.mgnt_sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import com.example.mgnt_sys.model.Book;
import com.example.mgnt_sys.repository.BookRepository;
import com.example.mgnt_sys.service.BookLoader;

import java.util.List;

@Controller
public class BookCtrl {
    @Autowired private BookLoader bookLoader;
    @Autowired private BookRepository bookRepository;
    
    

    @GetMapping("/load-bboks")
    @ResponseBody
    public String loadBook(){
        bookLoader.loadBooks();
        return "Gotcha y'All Books!!";
    }
    @GetMapping("/books")
    public String getAllBooks(Model model){
        List<Book> books=bookRepository.findAll();
        model.addAttribute("books", books);
        return "books";
    }
}
