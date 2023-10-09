package edu.icesi.taller3springbootequipo13.service.impl;

import edu.icesi.taller3springbootequipo13.persistance.models.Book;
import edu.icesi.taller3springbootequipo13.persistance.respositories.IBooksRepository;
import edu.icesi.taller3springbootequipo13.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksServiceImpl implements IBooksService {

    @Autowired
    private IBooksRepository repository;

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public Optional<Book> edit(Book book) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> delete(Long id) {
        return Optional.empty();
    }
}
