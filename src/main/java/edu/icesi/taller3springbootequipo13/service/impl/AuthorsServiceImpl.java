package edu.icesi.taller3springbootequipo13.service.impl;

import edu.icesi.taller3springbootequipo13.persistance.models.Author;
import edu.icesi.taller3springbootequipo13.service.IAuthorsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorsServiceImpl implements IAuthorsService {

    @Override
    public Author save(Author book) {
        return null;
    }

    @Override
    public List<Author> getAll() {
        return null;
    }

    @Override
    public Optional<Author> edit(Author book) {
        return Optional.empty();
    }

    @Override
    public Optional<Author> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Author> delete(Long id) {
        return Optional.empty();
    }
}
