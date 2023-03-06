package yk.springframework.spring6webapp.services;

import yk.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
