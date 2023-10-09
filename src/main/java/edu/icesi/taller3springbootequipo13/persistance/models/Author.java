package edu.icesi.taller3springbootequipo13.persistance.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Author {
    private Long id;
    private String name;
    private String nationality;
    private List<Book> books= new ArrayList<>();

    public Author (Long id, String name, String nationality){
        this.id=id;
        this.name= name;
        this. nationality= nationality;
    }

    public void addBook(Book book){
        books.add(book);
    }
}
