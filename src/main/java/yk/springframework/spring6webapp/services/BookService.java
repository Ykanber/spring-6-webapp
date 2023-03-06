package yk.springframework.spring6webapp.services;

import yk.springframework.spring6webapp.domain.Book;

public interface BookService
{
    Iterable<Book> findAll();
}
