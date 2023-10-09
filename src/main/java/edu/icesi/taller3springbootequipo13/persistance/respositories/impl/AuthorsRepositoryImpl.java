package edu.icesi.taller3springbootequipo13.persistance.respositories.impl;

import edu.icesi.taller3springbootequipo13.persistance.models.Author;
import edu.icesi.taller3springbootequipo13.persistance.models.Book;
import edu.icesi.taller3springbootequipo13.persistance.respositories.IAuthorsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AuthorsRepositoryImpl implements IAuthorsRepository {

    List<Author> authors;

    public AuthorsRepositoryImpl(){
        authors = new ArrayList<>();
    }


    @Override
    public Author save(Author author) {
        Author exist= findById(author.getId()).orElse(null);
        if(exist==null){
            authors.add(author);
        }else{
            authors.remove(exist);
            Author newAuthor = author;
            authors.add(newAuthor);
        }

        return author;
    }

    @Override
    public Book addBookToAuthor(Book book, Long idAuthor) {
        Author author= findById(idAuthor).orElse(null);
        if(author!=null){
            author.getBooks().add(book);
        }

        return book;
    }

    @Override
    public Optional<Author> findById(Long id) {
        return authors.stream().filter(b -> Objects.equals(b.getId(), id)).findFirst();
    }

    @Override
    public Optional<Author> delete(Long id) {
        Author existingAuthor = findById(id).orElse(null);
        if (existingAuthor != null){
            authors.remove(existingAuthor);
            return Optional.of(existingAuthor);
        }
        return Optional.empty();
    }

    @Override
    public List<Author> getAll() {
        return authors;
    }

    @Override
    public List<Book> findBooksByAuthor(Long id) {
        return null;6
    }
}
