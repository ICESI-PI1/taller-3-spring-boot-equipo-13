package edu.icesi.taller3springbootequipo13.service;

import edu.icesi.taller3springbootequipo13.persistance.models.Author;
import edu.icesi.taller3springbootequipo13.persistance.models.Book;

import java.util.List;
import java.util.Optional;

public interface IAuthorsService {
    Author save(Author book);
    List<Author> getAll();
    Optional<Author> edit(Author book);
    Optional<Author> findById(Long id, Author author);
    Optional<Author> delete(Long id);
    List<Book> findBooksByAuthor(Long id);
}
