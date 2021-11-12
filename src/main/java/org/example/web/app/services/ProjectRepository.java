package org.example.web.app.services;

import org.example.web.dto.Book;

import java.util.List;

public interface ProjectRepository<T> {
    List<Book> retreiveAll();
    void store(Book book);
}
