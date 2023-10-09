package edu.icesi.taller3springbootequipo13.persistance.respositories;

import edu.icesi.taller3springbootequipo13.persistance.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IBooksRepository {
    Book save(Book book);
    Optional<Book> findById(Long id);
    Optional<Book> delete(Long id);
    List<Book> getAll();
    Optional<Book> edit(Book book);
}
