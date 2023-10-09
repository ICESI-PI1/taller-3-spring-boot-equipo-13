package edu.icesi.taller3springbootequipo13.persistance.respositories.impl;

import edu.icesi.taller3springbootequipo13.persistance.models.Book;
import edu.icesi.taller3springbootequipo13.persistance.respositories.IBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class BooksRepositoryImpl implements IBooksRepository {

    List<Book> books;

    public BooksRepositoryImpl(){
        books = new ArrayList<>();
    }

    @Override
    public Book save(Book book) {
        Book existingProject = findById(book.getId()).orElse(null);
        if (existingProject == null){
            books.add(book);
        }else{
            books.remove(existingProject);
            Book newBook = book;
            books.add(newBook);
        }
        return book;
    }

    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return books.stream().filter(b -> Objects.equals(b.getId(), id)).findFirst();
    }

    @Override
    public Optional<Book> delete(Long id) {
        Book existingBook = findById(id).orElse(null);
        if (existingBook != null){
            books.remove(existingBook);
            return Optional.of(existingBook);
        }
        return Optional.empty();
    }

    @Override
    public Optional<Book> edit(Book book) {
        if(findById(book.getId()).isEmpty()){
            return Optional.empty();
        } else {
            delete(book.getId());
            books.add(book);
            return Optional.of(book);
        }
    }
}
