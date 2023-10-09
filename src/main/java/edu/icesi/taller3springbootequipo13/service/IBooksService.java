package edu.icesi.taller3springbootequipo13.service;
import java.util.List;
import java.util.Optional;
import edu.icesi.taller3springbootequipo13.persistance.models.Book;

public interface IBooksService {

    Book save(Book book);
    List<Book> getAll();
    Optional<Book> edit(Book book);
    Optional<Book> findById(Long id);
    Optional<Book> delete(Long id);

}
