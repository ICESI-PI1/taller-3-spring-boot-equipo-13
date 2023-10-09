package edu.icesi.taller3springbootequipo13.controllers;

import edu.icesi.taller3springbootequipo13.persistance.models.Author;
import edu.icesi.taller3springbootequipo13.persistance.models.Book;
import edu.icesi.taller3springbootequipo13.service.IAuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "authors")

public class AuthorsController {

    @Autowired
    private IAuthorsService authorsService;

    @GetMapping("")
    public List<Author> getallAuthors() {
        return authorsService.getAll();
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return authorsService.findById(id).orElse(null);
    }

    @PostMapping("")
    public Author newAuthor(@RequestBody Author author) {
        return authorsService.save(author);
    }

    @PutMapping("/{id}")
    public Author editAuthor(@PathVariable Long id, @RequestBody Author author) {
        return authorsService.edit(id, author).orElse(null);
    }

    @DeleteMapping("/{id}")
    public Author deleteAuthor(@PathVariable Long id) {
        return authorsService.delete(id).orElse(null);
    }

    @GetMapping("/{id}/libros")
    public List<Book> booksByAuthor(@PathVariable Long id) {
        return authorsService.
    }

}
