package edu.icesi.taller3springbootequipo13.persistance.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private long id;
    private String name;
    private String nacionalidad;

}
