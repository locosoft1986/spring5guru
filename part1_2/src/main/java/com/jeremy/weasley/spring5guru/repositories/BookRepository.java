package com.jeremy.weasley.spring5guru.repositories;

import com.jeremy.weasley.spring5guru.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
