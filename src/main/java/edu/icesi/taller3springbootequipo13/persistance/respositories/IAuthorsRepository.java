package edu.icesi.taller3springbootequipo13.persistance.respositories;

import edu.icesi.taller3springbootequipo13.persistance.models.Author;
import edu.icesi.taller3springbootequipo13.persistance.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IAuthorsRepository {
    Author save(Author author);
    Book addBookToAuthor(Book book, Long idAuthor);
    Optional<Author> findById(Long id);
    Optional<Author> delete(Long id);
    List<Author> getAll();
    List<Book> findBooksByAuthor(Long id);
}
