package edu.icesi.taller3springbootequipo13.persistance.respositories.impl;

import edu.icesi.taller3springbootequipo13.persistance.models.Author;
import edu.icesi.taller3springbootequipo13.persistance.models.Book;
import edu.icesi.taller3springbootequipo13.persistance.respositories.IAuthorsRepository;
import edu.icesi.taller3springbootequipo13.persistance.respositories.IBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class BooksRepositoryImpl implements IBooksRepository {

    @Autowired
    private IAuthorsRepository authorsRepository;

    List<Book> books;

    public BooksRepositoryImpl(){
        books = new ArrayList<>();
    }

    @Override
    public Optional<Book> save(Book book) {
        Book existingProject = findById(book.getId()).orElse(null);
        if (existingProject == null){
            Author author = authorsRepository.findById(book.getAuthor().getId()).orElse(null);
            if(author==null) {
                return Optional.empty();
            } else {
                books.add(book);
            }

        }else{
            books.remove(existingProject);
            Book newBook = book;
            books.add(newBook);
        }
        return Optional.of(book);
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
    public Optional<Book> edit(Long id, Book book) {
        if(!findById(id).isPresent()){
            return Optional.empty();
        } else {
            Author author = authorsRepository.findById(book.getAuthor().getId()).orElse(null);
            if(author==null) {
                return Optional.empty();
            } else {
                delete(id);
                books.add(book);
                return Optional.of(book);
            }

        }
    }

    @Override
    public List<Book> findBooksByAuthor(Long id) {

        List<Book> books = getAll();
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (Objects.equals(book.getAuthor().getId(), id)) {
                booksByAuthor.add(book);
            }
        }

        return booksByAuthor;
    }
}
