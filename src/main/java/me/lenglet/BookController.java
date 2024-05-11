package me.lenglet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> listBooks() {
        return List.of(new Book(22L, "One Word Titles"));
    }

    public record Book(Long id, String name) {
    }
}
