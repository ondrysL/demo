package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Optional<Book> getOne(Long id){
        return bookRepository.findById(id);
    }

    public Book save(Book book){
        Book setBook = bookRepository.findTopByOrderByIdDesc();
        if(setBook != null){
            book.setId(setBook.getId()+1);
        }else{
            book.setId(0L);
        }
        bookRepository.save(book);
        return book;
    }

}
