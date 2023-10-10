package edu.icesi.taller3springbootequipo13.service;

import edu.icesi.taller3springbootequipo13.persistance.models.Author;
import edu.icesi.taller3springbootequipo13.persistance.models.Book;

import java.util.List;
import java.util.Optional;

public interface IAuthorsService {
    Optional<Author> save(Author author);
    List<Author> getAll();
    Author edit(Long id, Author author);
    Optional<Author> findById(Long id);
    Optional<Author> delete(Long id);
}
