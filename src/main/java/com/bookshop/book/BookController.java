package com.bookshop.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    record NewBookRequest(String name, Integer price){}
    @PostMapping("/book/save")
    public String saveBook(Book book, RedirectAttributes redirectAttributes){
        try {
            bookRepository.save(book);
            redirectAttributes.addFlashAttribute("message", "Book added successfully");
        }catch (Exception e){
            redirectAttributes.addFlashAttribute("message", "Error adding book");
        }
        return "redirect:/";
    }
}
