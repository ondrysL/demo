package com.example.demo.controller;

import com.example.demo.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/book/{id}")
    public String getAll(@PathVariable Long id, Model model){
        model.addAttribute("book", bookService.getOne(id));
        if(bookService.getOne(id).isEmpty()){
            model.addAttribute("book", null);
            return "book";
        }
        return "book";
    }

    @GetMapping("/addBook")
    public String sendForm(Model model){
        model.addAttribute("book", new Book());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(@ModelAttribute Book book, Model model) {
        model.addAttribute("book", bookService.save(book));
        return "addBook";
    }
}
